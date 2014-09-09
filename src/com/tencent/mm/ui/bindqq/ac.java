package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.as;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class ac
  implements DialogInterface.OnClickListener
{
  ac(StartUnbindQQ paramStartUnbindQQ)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpKu4h15rHD1g0K7k5MDokBS", "imgSid:" + StartUnbindQQ.e(this.jlk) + " img len" + StartUnbindQQ.f(this.jlk).length + " " + k.nL());
    as localas = new as(2, StartUnbindQQ.d(this.jlk), StartUnbindQQ.g(this.jlk).aRh(), StartUnbindQQ.g(this.jlk).aRi(), StartUnbindQQ.g(this.jlk).aRj());
    bg.qX().d(localas);
    StartUnbindQQ localStartUnbindQQ = this.jlk;
    ActionBarActivity localActionBarActivity = this.jlk.aPI();
    this.jlk.getString(n.buo);
    StartUnbindQQ.a(localStartUnbindQQ, e.a(localActionBarActivity, this.jlk.getString(n.ceV), true, new ad(this, localas)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.ac
 * JD-Core Version:    0.6.2
 */