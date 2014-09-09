package com.tencent.mm.al;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.aer;
import com.tencent.mm.protocal.a.aes;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ay;
import java.util.LinkedList;

public final class b extends a
  implements ab
{
  private int cIm = 0;
  private int dDi = 0;
  private boolean dHb = false;
  private long dIX = -1L;
  private boolean dIY = false;
  private int dIZ;
  private String[] dJa = new String[0];
  private m dlH;
  private com.tencent.mm.o.a dmI;
  ay dmV = new ay(new c(this), true);
  private String filename = null;

  public b(String paramString, int paramInt)
  {
    this.filename = paramString;
    this.dIZ = paramInt;
  }

  public final int AJ()
  {
    return this.cIm;
  }

  public final void BR()
  {
    this.dHb = true;
  }

  public final String[] BS()
  {
    return this.dJa;
  }

  public final long BT()
  {
    return this.dIX;
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    int i = 3960;
    this.dlH = paramm;
    int j = com.tencent.mm.a.c.ab(this.filename);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " read file:" + this.filename + " filelen:" + j + " oldoff:" + this.dDi + " isFin:" + this.dHb);
    if (j <= 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", "read failed :" + this.filename);
      this.cIm = (40000 + k.nJ());
      return -1;
    }
    int k = j - this.dDi;
    if (k > i);
    byte[] arrayOfByte;
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " read file:" + this.filename + " filelen:" + j + " oldoff:" + this.dDi + " isFin:" + this.dHb + " endFlag:" + this.dIY);
      arrayOfByte = com.tencent.mm.a.c.a(this.filename, this.dDi, i);
      if (arrayOfByte != null)
        break;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " read failed :" + this.filename + " read:" + i);
      this.cIm = (40000 + k.nJ());
      return -1;
      if ((k < 3300) && (!this.dHb))
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " read failed :" + this.filename + "can read:" + k + " isfinish:" + this.dHb);
        this.cIm = (40000 + k.nJ());
        return -1;
      }
      if (this.dHb)
        this.dIY = true;
      i = k;
    }
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new aer());
    localb.b(new aes());
    localb.fi("/cgi-bin/micromsg-bin/voiceaddr");
    localb.de(206);
    localb.df(94);
    localb.dg(1000000094);
    this.dmI = localb.sU();
    aer localaer = (aer)this.dmI.sO();
    localaer.hQi = new ws().cl(arrayOfByte);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " read file:" + this.filename + " readlen:" + arrayOfByte.length + " datalen:" + localaer.hQi.aLL().toByteArray().length + " dataiLen:" + localaer.hQi.aLK() + " md5:" + com.tencent.mm.a.f.d(arrayOfByte) + " datamd5:" + com.tencent.mm.a.f.d(localaer.hQi.aLL().toByteArray()));
    localaer.gnq = ((String)com.tencent.mm.o.f.c(2, ""));
    localaer.hQd = this.dDi;
    localaer.iwg = this.dIX;
    if (this.dIY);
    for (int m = 1; ; m = 0)
    {
      localaer.hQj = m;
      localaer.iwh = 0;
      localaer.iwi = 0;
      localaer.iwj = 0;
      localaer.iwk = 0;
      localaer.ixt = this.dIZ;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", "clientId " + this.dIX);
      return a(paramr, this.dmI, this);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    aer localaer = (aer)((com.tencent.mm.o.a)paramaj).sO();
    aes localaes = (aes)((com.tencent.mm.o.a)paramaj).sP();
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " onGYNetEnd  file:" + this.filename + " endflag:" + localaes.hQj + " lst:" + localaes.hvf);
    if (localaer.hQj == 1)
    {
      this.dJa = new String[localaes.hvf.size()];
      for (int i = 0; i < localaes.hvf.size(); i++)
        this.dJa[i] = ((vt)localaes.hvf.get(i)).getString();
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dDi = (localaer.hQd + localaer.hQi.aLK());
    if (this.dHb);
    for (long l = 0L; ; l = 500L)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", "onGYNetEnd file:" + this.filename + " delay:" + l);
      this.dmV.cP(l);
      return;
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
    this.dlH.a(3, 40000 + k.nJ(), "ecurityCheckError", this);
  }

  public final int getType()
  {
    return 206;
  }

  protected final int sB()
  {
    return 20;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.b
 * JD-Core Version:    0.6.2
 */