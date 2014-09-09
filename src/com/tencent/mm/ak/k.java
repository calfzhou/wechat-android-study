package com.tencent.mm.ak;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.bm;
import com.tencent.mm.o.aa;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a.ads;
import com.tencent.mm.protocal.a.adt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.o;
import junit.framework.Assert;

public final class k extends com.tencent.mm.o.x
  implements ab
{
  private keep_SceneResult dFQ = null;
  private l dFR = null;
  private com.tencent.mm.o.m dlH;
  private com.tencent.mm.o.a dmI;
  private String rI = null;

  public k(String paramString, keep_SceneResult paramkeep_SceneResult, l paraml)
  {
    if (paramString != null);
    for (boolean bool1 = true; ; bool1 = false)
    {
      Assert.assertTrue(bool1);
      boolean bool2 = false;
      if (paramkeep_SceneResult != null)
        bool2 = true;
      Assert.assertTrue(bool2);
      Assert.assertTrue(true);
      this.rI = paramString;
      this.dFQ = paramkeep_SceneResult;
      this.dFR = paraml;
      return;
    }
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(com.tencent.mm.network.r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    q localq = v.ij(this.rI);
    if (localq == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "Get info Failed file:" + this.rI);
      this.dFR.I(3, -1);
    }
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new ads());
    localb.b(new adt());
    localb.fi("/cgi-bin/micromsg-bin/uploadvideo");
    localb.de(149);
    localb.df(39);
    localb.dg(1000000039);
    this.dmI = localb.sU();
    ads localads = (ads)this.dmI.sO();
    localads.iwD = 0;
    localads.iwC = this.dFQ.field_fileLength;
    localads.iwE = new ws().cl(new byte[0]);
    localads.ihw = 0;
    localads.ihv = this.dFQ.field_thumbimgLength;
    localads.ihx = new ws().cl(new byte[0]);
    localads.hPq = com.tencent.mm.model.x.pG();
    localads.hPs = this.dFQ.field_toUser;
    localads.hPt = this.rI;
    if (localq.AX() == 1)
      localads.iwG = 2;
    if (localq.CP() == 3)
      localads.iwG = 3;
    localads.iwF = localq.AU();
    int i;
    String str;
    label396: Object[] arrayOfObject;
    if (bm.ab(ak.getContext()))
    {
      i = 1;
      localads.hVF = i;
      localads.ihy = 2;
      localads.iwy = this.dFQ.field_thumbimgLength;
      localads.iwH = this.dFQ.field_fileId;
      localads.iwI = this.dFQ.field_fileId;
      localads.hQm = 1;
      localads.hXp = this.dFQ.field_aesKey;
      str = m.AL().ic(this.rI);
      BitmapFactory.Options localOptions = com.tencent.mm.sdk.platformtools.i.wS(str);
      if (localOptions == null)
        break label534;
      localads.iwA = localOptions.outWidth;
      localads.iwz = localOptions.outHeight;
      arrayOfObject = new Object[8];
      arrayOfObject[0] = this.rI;
      arrayOfObject[1] = this.dFQ.field_toUser;
      if (this.dFQ.field_aesKey != null)
        break label554;
    }
    label534: label554: for (int j = -1; ; j = this.dFQ.field_aesKey.length())
    {
      arrayOfObject[2] = Integer.valueOf(j);
      arrayOfObject[3] = this.dFQ.field_fileId;
      arrayOfObject[4] = Integer.valueOf(this.dFQ.field_thumbimgLength);
      arrayOfObject[5] = Integer.valueOf(localads.iwA);
      arrayOfObject[6] = Integer.valueOf(localads.iwz);
      arrayOfObject[7] = Integer.valueOf(localads.iwG);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "cdntra doscene file:%s touser:%s aes:%d fileid:%s thumb:[%d %d %d], funcFlag: %d", arrayOfObject);
      return a(paramr, this.dmI, this);
      i = 2;
      break;
      com.tencent.mm.sdk.platformtools.z.w("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "cdntra getImageOptions for thumb failed path:%s", new Object[] { str });
      break label396;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3);
    adt localadt = (adt)((com.tencent.mm.o.a)paramaj).sP();
    q localq = v.ij(this.rI);
    if (localq == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "ERR: onGYNetEnd Get INFO FAILED :" + this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      this.dFR.I(3, -1);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "ERR: onGYNetEnd BLACK  errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.rI + " user:" + localq.getUser());
      v.ig(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      this.dFR.I(paramInt2, paramInt3);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0) && (paramInt3 != -13) && (paramInt3 != -6))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.rI + " user:" + localq.getUser());
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      this.dFR.I(paramInt2, paramInt3);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.rI + " user:" + localq.getUser());
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      this.dFR.I(paramInt2, paramInt3);
      return;
    }
    localq.V(ch.CL());
    localq.p(localadt.hOY);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Long.valueOf(localq.kl());
    arrayOfObject1[1] = Integer.valueOf(ao.dVZ);
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "dkmsgid  set svrmsgid %d -> %d", arrayOfObject1);
    if ((10007 == ao.dVY) && (ao.dVZ != 0) && (localq.kl() != 0L))
    {
      localq.p(ao.dVZ);
      ao.dVZ = 0;
    }
    localq.setStatus(199);
    localq.db(1284);
    v.d(localq);
    v.c(localq);
    String str = localq.getUser();
    com.tencent.mm.storage.i locali = bg.qW().oT().ys(str);
    boolean bool;
    if ((locali == null) || ((int)locali.dhv <= 0))
    {
      bool = false;
      if ((!bool) && (!y.du(localq.getUser())))
        break label746;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localq.getUser();
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "upload to biz :%s", arrayOfObject2);
      if (localq.kl() < 0L)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "ERR: finish video invaild MSGSVRID :" + localq.kl() + " file:" + this.rI + " toUser:" + localq.getUser());
        v.jdMethod_if(this.rI);
        this.dFR.I(3, -1);
      }
    }
    while (true)
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      this.dFR.I(0, 0);
      return;
      bool = locali.aIg();
      break;
      label746: com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "not upload to biz");
      if (localq.kl() <= 0L)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r8Cp9jW585kjQ3/3T1cYQDQ==", "ERR: finish video invaild MSGSVRID :" + localq.kl() + " file:" + this.rI + " toUser:" + localq.getUser());
        v.jdMethod_if(this.rI);
        this.dFR.I(3, -1);
      }
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
    v.jdMethod_if(this.rI);
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getType()
  {
    return 149;
  }

  protected final int sB()
  {
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.k
 * JD-Core Version:    0.6.2
 */