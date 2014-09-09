package com.tencent.mm.ui.account;

import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.applet.r;

final class io extends r
{
  io(RegSetInfoUI paramRegSetInfoUI, x paramx)
  {
  }

  public final void aQC()
  {
    this.iSh.XF();
    String str1 = RegSetInfoUI.a(this.iSh).getText().toString().trim();
    String str2 = RegSetInfoUI.b(this.iSh).getText().toString().trim();
    int i = RegSetInfoUI.e(this.iSh);
    bg.qX().a(126, this.iSh);
    ae localae = new ae("", RegSetInfoUI.z(this.iSh), str2, RegSetInfoUI.A(this.iSh), RegSetInfoUI.B(this.iSh), RegSetInfoUI.C(this.iSh), RegSetInfoUI.g(this.iSh), i, str1, ((ae)this.dpb).wC(), "", RegSetInfoUI.E(this.iSh), RegSetInfoUI.j(this.iSh));
    bg.qX().d(localae);
  }

  protected final void onStart()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.io
 * JD-Core Version:    0.6.2
 */