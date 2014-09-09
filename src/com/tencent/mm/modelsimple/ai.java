package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.us;
import com.tencent.mm.protocal.a.wx;
import com.tencent.mm.protocal.a.wy;
import java.util.Map;

public final class ai extends com.tencent.mm.o.x
  implements ab
{
  public long cDM = -1L;
  private final long dCX = 60000L;
  private Runnable dCY;
  private m dlH;
  public a dmI;
  public int errCode;
  public int errType;

  public ai(float paramFloat1, float paramFloat2, long paramLong)
  {
    us localus = new us();
    localus.hXd = paramFloat1;
    localus.hXe = paramFloat2;
    localus.hXi = 1;
    localus.hXf = 0;
    a(localus, 1, -10000.0F, -10000.0F);
    this.cDM = paramLong;
  }

  public ai(us paramus, float paramFloat1, float paramFloat2)
  {
    a(paramus, 0, paramFloat1, paramFloat2);
  }

  public ai(wx paramwx)
  {
    b localb = new b();
    localb.a(paramwx);
    localb.b(new wy());
    localb.fi("/cgi-bin/micromsg-bin/scanstreetview");
    localb.de(424);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
  }

  private void a(us paramus, int paramInt, float paramFloat1, float paramFloat2)
  {
    b localb = new b();
    localb.a(new wx());
    localb.b(new wy());
    localb.fi("/cgi-bin/micromsg-bin/scanstreetview");
    localb.de(424);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    wx localwx = (wx)this.dmI.sO();
    localwx.iro = paramus;
    localwx.hOi = paramInt;
    localwx.irp = paramFloat1;
    localwx.irq = paramFloat2;
  }

  public static String hv(String paramString)
  {
    Map localMap = com.tencent.mm.sdk.platformtools.x.bB(paramString, "streetview");
    if (localMap == null)
      return null;
    return (String)localMap.get(".streetview.link");
  }

  protected final int a(aj paramaj)
  {
    if (((wx)((a)paramaj).sO()).iro == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvixiFaHlmIL8X17EHTvJycQ=", "req.rImpl.UserPos == null");
      return aa.doN;
    }
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvixiFaHlmIL8X17EHTvJycQ=", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.errType = paramInt2;
    this.errCode = paramInt3;
    if (this.dlH != null)
      this.dlH.a(paramInt2, paramInt3, paramString, this);
    while (true)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = zF().hSl;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvixiFaHlmIL8X17EHTvJycQ=", "xml is %s", arrayOfObject);
      if (this.dCY != null)
        this.dCY.run();
      return;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvixiFaHlmIL8X17EHTvJycQ=", "callback null");
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
  }

  public final int getType()
  {
    return 424;
  }

  protected final int sB()
  {
    return 10;
  }

  public final wy zF()
  {
    if ((this.dmI != null) && (this.dmI.sP() != null))
      return (wy)this.dmI.sP();
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ai
 * JD-Core Version:    0.6.2
 */