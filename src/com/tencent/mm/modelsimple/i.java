package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Process;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.n;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.aw;
import com.tencent.mm.o.u;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a;
import com.tencent.mm.protocal.a.aba;
import com.tencent.mm.protocal.a.td;
import com.tencent.mm.protocal.a.te;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.a.zb;
import com.tencent.mm.protocal.bh;
import com.tencent.mm.protocal.p;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.cm;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.e;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParserException;

public final class i extends x
  implements ab
{
  private String dCj = "";
  private String dCk = "";
  private String dCl = "";
  private String dCm = "";
  private boolean dCn = false;
  private int dCo = 0;
  private com.tencent.mm.o.m dlH;
  private final aj dpk = new u();
  private int dua = 3;

  public i()
  {
    this.dCk = ((String)bg.qW().oQ().get(3));
    this.dCl = ((String)bg.qW().oQ().get(19));
    String str = (String)bg.qW().oQ().get(2);
    int i = aw.fr(str);
    com.tencent.mm.a.k localk = new com.tencent.mm.a.k(com.tencent.mm.sdk.platformtools.ch.a((Integer)bg.qW().oQ().get(9), 0));
    if ((i == 1) && (localk.longValue() > 0L));
    for (this.dCj = localk.toString(); ; this.dCj = str)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = str;
      arrayOfObject[1] = Long.valueOf(localk.longValue());
      arrayOfObject[2] = this.dCj;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkwt NetSceneAuth username:%s qq:%d account:%s ", arrayOfObject);
      a(false, "", "", "", 0);
      return;
    }
  }

  public i(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(paramString1, paramString2, false, "", "", "", paramInt);
    this.dCm = paramString3;
  }

  public i(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4, String paramString5, String paramString6)
  {
    this.dCj = paramString1;
    this.dCk = paramString2;
    this.dCl = paramString3;
    a(paramBoolean, paramString4, paramString5, paramString6, 0);
  }

  public i(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    this.dCj = paramString1;
    this.dCk = com.tencent.mm.sdk.platformtools.ch.je(com.tencent.mm.sdk.platformtools.ch.ja(paramString2));
    this.dCl = com.tencent.mm.sdk.platformtools.ch.jf(com.tencent.mm.sdk.platformtools.ch.ja(paramString2));
    a(paramBoolean, paramString3, paramString4, paramString5, paramInt);
  }

  private void a(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    com.tencent.mm.protocal.k localk = (com.tencent.mm.protocal.k)this.dpk.tk();
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject1[1] = paramString1;
    arrayOfObject1[2] = paramString2;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkwt setPass wtseccode:%b secCode:%s sid:%s", arrayOfObject1);
    int i = aw.fr(this.dCj);
    byte[] arrayOfByte;
    Object[] arrayOfObject2;
    if ((paramBoolean) && (com.tencent.mm.sdk.platformtools.ch.iW(this.dCj)) && (!com.tencent.mm.sdk.platformtools.ch.jb(paramString1)) && (com.tencent.mm.sdk.platformtools.ch.jb(paramString2)) && (com.tencent.mm.sdk.platformtools.ch.jb(paramString3)))
    {
      arrayOfByte = bg.qO().a(Long.parseLong(this.dCj), paramString1);
      arrayOfObject2 = new Object[11];
      arrayOfObject2[0] = this.dCj;
      arrayOfObject2[1] = Integer.valueOf(i);
      arrayOfObject2[2] = Boolean.valueOf(this.dCk.equals(this.dCl));
      arrayOfObject2[3] = Boolean.valueOf(paramBoolean);
      arrayOfObject2[4] = paramString1;
      arrayOfObject2[5] = paramString2;
      if (arrayOfByte != null)
        break label456;
    }
    label456: for (int j = -1; ; j = arrayOfByte.length)
    {
      arrayOfObject2[6] = Integer.valueOf(j);
      arrayOfObject2[7] = localk.hNq.eJu;
      arrayOfObject2[8] = localk.hNq.eJv;
      arrayOfObject2[9] = localk.hNq.hRg;
      arrayOfObject2[10] = localk.hNq.inB;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkwt req account:%s passType:%d full=cut:%b usewt:%b secCode:%s sid:%s loginbuf:%d time:%s lang:%s seq:%s soft:%s", arrayOfObject2);
      if (com.tencent.mm.sdk.platformtools.ch.B(arrayOfByte))
        break label464;
      localk.hNq.inD = new ws().cl(arrayOfByte);
      localk.hNq.iem = new vt().wF("");
      localk.hNq.hRw = "";
      localk.hNq.inv = "";
      localk.hNq.inw = "";
      localk.hNq.jdField_int = new vt().wF("");
      localk.hNq.ien = new vt().wF("");
      localk.hNq.hRC = new vt().wF("");
      return;
      boolean bool1 = com.tencent.mm.sdk.platformtools.ch.iW(this.dCj);
      arrayOfByte = null;
      if (!bool1)
        break;
      arrayOfByte = null;
      if (i == 2)
        break;
      boolean bool2 = this.dCk.equals(this.dCl);
      arrayOfByte = null;
      if (!bool2)
        break;
      arrayOfByte = bg.qO().a(Long.parseLong(this.dCj), this.dCl, true);
      break;
    }
    label464: localk.hNq.iem = new vt().wF(this.dCk);
    localk.hNq.hRw = this.dCl;
    localk.hNq.inv = this.dCk;
    localk.hNq.inw = this.dCl;
    localk.hNq.jdField_int = new vt().wF(paramString1);
    localk.hNq.ien = new vt().wF(paramString2);
    localk.hNq.hRC = new vt().wF(paramString3);
    localk.hNq.inD = new ws().cl(new byte[0]);
  }

  private void a(boolean paramBoolean, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    com.tencent.mm.protocal.k localk = (com.tencent.mm.protocal.k)this.dpk.tk();
    localk.bk(0);
    localk.hNq.hQZ = this.dCm;
    localk.hNq.eJu = com.tencent.mm.sdk.platformtools.ch.aHI();
    localk.hNq.eJv = y.aGW();
    localk.di(1);
    localk.hNq.inu = 0;
    localk.hNq.inx = v.ng();
    localk.hNq.hRD = new ws().cl(com.tencent.mm.sdk.platformtools.ch.jg((String)bg.qP().get(18)));
    localk.hNq.hSn = a.hrh;
    localk.hNq.hSm = a.hri;
    localk.hNq.inA = a.hrj;
    localk.hNq.ieD = cm.aKL();
    localk.hNq.dtg = com.tencent.mm.model.ch.ry();
    localk.hNq.inB = com.tencent.mm.model.ch.rz();
    localk.hNq.hRd = new ws().cl(com.tencent.mm.sdk.platformtools.ch.aHG());
    localk.hNq.inE = paramInt;
    td localtd = localk.hNq;
    if (com.tencent.mm.sdk.platformtools.l.iDv);
    for (String str = ak.getContext().getString(n.cbC); ; str = ak.getContext().getString(n.cbB))
    {
      localtd.eJw = str;
      localk.hNq.hVf = new vt().wF(this.dCj);
      localk.hNq.hRg = bg.qS();
      a(paramBoolean, paramString1, paramString2, paramString3);
      return;
    }
  }

  private int ws()
  {
    zb localzb = ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 1)
          return com.tencent.mm.sdk.platformtools.ch.getInt(localaba.iuZ, 0);
      }
    }
    return 0;
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt2);
    arrayOfObject1[1] = Integer.valueOf(paramInt3);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkwt onGYNetEnd  errType:%d errCode:%d", arrayOfObject1);
    com.tencent.mm.protocal.l locall = (com.tencent.mm.protocal.l)paramaj.sS();
    com.tencent.mm.a.k localk = new com.tencent.mm.a.k(locall.hNr.imL);
    boolean bool1 = bg.qO().a(localk.longValue(), ai.a(locall.hNr.iod));
    Object[] arrayOfObject2 = new Object[5];
    arrayOfObject2[0] = locall.hNr.hVf;
    arrayOfObject2[1] = Integer.valueOf(locall.hNr.ioc);
    if (locall.hNr.iod == null);
    for (int i = -1; ; i = locall.hNr.iod.aLK())
    {
      arrayOfObject2[2] = Integer.valueOf(i);
      arrayOfObject2[3] = Long.valueOf(localk.longValue());
      arrayOfObject2[4] = Boolean.valueOf(bool1);
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkwt resp user:%s resp.rImpl.getNextAuthType():%d  getWTLoginRspBuff:%d uin:%d parseRet:%b", arrayOfObject2);
      if ((paramInt2 == 0) && (paramInt3 == 0))
        break label503;
      if ((paramInt2 != 4) || (paramInt3 != -301))
        break label314;
      bg.a(true, locall.hNr.hRm, locall.hNr.hRn, locall.hNr.hRl);
      Object[] arrayOfObject7 = new Object[2];
      arrayOfObject7[0] = Integer.valueOf(paramInt2);
      arrayOfObject7[1] = Integer.valueOf(paramInt3);
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkidc , doscene again old: errType:%d errCode:%d", arrayOfObject7);
      this.dua = (-1 + this.dua);
      if (this.dua > 0)
        break;
      this.dlH.a(3, -1, "", this);
      return;
    }
    a(tp(), this.dlH);
    return;
    label314: if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      int k = paramaj.tk().aDI().aHy();
      Object[] arrayOfObject6 = new Object[1];
      arrayOfObject6[0] = Integer.valueOf(k);
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkcert  auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", arrayOfObject6);
      bg.qQ().n(new j(this, k));
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -105))
    {
      this.dCo = (1 + this.dCo);
      if (this.dCo > 1)
      {
        this.dlH.a(4, -1, "", this);
        return;
      }
      bg.qO().E(localk.longValue());
      aw.m(this.dCj, 2);
      a(false, "", "", "");
      a(tp(), this.dlH);
      return;
    }
    if ((paramInt2 != 4) || ((paramInt3 != -16) && (paramInt3 != -17)))
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    label503: if (com.tencent.mm.sdk.platformtools.ch.jb(locall.hNr.hVf.getString()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "onGYNetEnd ERROR resp user is null , return false!");
      this.dlH.a(4, -1, "", this);
      return;
    }
    aw.m(this.dCj, locall.hNr.ioc);
    aw.m(locall.hNr.hVf.getString(), locall.hNr.ioc);
    bg.qQ().aHo();
    Object[] arrayOfObject3 = new Object[3];
    arrayOfObject3[0] = com.tencent.mm.a.k.getString(locall.hNr.hQv);
    arrayOfObject3[1] = Thread.currentThread().getName();
    arrayOfObject3[2] = Integer.valueOf(Process.getThreadPriority(Process.myTid()));
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkidc setAccUin Begin uin:%s thread:[%s,%d]", arrayOfObject3);
    com.tencent.mm.compatible.g.l locall1 = new com.tencent.mm.compatible.g.l();
    bg.cL(locall.hNr.hQv);
    Object[] arrayOfObject4 = new Object[4];
    arrayOfObject4[0] = com.tencent.mm.a.k.getString(locall.hNr.hQv);
    arrayOfObject4[1] = Thread.currentThread().getName();
    arrayOfObject4[2] = Integer.valueOf(Process.getThreadPriority(Process.myTid()));
    arrayOfObject4[3] = Long.valueOf(locall1.nM());
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkidc setAccUin End: uin:%s thread:[%s,%d] time:%d", arrayOfObject4);
    bg.qW().oQ().set(3, this.dCk);
    bg.qW().oQ().set(19, this.dCl);
    bg.qW().oQ().set(52, Integer.valueOf(locall.hNr.inQ));
    bg.qW();
    com.tencent.mm.model.b.ci(locall.hNr.imO);
    bg.qW().oR().zZ(locall.hNr.inY);
    Object[] arrayOfObject5 = new Object[1];
    arrayOfObject5[0] = locall.hNr.inC;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkrsa setautoauthtick:%s", arrayOfObject5);
    bg.qP().set(32, "");
    bg.qW().a(locall);
    cl localcl = bg.qW().oY();
    String str = locall.hNr.inK.getString();
    boolean bool2;
    e locale;
    if (locall.hNr.inL == 1)
    {
      bool2 = true;
      localcl.L(str, bool2);
      if (locall.hNr.imL != 0)
        bg.qW().oY().ao(new com.tencent.mm.a.k(locall.hNr.imL) + "@qqim", 3);
      bg.a(false, locall.hNr.hRm, locall.hNr.hRn, locall.hNr.hRl);
      bg.qP().set(1, Integer.valueOf(locall.hNr.hQv));
      ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putInt("default_uin", locall.hNr.hQv).commit();
      bg.qX().d(new ce(new l(this, locall)));
      locale = bg.qW().oQ();
      if (locall.hNr.ioa == 0)
        break label1248;
    }
    label1248: for (int j = 1; ; j = 0)
    {
      locale.set(57, Integer.valueOf(j));
      if (this.dCn)
      {
        com.tencent.mm.protocal.k localk1 = (com.tencent.mm.protocal.k)paramaj.tk();
        bg.qW().oQ().set(2, localk1.hNq.hVf);
        bg.qW().oQ().set(3, this.dCk);
        bg.qW().oQ().set(19, this.dCl);
      }
      bg.qQ().n(new m(this));
      bg.a(locall.hNr.ibf, locall.hNr.ibg, locall.hNr.ibh);
      if ((paramInt2 == 0) && (paramInt3 == 0))
        com.tencent.mm.plugin.a.b.eT(ws());
      bg.qQ().aHq();
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      bool2 = false;
      break;
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
  }

  public final int getInputType()
  {
    return ((com.tencent.mm.protocal.k)this.dpk.tk()).hNq.inE;
  }

  public final int getType()
  {
    return 380;
  }

  public final void hu(String paramString)
  {
    com.tencent.mm.protocal.k localk = (com.tencent.mm.protocal.k)this.dpk.tk();
    localk.hNq.iem = new vt().wF(paramString);
    this.dCk = paramString;
    this.dCl = paramString;
    localk.hNq.hRw = paramString;
    localk.hNq.inv = paramString;
    localk.hNq.inw = paramString;
    this.dCn = true;
  }

  protected final int sB()
  {
    return 5;
  }

  public final String tR()
  {
    return ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hQZ;
  }

  public final byte[] wB()
  {
    if (!yY())
      return ai.a(((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hOU, new byte[0]);
    return bg.qO().C(Long.parseLong(((com.tencent.mm.protocal.k)this.dpk.tk()).hNq.hVf.getString()));
  }

  public final String wC()
  {
    return ai.a(((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.ien, "");
  }

  public final String wm()
  {
    return ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hVL;
  }

  public final int wo()
  {
    zb localzb = ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 6)
          return com.tencent.mm.sdk.platformtools.ch.getInt(localaba.iuZ, 3);
      }
    }
    return 3;
  }

  public final boolean yY()
  {
    return !com.tencent.mm.sdk.platformtools.ch.B(((com.tencent.mm.protocal.k)this.dpk.tk()).hNq.inD.aLL().toByteArray());
  }

  public final String yZ()
  {
    return ai.a(((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hRC, "");
  }

  public final String za()
  {
    return ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.inX;
  }

  public final String zb()
  {
    return ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.imN.getString();
  }

  public final int zc()
  {
    zb localzb = ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 11)
          return com.tencent.mm.sdk.platformtools.ch.getInt(localaba.iuZ, 0);
      }
    }
    return 0;
  }

  public final BindWordingContent zd()
  {
    zb localzb = ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hRu;
    aba localaba;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localaba = (aba)localIterator.next();
      }
      while (localaba.hPS != 12);
    }
    for (String str = localaba.iuZ; ; str = null)
    {
      if (str != null)
      {
        new b();
        try
        {
          BindWordingContent localBindWordingContent = b.hp(str);
          return localBindWordingContent;
        }
        catch (XmlPullParserException localXmlPullParserException)
        {
          return null;
        }
        catch (IOException localIOException)
        {
        }
      }
      return null;
    }
  }

  public final int ze()
  {
    zb localzb = ((com.tencent.mm.protocal.l)this.dpk.sS()).hNr.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 13)
          return com.tencent.mm.sdk.platformtools.ch.getInt(localaba.iuZ, 0);
      }
    }
    return 0;
  }

  public final String zf()
  {
    return this.dCj;
  }

  public final String zg()
  {
    return this.dCk;
  }

  public final String zh()
  {
    return this.dCl;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.i
 * JD-Core Version:    0.6.2
 */