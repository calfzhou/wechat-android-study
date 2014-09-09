package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class ik
  implements DialogInterface.OnClickListener
{
  ik(RegSetInfoUI paramRegSetInfoUI, x paramx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str1 = RegSetInfoUI.a(this.iSh).getText().toString().trim();
    String str2 = RegSetInfoUI.b(this.iSh).getText().toString().trim();
    if ((str2 == null) || (str2.length() <= 0))
    {
      e.b(this.iSh, n.cnE, n.bYK);
      return;
    }
    int i = RegSetInfoUI.e(this.iSh);
    bg.qX().a(126, this.iSh);
    ae localae = new ae("", RegSetInfoUI.z(this.iSh), str2, RegSetInfoUI.A(this.iSh), RegSetInfoUI.B(this.iSh), RegSetInfoUI.C(this.iSh), RegSetInfoUI.g(this.iSh), i, str1, ((ae)this.dpb).wC(), RegSetInfoUI.D(this.iSh).aRi(), RegSetInfoUI.E(this.iSh), RegSetInfoUI.j(this.iSh));
    bg.qX().d(localae);
    RegSetInfoUI localRegSetInfoUI1 = this.iSh;
    RegSetInfoUI localRegSetInfoUI2 = this.iSh;
    this.iSh.getString(n.buo);
    RegSetInfoUI.a(localRegSetInfoUI1, e.a(localRegSetInfoUI2, this.iSh.getString(n.bZa), true, new il(this, localae)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ik
 * JD-Core Version:    0.6.2
 */