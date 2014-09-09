package com.tencent.mm.compatible.audio;

import com.tencent.mm.compatible.g.a;
import com.tencent.mm.sdk.platformtools.z;

final class ah
  implements ae
{
  ah(ag paramag)
  {
  }

  public final void mj()
  {
    ag.a(this.dLb).nH();
    if (ag.b(this.dLb) != null)
      ag.b(this.dLb).mj();
    try
    {
      ag.c(this.dLb).release();
      ag.d(this.dLb);
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpIfoY3B/8f1JSRs2jdo+wRyFb+w/ZYBe8A=", "setErrorListener File[" + this.dLb.getFileName() + "] ErrMsg[" + localException.getStackTrace() + "]");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.ah
 * JD-Core Version:    0.6.2
 */