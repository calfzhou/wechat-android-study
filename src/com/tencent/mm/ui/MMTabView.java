package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.a.a;

public class MMTabView extends ViewGroup
{
  private TextView eyZ;
  private TextView iKY;
  private ImageView iMZ;
  private int index;
  private int padding = 0;
  public int total = 3;

  private MMTabView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MMTabView(Context paramContext, int paramInt)
  {
    this(paramContext);
    this.index = paramInt;
    aQj();
  }

  public MMTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public MMTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private String aQk()
  {
    return this.iKY.getText().toString();
  }

  private void init()
  {
    this.padding = getResources().getDimensionPixelSize(g.PQ);
    String str = y.aGW();
    int i;
    boolean bool;
    if ((str.equalsIgnoreCase("zh_CN")) || (str.equalsIgnoreCase("zh_TW")))
    {
      i = 1;
      bool = str.equalsIgnoreCase("en");
      if (i == 0)
        break label334;
    }
    label334: for (int j = e.a(getContext(), 2.0F); ; j = 0)
    {
      this.eyZ = new TextView(getContext());
      this.eyZ.setSingleLine();
      this.eyZ.setEllipsize(TextUtils.TruncateAt.END);
      this.eyZ.setTextColor(getResources().getColorStateList(f.Ph));
      this.eyZ.setTextSize(0, getResources().getDimensionPixelSize(g.Pz));
      this.eyZ.setText(n.bRh);
      if (i != 0)
      {
        this.eyZ.setTextSize(0, this.eyZ.getTextSize() + j);
        this.eyZ.setTypeface(null, 0);
      }
      while (true)
      {
        addView(this.eyZ);
        this.iMZ = new ImageView(getContext());
        this.iMZ.setImageResource(h.acv);
        this.iMZ.setVisibility(4);
        addView(this.iMZ);
        this.iKY = new TextView(getContext());
        this.iKY.setTextColor(getResources().getColor(f.white));
        this.iKY.setTextSize(1, 11.0F);
        this.iKY.setBackgroundResource(h.acu);
        this.iKY.setTypeface(Typeface.DEFAULT_BOLD);
        this.iKY.setGravity(17);
        this.iKY.setVisibility(4);
        addView(this.iKY);
        setBackgroundResource(h.Wg);
        return;
        i = 0;
        break;
        if (bool)
          this.eyZ.setTypeface(null, 1);
      }
    }
  }

  public final void Bx(String paramString)
  {
    if (ch.jb(paramString))
    {
      this.iKY.setVisibility(4);
      return;
    }
    this.iKY.setVisibility(0);
    this.iKY.post(new eb(this, paramString));
  }

  public final void aQj()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.index);
    arrayOfObject[1] = aQk();
    z.d("!32@/B4Tb64lLpK4x0ZR59bBzxjl4rHdjssR", "jacks build : %d desc, unread: %s", arrayOfObject);
    a.aQs().a(this, this.eyZ.getText().toString(), aQk(), this.index);
  }

  public final void eG(boolean paramBoolean)
  {
    ImageView localImageView = this.iMZ;
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      localImageView.setVisibility(i);
      return;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    int k = (i - this.eyZ.getMeasuredWidth()) / 2;
    int m = k + this.eyZ.getMeasuredWidth();
    int n = (j - this.eyZ.getMeasuredHeight()) / 2;
    int i1 = n + this.eyZ.getMeasuredHeight();
    this.eyZ.layout(k, n, m, i1);
    int i2 = m + this.padding;
    int i3 = i2 + this.iMZ.getMeasuredWidth();
    int i4 = (j - this.iMZ.getMeasuredHeight()) / 2;
    int i5 = i4 + this.iMZ.getMeasuredHeight();
    this.iMZ.layout(i2, i4, i3, i5);
    if (k - this.padding < this.iKY.getMeasuredWidth())
    {
      int i10 = i - this.iKY.getMeasuredWidth();
      int i11 = i10 + this.iKY.getMeasuredWidth();
      int i12 = (j - this.iKY.getMeasuredHeight()) / 2;
      int i13 = i12 + this.iKY.getMeasuredHeight();
      this.iKY.layout(i10, i12, i11, i13);
      return;
    }
    int i6 = m + this.padding;
    int i7 = i6 + this.iKY.getMeasuredWidth();
    int i8 = (j - this.iKY.getMeasuredHeight()) / 2;
    int i9 = i8 + this.iKY.getMeasuredHeight();
    this.iKY.layout(i6, i8, i7, i9);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    if (View.MeasureSpec.getMode(paramInt2) == -2147483648);
    for (int k = View.MeasureSpec.makeMeasureSpec(j, -2147483648); ; k = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      this.eyZ.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), k);
      this.iMZ.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), k);
      this.iKY.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), k);
      setMeasuredDimension(i, j);
      return;
    }
  }

  public final void setText(int paramInt)
  {
    this.eyZ.setText(paramInt);
  }

  public final void setTextColor(ColorStateList paramColorStateList)
  {
    this.eyZ.setTextColor(paramColorStateList);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMTabView
 * JD-Core Version:    0.6.2
 */