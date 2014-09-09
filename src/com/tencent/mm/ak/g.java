package com.tencent.mm.ak;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.bm;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.f;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a.ads;
import com.tencent.mm.protocal.a.adt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Map;
import junit.framework.Assert;

public final class g extends com.tencent.mm.o.x
  implements ab
{
  private static int dFI = 32000;
  private int cIm = 0;
  private q dFF;
  private boolean dFG = false;
  private final int dFJ;
  private final long dFK = 1800000L;
  boolean dFL = false;
  private int dFM = -1;
  int dFN = 0;
  private com.tencent.mm.o.m dlH;
  private com.tencent.mm.o.a dmI;
  ay dmV;
  l dyW = null;
  private String dyk = "";
  private com.tencent.mm.modelcdntran.o dyq = new h(this);
  private String rI;
  private long startTime = 0L;

  public g(String paramString)
  {
    this.dmV = new ay(new j(this), bool);
    if (paramString != null)
    {
      Assert.assertTrue(bool);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "NetSceneUploadVideo:  file:" + paramString);
      this.rI = paramString;
      this.dFF = v.ij(paramString);
      if (this.dFF == null)
        break label159;
    }
    label159: for (this.dFJ = 2500; ; this.dFJ = 0)
    {
      this.dyW = new l();
      return;
      bool = false;
      break;
    }
  }

  public final int AJ()
  {
    return this.cIm;
  }

  protected final int a(aj paramaj)
  {
    ads localads = (ads)((com.tencent.mm.o.a)paramaj).sO();
    if ((ch.jb(localads.hPt)) || (localads.ihy <= 0) || (ch.jb(localads.hPq)) || (ch.jb(localads.hPs)) || (localads.hVF <= 0) || (localads.ihw > localads.ihv) || (localads.ihw < 0) || (localads.iwD > localads.iwC) || (localads.iwD < 0) || ((localads.iwD == localads.iwC) && (localads.ihw == localads.ihv)) || (localads.ihv <= 0) || (localads.iwC <= 0) || ((localads.iwE.aLK() <= 0) && (localads.ihx.aLK() <= 0)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "ERR: Security Check Failed file:" + this.rI + " user:" + localads.hPs);
      return aa.doN;
    }
    return aa.doM;
  }

  public final int a(com.tencent.mm.network.r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    this.dFF = v.ij(this.rI);
    if ((this.dFF == null) || ((this.dFF.getStatus() != 104) && (this.dFF.getStatus() != 103)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "Get info Failed file:" + this.rI);
      this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
      return -1;
    }
    StringBuilder localStringBuilder = new StringBuilder("doscene file:").append(this.rI).append(" stat:").append(this.dFF.getStatus()).append(" [").append(this.dFF.AQ()).append(",").append(this.dFF.AR()).append("] [").append(this.dFF.AO()).append(",").append(this.dFF.sp()).append("]  netTimes:").append(this.dFF.AW()).append(" times:");
    int i = this.dFN;
    this.dFN = (i + 1);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", i);
    if (this.startTime == 0L)
    {
      this.startTime = ch.CM();
      this.dFM = this.dFF.AO();
    }
    int j;
    if (y.dQ(this.dFF.getUser()))
    {
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = this.dFF.getUser();
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra not use cdn user:%s", arrayOfObject5);
      j = 0;
    }
    while (j != 0)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.rI;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra use cdn return -1 for onGYNetEnd clientid:%s", arrayOfObject2);
      return 0;
      com.tencent.mm.modelcdntran.k.vl();
      if ((!c.vf()) && (this.dFF.AY() != 1))
      {
        Object[] arrayOfObject4 = new Object[2];
        com.tencent.mm.modelcdntran.k.vl();
        arrayOfObject4[0] = Boolean.valueOf(c.vf());
        arrayOfObject4[1] = Integer.valueOf(this.dFF.AY());
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra not use cdn flag:%b getCdnInfo:%d", arrayOfObject4);
        j = 0;
      }
      else
      {
        this.dyk = com.tencent.mm.modelcdntran.i.a("upvideo", this.dFF.kn(), this.dFF.getUser(), this.dFF.getFileName());
        if (ch.jb(this.dyk))
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = this.dFF.getFileName();
          com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra genClientId failed not use cdn file:%s", arrayOfObject3);
          j = 0;
        }
        else
        {
          String str1 = m.AL().ic(this.rI);
          String str2 = m.AL().ib(this.rI);
          com.tencent.mm.modelcdntran.n localn = new com.tencent.mm.modelcdntran.n();
          localn.dsw = this.dyq;
          localn.field_mediaId = this.dyk;
          localn.field_fullpath = str2;
          localn.field_thumbpath = str1;
          localn.field_fileType = CdnTransportEngine.drz;
          localn.field_talker = this.dFF.getUser();
          localn.field_priority = CdnTransportEngine.dru;
          localn.field_needStorage = false;
          localn.field_isStreamMedia = false;
          Map localMap = com.tencent.mm.sdk.platformtools.x.bB(this.dFF.AZ(), "msg");
          if (localMap != null)
          {
            localn.field_fileId = ((String)localMap.get(".msg.videomsg.$cdnvideourl"));
            localn.field_aesKey = ((String)localMap.get(".msg.videomsg.$aeskey"));
          }
          while (true)
          {
            if (com.tencent.mm.modelcdntran.k.vl().b(localn))
              break label676;
            com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra addSendTask failed.");
            this.dyk = "";
            j = 0;
            break;
            com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra parse video recv xml failed");
          }
          label676: if (this.dFF.AY() != 1)
          {
            this.dFF.eM(1);
            this.dFF.setStatus(104);
            this.dFF.db(524544);
            v.d(this.dFF);
          }
          j = 1;
        }
      }
    }
    ads localads;
    if (this.dFF.AX() == 1)
    {
      this.dFL = true;
      com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
      localb.a(new ads());
      localb.b(new adt());
      localb.fi("/cgi-bin/micromsg-bin/uploadvideo");
      localb.de(149);
      localb.df(39);
      localb.dg(1000000039);
      this.dmI = localb.sU();
      localads = (ads)this.dmI.sO();
      localads.hPq = ((String)f.c(2, ""));
      localads.hPs = this.dFF.getUser();
      localads.hPt = this.rI;
      if (this.dFL)
        localads.iwG = 2;
      if (this.dFF.CP() == 3)
        localads.iwG = 3;
      localads.iwF = this.dFF.AU();
      localads.ihv = this.dFF.AR();
      localads.iwC = this.dFF.sp();
      if (!bm.ab(ak.getContext()))
        break label1292;
    }
    u localu2;
    label1292: for (int k = 1; ; k = 2)
    {
      localads.hVF = k;
      localads.ihy = 2;
      localads.iwD = 0;
      localads.iwE = new ws().cl(new byte[0]);
      localads.ihx = new ws().cl(new byte[0]);
      Object[] arrayOfObject1 = new Object[4];
      arrayOfObject1[0] = Integer.valueOf(localads.iwF);
      arrayOfObject1[1] = Integer.valueOf(localads.ihw);
      arrayOfObject1[2] = Integer.valueOf(localads.iwC);
      arrayOfObject1[3] = Integer.valueOf(localads.iwG);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "upload video: play length %d, thumb totalLen %d, video totalLen %d, funcFlag %d", arrayOfObject1);
      if (this.dFF.getStatus() != 103)
        break label1540;
      localu2 = r.e(m.AL().ic(this.rI), this.dFF.AQ(), dFI);
      if ((localu2.ret >= 0) && (localu2.ddA != 0))
        break label1298;
      v.jdMethod_if(this.rI);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "doScene READ THUMB[" + this.rI + "]  Error ");
      this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
      return -1;
      if (600L + this.dFF.kn() < ch.CL())
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "create time check error:" + this.rI);
        v.jdMethod_if(this.rI);
        this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
        return -1;
      }
      if (v.ie(this.rI))
        break;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "checkVoiceNetTimes Failed file:" + this.rI);
      v.jdMethod_if(this.rI);
      this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
      return -1;
    }
    label1298: com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "doScene READ THUMB[" + this.rI + "] read ret:" + localu2.ret + " readlen:" + localu2.ddA + " newOff:" + localu2.dGn + " netOff:" + this.dFF.AQ());
    if (localu2.dGn < this.dFF.AQ())
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "Err doScene READ THUMB[" + this.rI + "] newOff:" + localu2.dGn + " OldtOff:" + this.dFF.AQ());
      v.jdMethod_if(this.rI);
      this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
      return -1;
    }
    byte[] arrayOfByte2 = new byte[localu2.ddA];
    System.arraycopy(localu2.buf, 0, arrayOfByte2, 0, localu2.ddA);
    localads.ihw = this.dFF.AQ();
    localads.ihx = new ws().cl(arrayOfByte2);
    while (true)
    {
      return a(paramr, this.dmI, this);
      label1540: u localu1 = r.e(m.AL().ib(this.rI), this.dFF.AO(), dFI);
      if ((localu1.ret < 0) || (localu1.ddA == 0))
      {
        v.jdMethod_if(this.rI);
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "doScene READ VIDEO[" + this.rI + "]  Error ");
        this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
        return -1;
      }
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "doScene READ VIDEO[" + this.rI + "] read ret:" + localu1.ret + " readlen:" + localu1.ddA + " newOff:" + localu1.dGn + " netOff:" + this.dFF.AO());
      if (localu1.dGn < this.dFF.AO())
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "Err doScene READ VIDEO[" + this.rI + "] newOff:" + localu1.dGn + " OldtOff:" + this.dFF.AO());
        v.jdMethod_if(this.rI);
        this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
        return -1;
      }
      if ((!this.dFL) && (localu1.dGn >= 3072000))
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "Err doScene READ VIDEO[" + this.rI + "] maxsize:3072000");
        v.jdMethod_if(this.rI);
        this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
        return -1;
      }
      if ((this.dFL) && (localu1.dGn >= 20971520))
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "Err doScene READ VIDEO[" + this.rI + "] maxsize:20971520");
        v.jdMethod_if(this.rI);
        this.cIm = (0 - (10000 + com.tencent.mm.compatible.g.k.nJ()));
        return -1;
      }
      byte[] arrayOfByte1 = new byte[localu1.ddA];
      System.arraycopy(localu1.buf, 0, arrayOfByte1, 0, localu1.ddA);
      localads.iwD = this.dFF.AO();
      localads.ihw = this.dFF.AQ();
      localads.iwE = new ws().cl(arrayOfByte1);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.dyk);
    if (this.dFG)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "onGYNetEnd Call Stop by Service   file:" + this.rI + " user:" + this.dFF.getUser());
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!ch.jb(this.dyk)))
    {
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = this.dyk;
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", arrayOfObject5);
      return;
    }
    adt localadt = (adt)((com.tencent.mm.o.a)paramaj).sP();
    ads localads = (ads)((com.tencent.mm.o.a)paramaj).sO();
    this.dFF = v.ij(this.rI);
    if (this.dFF == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "ERR: onGYNetEnd Get INFO FAILED :" + this.rI);
      this.cIm = (-10000 + (0 - com.tencent.mm.compatible.g.k.nJ()));
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.dFF.getStatus() == 105)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "onGYNetEnd STATUS PAUSE [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((this.dFF.getStatus() != 104) && (this.dFF.getStatus() != 103))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "ERR: onGYNetEnd STATUS ERR: status:" + this.dFF.getStatus() + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "ERR: onGYNetEnd BLACK  errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.rI + " user:" + this.dFF.getUser());
      v.ig(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0) && (paramInt3 != -13) && (paramInt3 != -6))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.rI + " user:" + this.dFF.getUser());
      v.jdMethod_if(this.rI);
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject4 = new Object[7];
      arrayOfObject4[0] = Integer.valueOf(paramInt3);
      arrayOfObject4[1] = Integer.valueOf(1);
      arrayOfObject4[2] = Long.valueOf(this.startTime);
      arrayOfObject4[3] = Long.valueOf(ch.CM());
      arrayOfObject4[4] = Integer.valueOf(com.tencent.mm.modelcdntran.i.z(ak.getContext()));
      arrayOfObject4[5] = Integer.valueOf(CdnTransportEngine.drz);
      arrayOfObject4[6] = Integer.valueOf(0);
      localn2.d(10420, arrayOfObject4);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + paramInt2 + " errCode:" + paramInt3 + "  file:" + this.rI + " user:" + this.dFF.getUser());
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((!ch.B(localads.ihx.aLL().getBytes())) && (localads.ihw != localadt.ihw - localads.ihx.aLK()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "onGYNetEnd Err Thumb Pos:[" + localads.ihw + "," + localads.ihx.aLK() + "," + localadt.ihw + "] file:" + this.rI + " user:" + localads.hPs);
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((!ch.B(localads.iwE.aLL().getBytes())) && (localads.iwD != localadt.iwD - localads.iwE.aLK()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "onGYNetEnd Err Thumb Pos:[" + localads.iwD + "," + localads.iwE.aLK() + "," + localadt.iwD + "] file:" + this.rI + " user:" + localads.hPs);
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dFF.V(ch.CL());
    this.dFF.p(localadt.hOY);
    this.dFF.db(1028);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Long.valueOf(this.dFF.kl());
    arrayOfObject1[1] = Integer.valueOf(ao.dVZ);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "dkmsgid  set svrmsgid %d -> %d", arrayOfObject1);
    if ((10007 == ao.dVY) && (ao.dVZ != 0) && (this.dFF.kl() != 0L))
    {
      this.dFF.p(ao.dVZ);
      ao.dVZ = 0;
    }
    int i = this.dFF.getStatus();
    int m;
    if (i == 103)
    {
      this.dFF.eH(localads.ihw + localads.ihx.aLK());
      this.dFF.db(0x40 | this.dFF.ss());
      int n = this.dFF.AQ();
      int i1 = this.dFF.AR();
      m = 0;
      if (n >= i1)
      {
        this.dFF.setStatus(104);
        this.dFF.db(0x100 | this.dFF.ss());
      }
    }
    while (true)
    {
      v.d(this.dFF);
      if (!this.dFG)
        break label1579;
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      if (i != 104)
        break;
      this.dFF.eF(localads.iwD + localads.iwE.aLK());
      this.dFF.db(0x8 | this.dFF.ss());
      int j = this.dFF.AO();
      int k = this.dFF.sp();
      m = 0;
      if (j >= k)
      {
        this.dFF.setStatus(199);
        this.dFF.db(0x100 | this.dFF.ss());
        v.c(this.dFF);
        m = 1;
      }
    }
    com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "onGYNetEnd ERROR STATUS:" + i + " file:" + this.rI + " user:" + localads.hPs);
    v.jdMethod_if(this.rI);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
    return;
    label1579: if (m == 0)
    {
      this.dmV.cP(10L);
      return;
    }
    com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject2 = new Object[7];
    arrayOfObject2[0] = Integer.valueOf(0);
    arrayOfObject2[1] = Integer.valueOf(1);
    arrayOfObject2[2] = Long.valueOf(this.startTime);
    arrayOfObject2[3] = Long.valueOf(ch.CM());
    arrayOfObject2[4] = Integer.valueOf(com.tencent.mm.modelcdntran.i.z(ak.getContext()));
    arrayOfObject2[5] = Integer.valueOf(CdnTransportEngine.drz);
    arrayOfObject2[6] = Integer.valueOf(this.dFF.sp() - this.dFM);
    localn1.d(10420, arrayOfObject2);
    boolean bool;
    if (this.dFF == null)
    {
      bool = false;
      if ((!bool) && (!y.du(this.dFF.getUser())))
        break label2072;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.dFF.getUser();
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "upload to biz :%s", arrayOfObject3);
      if (this.dFF.kl() < 0L)
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "ERR: finish video invaild MSGSVRID :" + this.dFF.kl() + " file:" + this.rI + " toUser:" + this.dFF.getUser());
        v.jdMethod_if(this.rI);
      }
      label1829: if (this.dyW == null)
        break label2160;
    }
    label2072: label2160: for (long l = this.dyW.nM(); ; l = 0L)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "!!!FIN: file:" + this.rI + " toUser:" + this.dFF.getUser() + " msgsvrid:" + this.dFF.kl() + " thumbsize:" + this.dFF.AR() + " videosize:" + this.dFF.sp() + " useTime:" + l);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "FinishLogForTime file:" + this.rI + " packSize:" + dFI + " filesize:" + this.dFF.sp() + " useTime:" + l);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      com.tencent.mm.storage.i locali = bg.qW().oT().ys(this.dFF.getUser());
      if ((locali == null) || ((int)locali.dhv <= 0))
      {
        bool = false;
        break;
      }
      bool = locali.aIg();
      break;
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "not upload to biz");
      if (this.dFF.kl() > 0L)
        break label1829;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "ERR: finish video invaild MSGSVRID :" + this.dFF.kl() + " file:" + this.rI + " toUser:" + this.dFF.getUser());
      v.jdMethod_if(this.rI);
      break label1829;
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
    return this.dFJ;
  }

  public final void stop()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.dyk;
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "stop %s", arrayOfObject);
    if (!ch.jb(this.dyk))
      com.tencent.mm.modelcdntran.k.vl().fO(this.dyk);
    this.dFG = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.g
 * JD-Core Version:    0.6.2
 */