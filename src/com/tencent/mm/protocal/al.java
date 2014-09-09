package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.of;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;

public final class al extends p
  implements n
{
  public of hNI = new of();

  public final int getCmdId()
  {
    return 48;
  }

  public final int sV()
  {
    return 107;
  }

  public final byte[] sW()
  {
    a(bh.aHt());
    this.hNI.hRd = new ws().cl(ch.aHG());
    this.hNI.hRy = m.b(this);
    return this.hNI.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.al
 * JD-Core Version:    0.6.2
 */