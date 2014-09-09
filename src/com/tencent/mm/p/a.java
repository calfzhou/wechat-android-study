package com.tencent.mm.p;

import com.tencent.mm.a.k;
import com.tencent.mm.c.a.mi;
import com.tencent.mm.c.a.mk;
import com.tencent.mm.model.bg;
import com.tencent.mm.n.c;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.ca;
import com.tencent.mm.protocal.a.cb;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.e;

public final class a extends x
  implements ab
{
  private String cFd;
  private String cFf;
  private m dlH;
  private final com.tencent.mm.o.a dmI;

  public a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new ca());
    localb.b(new cb());
    localb.fi("/cgi-bin/micromsg-bin/bindqq");
    localb.de(144);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ca localca = (ca)this.dmI.sO();
    localca.hRv = new k(paramLong).intValue();
    localca.hRj = ch.je(paramString1);
    localca.hRw = ch.jf(paramString1);
    localca.hRx = paramString2;
    localca.hRA = paramString3;
    localca.hRB = paramInt;
    localca.hRC = new vt().wF(paramString4);
    String str = ch.ja((String)bg.qW().oQ().get(47));
    localca.hRD = new ws().cl(ch.jg(str));
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvjIdRoK4ErSN", " init opcode:" + paramInt + " uin:" + paramLong + " imgSid:" + paramString2 + " imgCode:" + paramString3 + " encryptKey:" + paramString4 + " ksid:" + str);
  }

  public a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this(paramLong, paramString1, paramString2, paramString3, paramString4, 1);
    this.cFd = paramString5;
    this.cFf = paramString6;
    ca localca = (ca)this.dmI.sO();
    localca.hRb = paramString5;
    localca.hRc = paramString6;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvjIdRoK4ErSN", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvjIdRoK4ErSN", "onGYNetEnd imgsid:" + ((cb)this.dmI.sP()).hRx);
    ca localca = (ca)this.dmI.sO();
    cb localcb = (cb)this.dmI.sP();
    boolean bool;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bg.qW().oQ().set(9, Integer.valueOf(localca.hRv));
      if (localca.hRB == 1)
        bg.qW().oQ().set(17, Integer.valueOf(localcb.hRF));
      cl localcl = bg.qW().oY();
      String str1 = localcb.hRH;
      if (localcb.hRG == 1)
      {
        bool = true;
        localcl.L(str1, bool);
        int i = localca.hRv;
        if (i != 0)
          bg.qW().oY().ao(new k(i) + "@qqim", 3);
        c.c(i, 3);
        bg.qW().oQ().set(32, localca.hRj);
        bg.qW().oQ().set(33, localca.hRw);
        bg.qW().oQ().set(46, ch.cH(ai.a(localcb.hRJ)));
        String str2 = ch.cH(ai.a(localca.hRD));
        bg.qW().oQ().set(47, str2);
        bg.qP().set(18, str2);
        bg.qW().oQ().set(-1535680990, localcb.hRI);
        if ((!ch.jb(this.cFd)) && (!ch.jb(this.cFf)))
        {
          bg.qW().oQ().set(64, Integer.valueOf(localcb.hRo));
          mi localmi = new mi();
          localmi.cPc.cPd = localcb;
          com.tencent.mm.sdk.c.a.aGB().g(localmi);
          mk localmk = new mk();
          localmk.cPe.cPf = true;
          localmk.cPe.cPg = true;
          com.tencent.mm.sdk.c.a.aGB().g(localmk);
        }
      }
    }
    while (true)
    {
      if ((localca.hRB == 3) && (paramInt3 == -3))
      {
        paramInt3 = 10000;
        z.d("!32@/B4Tb64lLpK+IBX8XDgnvjIdRoK4ErSN", "onGYNetEnd : retCode = 10000");
      }
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      bool = false;
      break;
      if (paramInt2 == 4)
      {
        bg.qW().oQ().set(32, "");
        bg.qW().oQ().set(33, "");
      }
    }
  }

  public final int getType()
  {
    return 144;
  }

  public final byte[] tW()
  {
    return ai.a(((cb)this.dmI.sP()).hOU);
  }

  public final String tX()
  {
    return ((cb)this.dmI.sP()).hRx;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.p.a
 * JD-Core Version:    0.6.2
 */