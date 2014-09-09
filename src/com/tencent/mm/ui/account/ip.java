package com.tencent.mm.ui.account;

import android.widget.EditText;

final class ip
  implements Runnable
{
  ip(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void run()
  {
    RegSetInfoUI.a(this.iSh).clearFocus();
    RegSetInfoUI.a(this.iSh).requestFocus();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ip
 * JD-Core Version:    0.6.2
 */