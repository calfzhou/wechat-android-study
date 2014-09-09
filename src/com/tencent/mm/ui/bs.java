package com.tencent.mm.ui;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;

final class bs
  implements Runnable
{
  bs(br parambr, int paramInt)
  {
  }

  public final void run()
  {
    if ((this.dYO == 1) || (LauncherUI.v(this.iKt.iKj) == 1))
      bg.qW().oQ().set(143618, Integer.valueOf(0));
    this.iKt.iKj.aW(LauncherUI.v(this.iKt.iKj), LauncherUI.w(this.iKt.iKj));
    this.iKt.iKj.oG(this.dYO);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bs
 * JD-Core Version:    0.6.2
 */