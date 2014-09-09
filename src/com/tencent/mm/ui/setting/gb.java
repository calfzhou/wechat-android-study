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

final class gb
  implements Runnable
{
  gb(ga paramga, x paramx, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    bg.qX().b(255, SettingsUI.g(this.jOs.jOo));
    SettingsUI.h(this.jOs.jOo);
    if (SettingsUI.i(this.jOs.jOo) != null)
    {
      SettingsUI.i(this.jOs.jOo).aNu();
      SettingsUI.j(this.jOs.jOo);
    }
    if (SettingsUI.e(this.jOs.jOo) != null)
      SettingsUI.e(this.jOs.jOo).dismiss();
    if ((this.dpb.getType() == 255) && (((ad)this.dpb).zy() == 2))
    {
      if ((this.dpe == -3) && (this.dpd == 4))
      {
        Intent localIntent = new Intent(this.jOs.jOo.aPI(), RegByMobileSetPwdUI.class);
        localIntent.putExtra("kintent_hint", this.jOs.jOo.getString(n.bYM));
        this.jOs.jOo.startActivityForResult(localIntent, 5);
      }
    }
    else
      return;
    SettingsUI.k(this.jOs.jOo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.gb
 * JD-Core Version:    0.6.2
 */