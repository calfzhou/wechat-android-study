package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.tencent.mm.k;

public final class m
  implements ae, AdapterView.OnItemClickListener
{
  LayoutInflater gJ;
  o hM;
  int kA;
  ExpandedMenuView kQ;
  private int kR;
  int kS;
  n kT;
  private af ky;
  Context mContext;

  public m(int paramInt1, int paramInt2)
  {
    this.kA = paramInt1;
    this.kS = paramInt2;
  }

  public final void a(Context paramContext, o paramo)
  {
    if (this.kS != 0)
    {
      this.mContext = new ContextThemeWrapper(paramContext, this.kS);
      this.gJ = LayoutInflater.from(this.mContext);
    }
    while (true)
    {
      this.hM = paramo;
      if (this.kT != null)
        this.kT.notifyDataSetChanged();
      return;
      if (this.mContext != null)
      {
        this.mContext = paramContext;
        if (this.gJ == null)
          this.gJ = LayoutInflater.from(this.mContext);
      }
    }
  }

  public final void a(af paramaf)
  {
    this.ky = paramaf;
  }

  public final void a(o paramo, boolean paramBoolean)
  {
    if (this.ky != null)
      this.ky.a(paramo, paramBoolean);
  }

  public final boolean a(ak paramak)
  {
    if (!paramak.hasVisibleItems())
      return false;
    new r(paramak).bW();
    if (this.ky != null)
      this.ky.b(paramak);
    return true;
  }

  public final ag b(ViewGroup paramViewGroup)
  {
    if (this.kT == null)
      this.kT = new n(this);
    if (!this.kT.isEmpty())
    {
      if (this.kQ == null)
      {
        this.kQ = ((ExpandedMenuView)this.gJ.inflate(k.baq, paramViewGroup, false));
        this.kQ.setAdapter(this.kT);
        this.kQ.setOnItemClickListener(this);
      }
      return this.kQ;
    }
    return null;
  }

  public final boolean bB()
  {
    return false;
  }

  public final boolean d(s params)
  {
    return false;
  }

  public final boolean e(s params)
  {
    return false;
  }

  public final ListAdapter getAdapter()
  {
    if (this.kT == null)
      this.kT = new n(this);
    return this.kT;
  }

  public final void j(boolean paramBoolean)
  {
    if (this.kT != null)
      this.kT.notifyDataSetChanged();
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.hM.c(this.kT.B(paramInt), 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.m
 * JD-Core Version:    0.6.2
 */