package com.tencent.mm.ui.tools.a;

import com.tencent.mm.sdk.platformtools.z;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class aa extends ThreadPoolExecutor
{
  private static int jXk;

  static
  {
    int i = af.nb();
    jXk = i;
    if (i < 2)
      jXk = 2;
    if (jXk > 8)
      jXk = 8;
  }

  aa()
  {
    super(jXk, jXk, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ai());
    z.d("!44@DmDvYvyFYKvUf5bh2Ze3RNFsTUs9CfxyRCDLI+ffU9Y=", "Monet Thread Poolsize is " + jXk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.aa
 * JD-Core Version:    0.6.2
 */