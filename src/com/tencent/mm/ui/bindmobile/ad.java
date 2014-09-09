package com.tencent.mm.ui.bindmobile;

import android.widget.EditText;
import com.tencent.mm.modelsimple.e;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.ch;

final class ad
  implements aq
{
  String euR;

  ad(BindMContactUI paramBindMContactUI)
  {
  }

  public final boolean rD()
  {
    this.euR = e.m(this.jkl, BindMContactUI.c(this.jkl));
    return true;
  }

  public final boolean rE()
  {
    EditText localEditText;
    if (ch.jb(BindMContactUI.b(this.jkl).getText().trim()))
    {
      localEditText = BindMContactUI.b(this.jkl);
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
 * Qualified Name:     com.tencent.mm.ui.bindmobile.ad
 * JD-Core Version:    0.6.2
 */