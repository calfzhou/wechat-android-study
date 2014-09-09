package com.tencent.mm.compatible.c;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class v
{
  public static s dNA = new s();
  public static b dNB = new b();
  public static a dNC = new a();
  public static z dND = new z();
  public static aa dNE = new aa();
  private static int dNF = -1;
  public static n dNG = new n();
  public static t dNH = new t();
  private static String dNI = null;

  public static String O(Context paramContext)
  {
    if (paramContext == null)
      return null;
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager == null)
        return null;
      String str1 = localTelephonyManager.getDeviceId();
      if (str1 == null)
        return null;
      String str2 = str1.trim();
      return str2;
    }
    catch (SecurityException localSecurityException)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", "getDeviceId failed, security exception");
      return null;
    }
    catch (Exception localException)
    {
      label53: break label53;
    }
  }

  public static void cy(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    do
    {
      do
        return;
      while (paramString.hashCode() == dNF);
      dNF = paramString.hashCode();
      dNA.reset();
      dNB.reset();
      dNC.reset();
      dNG.reset();
      dND.reset();
      dNE.reset();
      new y();
    }
    while (y.a(paramString, dNA, dNB, dNC, dNG, dND, dNE));
  }

  public static String getAndroidId()
  {
    String str = Settings.Secure.getString(ak.getContext().getContentResolver(), "android_id");
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", "androidid:[%s]", new Object[] { str });
    return str;
  }

  public static String getSimCountryIso()
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)ak.getContext().getSystemService("phone");
    if (localTelephonyManager != null)
    {
      String str = localTelephonyManager.getSimCountryIso();
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", "get isoCode:[%s]", new Object[] { str });
      return str;
    }
    return null;
  }

  public static String ng()
  {
    String str1 = (String)o.mT().get(258);
    if (str1 != null)
      return str1;
    String str2 = O(ak.getContext());
    if (str2 == null)
      str2 = "1234567890ABCDEF";
    o.mT().set(258, str2);
    return str2;
  }

  public static String nh()
  {
    StringBuilder localStringBuilder;
    String str1;
    String str2;
    if (dNI == null)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(Settings.Secure.getString(ak.getContext().getContentResolver(), "android_id"));
      str1 = (String)o.mT().get(256);
      if (str1 == null)
        break label171;
      localStringBuilder.append(str1);
      str2 = (String)o.mT().get(259);
      if (str2 == null)
        break label188;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", "getHardWareId from file " + str2);
    }
    while (true)
    {
      localStringBuilder.append(str2);
      String str3 = localStringBuilder.toString();
      dNI = "A" + f.d(str3.getBytes()).substring(0, 15);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = dNI;
      arrayOfObject[1] = str3;
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", "guid:%s, dev=%s", arrayOfObject);
      return dNI;
      label171: str1 = nk();
      o.mT().set(256, str1);
      break;
      label188: str2 = Build.MANUFACTURER + Build.MODEL + q.mX();
      o.mT().set(259, str2);
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", "getHardWareId " + str2);
    }
  }

  public static String ni()
  {
    WifiManager localWifiManager = (WifiManager)ak.getContext().getSystemService("wifi");
    if (localWifiManager == null);
    for (WifiInfo localWifiInfo = null; localWifiInfo != null; localWifiInfo = localWifiManager.getConnectionInfo())
      return localWifiInfo.getMacAddress();
    return null;
  }

  public static String nj()
  {
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    String str = null;
    if (localBluetoothAdapter != null)
      str = localBluetoothAdapter.getAddress();
    return str;
  }

  private static String nk()
  {
    String str1 = ch.bH(ak.getContext());
    Object localObject;
    if ((str1 != null) && (str1.length() > 0))
      localObject = ("A" + str1 + "123456789ABCDEF").substring(0, 15);
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", "generated deviceId=" + (String)localObject);
      return localObject;
      Random localRandom = new Random();
      localRandom.setSeed(System.currentTimeMillis());
      localObject = "A";
      int i = 0;
      while (i < 15)
      {
        String str2 = (String)localObject + (char)(65 + localRandom.nextInt(25));
        i++;
        localObject = str2;
      }
    }
  }

  public static String nl()
  {
    return Build.MODEL;
  }

  public static String[] nm()
  {
    int i = 2;
    String[] arrayOfString1 = new String[i];
    arrayOfString1[0] = "";
    arrayOfString1[1] = "0";
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 8192);
      String[] arrayOfString2 = ch.ja(localBufferedReader.readLine()).split("\\s+");
      while (i < arrayOfString2.length)
      {
        arrayOfString1[0] = (arrayOfString1[0] + arrayOfString2[i] + " ");
        i++;
      }
      arrayOfString1[1] = ch.ja(localBufferedReader.readLine()).split("\\s+")[2];
      localBufferedReader.close();
      return arrayOfString1;
    }
    catch (IOException localIOException)
    {
    }
    return arrayOfString1;
  }

  public static String nn()
  {
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    String str = null;
    if (localBluetoothAdapter != null)
    {
      boolean bool = localBluetoothAdapter.isEnabled();
      str = null;
      if (bool)
        str = localBluetoothAdapter.getAddress();
    }
    return ch.ja(str);
  }

  @SuppressLint({"NewApi"})
  public static String no()
  {
    try
    {
      String str2;
      if (Build.VERSION.SDK_INT >= 14)
        str2 = Build.getRadioVersion();
      for (str1 = str2; ; str1 = Build.RADIO)
        return ch.ja(str1);
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      com.tencent.mm.sdk.platformtools.z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
    }
    catch (Throwable localThrowable)
    {
      while (true)
        String str1 = null;
    }
  }

  public static String np()
  {
    return Build.VERSION.RELEASE;
  }

  public static String nq()
  {
    try
    {
      String str = ch.ja(((TelephonyManager)ak.getContext().getSystemService("phone")).getSubscriberId());
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.z.printErrStackTrace("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", localException, "getPhoneIMSI", new Object[0]);
    }
    return "";
  }

  public static String nr()
  {
    try
    {
      String str = ch.ja(((TelephonyManager)ak.getContext().getSystemService("phone")).getSimSerialNumber());
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.z.printErrStackTrace("!32@/B4Tb64lLpJY56KQK+mokb3FPD+69fiF", localException, "getPhoneICCID", new Object[0]);
    }
    return "";
  }

  @SuppressLint({"NewApi"})
  public static String ns()
  {
    int i = Build.VERSION.SDK_INT;
    String str = null;
    if (i >= 9)
      str = Build.SERIAL;
    return ch.ja(str);
  }

  public static Map nt()
  {
    HashMap localHashMap = new HashMap();
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[] { "/system/bin/cat", "/proc/cpuinfo" }).start().getInputStream()));
      while (true)
      {
        String str = localBufferedReader.readLine();
        if (str == null)
          break;
        if (!str.trim().equals(""))
        {
          String[] arrayOfString = str.split(":");
          if (arrayOfString.length > 1)
            localHashMap.put(arrayOfString[0].trim().toLowerCase(), arrayOfString[1].trim());
        }
      }
      localBufferedReader.close();
      return localHashMap;
    }
    catch (IOException localIOException)
    {
    }
    return localHashMap;
  }

  public static int nu()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu").listFiles(new w()).length;
      return i;
    }
    catch (Exception localException)
    {
    }
    return 1;
  }

  public static int nx()
  {
    try
    {
      int i = new File("/dev/input").listFiles(new x()).length;
      return i;
    }
    catch (Exception localException)
    {
    }
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.v
 * JD-Core Version:    0.6.2
 */