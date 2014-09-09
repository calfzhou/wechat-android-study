package com.tencent.mm.o;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.protocal.a.zd;
import com.tencent.mm.protocal.m;
import com.tencent.mm.protocal.o;
import com.tencent.mm.protocal.q;

public final class d extends q
  implements o
{
  private int cmdId;
  private a don = null;
  private boolean doo;

  public d(a parama, int paramInt, boolean paramBoolean)
  {
    this.don = parama;
    this.cmdId = paramInt;
    this.doo = paramBoolean;
  }

  public final int getCmdId()
  {
    return this.cmdId;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    this.don = this.don.l(paramArrayOfByte);
    if (!(this.don instanceof zd))
    {
      m.a(this, ((vo)this.don).hRz);
      return ((vo)this.don).hRz.hQw;
    }
    return ((zd)this.don).getRet();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.d
 * JD-Core Version:    0.6.2
 */