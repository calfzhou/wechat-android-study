package com.tencent.mm.ui.voicetranstext;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.adu;
import com.tencent.mm.protocal.a.aet;
import com.tencent.mm.protocal.a.aev;
import com.tencent.mm.protocal.a.dw;
import com.tencent.mm.protocal.a.dx;
import com.tencent.mm.protocal.a.vh;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class a extends x
  implements ab
{
  public static int jZQ = 1;
  public static int jZR = 2;
  public static int jZS = 3;
  private com.tencent.mm.o.a frT;
  private m frU;
  private String jZM;
  private int jZN;
  private aet jZO;
  private long jZP;
  private aev jZT;
  private adu jZU;
  private vh jZV;
  private int jZW;
  private String mFileName;
  private int mState = -1;

  public a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2)
  {
    a(paramString1, paramInt1, paramInt2, paramLong, paramString2);
  }

  public a(String paramString1, int paramInt, String paramString2)
  {
    a(paramString1, paramInt, -1, -1L, paramString2);
  }

  private void a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2)
  {
    b localb = new b();
    localb.a(new dw());
    localb.b(new dx());
    localb.fi("/cgi-bin/micromsg-bin/checkvoicetrans");
    localb.de(546);
    localb.df(0);
    localb.dg(0);
    this.mFileName = paramString2;
    this.frT = localb.sU();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvhYy4tpT4YAYujByi7F30DtCfA9vYxpQlg==", "voiceId:%s, totalLen:%d, encodeType: %d, svrMsgId: %s", arrayOfObject);
    if (paramInt2 >= 0)
      this.jZO = d.G(paramInt2, paramString2);
    if (paramLong > 0L)
      this.jZP = paramLong;
    this.jZM = paramString1;
    this.jZN = paramInt1;
  }

  public final int a(r paramr, m paramm)
  {
    this.frU = paramm;
    dw localdw = (dw)this.frT.sO();
    localdw.hTY = this.jZM;
    localdw.hQk = this.jZN;
    localdw.hTZ = this.jZO;
    localdw.hOY = this.jZP;
    return a(paramr, this.frT, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      dx localdx = (dx)this.frT.sP();
      if (localdx == null)
        return;
      this.jZT = localdx.hUa;
      this.mState = localdx.dZy;
      this.jZU = localdx.hUb;
      this.jZV = localdx.hUc;
      this.jZW = localdx.hUd;
    }
    while (true)
    {
      this.frU.a(paramInt2, paramInt3, paramString, this);
      return;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(paramInt2);
      arrayOfObject[1] = Integer.valueOf(paramInt3);
      arrayOfObject[2] = this.jZM;
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvhYy4tpT4YAYujByi7F30DtCfA9vYxpQlg==", "end checkVoiceTrans, & errType:%d, errCode:%d, voiceId: %s ", arrayOfObject);
    }
  }

  public final aev bcc()
  {
    return this.jZT;
  }

  public final adu bcd()
  {
    return this.jZU;
  }

  public final vh bce()
  {
    return this.jZV;
  }

  public final int bcf()
  {
    return this.jZW;
  }

  public final boolean bcg()
  {
    return (this.jZT != null) && (!ch.jb(this.jZT.ixB));
  }

  public final int getState()
  {
    return this.mState;
  }

  public final int getType()
  {
    return 546;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.a
 * JD-Core Version:    0.6.2
 */