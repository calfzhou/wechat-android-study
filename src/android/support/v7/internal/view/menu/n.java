package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class n extends BaseAdapter
{
  private int kU = -1;

  public n(m paramm)
  {
    bH();
  }

  private void bH()
  {
    s locals = this.kV.hM.bV();
    if (locals != null)
    {
      ArrayList localArrayList = this.kV.hM.bS();
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
    ArrayList localArrayList = this.kV.hM.bS();
    int i = paramInt + m.a(this.kV);
    if ((this.kU >= 0) && (i >= this.kU))
      i++;
    return (s)localArrayList.get(i);
  }

  public final int getCount()
  {
    int i = this.kV.hM.bS().size() - m.a(this.kV);
    if (this.kU < 0)
      return i;
    return i - 1;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = this.kV.gJ.inflate(this.kV.kA, paramViewGroup, false); ; localView = paramView)
    {
      ((ah)localView).a(B(paramInt));
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
 * Qualified Name:     android.support.v7.internal.view.menu.n
 * JD-Core Version:    0.6.2
 */