package com.tencent.mm.jni.platformcomm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

public class PlatformComm$C2Java
{
  private static String exception2String(Exception paramException)
  {
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }

  public static PlatformComm.APNInfo getAPNInfo()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)PlatformComm.CB().getSystemService("connectivity")).getActiveNetworkInfo();
      PlatformComm.APNInfo localAPNInfo = new PlatformComm.APNInfo();
      if (localNetworkInfo != null)
      {
        localAPNInfo.netType = localNetworkInfo.getType();
        localAPNInfo.subNetType = localNetworkInfo.getSubtype();
        if (1 != localNetworkInfo.getType())
        {
          if (localNetworkInfo.getExtraInfo() == null);
          for (String str = ""; ; str = localNetworkInfo.getExtraInfo())
          {
            localAPNInfo.extraInfo = str;
            return localAPNInfo;
          }
        }
        localAPNInfo.extraInfo = getCurWifiInfo().ssid;
        return localAPNInfo;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String getAppFilePath()
  {
    if (PlatformComm.CB() == null)
      return null;
    try
    {
      File localFile = PlatformComm.CB().getFilesDir();
      if (!localFile.exists())
        localFile.createNewFile();
      String str = localFile.toString();
      return str;
    }
    catch (Exception localException)
    {
      z.e("!24@zf96t1YgIScRsX2UOICiFQ==", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
    return null;
  }

  public static PlatformComm.SIMInfo getCurSIMInfo()
  {
    try
    {
      if (PlatformComm.CB() == null)
        return null;
      int i = bc.bB(PlatformComm.CB());
      if (i != 0)
      {
        PlatformComm.SIMInfo localSIMInfo = new PlatformComm.SIMInfo();
        localSIMInfo.ispCode = String.valueOf(i);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localSIMInfo.ispCode;
        z.d("!24@zf96t1YgIScRsX2UOICiFQ==", "getISPCode MCC_MNC=%s", arrayOfObject);
        localSIMInfo.ispName = bc.bC(PlatformComm.CB());
        return localSIMInfo;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static PlatformComm.WifiInfo getCurWifiInfo()
  {
    try
    {
      if (PlatformComm.CB() == null)
        return null;
      ConnectivityManager localConnectivityManager = (ConnectivityManager)PlatformComm.CB().getSystemService("connectivity");
      if (localConnectivityManager == null)
        return null;
      try
      {
        NetworkInfo localNetworkInfo2 = localConnectivityManager.getActiveNetworkInfo();
        localNetworkInfo1 = localNetworkInfo2;
        if (localNetworkInfo1 != null)
          if (1 == localNetworkInfo1.getType());
      }
      catch (Exception localException2)
      {
        while (true)
        {
          z.e("!24@zf96t1YgIScRsX2UOICiFQ==", "getActiveNetworkInfo failed.");
          NetworkInfo localNetworkInfo1 = null;
        }
        WifiManager localWifiManager = (WifiManager)PlatformComm.CB().getSystemService("wifi");
        if (localWifiManager == null)
          return null;
        WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
        if (localWifiInfo == null)
          return null;
        PlatformComm.WifiInfo localWifiInfo1 = new PlatformComm.WifiInfo();
        localWifiInfo1.ssid = localWifiInfo.getSSID();
        localWifiInfo1.bssid = localWifiInfo.getBSSID();
        return localWifiInfo1;
      }
    }
    catch (Exception localException1)
    {
      return null;
    }
    return null;
  }

  public static int getNetInfo()
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)PlatformComm.CB().getSystemService("connectivity");
    if (localConnectivityManager == null)
      return -1;
    try
    {
      NetworkInfo localNetworkInfo2 = localConnectivityManager.getActiveNetworkInfo();
      localNetworkInfo1 = localNetworkInfo2;
      if (localNetworkInfo1 == null)
        return -1;
    }
    catch (Exception localException1)
    {
      NetworkInfo localNetworkInfo1;
      while (true)
        localNetworkInfo1 = null;
      try
      {
        int i = localNetworkInfo1.getType();
        switch (i)
        {
        default:
          return 3;
        case 1:
          return 1;
        case 0:
        case 2:
        case 3:
        case 4:
        case 5:
        }
        return 2;
      }
      catch (Exception localException2)
      {
      }
    }
    return 3;
  }

  public static int getProxyInfo(StringBuffer paramStringBuffer)
  {
    return -1;
  }

  public static long getSignal(boolean paramBoolean)
  {
    try
    {
      if (PlatformComm.CB() == null)
        return 0L;
      if (paramBoolean)
        return c.CA();
      long l = c.Cy();
      return l;
    }
    catch (Exception localException)
    {
    }
    return 0L;
  }

  public static int getStatisticsNetType()
  {
    if (PlatformComm.CB() == null)
      return 0;
    try
    {
      int i = bc.aT(PlatformComm.CB());
      if (i == -1)
        return -1;
      if (bc.bE(PlatformComm.CB()))
        return 3;
      if (bc.bO(PlatformComm.CB()))
        return 4;
      if (bc.bF(PlatformComm.CB()))
        return 5;
      if (bc.ov(i))
        return 1;
      boolean bool = bc.ou(i);
      if (bool)
        return 2;
      return 6;
    }
    catch (Exception localException)
    {
      z.e("!24@zf96t1YgIScRsX2UOICiFQ==", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
    return -1;
  }

  public static boolean isNetworkConnected()
  {
    if (PlatformComm.CB() == null)
      return false;
    try
    {
      boolean bool = bc.bW(PlatformComm.CB());
      return bool;
    }
    catch (Exception localException)
    {
      z.e("!24@zf96t1YgIScRsX2UOICiFQ==", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
    return false;
  }

  public static void restartProcess()
  {
    if (PlatformComm.dQS == null)
      return;
    try
    {
      PlatformComm.CC().post(new e());
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static boolean startAlarm(int paramInt1, int paramInt2)
  {
    if (PlatformComm.CB() == null)
      return false;
    long l = paramInt1;
    try
    {
      boolean bool = Alarm.a(l, paramInt2, PlatformComm.CB());
      return bool;
    }
    catch (Exception localException)
    {
      z.e("!24@zf96t1YgIScRsX2UOICiFQ==", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
    return false;
  }

  public static boolean stopAlarm(int paramInt)
  {
    if (PlatformComm.CB() == null)
      return false;
    long l = paramInt;
    try
    {
      boolean bool = Alarm.a(l, PlatformComm.CB());
      return bool;
    }
    catch (Exception localException)
    {
      z.e("!24@zf96t1YgIScRsX2UOICiFQ==", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
    return false;
  }

  public static WakerLock wakeupLock_new()
  {
    if (PlatformComm.CB() == null)
      return null;
    try
    {
      WakerLock localWakerLock = new WakerLock(PlatformComm.CB());
      return localWakerLock;
    }
    catch (Exception localException)
    {
      z.e("!24@zf96t1YgIScRsX2UOICiFQ==", exception2String(localException));
      new StringBuilder().append(localException.getClass().getSimpleName()).append(":").append(localException.getStackTrace()[0]).append(", ").append(localException.getStackTrace()[1]);
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jni.platformcomm.PlatformComm.C2Java
 * JD-Core Version:    0.6.2
 */