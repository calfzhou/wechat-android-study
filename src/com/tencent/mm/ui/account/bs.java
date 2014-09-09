package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cq;
import com.tencent.mm.n;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;

final class bs
  implements View.OnClickListener
{
  bs(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (com.tencent.mm.protocal.a.hrq)
    {
      LoginHistoryUI localLoginHistoryUI = this.iPx;
      int i = n.bDL;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = ("0x" + Integer.toHexString(com.tencent.mm.protocal.a.hrn));
      arrayOfObject[1] = y.aGW();
      String str = localLoginHistoryUI.getString(i, arrayOfObject);
      z.e("!32@/B4Tb64lLpKxsTbPEeLD3A+BAp2nPFbL", "url " + str);
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("rawUrl", str);
      localIntent2.putExtra("showShare", false);
      localIntent2.putExtra("show_bottom", false);
      localIntent2.putExtra("needRedirect", false);
      localIntent2.putExtra("neverGetA8Key", true);
      localIntent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.hNg);
      localIntent2.putExtra("hardcode_general_ctrl", GeneralControlWrapper.hNd);
      com.tencent.mm.plugin.a.a.dWo.h(localIntent2, this.iPx);
      return;
    }
    cq.rO();
    Intent localIntent1 = new Intent(this.iPx, RegByMobileRegAIOUI.class);
    localIntent1.putExtra("login_type", 0);
    this.iPx.startActivity(localIntent1);
    cq.rO();
    b.eT(20);
    b.jE("RE200_100");
    b.jD("RE100_100_logout");
    b.b(false, bg.qS() + "," + getClass().getName() + ",RE100_100_logout," + bg.eg("RE100_100_logout") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bs
 * JD-Core Version:    0.6.2
 */