package com.tencent.mm.ah;

import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.adl;
import com.tencent.mm.protocal.a.ado;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

public final class a extends x
  implements ab
{
  private String dDg = null;
  private String dDh = null;
  private int dDi = 0;
  private int dDj = 5;
  private m dlH;
  private com.tencent.mm.o.a dmI;
  ay dmV = new ay(new b(this), true);
  private String filename = null;

  public a(String paramString, int paramInt)
  {
    this.filename = paramString;
    this.dDj = paramInt;
    int i = c.ab(this.filename);
    this.dDh = f.d(c.a(this.filename, 0, i));
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    int i = 3960;
    this.dlH = paramm;
    int j = c.ab(this.filename);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", k.nL() + " read file:" + this.filename + " filelen:" + j + " oldoff:" + this.dDi + "this.filemd5 " + this.dDh);
    if (j <= 0)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", "read failed :" + this.filename);
      return -1;
    }
    int k = j - this.dDi;
    if (k > i);
    while (true)
    {
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", k.nL() + " read file:" + this.filename + " filelen:" + j + " oldoff:" + this.dDi + "  canReadLen " + i);
      byte[] arrayOfByte = c.a(this.filename, this.dDi, i);
      com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
      localb.a(new adl());
      localb.b(new ado());
      localb.fi("/cgi-bin/micromsg-bin/mmuploadmedia");
      localb.de(240);
      localb.df(111);
      localb.dg(1000000111);
      this.dmI = localb.sU();
      adl localadl = (adl)this.dmI.sO();
      localadl.iwp = new vt().wF(this.dDg);
      localadl.hQi = new ws().cl(arrayOfByte);
      localadl.hQs = arrayOfByte.length;
      localadl.iwq = new vt().wF(this.dDh);
      localadl.hQk = j;
      localadl.hUu = this.dDi;
      localadl.iwr = this.dDj;
      return a(paramr, this.dmI, this);
      i = k;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", k.nL() + " onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    adl localadl = (adl)((com.tencent.mm.o.a)paramaj).sO();
    ado localado = (ado)((com.tencent.mm.o.a)paramaj).sP();
    String str = localado.hQq;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", "md5  " + str + "  " + localado.toString());
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", k.nL() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", k.nL() + " onGYNetEnd  file:" + this.filename);
    if ((localadl.hQk <= localadl.hQs + localadl.hUu) && (str != null) && (!str.equals("0")))
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dDi = (localadl.hUu + localadl.hQi.aLK());
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", "onGYNetEnd file:" + this.filename + " delay:500");
    this.dmV.cP(500L);
  }

  public final String getFileName()
  {
    return this.filename;
  }

  public final int getType()
  {
    return 240;
  }

  protected final int sB()
  {
    return 60;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.a
 * JD-Core Version:    0.6.2
 */