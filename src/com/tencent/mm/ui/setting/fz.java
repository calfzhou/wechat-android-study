package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ax;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;

final class fz
  implements DialogInterface.OnCancelListener
{
  fz(fw paramfw, ax paramax)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
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
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fz
 * JD-Core Version:    0.6.2
 */