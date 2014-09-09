package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.os.Bundle;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.c.a.d;
import com.tencent.mm.ui.c.a.g;
import com.tencent.mm.ui.c.a.h;

final class i
  implements g
{
  private i(BindFacebookUI paramBindFacebookUI)
  {
  }

  public final void a(Bundle paramBundle)
  {
    z.d("!32@/B4Tb64lLpJSlrS0DPG1QdbGPockUxOH", "token:" + BindFacebookUI.c(this.iNR).aYA());
    bg.qW().oQ().set(65830, BindFacebookUI.c(this.iNR).aYA());
    if (BindFacebookUI.c(this.iNR).aYB() != 0L)
      bg.qW().oQ().set(65832, Long.valueOf(BindFacebookUI.c(this.iNR).aYB()));
    String str1 = this.iNR.getString(n.buo);
    String str2 = this.iNR.getString(n.bGG);
    BindFacebookUI.a(this.iNR, ProgressDialog.show(this.iNR, str1, str2, true));
    BindFacebookUI.e(this.iNR).setOnCancelListener(BindFacebookUI.d(this.iNR));
    BindFacebookUI.a(this.iNR, new r(1, BindFacebookUI.c(this.iNR).aYA()));
    bg.qX().d(BindFacebookUI.a(this.iNR));
    BindFacebookUI.eI(true);
  }

  public final void a(d paramd)
  {
    z.d("!32@/B4Tb64lLpJSlrS0DPG1QdbGPockUxOH", "onError:" + paramd.getMessage());
    com.tencent.mm.ui.base.e.o(this.iNR, paramd.getMessage(), this.iNR.getString(n.bBv));
    BindFacebookUI.eI(false);
  }

  public final void a(h paramh)
  {
    z.d("!32@/B4Tb64lLpJSlrS0DPG1QdbGPockUxOH", "onFacebookError:" + paramh.aYC());
    com.tencent.mm.ui.base.e.o(this.iNR, paramh.getMessage(), this.iNR.getString(n.bBv));
    BindFacebookUI.eI(false);
  }

  public final void onCancel()
  {
    z.d("!32@/B4Tb64lLpJSlrS0DPG1QdbGPockUxOH", "onCancel");
    BindFacebookUI.eI(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.i
 * JD-Core Version:    0.6.2
 */