package com.tencent.mm.ui.account;

import android.content.Intent;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindmobile.FindMContactAlertUI;
import com.tencent.mm.ui.bindmobile.FindMContactIntroUI;

final class ij
  implements Runnable
{
  ij(RegSetInfoUI paramRegSetInfoUI, x paramx, String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, int paramInt)
  {
  }

  public final void run()
  {
    RegSetInfoUI.b(this.iSh, ((ae)this.dpb).zA());
    bf.dkH.y("login_user_name", this.iSj);
    if ((this.iSk != null) && (this.iSk.contains("0")))
    {
      b.jE("R300_100_phone");
      Intent localIntent2;
      if (!this.iSl)
        localIntent2 = new Intent(this.iSh, FindMContactIntroUI.class);
      while (true)
      {
        localIntent2.addFlags(67108864);
        localIntent2.putExtra("regsetinfo_ticket", RegSetInfoUI.g(this.iSh));
        localIntent2.putExtra("regsetinfo_NextStep", this.iSk);
        localIntent2.putExtra("regsetinfo_NextStyle", this.iSo);
        Intent localIntent3 = a.dWo.k(this.iSh);
        localIntent3.addFlags(67108864);
        MMWizardActivity.b(this.iSh, localIntent2, localIntent3);
        this.iSh.finish();
        return;
        localIntent2 = new Intent(this.iSh, FindMContactAlertUI.class);
        localIntent2.putExtra("alert_title", this.iSm);
        localIntent2.putExtra("alert_message", this.iSn);
      }
    }
    Intent localIntent1 = a.dWo.k(this.iSh);
    localIntent1.addFlags(67108864);
    this.iSh.startActivity(localIntent1);
    b.jF(bg.qS() + "," + this.iSh.getClass().getName() + ",R200_900_phone," + bg.eg("R200_900_phone") + ",4");
    this.iSh.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ij
 * JD-Core Version:    0.6.2
 */