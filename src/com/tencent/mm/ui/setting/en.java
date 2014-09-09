package com.tencent.mm.ui.setting;

import android.view.View;
import com.tencent.mm.ui.base.preference.b;
import com.tencent.mm.ui.d.a;

final class en
  implements Runnable
{
  en(SettingsPrivacyUI paramSettingsPrivacyUI, int paramInt)
  {
  }

  public final void run()
  {
    View localView = ((b)SettingsPrivacyUI.a(this.jNS)).a(this.eux, this.jNS.getListView());
    if (localView != null)
      a.c(this.jNS.aPI(), localView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.en
 * JD-Core Version:    0.6.2
 */