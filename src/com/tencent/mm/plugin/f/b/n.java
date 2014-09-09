package com.tencent.mm.plugin.f.b;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.px;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.bh;
import com.tencent.mm.protocal.p;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class n extends x
  implements ab
{
  private m dlH;
  private final aj dpk;
  private boolean fTj = false;

  public n(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
      throw new NullPointerException("task or data must not be null");
    this.fTj = bg.oE();
    if (!this.fTj)
    {
      this.dpk = new g();
      this.dpk.tk().a(bh.aHt());
      b localb = (b)this.dpk.tk();
      localb.fSZ.ifC = 1;
      ws localws3 = new ws();
      localws3.cl(paramArrayOfByte1);
      localb.fSZ.ifE = localws3;
      ws localws4 = new ws();
      localws4.cl(paramArrayOfByte2);
      localb.fSZ.ifD = localws4;
      localb.fSZ.hRd = new ws().cl(ch.aHG());
      return;
    }
    this.dpk = new h();
    e locale = (e)this.dpk.tk();
    locale.fSZ.ifC = 1;
    ws localws1 = new ws();
    localws1.cl(paramArrayOfByte1);
    locale.fSZ.ifE = localws1;
    ws localws2 = new ws();
    localws2.cl(paramArrayOfByte2);
    locale.fSZ.ifD = localws2;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvt/i/m5RMTU4PaDXH2ptUNE=", "get report strategy err");
      bg.qX().rk().a(false, null);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvt/i/m5RMTU4PaDXH2ptUNE=", "get report strategy ok");
    if (!this.fTj);
    for (px localpx = ((c)paramaj.sS()).fTa; (bg.qX().rk() == null) || (localpx == null) || (localpx.ifF == null); localpx = ((f)paramaj.sS()).fTa)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvt/i/m5RMTU4PaDXH2ptUNE=", "Local getRespOjb fail.");
      bg.qX().rk().a(false, null);
      this.dlH.a(3, -1, paramString, this);
      return;
    }
    bg.qX().rk().a(true, localpx.ifF.aLL().getBytes());
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    if (!this.fTj)
      return 499;
    return 430;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.n
 * JD-Core Version:    0.6.2
 */