package com.tencent.mm.sandbox.updater;

import com.tencent.mm.a.f;
import com.tencent.mm.ao.b;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.oa;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class y
  implements com.tencent.mm.sandbox.c
{
  y(x paramx)
  {
  }

  public final void a(int paramInt1, int paramInt2, vo paramvo)
  {
    if ((paramInt1 != 200) || (paramInt2 != 0) || ((paramvo != null) && (paramvo.hRz.hQw != 0)))
    {
      if ((!this.iBM.aMw()) && (x.a(this.iBM) < 5 * x.b(this.iBM).length))
      {
        this.iBM.a(x.c(this.iBM));
        return;
      }
      x.c(this.iBM).a(paramInt1, paramInt2, paramvo);
      return;
    }
    oa localoa = (oa)paramvo;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "onGYNetEnd : file dir = " + h.dOH);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "onGYNetEnd : total len = " + localoa.hQk);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "onGYNetEnd : start pos = " + localoa.hUu);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "onGYNetEnd : data len = " + localoa.hQs);
    if ((localoa.hQs <= 0) || (localoa.hQi == null))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "data is null");
      x.c(this.iBM).a(paramInt1, -1, null);
      return;
    }
    if (localoa.hQi.aLK() != localoa.hQs)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "data len not match with data buf, dataLen = " + localoa.hQs + " data buf len = " + localoa.hQi.aLK());
      x.c(this.iBM).a(4, -1, null);
      return;
    }
    if ((localoa.hUu < 0) || (localoa.hUu + localoa.hQs > localoa.hQk))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "startPos = " + localoa.hUu + " dataLen = " + localoa.hQs + " totalLen = " + localoa.hQk);
      x.c(this.iBM).a(4, -1, null);
      return;
    }
    if (localoa.hQk <= 0)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "totalLen is invalid: totalLen = " + localoa.hQk);
      x.c(this.iBM).a(4, -1, null);
      return;
    }
    int i = com.tencent.mm.a.c.a(g.iBl, x.d(this.iBM), ".temp", localoa.hQi.aLL().toByteArray());
    if (i != 0)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "appendBuf failed : " + i);
      x.c(this.iBM).a(4, -1, null);
      return;
    }
    x.a(this.iBM, localoa.hQs + localoa.hUu);
    x.b(this.iBM, localoa.hQk);
    x.c(this.iBM).w(localoa.hQk, localoa.hUu);
    if (localoa.hUu + localoa.hQs >= localoa.hQk);
    try
    {
      if (x.f(this.iBM).equalsIgnoreCase(f.ag(x.e(this.iBM))))
      {
        com.tencent.mm.a.c.a(g.iBl, x.g(this.iBM) + ".temp", x.h(this.iBM) + ".apk");
        x.c(this.iBM).a(200, 0, paramvo);
        return;
      }
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "update pack check error");
      new File(x.i(this.iBM)).delete();
      x.c(this.iBM).a(-1, -1, paramvo);
      return;
      this.iBM.a(x.c(this.iBM));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void cM(long paramLong)
  {
    x.c(this.iBM).cM(paramLong);
  }

  public final void cN(long paramLong)
  {
    x.c(this.iBM).cN(paramLong);
  }

  public final void w(int paramInt1, int paramInt2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.y
 * JD-Core Version:    0.6.2
 */