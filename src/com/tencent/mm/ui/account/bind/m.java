package com.tencent.mm.ui.account.bind;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.c.a.ej;
import com.tencent.mm.c.a.el;
import com.tencent.mm.c.a.em;
import com.tencent.mm.c.a.en;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.ui.base.e;

final class m
  implements MenuItem.OnMenuItemClickListener
{
  m(BindMobileVerifyUI paramBindMobileVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    String str1 = BindMobileVerifyUI.a(this.iTY).getText().toString().trim();
    if (str1.equals(""))
    {
      e.b(this.iTY, com.tencent.mm.n.bwW, com.tencent.mm.n.buo);
      return true;
    }
    this.iTY.XF();
    ej localej = new ej();
    localej.cJY.context = this.iTY;
    a.aGB().g(localej);
    String str2 = localej.cJZ.cFd;
    em localem = new em();
    a.aGB().g(localem);
    String str3 = localem.cKa.cFf;
    ak localak = new ak(BindMobileVerifyUI.b(this.iTY), 2, str1, "", str2, str3);
    bg.qX().d(localak);
    BindMobileVerifyUI localBindMobileVerifyUI1 = this.iTY;
    BindMobileVerifyUI localBindMobileVerifyUI2 = this.iTY;
    this.iTY.getString(com.tencent.mm.n.buo);
    BindMobileVerifyUI.a(localBindMobileVerifyUI1, e.a(localBindMobileVerifyUI2, this.iTY.getString(com.tencent.mm.n.bwO), true, new n(this, localak)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.m
 * JD-Core Version:    0.6.2
 */