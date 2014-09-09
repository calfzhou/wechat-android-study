package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.adx;
import com.tencent.mm.protocal.a.ady;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ay;
import junit.framework.Assert;

public final class b extends com.tencent.mm.o.x
  implements ab
{
  private int cIm = 0;
  private int dGn = 0;
  private boolean dHb = false;
  private long dHg;
  private m dlH;
  private a dmI;
  ay dmV;
  private int endFlag = 0;
  private String rI;

  public b(String paramString)
  {
    this.dmV = new ay(new c(this), bool);
    if (paramString != null);
    while (true)
    {
      Assert.assertTrue(bool);
      com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "NetSceneUploadVoice:  file:" + paramString);
      this.rI = paramString;
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
    com.tencent.mm.sdk.platformtools.z.v("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "check : offset:" + localadx.hQd + " dataLen:" + localadx.hQi.aLK() + " endFlag:" + localadx.hQj);
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    this.dHb = false;
    if (this.rI == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "doScene:  filename null!");
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    String str = this.rI;
    n localn = f.arG().tk(str);
    if ((localn == null) || (!localn.BK()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "Get info Failed file:" + this.rI);
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "doScene file:" + this.rI + " netTimes:" + localn.field_nettimes);
    if (!o.iv(this.rI))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "checkVoiceNetTimes Failed file:" + this.rI);
      o.jdMethod_if(this.rI);
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    e locale1 = new e();
    Object localObject;
    int i;
    int j;
    if (localn.field_status == 8)
    {
      com.tencent.mm.sdk.platformtools.z.v("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", this.rI + " cancelFlag = 1");
      this.endFlag = 1;
      o.in(localn.field_filename);
      localObject = locale1;
      i = 1;
      j = localn.field_voicelenght;
      if (j != 0)
        break label1511;
    }
    label1511: for (int k = 20 * ((-6 + this.dGn) / 32); ; k = j)
    {
      com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "info.getMsgSvrId() " + localn.field_msgid);
      com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
      localb.a(new adx());
      localb.b(new ady());
      localb.fi("/cgi-bin/micromsg-bin/uploadvoicerecognize");
      localb.de(329);
      localb.df(157);
      localb.dg(1000000157);
      this.dmI = localb.sU();
      adx localadx = (adx)this.dmI.sO();
      localadx.hPq = com.tencent.mm.model.x.pG();
      localadx.hPs = localn.field_user;
      localadx.hQd = localn.field_offset;
      localadx.hPt = localn.field_clientid;
      localadx.hVH = k;
      localadx.hQj = this.endFlag;
      localadx.hOY = localn.field_msgid;
      localadx.hQf = i;
      localadx.iwK = ((int)(localn.field_createtime / 1000L));
      localadx.ihE = 1;
      if (i != 1)
        localadx.hQi = new ws().o(((e)localObject).buf, ((e)localObject).ddA);
      for (localadx.hQh = ((e)localObject).ddA; ; localadx.hQh = 1)
      {
        com.tencent.mm.sdk.platformtools.z.v("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "cancelFlag:" + i + " endFlag:" + this.endFlag + " svrId:" + localn.field_msgid);
        com.tencent.mm.sdk.platformtools.z.v("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "doscene msgId:" + localadx.hOY + " user:" + localadx.hPs + " offset:" + localadx.hQd + " dataLen:" + localadx.hQi.aLK() + " endFlag:" + localadx.hQj);
        com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "doScene MsgId:" + localn.field_msgid + " file:" + this.rI + " readBytes:" + ((e)localObject).ddA + " neTTTOff:" + localn.field_offset + " neWWWOff:" + this.dGn + " endFlag:" + this.endFlag + " cancelFlag:" + i + " status:" + localn.field_status);
        com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "tiger log " + localadx.toString());
        this.dHg = System.currentTimeMillis();
        return a(paramr, this.dmI, this);
        if (localn.field_status == 3)
          this.dHb = true;
        d locald = o.th(this.rI);
        if (locald == null)
        {
          this.cIm = (10000 + k.nJ());
          return -1;
        }
        e locale2 = locald.lo(localn.field_offset);
        com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "doScene READ file[" + this.rI + "] read ret:" + locale2.ret + " readlen:" + locale2.ddA + " newOff:" + locale2.dGn + " netOff:" + localn.field_offset + " line:" + k.nJ());
        if (locale2.ret < 0)
        {
          com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "Err doScene READ file[" + this.rI + "] read ret:" + locale2.ret + " readlen:" + locale2.ddA + " newOff:" + locale2.dGn + " netOff:" + localn.field_offset);
          o.jdMethod_if(this.rI);
          this.cIm = (10000 + k.nJ());
          return -1;
        }
        this.dGn = locale2.dGn;
        if ((this.dGn < localn.field_offset) || (this.dGn >= 469000))
        {
          com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "Err doScene READ file[" + this.rI + "] newOff:" + this.dGn + " OldtOff:" + localn.field_offset);
          o.jdMethod_if(this.rI);
          this.cIm = (10000 + k.nJ());
          return -1;
        }
        this.endFlag = 0;
        if ((locale2.ddA == 0) && (!this.dHb))
        {
          com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "doScene:  file:" + this.rI + " No Data temperature , will be retry");
          o.jdMethod_if(this.rI);
          this.cIm = (10000 + k.nJ());
          return -1;
        }
        if (this.dHb)
        {
          if (localn.field_totallen <= 0)
          {
            com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "Err doScene READ file[" + this.rI + "] read totalLen:" + localn.field_totallen);
            o.jdMethod_if(this.rI);
            this.cIm = (10000 + k.nJ());
            return -1;
          }
          if ((localn.field_totallen > this.dGn) && (locale2.ddA < 6000))
          {
            com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "Err doScene READ file[" + this.rI + "] readlen:" + locale2.ddA + " newOff:" + locale2.dGn + " netOff:" + localn.field_offset + " totalLen:" + localn.field_totallen);
            o.jdMethod_if(this.rI);
            this.cIm = (10000 + k.nJ());
            return -1;
          }
          if (localn.field_totallen <= this.dGn)
            this.endFlag = 1;
        }
        localObject = locale2;
        i = 0;
        break;
        localadx.hQi = new ws().a(com.tencent.mm.ao.b.aO(new byte[1]));
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "onGYNetEnd file:" + this.rI + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    adx localadx = (adx)((a)paramaj).sO();
    ady localady = (ady)((a)paramaj).sP();
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "tiger log resp " + localady.toString());
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      o.ig(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0) && (paramInt3 != -13) && (paramInt3 != -6))
    {
      o.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "onGYNetEnd file:" + this.rI + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "onGYNetEnd msgId:" + localady.hOY + " toUser:" + localadx.hPs);
    int i = o.a(this.rI, this.dGn, localady.hOY, localady.hPt, this.endFlag);
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "onGYNetEnd updateAfterSend:" + i + " file:" + this.rI + " MsgSvrId:" + localady.hOY + " clientId:" + localady.hPt + " neWWOff:" + this.dGn + " neTTTT:" + localady.hQh);
    if (i < 0)
    {
      o.jdMethod_if(this.rI);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "onGYNetEnd file:" + this.rI + "UpdateAfterSend Ret:" + i);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (i == 1)
    {
      com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "onGYNetEnd finish file:" + this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.dHb);
    for (long l = 0L; ; l = 500L)
    {
      com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/r/2Z+j4Ej/7tJbYtqZLhpzw==", "onGYNetEnd file:" + this.rI + " delay:" + l);
      this.dmV.cP(l);
      return;
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
    o.jdMethod_if(this.rI);
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getType()
  {
    return 329;
  }

  protected final int sB()
  {
    return 240;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.b
 * JD-Core Version:    0.6.2
 */