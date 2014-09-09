package com.tencent.mm.compatible.loader;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public final class n
  implements m
{
  private static l b(Application paramApplication, String paramString)
  {
    try
    {
      l locall = (l)ak.getContext().getClassLoader().loadClass(ak.aHh() + paramString).newInstance();
      locall.setApplication(paramApplication);
      return locall;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final l a(Application paramApplication, String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      HandlerThread localHandlerThread = new HandlerThread("startup");
      localHandlerThread.start();
      String str = (String)new o(this).b(new cm(localHandlerThread.getLooper()));
      localHandlerThread.getLooper().quit();
      paramString = str;
    }
    if (paramString == null)
    {
      z.e("!44@/B4Tb64lLpJ/Ri7/U8l0ZZSmgT4FHdxRqy/SgoeSmV0=", "get process name failed, retry later");
      return null;
    }
    ak.xe(paramString);
    l locall;
    if (paramString.equals(ak.getPackageName()))
      locall = b(paramApplication, ".app.WorkerProfile");
    while (true)
    {
      z.w("!44@/B4Tb64lLpJ/Ri7/U8l0ZZSmgT4FHdxRqy/SgoeSmV0=", "application started, profile = %s", new Object[] { paramString });
      return locall;
      if (paramString.equals(ak.getPackageName() + ":push"))
      {
        locall = b(paramApplication, ".app.PusherProfile");
      }
      else if (paramString.equals(ak.getPackageName() + ":tools"))
      {
        locall = b(paramApplication, ".app.ToolsProfile");
      }
      else if (paramString.equals(ak.getPackageName() + ":sandbox"))
      {
        locall = b(paramApplication, ".app.SandBoxProfile");
      }
      else
      {
        if (!paramString.equals(ak.getPackageName() + ":exdevice"))
          break;
        locall = b(paramApplication, ".app.ExDeviceProfile");
      }
    }
    b.m("MMApplication onCreate profile == null", "profile is null and initMMcore failed");
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.n
 * JD-Core Version:    0.6.2
 */