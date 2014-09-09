package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.gb;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;

public final class aa extends p
  implements n
{
  public gb hNB = new gb();

  public final int sV()
  {
    return 481;
  }

  public final byte[] sW()
  {
    a(bh.aHt());
    this.hNB.hRd = new ws().cl(ch.aHG());
    this.hNB.hRy = m.b(this);
    return this.hNB.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.aa
 * JD-Core Version:    0.6.2
 */