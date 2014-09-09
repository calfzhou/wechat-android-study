package com.tencent.mm.plugin.f.b;

import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.qb;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.protocal.m;
import com.tencent.mm.protocal.o;
import com.tencent.mm.protocal.q;

public final class k extends q
  implements o
{
  public qb fTi = new qb();

  public final int getCmdId()
  {
    return 1000000218;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    this.fTi = new qb().bS(paramArrayOfByte);
    m.a(this, this.fTi.hRz);
    return this.fTi.hRz.hQw;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.k
 * JD-Core Version:    0.6.2
 */