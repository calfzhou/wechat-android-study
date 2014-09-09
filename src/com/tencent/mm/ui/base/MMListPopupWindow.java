package com.tencent.mm.ui.base;

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
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.mm.d;
import com.tencent.mm.sdk.platformtools.cm;

public class MMListPopupWindow
{
  private Rect dR = new Rect();
  private cn hil;
  private by jas;
  private final cd jat = new cd(this, (byte)0);
  private final cc jau = new cc(this, (byte)0);
  private final cb jav = new cb(this, (byte)0);
  private final bz jaw = new bz(this, (byte)0);
  private boolean jax = false;
  private Context mContext;
  private cm mHandler = new cm();
  private ListAdapter oU;
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
  private Runnable pp;
  private boolean pq;

  public MMListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, d.listPopupWindowStyle);
  }

  public MMListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.mContext = paramContext;
    this.hil = new cn(paramContext);
    this.hil.setInputMethodMode(1);
  }

  private void aSc()
  {
    if (this.pe != null)
    {
      ViewParent localViewParent = this.pe.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.pe);
    }
  }

  public final void cT()
  {
    this.pq = true;
    this.hil.setFocusable(true);
  }

  public final void cU()
  {
    this.hil.setInputMethodMode(2);
  }

  public final void clearListSelection()
  {
    by localby = this.jas;
    if (localby != null)
    {
      by.a(localby, true);
      localby.requestLayout();
    }
  }

  public final void dismiss()
  {
    this.hil.dismiss();
    aSc();
    this.hil.setContentView(null);
    this.jas = null;
    this.mHandler.removeCallbacks(this.jat);
  }

  public final void eP(boolean paramBoolean)
  {
    this.jax = paramBoolean;
  }

  public final View getAnchorView()
  {
    return this.ph;
  }

  public final ListView getListView()
  {
    return this.jas;
  }

  public final boolean isInputMethodNotNeeded()
  {
    return this.hil.getInputMethodMode() == 2;
  }

  public final boolean isShowing()
  {
    return this.hil.isShowing();
  }

  public final void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.pg == null)
      this.pg = new ca(this, (byte)0);
    while (true)
    {
      this.oU = paramListAdapter;
      if (this.oU != null)
        paramListAdapter.registerDataSetObserver(this.pg);
      if (this.jas != null)
        this.jas.setAdapter(this.oU);
      return;
      if (this.oU != null)
        this.oU.unregisterDataSetObserver(this.pg);
    }
  }

  public final void setAnchorView(View paramView)
  {
    this.ph = paramView;
  }

  public final void setAnimationStyle(int paramInt)
  {
    this.hil.setAnimationStyle(paramInt);
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.hil.setBackgroundDrawable(paramDrawable);
  }

  public final void setContentWidth(int paramInt)
  {
    Drawable localDrawable = this.hil.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.dR);
      this.oX = (paramInt + (this.dR.left + this.dR.right));
      return;
    }
    this.oX = paramInt;
  }

  public final void setHeight(int paramInt)
  {
    this.oW = paramInt;
  }

  public final void setHorizontalOffset(int paramInt)
  {
    this.oY = paramInt;
  }

  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.hil.setOnDismissListener(paramOnDismissListener);
  }

  public final void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.pj = paramOnItemClickListener;
  }

  public final void setPromptPosition(int paramInt)
  {
    this.pf = paramInt;
  }

  public final void setPromptView(View paramView)
  {
    boolean bool = this.hil.isShowing();
    if (bool)
      aSc();
    this.pe = paramView;
    if (bool)
      show();
  }

  public final void setVerticalOffset(int paramInt)
  {
    this.oZ = paramInt;
    this.pa = true;
  }

  public final void show()
  {
    boolean bool1 = true;
    int i = -1;
    boolean bool4;
    by localby;
    View localView3;
    Object localObject;
    FrameLayout.LayoutParams localLayoutParams1;
    FrameLayout.LayoutParams localLayoutParams2;
    if (this.jas == null)
    {
      Context localContext = this.mContext;
      this.pp = new bw(this);
      if (!this.pq)
      {
        bool4 = bool1;
        this.jas = new by(localContext, bool4);
        if (this.pi != null)
          this.jas.setSelector(this.pi);
        this.jas.setAdapter(this.oU);
        this.jas.setOnItemClickListener(this.pj);
        this.jas.setFocusable(bool1);
        this.jas.setFocusableInTouchMode(bool1);
        this.jas.setDivider(null);
        this.jas.setDividerHeight(0);
        this.jas.setOnItemSelectedListener(new bx(this));
        this.jas.setOnScrollListener(this.jav);
        if (this.pk != null)
          this.jas.setOnItemSelectedListener(this.pk);
        localby = this.jas;
        localView3 = this.pe;
        if (localView3 == null)
          break label1304;
        aSc();
        localObject = new FrameLayout(localContext);
        localLayoutParams1 = new FrameLayout.LayoutParams(i, i);
        localLayoutParams2 = new FrameLayout.LayoutParams(i, -2);
        switch (this.pf)
        {
        default:
          new StringBuilder("Invalid hint position ").append(this.pf);
          label270: localView3.measure(View.MeasureSpec.makeMeasureSpec(this.oX, -2147483648), 0);
        case 1:
        case 0:
        }
      }
    }
    while (true)
    {
      this.hil.setContentView((View)localObject);
      int j = 0;
      while (true)
      {
        label298: Drawable localDrawable = this.hil.getBackground();
        int k;
        label358: boolean bool2;
        label372: View localView2;
        int m;
        int n;
        if (localDrawable != null)
        {
          localDrawable.getPadding(this.dR);
          k = this.dR.top + this.dR.bottom;
          if (!this.pa)
            this.oZ = (-this.dR.top);
          if (this.hil.getInputMethodMode() != 2)
            break label748;
          bool2 = bool1;
          localView2 = this.ph;
          m = this.oZ;
          Rect localRect = new Rect();
          localView2.getWindowVisibleDisplayFrame(localRect);
          localView2.getLocationOnScreen(new int[2]);
          n = localRect.bottom;
          if (!bool2)
            break label1291;
        }
        label1034: label1291: for (int i1 = localView2.getContext().getResources().getDisplayMetrics().heightPixels; ; i1 = n)
        {
          int i2 = i1 - m;
          if (this.hil.getBackground() != null)
          {
            this.hil.getBackground().getPadding(this.dR);
            i2 -= this.dR.top + this.dR.bottom;
          }
          int i3;
          int i6;
          label537: int i7;
          label554: label573: label584: cn localcn2;
          if ((this.pb) || (this.oW == i))
          {
            i3 = i2 + k;
            boolean bool3 = isInputMethodNotNeeded();
            if (!this.hil.isShowing())
              break label1034;
            if (this.oX != i)
              break label910;
            i6 = i;
            if (this.oW != i)
              break label989;
            if (!bool3)
              break label940;
            i7 = i3;
            if (!bool3)
              break label951;
            cn localcn4 = this.hil;
            if (this.oX != i)
              break label946;
            localcn4.setWindowLayoutMode(i, 0);
            i3 = i7;
            this.hil.update(i6, i3);
            localcn2 = this.hil;
            if ((this.pc) || (this.pb))
              break label1007;
          }
          while (true)
          {
            localcn2.setOutsideTouchable(bool1);
            if (!this.jax)
              break label1012;
            this.hil.showAtLocation(this.ph, 17, 0, 0);
            return;
            bool4 = false;
            break;
            localLayoutParams2.gravity = 80;
            ((FrameLayout)localObject).addView(localby, localLayoutParams1);
            ((FrameLayout)localObject).addView(localView3, localLayoutParams2);
            break label270;
            localLayoutParams2.gravity = 48;
            ((FrameLayout)localObject).addView(localby, localLayoutParams1);
            ((FrameLayout)localObject).addView(localView3, localLayoutParams2);
            break label270;
            this.hil.getContentView();
            View localView1 = this.pe;
            if (localView1 == null)
              break label1298;
            j = localView1.getMeasuredHeight();
            break label298;
            this.dR.setEmpty();
            k = 0;
            break label358;
            label748: bool2 = false;
            break label372;
            int i9;
            switch (this.oX)
            {
            default:
              i9 = View.MeasureSpec.makeMeasureSpec(this.oX, 1073741824);
            case -2:
            case -1:
            }
            while (true)
            {
              int i10 = this.jas.i(i9, i2 - j);
              if (i10 > 0)
                j += k;
              i3 = j + i10;
              break;
              i9 = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dR.left + this.dR.right), -2147483648);
              continue;
              i9 = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dR.left + this.dR.right), 1073741824);
            }
            label910: if (this.oX == -2)
            {
              i6 = this.ph.getWidth();
              break label537;
            }
            i6 = this.oX;
            break label537;
            label940: i7 = i;
            break label554;
            label946: i = 0;
            break label573;
            label951: cn localcn3 = this.hil;
            if (this.oX == i);
            for (int i8 = i; ; i8 = 0)
            {
              localcn3.setWindowLayoutMode(i8, i);
              i3 = i7;
              break;
            }
            label989: if (this.oW == -2)
              break label584;
            i3 = this.oW;
            break label584;
            label1007: bool1 = false;
          }
          label1012: this.hil.showAtLocation(this.ph, 53, this.oY, this.oZ);
          return;
          int i4;
          label1045: int i5;
          if (this.oX == i)
          {
            i4 = i;
            if (this.oW != i)
              break label1221;
            i5 = i;
            label1056: this.hil.setWindowLayoutMode(i4, i5);
            cn localcn1 = this.hil;
            if ((this.pc) || (this.pb))
              break label1262;
            label1087: localcn1.setOutsideTouchable(bool1);
            this.hil.setTouchInterceptor(this.jau);
            if (!this.jax)
              break label1267;
            this.hil.showAtLocation(this.ph, 17, 0, 0);
          }
          while (true)
          {
            this.jas.setSelection(i);
            if ((!this.pq) || (this.jas.isInTouchMode()))
              clearListSelection();
            if (this.pq)
              break;
            this.mHandler.post(this.jaw);
            return;
            if (this.oX == -2)
            {
              this.hil.setWidth(this.ph.getWidth());
              i4 = 0;
              break label1045;
            }
            this.hil.setWidth(this.oX);
            i4 = 0;
            break label1045;
            label1221: if (this.oW == -2)
            {
              this.hil.setHeight(i3);
              i5 = 0;
              break label1056;
            }
            this.hil.setHeight(this.oW);
            i5 = 0;
            break label1056;
            label1262: bool1 = false;
            break label1087;
            label1267: this.hil.showAtLocation(this.ph, 53, this.oY, this.oZ);
          }
        }
        label1298: j = 0;
      }
      label1304: localObject = localby;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow
 * JD-Core Version:    0.6.2
 */