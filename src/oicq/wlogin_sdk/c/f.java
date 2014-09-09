package oicq.wlogin_sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.SecureRandom;
import oicq.wlogin_sdk.a.k;

public final class f
{
  public static int klA = 4;
  public static int klB = 5;
  public static int klC = 6;
  public static int klD = 7;
  public static int klE = 8;
  public static int klF = 9;
  public static int klG = 10;
  public static int klH = 11;
  public static int klI = 12;
  public static int klJ = 13;
  public static int klK = 14;
  public static int klL = 1;
  public static c klM = null;
  public static boolean klN = false;
  public static int klO = 4;
  public static int klu = 65535;
  public static int klv = 128;
  public static int klw = 0;
  public static int klx = 1;
  public static int kly = 2;
  public static int klz = 3;

  public static int A(byte[] paramArrayOfByte, int paramInt)
  {
    return (0xFF000000 & paramArrayOfByte[paramInt] << 24) + (0xFF0000 & paramArrayOfByte[(paramInt + 1)] << 16) + (0xFF00 & paramArrayOfByte[(paramInt + 2)] << 8) + (0xFF & paramArrayOfByte[(paramInt + 3)] << 0);
  }

  public static void AY(String paramString)
  {
    try
    {
      if (klL >= 2)
      {
        if (klM != null)
        {
          klM.h(2, paramString);
          return;
        }
        if (klN)
        {
          new StringBuilder("wlogin_sdk").append(bfs());
          return;
        }
      }
    }
    catch (Exception localException)
    {
    }
  }

  private static byte[] DR(String paramString)
  {
    int i = 0;
    if (paramString == null)
      return new byte[0];
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    while (true)
    {
      if (i >= paramString.length() / 2)
        return arrayOfByte;
      arrayOfByte[i] = ((byte)((b((byte)paramString.charAt(i * 2)) << 4) + b((byte)paramString.charAt(1 + i * 2))));
      i++;
    }
  }

  public static void DS(String paramString)
  {
    try
    {
      if (klL > 0)
      {
        if (klM != null)
        {
          klM.h(1, paramString);
          return;
        }
        if (klN)
        {
          new StringBuilder("wlogin_sdk").append(bfs());
          return;
        }
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static void J(Context paramContext, int paramInt)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("WLOGIN_SERVER_INFO", 0).edit();
    localEditor.putInt("network_type", paramInt);
    localEditor.commit();
  }

  public static void a(Context paramContext, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = df(paramContext);
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).edit();
      localEditor.putString("ksid", dp(paramArrayOfByte));
      localEditor.commit();
    }
  }

  public static void a(Exception paramException)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
    paramException.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    localStringWriter.flush();
    bT("exception:", localStringWriter.toString());
  }

  public static byte[] aL(Context paramContext, String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramContext.getPackageManager().getPackageInfo(paramString, 0).versionName.getBytes();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return new byte[0];
  }

  private static byte b(byte paramByte)
  {
    if ((paramByte >= 48) && (paramByte <= 57))
      return (byte)(paramByte - 48);
    if ((paramByte >= 97) && (paramByte <= 102))
      return (byte)(10 + (paramByte - 97));
    if ((paramByte >= 65) && (paramByte <= 70))
      return (byte)(10 + (paramByte - 65));
    return 0;
  }

  public static void b(Context paramContext, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).edit();
      localEditor.putString("imei", dp(paramArrayOfByte));
      localEditor.commit();
    }
  }

  public static void b(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    paramArrayOfByte[(paramInt + 7)] = ((byte)(int)(paramLong >> 0));
    paramArrayOfByte[(paramInt + 6)] = ((byte)(int)(paramLong >> 8));
    paramArrayOfByte[(paramInt + 5)] = ((byte)(int)(paramLong >> 16));
    paramArrayOfByte[(paramInt + 4)] = ((byte)(int)(paramLong >> 24));
    paramArrayOfByte[(paramInt + 3)] = ((byte)(int)(paramLong >> 32));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(int)(paramLong >> 40));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(int)(paramLong >> 48));
    paramArrayOfByte[(paramInt + 0)] = ((byte)(int)(paramLong >> 56));
  }

  public static void bS(String paramString1, String paramString2)
  {
    try
    {
      if (klL >= 2)
      {
        if (klM != null)
        {
          klM.e(2, paramString1, paramString2);
          return;
        }
        if (klN)
        {
          new StringBuilder("wlogin_sdk").append(bfs());
          new StringBuilder(String.valueOf(paramString1)).append(":").append(paramString2);
          return;
        }
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static void bT(String paramString1, String paramString2)
  {
    try
    {
      if (klL >= 0)
      {
        if (klM != null)
        {
          klM.e(0, paramString1, paramString2);
          return;
        }
        if (klN)
        {
          new StringBuilder("wlogin_sdk").append(bfs());
          new StringBuilder(String.valueOf(paramString1)).append(":").append(paramString2);
          return;
        }
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static byte[] bfm()
  {
    return new String("android").getBytes();
  }

  public static byte[] bfn()
  {
    return Build.VERSION.RELEASE.getBytes();
  }

  public static int bfo()
  {
    return (int)(2147483647.0D * Math.random());
  }

  public static byte[] bfp()
  {
    return SecureRandom.getSeed(16);
  }

  public static long bfq()
  {
    return k.beP();
  }

  public static byte[] bfr()
  {
    return new byte[0];
  }

  private static String bfs()
  {
    try
    {
      StackTraceElement localStackTraceElement = new Throwable().getStackTrace()[2];
      String str = "[" + localStackTraceElement.getFileName() + ":" + localStackTraceElement.getLineNumber() + "]";
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  public static String bft()
  {
    return new String("2013/09/23 17:30");
  }

  public static void c(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    paramArrayOfByte[(paramInt + 3)] = ((byte)(int)(paramLong >> 0));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(int)(paramLong >> 8));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(int)(paramLong >> 16));
    paramArrayOfByte[(paramInt + 0)] = ((byte)(int)(paramLong >> 24));
  }

  public static byte[] cX(Context paramContext)
  {
    WifiManager localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
    if (localWifiManager != null)
    {
      WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
      if (localWifiInfo != null)
      {
        String str = localWifiInfo.getMacAddress();
        if (str != null)
          return str.getBytes();
      }
    }
    return new byte[0];
  }

  public static byte[] cY(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager != null)
    {
      String str = localTelephonyManager.getDeviceId();
      if (str != null)
        return str.getBytes();
    }
    return new byte[0];
  }

  public static byte[] cZ(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager != null);
    for (String str1 = localTelephonyManager.getDeviceId(); ; str1 = null)
    {
      WifiManager localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
      String str2 = null;
      if (localWifiManager != null)
      {
        WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
        str2 = null;
        if (localWifiInfo != null)
          str2 = localWifiInfo.getMacAddress();
      }
      String str3 = "";
      if (str1 != null)
        str3 = str3 + str1;
      if (str2 != null)
        str3 = str3 + str2;
      if (str3.length() <= 0)
        return new byte[0];
      return d.dn(str3.getBytes());
    }
  }

  public static byte[] da(Context paramContext)
  {
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager.getSimState() == 5)
        return localTelephonyManager.getSimOperatorName().getBytes();
      byte[] arrayOfByte = new byte[0];
      return arrayOfByte;
    }
    catch (Throwable localThrowable)
    {
    }
    return new byte[0];
  }

  public static int db(Context paramContext)
  {
    try
    {
      int j = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().getType();
      i = j;
      if (i == 0)
        return 1;
    }
    catch (Exception localException)
    {
      int i;
      while (true)
        i = 0;
      if (i == 1)
        return 2;
    }
    return 0;
  }

  public static int dc(Context paramContext)
  {
    return paramContext.getSharedPreferences("WLOGIN_SERVER_INFO", 0).getInt("network_type", 0);
  }

  public static void dd(Context paramContext)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("WLOGIN_NET_RETRY_TYPE", 0).edit();
    localEditor.putInt("type", 0);
    localEditor.commit();
  }

  public static String de(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo.getType() == 0)
      {
        String str = localNetworkInfo.getExtraInfo();
        if (str != null)
          return str;
      }
      else
      {
        return "wifi";
      }
    }
    catch (Exception localException)
    {
    }
    return "wifi";
  }

  public static byte[] df(Context paramContext)
  {
    byte[] arrayOfByte1 = new String("").getBytes();
    byte[] arrayOfByte2;
    try
    {
      byte[] arrayOfByte3 = DR(paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).getString("ksid", new String("")));
      arrayOfByte2 = arrayOfByte3;
      if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0))
      {
        AY("get_ksid:null");
        return arrayOfByte2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        StringWriter localStringWriter = new StringWriter();
        PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
        localException.printStackTrace(localPrintWriter);
        localPrintWriter.flush();
        localStringWriter.flush();
        bT("exception", localStringWriter.toString());
        arrayOfByte2 = arrayOfByte1;
      }
      AY("get_ksid:" + dp(arrayOfByte2));
    }
    return arrayOfByte2;
  }

  public static byte[] dg(Context paramContext)
  {
    Object localObject = new byte[0];
    try
    {
      byte[] arrayOfByte = DR(paramContext.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).getString("imei", new String("")));
      localObject = arrayOfByte;
      if (localObject.length <= 0)
        return new byte[0];
    }
    catch (Exception localException)
    {
      while (true)
      {
        StringWriter localStringWriter = new StringWriter();
        PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
        localException.printStackTrace(localPrintWriter);
        localPrintWriter.flush();
        localStringWriter.flush();
        bT("exception", localStringWriter.toString());
      }
      AY("get_imei:" + dp((byte[])localObject));
    }
    return localObject;
  }

  public static byte[] dh(Context paramContext)
  {
    return paramContext.getPackageName().getBytes();
  }

  public static byte[] jdMethod_do(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = SecureRandom.getSeed(16);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramArrayOfByte.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, arrayOfByte1.length, paramArrayOfByte.length);
    return d.dn(arrayOfByte2);
  }

  public static String dp(byte[] paramArrayOfByte)
  {
    String str;
    if (paramArrayOfByte == null)
      str = "";
    while (true)
    {
      return str;
      str = "";
      for (int i = 0; i < paramArrayOfByte.length; i++)
        str = new StringBuilder(String.valueOf(str)).append(Integer.toHexString(0xF & paramArrayOfByte[i] >> 4)).toString() + Integer.toHexString(0xF & paramArrayOfByte[i]);
    }
  }

  public static long dq(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return 0L;
    return paramArrayOfByte.length;
  }

  public static void i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(paramInt2 >> 0));
  }

  public static void j(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 0));
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(paramInt2 >> 8));
  }

  public static void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)(paramInt2 >> 0));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(paramInt2 >> 8));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 16));
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(paramInt2 >> 24));
  }

  public static int y(byte[] paramArrayOfByte, int paramInt)
  {
    return 0xFF & paramArrayOfByte[paramInt];
  }

  public static int z(byte[] paramArrayOfByte, int paramInt)
  {
    return (0xFF00 & paramArrayOfByte[paramInt] << 8) + (0xFF & paramArrayOfByte[(paramInt + 1)] << 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.c.f
 * JD-Core Version:    0.6.2
 */