package com.tencent.mm.plugin.f.b;

import com.tencent.mm.protocal.a.qa;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.bh;
import com.tencent.mm.protocal.m;
import com.tencent.mm.protocal.n;
import com.tencent.mm.protocal.p;
import com.tencent.mm.sdk.platformtools.ch;

public final class j extends p
  implements n
{
  public qa fTh = new qa();

  public final int getCmdId()
  {
    return 218;
  }

  public final int sV()
  {
    return 443;
  }

  public final byte[] sW()
  {
    a(bh.aHt());
    this.fTh.hRd = new ws().cl(ch.aHG());
    this.fTh.hRy = m.b(this);
    return this.fTh.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.j
 * JD-Core Version:    0.6.2
 */