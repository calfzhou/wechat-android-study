package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.mm.b.a;
import com.tencent.mm.b.c;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class an
{
  private static final long[] iCn = { 0L, 259200000L, 604800000L };

  public static boolean AE(String paramString)
  {
    String[] arrayOfString = aML();
    boolean bool = false;
    int i;
    if (arrayOfString != null)
      i = arrayOfString.length;
    for (int j = 0; ; j++)
    {
      bool = false;
      if (j < i)
      {
        if (arrayOfString[j].equals(paramString))
          bool = true;
      }
      else
        return bool;
    }
  }

  public static long AF(String paramString)
  {
    long l = ak.getContext().getSharedPreferences("update_flowstat_prefs", m.nN()).getLong(paramString, 0L);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Long.valueOf(l);
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "getPackFlowStat pack %s, flow %s", arrayOfObject);
    return l;
  }

  public static void a(Context paramContext, int paramInt1, int paramInt2)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
    localIntent.putExtra("intent_extra_is_silence_stat", true);
    localIntent.putExtra("intent_extra_opcode", paramInt1);
    if (paramInt1 == 2)
      localIntent.putExtra("intent_extra_install_dialog_times", paramInt2);
    paramContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
  }

  public static String aMF()
  {
    return ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).getString("update_downloaded_pack_md5_key", null);
  }

  public static String aMG()
  {
    return ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).getString("update_downloaded_pack_desc_key", null);
  }

  public static int aMH()
  {
    return ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).getInt("update_downloaded_pack_download_mode", 0);
  }

  public static boolean aMI()
  {
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("update_config_prefs", m.nN());
    long l1 = localSharedPreferences.getLong("update_downloaded_cancel_ts", 0L);
    int i = localSharedPreferences.getInt("update_downloaded_cancel_times", 0);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(l1);
    arrayOfObject[1] = Integer.valueOf(i);
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "checkIgnoreDownloadedPack last: %s times: %s", arrayOfObject);
    if (i > -1 + iCn.length);
    do
    {
      return true;
      long l2 = iCn[i];
      if (System.currentTimeMillis() - l1 > l2)
        return false;
    }
    while (System.currentTimeMillis() - l1 >= 0L);
    z.e("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "user modify mobile time. we just remove the config.");
    aMQ();
    return true;
  }

  public static int aMJ()
  {
    int i = ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).getInt("update_downloaded_cancel_times", 0);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "getIgnoreDownloadedPackTimes times %s", arrayOfObject);
    return i;
  }

  public static void aMK()
  {
    int i = 0;
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("update_config_prefs", m.nN());
    int j = localSharedPreferences.getInt("update_downloaded_cancel_times", 0);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(j);
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "putIgnoreDownloadedPack times %s", arrayOfObject);
    if (j >= -1 + iCn.length)
    {
      String str1 = aMF();
      boolean bool = ch.jb(str1);
      StringBuffer localStringBuffer = null;
      if (!bool)
      {
        String[] arrayOfString = aML();
        localStringBuffer = new StringBuffer();
        localStringBuffer.append(str1);
        if (arrayOfString != null)
        {
          int m = arrayOfString.length;
          while (i < m)
          {
            String str2 = arrayOfString[i];
            if (!ch.jb(str2))
            {
              localStringBuffer.append(":");
              localStringBuffer.append(str2);
            }
            i++;
          }
        }
      }
      localSharedPreferences.edit().clear().commit();
      if (localStringBuffer != null)
        localSharedPreferences.edit().putString("update_downloaded_ignored_pack", localStringBuffer.toString()).commit();
      return;
    }
    int k = j + 1;
    localSharedPreferences.edit().putLong("update_downloaded_cancel_ts", System.currentTimeMillis()).putInt("update_downloaded_cancel_times", k).commit();
  }

  private static String[] aML()
  {
    String str = ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).getString("update_downloaded_ignored_pack", null);
    if (ch.jb(str))
      return null;
    return str.split(":");
  }

  public static boolean aMM()
  {
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("update_config_prefs", m.nN());
    long l = localSharedPreferences.getLong("update_downloading_in_silence", 0L);
    boolean bool1 = localSharedPreferences.getBoolean("update_download_start_one_immediate", false);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(l);
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "hasUnfinishDownloadingInSilence unfinish %s", arrayOfObject);
    boolean bool2;
    if (!bool1)
    {
      boolean bool3 = l < 0L;
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = System.currentTimeMillis() - l < 3600000L;
        bool2 = false;
        if (!bool4);
      }
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }

  public static void aMN()
  {
    ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).edit().putLong("update_downloading_in_silence", System.currentTimeMillis()).putBoolean("update_download_start_one_immediate", false).commit();
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "putDowningInSilence");
  }

  public static void aMO()
  {
    ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).edit().putBoolean("update_download_start_one_immediate", true).commit();
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "putOneDownloadTask");
  }

  public static void aMP()
  {
    ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).edit().remove("update_downloading_in_silence").commit();
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "removeUnfinishDownloadingInSilence");
  }

  public static void aMQ()
  {
    ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).edit().clear().commit();
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "clearUpdateConfigPrefs");
  }

  private static String br(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).applicationInfo.sourceDir;
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String bs(Context paramContext)
  {
    String str = br(paramContext);
    if ((str == null) || (!new File(str).exists()))
      return null;
    a locala = a.aj(str);
    if ((locala != null) && (locala.hl() != null))
      return locala.hl().hn();
    return com.tencent.mm.a.f.ag(str);
  }

  public static long c(String paramString, long paramLong1, long paramLong2)
  {
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("update_flowstat_prefs", m.nN());
    long l1 = localSharedPreferences.getLong(paramString, 0L);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = Long.valueOf(paramLong1);
    arrayOfObject1[2] = Long.valueOf(paramLong2);
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "putPackFlowStat pack %s, flowUp %s, flowDown %s", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = paramString;
    arrayOfObject2[1] = Long.valueOf(l1);
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "putPackFlowStat pack %s, flow %s", arrayOfObject2);
    long l2 = l1 + (paramLong1 + paramLong2);
    localSharedPreferences.edit().putLong(paramString, l2).commit();
    return l2;
  }

  public static int e(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    return com.tencent.mm.b.f.a(br(paramContext), paramString1, paramString2, paramString3);
  }

  public static void f(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    ak.getContext().getSharedPreferences("update_config_prefs", m.nN()).edit().putString("update_downloaded_pack_md5_key", paramString1).putString("update_downloaded_pack_desc_key", paramString2).putInt("update_downloaded_pack_size_key", paramInt1).putInt("update_downloaded_pack_download_mode", paramInt2).commit();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    z.i("!32@/B4Tb64lLpK9XuYWhbQlHtRMppGWmwU7", "putDownloadedPackInfo md5: %s size: %s", arrayOfObject);
  }

  public static void t(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
    localIntent.putExtra("intent_extra_is_silence_stat", false);
    localIntent.putExtra("intent_extra_opcode", paramInt);
    paramContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
  }

  public static void u(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.an
 * JD-Core Version:    0.6.2
 */