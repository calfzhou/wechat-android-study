package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.p.a;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class al
  implements DialogInterface.OnClickListener
{
  al(VerifyQQUI paramVerifyQQUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpIHRU4Da45B3AN7rAOr54wF", "imgSid:" + VerifyQQUI.g(this.jlq) + " img len" + VerifyQQUI.h(this.jlq).length + " " + k.nL());
    a locala = new a(VerifyQQUI.b(this.jlq), VerifyQQUI.c(this.jlq), VerifyQQUI.i(this.jlq).aRh(), VerifyQQUI.i(this.jlq).aRi(), VerifyQQUI.i(this.jlq).aRj(), VerifyQQUI.d(this.jlq), VerifyQQUI.e(this.jlq));
    bg.qX().d(locala);
    VerifyQQUI localVerifyQQUI = this.jlq;
    ActionBarActivity localActionBarActivity = this.jlq.aPI();
    this.jlq.getString(n.bxp);
    VerifyQQUI.a(localVerifyQQUI, e.a(localActionBarActivity, this.jlq.getString(n.bxh), true, new am(this, locala)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.al
 * JD-Core Version:    0.6.2
 */