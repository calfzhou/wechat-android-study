package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;

final class fj
  implements Runnable
{
  fj(fi paramfi)
  {
  }

  public final void run()
  {
    bg.qX().b(281, SettingsUI.l(this.jOp.jOo));
    SettingsUI.m(this.jOp.jOo);
    if (SettingsUI.i(this.jOp.jOo) != null)
    {
      SettingsUI.i(this.jOp.jOo).aNu();
      SettingsUI.j(this.jOp.jOo);
    }
    if (SettingsUI.e(this.jOp.jOo) != null)
      SettingsUI.e(this.jOp.jOo).dismiss();
    SettingsUI.n(this.jOp.jOo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fj
 * JD-Core Version:    0.6.2
 */