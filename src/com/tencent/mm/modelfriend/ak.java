package com.tencent.mm.modelfriend;

import android.content.Context;
import com.tencent.mm.c.a.mi;
import com.tencent.mm.c.a.mk;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.by;
import com.tencent.mm.protocal.a.bz;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class ak extends x
  implements ab
{
  private String cFd;
  private String cFf;
  private m dlH = null;
  private final com.tencent.mm.o.a dmI;

  public ak(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new by());
    localb.b(new bz());
    localb.fi("/cgi-bin/micromsg-bin/bindopmobile");
    localb.de(132);
    localb.df(45);
    localb.dg(1000000045);
    this.dmI = localb.sU();
    by localby = (by)this.dmI.sO();
    localby.hQH = paramInt1;
    localby.hQX = paramInt2;
    localby.hQY = paramString3;
    String str;
    if ((ch.jb(this.cFd)) && (ch.jb(this.cFf)))
    {
      if (l.iDv)
      {
        str = com.tencent.mm.sdk.platformtools.ak.getContext().getString(n.cbC);
        localby.hRb = str;
        localby.hRc = com.tencent.mm.protocal.a.hrm;
      }
    }
    else
    {
      if ((paramString1 == null) || (paramString1.length() <= 0) || ((paramInt1 != 1) && (paramInt1 != 4) && (paramInt1 != 18)))
        break label278;
      bg.qW().oQ().set(4097, paramString1);
    }
    while (true)
    {
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvmzqgoquDYqOHJ2BkZdfhUE=", "Get mobile:" + paramString1 + " opcode:" + paramInt1 + " verifyCode:" + paramString2);
      localby.hQV = paramString1;
      localby.hQW = paramString2;
      localby.eJv = y.aGW();
      return;
      str = com.tencent.mm.sdk.platformtools.ak.getContext().getString(n.cbB);
      break;
      label278: if ((paramInt1 == 2) || (paramInt1 == 19))
        paramString1 = (String)bg.qW().oQ().get(4097);
      else if (paramInt1 == 3)
        paramString1 = (String)bg.qW().oQ().get(6);
    }
  }

  public ak(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(paramString1, paramInt, paramString2, 0, paramString3);
    this.cFd = paramString4;
    this.cFf = paramString5;
    by localby = (by)this.dmI.sO();
    localby.hRb = paramString4;
    localby.hRc = paramString5;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    by localby = (by)this.dmI.sO();
    if ((localby.hQV == null) || (localby.hQV.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvmzqgoquDYqOHJ2BkZdfhUE=", "doScene getMobile Error: " + localby.hQV);
      return -1;
    }
    if (((localby.hQH == 2) || (localby.hQH == 19)) && ((localby.hQW == null) || (localby.hQW.length() <= 0)))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvmzqgoquDYqOHJ2BkZdfhUE=", "doScene getVerifyCode Error: " + localby.hQV);
      return -1;
    }
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvmzqgoquDYqOHJ2BkZdfhUE=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    by localby = (by)this.dmI.sO();
    bz localbz = (bz)this.dmI.sP();
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvmzqgoquDYqOHJ2BkZdfhUE=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " sms:" + localbz.hRh + "safedevice status = " + localbz.hRo);
    if ((localby.hQH == 2) || (localby.hQH == 4) || (localby.hQH == 11) || (localby.hQH == 19))
    {
      bg.qW().oQ().set(4097, "");
      bg.qW().oQ().set(6, localby.hQV);
      if ((ch.jb(this.cFd)) || (ch.jb(this.cFf)))
        aa.vY();
      if ((!ch.jb(this.cFd)) && (!ch.jb(this.cFf)))
      {
        mi localmi = new mi();
        localmi.cPc.cPd = localbz;
        com.tencent.mm.sdk.c.a.aGB().g(localmi);
        bg.qW().oQ().set(64, Integer.valueOf(localbz.hRo));
        mk localmk1 = new mk();
        localmk1.cPe.cPf = true;
        localmk1.cPe.cPg = true;
        com.tencent.mm.sdk.c.a.aGB().g(localmk1);
      }
      if (localby.hQH == 19)
        bg.qW().oQ().set(12322, null);
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvmzqgoquDYqOHJ2BkZdfhUE=", "onGYNetEnd  mobile binded");
    }
    while (true)
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      if (localby.hQH == 3)
      {
        bg.qW().oQ().set(4097, "");
        bg.qW().oQ().set(6, "");
        bg.qW().oQ().set(12322, null);
        bg.qW().oQ().set(64, Integer.valueOf(localbz.hRo));
        mk localmk2 = new mk();
        localmk2.cPe.cPf = false;
        localmk2.cPe.cPg = true;
        com.tencent.mm.sdk.c.a.aGB().g(localmk2);
        aa.wf();
        aa.wg();
        z.d("!44@/B4Tb64lLpK+IBX8XDgnvmzqgoquDYqOHJ2BkZdfhUE=", "onGYNetEnd  mobile unbinded");
      }
    }
  }

  public final int getType()
  {
    return 132;
  }

  public final int sg()
  {
    return ((by)this.dmI.sO()).hQH;
  }

  public final String tR()
  {
    return ((bz)this.dmI.sP()).hQZ;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ak
 * JD-Core Version:    0.6.2
 */