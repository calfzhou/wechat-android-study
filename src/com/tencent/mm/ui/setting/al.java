package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ay;

final class al
  implements m
{
  al(ak paramak)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
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
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.al
 * JD-Core Version:    0.6.2
 */