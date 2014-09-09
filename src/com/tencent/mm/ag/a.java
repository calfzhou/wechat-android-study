package com.tencent.mm.ag;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.fm;
import com.tencent.mm.protocal.a.fn;
import com.tencent.mm.sdk.platformtools.z;

public final class a extends x
  implements ab
{
  private m dlH;
  private final com.tencent.mm.o.a dmI;

  public a(String paramString)
  {
    b localb = new b();
    localb.a(new fm());
    localb.b(new fn());
    localb.fi("/cgi-bin/micromsg-bin/deletecardimg");
    localb.de(576);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((fm)this.dmI.sO()).hVp = paramString;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvpsTxEhRs31frwbWcFeG1bk=", "onGYNetEnd:%s, %s", arrayOfObject);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 576;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ag.a
 * JD-Core Version:    0.6.2
 */