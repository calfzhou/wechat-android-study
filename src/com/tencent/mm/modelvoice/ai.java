package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.p;
import com.tencent.mm.sdk.platformtools.bn;
import com.tencent.mm.sdk.platformtools.z;

final class ai
  implements bn
{
  ai(ah paramah)
  {
  }

  public final void te()
  {
    if (!this.dHy.dHx.dHw.dHu.isPlaying())
    {
      bg.qY().mn();
      z.d("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "onCompletion() resetSpeaker");
      ac.a(this.dHy.dHx.dHw.dHu).requestFocus();
      ac.a(this.dHy.dHx.dHw.dHu).nH();
    }
    ac.c(this.dHy.dHx.dHw.dHu).te();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.ai
 * JD-Core Version:    0.6.2
 */