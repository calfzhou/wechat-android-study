package com.tencent.mm.ui.account;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class gw
  implements View.OnClickListener
{
  gw(RegByMobileVoiceVerifyUI paramRegByMobileVoiceVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    if ((RegByMobileVoiceVerifyUI.b(this.iRm) == 0) || (RegByMobileVoiceVerifyUI.b(this.iRm) == 2) || (RegByMobileVoiceVerifyUI.b(this.iRm) == 3))
    {
      RegByMobileVoiceVerifyUI.a(this.iRm, new ai(RegByMobileVoiceVerifyUI.c(this.iRm), RegByMobileVoiceVerifyUI.d(this.iRm), "", 1, RegByMobileVoiceVerifyUI.a(this.iRm)));
      bg.qX().d(RegByMobileVoiceVerifyUI.e(this.iRm));
      e.a(this.iRm, n.bwZ, n.buo, new gx(this));
    }
    while ((RegByMobileVoiceVerifyUI.b(this.iRm) != 4) && (RegByMobileVoiceVerifyUI.b(this.iRm) != 1))
      return;
    RegByMobileVoiceVerifyUI.a(this.iRm, new ak(RegByMobileVoiceVerifyUI.c(this.iRm), 1, "", 1, RegByMobileVoiceVerifyUI.a(this.iRm)));
    bg.qX().d(RegByMobileVoiceVerifyUI.f(this.iRm));
    e.a(this.iRm, n.bwZ, n.buo, new gy(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gw
 * JD-Core Version:    0.6.2
 */