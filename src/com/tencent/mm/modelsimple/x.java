package com.tencent.mm.modelsimple;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.cm;
import com.tencent.mm.protocal.a.jk;
import com.tencent.mm.protocal.a.jn;
import com.tencent.mm.protocal.a.jo;
import com.tencent.mm.protocal.a.pp;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class x extends com.tencent.mm.o.x
  implements ab
{
  private m dlH;
  private final a dmI;

  private x()
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new jn());
    localb.b(new jo());
    localb.fi("/cgi-bin/micromsg-bin/geta8key");
    localb.de(233);
    localb.df(155);
    localb.dg(1000000155);
    this.dmI = localb.sU();
    jn localjn = (jn)this.dmI.sO();
    String str1 = ch.ja((String)bg.qW().oQ().get(46));
    localjn.hRJ = new ws().cl(ch.jg(str1));
    String str2 = ch.ja((String)bg.qW().oQ().get(72));
    localjn.iau = new ws().cl(ch.jg(str2));
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsdziV4e3bhfru5SsF4Dqh0=", "dkwt get a2=" + str1 + " newa2=" + str2);
  }

  public x(int paramInt)
  {
    this();
    jn localjn = (jn)this.dmI.sO();
    localjn.hQF = 3;
    localjn.hOi = 5;
    localjn.ias = paramInt;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Integer.valueOf(localjn.hRJ.aLK());
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsdziV4e3bhfru5SsF4Dqh0=", "dkwt geta8key friendQQNum:%d  a2key-len:%d", arrayOfObject);
  }

  public x(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this();
    jn localjn = (jn)this.dmI.sO();
    localjn.hQF = 2;
    localjn.iaq = new vt().wF(paramString1);
    localjn.hOi = paramInt1;
    localjn.gnq = paramString2;
    localjn.iav = paramInt2;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsdziV4e3bhfru5SsF4Dqh0=", "get a8key reqUrl = " + paramString1 + ", username = " + paramString2 + ", scene = " + paramInt1 + ", reason = " + paramInt2);
  }

  public x(String paramString1, String paramString2, String paramString3)
  {
    this();
    jn localjn = (jn)this.dmI.sO();
    localjn.hQF = 1;
    localjn.ian = new vt().wF(paramString1);
    localjn.iao = new vt().wF(paramString2);
    localjn.iap = new vt().wF(paramString3);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsdziV4e3bhfru5SsF4Dqh0=", "get a8key appid=" + paramString1);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    arrayOfObject[2] = zn();
    arrayOfObject[3] = ((jo)this.dmI.sP()).iax;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsdziV4e3bhfru5SsF4Dqh0=", "dkwt geta8key onGYNetEnd:[%d,%d] url:[%s]  a8key:[%s]", arrayOfObject);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final String getContent()
  {
    return ((jo)this.dmI.sP()).fxG;
  }

  public final String getSSID()
  {
    jo localjo = (jo)this.dmI.sP();
    if ((localjo == null) || (localjo.SSID == null))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsdziV4e3bhfru5SsF4Dqh0=", "get ssid failed");
      return null;
    }
    return localjo.SSID;
  }

  public final String getTitle()
  {
    return ((jo)this.dmI.sP()).cCD;
  }

  public final int getType()
  {
    return 233;
  }

  public final int zm()
  {
    return ((jn)this.dmI.sO()).iav;
  }

  public final String zn()
  {
    return ((jo)this.dmI.sP()).iaw;
  }

  public final String zo()
  {
    vt localvt = ((jn)this.dmI.sO()).iaq;
    if (localvt != null)
      return localvt.getString();
    return null;
  }

  public final int zp()
  {
    return ((jo)this.dmI.sP()).hOb;
  }

  public final pp zq()
  {
    return ((jo)this.dmI.sP()).iay;
  }

  public final jk zr()
  {
    return ((jo)this.dmI.sP()).iaz;
  }

  public final String zs()
  {
    return ((jo)this.dmI.sP()).iaA;
  }

  public final ArrayList zt()
  {
    jo localjo = (jo)this.dmI.sP();
    ArrayList localArrayList = new ArrayList();
    if ((localjo == null) || (localjo.iaC == null))
      return localArrayList;
    Iterator localIterator = localjo.iaC.iterator();
    while (localIterator.hasNext())
    {
      cm localcm = (cm)localIterator.next();
      try
      {
        localArrayList.add(localcm.toByteArray());
      }
      catch (IOException localIOException)
      {
      }
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localArrayList.size());
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsdziV4e3bhfru5SsF4Dqh0=", "ScopeList size = %s", arrayOfObject);
    return localArrayList;
  }

  public final String zu()
  {
    jo localjo = (jo)this.dmI.sP();
    if ((localjo == null) || (localjo.hNX == null))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvsdziV4e3bhfru5SsF4Dqh0=", "get mid failed");
      return null;
    }
    return localjo.hNX;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.x
 * JD-Core Version:    0.6.2
 */