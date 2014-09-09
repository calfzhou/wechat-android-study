package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.mm.d;
import com.tencent.mm.sdk.platformtools.cm;

public class ListPopupWindow
{
  private Rect dR = new Rect();
  private Context mContext;
  private cm mHandler = new cm();
  private PopupWindow oT;
  private ListAdapter oU;
  private ad oV;
  private int oW = -2;
  private int oX = -2;
  private int oY;
  private int oZ;
  private boolean pa;
  private boolean pb = false;
  private boolean pc = false;
  int pd = 2147483647;
  private View pe;
  private int pf = 0;
  private DataSetObserver pg;
  private View ph;
  private Drawable pi;
  private AdapterView.OnItemClickListener pj;
  private AdapterView.OnItemSelectedListener pk;
  private final ai pl = new ai(this, (byte)0);
  private final ah pm = new ah(this, (byte)0);
  private final ag pn = new ag(this, (byte)0);
  private final ae po = new ae(this, (byte)0);
  private Runnable pp;
  private boolean pq;

  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, d.listPopupWindowStyle);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, d.listPopupWindowStyle);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.mContext = paramContext;
    this.oT = new PopupWindow(paramContext, paramAttributeSet, paramInt);
    this.oT.setInputMethodMode(1);
  }

  public final void cS()
  {
    this.pf = 0;
  }

  public final void cT()
  {
    this.pq = true;
    this.oT.setFocusable(true);
  }

  public final void cU()
  {
    this.oT.setInputMethodMode(2);
  }

  public final void clearListSelection()
  {
    ad localad = this.oV;
    if (localad != null)
    {
      ad.a(localad, true);
      localad.requestLayout();
    }
  }

  public final void dismiss()
  {
    this.oT.dismiss();
    if (this.pe != null)
    {
      ViewParent localViewParent = this.pe.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.pe);
    }
    this.oT.setContentView(null);
    this.oV = null;
    this.mHandler.removeCallbacks(this.pl);
  }

  public final View getAnchorView()
  {
    return this.ph;
  }

  public final Drawable getBackground()
  {
    return this.oT.getBackground();
  }

  public final ListView getListView()
  {
    return this.oV;
  }

  public final boolean isInputMethodNotNeeded()
  {
    return this.oT.getInputMethodMode() == 2;
  }

  public final boolean isShowing()
  {
    return this.oT.isShowing();
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.pg == null)
      this.pg = new af(this, (byte)0);
    while (true)
    {
      this.oU = paramListAdapter;
      if (this.oU != null)
        paramListAdapter.registerDataSetObserver(this.pg);
      if (this.oV != null)
        this.oV.setAdapter(this.oU);
      return;
      if (this.oU != null)
        this.oU.unregisterDataSetObserver(this.pg);
    }
  }

  public final void setAnchorView(View paramView)
  {
    this.ph = paramView;
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.oT.setBackgroundDrawable(paramDrawable);
  }

  public final void setContentWidth(int paramInt)
  {
    Drawable localDrawable = this.oT.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.dR);
      this.oX = (paramInt + (this.dR.left + this.dR.right));
      return;
    }
    this.oX = paramInt;
  }

  public final void setHorizontalOffset(int paramInt)
  {
    this.oY = paramInt;
  }

  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.oT.setOnDismissListener(paramOnDismissListener);
  }

  public final void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.pj = paramOnItemClickListener;
  }

  public final void setSelection(int paramInt)
  {
    ad localad = this.oV;
    if ((this.oT.isShowing()) && (localad != null))
    {
      ad.a(localad, false);
      localad.setSelection(paramInt);
      if (localad.getChoiceMode() != 0)
        localad.setItemChecked(paramInt, true);
    }
  }

  public final void setVerticalOffset(int paramInt)
  {
    this.oZ = paramInt;
    this.pa = true;
  }

  public void show()
  {
    int i = 1;
    int j = -1;
    ad localad;
    View localView3;
    Object localObject;
    LinearLayout.LayoutParams localLayoutParams2;
    label246: LinearLayout.LayoutParams localLayoutParams3;
    if (this.oV == null)
    {
      Context localContext = this.mContext;
      this.pp = new ab(this);
      if (!this.pq)
      {
        int i14 = i;
        this.oV = new ad(localContext, i14);
        if (this.pi != null)
          this.oV.setSelector(this.pi);
        this.oV.setAdapter(this.oU);
        this.oV.setOnItemClickListener(this.pj);
        this.oV.setFocusable(i);
        this.oV.setFocusableInTouchMode(i);
        this.oV.setOnItemSelectedListener(new ac(this));
        this.oV.setOnScrollListener(this.pn);
        if (this.pk != null)
          this.oV.setOnItemSelectedListener(this.pk);
        localad = this.oV;
        localView3 = this.pe;
        if (localView3 == null)
          break label1282;
        localObject = new LinearLayout(localContext);
        ((LinearLayout)localObject).setOrientation(i);
        localLayoutParams2 = new LinearLayout.LayoutParams(j, 0, 1.0F);
        switch (this.pf)
        {
        default:
          new StringBuilder("Invalid hint position ").append(this.pf);
          localView3.measure(View.MeasureSpec.makeMeasureSpec(this.oX, -2147483648), 0);
          localLayoutParams3 = (LinearLayout.LayoutParams)localView3.getLayoutParams();
        case 1:
        case 0:
        }
      }
    }
    label771: label1034: label1039: label1050: label1061: for (int k = localView3.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin; ; k = 0)
    {
      this.oT.setContentView((View)localObject);
      label300: label570: label964: label1223: 
      while (true)
      {
        Drawable localDrawable = this.oT.getBackground();
        int m;
        label360: label374: View localView2;
        int i2;
        Rect localRect;
        int[] arrayOfInt;
        int i3;
        if (localDrawable != null)
        {
          localDrawable.getPadding(this.dR);
          m = this.dR.top + this.dR.bottom;
          if (!this.pa)
            this.oZ = (-this.dR.top);
          if (this.oT.getInputMethodMode() != 2)
            break label771;
          int n = i;
          localView2 = this.ph;
          i2 = this.oZ;
          localRect = new Rect();
          localView2.getWindowVisibleDisplayFrame(localRect);
          arrayOfInt = new int[2];
          localView2.getLocationOnScreen(arrayOfInt);
          i3 = localRect.bottom;
          if (n == 0)
            break label1269;
        }
        label587: label606: label613: label1009: label1269: for (int i4 = localView2.getContext().getResources().getDisplayMetrics().heightPixels; ; i4 = i3)
        {
          int i5 = Math.max(i4 - (arrayOfInt[i] + localView2.getHeight()) - i2, i2 + (arrayOfInt[i] - localRect.top));
          if (this.oT.getBackground() != null)
          {
            this.oT.getBackground().getPadding(this.dR);
            i5 -= this.dR.top + this.dR.bottom;
          }
          int i6;
          int i9;
          int i10;
          PopupWindow localPopupWindow2;
          if ((this.pb) || (this.oW == j))
          {
            i6 = i5 + m;
            boolean bool2 = isInputMethodNotNeeded();
            if (!this.oT.isShowing())
              break label1039;
            if (this.oX != j)
              break label934;
            i9 = j;
            if (this.oW != j)
              break label1009;
            if (!bool2)
              break label964;
            i10 = i6;
            if (!bool2)
              break label975;
            PopupWindow localPopupWindow4 = this.oT;
            if (this.oX != j)
              break label970;
            localPopupWindow4.setWindowLayoutMode(j, 0);
            localPopupWindow2 = this.oT;
            if ((this.pc) || (this.pb))
              break label1034;
          }
          boolean bool1;
          while (true)
          {
            localPopupWindow2.setOutsideTouchable(i);
            this.oT.update(this.ph, this.oY, this.oZ, i9, i10);
            return;
            int i15 = 0;
            break;
            ((LinearLayout)localObject).addView(localad, localLayoutParams2);
            ((LinearLayout)localObject).addView(localView3);
            break label246;
            ((LinearLayout)localObject).addView(localView3);
            ((LinearLayout)localObject).addView(localad, localLayoutParams2);
            break label246;
            this.oT.getContentView();
            View localView1 = this.pe;
            if (localView1 == null)
              break label1276;
            LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
            k = localView1.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin;
            break label300;
            this.dR.setEmpty();
            m = 0;
            break label360;
            int i1 = 0;
            break label374;
            int i12;
            switch (this.oX)
            {
            default:
              i12 = View.MeasureSpec.makeMeasureSpec(this.oX, 1073741824);
            case -2:
            case -1:
            }
            while (true)
            {
              int i13 = this.oV.i(i12, i5 - k);
              if (i13 > 0)
                k += m;
              i6 = k + i13;
              break;
              i12 = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dR.left + this.dR.right), -2147483648);
              continue;
              i12 = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dR.left + this.dR.right), 1073741824);
            }
            if (this.oX == -2)
            {
              i9 = this.ph.getWidth();
              break label570;
            }
            i9 = this.oX;
            break label570;
            i10 = j;
            break label587;
            j = 0;
            break label606;
            PopupWindow localPopupWindow3 = this.oT;
            if (this.oX == j);
            for (int i11 = j; ; i11 = 0)
            {
              localPopupWindow3.setWindowLayoutMode(i11, j);
              break;
            }
            if (this.oW == -2)
            {
              i10 = i6;
              break label613;
            }
            i10 = this.oW;
            break label613;
            bool1 = false;
          }
          int i7;
          int i8;
          PopupWindow localPopupWindow1;
          if (this.oX == j)
          {
            i7 = j;
            if (this.oW != j)
              break label1223;
            i8 = j;
            this.oT.setWindowLayoutMode(i7, i8);
            localPopupWindow1 = this.oT;
            if ((this.pc) || (this.pb))
              break label1264;
          }
          while (true)
          {
            localPopupWindow1.setOutsideTouchable(bool1);
            this.oT.setTouchInterceptor(this.pm);
            this.oT.showAsDropDown(this.ph, this.oY, this.oZ);
            this.oV.setSelection(j);
            if ((!this.pq) || (this.oV.isInTouchMode()))
              clearListSelection();
            if (this.pq)
              break;
            this.mHandler.post(this.po);
            return;
            if (this.oX == -2)
            {
              this.oT.setWidth(this.ph.getWidth());
              i7 = 0;
              break label1050;
            }
            this.oT.setWidth(this.oX);
            i7 = 0;
            break label1050;
            if (this.oW == -2)
            {
              this.oT.setHeight(i6);
              i8 = 0;
              break label1061;
            }
            this.oT.setHeight(this.oW);
            i8 = 0;
            break label1061;
            bool1 = false;
          }
        }
        label970: label975: label1264: label1276: k = 0;
      }
      label934: localObject = localad;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ListPopupWindow
 * JD-Core Version:    0.6.2
 */