package com.tencent.mm.network;

import com.tencent.mm.sdk.platformtools.ch;

final class g
  implements Runnable
{
  g(String paramString)
  {
  }

  public final void run()
  {
    bh localbh = bk.Dq();
    if (ch.jb(this.dSW));
    for (byte[] arrayOfByte = null; ; arrayOfByte = this.dSW.getBytes())
    {
      localbh.onNotify(0, 268369923, arrayOfByte);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.g
 * JD-Core Version:    0.6.2
 */