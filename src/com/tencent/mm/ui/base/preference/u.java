package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class u
  implements AdapterView.OnItemClickListener
{
  u(MMPreference paramMMPreference)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Preference localPreference = (Preference)paramAdapterView.getAdapter().getItem(paramInt);
    if (localPreference == null);
    do
    {
      do
        return;
      while ((!localPreference.isEnabled()) || (!localPreference.isSelectable()) || ((localPreference instanceof CheckBoxPreference)));
      if ((localPreference instanceof DialogPreference))
      {
        DialogPreference localDialogPreference = (DialogPreference)localPreference;
        localDialogPreference.showDialog();
        localDialogPreference.a(new v(this, localDialogPreference, localPreference));
      }
      if ((localPreference instanceof EditPreference))
      {
        EditPreference localEditPreference = (EditPreference)localPreference;
        localEditPreference.showDialog();
        localEditPreference.a(new w(this, localEditPreference, localPreference));
      }
    }
    while (localPreference.getKey() == null);
    this.jhh.a(MMPreference.d(this.jhh), localPreference);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.u
 * JD-Core Version:    0.6.2
 */