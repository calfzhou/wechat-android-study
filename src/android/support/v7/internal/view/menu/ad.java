package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class ad extends BaseAdapter
{
  private int kU = -1;
  private o ma;

  public ad(ac paramac, o paramo)
  {
    this.ma = paramo;
    bH();
  }

  private void bH()
  {
    s locals = ac.c(this.mb).bV();
    if (locals != null)
    {
      ArrayList localArrayList = ac.c(this.mb).bS();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        if ((s)localArrayList.get(j) == locals)
        {
          this.kU = j;
          return;
        }
    }
    this.kU = -1;
  }

  public final s B(int paramInt)
  {
    if (ac.a(this.mb));
    for (ArrayList localArrayList = this.ma.bS(); ; localArrayList = this.ma.bP())
    {
      if ((this.kU >= 0) && (paramInt >= this.kU))
        paramInt++;
      return (s)localArrayList.get(paramInt);
    }
  }

  public final int getCount()
  {
    if (ac.a(this.mb));
    for (ArrayList localArrayList = this.ma.bS(); this.kU < 0; localArrayList = this.ma.bP())
      return localArrayList.size();
    return -1 + localArrayList.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = ac.b(this.mb).inflate(ac.lS, paramViewGroup, false); ; localView = paramView)
    {
      ah localah = (ah)localView;
      if (this.mb.kP)
        ((ListMenuItemView)localView).bF();
      localah.a(B(paramInt));
      return localView;
    }
  }

  public final void notifyDataSetChanged()
  {
    bH();
    super.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ad
 * JD-Core Version:    0.6.2
 */