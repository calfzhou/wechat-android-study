package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.ks;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;

public final class ad extends p
  implements n
{
  public ks hND = new ks();

  public final int getCmdId()
  {
    return 179;
  }

  public final int sV()
  {
    return 381;
  }

  public final byte[] sW()
  {
    a(bh.aHt());
    this.hND.hRd = new ws().cl(ch.aHG());
    this.hND.ibj = bh.aHr().aHy();
    this.hND.hRy = m.b(this);
    return this.hND.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.ad
 * JD-Core Version:    0.6.2
 */