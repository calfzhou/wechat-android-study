package com.tencent.mm.modelsimple;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.oi;
import com.tencent.mm.protocal.a.oj;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class ac extends x
  implements ab
{
  private String dCG;
  private m dlH;
  private final a dmI;

  public ac(String paramString1, String paramString2)
  {
    this.dCG = paramString1;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new oi());
    localb.b(new oj());
    localb.fi("/cgi-bin/micromsg-bin/getwburl");
    localb.de(205);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    oi localoi = (oi)this.dmI.sO();
    localoi.gnq = paramString2;
    String str1 = ch.ja((String)bg.qW().oQ().get(46));
    localoi.hRJ = new ws().cl(ch.jg(str1));
    String str2 = ch.ja((String)bg.qW().oQ().get(72));
    localoi.iau = new ws().cl(ch.jg(str2));
    z.d("!44@/B4Tb64lLpK+IBX8XDgnviIqwNUDvV5bYUO0pvijdXU=", "dkwt get weibo url with id=" + paramString1 + ", a2=" + str1 + " , newa2:" + str2);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    arrayOfObject[2] = getURL();
    z.d("!44@/B4Tb64lLpK+IBX8XDgnviIqwNUDvV5bYUO0pvijdXU=", "dkwt onGYNetEnd:[%d,%d] get weibo url result:[%s] ", arrayOfObject);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 205;
  }

  public final String getURL()
  {
    return ((oj)this.dmI.sP()).URL;
  }

  public final String zx()
  {
    return this.dCG;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ac
 * JD-Core Version:    0.6.2
 */