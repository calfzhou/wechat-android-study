package com.tencent.mm.ui.contact;

import android.widget.EditText;
import com.tencent.mm.ui.widget.c;

final class de
  implements c
{
  de(ModRemarkNameUI paramModRemarkNameUI)
  {
  }

  public final void afm()
  {
    if (ModRemarkNameUI.a(this.jAS).getText().toString().trim().length() > 0)
      this.jAS.eB(true);
    while (ModRemarkNameUI.b(this.jAS) == 0)
      return;
    this.jAS.eB(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.de
 * JD-Core Version:    0.6.2
 */