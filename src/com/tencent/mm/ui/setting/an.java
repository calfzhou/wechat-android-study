package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ax;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;

final class an
  implements DialogInterface.OnCancelListener
{
  an(ak paramak, ax paramax)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
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
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.an
 * JD-Core Version:    0.6.2
 */