package com.tencent.smtt.sdk;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.smtt.a.a;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

public class e
{
  private static boolean eZh = false;
  public static boolean kdJ = false;
  private static int kdK;
  private static Class kdL;
  private static Object kdM;
  private static boolean kdN = false;
  private static boolean kdO = false;

  public static boolean aF(Context paramContext, String paramString)
  {
    if (!bU(paramContext))
      return false;
    Object localObject = a.a(kdL, "canOpenMimeFileType", new Class[] { String.class }, new Object[] { paramString });
    if (localObject == null)
      return false;
    return ((Boolean)localObject).booleanValue();
  }

  private static boolean bU(Context paramContext)
  {
    boolean bool = true;
    if (!kdJ)
    {
      f.e("QbSdk", "svn version is 225382");
      kdJ = bool;
    }
    if ((kdN) || (kdO))
      bool = false;
    while (true)
    {
      return bool;
      try
      {
        File localFile1 = paramContext.getDir("x5core", 0);
        PackageManager localPackageManager = paramContext.getPackageManager();
        PackageInfo localPackageInfo = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
        if ((kdK != 0) && (kdK != localPackageInfo.versionCode))
        {
          kdL = null;
          kdM = null;
          if ((localFile1 != null) && (localFile1.exists()) && (localFile1.isDirectory()))
            break label220;
        }
        Context localContext;
        File localFile2;
        label220: File[] arrayOfFile;
        int i;
        do
        {
          kdK = localPackageInfo.versionCode;
          if (kdL != null)
            break;
          localContext = paramContext.createPackageContext("com.tencent.mtt", 2);
          localFile2 = new File(localContext.getDir("x5_share", 0), "sdk_shell.jar");
          if (localFile2.exists())
            break label266;
          Intent localIntent = new Intent("com.tencent.mtt.ACTION_INSTALL_X5");
          localIntent.setPackage("com.tencent.mtt");
          List localList = localPackageManager.queryIntentServices(localIntent, 0);
          if ((localList != null) && (localList.size() > 0))
            paramContext.startService(localIntent);
          eZh = true;
          f.e("QbSdk", "sys WebView: no dex");
          return false;
          arrayOfFile = localFile1.listFiles();
          i = arrayOfFile.length;
          j = 0;
        }
        while (j >= i);
        File localFile3 = arrayOfFile[j];
        if (localFile3.isFile())
        {
          localFile3.delete();
          break label413;
          label266: Class localClass = new DexClassLoader(localFile2.getAbsolutePath(), localFile1.getAbsolutePath(), null, e.class.getClassLoader()).loadClass("com.tencent.mtt.sdk.shell.SdkShell");
          kdL = localClass;
          Object localObject = localClass.getConstructor(new Class[] { Context.class }).newInstance(new Object[] { localContext });
          kdM = localObject;
          Class[] arrayOfClass = new Class[1];
          arrayOfClass[0] = Integer.TYPE;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(1);
          a.a(localObject, "setClientVersion", arrayOfClass, arrayOfObject);
          return bool;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        f.e("QbSdk", "sys WebView: nameNotFound");
        return false;
      }
      catch (Exception localException)
      {
        while (true)
        {
          int j;
          f.e("QbSdk", "sys WebView: " + localException.getMessage());
          continue;
          label413: j++;
        }
      }
    }
  }

  public static String bds()
  {
    Object localObject = a.a(kdL, "getX5CoreTimestamp", null, new Object[0]);
    if (localObject == null)
      return "";
    return (String)localObject;
  }

  static void bdt()
  {
    kdN = true;
    f.e("QbSdk", "sys WebView: forceSysWebViewInner called");
  }

  public static void bdu()
  {
    kdO = true;
    f.e("QbSdk", "sys WebView: forceSysWebView called");
  }

  public static boolean cO(Context paramContext)
  {
    if (!bU(paramContext))
      return false;
    a.a(kdM, "setAppContext", new Class[] { Context.class }, new Object[] { paramContext });
    Object localObject = a.a(kdM, "canLoadX5");
    if (localObject == null)
      return false;
    return ((Boolean)localObject).booleanValue();
  }

  public static boolean cP(Context paramContext)
  {
    try
    {
      List localList = ((ActivityManager)paramContext.getApplicationContext().getSystemService("activity")).getRunningAppProcesses();
      if ((localList == null) || (localList.size() == 0))
        break label100;
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if ((localRunningAppProcessInfo.importance == 100) && (localRunningAppProcessInfo.processName != null))
        {
          boolean bool = localRunningAppProcessInfo.processName.contains("com.tencent.mtt:VideoService");
          if (bool)
            return true;
        }
      }
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
    label100: return false;
  }

  static void cQ(Context paramContext)
  {
    if (eZh);
    while (true)
    {
      return;
      eZh = true;
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        if (!new File(paramContext.createPackageContext("com.tencent.mtt", 2).getDir("x5_share", 0), "sdk_shell.jar").exists())
        {
          Intent localIntent = new Intent("com.tencent.mtt.ACTION_INSTALL_X5");
          localIntent.setPackage("com.tencent.mtt");
          List localList = localPackageManager.queryIntentServices(localIntent, 0);
          if ((localList != null) && (localList.size() > 0))
            paramContext.startService(localIntent);
          f.e("QbSdk", "sys WebView: no dex");
          return;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
      catch (Throwable localThrowable)
      {
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.e
 * JD-Core Version:    0.6.2
 */