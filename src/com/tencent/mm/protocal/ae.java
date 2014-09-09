package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.kt;
import com.tencent.mm.protocal.a.vo;

public final class ae extends q
  implements o
{
  public kt hNE = new kt();

  public final int getCmdId()
  {
    return 1000000179;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    this.hNE = new kt().bK(paramArrayOfByte);
    m.a(this, this.hNE.hRz);
    return this.hNE.hRz.hQw;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.ae
 * JD-Core Version:    0.6.2
 */