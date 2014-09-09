package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.aba;
import com.tencent.mm.protocal.a.tl;
import com.tencent.mm.protocal.a.tm;
import com.tencent.mm.protocal.a.zb;
import com.tencent.mm.protocal.aw;
import com.tencent.mm.protocal.ax;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ae extends x
  implements ab
{
  private final String dCI;
  private final String dCJ;
  private final String dCK;
  private final String dCL;
  private final String dCM;
  private final String dCN;
  private final int dCO;
  private final int dCP;
  private boolean dCQ;
  private boolean dCR;
  private m dlH;
  private aj dpk;
  private int dua;

  public ae(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, String paramString6, int paramInt2)
  {
    this.dCQ = bool;
    this.dCR = false;
    this.dua = 2;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "NetSceneReg: username = " + paramString1 + " nickname = " + paramString3);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "NetSceneReg: bindUin = " + paramInt1 + "bindEmail = " + paramString4 + " bindMobile = " + paramString5);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "NetSceneReg: regMode = " + paramInt2 + " ticket: " + paramString6);
    this.dCP = paramInt2;
    this.dpk = new ag();
    aw localaw = (aw)this.dpk.tk();
    localaw.bk(0);
    localaw.hNO.gnq = paramString1;
    localaw.hNO.hRj = ch.je(paramString2);
    if (paramInt2 == 4)
    {
      localaw.hNO.hRj = paramString6;
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "dkreg rand:" + paramString6 + " reqMd5:" + localaw.hNO.hRj);
    }
    localaw.hNO.hwV = paramString3;
    localaw.hNO.imL = paramInt1;
    localaw.hNO.iom = paramString4;
    localaw.hNO.ion = paramString5;
    localaw.hNO.hVL = paramString6;
    localaw.hNO.idB = paramInt2;
    localaw.hNO.eJu = ch.aHI();
    localaw.hNO.hVJ = v.getSimCountryIso();
    localaw.hNO.eJv = y.aGW();
    localaw.hNO.inu = 0;
    localaw.hNO.ioq = 0;
    localaw.hNO.ior = v.getAndroidId();
    localaw.hNO.hXg = v.ni();
    localaw.hNO.ios = ak.getContext().getSharedPreferences(ak.aHi(), 0).getString("installreferer", "");
    this.dCI = paramString1;
    this.dCJ = paramString2;
    this.dCK = paramString3;
    this.dCL = paramString4;
    this.dCM = paramString5;
    this.dCO = paramInt1;
    this.dCN = "";
    if (((paramString6 == null) || (paramString6.length() <= 0)) && (paramString4.length() <= 0));
    while (true)
    {
      this.dCQ = bool;
      localaw.hNO.hRg = bg.qS();
      return;
      bool = false;
    }
  }

  public ae(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, String paramString6, int paramInt2, String paramString7, String paramString8, String paramString9, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.dCQ = true;
    this.dCR = false;
    this.dua = 2;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "NetSceneReg: username = " + paramString1 + " nickname = " + paramString3);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "NetSceneReg: bindUin = " + paramInt1 + "bindEmail = " + paramString4 + " bindMobile = " + paramString5);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "NetSceneReg: regMode = " + paramInt2 + " ticket: " + paramString6);
    this.dCP = paramInt2;
    this.dpk = new ag();
    aw localaw = (aw)this.dpk.tk();
    localaw.bk(0);
    localaw.hNO.gnq = paramString1;
    localaw.hNO.hRj = ch.je(paramString2);
    if (paramInt2 == 4)
    {
      localaw.hNO.hRj = paramString6;
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "dkreg rand:" + paramString6 + " reqMd5:" + localaw.hNO.hRj);
    }
    localaw.hNO.hwV = paramString3;
    localaw.hNO.imL = paramInt1;
    localaw.hNO.iom = paramString4;
    localaw.hNO.ion = paramString5;
    localaw.hNO.hVL = paramString6;
    localaw.hNO.idB = paramInt2;
    localaw.hNO.eJu = ch.aHI();
    localaw.hNO.hVJ = v.getSimCountryIso();
    localaw.hNO.eJv = y.aGW();
    localaw.hNO.inu = 0;
    localaw.hNO.dti = paramString7;
    localaw.hNO.idA = paramString9;
    localaw.hNO.idz = paramString8;
    tl localtl1 = localaw.hNO;
    int i;
    int j;
    if (paramBoolean1)
    {
      i = 1;
      localtl1.hRa = i;
      tl localtl2 = localaw.hNO;
      if (!paramBoolean2)
        break label564;
      j = 1;
      label416: localtl2.iop = j;
      localaw.hNO.hRg = bg.qS();
      localaw.hNO.ior = v.getAndroidId();
      localaw.hNO.hXg = v.ni();
      localaw.hNO.ios = ak.getContext().getSharedPreferences(ak.aHi(), 0).getString("installreferer", "");
      this.dCI = paramString1;
      this.dCJ = paramString2;
      this.dCK = paramString3;
      this.dCL = paramString4;
      this.dCM = paramString5;
      this.dCO = paramInt1;
      this.dCN = paramString7;
      if (((paramString6 != null) && (paramString6.length() > 0)) || ((paramString4 != null) && (paramString4.length() > 0)))
        break label570;
    }
    label564: label570: for (boolean bool = true; ; bool = false)
    {
      this.dCQ = bool;
      return;
      i = 0;
      break;
      j = 0;
      break label416;
    }
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    ax localax = (ax)paramaj.sS();
    if ((paramInt2 == 4) && (paramInt3 == -301))
    {
      bg.a(true, localax.hNP.hRm, localax.hNP.hRn, localax.hNP.hRl);
      this.dua = (-1 + this.dua);
      if (this.dua <= 0)
      {
        this.dlH.a(3, -1, "", this);
        return;
      }
      a(tp(), this.dlH);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    aw localaw = (aw)paramaj.tk();
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "dkreg: pass:" + localax.hNP.inU + " regtype:" + localax.hNP.inQ + " mode:" + localaw.hNO.idB);
    if ((localax.hNP.hQv != 0) && (!this.dCQ))
    {
      bg.cL(localax.hNP.hQv);
      if (localaw.hNO.idB != 4)
        break label779;
      bg.qW().oQ().set(2, localaw.hNO.gnq);
      bg.qW().oQ().set(3, localax.hNP.inU);
      bg.qW().oQ().set(19, localax.hNP.inU);
      bg.qW().oQ().set(16, Integer.valueOf(1));
      bg.qW().oQ().set(52, Integer.valueOf(localax.hNP.inQ));
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localax.hNP.inC;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "dkrsa setautoauthtick:%s", arrayOfObject);
      bg.qP().set(32, "");
      if ((this.dCI != null) && (this.dCI.length() > 0) && (this.dCP != 1))
        localax.hNP.gnq = this.dCI;
      localax.hNP.iom = this.dCL;
      localax.hNP.dZy = 0;
      bg.qW().a(localax, this.dCN, this.dCO, this.dCK, this.dCM);
      bg.qW().oY().ao(localax.hNP.iow, 2);
      if (this.dCO != 0)
        bg.qW().oY().ao(this.dCO + "@qqim", 3);
      bg.a(false, localax.hNP.hRm, localax.hNP.hRn, localax.hNP.hRl);
      bg.qP().set(1, Integer.valueOf(localax.hNP.hQv));
      ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putInt("default_uin", localax.hNP.hQv).commit();
      bg.qW().oQ().Ai();
      bg.qX().d(new ce(new af(this, localax)));
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvkJ8JGhUvp0/", "resp return flag" + localax.hNP.iox);
      if ((0x1 & localax.hNP.iox) == 0)
        break label817;
    }
    label779: label817: for (boolean bool = true; ; bool = false)
    {
      this.dCR = bool;
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(new bq(21, "android-" + Build.VERSION.SDK_INT + "-" + Build.MODEL));
      bg.qW().oS().a(new bp(localLinkedList));
      if ((paramInt2 == 0) && (paramInt3 == 0))
        com.tencent.mm.plugin.a.b.eT(ws());
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      bg.qW().oQ().set(3, ch.je(this.dCJ));
      bg.qW().oQ().set(19, ch.jf(this.dCJ));
      break;
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
  }

  public final void ef(int paramInt)
  {
    ((aw)this.dpk.tk()).hNO.ioq = paramInt;
  }

  public final int getType()
  {
    return 126;
  }

  protected final int sB()
  {
    return 3;
  }

  public final byte[] wB()
  {
    return ai.a(((ax)this.dpk.sS()).hNP.idC, new byte[0]);
  }

  public final String wC()
  {
    return ((ax)this.dpk.sS()).hNP.idz;
  }

  public final int ws()
  {
    zb localzb = ((ax)this.dpk.sS()).hNP.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 1)
          return ch.getInt(localaba.iuZ, 0);
      }
    }
    return 0;
  }

  public final String zA()
  {
    return ((ax)this.dpk.sS()).hNP.ioy;
  }

  public final String zB()
  {
    zb localzb = ((ax)this.dpk.sS()).hNP.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 2)
          return localaba.iuZ;
      }
    }
    return "";
  }

  public final int zC()
  {
    zb localzb = ((ax)this.dpk.sS()).hNP.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 3)
          return ch.getInt(localaba.iuZ, 2);
      }
    }
    return 2;
  }

  public final String zD()
  {
    zb localzb = ((ax)this.dpk.sS()).hNP.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 17)
          return localaba.iuZ;
      }
    }
    return null;
  }

  public final boolean zz()
  {
    return this.dCR;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ae
 * JD-Core Version:    0.6.2
 */