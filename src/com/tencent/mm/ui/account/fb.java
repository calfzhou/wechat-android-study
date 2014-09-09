package com.tencent.mm.ui.account;

import android.widget.EditText;
import com.tencent.mm.modelsimple.e;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.ch;

final class fb
  implements aq
{
  String euR;

  fb(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final boolean rD()
  {
    this.euR = e.m(this.iQP, RegByMobileRegAIOUI.i(this.iQP));
    return true;
  }

  public final boolean rE()
  {
    EditText localEditText;
    if (ch.jb(RegByMobileRegAIOUI.f(this.iQP).getText().trim()))
    {
      localEditText = RegByMobileRegAIOUI.f(this.iQP);
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
 * Qualified Name:     com.tencent.mm.ui.account.fb
 * JD-Core Version:    0.6.2
 */