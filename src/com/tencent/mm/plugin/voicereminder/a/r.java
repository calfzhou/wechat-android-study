package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.o.s;
import com.tencent.mm.sdk.platformtools.z;

final class r
  implements s
{
  r(p paramp)
  {
  }

  public final void mj()
  {
    z.e("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "Record Failed file:" + p.a(this.gSS));
    p.ti(p.a(this.gSS));
    if (this.gSS.dHI != null)
      this.gSS.dHI.mj();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.r
 * JD-Core Version:    0.6.2
 */