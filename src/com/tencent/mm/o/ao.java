package com.tencent.mm.o;

import com.tencent.mm.network.ab;
import com.tencent.mm.sdk.platformtools.z;

final class ao
  implements Runnable
{
  ao(an paraman)
  {
  }

  public final void run()
  {
    z.w("!44@/B4Tb64lLpJVmBcdRgwcnCA6wpOd+TXyJoUPBDMn8CE=", "time exceed, force to callback");
    an.b(this.dpo).a(-1, 3, -1, "time exceed, force to callback", an.a(this.dpo), null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.ao
 * JD-Core Version:    0.6.2
 */