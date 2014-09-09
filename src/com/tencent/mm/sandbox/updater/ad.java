package com.tencent.mm.sandbox.updater;

import com.tencent.mm.a.f;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class ad
  implements com.tencent.mm.sandbox.c
{
  ad(aa paramaa)
  {
  }

  public final void a(int paramInt1, int paramInt2, vo paramvo)
  {
    if (paramInt1 != 0)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "scene error. netRet=" + paramInt1);
      if (paramInt1 == -2)
        new File(this.iBV.aMt()).delete();
      aa.e(this.iBV);
      this.iBV.a(aa.b(this.iBV));
      return;
    }
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "scene success");
    try
    {
      if (com.tencent.mm.a.c.ab(this.iBV.aMt()) < aa.f(this.iBV))
      {
        z.i("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "scene continue;");
        this.iBV.a(aa.b(this.iBV));
        return;
      }
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "error occured during pack processing");
      aa.b(this.iBV).a(-1, -1, paramvo);
      return;
    }
    if (aa.g(this.iBV))
    {
      if (!aa.h(this.iBV).equalsIgnoreCase(f.ag(this.iBV.aMt())))
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "pack md5 check error");
        new File(this.iBV.aMt()).delete();
        aa.b(this.iBV).a(2, -1, paramvo);
        return;
      }
      aa.a(this.iBV, paramvo);
      return;
    }
    if (!aa.i(this.iBV).equalsIgnoreCase(f.ag(this.iBV.aMt())))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "update pack check error");
      new File(this.iBV.aMt()).delete();
      aa.b(this.iBV).a(-1, -1, paramvo);
      return;
    }
    com.tencent.mm.a.c.a(g.iBl, aa.j(this.iBV) + ".temp", aa.k(this.iBV) + ".apk");
    aa.b(this.iBV).a(200, 0, paramvo);
  }

  public final void cM(long paramLong)
  {
    aa.b(this.iBV).cM(paramLong);
  }

  public final void cN(long paramLong)
  {
    aa.b(this.iBV).cN(paramLong);
  }

  public final void w(int paramInt1, int paramInt2)
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "progress, total=" + paramInt1 + ", offset=" + paramInt2);
    aa.b(this.iBV).w(paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.ad
 * JD-Core Version:    0.6.2
 */