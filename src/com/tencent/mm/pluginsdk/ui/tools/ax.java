package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.mm.sdk.platformtools.z;

final class ax
  implements Runnable
{
  ax(MMVideoView paramMMVideoView, int paramInt)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis();
    MMVideoView.nq(this.gnZ);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.hMt.hashCode());
    arrayOfObject[1] = Integer.valueOf(this.gnZ);
    arrayOfObject[2] = Long.valueOf(System.currentTimeMillis() - l);
    z.d("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x tick: do clear video %d, use %d ms", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.ax
 * JD-Core Version:    0.6.2
 */