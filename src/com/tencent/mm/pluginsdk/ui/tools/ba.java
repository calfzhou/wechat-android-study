package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.mm.ak.m;
import com.tencent.mm.sdk.platformtools.z;

final class ba
  implements Runnable
{
  volatile boolean hMu = false;

  private ba(MMVideoView paramMMVideoView)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis();
    this.hMt.hMc = MMVideoView.wj(this.hMt.dFC);
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Integer.valueOf(this.hMt.hashCode());
    arrayOfObject1[1] = Integer.valueOf(hashCode());
    arrayOfObject1[2] = Long.valueOf(System.currentTimeMillis() - l);
    arrayOfObject1[3] = Boolean.valueOf(this.hMu);
    z.i("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x tick: open file, use %d ms, stop %B", arrayOfObject1);
    if (this.hMt.hMc < 0)
    {
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(hashCode());
      arrayOfObject3[1] = Integer.valueOf(this.hMt.hashCode());
      arrayOfObject3[2] = Integer.valueOf(this.hMt.hMc);
      z.w("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x error video id %d", arrayOfObject3);
      return;
    }
    MMVideoView.a(this.hMt);
    MMVideoView.b(this.hMt);
    if (MMVideoView.c(this.hMt) != null)
      MMVideoView.c(this.hMt).hMu = true;
    if (MMVideoView.d(this.hMt) != null)
      MMVideoView.d(this.hMt).hMu = true;
    MMVideoView.a(this.hMt, new ay(this.hMt, (byte)0));
    MMVideoView.a(this.hMt, new az(this.hMt, (byte)0));
    MMVideoView.c(this.hMt).hMv = MMVideoView.d(this.hMt);
    MMVideoView.d(this.hMt).hMw = MMVideoView.c(this.hMt);
    m.c(MMVideoView.c(this.hMt), 0L);
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = Integer.valueOf(this.hMt.hashCode());
    arrayOfObject2[1] = Integer.valueOf(hashCode());
    arrayOfObject2[2] = Boolean.valueOf(this.hMu);
    z.i("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x open file end, match stop %B", arrayOfObject2);
    MMVideoView.c(this.hMt).hMu = this.hMu;
    MMVideoView.d(this.hMt).hMu = this.hMu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.ba
 * JD-Core Version:    0.6.2
 */