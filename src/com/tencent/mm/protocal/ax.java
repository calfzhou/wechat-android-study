package com.tencent.mm.protocal;

import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.tm;
import com.tencent.mm.protocal.a.vo;

public final class ax extends q
  implements o
{
  public tm hNP = new tm();

  public final int getCmdId()
  {
    return 0;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    this.hNP = new tm().ch(paramArrayOfByte);
    m.a(this, this.hNP.hRz);
    return this.hNP.hRz.hQw;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.ax
 * JD-Core Version:    0.6.2
 */