package com.tencent.mm.ui.bindmobile;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.mm.ui.base.cm;

final class y
  implements cm
{
  y(w paramw)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 0:
      BindMContactIntroUI.f(this.jkf.jka);
      return;
    case 1:
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("need_matte_high_light_item", "settings_find_me_by_mobile");
    localIntent.setClassName(this.jkf.jka, "com.tencent.mm.ui.setting.SettingsPrivacyUI");
    this.jkf.jka.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.y
 * JD-Core Version:    0.6.2
 */