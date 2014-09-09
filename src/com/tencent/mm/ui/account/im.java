package com.tencent.mm.ui.account;

import android.widget.EditText;
import android.widget.ImageView;

final class im
  implements Runnable
{
  im(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void run()
  {
    RegSetInfoUI.i(this.iSh).requestFocus();
    RegSetInfoUI.b(this.iSh).clearFocus();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.im
 * JD-Core Version:    0.6.2
 */