package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.aco;
import com.tencent.mm.protocal.a.acp;
import com.tencent.mm.protocal.a.oy;
import com.tencent.mm.sdk.platformtools.z;

public final class w extends x
  implements ab
{
  private m dlH;
  private a dmI;
  public oy eJd;

  public w(oy paramoy)
  {
    this.eJd = paramoy;
    b localb = new b();
    localb.a(new aco());
    localb.b(new acp());
    localb.de(537);
    localb.fi("/cgi-bin/micromsg-bin/unbindharddevice");
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((aco)this.dmI.sO()).hQL = paramoy;
  }

  public final acp Pm()
  {
    if ((this.dmI != null) && (this.dmI.sP() != null))
      return (acp)this.dmI.sP();
    return null;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8X/oAj/7X3EYlp35iijjtoOQ+WDXsR7CfP", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 537;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.w
 * JD-Core Version:    0.6.2
 */