package com.tencent.mm.y;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.k;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.bm;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.a.adq;
import com.tencent.mm.protocal.a.adr;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.util.Map;
import java.util.Random;
import junit.framework.Assert;

public final class ag extends com.tencent.mm.o.x
  implements ab
{
  private String TAG = "!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWhphP3q58UAs=";
  private ar cCp = null;
  private Random dih = new Random();
  private com.tencent.mm.o.m dlH;
  private final com.tencent.mm.o.a dmI;
  private long dsA;
  private long dsz;
  private final com.tencent.mm.o.n dyf;
  private long dyg;
  private int dyi = 0;
  private com.tencent.mm.modelstat.c dyj = null;
  private String dyk = "";
  private int dyl = 0;
  private int dyo;
  private o dyq = new aj(this);
  private int dyw = 16384;
  private am dyx = null;
  private String dyy;
  private boolean dyz;
  private int startOffset = -1;
  private long startTime = 0L;

  public ag(int paramInt1, int paramInt2)
  {
    this.dyg = paramInt1;
    this.dsz = paramInt1;
    this.dyi = paramInt2;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new adq());
    localb.b(new adr());
    localb.fi("/cgi-bin/micromsg-bin/uploadmsgimg");
    localb.de(110);
    localb.df(9);
    localb.dg(1000000009);
    this.dmI = localb.sU();
    this.dyf = null;
    z.d(this.TAG, "FROM B SERVICE:" + this.dyg);
    if (!v.dV((int)this.dyg))
    {
      this.dyg = -1L;
      return;
    }
    l locall1 = ap.yg().Q(this.dyg);
    this.dsA = locall1.xL();
    if (paramInt2 == 1)
      this.dsz = locall1.xP();
    for (l locall2 = ap.yg().Q(this.dsz); ; locall2 = locall1)
    {
      l locall3 = ap.yg().dU((int)locall2.xM());
      if (locall3 != null)
        this.dsA = locall3.xL();
      this.cCp = bg.qW().oV().cV(this.dsA);
      if ((this.cCp != null) && (this.cCp.kk() != this.dsA))
      {
        this.cCp = null;
        return;
      }
      if (this.cCp == null)
        break;
      adq localadq = (adq)this.dmI.sO();
      localadq.hOP = new vt().wF(com.tencent.mm.model.x.pG());
      localadq.hOQ = new vt().wF(this.cCp.kt());
      localadq.hUu = locall2.getOffset();
      localadq.hQk = locall2.sp();
      localadq.hOR = this.cCp.getType();
      localadq.icN = paramInt2;
      if (bm.ab(ak.getContext()));
      for (int i = 1; ; i = 2)
      {
        localadq.isa = i;
        localadq.itA = locall2.getSource();
        localadq.iwz = this.cCp.kB();
        localadq.iwA = this.cCp.kA();
        if (locall2.getOffset() != 0)
          break;
        this.dyj = new com.tencent.mm.modelstat.c(110, true, locall2.sp());
        return;
      }
    }
  }

  public ag(int paramInt1, int paramInt2, byte paramByte)
  {
    this.dyg = paramInt1;
    this.dsz = paramInt1;
    this.dyi = paramInt2;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new adq());
    localb.b(new adr());
    localb.fi("/cgi-bin/micromsg-bin/uploadmsgimg");
    localb.de(110);
    localb.df(9);
    localb.dg(1000000009);
    this.dmI = localb.sU();
    this.dyf = null;
    z.d(this.TAG, "FROM C SERVICE:" + this.dyg);
    if (!v.dV((int)this.dyg))
    {
      this.dyg = -1L;
      return;
    }
    l locall1 = ap.yg().Q(this.dyg);
    this.dsA = locall1.xL();
    locall1.setStatus(0);
    locall1.p(0L);
    locall1.setOffset(0);
    ap.yg().a((int)this.dsz, locall1);
    if (paramInt2 == 1)
      this.dsz = locall1.xP();
    for (l locall2 = ap.yg().Q(this.dsz); ; locall2 = locall1)
    {
      this.cCp = bg.qW().oV().cV(this.dsA);
      if (this.cCp == null)
        break;
      this.cCp.setStatus(1);
      String str = locall2.xO();
      label364: adq localadq;
      if ((str != null) && (str.startsWith("THUMBNAIL_DIRPATH://")))
      {
        this.cCp.bK(str);
        bg.qW().oV().a(this.dsA, this.cCp);
        localadq = (adq)this.dmI.sO();
        localadq.hOP = new vt().wF(com.tencent.mm.model.x.pG());
        localadq.hOQ = new vt().wF(this.cCp.kt());
        localadq.hUu = locall2.getOffset();
        localadq.hQk = locall2.sp();
        localadq.hOR = this.cCp.getType();
        localadq.icN = paramInt2;
        if (!bm.ab(ak.getContext()))
          break label584;
      }
      label584: for (int i = 1; ; i = 2)
      {
        localadq.isa = i;
        localadq.itA = locall2.getSource();
        localadq.iwz = this.cCp.kB();
        localadq.iwA = this.cCp.kA();
        if (locall2.getOffset() != 0)
          break;
        this.dyj = new com.tencent.mm.modelstat.c(110, true, locall2.sp());
        return;
        this.cCp.bK("THUMBNAIL://" + locall2.xM());
        break label364;
      }
    }
  }

  public ag(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, com.tencent.mm.o.n paramn, int paramInt4, String paramString4, String paramString5, int paramInt5)
  {
    this.dyz = true;
    this.dyo = paramInt5;
    this.dyf = paramn;
    this.dyi = paramInt3;
    PString localPString = new PString();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    this.dyy = paramString4;
    localPString.value = paramString5;
    ap.yg().a(paramInt1, paramString3, paramInt3, paramInt2, paramInt4, localPString, localPInt1, localPInt2);
    this.dyg = paramInt1;
    this.dsz = this.dyg;
    z.d(this.TAG, "FROM A UI :" + paramString2 + " " + this.dyg);
    if ((this.dyg < 0L) || (!v.dV((int)this.dyg)))
    {
      z.e(this.TAG, "insert to img storage failed id:" + this.dyg);
      this.dsA = -1L;
      this.dmI = null;
      return;
    }
    boolean bool1;
    label289: l locall;
    int j;
    label469: label476: adq localadq;
    if (this.dyg >= 0L)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
      localb.a(new adq());
      localb.b(new adr());
      localb.fi("/cgi-bin/micromsg-bin/uploadmsgimg");
      localb.de(110);
      localb.df(9);
      localb.dg(1000000009);
      this.dmI = localb.sU();
      locall = ap.yg().Q(this.dyg);
      this.cCp = bg.qW().oV().cV(locall.xL());
      this.cCp.bK(localPString.value);
      this.cCp.bJ(localPInt1.value);
      this.cCp.bK(localPInt2.value);
      if (!this.dyz)
        break label866;
      boolean bool2 = ap.yg().a(this.cCp, this.dyo, paramInt3);
      ar localar = this.cCp;
      if (!bool2)
        break label860;
      j = 1;
      localar.bM(j);
      this.dsA = this.cCp.kk();
      bg.qW().oV().a(this.dsA, this.cCp);
      z.i(this.TAG, "NetSceneUploadMsgImg: local msgId = " + this.dsA);
      if (paramInt3 == 1)
      {
        this.dsz = locall.xP();
        locall = ap.yg().Q(this.dsz);
      }
      locall.cZ(com.tencent.mm.a.c.ab(ap.yg().f(locall.xN(), "", "")));
      ap.yg().a(this.dsz, locall);
      z.d(this.TAG, "NetSceneUploadMsgImg: local imgId = " + this.dsz + " img len = " + locall.sp());
      localadq = (adq)this.dmI.sO();
      localadq.hOP = new vt().wF(paramString1);
      localadq.hOQ = new vt().wF(paramString2);
      localadq.hUu = locall.getOffset();
      localadq.hQk = locall.sp();
      localadq.hOR = this.cCp.getType();
      localadq.icN = paramInt3;
      if (!bm.ab(ak.getContext()))
        break label889;
    }
    label860: label866: label889: for (int i = 1; ; i = 2)
    {
      localadq.isa = i;
      localadq.itA = locall.getSource();
      localadq.iwz = localPInt2.value;
      localadq.iwA = localPInt1.value;
      z.d(this.TAG, "dkimgsource :" + locall.getSource());
      if (locall.getOffset() == 0)
        this.dyj = new com.tencent.mm.modelstat.c(110, true, locall.sp());
      if (paramn == null)
        break;
      com.tencent.mm.sdk.platformtools.am.h(new ai(this, paramn, locall.getOffset(), locall.sp()));
      return;
      bool1 = false;
      break label289;
      j = 0;
      break label469;
      ap.yg().b(this.cCp.kp(), com.tencent.mm.aq.a.getDensity(ak.getContext()));
      break label476;
    }
  }

  public ag(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.o.n paramn, int paramInt3, am paramam, int paramInt4)
  {
    this(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramn, paramInt3, "", "", true, paramInt4);
    this.dyx = paramam;
  }

  public ag(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.o.n paramn, int paramInt3, String paramString4, String paramString5, boolean paramBoolean, int paramInt4)
  {
    this(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramn, paramInt3, paramString4, paramString5, paramBoolean, paramInt4, (byte)0);
  }

  private ag(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.o.n paramn, int paramInt3, String paramString4, String paramString5, boolean paramBoolean, int paramInt4, byte paramByte)
  {
    this.dyz = paramBoolean;
    this.dyo = paramInt4;
    this.dyf = paramn;
    this.dyi = paramInt2;
    PString localPString = new PString();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    this.dyy = paramString4;
    localPString.value = paramString5;
    this.dyg = ap.yg().a(paramString3, paramInt2, paramInt1, paramInt3, localPString, localPInt1, localPInt2);
    this.dsz = this.dyg;
    z.d(this.TAG, "FROM A UI :" + paramString2 + " " + this.dyg);
    if ((this.dyg < 0L) || (!v.dV((int)this.dyg)))
    {
      z.e(this.TAG, "insert to img storage failed id:" + this.dyg);
      this.dsA = -1L;
      this.dmI = null;
      return;
    }
    boolean bool1;
    label285: int j;
    label498: label505: boolean bool2;
    label534: l locall1;
    if (this.dyg >= 0L)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
      localb.a(new adq());
      localb.b(new adr());
      localb.fi("/cgi-bin/micromsg-bin/uploadmsgimg");
      localb.de(110);
      localb.df(9);
      localb.dg(1000000009);
      this.dmI = localb.sU();
      this.cCp = new ar();
      this.cCp.setType(y.dS(paramString2));
      this.cCp.bJ(paramString2);
      this.cCp.bv(1);
      this.cCp.setStatus(1);
      this.cCp.bK(localPString.value);
      this.cCp.bJ(localPInt1.value);
      this.cCp.bK(localPInt2.value);
      this.cCp.q(bw.eo(this.cCp.kt()));
      if (!this.dyz)
        break label936;
      boolean bool3 = ap.yg().a(this.cCp, this.dyo, paramInt2);
      ar localar = this.cCp;
      if (!bool3)
        break label930;
      j = 1;
      localar.bM(j);
      this.dsA = bg.qW().oV().y(this.cCp);
      if (this.dsA < 0L)
        break label959;
      bool2 = true;
      Assert.assertTrue(bool2);
      z.i(this.TAG, "NetSceneUploadMsgImg: local msgId = " + this.dsA);
      locall1 = ap.yg().Q(this.dyg);
      locall1.O((int)this.dsA);
      ap.yg().a(this.dyg, locall1);
      if (paramInt2 != 1)
        break label971;
      this.dsz = locall1.xP();
    }
    label930: label936: label959: label971: for (l locall2 = ap.yg().Q(this.dsz); ; locall2 = locall1)
    {
      locall2.cZ(com.tencent.mm.a.c.ab(ap.yg().f(locall2.xN(), "", "")));
      ap.yg().a(this.dsz, locall2);
      z.d(this.TAG, "NetSceneUploadMsgImg: local imgId = " + this.dsz + " img len = " + locall2.sp());
      adq localadq = (adq)this.dmI.sO();
      localadq.hOP = new vt().wF(paramString1);
      localadq.hOQ = new vt().wF(paramString2);
      localadq.hUu = locall2.getOffset();
      localadq.hQk = locall2.sp();
      localadq.hOR = this.cCp.getType();
      localadq.icN = paramInt2;
      if (bm.ab(ak.getContext()));
      for (int i = 1; ; i = 2)
      {
        localadq.isa = i;
        localadq.itA = locall2.getSource();
        localadq.iwz = localPInt2.value;
        localadq.iwA = localPInt1.value;
        z.d(this.TAG, "dkimgsource :" + locall2.getSource());
        if (locall2.getOffset() == 0)
          this.dyj = new com.tencent.mm.modelstat.c(110, true, locall2.sp());
        if (paramn == null)
          break;
        com.tencent.mm.sdk.platformtools.am.h(new ah(this, paramn, locall2.getOffset(), locall2.sp()));
        return;
        bool1 = false;
        break label285;
        j = 0;
        break label498;
        ap.yg().b(this.cCp.kp(), com.tencent.mm.aq.a.getDensity(ak.getContext()));
        break label505;
        bool2 = false;
        break label534;
      }
    }
  }

  private ag(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.o.n paramn, String paramString4, String paramString5)
  {
    this(4, paramString1, paramString2, paramString3, paramInt2, null, 0, paramString4, paramString5, false, -1);
  }

  public ag(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(4, paramString1, paramString2, paramString3, paramInt, null, "", "");
  }

  private boolean a(l paraml, int paramInt1, long paramLong, int paramInt2)
  {
    String str1 = this.TAG;
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = this.dyk;
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Long.valueOf(paramLong);
    arrayOfObject1[3] = Integer.valueOf(paramInt2);
    z.d(str1, "cdntra clientid:%s start:%d svrid:%d createtime:%d", arrayOfObject1);
    String str2 = this.TAG;
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Long.valueOf(paramLong);
    arrayOfObject2[1] = Integer.valueOf(ao.dVZ);
    z.d(str2, "dkmsgid  set svrmsgid %d -> %d", arrayOfObject2);
    if ((10007 == ao.dVY) && (ao.dVZ != 0))
    {
      paramLong = ao.dVZ;
      ao.dVZ = 0;
    }
    paraml.setOffset(paramInt1);
    paraml.p(paramLong);
    if (m.b(paraml))
    {
      l locall = ap.yg().Q(this.dyg);
      locall.p(paramLong);
      ap.yg().a(this.dyg, locall);
    }
    if (ap.yg().a(this.dsz, paraml) < 0)
    {
      z.e(this.TAG, "update db failed local id:" + this.dsz + " server id:" + paraml.kl());
      v.dX((int)this.dyg);
      v.dW((int)this.dyg);
      this.dlH.a(3, -1, "", this);
      if (this.dyx != null)
        this.dyx.xY();
    }
    do
    {
      return false;
      if (this.dyf != null)
        com.tencent.mm.sdk.platformtools.am.h(new al(this, paraml.getOffset(), paraml.sp()));
      if (!m.b(paraml))
        break;
      if (ch.jb(this.dyk))
      {
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject3 = new Object[7];
        arrayOfObject3[0] = Integer.valueOf(0);
        arrayOfObject3[1] = Integer.valueOf(1);
        arrayOfObject3[2] = Long.valueOf(this.startTime);
        arrayOfObject3[3] = Long.valueOf(ch.CM());
        arrayOfObject3[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject3[5] = Integer.valueOf(this.dyl);
        arrayOfObject3[6] = Integer.valueOf(paraml.sp() - this.startOffset);
        localn.d(10420, arrayOfObject3);
      }
      this.cCp.setStatus(2);
      this.cCp.p(paramLong);
      bg.qW().oV().a(this.dsA, this.cCp);
      v.dW((int)this.dyg);
      if (this.dyj != null)
        this.dyj.U(0L);
      this.dlH.a(0, 0, "", this);
    }
    while (this.dyx == null);
    this.dyx.xY();
    return false;
    return true;
  }

  protected final int a(com.tencent.mm.network.aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    int m;
    if (this.dsz < 0L)
    {
      z.e(this.TAG, "doScene invalid imgLocalId:" + this.dsz);
      m = -1;
    }
    label596: label870: 
    do
    {
      return m;
      if (this.cCp == null)
      {
        String str11 = this.TAG;
        Object[] arrayOfObject9 = new Object[1];
        arrayOfObject9[0] = Long.valueOf(this.dsz);
        z.e(str11, "doScene msg is null imgid:%d", arrayOfObject9);
        v.dX((int)this.dyg);
        return -1;
      }
      this.dlH = paramm;
      c(paramr);
      adq localadq = (adq)this.dmI.sO();
      l locall1 = ap.yg().Q(this.dsz);
      l locall2 = ap.yg().dU((int)locall1.xM());
      if (locall2 != null)
      {
        if (locall2.getStatus() == -1)
          return -1;
      }
      else if (locall1.getStatus() == -1)
        return -1;
      String str1 = ap.yg().f(locall1.xN(), "", "");
      String str2 = ap.yg().f(locall1.xO(), "", "");
      if ((localadq.iws == null) || (ch.jb(localadq.iws.getString())))
      {
        if (ch.jb(this.dyk))
        {
          String str10 = this.TAG;
          Object[] arrayOfObject8 = new Object[5];
          arrayOfObject8[0] = Long.valueOf(this.cCp.kn());
          arrayOfObject8[1] = this.cCp.kt();
          arrayOfObject8[2] = Long.valueOf(this.cCp.kk());
          arrayOfObject8[3] = Long.valueOf(this.dsz);
          arrayOfObject8[4] = Integer.valueOf(this.dyi);
          z.i(str10, "createMediaId time:%d talker:%s msg:%d img:%d compressType:%d", arrayOfObject8);
          this.dyk = i.a("upimg", this.cCp.kn(), this.cCp.kt(), this.cCp.kk() + "_" + this.dsz + "_" + this.dyi);
        }
        localadq.iws = new vt().wF(this.dyk);
        this.cCp.bR(this.dyk);
      }
      int n;
      int i;
      if (this.startTime == 0L)
      {
        this.startTime = ch.CM();
        this.startOffset = locall1.getOffset();
        if (this.dyi == 1)
        {
          n = CdnTransportEngine.drw;
          this.dyl = n;
        }
      }
      else
      {
        String str3 = this.TAG;
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = str1;
        arrayOfObject1[1] = str2;
        arrayOfObject1[2] = locall1.xN();
        z.i(str3, "before checkUseCdn %s, %s, imgBitPath:%s", arrayOfObject1);
        if (!y.dQ(this.cCp.kt()))
          break label596;
        String str9 = this.TAG;
        Object[] arrayOfObject7 = new Object[1];
        arrayOfObject7[0] = this.cCp.kt();
        z.w(str9, "cdntra not use cdn user:%s", arrayOfObject7);
        i = 0;
      }
      while (true)
      {
        if (i == 0)
          break label1073;
        String str5 = this.TAG;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = localadq.iws.getString();
        z.d(str5, "cdntra use cdn return -1 for onGYNetEnd clientid:%s", arrayOfObject3);
        return 0;
        n = CdnTransportEngine.drx;
        break;
        k.vl();
        if ((!com.tencent.mm.modelcdntran.c.vf()) && (ch.jb(locall1.xS())))
        {
          String str8 = this.TAG;
          Object[] arrayOfObject6 = new Object[2];
          k.vl();
          arrayOfObject6[0] = Boolean.valueOf(com.tencent.mm.modelcdntran.c.vf());
          arrayOfObject6[1] = locall1.xS();
          z.w(str8, "cdntra not use cdn flag:%b getCdnInfo:%s", arrayOfObject6);
          i = 0;
        }
        else if (ch.jb(this.dyk))
        {
          String str7 = this.TAG;
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = Long.valueOf(this.dsz);
          z.w(str7, "cdntra genClientId failed not use cdn imgLocalId:%d", arrayOfObject5);
          i = 0;
        }
        else
        {
          com.tencent.mm.modelcdntran.n localn = new com.tencent.mm.modelcdntran.n();
          localn.dsw = this.dyq;
          localn.field_mediaId = this.dyk;
          localn.field_fullpath = str1;
          localn.field_thumbpath = str2;
          localn.field_fileType = this.dyl;
          localn.field_talker = this.cCp.kt();
          localn.field_priority = CdnTransportEngine.dru;
          localn.field_needStorage = false;
          localn.field_isStreamMedia = false;
          Map localMap = com.tencent.mm.sdk.platformtools.x.bB(this.dyy, "msg");
          if (localMap != null)
            if (this.dyi != 1)
            {
              localn.field_fileId = ((String)localMap.get(".msg.img.$cdnmidimgurl"));
              localn.field_midFileLength = ch.getInt((String)localMap.get(".msg.img.$length"), 0);
              localn.field_totalLen = 0;
              localn.field_aesKey = ((String)localMap.get(".msg.img.$aeskey"));
            }
          while (true)
          {
            if (k.vl().b(localn))
              break label1024;
            String str6 = this.TAG;
            Object[] arrayOfObject4 = new Object[1];
            arrayOfObject4[0] = this.dyk;
            z.e(str6, "cdntra addSendTask failed. clientid:%s", arrayOfObject4);
            this.dyk = "";
            i = 0;
            break;
            localn.field_fileId = ((String)localMap.get(".msg.img.$cdnbigimgurl"));
            localn.field_midFileLength = ch.getInt((String)localMap.get(".msg.img.$length"), 0);
            localn.field_totalLen = 0;
            break label870;
            String str4 = this.TAG;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = locall1.xS();
            z.i(str4, "parse cdnInfo failed. [%s]", arrayOfObject2);
          }
          if (ch.ja(locall1.xS()).length() <= 0)
          {
            locall1.gO("CDNINFO_SEND");
            locall1.db(4096);
            ap.yg().a(this.dsz, locall1);
          }
          i = 1;
        }
      }
      int j = locall1.xJ();
      if (j >= sB())
      {
        z.e(this.TAG, "doScene limit net time:" + j);
        v.dX((int)this.dyg);
        return -1;
      }
      locall1.dP(j + 1);
      locall1.db(512);
      ap.yg().a(this.dsz, locall1);
      int k = locall1.sp() - locall1.getOffset();
      if (k > this.dyw)
        k = this.dyw;
      if (com.tencent.mm.a.c.ab(str1) > 10485760)
      {
        z.e(this.TAG, "doScene, file size is too large");
        return -1;
      }
      byte[] arrayOfByte = com.tencent.mm.a.c.a(str1, locall1.getOffset(), k);
      if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
        return -1;
      localadq.hQs = arrayOfByte.length;
      localadq.hUu = locall1.getOffset();
      localadq.hQi = new ws().cl(arrayOfByte);
      if (this.dyj != null)
        this.dyj.zS();
      m = a(paramr, this.dmI, this);
    }
    while (m >= 0);
    label1024: label1073: z.e(this.TAG, "doScene netId error");
    v.dX((int)this.dyg);
    return m;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.aj paramaj, byte[] paramArrayOfByte)
  {
    adr localadr = (adr)((com.tencent.mm.o.a)paramaj).sP();
    z.d(this.TAG, "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.dyk);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!ch.jb(this.dyk)))
    {
      String str = this.TAG;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.dyk;
      z.w(str, "cdntra using cdn trans,  wait cdn service callback! clientid:%s", arrayOfObject3);
    }
    do
    {
      l locall;
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if ((paramInt2 == 0) && (paramInt3 == 0))
                break;
              z.e(this.TAG, "onGYNetEnd failed errtype:" + paramInt2 + " errcode:" + paramInt3);
              v.dX((int)this.dyg);
              v.dW((int)this.dyg);
              com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
              Object[] arrayOfObject1 = new Object[7];
              arrayOfObject1[0] = Integer.valueOf(paramInt3);
              arrayOfObject1[1] = Integer.valueOf(1);
              arrayOfObject1[2] = Long.valueOf(this.startTime);
              arrayOfObject1[3] = Long.valueOf(ch.CM());
              arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
              arrayOfObject1[5] = Integer.valueOf(this.dyl);
              arrayOfObject1[6] = Integer.valueOf(0);
              localn1.d(10420, arrayOfObject1);
              this.dlH.a(paramInt2, paramInt3, paramString, this);
            }
            while (this.dyx == null);
            this.dyx.xY();
            return;
            this.dyw = localadr.hQs;
            if (this.dyw > 16384)
              this.dyw = 16384;
            locall = ap.yg().Q(this.dsz);
            z.v(this.TAG, "onGYNetEnd localId:" + this.dsz + "  totalLen:" + locall.sp() + " offSet:" + locall.getOffset());
            if ((localadr.hUu >= 0) && ((localadr.hUu <= locall.sp()) || (locall.sp() <= 0)))
              break;
            z.e(this.TAG, "onGYNetEnd invalid server return value : startPos = " + localadr.hUu + " img totalLen = " + locall.sp());
            v.dX((int)this.dyg);
            v.dW((int)this.dyg);
            com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
            Object[] arrayOfObject2 = new Object[7];
            arrayOfObject2[0] = Integer.valueOf(-2);
            arrayOfObject2[1] = Integer.valueOf(1);
            arrayOfObject2[2] = Long.valueOf(this.startTime);
            arrayOfObject2[3] = Long.valueOf(ch.CM());
            arrayOfObject2[4] = Integer.valueOf(i.z(ak.getContext()));
            arrayOfObject2[5] = Integer.valueOf(this.dyl);
            arrayOfObject2[6] = Integer.valueOf(0);
            localn2.d(10420, arrayOfObject2);
            this.dlH.a(4, -2, "", this);
          }
          while (this.dyx == null);
          this.dyx.xY();
          return;
          if ((localadr.hUu >= locall.getOffset()) && ((!m.b(locall)) || (this.dyw > 0)))
            break;
          z.e(this.TAG, "onGYNetEnd invalid data startPos = " + localadr.hUu + " totalLen = " + locall.sp() + " off:" + locall.getOffset());
          v.dX((int)this.dyg);
          v.dW((int)this.dyg);
          this.dlH.a(4, -1, "", this);
        }
        while (this.dyx == null);
        this.dyx.xY();
        return;
        z.d("ImgInfoLogic", "resp.rImpl.getStartPos() " + localadr.hUu);
      }
      while ((!a(locall, localadr.hUu, localadr.hOY, localadr.hOV)) || (a(tp(), this.dlH) >= 0));
      v.dW((int)this.dyg);
      this.dlH.a(3, -1, "", this);
    }
    while (this.dyx == null);
    this.dyx.xY();
  }

  public final void a(am paramam)
  {
    this.dyx = paramam;
  }

  public final int getType()
  {
    return 110;
  }

  protected final int sB()
  {
    if (this.dyi == 0)
      return 100;
    return 1350;
  }

  public final int yb()
  {
    return (int)this.dyg;
  }

  public final ar yc()
  {
    return this.cCp;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.ag
 * JD-Core Version:    0.6.2
 */