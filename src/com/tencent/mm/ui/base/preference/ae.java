package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;

final class ae
  implements AdapterView.OnItemLongClickListener
{
  ae(z paramz)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < z.e(this.jhw).getHeaderViewsCount())
      return false;
    int i = paramInt - z.e(this.jhw).getHeaderViewsCount();
    z.d(this.jhw).getItem(i);
    z.d(this.jhw);
    z.e(this.jhw);
    return z.aTP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.ae
 * JD-Core Version:    0.6.2
 */