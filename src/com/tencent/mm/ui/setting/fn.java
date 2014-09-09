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

final class fn
  implements Runnable
{
  fn(fm paramfm, x paramx, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    bg.qX().b(255, SettingsUI.g(this.jOq.jOo));
    SettingsUI.h(this.jOq.jOo);
    if (SettingsUI.i(this.jOq.jOo) != null)
    {
      SettingsUI.i(this.jOq.jOo).aNu();
      SettingsUI.j(this.jOq.jOo);
    }
    if (SettingsUI.e(this.jOq.jOo) != null)
      SettingsUI.e(this.jOq.jOo).dismiss();
    if ((this.dpb.getType() == 255) && (((ad)this.dpb).zy() == 1))
    {
      if ((this.dpe == -3) && (this.dpd == 4))
      {
        Intent localIntent = new Intent(this.jOq.jOo.aPI(), RegByMobileSetPwdUI.class);
        localIntent.putExtra("kintent_hint", this.jOq.jOo.getString(n.bYM));
        this.jOq.jOo.startActivityForResult(localIntent, 0);
      }
    }
    else
      return;
    SettingsUI.o(this.jOq.jOo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fn
 * JD-Core Version:    0.6.2
 */