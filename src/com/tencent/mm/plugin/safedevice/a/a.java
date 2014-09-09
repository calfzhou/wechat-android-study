package com.tencent.mm.plugin.safedevice.a;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.fi;
import com.tencent.mm.protocal.a.fj;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class a extends x
  implements ab
{
  private String cGo;
  private m dlH;
  private com.tencent.mm.o.a dmI;

  public a(String paramString)
  {
    this.cGo = paramString;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new fi());
    localb.b(new fj());
    localb.fi("/cgi-bin/micromsg-bin/delsafedevice");
    localb.de(362);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((fi)this.dmI.sO()).hVl = paramString;
  }

  public final int a(r paramr, m paramm)
  {
    if (ch.jb(this.cGo))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvg8Ydoa/S/6wziJiNmjZHY4=", "null device id");
      return -1;
    }
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvg8Ydoa/S/6wziJiNmjZHY4=", "NetSceneDelSafeDevice, errType= " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      fj localfj = (fj)this.dmI.sP();
      bg.qW().oQ().set(64, Integer.valueOf(localfj.hRo));
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvg8Ydoa/S/6wziJiNmjZHY4=", "NetSceneDelSafeDevice, get safedevice state = " + localfj.hRo);
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 362;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.a.a
 * JD-Core Version:    0.6.2
 */