package com.tencent.mm.aa;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.bw;
import com.tencent.mm.protocal.a.bx;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class a extends x
  implements ab
{
  private m dlH;
  private final com.tencent.mm.o.a dmI;

  public a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new bw());
    localb.b(new bx());
    localb.fi("/cgi-bin/micromsg-bin/bindlinkedincontact");
    localb.de(549);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    bw localbw = (bw)this.dmI.sO();
    localbw.hQH = 1;
    localbw.hQN = paramInt;
    localbw.hQO = paramString1;
    localbw.hQP = paramString2;
    localbw.hQQ = paramString3;
    localbw.hQR = paramString4;
    localbw.hQS = paramString5;
    localbw.hQT = paramString6;
    localbw.hQU = paramString7;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvihe6RohiUOGxVSl0wgxswW3W6yCgdumpg==", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    bw localbw = (bw)this.dmI.sO();
    this.dmI.sP();
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bg.qW().oQ().set(286722, localbw.hQP);
      bg.qW().oQ().set(286721, localbw.hQO);
      bg.qW().oQ().set(286723, localbw.hQQ);
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 549;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.a
 * JD-Core Version:    0.6.2
 */