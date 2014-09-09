package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.by;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;

public final class s extends p
  implements n
{
  public by hNs = new by();

  public final int sV()
  {
    return 145;
  }

  public final byte[] sW()
  {
    a(bh.aHt());
    this.hNs.hRd = new ws().cl(ch.aHG());
    this.hNs.hRy = m.b(this);
    return this.hNs.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.s
 * JD-Core Version:    0.6.2
 */