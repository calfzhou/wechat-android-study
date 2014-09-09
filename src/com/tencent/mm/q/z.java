package com.tencent.mm.q;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.dy;
import com.tencent.mm.protocal.a.dz;

public final class z extends x
  implements ab
{
  private m dlH;
  private a dmI;

  public z(String paramString1, int paramInt, String paramString2)
  {
    b localb = new b();
    localb.a(new dy());
    localb.b(new dz());
    localb.fi("/cgi-bin/micromsg-bin/clickcommand");
    localb.de(359);
    localb.df(176);
    localb.dg(1000000176);
    this.dmI = localb.sU();
    dy localdy = (dy)this.dmI.sO();
    localdy.hUe = paramInt;
    localdy.hUf = paramString2;
    localdy.hUg = paramString1;
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvqJcyBbmqJJZfnhqtvXQsW60bLAi247rBQ==", "click command: " + paramString1 + " , type: " + paramInt + " , info: " + paramString2);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 359;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.z
 * JD-Core Version:    0.6.2
 */