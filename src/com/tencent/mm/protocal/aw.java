package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.tl;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.l;

public final class aw extends p
  implements n
{
  public tl hNO = new tl();

  public final int getCmdId()
  {
    return 0;
  }

  public final int sV()
  {
    return 126;
  }

  public final byte[] sW()
  {
    a(bh.aHt());
    this.hNO.hRd = new ws().cl(ch.aHG());
    this.hNO.hRy = m.b(this);
    this.hNO.ioo = l.cFn;
    return this.hNO.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.aw
 * JD-Core Version:    0.6.2
 */