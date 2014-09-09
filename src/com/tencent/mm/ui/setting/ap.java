package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;

final class ap
  implements Runnable
{
  ap(ao paramao, x paramx, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    bg.qX().b(255, SettingsAboutMicroMsgUI.c(this.jMi.jMf));
    SettingsAboutMicroMsgUI.d(this.jMi.jMf);
    if (SettingsAboutMicroMsgUI.e(this.jMi.jMf) != null)
    {
      SettingsAboutMicroMsgUI.e(this.jMi.jMf).aNu();
      SettingsAboutMicroMsgUI.f(this.jMi.jMf);
    }
    if (SettingsAboutMicroMsgUI.a(this.jMi.jMf) != null)
      SettingsAboutMicroMsgUI.a(this.jMi.jMf).dismiss();
    if ((this.dpb.getType() == 255) && (((ad)this.dpb).zy() == 1))
    {
      if ((this.dpe == -3) && (this.dpd == 4))
      {
        Intent localIntent = new Intent(this.jMi.jMf.aPI(), RegByMobileSetPwdUI.class);
        localIntent.putExtra("kintent_hint", this.jMi.jMf.getString(n.bYM));
        this.jMi.jMf.startActivityForResult(localIntent, 0);
      }
    }
    else
      return;
    SettingsAboutMicroMsgUI.g(this.jMi.jMf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ap
 * JD-Core Version:    0.6.2
 */