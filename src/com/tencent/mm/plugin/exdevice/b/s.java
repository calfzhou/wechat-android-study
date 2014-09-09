package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.kj;
import com.tencent.mm.protocal.a.kk;
import com.tencent.mm.sdk.platformtools.z;

public final class s extends x
  implements ab
{
  private m dlH = null;
  private a dmI = null;

  public s()
  {
    b localb = new b();
    localb.a(new kj());
    localb.b(new kk());
    localb.fi("/cgi-bin/micromsg-bin/getboundharddevices");
    localb.de(539);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((kj)this.dmI.sO()).hWt = 1;
  }

  public final kk Ph()
  {
    if ((this.dmI != null) && (this.dmI.sP() != null))
      return (kk)this.dmI.sP();
    return null;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8XqUSzca84vJZ4ziZ0DRzG78wH/WodOduM", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 539;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.s
 * JD-Core Version:    0.6.2
 */