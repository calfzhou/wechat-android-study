package com.tencent.mm.al;

import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.adh;
import com.tencent.mm.protocal.a.adi;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ay;

public final class d extends a
  implements ab
{
  private int cIm = 0;
  private int dDi = 0;
  private boolean dHb = false;
  private long dIX = -1L;
  private boolean dIY = false;
  private String[] dJa = new String[0];
  private int dJc = 0;
  private m dlH;
  private com.tencent.mm.o.a dmI;
  ay dmV = new ay(new e(this), true);
  private String filename = null;

  public d(String paramString, int paramInt)
  {
    this.filename = paramString;
    this.dJc = paramInt;
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
    this.dlH = paramm;
    int i = c.ab(this.filename);
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = this.filename;
    arrayOfObject1[1] = Integer.valueOf(i);
    arrayOfObject1[2] = Integer.valueOf(i);
    arrayOfObject1[3] = Boolean.valueOf(this.dHb);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", "read file: %s, filelen: %d, oldoff: %d, isFin: %b", arrayOfObject1);
    if (i <= 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", "read failed :" + this.filename);
      this.cIm = (40000 + k.nJ());
      return -1;
    }
    int j = i - this.dDi;
    if (j > 3960)
      j = 3960;
    byte[] arrayOfByte;
    while (true)
    {
      Object[] arrayOfObject2 = new Object[5];
      arrayOfObject2[0] = this.filename;
      arrayOfObject2[1] = Integer.valueOf(i);
      arrayOfObject2[2] = Boolean.valueOf(this.dHb);
      arrayOfObject2[3] = Boolean.valueOf(this.dHb);
      arrayOfObject2[4] = Boolean.valueOf(this.dIY);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", "read file: %s, filelen: %d, oldoff: %b, isFin:%b, endFlag: %b", arrayOfObject2);
      arrayOfByte = c.a(this.filename, this.dDi, j);
      if (arrayOfByte != null)
        break;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", k.nL() + " read failed :" + this.filename + " read:" + j);
      this.cIm = (40000 + k.nJ());
      return -1;
      if ((j < 3300) && (!this.dHb))
      {
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", k.nL() + " read failed :" + this.filename + "can read:" + j + " isfinish:" + this.dHb);
        this.cIm = (40000 + k.nJ());
        return -1;
      }
      if (this.dHb)
        this.dIY = true;
    }
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new adh());
    localb.b(new adi());
    localb.fi("/cgi-bin/micromsg-bin/uploadinputvoice");
    localb.de(349);
    localb.df(158);
    localb.dg(1000000158);
    this.dmI = localb.sU();
    adh localadh = (adh)this.dmI.sO();
    localadh.gnq = ((String)com.tencent.mm.o.f.c(2, ""));
    localadh.hQi = new ws().cl(arrayOfByte);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", k.nL() + " read file:" + this.filename + " readlen:" + arrayOfByte.length + " datalen:" + localadh.hQi.aLL().toByteArray().length + " dataiLen:" + localadh.hQi.aLK() + " md5:" + com.tencent.mm.a.f.d(arrayOfByte) + " datamd5:" + com.tencent.mm.a.f.d(localadh.hQi.aLL().toByteArray()));
    localadh.hQd = this.dDi;
    localadh.iwg = this.dIX;
    if (this.dIY);
    for (int k = 1; ; k = 0)
    {
      localadh.hQj = k;
      localadh.iwh = 0;
      localadh.iwi = 0;
      localadh.iwj = this.dJc;
      localadh.iwk = 0;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", "clientId " + this.dIX);
      return a(paramr, this.dmI, this);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", "onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    adh localadh = (adh)((com.tencent.mm.o.a)paramaj).sO();
    adi localadi = (adi)((com.tencent.mm.o.a)paramaj).sP();
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", k.nL() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", k.nL() + " onGYNetEnd  file:" + this.filename + " endflag:" + localadi.hQj);
    if (localadh.hQj == 1)
    {
      if ((localadi.iwl != null) && (localadi.iwl.aLL() != null))
      {
        String[] arrayOfString = new String[1];
        arrayOfString[0] = localadi.iwl.aLL().aFt();
        this.dJa = arrayOfString;
      }
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dDi = (localadh.hQd + localadh.hQi.aLK());
    if (this.dHb);
    for (long l = 0L; ; l = 500L)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", "onGYNetEnd file:" + this.filename + " delay:" + l);
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
    return 349;
  }

  protected final int sB()
  {
    return 20;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.d
 * JD-Core Version:    0.6.2
 */