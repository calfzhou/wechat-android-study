package com.tencent.mm.sandbox.updater;

import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.e;

final class n
  implements Runnable
{
  n(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void run()
  {
    e.a(this.iBB, AppUpdaterUI.e(this.iBB).desc, this.iBB.getString(com.tencent.mm.n.buo), new o(this)).setOnCancelListener(new p(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.n
 * JD-Core Version:    0.6.2
 */