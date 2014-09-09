package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;

final class ar
  implements DialogInterface.OnCancelListener
{
  ar(SettingsAboutMicroMsgUI paramSettingsAboutMicroMsgUI, ad paramad)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
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
      SettingsAboutMicroMsgUI.a(this.jMf).dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ar
 * JD-Core Version:    0.6.2
 */