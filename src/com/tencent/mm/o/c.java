package com.tencent.mm.o;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.vn;
import com.tencent.mm.protocal.m;
import com.tencent.mm.protocal.n;
import com.tencent.mm.protocal.p;

public final class c extends p
  implements n
{
  private int cmdId;
  private int doh;
  private a don;
  private boolean doo;

  public c(a parama, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.don = parama;
    this.doh = paramInt1;
    this.cmdId = paramInt2;
    this.doo = paramBoolean;
  }

  public final int getCmdId()
  {
    return this.cmdId;
  }

  public final int sV()
  {
    return this.doh;
  }

  public final byte[] sW()
  {
    if ((this.don instanceof vn))
      ((vn)this.don).hRy = m.b(this);
    return this.don.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.c
 * JD-Core Version:    0.6.2
 */