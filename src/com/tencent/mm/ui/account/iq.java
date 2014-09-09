package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ap;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class iq
  implements DialogInterface.OnClickListener
{
  iq(RegSetInfoUI paramRegSetInfoUI, x paramx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str1 = RegSetInfoUI.b(this.iSh).getText().toString().trim();
    String str2 = RegSetInfoUI.a(this.iSh).getText().toString().trim();
    if ((str1 == null) || (str1.length() <= 0))
    {
      e.b(this.iSh, n.cnE, n.bYK);
      return;
    }
    this.iSh.XF();
    int i = RegSetInfoUI.e(this.iSh);
    String str3 = RegSetInfoUI.f(this.iSh);
    bg.qX().a(429, this.iSh);
    ap localap = new ap(str3, RegSetInfoUI.g(this.iSh), i, str1, str2, ((ap)this.dpb).wC(), RegSetInfoUI.D(this.iSh).aRi());
    bg.qX().d(localap);
    RegSetInfoUI localRegSetInfoUI1 = this.iSh;
    RegSetInfoUI localRegSetInfoUI2 = this.iSh;
    this.iSh.getString(n.buo);
    RegSetInfoUI.a(localRegSetInfoUI1, e.a(localRegSetInfoUI2, this.iSh.getString(n.bZa), true, new ir(this, localap)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.iq
 * JD-Core Version:    0.6.2
 */