package com.tencent.mm.modelsimple;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.aek;
import com.tencent.mm.protocal.a.ael;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.e;

public final class as extends x
  implements ab
{
  private m dlH;
  private a dmI;

  public as(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(paramInt, paramString1, paramString2, paramString3, paramString4, (byte)0);
  }

  private as(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, byte paramByte)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new aek());
    localb.b(new ael());
    localb.fi("/cgi-bin/micromsg-bin/newverifypasswd");
    localb.de(384);
    localb.df(182);
    localb.dg(1000000182);
    this.dmI = localb.sU();
    aek localaek = (aek)this.dmI.sO();
    localaek.hQF = paramInt;
    localaek.ixh = ch.je(paramString1);
    localaek.hRw = ch.jf(paramString1);
    localaek.ien = new vt().wF(paramString2);
    localaek.jdField_int = new vt().wF(paramString3);
    localaek.hRC = new vt().wF(paramString4);
    String str = ch.ja((String)bg.qW().oQ().get(47));
    localaek.hRD = new ws().cl(ch.jg(str));
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvlxCgklvyE+S//YbOlSZlXM=", "md5 " + localaek.ixh + " " + localaek.hRw);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    aek localaek = (aek)this.dmI.sO();
    ael localael = (ael)this.dmI.sP();
    int i;
    int j;
    label176: int k;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bg.qW().oQ().set(77830, localael.hVL);
      bg.qW().oQ().set(32, localaek.ixh);
      bg.qW().oQ().set(33, localaek.hRw);
      bg.qW().oQ().set(46, ch.cH(ai.a(localael.hRJ)));
      String str = ch.cH(ai.a(localaek.hRD));
      bg.qW().oQ().set(47, str);
      bg.qP().set(18, str);
      bg.qW().oQ().set(-1535680990, localael.ieG);
      if (localael.hRJ == null)
      {
        i = 0;
        if (localael.ieG != null)
          break label257;
        j = 0;
        if (localael.hVL != null)
          break label270;
        k = 0;
        label187: Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(i);
        arrayOfObject[1] = Integer.valueOf(j);
        arrayOfObject[2] = Integer.valueOf(k);
        z.i("!44@/B4Tb64lLpK+IBX8XDgnvlxCgklvyE+S//YbOlSZlXM=", "A2Key.len %d, authKey.len: %d, ticketLen:%d", arrayOfObject);
      }
    }
    while (true)
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      i = localael.hRJ.aLK();
      break;
      label257: j = localael.ieG.length();
      break label176;
      label270: k = localael.hVL.length();
      break label187;
      if (paramInt2 == 4)
      {
        bg.qW().oQ().set(32, "");
        bg.qW().oQ().set(33, "");
      }
    }
  }

  public final int getType()
  {
    return 384;
  }

  public final byte[] tW()
  {
    return ai.a(((ael)this.dmI.sP()).hOU);
  }

  public final String tX()
  {
    return ai.a(((ael)this.dmI.sP()).ien);
  }

  public final String wm()
  {
    try
    {
      String str = ((ael)this.dmI.sP()).hVL;
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.as
 * JD-Core Version:    0.6.2
 */