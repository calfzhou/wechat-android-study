package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ax;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;

final class fl
  implements DialogInterface.OnCancelListener
{
  fl(SettingsUI paramSettingsUI, ax paramax)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.hqW);
    bg.qX().b(281, SettingsUI.l(this.jOo));
    SettingsUI.m(this.jOo);
    if (SettingsUI.i(this.jOo) != null)
    {
      SettingsUI.i(this.jOo).aNu();
      SettingsUI.j(this.jOo);
    }
    if (SettingsUI.e(this.jOo) != null)
      SettingsUI.e(this.jOo).dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fl
 * JD-Core Version:    0.6.2
 */