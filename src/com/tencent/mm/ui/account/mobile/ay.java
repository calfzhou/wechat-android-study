package com.tencent.mm.ui.account.mobile;

import android.widget.EditText;
import com.tencent.mm.modelsimple.e;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.ch;

final class ay
  implements aq
{
  String euR;

  ay(MobileInputUI paramMobileInputUI)
  {
  }

  public final boolean rD()
  {
    this.euR = e.m(this.iUs, this.iUs.dmj);
    return true;
  }

  public final boolean rE()
  {
    EditText localEditText;
    if (ch.jb(this.iUs.iOS.getText().trim()))
    {
      localEditText = this.iUs.iOS;
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
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ay
 * JD-Core Version:    0.6.2
 */