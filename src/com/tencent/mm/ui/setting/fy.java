package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ax;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;

final class fy
  implements az
{
  fy(fw paramfw, ax paramax)
  {
  }

  public final boolean kJ()
  {
    bg.qX().c(this.hqW);
    bg.qX().b(281, fw.a(this.jOr));
    fw.b(this.jOr);
    if (fw.c(this.jOr) != null)
    {
      fw.c(this.jOr).aNu();
      fw.d(this.jOr);
    }
    if (SettingsUI.e(this.jOr.jOo) != null)
      SettingsUI.e(this.jOr.jOo).dismiss();
    SettingsUI.f(this.jOr.jOo);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fy
 * JD-Core Version:    0.6.2
 */