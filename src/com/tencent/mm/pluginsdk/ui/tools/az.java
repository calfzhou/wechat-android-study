package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.mm.ak.m;
import com.tencent.mm.sdk.platformtools.z;

final class az
  implements Runnable
{
  volatile boolean hMu = false;
  ay hMw;

  private az(MMVideoView paramMMVideoView)
  {
  }

  public final void run()
  {
    if (this.hMu)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(this.hMt.hashCode());
      arrayOfObject2[1] = Integer.valueOf(hashCode());
      z.e("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x match stop draw", arrayOfObject2);
      return;
    }
    if ((-1 != MMVideoView.k(this.hMt)) && (MMVideoView.r(this.hMt) != null))
      this.hMt.setImageBitmap(MMVideoView.r(this.hMt));
    while (MMVideoView.e(this.hMt) != 0L)
    {
      long l = MMVideoView.f(this.hMt) - (System.currentTimeMillis() - MMVideoView.e(this.hMt));
      Object[] arrayOfObject1 = new Object[4];
      arrayOfObject1[0] = Integer.valueOf(this.hMt.hashCode());
      arrayOfObject1[1] = Integer.valueOf(hashCode());
      arrayOfObject1[2] = Integer.valueOf(MMVideoView.f(this.hMt));
      arrayOfObject1[3] = Long.valueOf(l);
      z.v("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x-#0x%x video delay %d, cur delay %d", arrayOfObject1);
      if (l <= 0L)
        break;
      m.c(this.hMw, l);
      return;
      this.hMt.setImageBitmap(MMVideoView.j(this.hMt));
    }
    m.c(this.hMw, 0L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.az
 * JD-Core Version:    0.6.2
 */