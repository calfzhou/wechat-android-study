package com.tencent.mm.ui.account;

import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.bd;
import java.util.Map;

final class fv
  implements bd
{
  fv(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void BD(String paramString)
  {
    String str1;
    String str2;
    if ((!ch.jb(paramString)) && (paramString.length() > 1))
    {
      str1 = paramString.substring(1);
      str2 = (String)RegByMobileRegAIOUI.d(this.iQP).get(str1);
      if (ch.jb(str2))
      {
        RegByMobileRegAIOUI.c(this.iQP).setText(this.iQP.getString(n.bSD));
        RegByMobileRegAIOUI.a(this.iQP, false);
      }
    }
    while (true)
    {
      RegByMobileRegAIOUI.b(this.iQP);
      return;
      if ((this.iQP.iPa.get(RegByMobileRegAIOUI.c(this.iQP).getText()) == null) || (!((String)this.iQP.iPa.get(RegByMobileRegAIOUI.c(this.iQP).getText())).equals(str1)))
        RegByMobileRegAIOUI.c(this.iQP).setText(str2);
      RegByMobileRegAIOUI.a(this.iQP, true);
      continue;
      RegByMobileRegAIOUI.c(this.iQP).setText(this.iQP.getString(n.bSF));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fv
 * JD-Core Version:    0.6.2
 */