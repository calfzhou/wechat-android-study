package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.ui.account.RegSetInfoUI;

final class bp
  implements View.OnClickListener
{
  bp(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void onClick(View paramView)
  {
    if (MobileLoginOrForceReg.g(this.iUG) == null)
    {
      Intent localIntent = new Intent();
      b.jE("R200_900_phone");
      localIntent.putExtra("regsetinfo_ticket", MobileLoginOrForceReg.h(this.iUG));
      localIntent.putExtra("regsetinfo_user", MobileLoginOrForceReg.e(this.iUG));
      localIntent.putExtra("regsetinfo_ismobile", 1);
      localIntent.putExtra("regsetinfo_isForce", true);
      localIntent.putExtra("regsetinfo_NextControl", MobileLoginOrForceReg.i(this.iUG));
      localIntent.setClass(this.iUG, RegSetInfoUI.class);
      this.iUG.startActivity(localIntent);
      return;
    }
    MobileLoginOrForceReg.j(this.iUG);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.bp
 * JD-Core Version:    0.6.2
 */