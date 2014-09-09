package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;

final class jp
  implements MenuItem.OnMenuItemClickListener
{
  jp(SetPwdUI paramSetPwdUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    SetPwdUI.a(this.iSz, this.iSz.aQG());
    SetPwdUI.b(this.iSz, this.iSz.aQH());
    if (ch.jb(SetPwdUI.a(this.iSz)))
      return true;
    if (!SetPwdUI.a(this.iSz).equals(SetPwdUI.b(this.iSz)))
    {
      this.iSz.pe(js.iSB);
      return true;
    }
    if (SetPwdUI.a(this.iSz).length() > 16)
    {
      this.iSz.pe(js.iSC);
      return true;
    }
    if (ch.jh(SetPwdUI.a(this.iSz)))
    {
      com.tencent.mm.ui.base.e.b(this.iSz, n.bYv, n.bYK);
      return true;
    }
    if (!ch.iZ(SetPwdUI.a(this.iSz)))
    {
      if ((SetPwdUI.a(this.iSz).length() >= 4) && (SetPwdUI.a(this.iSz).length() < 9))
      {
        this.iSz.pe(js.iSE);
        return true;
      }
      this.iSz.pe(js.iSD);
      return true;
    }
    SetPwdUI.a(this.iSz);
    SetPwdUI.b(this.iSz);
    this.iSz.XF();
    if (ch.jb(this.iSz.dQm))
      this.iSz.dQm = ((String)bg.qW().oQ().get(77830));
    x localx = this.iSz.bE(SetPwdUI.a(this.iSz), this.iSz.dQm);
    bg.qX().d(localx);
    SetPwdUI.a(this.iSz, this.iSz.a(this.iSz, this.iSz.getString(n.buo), this.iSz.getString(n.bXT), new jq(this, localx)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jp
 * JD-Core Version:    0.6.2
 */