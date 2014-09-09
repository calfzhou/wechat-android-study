package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.acx;
import com.tencent.mm.protocal.a.acy;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ap;

public final class av extends com.tencent.mm.o.x
  implements ab
{
  private int cIm = 0;
  private String dQZ = null;
  private m dlH;
  private com.tencent.mm.o.a dmI;
  private String dyk = "";
  private o dyq = new aw(this);
  private long gii = -1L;
  private a huY = null;
  private boolean hvs = true;
  private long hvt = -1L;
  private long startTime = 0L;

  private av(long paramLong)
  {
    this.gii = paramLong;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new acx());
    localb.b(new acy());
    localb.fi("/cgi-bin/micromsg-bin/uploadappattach");
    localb.de(220);
    localb.df(105);
    localb.dg(1000000105);
    this.dmI = localb.sU();
  }

  public av(long paramLong, String paramString)
  {
    this(paramLong);
    this.dQZ = paramString;
  }

  public final int AJ()
  {
    return this.cIm;
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    this.huY = new a();
    if ((!bf.GP().b(this.gii, this.huY)) || (this.huY == null))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", com.tencent.mm.compatible.g.k.nL() + " get info failed rowid:" + this.gii);
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      this.huY = null;
      return -1;
    }
    if (this.huY.field_status != 101L)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", com.tencent.mm.compatible.g.k.nL() + " get field_status failed rowid:" + this.gii + " status:" + this.huY.field_status);
      return -1;
    }
    if (this.startTime == 0L)
    {
      this.startTime = ch.CM();
      this.hvt = this.huY.field_offset;
    }
    int i;
    if ((this.huY.field_type == 8L) || (this.huY.field_type == 9L))
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(this.huY.field_type);
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra cdn not support Emoji or voiceremind now type:%d", arrayOfObject1);
      i = 0;
    }
    while (i != 0)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(this.gii);
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra use cdn return -1 for onGYNetEnd clientid:%d", arrayOfObject2);
      return 0;
      com.tencent.mm.modelcdntran.k.vl();
      if ((!com.tencent.mm.modelcdntran.c.vf()) && (this.huY.field_isUseCdn != 1))
      {
        Object[] arrayOfObject7 = new Object[2];
        com.tencent.mm.modelcdntran.k.vl();
        arrayOfObject7[0] = Boolean.valueOf(com.tencent.mm.modelcdntran.c.vf());
        arrayOfObject7[1] = Integer.valueOf(this.huY.field_isUseCdn);
        z.w("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra not use cdn flag:%b getCdnInfo:%d", arrayOfObject7);
        i = 0;
      }
      else
      {
        ar localar = bg.qW().oV().cV(this.huY.field_msgInfoId);
        if (localar.kk() != this.huY.field_msgInfoId)
        {
          Object[] arrayOfObject6 = new Object[1];
          arrayOfObject6[0] = Long.valueOf(this.huY.field_msgInfoId);
          z.w("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra read msg info failed msgId:%d", arrayOfObject6);
          i = 0;
        }
        else
        {
          String str1 = "";
          if (!ch.jb(localar.kp()))
            str1 = ap.yg().gR(localar.kp());
          int j = com.tencent.mm.a.c.ab(str1);
          int k = com.tencent.mm.a.c.ab(this.huY.field_fileFullPath);
          if (j >= CdnTransportEngine.drH)
          {
            Object[] arrayOfObject5 = new Object[2];
            arrayOfObject5[0] = str1;
            arrayOfObject5[1] = Integer.valueOf(j);
            z.w("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", arrayOfObject5);
            i = 0;
          }
          else
          {
            this.dyk = i.a("upattach", this.huY.field_createTime, localar.kt(), this.gii);
            if (ch.jb(this.dyk))
            {
              Object[] arrayOfObject4 = new Object[1];
              arrayOfObject4[0] = Long.valueOf(this.gii);
              z.w("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra genClientId failed not use cdn rowid:%d", arrayOfObject4);
              i = 0;
            }
            else
            {
              Object[] arrayOfObject3 = new Object[5];
              arrayOfObject3[0] = Long.valueOf(this.huY.field_msgInfoId);
              arrayOfObject3[1] = this.huY.field_fileFullPath;
              arrayOfObject3[2] = Integer.valueOf(k);
              arrayOfObject3[3] = str1;
              arrayOfObject3[4] = Integer.valueOf(j);
              z.d("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra checkUseCdn id:%d file[%s][%d] thumb[%s][%d]", arrayOfObject3);
              com.tencent.mm.modelcdntran.n localn = new com.tencent.mm.modelcdntran.n();
              localn.dsw = this.dyq;
              localn.field_mediaId = this.dyk;
              localn.field_fullpath = this.huY.field_fileFullPath;
              localn.field_thumbpath = str1;
              localn.field_fileType = CdnTransportEngine.drA;
              localn.field_talker = localar.kt();
              localn.field_priority = CdnTransportEngine.dru;
              localn.field_needStorage = false;
              localn.field_isStreamMedia = false;
              localn.dsw = this.dyq;
              String str2 = localar.getContent();
              if (y.dc(localar.kt()))
              {
                int m = bw.ek(localar.getContent());
                if (m != -1)
                  str2 = (localar.getContent() + " ").substring(m + 2).trim();
              }
              com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(ch.xw(str2));
              if (localb != null)
              {
                localn.field_fileId = localb.dRd;
                localn.field_aesKey = localb.dRi;
              }
              while (true)
              {
                if (com.tencent.mm.modelcdntran.k.vl().b(localn))
                  break label891;
                z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra addSendTask failed.");
                this.dyk = "";
                i = 0;
                break;
                z.i("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra parse content xml failed");
              }
              label891: if (this.huY.field_isUseCdn != 1)
              {
                this.huY.field_isUseCdn = 1;
                boolean bool = bf.GP().a(this.huY, new String[0]);
                if (!bool)
                {
                  z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "checkUseCdn update info ret:" + bool);
                  this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
                  this.dlH.a(3, -1, "", this);
                  i = 0;
                }
              }
              else
              {
                i = 1;
              }
            }
          }
        }
      }
    }
    if (this.huY.field_netTimes > 1350L)
    {
      s.cq(this.huY.iGx);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", com.tencent.mm.compatible.g.k.nL() + " info.field_netTimes > DOSCENE_LIMIT SET ERROR! rowid:" + this.gii);
      return -1;
    }
    a locala = this.huY;
    locala.field_netTimes = (1L + locala.field_netTimes);
    if (ch.jb(this.huY.field_appId))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "checkArgs : appId is null");
      if (this.huY.field_type != 8L)
      {
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        return -1;
      }
    }
    if (ch.jb(this.huY.field_clientAppDataId))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "checkArgs : clientAppDataId is null");
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    if ((this.huY.field_totalLen <= 0L) || (this.huY.field_totalLen > 11059200L))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "checkArgs : totalLen is invalid, totalLen = " + this.huY.field_totalLen);
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    if (ch.jb(this.huY.field_fileFullPath))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "checkArgs : fileFullPath is null");
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    if (com.tencent.mm.a.c.ab(this.huY.field_fileFullPath) > 10485760)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "doScene : file is too large");
      return -1;
    }
    byte[] arrayOfByte = com.tencent.mm.a.c.b(this.huY.field_fileFullPath, (int)this.huY.field_offset, 8192);
    if (ch.B(arrayOfByte))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "doScene : data is null");
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    acx localacx = (acx)this.dmI.sO();
    localacx.hOd = this.huY.field_appId;
    localacx.hPr = ((int)this.huY.field_sdkVer);
    localacx.iwd = this.huY.field_clientAppDataId;
    localacx.ewb = ((int)this.huY.field_type);
    localacx.gnq = com.tencent.mm.model.x.pG();
    localacx.hQk = ((int)this.huY.field_totalLen);
    localacx.hUu = ((int)this.huY.field_offset);
    if ((this.dQZ != null) && (this.hvs))
    {
      localacx.hVM = this.dQZ;
      localacx.hQk = ((int)this.huY.field_totalLen);
      localacx.hQs = 0;
      localacx.hQi = new ws().cl(new byte[0]);
      this.hvs = false;
      return a(paramr, this.dmI, this);
    }
    localacx.hQs = arrayOfByte.length;
    localacx.hQi = new ws().cl(arrayOfByte);
    if (this.dQZ != null)
      localacx.hVM = this.dQZ;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!ch.jb(this.dyk)))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.dyk;
      z.w("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", arrayOfObject3);
    }
    label670: 
    do
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        if (paramInt2 == 4)
        {
          com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject1 = new Object[7];
          arrayOfObject1[0] = Integer.valueOf(paramInt3);
          arrayOfObject1[1] = Integer.valueOf(1);
          arrayOfObject1[2] = Long.valueOf(this.startTime);
          arrayOfObject1[3] = Long.valueOf(ch.CM());
          arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
          arrayOfObject1[5] = Integer.valueOf(CdnTransportEngine.drA);
          arrayOfObject1[6] = Long.valueOf(this.huY.field_totalLen - this.hvt);
          localn1.d(10420, arrayOfObject1);
        }
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      acy localacy = (acy)((com.tencent.mm.o.a)paramaj).sP();
      if ((localacy.hOd != null) && (this.dQZ == null) && ((!localacy.hOd.equals(this.huY.field_appId)) || (!localacy.iwd.equals(this.huY.field_clientAppDataId))))
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "argument is not consistent");
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      if ((localacy.hQk < 0) || (localacy.hQk != this.huY.field_totalLen) || (localacy.hUu < 0) || (localacy.hUu > this.huY.field_totalLen))
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "dataLen, startPos or totalLen is incorrect");
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      this.huY.field_offset = localacy.hUu;
      a locala = this.huY;
      if (s.va(localacy.hQq));
      for (String str = localacy.hQq; ; str = "")
      {
        locala.field_mediaSvrId = str;
        if (this.huY.field_offset != this.huY.field_totalLen)
          break label670;
        if (!ch.jb(this.huY.field_mediaSvrId))
          break;
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "finish upload but mediaid == null!");
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        s.cq(this.huY.iGx);
        return;
      }
      this.huY.field_status = 199L;
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[7];
      arrayOfObject2[0] = Integer.valueOf(0);
      arrayOfObject2[1] = Integer.valueOf(1);
      arrayOfObject2[2] = Long.valueOf(this.startTime);
      arrayOfObject2[3] = Long.valueOf(ch.CM());
      arrayOfObject2[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject2[5] = Integer.valueOf(CdnTransportEngine.drA);
      arrayOfObject2[6] = Long.valueOf(this.huY.field_totalLen - this.hvt);
      localn2.d(10420, arrayOfObject2);
      boolean bool = bf.GP().a(this.huY, new String[0]);
      if (!bool)
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "onGYNetEnd update info ret:" + bool);
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      if (this.huY.field_status == 199L)
      {
        this.dlH.a(0, 0, "", this);
        return;
      }
    }
    while (a(tp(), this.dlH) >= 0);
    z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "onGYNetEnd : doScene fail");
    this.dlH.a(3, -1, "", this);
  }

  public final long ayM()
  {
    return this.gii;
  }

  public final boolean ayX()
  {
    return !ch.jb(this.dyk);
  }

  public final int getType()
  {
    return 220;
  }

  public final String lj()
  {
    if (this.huY == null)
      return null;
    return this.huY.field_mediaSvrId;
  }

  protected final int sB()
  {
    return 1350;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.av
 * JD-Core Version:    0.6.2
 */