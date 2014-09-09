package com.tencent.mm.booter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.mm.network.bk;
import com.tencent.mm.sdk.platformtools.z;

public final class ab
{
  private NetworkInfo diI = null;
  private WifiInfo diJ = null;

  final boolean lv()
  {
    try
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)bk.getContext().getSystemService("connectivity");
      if (localConnectivityManager == null)
      {
        z.w("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "can't get ConnectivityManager");
        return false;
      }
      NetworkInfo localNetworkInfo1;
      try
      {
        NetworkInfo localNetworkInfo2 = localConnectivityManager.getActiveNetworkInfo();
        localNetworkInfo1 = localNetworkInfo2;
        if (localNetworkInfo1 == null)
        {
          z.w("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "ActiveNetwork is null, has no network");
          return false;
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          z.e("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "getActiveNetworkInfo failed.");
          localNetworkInfo1 = null;
        }
      }
      if (localNetworkInfo1.getType() == 1)
      {
        i = 1;
        if (i != 0)
        {
          localWifiInfo = ((WifiManager)bk.getContext().getSystemService("wifi")).getConnectionInfo();
          if ((localWifiInfo != null) && (this.diJ != null) && (this.diJ.getBSSID().equals(localWifiInfo.getBSSID())) && (this.diJ.getSSID().equals(localWifiInfo.getSSID())) && (this.diJ.getNetworkId() == localWifiInfo.getNetworkId()))
          {
            z.w("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "Same Wifi, do not NetworkChanged");
            return false;
          }
          z.d("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "New Wifi Info:%s", new Object[] { localWifiInfo });
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = this.diJ;
          z.d("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "OldWifi Info:%s", arrayOfObject1);
          if (i == 0)
          {
            z.d("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "New NetworkInfo:%s", new Object[] { localNetworkInfo1 });
            if (this.diI != null)
            {
              Object[] arrayOfObject2 = new Object[1];
              arrayOfObject2[0] = this.diI;
              z.d("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "Old NetworkInfo:%s", arrayOfObject2);
            }
          }
          this.diI = localNetworkInfo1;
          this.diJ = localWifiInfo;
          break label435;
        }
        if ((this.diI != null) && (this.diI.getExtraInfo() != null) && (localNetworkInfo1.getExtraInfo() != null) && (this.diI.getExtraInfo().equals(localNetworkInfo1.getExtraInfo())) && (this.diI.getSubtype() == localNetworkInfo1.getSubtype()) && (this.diI.getType() == localNetworkInfo1.getType()))
        {
          z.w("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "Same Network, do not NetworkChanged");
          return false;
        }
        if ((this.diI != null) && (this.diI.getExtraInfo() == null) && (localNetworkInfo1.getExtraInfo() == null) && (this.diI.getSubtype() == localNetworkInfo1.getSubtype()) && (this.diI.getType() == localNetworkInfo1.getType()))
        {
          z.w("!44@/B4Tb64lLpJlhWc9y/UzPJTVRF2jtCjrV+Hu9B+ktCI=", "Same Network, do not NetworkChanged");
          return false;
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        break;
        WifiInfo localWifiInfo = null;
        continue;
        int i = 0;
      }
    }
    label435: return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ab
 * JD-Core Version:    0.6.2
 */