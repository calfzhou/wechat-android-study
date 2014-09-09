package com.tencent.mm.jni.platformcomm;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.tencent.mm.sdk.platformtools.z;

public final class c
{
  private static Context context = null;
  private static long dQR = 10000L;

  public static long CA()
  {
    WifiInfo localWifiInfo = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
    if ((localWifiInfo != null) && (localWifiInfo.getBSSID() != null))
    {
      int i = WifiManager.calculateSignalLevel(localWifiInfo.getRssi(), 10);
      z.v("!44@/B4Tb64lLpJlhWc9y/UzPNzz3NdxTnJ/gIsDYHugT/w=", "Wifi Signal:" + i * 10);
      if (i > 10)
        i = 10;
      if (i < 0)
        i = 0;
      return i * 10;
    }
    z.v("!44@/B4Tb64lLpJlhWc9y/UzPNzz3NdxTnJ/gIsDYHugT/w=", "Can Not Get Wifi Signal");
    return 0L;
  }

  public static long Cy()
  {
    return dQR;
  }

  public static void aa(Context paramContext)
  {
    context = paramContext;
    ((TelephonyManager)paramContext.getSystemService("phone")).listen(new d(), 256);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jni.platformcomm.c
 * JD-Core Version:    0.6.2
 */