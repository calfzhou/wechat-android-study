package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;

final class at
  implements DialogInterface.OnClickListener
{
  at(FacebookLoginUI paramFacebookLoginUI, di paramdi)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "imgSid:" + this.iOs.iPK + " img len" + this.iOs.iPM.length + " " + k.nL());
    com.tencent.mm.modelsimple.n localn = new com.tencent.mm.modelsimple.n("facebook@wechat_auth", FacebookLoginUI.a(this.iOr).aYA(), FacebookLoginUI.b(this.iOr).aRi(), FacebookLoginUI.b(this.iOr).aRh(), FacebookLoginUI.b(this.iOr).aRj());
    bg.qX().d(localn);
    FacebookLoginUI localFacebookLoginUI = this.iOr;
    this.iOr.getString(com.tencent.mm.n.buo);
    com.tencent.mm.ui.base.e.a(localFacebookLoginUI, this.iOr.getString(com.tencent.mm.n.bQn), true, new au(this, localn));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.at
 * JD-Core Version:    0.6.2
 */