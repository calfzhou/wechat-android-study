package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.d;

final class bc
  implements Runnable
{
  bc(MobileLoginOrForceReg paramMobileLoginOrForceReg, x paramx, String paramString)
  {
  }

  public final void run()
  {
    MobileLoginOrForceReg.a(this.iUG, ((ae)this.dpb).zA());
    bf.dkH.y("login_user_name", this.iSj);
    Intent localIntent = a.dWo.k(this.iUG);
    localIntent.addFlags(67108864);
    this.iUG.startActivity(localIntent);
    b.jF(bg.qS() + "," + getClass().getName() + ",R200_600," + bg.eg("R200_600") + ",4");
    this.iUG.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.bc
 * JD-Core Version:    0.6.2
 */