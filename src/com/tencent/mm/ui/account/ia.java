package com.tencent.mm.ui.account;

import android.widget.EditText;
import android.widget.ProgressBar;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ap;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.ch;

final class ia
  implements az
{
  ia(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean kJ()
  {
    Object localObject1 = RegSetInfoUI.a(this.iSh).getText().toString().trim();
    String str1 = RegSetInfoUI.b(this.iSh).getText().toString().trim();
    if ((ch.jb((String)localObject1)) && (!ch.jb(str1)))
      if (str1.length() <= 5)
        break label190;
    label190: for (localObject1 = str1.substring(0, 5); ; localObject1 = str1)
    {
      if ((!ch.jb((String)localObject1)) && (ch.jb(str1)));
      for (Object localObject2 = localObject1; ; localObject2 = str1)
      {
        if ((!ch.jb((String)localObject1)) && (RegSetInfoUI.c(this.iSh)) && (RegSetInfoUI.d(this.iSh)))
        {
          int i = RegSetInfoUI.e(this.iSh);
          String str2 = RegSetInfoUI.f(this.iSh);
          bg.qX().a(429, this.iSh);
          ap localap = new ap(str2, RegSetInfoUI.g(this.iSh), i, (String)localObject2, (String)localObject1, "", "");
          bg.qX().d(localap);
          RegSetInfoUI.h(this.iSh).setVisibility(0);
        }
        return false;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ia
 * JD-Core Version:    0.6.2
 */