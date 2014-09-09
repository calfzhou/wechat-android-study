package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.CompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import com.tencent.mm.e;
import com.tencent.mm.p;

public class ActionMenuItemView extends CompatTextView
  implements ah, i, View.OnClickListener, View.OnLongClickListener
{
  private Drawable iw;
  private s jI;
  private q jJ;
  private boolean jK;
  private boolean jL;
  private int jM;
  private int jN;
  private CharSequence jz;

  public ActionMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.jK = paramContext.getResources().getBoolean(e.NM);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cvr, 0, 0);
    this.jM = localTypedArray.getDimensionPixelSize(p.cvs, 0);
    localTypedArray.recycle();
    setOnClickListener(this);
    setOnLongClickListener(this);
    setTransformationMethod(new b(this));
    this.jN = -1;
  }

  private void br()
  {
    int i;
    if (!TextUtils.isEmpty(this.jz))
    {
      i = 1;
      if (this.iw != null)
      {
        boolean bool1 = this.jI.cg();
        j = 0;
        if (!bool1)
          break label57;
        if (!this.jK)
        {
          boolean bool2 = this.jL;
          j = 0;
          if (!bool2)
            break label57;
        }
      }
      int j = 1;
      label57: if ((i & j) == 0)
        break label79;
    }
    label79: for (CharSequence localCharSequence = this.jz; ; localCharSequence = null)
    {
      setText(localCharSequence);
      return;
      i = 0;
      break;
    }
  }

  public final void a(q paramq)
  {
    this.jJ = paramq;
  }

  public final void a(s params)
  {
    this.jI = params;
    Drawable localDrawable = params.getIcon();
    this.iw = localDrawable;
    setCompoundDrawablesWithIntrinsicBounds(localDrawable, null, null, null);
    br();
    this.jz = params.a(this);
    setContentDescription(this.jz);
    br();
    setId(params.getItemId());
    if (params.isVisible());
    for (int i = 0; ; i = 8)
    {
      setVisibility(i);
      setEnabled(params.isEnabled());
      return;
    }
  }

  public final s bp()
  {
    return this.jI;
  }

  public final boolean bq()
  {
    return true;
  }

  public final boolean bs()
  {
    return (hasText()) && (this.jI.getIcon() == null);
  }

  public final boolean bt()
  {
    return hasText();
  }

  public final boolean hasText()
  {
    return !TextUtils.isEmpty(getText());
  }

  public void onClick(View paramView)
  {
    if (this.jJ != null)
      this.jJ.c(this.jI);
  }

  public boolean onLongClick(View paramView)
  {
    if (hasText())
      return false;
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int i = getWidth();
    int j = getHeight();
    int k = arrayOfInt[1] + j / 2;
    int m = localContext.getResources().getDisplayMetrics().widthPixels;
    Toast localToast = Toast.makeText(localContext, this.jI.getTitle(), 0);
    if (k < localRect.height())
      localToast.setGravity(53, m - arrayOfInt[0] - i / 2, j);
    while (true)
    {
      localToast.show();
      return true;
      localToast.setGravity(81, 0, j);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = hasText();
    if ((bool) && (this.jN >= 0))
      super.setPadding(this.jN, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = getMeasuredWidth();
    if (i == -2147483648);
    for (int m = Math.min(j, this.jM); ; m = this.jM)
    {
      if ((i != 1073741824) && (this.jM > 0) && (k < m))
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), paramInt2);
      if ((!bool) && (this.iw != null))
        super.setPadding((getMeasuredWidth() - this.iw.getIntrinsicWidth()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      return;
    }
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.jN = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuItemView
 * JD-Core Version:    0.6.2
 */