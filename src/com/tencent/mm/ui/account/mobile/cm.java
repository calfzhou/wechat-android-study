package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.account.RegSetInfoUI;

final class cm
  implements DialogInterface.OnClickListener
{
  cm(ce paramce, x paramx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (com.tencent.mm.protocal.a.hrq)
    {
      MobileVerifyUI localMobileVerifyUI = ce.b(this.iUS);
      int i = n.bDL;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = ("0x" + Integer.toHexString(com.tencent.mm.protocal.a.hrn));
      arrayOfObject[1] = y.aGW();
      String str = localMobileVerifyUI.getString(i, arrayOfObject);
      z.e("!44@/B4Tb64lLpKNhhU94SG29mhdCBfY2C/bywst5XLPb6E=", "url " + str);
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("rawUrl", str);
      localIntent2.putExtra("showShare", false);
      localIntent2.putExtra("show_bottom", false);
      localIntent2.putExtra("needRedirect", false);
      localIntent2.putExtra("neverGetA8Key", true);
      localIntent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.hNg);
      localIntent2.putExtra("hardcode_general_ctrl", GeneralControlWrapper.hNd);
      com.tencent.mm.plugin.a.a.dWo.h(localIntent2, ce.b(this.iUS));
      return;
    }
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("regsetinfo_ticket", ((ai)this.dpb).wm());
    localIntent1.putExtra("regsetinfo_user", ce.b(this.iUS).cTZ);
    localIntent1.putExtra("regsetinfo_ismobile", 1);
    localIntent1.putExtra("regsetinfo_NextControl", ((ai)this.dpb).wo());
    localIntent1.setClass(ce.b(this.iUS), RegSetInfoUI.class);
    b.jE("R200_950_olduser");
    ce.b(this.iUS).startActivity(localIntent1);
    b.jF(bg.qS() + "," + getClass().getName() + ",L200_900_phone," + bg.eg("L200_900_phone") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.cm
 * JD-Core Version:    0.6.2
 */