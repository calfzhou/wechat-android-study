package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.mm.f;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.o;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMListPopupWindow;

public abstract class gw
  implements View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private int dividerHeight;
  private BaseAdapter fvx;
  private int gMW;
  private DialogInterface.OnCancelListener jVc;
  private PopupWindow.OnDismissListener jVd;
  private boolean jVe = false;
  private boolean jVf = true;
  private View jVg;
  private int jVh;
  private int jVi = 0;
  private int jVj = 0;
  private int jVk = 0;
  private float jVl = 0.0F;
  private float jVm = 0.0F;
  private boolean jax = false;
  private MMListPopupWindow jnr;
  private int jns = o.cuz;
  private int lU;
  private View lV;
  private ViewTreeObserver lX;
  private ViewGroup lZ;
  protected Context mContext;

  public gw(Context paramContext)
  {
    this.mContext = paramContext;
    Resources localResources = paramContext.getResources();
    this.lU = Math.min(4 * localResources.getDisplayMetrics().widthPixels / 5, localResources.getDimensionPixelSize(g.PU));
    ViewGroup localViewGroup;
    if ((this.mContext instanceof Activity))
    {
      localViewGroup = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (localViewGroup.getChildCount() <= 0)
        break label187;
    }
    label187: for (this.lV = localViewGroup.getChildAt(0); ; this.lV = localViewGroup)
    {
      this.dividerHeight = e.a(this.mContext, 1.0F);
      this.jVi = (2 * localResources.getDimensionPixelSize(g.PH));
      this.jVj = localResources.getDimensionPixelSize(g.PN);
      this.jVk = e.a(this.mContext, 36.0F);
      this.fvx = aQp();
      return;
    }
  }

  private int a(ListAdapter paramListAdapter)
  {
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = paramListAdapter.getCount();
    int m = 0;
    int n = 0;
    View localView1 = null;
    int i1 = 0;
    int i2;
    if (m < k)
    {
      i2 = paramListAdapter.getItemViewType(m);
      if (i2 == n)
        break label129;
    }
    for (View localView2 = null; ; localView2 = localView1)
    {
      if (this.lZ == null)
        this.lZ = new FrameLayout(this.mContext);
      localView1 = paramListAdapter.getView(m, localView2, this.lZ);
      localView1.measure(i, j);
      i1 = Math.max(i1, localView1.getMeasuredWidth());
      m++;
      n = i2;
      break;
      return i1;
      label129: i2 = n;
    }
  }

  private boolean baX()
  {
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    return localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels;
  }

  protected abstract BaseAdapter aQp();

  public final void baW()
  {
    this.jax = false;
    this.jns = o.cuz;
  }

  public final void baY()
  {
    this.jVf = false;
  }

  public final void baZ()
  {
    this.jVl = 0.65F;
    this.jVm = 0.75F;
  }

  public final void c(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.jVc = paramOnCancelListener;
  }

  public final void cS()
  {
    this.jVh = 1;
  }

  public boolean ck()
  {
    if ((this.gMW == 0) && ((this.mContext instanceof Activity)))
    {
      Rect localRect = new Rect();
      ((Activity)this.mContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      this.gMW = localRect.top;
    }
    this.jVe = baX();
    if ((this.jnr == null) || (true == this.jVf))
      this.jnr = new MMListPopupWindow(this.mContext, null, 0);
    this.jnr.setOnDismissListener(this);
    this.jnr.setOnItemClickListener(this);
    this.jnr.setAdapter(this.fvx);
    this.jnr.cT();
    this.jnr.setBackgroundDrawable(this.mContext.getResources().getDrawable(h.XW));
    this.jnr.setAnimationStyle(this.jns);
    this.jnr.setHorizontalOffset(0);
    this.jnr.setAnchorView(this.lV);
    boolean bool;
    if (this.lV != null)
    {
      if (this.lX != null)
        break label696;
      bool = true;
      this.lX = this.lV.getViewTreeObserver();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Boolean.valueOf(bool);
      z.v("!44@/B4Tb64lLpKI+vIdmlsJaOm1vKkKLfRfkU+VQyH8HM8=", "tryshow addGlobalListener:%b", arrayOfObject3);
      if (bool)
        this.lX.addOnGlobalLayoutListener(this);
    }
    MMListPopupWindow localMMListPopupWindow = this.jnr;
    int i = this.gMW;
    int j;
    label279: DisplayMetrics localDisplayMetrics2;
    int k;
    label415: int n;
    if ((this.mContext instanceof ActionBarActivity))
    {
      j = ((ActionBarActivity)this.mContext).aM().getHeight();
      localMMListPopupWindow.setVerticalOffset(j + i - this.mContext.getResources().getDimensionPixelSize(g.PH));
      this.jnr.eP(this.jax);
      this.jnr.setContentWidth(Math.min(a(this.fvx), this.lU));
      this.jnr.cU();
      if ((this.jVl != 0.0F) && (this.jVm != 0.0F))
      {
        localDisplayMetrics2 = new DisplayMetrics();
        ((Activity)this.mContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics2);
        if (localDisplayMetrics2.widthPixels <= localDisplayMetrics2.heightPixels)
          break label754;
        k = (int)(this.jVm * localDisplayMetrics2.heightPixels);
        Object[] arrayOfObject1 = new Object[4];
        arrayOfObject1[0] = Float.valueOf(this.jVl);
        arrayOfObject1[1] = Float.valueOf(this.jVm);
        arrayOfObject1[2] = Integer.valueOf(localDisplayMetrics2.heightPixels);
        arrayOfObject1[3] = Integer.valueOf(k);
        z.d("!44@/B4Tb64lLpKI+vIdmlsJaOm1vKkKLfRfkU+VQyH8HM8=", "[cpan] setpopuHeight. menuHeightPercentPort:%f menuHeightPercentLand:%f,heightPixels:%d，menuheight：%d", arrayOfObject1);
        int m = Math.round(k / this.jVj);
        if ((m <= 0) || (this.fvx == null))
          break label819;
        n = m * this.jVj + this.jVi;
        if ((n == 0) || (n >= this.fvx.getCount() * this.jVj))
          break label771;
        int i1 = (m - 1) * this.jVj + this.jVi + this.jVk;
        this.jnr.setHeight(i1);
      }
    }
    while (true)
    {
      if ((this.jnr != null) && (this.jVg != null))
      {
        this.jnr.setPromptView(this.jVg);
        this.jnr.setPromptPosition(this.jVh);
      }
      this.jnr.show();
      this.jnr.getListView().setOnKeyListener(this);
      this.jnr.getListView().setDivider(null);
      this.jnr.getListView().setSelector(new ColorDrawable(this.mContext.getResources().getColor(f.transparent)));
      this.jnr.getListView().setDividerHeight(0);
      this.jnr.getListView().setVerticalScrollBarEnabled(true);
      this.jnr.getListView().setHorizontalScrollBarEnabled(false);
      return true;
      label696: bool = false;
      break;
      DisplayMetrics localDisplayMetrics1 = this.mContext.getResources().getDisplayMetrics();
      if (localDisplayMetrics1.widthPixels > localDisplayMetrics1.heightPixels)
      {
        j = e.a(this.mContext, 40.0F);
        break label279;
      }
      j = e.a(this.mContext, 49.0F);
      break label279;
      label754: k = (int)(this.jVl * localDisplayMetrics2.heightPixels);
      break label415;
      label771: Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(n);
      arrayOfObject2[1] = Integer.valueOf(this.fvx.getCount() * this.jVj);
      z.w("!44@/B4Tb64lLpKI+vIdmlsJaOm1vKkKLfRfkU+VQyH8HM8=", "[cpan] menuheight:%d,listHeight:%d", arrayOfObject2);
      continue;
      label819: z.e("!44@/B4Tb64lLpKI+vIdmlsJaOm1vKkKLfRfkU+VQyH8HM8=", "[cpan] setpopuHeight error.");
    }
  }

  public final void dismiss()
  {
    if (isShowing())
      this.jnr.dismiss();
  }

  public final boolean isShowing()
  {
    return (this.jnr != null) && (this.jnr.isShowing());
  }

  public void onDismiss()
  {
    this.jnr = null;
    if (this.lX != null)
    {
      if (!this.lX.isAlive())
        this.lX = this.lV.getViewTreeObserver();
      this.lX.removeGlobalOnLayoutListener(this);
      this.lX = null;
    }
    if (this.jVc != null)
      this.jVc.onCancel(null);
    if (this.jVd != null)
      this.jVd.onDismiss();
  }

  public void onGlobalLayout()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(isShowing());
    arrayOfObject[1] = Boolean.valueOf(this.lV.isShown());
    z.v("!44@/B4Tb64lLpKI+vIdmlsJaOm1vKkKLfRfkU+VQyH8HM8=", "onGlobalLayout showing:%b, anchorshown:%b", arrayOfObject);
    if (isShowing())
    {
      View localView = this.lV;
      if ((localView != null) && (localView.isShown()))
        break label66;
      dismiss();
    }
    label66: 
    while ((!isShowing()) || (this.jVe == baX()))
      return;
    this.jnr.dismiss();
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    dismiss();
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    z.v("!44@/B4Tb64lLpKI+vIdmlsJaOm1vKkKLfRfkU+VQyH8HM8=", "onKey");
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }

  public final void setPromptView(View paramView)
  {
    this.jVg = paramView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gw
 * JD-Core Version:    0.6.2
 */