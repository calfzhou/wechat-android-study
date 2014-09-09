package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.os.Bundle;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.c.a.d;
import com.tencent.mm.ui.c.a.g;
import com.tencent.mm.ui.c.a.h;

final class ay
  implements g
{
  private ay(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void a(Bundle paramBundle)
  {
    z.d("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "token:" + FacebookLoginUI.a(this.iOr).aYA());
    String str1 = this.iOr.getString(com.tencent.mm.n.buo);
    String str2 = this.iOr.getString(com.tencent.mm.n.bGG);
    FacebookLoginUI.a(this.iOr, ProgressDialog.show(this.iOr, str1, str2, true));
    FacebookLoginUI.g(this.iOr).setOnCancelListener(FacebookLoginUI.f(this.iOr));
    FacebookLoginUI.a(this.iOr, new com.tencent.mm.modelsimple.n("facebook@wechat_auth", FacebookLoginUI.a(this.iOr).aYA(), "", "", ""));
    bg.qX().d(FacebookLoginUI.d(this.iOr));
    FacebookLoginUI.eK(true);
    b.jF(bg.qS() + "," + this.iOr.getClass().getName() + ",L14," + bg.eg("L14") + ",2");
  }

  public final void a(d paramd)
  {
    z.d("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "onError:" + paramd.getMessage());
    com.tencent.mm.ui.base.e.o(this.iOr, paramd.getMessage(), this.iOr.getString(com.tencent.mm.n.bBv));
    FacebookLoginUI.eK(false);
    b.jF(bg.qS() + "," + this.iOr.getClass().getName() + ",L14," + bg.eg("L14") + ",2");
  }

  public final void a(h paramh)
  {
    z.d("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "onFacebookError:" + paramh.aYC());
    com.tencent.mm.ui.base.e.o(this.iOr, paramh.getMessage(), this.iOr.getString(com.tencent.mm.n.bBv));
    FacebookLoginUI.eK(false);
    b.jF(bg.qS() + "," + this.iOr.getClass().getName() + ",L14," + bg.eg("L14") + ",2");
  }

  public final void onCancel()
  {
    z.d("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "onCancel");
    FacebookLoginUI.eK(false);
    b.jF(bg.qS() + "," + this.iOr.getClass().getName() + ",L14," + bg.eg("L14") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ay
 * JD-Core Version:    0.6.2
 */