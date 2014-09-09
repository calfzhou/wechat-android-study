package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;

final class aq
  implements az
{
  aq(SettingsAboutMicroMsgUI paramSettingsAboutMicroMsgUI, ad paramad)
  {
  }

  public final boolean kJ()
  {
    bg.qX().c(this.jMj);
    bg.qX().b(255, SettingsAboutMicroMsgUI.c(this.jMf));
    SettingsAboutMicroMsgUI.d(this.jMf);
    if (SettingsAboutMicroMsgUI.e(this.jMf) != null)
    {
      SettingsAboutMicroMsgUI.e(this.jMf).aNu();
      SettingsAboutMicroMsgUI.f(this.jMf);
    }
    if (SettingsAboutMicroMsgUI.a(this.jMf) != null)
      SettingsAboutMicroMsgUI.a(this.jMf).cancel();
    SettingsAboutMicroMsgUI.g(this.jMf);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.aq
 * JD-Core Version:    0.6.2
 */