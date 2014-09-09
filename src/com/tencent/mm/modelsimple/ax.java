package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.rd;
import com.tencent.mm.protocal.a.re;
import com.tencent.mm.sdk.platformtools.z;

public final class ax extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public ax(int paramInt)
  {
    b localb = new b();
    localb.a(new rd());
    localb.b(new re());
    localb.fi("/cgi-bin/micromsg-bin/logoutwebwx");
    localb.de(281);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((rd)this.dmI.sO()).hQF = paramInt;
  }

  public final int a(r paramr, m paramm)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvrHybRkRQaQCXLcqDx3Hb5M=", "doScene");
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvrHybRkRQaQCXLcqDx3Hb5M=", "logout Error. ");
    if (this.dlH != null)
      this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 281;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ax
 * JD-Core Version:    0.6.2
 */