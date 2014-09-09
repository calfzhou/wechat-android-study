package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.aj;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.c;
import com.tencent.mm.o.d;
import com.tencent.mm.pluginsdk.ad;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.protocal.a.yg;
import com.tencent.mm.protocal.a.yh;
import com.tencent.mm.sdk.platformtools.z;

public final class au extends ac
{
  private int cmdId;

  public au(String paramString1, int paramInt, String paramString2)
  {
    b localb = new b();
    localb.a(new yg());
    localb.b(new yh());
    localb.fi("/cgi-bin/micromsg-bin/setappsetting");
    localb.de(396);
    localb.df(0);
    localb.dg(0);
    this.eJc = localb.sU();
    yg localyg = (yg)this.eJc.sO();
    localyg.hsT = paramString1;
    localyg.irP = paramInt;
    localyg.irQ = paramString2;
    this.cmdId = paramInt;
  }

  public final byte[] Ue()
  {
    try
    {
      byte[] arrayOfByte = ((c)this.eJc.tk()).sW();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvq6bIa6Rxwzgw+QPaWslRFI=", "toProtBuf failed: " + localException.getMessage());
    }
    return null;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvq6bIa6Rxwzgw+QPaWslRFI=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt2 == 0))
    {
      yh localyh = (yh)this.eJc.sP();
      if (localyh != null)
      {
        o localo = g.axW().ayd();
        k localk = l.F(localyh.hsT, false);
        if (localk != null)
        {
          localk.field_authFlag = localyh.hPy;
          boolean bool = localo.a(localk, new String[0]);
          z.d("!44@/B4Tb64lLpK+IBX8XDgnvq6bIa6Rxwzgw+QPaWslRFI=", "onGYNetEnd, update ret = " + bool + ", appId = " + localyh.hsT);
        }
      }
    }
  }

  public final void ac(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvq6bIa6Rxwzgw+QPaWslRFI=", "buf is null");
      return;
    }
    try
    {
      this.eJc.sQ().r(paramArrayOfByte);
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvq6bIa6Rxwzgw+QPaWslRFI=", "parse error: " + localException.getMessage());
    }
  }

  public final int ayW()
  {
    return this.cmdId;
  }

  public final int getType()
  {
    return 2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.au
 * JD-Core Version:    0.6.2
 */