package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.nk;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;

public final class ag extends p
  implements n
{
  public nk hNF = new nk();

  public final int sV()
  {
    return 572;
  }

  public final byte[] sW()
  {
    a(bh.aHt());
    this.hNF.hRd = new ws().cl(ch.aHG());
    this.hNF.hRy = m.b(this);
    return this.hNF.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.ag
 * JD-Core Version:    0.6.2
 */