package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.widget.ListPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.mm.d;
import com.tencent.mm.g;
import com.tencent.mm.k;

public class ac
  implements ae, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  static final int lS = k.bav;
  private LayoutInflater gJ;
  private o hM;
  boolean kP;
  private ListPopupWindow lT;
  private int lU;
  private View lV;
  private boolean lW;
  private ViewTreeObserver lX;
  private ad lY;
  private ViewGroup lZ;
  private af lv;
  private Context mContext;

  public ac(Context paramContext, o paramo, View paramView, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.gJ = LayoutInflater.from(paramContext);
    this.hM = paramo;
    this.lW = paramBoolean;
    Resources localResources = paramContext.getResources();
    this.lU = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(g.PU));
    this.lV = paramView;
    paramo.a(this);
  }

  public final void a(Context paramContext, o paramo)
  {
  }

  public final void a(af paramaf)
  {
    this.lv = paramaf;
  }

  public final void a(o paramo, boolean paramBoolean)
  {
    if (paramo != this.hM);
    do
    {
      return;
      dismiss();
    }
    while (this.lv == null);
    this.lv.a(paramo, paramBoolean);
  }

  public final boolean a(ak paramak)
  {
    ac localac;
    int j;
    if (paramak.hasVisibleItems())
    {
      localac = new ac(this.mContext, paramak, this.lV, false);
      localac.lv = this.lv;
      int i = paramak.size();
      j = 0;
      if (j >= i)
        break label119;
      MenuItem localMenuItem = paramak.getItem(j);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null));
    }
    label119: for (boolean bool = true; ; bool = false)
    {
      localac.kP = bool;
      if (localac.ck())
      {
        if (this.lv != null)
          this.lv.b(paramak);
        return true;
        j++;
        break;
      }
      return false;
    }
  }

  public final boolean bB()
  {
    return false;
  }

  public final boolean ck()
  {
    int i = 0;
    this.lT = new ListPopupWindow(this.mContext, null, d.popupMenuStyle);
    this.lT.setOnDismissListener(this);
    this.lT.setOnItemClickListener(this);
    this.lY = new ad(this, this.hM);
    this.lT.setAdapter(this.lY);
    this.lT.cT();
    View localView1 = this.lV;
    int j;
    ListPopupWindow localListPopupWindow;
    ad localad;
    int k;
    int m;
    int i1;
    View localView2;
    int i2;
    label161: int i3;
    if (localView1 != null)
      if (this.lX == null)
      {
        j = 1;
        this.lX = localView1.getViewTreeObserver();
        if (j != 0)
          this.lX.addOnGlobalLayoutListener(this);
        this.lT.setAnchorView(localView1);
        localListPopupWindow = this.lT;
        localad = this.lY;
        k = View.MeasureSpec.makeMeasureSpec(0, 0);
        m = View.MeasureSpec.makeMeasureSpec(0, 0);
        int n = localad.getCount();
        i1 = 0;
        localView2 = null;
        i2 = 0;
        if (i1 >= n)
          break label264;
        i3 = localad.getItemViewType(i1);
        if (i3 == i)
          break label305;
      }
    for (View localView3 = null; ; localView3 = localView2)
    {
      if (this.lZ == null)
        this.lZ = new FrameLayout(this.mContext);
      localView2 = localad.getView(i1, localView3, this.lZ);
      localView2.measure(k, m);
      i2 = Math.max(i2, localView2.getMeasuredWidth());
      i1++;
      i = i3;
      break label161;
      j = 0;
      break;
      return false;
      label264: localListPopupWindow.setContentWidth(Math.min(i2, this.lU));
      this.lT.cU();
      this.lT.show();
      this.lT.getListView().setOnKeyListener(this);
      return true;
      label305: i3 = i;
    }
  }

  public final boolean d(s params)
  {
    return false;
  }

  public final void dismiss()
  {
    if (isShowing())
      this.lT.dismiss();
  }

  public final boolean e(s params)
  {
    return false;
  }

  public final boolean isShowing()
  {
    return (this.lT != null) && (this.lT.isShowing());
  }

  public final void j(boolean paramBoolean)
  {
    if (this.lY != null)
      this.lY.notifyDataSetChanged();
  }

  public void onDismiss()
  {
    this.lT = null;
    this.hM.close();
    if (this.lX != null)
    {
      if (!this.lX.isAlive())
        this.lX = this.lV.getViewTreeObserver();
      this.lX.removeGlobalOnLayoutListener(this);
      this.lX = null;
    }
  }

  public void onGlobalLayout()
  {
    if (isShowing())
    {
      View localView = this.lV;
      if ((localView != null) && (localView.isShown()))
        break label28;
      dismiss();
    }
    label28: 
    while (!isShowing())
      return;
    this.lT.show();
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ad localad = this.lY;
    ad.a(localad).c(localad.B(paramInt), 0);
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ac
 * JD-Core Version:    0.6.2
 */