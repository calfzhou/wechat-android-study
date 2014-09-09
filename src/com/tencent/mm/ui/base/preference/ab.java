package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

final class ab
  implements AdapterView.OnItemClickListener
{
  ab(z paramz)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < z.e(this.jhw).getHeaderViewsCount());
    Preference localPreference;
    do
    {
      do
      {
        return;
        int i = paramInt - z.e(this.jhw).getHeaderViewsCount();
        localPreference = (Preference)z.d(this.jhw).getItem(i);
      }
      while ((!localPreference.isEnabled()) || (!localPreference.isSelectable()) || ((localPreference instanceof CheckBoxPreference)));
      if ((localPreference instanceof DialogPreference))
      {
        DialogPreference localDialogPreference = (DialogPreference)localPreference;
        localDialogPreference.showDialog();
        localDialogPreference.a(new ac(this, localDialogPreference, localPreference));
      }
      if ((localPreference instanceof EditPreference))
      {
        EditPreference localEditPreference = (EditPreference)localPreference;
        localEditPreference.showDialog();
        localEditPreference.a(new ad(this, localEditPreference, localPreference));
      }
    }
    while (localPreference.getKey() == null);
    z localz = this.jhw;
    z.d(this.jhw);
    localz.e(localPreference);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.ab
 * JD-Core Version:    0.6.2
 */