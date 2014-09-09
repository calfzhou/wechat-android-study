package com.tencent.mm.plugin.exdevice.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.exdevice.a.a;
import com.tencent.mm.plugin.exdevice.b.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public final class k
  implements ServiceConnection
{
  private l eKl;

  public final void a(l paraml)
  {
    this.eKl = paraml;
  }

  public final void aq(Context paramContext)
  {
    if (!m.ar(paramContext))
    {
      z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12uMY+BVm6PaZxKKLsvI51iA", "ensureServiceInstance return false");
      return;
    }
    if (paramContext.bindService(new Intent(paramContext, ExDeviceService.class), this, 1))
    {
      z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12uMY+BVm6PaZxKKLsvI51iA", "bind exdeviceservice success");
      return;
    }
    z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12uMY+BVm6PaZxKKLsvI51iA", "bind exdeviceservice failed");
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12uMY+BVm6PaZxKKLsvI51iA", "onServiceConnected");
    aq localaq = new aq(r.i(paramIBinder));
    an.b(localaq);
    localaq.a(a.OJ());
    if (this.eKl != null)
      this.eKl.onServiceConnected();
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12uMY+BVm6PaZxKKLsvI51iA", "onServiceDisconnected");
    an.PO().OX().b(a.OJ());
    if ((bg.ra()) && (!bg.rd()))
    {
      aq(ak.getContext());
      return;
    }
    z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12uMY+BVm6PaZxKKLsvI51iA", "no user login, ignore this disconnection");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.k
 * JD-Core Version:    0.6.2
 */