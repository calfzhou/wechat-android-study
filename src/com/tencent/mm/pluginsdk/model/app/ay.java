package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.jg;
import com.tencent.mm.protocal.a.jh;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;

public final class ay extends x
  implements ab
{
  private m dlH;
  private com.tencent.mm.o.a dmI;
  private int eYp;
  private String eYq;

  public ay(int paramInt, String paramString)
  {
    b localb = new b();
    localb.a(new jg());
    localb.b(new jh());
    localb.fi("/cgi-bin/micromsg-bin/gamereportkv");
    localb.de(427);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    jg localjg = (jg)this.dmI.sO();
    localjg.hSm = com.tencent.mm.protocal.a.hri;
    localjg.hSn = com.tencent.mm.protocal.a.hrh;
    localjg.hSo = com.tencent.mm.protocal.a.hrk;
    localjg.hSp = com.tencent.mm.protocal.a.hrl;
    localjg.hSq = y.aGW();
    localjg.hSr = paramInt;
    localjg.hSs = paramString;
    this.eYp = paramInt;
    this.eYq = paramString;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@y2bwEXoldKNlVtCYKDs+pI3OGDbroB7DI76DoXnZyeU=", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", logId = " + this.eYp + ", logExt = " + this.eYq);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 427;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ay
 * JD-Core Version:    0.6.2
 */