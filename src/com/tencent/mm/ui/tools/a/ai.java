package com.tencent.mm.ui.tools.a;

import java.util.concurrent.ThreadFactory;

final class ai
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    return new ah(paramRunnable);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.ai
 * JD-Core Version:    0.6.2
 */