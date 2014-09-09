package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class x
  implements AdapterView.OnItemClickListener
{
  private final w oN;

  public x(u paramu, w paramw)
  {
    this.oN = paramw;
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    w localw = this.oN;
    localw.i(paramView, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.x
 * JD-Core Version:    0.6.2
 */