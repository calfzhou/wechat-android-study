package com.tencent.mm.plugin.f.b;

import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.px;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.protocal.m;
import com.tencent.mm.protocal.o;
import com.tencent.mm.protocal.q;

public final class f extends q
  implements o
{
  public px fTa = new px();

  public final int getCmdId()
  {
    return 0;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    this.fTa = new px().bR(paramArrayOfByte);
    if (this.fTa.hRz.hQx != null)
      m.a(this, this.fTa.hRz);
    return this.fTa.hRz.hQw;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.f
 * JD-Core Version:    0.6.2
 */