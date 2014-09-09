package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a.adx;
import com.tencent.mm.protocal.a.ady;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.i;
import junit.framework.Assert;

public final class w extends com.tencent.mm.o.x
  implements ab
{
  private int cIm = 0;
  private int dGn = 0;
  private boolean dHb = false;
  private int dHf;
  private long dHg;
  private m dlH;
  private a dmI;
  ay dmV;
  private int endFlag = 0;
  private String rI;

  public w(String paramString)
  {
    this(paramString, 0);
  }

  public w(String paramString, int paramInt)
  {
    this.dmV = new ay(new x(this), bool);
    if (paramString != null);
    while (true)
    {
      Assert.assertTrue(bool);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "NetSceneUploadVoice:  file:" + paramString);
      this.rI = paramString;
      this.dHf = paramInt;
      return;
      bool = false;
    }
  }

  public final int AJ()
  {
    return this.cIm;
  }

  protected final int a(aj paramaj)
  {
    adx localadx = (adx)((a)paramaj).sO();
    com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "check msgId:" + localadx.hOY + " offset:" + localadx.hQd + " dataLen:" + localadx.hQi.aLK() + " endFlag:" + localadx.hQj);
    if (((localadx.hOY == 0L) && (localadx.hQd != 0)) || (((localadx.hQi == null) || (localadx.hQi.aLK() == 0)) && (localadx.hQj != 1) && (localadx.hQf != 1)))
      return aa.doN;
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    this.dHb = false;
    if (this.rI == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "doScene:  filename null!");
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    String str = this.rI;
    br localbr = bm.BD().iG(str);
    if ((localbr == null) || (!localbr.BK()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "Get info Failed file:" + this.rI);
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "doScene file:" + this.rI + " netTimes:" + localbr.AW());
    if (!bs.iv(this.rI))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "checkVoiceNetTimes Failed file:" + this.rI);
      bs.jdMethod_if(this.rI);
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    y localy1 = new y();
    int j;
    Object localObject;
    int i;
    int k;
    if (localbr.getStatus() == 8)
    {
      com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", this.rI + " cancelFlag = 1");
      this.endFlag = 0;
      bs.in(localbr.getFileName());
      j = 1;
      localObject = localy1;
      i = 0;
      k = localbr.BM();
      if (k != 0)
        break label1527;
    }
    label1527: for (int m = 20 * ((-6 + this.dGn) / 32); ; m = k)
    {
      com.tencent.mm.o.b localb1 = new com.tencent.mm.o.b();
      localb1.a(new adx());
      localb1.b(new ady());
      localb1.fi("/cgi-bin/micromsg-bin/uploadvoice");
      localb1.de(127);
      localb1.df(19);
      localb1.dg(1000000019);
      this.dmI = localb1.sU();
      adx localadx = (adx)this.dmI.sO();
      localadx.hPq = com.tencent.mm.model.x.pG();
      localadx.hPs = localbr.getUser();
      localadx.hQd = localbr.AO();
      localadx.hPt = localbr.BN();
      localadx.hVH = m;
      localadx.hQj = this.endFlag;
      localadx.hOY = localbr.kl();
      localadx.hQf = j;
      localadx.iwL = this.dHf;
      localadx.hOW = com.tencent.mm.model.ch.rx();
      localadx.ihE = i;
      if (j != 1)
        localadx.hQi = new ws().o(((y)localObject).buf, ((y)localObject).ddA);
      for (localadx.hQh = ((y)localObject).ddA; ; localadx.hQh = 1)
      {
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "cancelFlag:" + j + " endFlag:" + this.endFlag + " svrId:" + localbr.kl());
        com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "doscene msgId:" + localadx.hOY + " user:" + localadx.hPs + " offset:" + localadx.hQd + " dataLen:" + localadx.hQi.aLK() + " endFlag:" + localadx.hQj);
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "doScene MsgId:" + localbr.kl() + " voiceFormat:" + i + " file:" + this.rI + " readBytes:" + ((y)localObject).ddA + " neTTTOff:" + localbr.AO() + " neWWWOff:" + this.dGn + " endFlag:" + this.endFlag + " cancelFlag:" + j + " status:" + localbr.getStatus());
        this.dHg = System.currentTimeMillis();
        return a(paramr, this.dmI, this);
        if (localbr.getStatus() == 3)
          this.dHb = true;
        b localb = bs.iw(this.rI);
        if (localb == null)
        {
          this.cIm = (10000 + k.nJ());
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.rI;
          com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "doScene: fileOp is null, fileName:%s", arrayOfObject);
          return -1;
        }
        i = localb.getFormat();
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "format " + i);
        y localy2 = localb.J(localbr.AO(), 6000);
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "doScene READ file[" + this.rI + "] read ret:" + localy2.ret + " readlen:" + localy2.ddA + " newOff:" + localy2.dGn + " netOff:" + localbr.AO() + " line:" + k.nJ());
        if (localy2.ret < 0)
        {
          com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "Err doScene READ file[" + this.rI + "] read ret:" + localy2.ret + " readlen:" + localy2.ddA + " newOff:" + localy2.dGn + " netOff:" + localbr.AO());
          bs.jdMethod_if(this.rI);
          this.cIm = (10000 + k.nJ());
          return -1;
        }
        this.dGn = localy2.dGn;
        if ((this.dGn < localbr.AO()) || (this.dGn >= 469000))
        {
          com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "Err doScene READ file[" + this.rI + "] newOff:" + this.dGn + " OldtOff:" + localbr.AO());
          bs.jdMethod_if(this.rI);
          this.cIm = (10000 + k.nJ());
          return -1;
        }
        this.endFlag = 0;
        if ((localy2.ddA == 0) && (!this.dHb))
        {
          com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "doScene:  file:" + this.rI + " No Data temperature , will be retry");
          this.cIm = (10000 + k.nJ());
          return -1;
        }
        if (this.dHb)
        {
          if (localbr.sp() <= 0)
          {
            com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "Err doScene READ file[" + this.rI + "] read totalLen:" + localbr.sp());
            bs.jdMethod_if(this.rI);
            this.cIm = (10000 + k.nJ());
            return -1;
          }
          if ((localbr.sp() > this.dGn) && (localy2.ddA < 6000))
          {
            com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "Err doScene READ file[" + this.rI + "] readlen:" + localy2.ddA + " newOff:" + localy2.dGn + " netOff:" + localbr.AO() + " totalLen:" + localbr.sp());
            bs.jdMethod_if(this.rI);
            this.cIm = (10000 + k.nJ());
            return -1;
          }
          if (localbr.sp() <= this.dGn)
            this.endFlag = 1;
        }
        localObject = localy2;
        j = 0;
        break;
        localadx.hQi = new ws().a(com.tencent.mm.ao.b.aO(new byte[1]));
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "onGYNetEnd file:" + this.rI + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    adx localadx = (adx)((a)paramaj).sO();
    ady localady = (ady)((a)paramaj).sP();
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      String str3 = this.rI;
      br localbr2 = bm.BD().iG(str3);
      if (localbr2 != null)
      {
        if (localbr2.getStatus() == 3)
        {
          ar localar2 = bg.qW().oV().cV(localbr2.AV());
          localar2.setContent(bp.a(localbr2.AN(), localbr2.BM(), false));
          localar2.setStatus(2);
          bg.qW().oV().a(localbr2.AV(), localar2);
        }
        localbr2.setStatus(97);
        localbr2.V(System.currentTimeMillis() / 1000L);
        localbr2.db(320);
        bs.b(localbr2);
      }
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0) && (paramInt3 != -13) && (paramInt3 != -6))
    {
      bs.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "onGYNetEnd file:" + this.rI + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "onGYNetEnd msgId:" + localady.hOY + " toUser:" + localadx.hPs);
    if ((localady.hOY <= 0L) && (!i.yc(localadx.hPs)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "onGYNetEnd file:" + this.rI + " getMsgId:" + localady.hOY + " netoff:" + localady.hQd);
      bs.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(localady.hOY);
    arrayOfObject[1] = Integer.valueOf(ao.dVZ);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "dkmsgid  set svrmsgid %d -> %d", arrayOfObject);
    if ((10007 == ao.dVY) && (ao.dVZ != 0))
    {
      localady.hOY = ao.dVZ;
      ao.dVZ = 0;
    }
    String str1 = this.rI;
    int i = this.dGn;
    long l1 = localady.hOY;
    String str2 = localady.hPt;
    int j = this.endFlag;
    int k = this.dHf;
    int n;
    if (str1 == null)
      n = -1;
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "dkmsgid onGYNetEnd updateAfterSend:" + n + " file:" + this.rI + " MsgSvrId:" + localady.hOY + " clientId:" + localady.hPt + " neWWOff:" + this.dGn + " neTTTT:" + localady.hQh + " forwardflag:" + this.dHf);
      if (n >= 0)
        break;
      bs.jdMethod_if(this.rI);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "onGYNetEnd file:" + this.rI + "UpdateAfterSend Ret:" + n);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "dkmsgid UpdateAfterSend file:[" + str1 + "] newOff:" + i + " SvrID:" + l1 + " clientID:" + str2 + " hasSendEndFlag " + j);
      br localbr1 = bm.BD().iG(str1);
      if (localbr1 == null)
      {
        n = -1;
      }
      else
      {
        localbr1.eF(i);
        localbr1.V(System.currentTimeMillis() / 1000L);
        localbr1.db(264);
        if ((com.tencent.mm.sdk.platformtools.ch.jb(localbr1.BN())) && (str2 != null))
        {
          localbr1.it(str2);
          localbr1.db(0x200 | localbr1.ss());
        }
        if ((localbr1.kl() == 0L) && (l1 != 0L))
        {
          localbr1.p(l1);
          localbr1.db(0x4 | localbr1.ss());
        }
        int m = localbr1.sp();
        n = 0;
        if (m <= i)
        {
          int i1 = localbr1.getStatus();
          n = 0;
          if (i1 == 3)
          {
            n = 0;
            if (j == 1)
            {
              localbr1.setStatus(99);
              localbr1.db(0x40 | localbr1.ss());
              ar localar1 = new ar();
              localar1.bJ(localbr1.getUser());
              localar1.p(localbr1.kl());
              localar1.setStatus(2);
              localar1.setContent(bp.a(localbr1.AN(), localbr1.BM(), false));
              localar1.ok(k);
              bg.qW().oV().a(localbr1.AV(), localar1);
              com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ8Slstt+7LKuK5M7+Z4yd6", "END!!! updateSend  file:" + str1 + " total:" + localbr1.sp() + " status:" + localbr1.getStatus() + " netTimes:" + localbr1.AW());
              n = 1;
              bm.BD().iD(str1);
            }
          }
        }
        if (!bs.b(localbr1))
          n = -4;
      }
    }
    if (n == 1)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "onGYNetEnd finish file:" + this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.dHb);
    for (long l2 = 0L; ; l2 = 500L)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "onGYNetEnd file:" + this.rI + " delay:" + l2);
      this.dmV.cP(l2);
      return;
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
    bs.jdMethod_if(this.rI);
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getType()
  {
    return 127;
  }

  protected final int sB()
  {
    return 60;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.w
 * JD-Core Version:    0.6.2
 */