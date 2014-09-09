package com.tencent.mm.aa;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.ack;
import com.tencent.mm.protocal.a.acl;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class b extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public b()
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new ack());
    localb.b(new acl());
    localb.fi("/cgi-bin/micromsg-bin/unbindlinkedincontact");
    localb.de(550);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((ack)this.dmI.sO()).hQH = 1;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvpUv5ZVjWmot+K1vSTKkK0GViM44NHITtA==", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    this.dmI.sO();
    this.dmI.sP();
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bg.qW().oQ().set(286722, "");
      bg.qW().oQ().set(286721, "");
      bg.qW().oQ().set(286723, "");
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 550;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.b
 * JD-Core Version:    0.6.2
 */