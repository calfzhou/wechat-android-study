package com.tencent.mm.ui.account;

import android.view.View;

final class ec
  implements Runnable
{
  ec(MMKeyboardUperView paramMMKeyboardUperView)
  {
  }

  public final void run()
  {
    this.iQb.fullScroll(130);
    MMKeyboardUperView.a(this.iQb).setVisibility(4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ec
 * JD-Core Version:    0.6.2
 */