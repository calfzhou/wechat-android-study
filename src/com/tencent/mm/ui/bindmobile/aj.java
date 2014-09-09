package com.tencent.mm.ui.bindmobile;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.c.a.ej;
import com.tencent.mm.c.a.el;
import com.tencent.mm.c.a.em;
import com.tencent.mm.c.a.en;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.ui.base.e;

final class aj
  implements View.OnClickListener
{
  aj(BindMContactVerifyUI paramBindMContactVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    String str1 = BindMContactVerifyUI.a(this.jkn).getText().toString().trim();
    if (str1.equals(""))
    {
      e.b(this.jkn, n.bwW, n.buo);
      return;
    }
    this.jkn.XF();
    ej localej = new ej();
    localej.cJY.context = this.jkn;
    a.aGB().g(localej);
    String str2 = localej.cJZ.cFd;
    em localem = new em();
    a.aGB().g(localem);
    String str3 = localem.cKa.cFf;
    int i = 2;
    if (BindMContactVerifyUI.b(this.jkn))
      i = 19;
    com.tencent.mm.modelfriend.ak localak = new com.tencent.mm.modelfriend.ak(BindMContactVerifyUI.c(this.jkn), i, str1, "", str2, str3);
    bg.qX().d(localak);
    BindMContactVerifyUI localBindMContactVerifyUI1 = this.jkn;
    BindMContactVerifyUI localBindMContactVerifyUI2 = this.jkn;
    this.jkn.getString(n.buo);
    BindMContactVerifyUI.a(localBindMContactVerifyUI1, e.a(localBindMContactVerifyUI2, this.jkn.getString(n.bwO), true, new ak(this, localak)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.aj
 * JD-Core Version:    0.6.2
 */