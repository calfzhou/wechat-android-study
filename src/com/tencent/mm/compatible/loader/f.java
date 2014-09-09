package com.tencent.mm.compatible.loader;

import android.annotation.TargetApi;
import android.os.Build;

final class f
  implements Runnable
{
  @TargetApi(8)
  public final void run()
  {
    e.cz("lib/" + Build.CPU_ABI2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.f
 * JD-Core Version:    0.6.2
 */