package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.ft;
import com.tencent.mm.protocal.a.fu;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;

public final class ae extends com.tencent.mm.o.x
  implements ab
{
  private long cDM = 0L;
  private int cIm = 0;
  private ar cMM = null;
  private m dlH;
  private com.tencent.mm.o.a dmI;
  private com.tencent.mm.o.n dyf;
  private String dyk = "";
  private o dyq = new af(this);
  private long gii = -1L;
  private a huY = null;
  private int huZ = -1;
  private String hva = "";
  private boolean hvb = false;
  private boolean hvc = false;
  private String mediaId = "";
  private long startTime = 0L;
  private int type = 0;

  public ae(long paramLong, String paramString, com.tencent.mm.o.n paramn)
  {
    this(paramString, paramn, 0);
    this.cDM = paramLong;
  }

  public ae(a parama)
  {
    this.huY = parama;
    this.hvb = true;
    this.mediaId = this.huY.field_mediaId;
    this.dyf = null;
    this.type = 0;
    if (parama == null)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "<init>, info is null, mediaId = " + this.mediaId);
      return;
    }
    int i = com.tencent.mm.a.c.ab(parama.field_fileFullPath);
    if (i != parama.field_offset)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "<init> : fileFullPath is invalid, fileLength = " + i + ", info.field_offset = " + parama.field_offset);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "<init> : reset file and appattachinfo");
      com.tencent.mm.a.c.deleteFile(parama.field_fileFullPath);
      parama.field_offset = 0L;
      parama.field_status = 101L;
    }
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new ft());
    localb.b(new fu());
    localb.fi("/cgi-bin/micromsg-bin/downloadappattach");
    localb.de(221);
    localb.df(106);
    localb.dg(1000000106);
    this.dmI = localb.sU();
  }

  public ae(String paramString)
  {
    this(paramString, null, 0);
  }

  public ae(String paramString, com.tencent.mm.o.n paramn, int paramInt)
  {
    this.mediaId = paramString;
    this.dyf = paramn;
    this.type = paramInt;
    this.huY = bf.GP().uU(paramString);
    if (this.huY == null)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "<init>, info is null, mediaId = " + paramString);
      return;
    }
    int i = com.tencent.mm.a.c.ab(this.huY.field_fileFullPath);
    if (i != this.huY.field_offset)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "<init> : fileFullPath is invalid, fileLength = " + i + ", info.field_offset = " + this.huY.field_offset);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "<init> : reset file and appattachinfo");
      com.tencent.mm.a.c.deleteFile(this.huY.field_fileFullPath);
      this.huY.field_offset = 0L;
      this.huY.field_status = 101L;
      bf.GP().a(this.huY, new String[0]);
    }
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new ft());
    localb.b(new fu());
    localb.fi("/cgi-bin/micromsg-bin/downloadappattach");
    localb.de(221);
    localb.df(106);
    localb.dg(1000000106);
    this.dmI = localb.sU();
  }

  public final int AJ()
  {
    return this.cIm;
  }

  protected final int a(com.tencent.mm.network.aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    if (this.huY == null)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", com.tencent.mm.compatible.g.k.nL() + " get info failed mediaId:" + this.mediaId);
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    this.cMM = bg.qW().oV().cV(this.cDM);
    if ((this.cMM == null) || (this.cMM.kk() != this.cDM))
    {
      String str1 = com.tencent.mm.compatible.g.k.nL() + " get msginfo failed mediaId:%s  msgId:%d";
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = this.mediaId;
      arrayOfObject1[1] = Long.valueOf(this.cDM);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", str1, arrayOfObject1);
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    if (this.startTime == 0L)
    {
      this.startTime = ch.CM();
      this.huZ = ((int)this.huY.field_offset);
    }
    String str2 = this.cMM.getContent();
    if (y.dc(this.cMM.kt()))
    {
      int k = bw.ek(this.cMM.getContent());
      if (k != -1)
        str2 = (this.cMM.getContent() + " ").substring(k + 2).trim();
    }
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(ch.xw(str2));
    int i;
    if (localb == null)
    {
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[0] = this.mediaId;
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra parse content xml failed: mediaId:%s", arrayOfObject7);
      i = 0;
    }
    while (i != 0)
    {
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = this.mediaId;
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra use cdn return -1 for onGYNetEnd mediaid:%s", arrayOfObject5);
      return 0;
      Object[] arrayOfObject2 = new Object[5];
      arrayOfObject2[0] = Long.valueOf(this.cDM);
      arrayOfObject2[1] = Long.valueOf(this.huY.field_totalLen);
      arrayOfObject2[2] = this.huY.field_fileFullPath;
      arrayOfObject2[3] = localb.dRd;
      arrayOfObject2[4] = localb.dRi;
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra checkUseCdn msgid:%d total:%d fullpath:%s fileid:%s aes:%s ", arrayOfObject2);
      if ((ch.jb(localb.dRd)) || (ch.jb(localb.dRi)))
      {
        Object[] arrayOfObject3 = new Object[3];
        arrayOfObject3[0] = Long.valueOf(this.cDM);
        arrayOfObject3[1] = localb.dRd;
        arrayOfObject3[2] = localb.dRi;
        z.w("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra checkUseCdn msgId:%d Not use CDN  fileid:%s aes:%s ", arrayOfObject3);
        i = 0;
      }
      else
      {
        this.dyk = i.a("downattach", this.huY.field_createTime, this.cMM.kt(), this.gii);
        if (ch.jb(this.dyk))
        {
          Object[] arrayOfObject6 = new Object[1];
          arrayOfObject6[0] = Long.valueOf(this.gii);
          z.w("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra genClientId failed not use cdn rowid:%d", arrayOfObject6);
          i = 0;
        }
        else
        {
          this.hva = (this.huY.field_fileFullPath + "_tmp");
          com.tencent.mm.modelcdntran.n localn = new com.tencent.mm.modelcdntran.n();
          localn.field_mediaId = this.dyk;
          localn.field_fullpath = this.hva;
          localn.field_fileType = CdnTransportEngine.drA;
          localn.field_totalLen = ((int)this.huY.field_totalLen);
          localn.field_aesKey = localb.dRi;
          localn.field_fileId = localb.dRd;
          localn.field_priority = CdnTransportEngine.dru;
          localn.dsw = this.dyq;
          if (!com.tencent.mm.modelcdntran.k.vl().a(localn))
          {
            z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra addSendTask failed.");
            this.dyk = "";
            i = 0;
          }
          else if (this.huY.field_isUseCdn != 1)
          {
            this.huY.field_isUseCdn = 1;
            boolean bool = bf.GP().a(this.huY, new String[0]);
            if (!bool)
            {
              z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "checkUseCdn update info ret:" + bool);
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
    if (this.huY.field_status == 102L)
    {
      this.huY.field_status = 101L;
      if (!this.hvb)
        bf.GP().a(this.huY, new String[0]);
    }
    this.gii = this.huY.iGx;
    if (ch.jb(this.huY.field_mediaSvrId))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "checkArgs : mediaId is null");
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    if ((this.huY.field_totalLen <= 0L) || (this.huY.field_totalLen > 11796480L))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "checkArgs : totalLen is invalid, totalLen = " + this.huY.field_totalLen);
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    if (ch.jb(this.huY.field_fileFullPath))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "checkArgs : fileFullPath is null");
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
    }
    int j = com.tencent.mm.a.c.ab(this.huY.field_fileFullPath);
    if (this.hvc)
    {
      j -= 6;
      if (j <= 0)
        break label1101;
    }
    while (j != this.huY.field_offset)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "checkArgs : fileFullPath is invalid, fileLength = " + j + ", info.field_offset = " + this.huY.field_offset);
      this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
      return -1;
      label1101: j = 0;
    }
    Object[] arrayOfObject4 = new Object[3];
    arrayOfObject4[0] = this.huY.field_appId;
    arrayOfObject4[1] = this.huY.field_mediaSvrId;
    arrayOfObject4[2] = Long.valueOf(this.huY.field_sdkVer);
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "downing attach by non cdn, appId: %s,  mediaId: %s, sdkVer: %d", arrayOfObject4);
    ft localft = (ft)this.dmI.sO();
    localft.hOd = this.huY.field_appId;
    localft.hQq = this.huY.field_mediaSvrId;
    localft.hPr = ((int)this.huY.field_sdkVer);
    localft.gnq = com.tencent.mm.model.x.pG();
    localft.hQk = ((int)this.huY.field_totalLen);
    localft.hUu = ((int)this.huY.field_offset);
    localft.hQs = 0;
    if (this.type != 0);
    for (localft.ewb = this.type; ; localft.ewb = ((int)this.huY.field_type))
      return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!ch.jb(this.dyk)))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.dyk;
      z.w("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", arrayOfObject3);
    }
    do
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        if (paramInt2 == 4)
        {
          com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject1 = new Object[7];
          arrayOfObject1[0] = Integer.valueOf(paramInt3);
          arrayOfObject1[1] = Integer.valueOf(2);
          arrayOfObject1[2] = Long.valueOf(this.startTime);
          arrayOfObject1[3] = Long.valueOf(ch.CM());
          arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
          arrayOfObject1[5] = Integer.valueOf(CdnTransportEngine.drA);
          arrayOfObject1[6] = Integer.valueOf(0);
          localn1.d(10420, arrayOfObject1);
        }
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      fu localfu = (fu)((com.tencent.mm.o.a)paramaj).sP();
      this.huY.field_totalLen = localfu.hQk;
      if (!localfu.hQq.equals(this.huY.field_mediaSvrId))
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "argument is not consistent");
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      if (localfu.hUu != this.huY.field_offset)
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "startPos, totalLen is incorrect startpos:" + localfu.hUu);
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      if (localfu.hQs + this.huY.field_offset > this.huY.field_totalLen)
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "data buffer is incorrect datalen:" + localfu.hQs + " off:" + this.huY.field_offset + " total?:" + this.huY.field_totalLen);
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      byte[] arrayOfByte = com.tencent.mm.platformtools.ai.a(localfu.hQi);
      if ((arrayOfByte == null) || (arrayOfByte.length == 0) || (arrayOfByte.length != localfu.hQs))
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "data buffer is incorrect");
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      int i = com.tencent.mm.a.c.a(this.huY.field_fileFullPath, arrayOfByte);
      if (i != 0)
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "append to file failed:" + i);
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      a locala = this.huY;
      locala.field_offset += arrayOfByte.length;
      if (this.huY.field_offset == this.huY.field_totalLen)
        this.huY.field_status = 199L;
      if (this.dyf != null)
        am.h(new ai(this));
      if (this.hvb);
      for (boolean bool = true; !bool; bool = bf.GP().a(this.huY, new String[0]))
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "onGYNetEnd update info ret:" + i);
        this.cIm = (-10000 - com.tencent.mm.compatible.g.k.nJ());
        this.dlH.a(3, -1, "", this);
        return;
      }
      if (this.huY.field_status == 199L)
      {
        com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject2 = new Object[7];
        arrayOfObject2[0] = Integer.valueOf(0);
        arrayOfObject2[1] = Integer.valueOf(2);
        arrayOfObject2[2] = Long.valueOf(this.startTime);
        arrayOfObject2[3] = Long.valueOf(ch.CM());
        arrayOfObject2[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject2[5] = Integer.valueOf(CdnTransportEngine.drA);
        arrayOfObject2[6] = Long.valueOf(this.huY.field_totalLen - this.huZ);
        localn2.d(10420, arrayOfObject2);
        this.dlH.a(0, 0, "", this);
        return;
      }
      if (this.huY.field_status == 102L)
      {
        this.dlH.a(3, -1, "", this);
        this.cIm = -20102;
        return;
      }
    }
    while (a(tp(), this.dlH) >= 0);
    z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "onGYNetEnd : doScene fail");
    this.dlH.a(3, -1, "", this);
  }

  public final void a(aj paramaj)
  {
    if (!this.hvb)
    {
      com.tencent.mm.modelcdntran.k.vl().fP(this.dyk);
      this.huY = bf.GP().uU(this.mediaId);
    }
    if (this.huY == null);
    do
    {
      return;
      if ((this.huY.field_status == 101L) && (paramaj != null))
        paramaj.ayO();
      this.huY.field_status = 102L;
    }
    while (this.hvb);
    bf.GP().a(this.huY, new String[0]);
  }

  public final long ayM()
  {
    return this.gii;
  }

  public final void ayN()
  {
    this.hvc = true;
    if (this.hvc)
      com.tencent.mm.a.c.a(this.huY.field_fileFullPath, "#!AMR\n".getBytes());
  }

  public final int getType()
  {
    return 221;
  }

  public final String lj()
  {
    return this.huY.field_mediaSvrId;
  }

  protected final int sB()
  {
    return 180;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ae
 * JD-Core Version:    0.6.2
 */