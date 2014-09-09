package com.tencent.mm.ui.account;

import android.widget.EditText;

final class jl
  implements Runnable
{
  jl(jk paramjk)
  {
  }

  public final void run()
  {
    RegSetInfoUI.a(this.iSv.iSh).clearFocus();
    RegSetInfoUI.a(this.iSv.iSh).requestFocus();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jl
 * JD-Core Version:    0.6.2
 */