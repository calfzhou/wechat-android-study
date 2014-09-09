package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.w;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.z;

public final class ad extends com.tencent.mm.o.x
  implements ab
{
  private m dlH;
  private a dmI;
  private int huW;
  private ac huX;

  public ad(int paramInt, ac paramac)
  {
    this.huW = paramInt;
    b localb = new b();
    localb.a(new w());
    localb.b(new com.tencent.mm.protocal.a.x());
    localb.fi("/cgi-bin/micromsg-bin/appcenter");
    localb.de(452);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    w localw = (w)this.dmI.sO();
    byte[] arrayOfByte = paramac.Ue();
    if (arrayOfByte != null)
      localw.hPj = new ws().cl(arrayOfByte);
    localw.ewb = paramInt;
    this.huX = paramac;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvhHbXbegBzoVbS15fEWkRq0=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvhHbXbegBzoVbS15fEWkRq0=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.huX.ac(ai.a(((com.tencent.mm.protocal.a.x)this.dmI.sP()).hPk));
    this.huX.a(paramInt1, paramInt2, paramInt3, paramString, this.dmI, paramArrayOfByte);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int ayK()
  {
    return this.huW;
  }

  public final ac ayL()
  {
    return this.huX;
  }

  public final int getType()
  {
    return 452;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ad
 * JD-Core Version:    0.6.2
 */