package com.tencent.mm.sdk.platformtools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;

public final class bc
{
  private static int iEP = 0;

  // ERROR //
  private static Intent Y(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 20	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: astore_3
    //   5: aload_3
    //   6: iconst_0
    //   7: invokevirtual 26	android/content/pm/PackageManager:getInstalledPackages	(I)Ljava/util/List;
    //   10: astore 4
    //   12: aload 4
    //   14: ifnull +289 -> 303
    //   17: aload 4
    //   19: invokeinterface 32 1 0
    //   24: ifle +279 -> 303
    //   27: ldc 34
    //   29: new 36	java/lang/StringBuilder
    //   32: dup
    //   33: ldc 38
    //   35: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload 4
    //   40: invokeinterface 32 1 0
    //   45: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   48: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: invokestatic 56	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: iconst_0
    //   55: istore 5
    //   57: aload 4
    //   59: invokeinterface 32 1 0
    //   64: istore 6
    //   66: iload 5
    //   68: iload 6
    //   70: if_icmpge +233 -> 303
    //   73: ldc 34
    //   75: new 36	java/lang/StringBuilder
    //   78: dup
    //   79: ldc 58
    //   81: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   84: aload 4
    //   86: iload 5
    //   88: invokeinterface 62 2 0
    //   93: checkcast 64	android/content/pm/PackageInfo
    //   96: getfield 68	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   99: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokestatic 56	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   108: new 73	android/content/Intent
    //   111: dup
    //   112: invokespecial 75	android/content/Intent:<init>	()V
    //   115: astore 8
    //   117: aload 8
    //   119: aload 4
    //   121: iload 5
    //   123: invokeinterface 62 2 0
    //   128: checkcast 64	android/content/pm/PackageInfo
    //   131: getfield 68	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   134: invokevirtual 79	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   137: pop
    //   138: aload_3
    //   139: aload 8
    //   141: iconst_0
    //   142: invokevirtual 83	android/content/pm/PackageManager:queryIntentActivities	(Landroid/content/Intent;I)Ljava/util/List;
    //   145: astore 10
    //   147: aload 10
    //   149: ifnull +133 -> 282
    //   152: aload 10
    //   154: invokeinterface 32 1 0
    //   159: istore 11
    //   161: iload 11
    //   163: istore 12
    //   165: iload 12
    //   167: ifle +129 -> 296
    //   170: ldc 34
    //   172: new 36	java/lang/StringBuilder
    //   175: dup
    //   176: ldc 85
    //   178: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   181: iload 12
    //   183: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   186: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: invokestatic 56	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   192: iconst_0
    //   193: istore 14
    //   195: iload 14
    //   197: iload 12
    //   199: if_icmpge +97 -> 296
    //   202: aload 10
    //   204: iload 14
    //   206: invokeinterface 62 2 0
    //   211: checkcast 87	android/content/pm/ResolveInfo
    //   214: getfield 91	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   217: astore 15
    //   219: aload 15
    //   221: getfield 96	android/content/pm/ActivityInfo:name	Ljava/lang/String;
    //   224: aload_1
    //   225: invokevirtual 102	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   228: ifeq +60 -> 288
    //   231: new 73	android/content/Intent
    //   234: dup
    //   235: ldc 104
    //   237: invokespecial 105	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   240: astore 16
    //   242: aload 16
    //   244: new 107	android/content/ComponentName
    //   247: dup
    //   248: aload 15
    //   250: getfield 108	android/content/pm/ActivityInfo:packageName	Ljava/lang/String;
    //   253: aload 15
    //   255: getfield 96	android/content/pm/ActivityInfo:name	Ljava/lang/String;
    //   258: invokespecial 110	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   261: invokevirtual 114	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   264: pop
    //   265: aload 16
    //   267: ldc 116
    //   269: invokevirtual 119	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   272: pop
    //   273: aload_0
    //   274: aload 16
    //   276: invokevirtual 123	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   279: aload 16
    //   281: areturn
    //   282: iconst_0
    //   283: istore 12
    //   285: goto -120 -> 165
    //   288: iinc 14 1
    //   291: goto -96 -> 195
    //   294: astore 7
    //   296: iinc 5 1
    //   299: goto -242 -> 57
    //   302: astore_2
    //   303: aconst_null
    //   304: areturn
    //   305: astore 13
    //   307: goto -11 -> 296
    //
    // Exception table:
    //   from	to	target	type
    //   73	147	294	java/lang/Exception
    //   152	161	294	java/lang/Exception
    //   0	12	302	java/lang/Exception
    //   17	54	302	java/lang/Exception
    //   57	66	302	java/lang/Exception
    //   170	192	305	java/lang/Exception
    //   202	279	305	java/lang/Exception
  }

  public static int aT(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localConnectivityManager == null)
      return -1;
    NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
    if (localNetworkInfo == null)
      return -1;
    if (localNetworkInfo.getType() == 1)
      return 0;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localNetworkInfo.getExtraInfo();
    arrayOfObject[1] = Integer.valueOf(localNetworkInfo.getType());
    z.d("!32@/B4Tb64lLpKaLNAssnLXZsAiNoRj3gI9", "activeNetInfo extra=%s, type=%d", arrayOfObject);
    if (localNetworkInfo.getExtraInfo() != null)
    {
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("uninet"))
        return 1;
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("uniwap"))
        return 2;
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("3gwap"))
        return 3;
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("3gnet"))
        return 4;
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("cmwap"))
        return 5;
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("cmnet"))
        return 6;
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("ctwap"))
        return 7;
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("ctnet"))
        return 8;
      if (localNetworkInfo.getExtraInfo().equalsIgnoreCase("LTE"))
        return 10;
    }
    return 9;
  }

  public static int bA(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        int i = localNetworkInfo.getType();
        return i;
      }
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public static int bB(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager == null)
      return 0;
    String str = localTelephonyManager.getSimOperator();
    if ((str == null) || (str.length() < 5))
      return 0;
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      int i = str.length();
      if (i > 6)
        i = 6;
      while (true)
      {
        if (j < i)
          if (!Character.isDigit(str.charAt(j)))
          {
            if (localStringBuilder.length() <= 0)
              break label127;
          }
          else
          {
            localStringBuilder.append(str.charAt(j));
            break label127;
          }
        int k = Integer.valueOf(localStringBuilder.toString()).intValue();
        return k;
        int j = 0;
        continue;
        label127: j++;
      }
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public static String bC(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager == null)
      return "";
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localTelephonyManager.getSimOperatorName();
    z.d("!32@/B4Tb64lLpKaLNAssnLXZsAiNoRj3gI9", "getISPName ISPName=%s", arrayOfObject);
    if (localTelephonyManager.getSimOperatorName().length() <= 100)
      return localTelephonyManager.getSimOperatorName();
    return localTelephonyManager.getSimOperatorName().substring(0, 100);
  }

  public static boolean bD(Context paramContext)
  {
    try
    {
      int i = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().getType();
      return i != 1;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean bE(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo.getType() == 1)
        return false;
      if ((localNetworkInfo.getSubtype() != 2) && (localNetworkInfo.getSubtype() != 1))
      {
        int i = localNetworkInfo.getSubtype();
        if (i != 4);
      }
      else
      {
        return true;
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean bF(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo.getType() == 1)
        return false;
      int i = localNetworkInfo.getSubtype();
      if (i >= 13)
        return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean bN(Context paramContext)
  {
    return ou(aT(paramContext));
  }

  public static boolean bO(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo.getType() == 1)
        return false;
      if (localNetworkInfo.getSubtype() >= 5)
      {
        int i = localNetworkInfo.getSubtype();
        if (i < 13)
          return true;
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean bP(Context paramContext)
  {
    return aT(paramContext) == 0;
  }

  public static WifiInfo bQ(Context paramContext)
  {
    try
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localConnectivityManager == null)
        return null;
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if ((localNetworkInfo != null) && (1 == localNetworkInfo.getType()))
      {
        WifiManager localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
        if (localWifiManager == null)
          return null;
        WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
        return localWifiInfo;
      }
    }
    catch (Exception localException)
    {
      return null;
    }
    return null;
  }

  public static int bV(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 14)
      try
      {
        Class localClass = Class.forName("android.app.ActivityManagerNative");
        Object localObject = localClass.getMethod("getDefault", new Class[0]).invoke(localClass, new Object[0]);
        int k = ((Integer)localObject.getClass().getMethod("getProcessLimit", new Class[0]).invoke(localObject, new Object[0])).intValue();
        if (k == 0)
          return 1;
      }
      catch (Exception localException2)
      {
      }
    try
    {
      int i = Settings.System.getInt(paramContext.getContentResolver(), "wifi_sleep_policy", 2);
      if (i != 2)
      {
        int j = aT(paramContext);
        if (j == 0);
      }
      else
      {
        return 0;
      }
      if ((i == 1) || (i == 0))
        return 3;
    }
    catch (Exception localException1)
    {
    }
    return 0;
  }

  public static boolean bW(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localConnectivityManager == null)
      return false;
    NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
    if (localNetworkInfo == null)
      return false;
    return localNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
  }

  public static int bX(Context paramContext)
  {
    if (paramContext == null)
      return 999;
    try
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localConnectivityManager == null)
        return 999;
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo == null)
        return 999;
      if (localNetworkInfo.getType() == 1)
        return 1;
      int i = localNetworkInfo.getSubtype();
      if (i == 0)
        return 999;
      return i * 1000;
    }
    catch (Exception localException)
    {
    }
    return 999;
  }

  public static int bY(Context paramContext)
  {
    if (paramContext == null)
      return 0;
    try
    {
      if (bX(paramContext) == 1)
        return Math.abs(((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getRssi());
      ((TelephonyManager)paramContext.getSystemService("phone")).listen(new bd(), 256);
      int i = Math.abs(iEP);
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public static boolean bZ(Context paramContext)
  {
    int i = aT(paramContext);
    if ((i == 0) || (i == 10))
    {
      z.d("!32@/B4Tb64lLpKaLNAssnLXZsAiNoRj3gI9", "[cpan] is wifi or 4g network");
      return true;
    }
    z.d("!32@/B4Tb64lLpKaLNAssnLXZsAiNoRj3gI9", "[cpan] is mobile network");
    return false;
  }

  public static boolean by(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    try
    {
      boolean bool = localNetworkInfo.isConnected();
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static String bz(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localConnectivityManager == null)
      return "NON_NETWORK";
    NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
    if (localNetworkInfo == null)
      return "NON_NETWORK";
    if (localNetworkInfo.getType() == 1)
      return "WIFI";
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localNetworkInfo.getExtraInfo();
    arrayOfObject[1] = Integer.valueOf(localNetworkInfo.getType());
    z.d("!32@/B4Tb64lLpKaLNAssnLXZsAiNoRj3gI9", "activeNetInfo extra=%s, type=%d", arrayOfObject);
    if (localNetworkInfo.getExtraInfo() != null)
      return localNetworkInfo.getExtraInfo();
    return "MOBILE";
  }

  public static boolean ou(int paramInt)
  {
    return (paramInt == 2) || (paramInt == 5) || (paramInt == 7) || (paramInt == 3);
  }

  public static boolean ov(int paramInt)
  {
    return paramInt == 0;
  }

  public static boolean ow(int paramInt)
  {
    return (paramInt == 2) || (paramInt == 1) || (paramInt == 3);
  }

  public static void y(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    case 0:
    default:
      return;
    case 2:
      try
      {
        Intent localIntent3 = new Intent("/");
        localIntent3.setComponent(new ComponentName("com.android.providers.subscribedfeeds", "com.android.settings.ManageAccountsSettings"));
        localIntent3.setAction("android.intent.action.VIEW");
        paramContext.startActivity(localIntent3);
        return;
      }
      catch (Exception localException3)
      {
        try
        {
          Intent localIntent4 = new Intent("/");
          localIntent4.setComponent(new ComponentName("com.htc.settings.accountsync", "com.htc.settings.accountsync.ManageAccountsSettings"));
          localIntent4.setAction("android.intent.action.VIEW");
          paramContext.startActivity(localIntent4);
          return;
        }
        catch (Exception localException4)
        {
          Y(paramContext, "ManageAccountsSettings");
          return;
        }
      }
    case 1:
      try
      {
        Intent localIntent2 = new Intent("/");
        localIntent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.DevelopmentSettings"));
        localIntent2.setAction("android.intent.action.VIEW");
        paramContext.startActivity(localIntent2);
        return;
      }
      catch (Exception localException2)
      {
        Y(paramContext, "DevelopmentSettings");
        return;
      }
    case 3:
    }
    try
    {
      Intent localIntent1 = new Intent();
      localIntent1.setAction("android.settings.WIFI_IP_SETTINGS");
      paramContext.startActivity(localIntent1);
      return;
    }
    catch (Exception localException1)
    {
      Y(paramContext, "AdvancedSettings");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bc
 * JD-Core Version:    0.6.2
 */