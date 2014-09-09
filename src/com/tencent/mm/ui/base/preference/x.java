package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;

final class x
  implements AdapterView.OnItemLongClickListener
{
  x(MMPreference paramMMPreference)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < MMPreference.e(this.jhh).getHeaderViewsCount())
      return false;
    int i = paramInt - MMPreference.e(this.jhh).getHeaderViewsCount();
    MMPreference.d(this.jhh).getItem(i);
    MMPreference.d(this.jhh);
    MMPreference.e(this.jhh);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.x
 * JD-Core Version:    0.6.2
 */