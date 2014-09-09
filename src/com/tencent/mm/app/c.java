package com.tencent.mm.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.mm.booter.CoreService;
import com.tencent.mm.booter.f;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelstat.r;
import com.tencent.mm.network.t;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

final class c
  implements ServiceConnection
{
  private static volatile boolean cFL = false;
  private Runnable cFM = new d(this);

  public final void n(Context paramContext)
  {
    if (!f.h(paramContext, "noop"))
      z.i("!44@/B4Tb64lLpIzvC/moQitzF8rP6t/SuMFxU5aFFcIy9Y=", "ensureServiceInstance return false");
    do
    {
      return;
      Intent localIntent = new Intent(paramContext, CoreService.class);
      z.i("!44@/B4Tb64lLpIzvC/moQitzF8rP6t/SuMFxU5aFFcIy9Y=", "prepare dispatcher / bind core service");
      if (!paramContext.bindService(localIntent, this, 1))
      {
        z.e("!44@/B4Tb64lLpIzvC/moQitzF8rP6t/SuMFxU5aFFcIy9Y=", "bindService failed, may be caused by some crashes");
        return;
      }
    }
    while (cFL);
    cFL = true;
    com.tencent.mm.sdk.platformtools.am.b(this.cFM, 10000L);
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    z.w("!44@/B4Tb64lLpIzvC/moQitzF8rP6t/SuMFxU5aFFcIy9Y=", "onServiceConnected ");
    com.tencent.mm.sdk.platformtools.am.o(this.cFM);
    cFL = false;
    if (paramIBinder == null)
    {
      Assert.assertTrue("WorkerProfile onServiceConnected binder == null", false);
      b.m("WorkerProfile onServiceConnected binder == null", "it will result in accInfo being null");
    }
    com.tencent.mm.o.am localam = new com.tencent.mm.o.am(t.c(paramIBinder));
    bg.b(localam);
    r.d(localam);
    localam.I(ao.dVH, ao.dVI);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    z.w("!44@/B4Tb64lLpIzvC/moQitzF8rP6t/SuMFxU5aFFcIy9Y=", "onServiceDisconnected ");
    if ((bg.ra()) && (!bg.rd()))
    {
      bg.qX().ty();
      n(ak.getContext());
      return;
    }
    bg.qX().tz();
    bg.qX().reset();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.c
 * JD-Core Version:    0.6.2
 */