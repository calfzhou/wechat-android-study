package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.yi;
import com.tencent.mm.protocal.a.yj;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class aq extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public aq(String paramString)
  {
    b localb = new b();
    localb.a(new yi());
    localb.b(new yj());
    localb.fi("/cgi-bin/micromsg-bin/newsetemailpwd");
    localb.de(382);
    localb.df(181);
    localb.dg(1000000181);
    this.dmI = localb.sU();
    ((yi)this.dmI.sO()).hRj = ch.je(paramString);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvnrOae0AU9CydNeRTCwj+1Q=", "md5 " + paramString);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvnrOae0AU9CydNeRTCwj+1Q=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 382;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.aq
 * JD-Core Version:    0.6.2
 */