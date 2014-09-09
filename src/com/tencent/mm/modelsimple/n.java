package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.u;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a;
import com.tencent.mm.protocal.a.td;
import com.tencent.mm.protocal.a.te;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.bh;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.p;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.cm;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.e;

public final class n extends x
  implements ab
{
  private String dCt = "";
  private String dCu = "";
  private m dlH;
  private final aj dpk = new u();
  private int dua = 2;

  public n(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    com.tencent.mm.protocal.k localk = (com.tencent.mm.protocal.k)this.dpk.tk();
    localk.bk(0);
    localk.hNq.hVf = new vt().wF(paramString1);
    this.dCt = paramString2;
    this.dCu = "";
    localk.hNq.iem = new vt().wF(this.dCt);
    localk.hNq.hRw = this.dCu;
    localk.hNq.inv = this.dCt;
    localk.hNq.inw = this.dCu;
    localk.hNq.jdField_int = new vt().wF(paramString3);
    localk.hNq.ien = new vt().wF(paramString4);
    localk.hNq.eJu = ch.aHI();
    localk.hNq.eJv = y.aGW();
    localk.di(1);
    localk.hNq.inu = 0;
    localk.hNq.inx = v.ng();
    localk.hNq.hRC = new vt().wF(paramString5);
    localk.hNq.hRD = new ws().cl(ch.jg((String)bg.qP().get(18)));
    localk.hNq.hSn = a.hrh;
    localk.hNq.hSm = a.hri;
    localk.hNq.inA = a.hrj;
    localk.hNq.ieD = cm.aKL();
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvvg1+4U6Dcrr", "psw=" + localk.hNq.iem + ", psw2=" + localk.hNq.hRw + ", lang=" + localk.hNq.eJv);
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
    l locall = (l)paramaj.sS();
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (paramInt3 == -301))
      {
        bg.a(true, locall.hNr.hRm, locall.hNr.hRn, locall.hNr.hRl);
        this.dua = (-1 + this.dua);
        if (this.dua <= 0)
        {
          this.dlH.a(3, -1, "", this);
          return;
        }
        a(tp(), this.dlH);
        return;
      }
      if ((paramInt2 == 4) && (paramInt3 == -102))
      {
        int j = paramaj.tk().aDI().aHy();
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(j);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvvg1+4U6Dcrr", "dkcert  auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", arrayOfObject2);
        bg.qQ().n(new o(this, j));
        return;
      }
      if ((paramInt2 != 4) || ((paramInt3 != -16) && (paramInt3 != -17)))
      {
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    }
    bg.cL(locall.hNr.hQv);
    bg.qW().oQ().set(3, locall.hNr.inU);
    bg.qW().oQ().set(52, Integer.valueOf(locall.hNr.inQ));
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = locall.hNr.inC;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvvg1+4U6Dcrr", "dkrsa set autoauthticket:%s", arrayOfObject1);
    bg.qP().set(32, "");
    bg.qW();
    b.ci(locall.hNr.imO);
    bg.qW().oR().zZ(locall.hNr.inY);
    e locale = bg.qW().oQ();
    int i;
    cl localcl;
    String str;
    if (locall.hNr.ioa != 0)
    {
      i = 1;
      locale.set(57, Integer.valueOf(i));
      bg.qW().a(locall);
      localcl = bg.qW().oY();
      str = locall.hNr.inK.getString();
      if (locall.hNr.inL != 1)
        break label651;
    }
    label651: for (boolean bool = true; ; bool = false)
    {
      localcl.L(str, bool);
      if (locall.hNr.imL != 0)
        bg.qW().oY().ao(new com.tencent.mm.a.k(locall.hNr.imL) + "@qqim", 3);
      bg.a(false, locall.hNr.hRm, locall.hNr.hRn, locall.hNr.hRl);
      bg.qP().set(1, Integer.valueOf(locall.hNr.hQv));
      ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putInt("default_uin", locall.hNr.hQv).commit();
      bg.qX().d(new ce(new q(this, locall)));
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpK+IBX8XDgnvvg1+4U6Dcrr", "IsAutoReg = " + locall.hNr.inV);
      bg.qW().oQ().set(65833, Integer.valueOf(locall.hNr.inV));
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      i = 0;
      break;
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
  }

  public final int getType()
  {
    return 380;
  }

  protected final int sB()
  {
    return 3;
  }

  public final String za()
  {
    try
    {
      String str = ((l)this.dpk.sS()).hNr.inX;
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.n
 * JD-Core Version:    0.6.2
 */