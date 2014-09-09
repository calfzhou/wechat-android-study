package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.tj;
import com.tencent.mm.protocal.a.vo;

public final class ao extends q
  implements o
{
  public tj hNK = new tj();

  public final int getCmdId()
  {
    return 1000000027;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    this.hNK = new tj().cg(paramArrayOfByte);
    m.a(this, this.hNK.hRz);
    return this.hNK.hRz.hQw;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.ao
 * JD-Core Version:    0.6.2
 */