package com.tencent.mm.sandbox.updater;

import com.tencent.mm.ao.b;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.protocal.a;
import com.tencent.mm.protocal.a.ba;
import com.tencent.mm.protocal.a.nz;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sandbox.monitor.g;

public final class x extends g
{
  private String dSO;
  private byte[] dpA;
  private int iBF = 0;
  private final int iBG = 5;
  private int iBH = 0;
  private String[] iBI;
  private c iBJ;
  private z iBK = null;
  private c iBL = new y(this);
  private int uin;

  public x(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, byte[] paramArrayOfByte, String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramInt1, paramString1, paramInt2, paramBoolean);
    this.iBI = paramArrayOfString;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      this.iBI = new String[] { "short.weixin.qq.com" };
    this.uin = paramInt3;
    this.dSO = paramString2;
    this.dpA = paramArrayOfByte;
  }

  public final void a(c paramc)
  {
    this.iBJ = paramc;
    int i = 1 + this.iBF;
    this.iBF = i;
    if (i > 1000)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "doSceneCnt > DOSCENE_LIMIT, return");
      this.iBJ.a(-1, -1, null);
      return;
    }
    if (!j.u(this.iBn))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.iBn);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "SDCard full, packSize=[%s]", arrayOfObject);
      paramc.a(-1, -1, null);
      return;
    }
    nz localnz = new nz();
    ba localba = new ba();
    localba.hPM = a.hrn;
    localba.hPL = b.aO(v.nh().getBytes()).ns(16);
    localba.hPN = b.aO(a.hrg.getBytes()).ns(132);
    localba.hOi = 0;
    localba.hQu = b.aO(this.dSO.getBytes()).ns(36);
    localba.hQv = this.uin;
    localnz.hRy = localba;
    localnz.ieb = this.iBm;
    localnz.hUu = this.iBo;
    localnz.hQk = this.iBn;
    z localz = new z(this, this.iBI[(this.iBH / 5)], this.iBL);
    this.iBK = localz;
    localz.execute(new nz[] { localnz });
  }

  public final void cancel()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "do cancel, updateType = " + this.iBm);
    if ((this.iBK != null) && (!this.iBK.isCancelled()))
      this.iBK.cancel(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.x
 * JD-Core Version:    0.6.2
 */