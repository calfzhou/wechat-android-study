package com.tencent.mm.ui.account;

import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ap;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.applet.r;

final class it extends r
{
  it(RegSetInfoUI paramRegSetInfoUI, x paramx)
  {
  }

  public final void aQC()
  {
    this.iSh.XF();
    int i = RegSetInfoUI.e(this.iSh);
    String str = RegSetInfoUI.f(this.iSh);
    bg.qX().a(429, this.iSh);
    ap localap = new ap(str, RegSetInfoUI.g(this.iSh), i, "", "", ((ap)this.dpb).wC(), "");
    bg.qX().d(localap);
  }

  protected final void onStart()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.it
 * JD-Core Version:    0.6.2
 */