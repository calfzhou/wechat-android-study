package com.tencent.mm.ui.account.mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.mm.ui.account.FacebookLoginUI;
import com.tencent.mm.ui.account.RegByEmailUI;
import com.tencent.mm.ui.account.RegByMobileVoiceVerifyUI;
import com.tencent.mm.ui.account.RegByQQUI;
import com.tencent.mm.ui.base.cm;

final class dx
  implements cm
{
  dx(dv paramdv)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 0:
      MobileVerifyUI.g(this.iVx.iVq);
      return;
    case 1:
      this.iVx.iVq.XF();
      if (MobileVerifyUI.f(this.iVx.iVq) == 2)
        com.tencent.mm.plugin.a.b.jE("R200_500");
      while (true)
      {
        Intent localIntent2 = new Intent(this.iVx.iVq, RegByMobileVoiceVerifyUI.class);
        Bundle localBundle = new Bundle();
        localBundle.putString("bindmcontact_mobile", this.iVx.iVq.cTZ);
        localBundle.putInt("voice_verify_type", MobileVerifyUI.h(this.iVx.iVq));
        localIntent2.putExtras(localBundle);
        this.iVx.iVq.startActivity(localIntent2);
        return;
        if (MobileVerifyUI.f(this.iVx.iVq) == 1)
          com.tencent.mm.plugin.a.b.jE("L600_400");
        else if (MobileVerifyUI.f(this.iVx.iVq) == 3)
          com.tencent.mm.plugin.a.b.jE("F200_300");
      }
    case 2:
      com.tencent.mm.plugin.a.b.jE("R400_100_signup");
      Intent localIntent1 = new Intent();
      localIntent1.setClass(this.iVx.iVq, RegByQQUI.class);
      localIntent1.putExtra("MMActivity.OverrideEnterAnimation", 0);
      localIntent1.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.b.MB);
      this.iVx.iVq.startActivity(localIntent1);
      this.iVx.iVq.overridePendingTransition(com.tencent.mm.b.MD, com.tencent.mm.b.MC);
      return;
    case 3:
      com.tencent.mm.plugin.a.b.jE("L100_100_logout");
      this.iVx.iVq.startActivity(new Intent(this.iVx.iVq, FacebookLoginUI.class));
      return;
    case 4:
    }
    com.tencent.mm.plugin.a.b.jE("R500_100");
    this.iVx.iVq.startActivity(new Intent(this.iVx.iVq, RegByEmailUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.dx
 * JD-Core Version:    0.6.2
 */