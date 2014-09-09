package com.tencent.mm.model;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class ce extends x
  implements ab
{
  private final cg dlG;
  private m dlH;
  private final String dlI;
  private long dlJ;

  public ce(cg paramcg)
  {
    this(paramcg, null);
  }

  public ce(cg paramcg, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = ch.aHN();
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvr3T0yqJHb2jPIO3R3Mts1U=", "init LocalProxy task:%s [%s] ", arrayOfObject);
    this.dlG = paramcg;
    this.dlI = paramString;
  }

  public final int a(r paramr, m paramm)
  {
    c(paramr);
    this.dlH = paramm;
    this.dlJ = ch.CN();
    bg.qQ().n(new cf(this));
    return 0;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if (this.dlG != null)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.dlI;
      arrayOfObject[1] = Long.valueOf(ch.ad(this.dlJ));
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvr3T0yqJHb2jPIO3R3Mts1U=", "local proxy [%s] end, cost=%d", arrayOfObject);
      this.dlG.a(super.tp());
    }
    this.dlH.a(0, 0, null, this);
  }

  public final int getType()
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ce
 * JD-Core Version:    0.6.2
 */