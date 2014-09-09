package com.tencent.mm.pluginsdk.model.app;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.xm;
import com.tencent.mm.protocal.a.xn;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.n;

public final class as extends com.tencent.mm.o.x
  implements ab
{
  private long cDM = 0L;
  private ar cMM = null;
  private m dlH;
  private a dmI;
  private boolean haL = false;
  private keep_SceneResult hvq = null;
  private at hvr = null;

  public as(long paramLong, boolean paramBoolean, keep_SceneResult paramkeep_SceneResult, at paramat)
  {
    this.cDM = paramLong;
    this.hvq = paramkeep_SceneResult;
    this.hvr = paramat;
    this.haL = paramBoolean;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new xm());
    localb.b(new xn());
    localb.fi("/cgi-bin/micromsg-bin/sendappmsg");
    localb.de(222);
    localb.df(107);
    localb.dg(1000000107);
    this.dmI = localb.sU();
  }

  protected final int a(aj paramaj)
  {
    return com.tencent.mm.o.aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    this.cMM = bg.qW().oV().cV(this.cDM);
    if ((this.cMM == null) || (this.cMM.kk() != this.cDM))
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(this.cDM);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oorccTbCkvSCcPrllGIJObxw==", "cdntra doscene msginfo null id:%d", arrayOfObject1);
      this.hvr.I(3, -1);
      return -1;
    }
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(this.cMM.getContent());
    if (localb == null)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(this.cDM);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oorccTbCkvSCcPrllGIJObxw==", "cdntra doscene AppMessage.Content.parse null id:%d", arrayOfObject2);
      this.hvr.I(3, -1);
    }
    xm localxm = (xm)this.dmI.sO();
    com.tencent.mm.protocal.a.aa localaa = new com.tencent.mm.protocal.a.aa();
    localaa.hOd = localb.appId;
    localaa.hPt = (this.cMM.kt() + this.cMM.kk() + "T" + this.cMM.kn());
    localaa.hOV = ((int)ch.CL());
    localaa.hPs = this.cMM.kt();
    localaa.hPq = com.tencent.mm.model.x.pG();
    localaa.ewb = localb.type;
    localaa.hPr = localb.sdkVer;
    localaa.hPv = localb.dRa;
    int j;
    int i;
    if (!ch.jb(this.cMM.kp()))
    {
      BitmapFactory.Options localOptions = i.wS(ap.yg().gR(this.cMM.kp()));
      if (localOptions != null)
      {
        j = localOptions.outWidth;
        i = localOptions.outHeight;
      }
    }
    while (true)
    {
      boolean bool = this.haL;
      String str = null;
      if (bool)
        str = "@cdn_" + this.hvq.field_fileId + "_" + this.hvq.field_aesKey + "_1";
      localaa.fxG = com.tencent.mm.ai.b.a(localb, str, this.hvq, j, i);
      localxm.irD = localaa;
      return a(paramr, this.dmI, this);
      i = 0;
      j = 0;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    arrayOfObject[2] = Long.valueOf(this.cDM);
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oorccTbCkvSCcPrllGIJObxw==", "cdntra onGYNetEnd [%d,%d] msgId:%d", arrayOfObject);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.cMM.setStatus(5);
      bg.qW().oV().a(this.cMM.kk(), this.cMM);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oorccTbCkvSCcPrllGIJObxw==", "send app msg failed, err=" + paramInt2 + "," + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      this.hvr.I(paramInt2, paramInt3);
      return;
    }
    xn localxn = (xn)((a)paramaj).sP();
    this.cMM.setStatus(2);
    this.cMM.p(localxn.hOY);
    bg.qW().oV().a(this.cMM.kk(), this.cMM);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
    this.hvr.I(paramInt2, paramInt3);
  }

  public final int getType()
  {
    return 222;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.as
 * JD-Core Version:    0.6.2
 */