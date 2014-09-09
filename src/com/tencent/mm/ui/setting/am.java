package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ax;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;

final class am
  implements az
{
  am(ak paramak, ax paramax)
  {
  }

  public final boolean kJ()
  {
    bg.qX().c(this.hqW);
    bg.qX().b(281, ak.a(this.jMh));
    ak.b(this.jMh);
    if (ak.c(this.jMh) != null)
    {
      ak.c(this.jMh).aNu();
      ak.d(this.jMh);
    }
    if (SettingsAboutMicroMsgUI.a(this.jMh.jMf) != null)
      SettingsAboutMicroMsgUI.a(this.jMh.jMf).dismiss();
    SettingsAboutMicroMsgUI.b(this.jMh.jMf);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.am
 * JD-Core Version:    0.6.2
 */