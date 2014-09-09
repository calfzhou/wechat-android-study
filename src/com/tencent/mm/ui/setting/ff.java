package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;

final class ff
  implements az
{
  ff(SettingsUI paramSettingsUI, ad paramad)
  {
  }

  public final boolean kJ()
  {
    bg.qX().c(this.jMj);
    bg.qX().b(255, SettingsUI.g(this.jOo));
    SettingsUI.h(this.jOo);
    if (SettingsUI.i(this.jOo) != null)
    {
      SettingsUI.i(this.jOo).aNu();
      SettingsUI.j(this.jOo);
    }
    if (SettingsUI.e(this.jOo) != null)
      SettingsUI.e(this.jOo).cancel();
    SettingsUI.k(this.jOo);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ff
 * JD-Core Version:    0.6.2
 */