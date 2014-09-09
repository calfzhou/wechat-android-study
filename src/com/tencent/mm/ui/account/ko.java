package com.tencent.mm.ui.account;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.o.ac;

final class ko
  implements Runnable
{
  ko(kn paramkn)
  {
  }

  public final void run()
  {
    bg.qX().d(new ce(new kp(this), "launch normal"));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ko
 * JD-Core Version:    0.6.2
 */