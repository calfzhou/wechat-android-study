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

final class ab
  implements g
{
  private ab(FacebookAuthUI paramFacebookAuthUI)
  {
  }

  public final void a(Bundle paramBundle)
  {
    z.d("!32@/B4Tb64lLpKNEztPnVXezyEM445BVS+m", "token:" + FacebookAuthUI.e(this.iOi).aYA());
    bg.qW().oQ().set(65830, FacebookAuthUI.e(this.iOi).aYA());
    if (FacebookAuthUI.e(this.iOi).aYB() != 0L)
      bg.qW().oQ().set(65832, Long.valueOf(FacebookAuthUI.e(this.iOi).aYB()));
    String str1 = this.iOi.getString(n.buo);
    String str2 = this.iOi.getString(n.bGG);
    FacebookAuthUI.a(this.iOi, ProgressDialog.show(this.iOi, str1, str2, true));
    FacebookAuthUI.d(this.iOi).setOnCancelListener(FacebookAuthUI.c(this.iOi));
    FacebookAuthUI.a(this.iOi, new r(1, FacebookAuthUI.e(this.iOi).aYA()));
    bg.qX().d(FacebookAuthUI.a(this.iOi));
    FacebookAuthUI.eJ(true);
  }

  public final void a(d paramd)
  {
    z.d("!32@/B4Tb64lLpKNEztPnVXezyEM445BVS+m", "onError:" + paramd.getMessage());
    com.tencent.mm.ui.base.e.o(this.iOi, paramd.getMessage(), this.iOi.getString(n.bBv));
    FacebookAuthUI.eJ(false);
  }

  public final void a(h paramh)
  {
    z.d("!32@/B4Tb64lLpKNEztPnVXezyEM445BVS+m", "onFacebookError:" + paramh.aYC());
    com.tencent.mm.ui.base.e.o(this.iOi, paramh.getMessage(), this.iOi.getString(n.bBv));
    FacebookAuthUI.eJ(false);
  }

  public final void onCancel()
  {
    z.d("!32@/B4Tb64lLpKNEztPnVXezyEM445BVS+m", "onCancel");
    FacebookAuthUI.eJ(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ab
 * JD-Core Version:    0.6.2
 */