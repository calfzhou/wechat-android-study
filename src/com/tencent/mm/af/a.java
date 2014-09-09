package com.tencent.mm.af;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.ng;
import com.tencent.mm.protocal.a.nh;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class a extends com.tencent.mm.o.x
  implements ab
{
  private m dlH = null;
  private final com.tencent.mm.o.a dmI;

  public a()
  {
    this(com.tencent.mm.model.x.pG(), ch.a((Integer)bg.qW().oQ().get(66561)));
  }

  public a(String paramString, int paramInt)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new ng());
    localb.b(new nh());
    localb.fi("/cgi-bin/micromsg-bin/getqrcode");
    localb.de(168);
    localb.df(67);
    localb.dg(1000000067);
    this.dmI = localb.sU();
    ng localng = (ng)this.dmI.sO();
    localng.hVf = ai.iU(paramString);
    localng.hEu = paramInt;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvv6YJxRkFOH9mcPmtvH8BZE=", "req username:" + paramString + " style" + paramInt);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvv6YJxRkFOH9mcPmtvH8BZE=", "onGYNetEnd errType:" + paramInt2 + " errCode" + paramInt3);
    String str;
    byte[] arrayOfByte;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ng localng = (ng)this.dmI.sO();
      nh localnh = (nh)this.dmI.sP();
      str = ai.a(localng.hVf);
      arrayOfByte = ai.a(localnh.idt, new byte[0]);
      i = localnh.hEu;
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvv6YJxRkFOH9mcPmtvH8BZE=", "onGYNetEnd QRCODE:" + arrayOfByte.length + " style:" + i);
      if (!str.endsWith("@chatroom"))
        break label158;
      b.e(str, arrayOfByte);
    }
    while (true)
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      label158: bg.qW().oQ().set(66561, Integer.valueOf(i));
      b.e(str, arrayOfByte);
    }
  }

  public final int getType()
  {
    return 168;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.a
 * JD-Core Version:    0.6.2
 */