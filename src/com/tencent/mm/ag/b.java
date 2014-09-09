package com.tencent.mm.ag;

import com.tencent.mm.a.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.acz;
import com.tencent.mm.protocal.a.ada;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.io.File;

public final class b extends x
  implements ab
{
  private String dBh;
  public String dBi;
  private m dlH;
  private com.tencent.mm.o.a dmI;
  private String dnQ;
  private int dny;
  private int dnz;
  private String username;

  private b(String paramString)
  {
    this.username = paramString;
    this.dny = 0;
    this.dnz = 0;
    this.dBh = (bg.qW().oD() + System.currentTimeMillis());
  }

  public b(String paramString1, String paramString2)
  {
    this(paramString1);
    this.dnQ = paramString2;
  }

  protected final int a(aj paramaj)
  {
    if ((this.dnQ == null) || (this.dnQ.length() == 0))
      return aa.doN;
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    if ((this.dnQ == null) || (this.dnQ.length() == 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvjY2DyX+fP1K/57DHO42Izw=", "imgPath is null or length = 0");
      return -1;
    }
    if (!c.ac(this.dnQ))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvjY2DyX+fP1K/57DHO42Izw=", "The img does not exist, imgPath = " + this.dnQ);
      return -1;
    }
    if (this.dny == 0)
      this.dny = ((int)new File(this.dnQ).length());
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new acz());
    localb.b(new ada());
    localb.fi("/cgi-bin/micromsg-bin/uploadcardimg");
    localb.de(575);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    int i = Math.min(this.dny - this.dnz, 32768);
    byte[] arrayOfByte = c.a(this.dnQ, this.dnz, i);
    if (arrayOfByte == null)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvjY2DyX+fP1K/57DHO42Izw=", "readFromFile error");
      return -1;
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(arrayOfByte.length);
    arrayOfObject[1] = Integer.valueOf(this.dny);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvjY2DyX+fP1K/57DHO42Izw=", "doScene uploadLen:%d, total: %d", arrayOfObject);
    acz localacz = (acz)this.dmI.sO();
    localacz.hVp = this.username;
    localacz.hQk = this.dny;
    localacz.hUu = this.dnz;
    localacz.hQi = new ws().cl(arrayOfByte);
    localacz.hQs = localacz.hQi.aLK();
    localacz.hOJ = this.dBh;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvjY2DyX+fP1K/57DHO42Izw=", "onGYNetEnd:%s, %s", arrayOfObject);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvjY2DyX+fP1K/57DHO42Izw=", "upload card img error");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    ada localada = (ada)((com.tencent.mm.o.a)paramaj).sP();
    this.dBi = localada.imp;
    this.dnz = localada.hUu;
    if (this.dnz < this.dny)
    {
      if (a(tp(), this.dlH) < 0)
      {
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvjY2DyX+fP1K/57DHO42Izw=", "doScene again failed");
        this.dlH.a(3, -1, "", this);
      }
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvjY2DyX+fP1K/57DHO42Izw=", "doScene again");
      return;
    }
    if (!ch.jb(this.dBi))
    {
      i locali = bg.qW().oT().ys(this.username);
      if ((locali != null) && ((int)locali.dhv > 0) && (com.tencent.mm.g.a.cv(locali.getType())))
      {
        locali.bq(this.dBi);
        bg.qW().oT().a(this.username, locali);
      }
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 575;
  }

  protected final int sB()
  {
    return 100;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ag.b
 * JD-Core Version:    0.6.2
 */