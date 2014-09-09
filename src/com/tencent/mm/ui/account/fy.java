package com.tencent.mm.ui.account;

import android.widget.EditText;
import com.tencent.mm.modelsimple.e;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class fy
  implements aq
{
  String euR;

  fy(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final boolean rD()
  {
    try
    {
      this.euR = e.m(this.iQU, RegByMobileRegUI.j(this.iQU));
      return true;
    }
    catch (Exception localException)
    {
      while (true)
        z.e("!44@/B4Tb64lLpLrFBPJPItazaNmgOXmIzWtmmL1w55PObM=", "getPhoneNum err: " + localException.getMessage());
    }
  }

  public final boolean rE()
  {
    EditText localEditText;
    if (ch.jb(RegByMobileRegUI.a(this.iQU).getText().trim()))
    {
      localEditText = RegByMobileRegUI.a(this.iQU);
      if (!ch.jb(this.euR))
        break label60;
    }
    label60: for (String str = ""; ; str = this.euR)
    {
      localEditText.setText(str);
      return true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fy
 * JD-Core Version:    0.6.2
 */