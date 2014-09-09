package com.tencent.mm.pluginsdk.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.tencent.mm.h;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class s extends x
{
  public static final String[] hup = { "application/msword", "application/vnd.ms-powerpoint", "application/vnd.ms-excel", "application/pdf", "application/epub+zip", "text/plain", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/zip", "application/rar" };
  public static final int[] huq;
  public static final int[] hur = arrayOfInt2;

  static
  {
    int[] arrayOfInt1 = new int[11];
    arrayOfInt1[0] = h.RL;
    arrayOfInt1[1] = h.RA;
    arrayOfInt1[2] = h.Rt;
    arrayOfInt1[3] = h.Rx;
    arrayOfInt1[4] = h.Rr;
    arrayOfInt1[5] = h.RE;
    arrayOfInt1[6] = h.RL;
    arrayOfInt1[7] = h.Rt;
    arrayOfInt1[8] = h.RA;
    arrayOfInt1[9] = h.RC;
    arrayOfInt1[10] = h.RC;
    huq = arrayOfInt1;
    int[] arrayOfInt2 = new int[11];
    arrayOfInt2[0] = h.RM;
    arrayOfInt2[1] = h.RB;
    arrayOfInt2[2] = h.Ru;
    arrayOfInt2[3] = h.Ry;
    arrayOfInt2[4] = h.Rs;
    arrayOfInt2[5] = h.RF;
    arrayOfInt2[6] = h.RM;
    arrayOfInt2[7] = h.Ru;
    arrayOfInt2[8] = h.RB;
    arrayOfInt2[9] = h.RD;
    arrayOfInt2[10] = h.RD;
  }

  public static int E(String paramString, boolean paramBoolean)
  {
    String str = null;
    if (paramString != null)
    {
      int k = paramString.length();
      str = null;
      if (k > 0)
        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
    }
    if ((str == null) || (str.length() == 0))
      str = "*/" + paramString;
    int i = 0;
    int j = -1;
    while (i < hup.length)
    {
      if (hup[i].equals(str))
        j = i;
      i++;
    }
    if (j != -1)
    {
      if (paramBoolean)
        return hur[j];
      return huq[j];
    }
    if (paramBoolean)
      return h.RH;
    return h.RG;
  }

  public static int ah(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return 3;
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
      bool = false;
    Object localObject;
    t localt1;
    while (true)
    {
      if (!bool)
        paramString = "http://" + paramString;
      try
      {
        Uri localUri1 = Uri.parse(paramString);
        localObject = localUri1;
        if (localObject == null)
        {
          return 2;
          String str = paramString.trim();
          int k = str.toLowerCase().indexOf("://");
          int m = str.toLowerCase().indexOf('.');
          if ((k > 0) && (m > 0) && (k > m))
            bool = false;
          else
            bool = str.toLowerCase().contains("://");
        }
        else
        {
          t localt2;
          int i;
          if (((Uri)localObject).getScheme().toLowerCase().equals("qb"))
          {
            localt2 = bd(paramContext);
            if (localt2.hus != -1)
              break label209;
            i = 0;
          }
          while (true)
          {
            if (i == 0)
            {
              Uri localUri2 = Uri.parse("http://mdc.html5.qq.com/d/directdown.jsp?channel_id=10318" + URLEncoder.encode(paramString, "UTF-8"));
              localObject = localUri2;
            }
            localt1 = bd(paramContext);
            if (localt1.hus != -1)
              break;
            return 4;
            label209: if (localt2.hus == 2)
            {
              int j = localt2.hut;
              if (j < 42)
                i = 0;
            }
            else
            {
              i = 1;
            }
          }
        }
      }
      catch (Exception localException)
      {
        return 2;
      }
    }
    if ((localt1.hus == 2) && (localt1.hut < 33))
      return 5;
    Intent localIntent = new Intent("android.intent.action.VIEW");
    if (localt1.hus == 2)
      if ((localt1.hut >= 33) && (localt1.hut <= 39))
        localIntent.setClassName("com.tencent.mtt", "com.tencent.mtt.MainActivity");
    while (true)
    {
      localIntent.setData((Uri)localObject);
      try
      {
        localIntent.putExtra("loginType", 24);
        paramContext.startActivity(localIntent);
        return 0;
        if ((localt1.hut >= 40) && (localt1.hut <= 45))
        {
          localIntent.setClassName("com.tencent.mtt", "com.tencent.mtt.SplashActivity");
        }
        else if (localt1.hut >= 46)
        {
          localIntent = new Intent("com.tencent.QQBrowser.action.VIEW");
          u localu3 = b(paramContext, (Uri)localObject);
          if ((localu3 != null) && (!TextUtils.isEmpty(localu3.classname)))
          {
            localIntent.setClassName(localu3.huv, localu3.classname);
            continue;
            if (localt1.hus == 1)
            {
              if (localt1.hut == 1)
                localIntent.setClassName("com.tencent.qbx5", "com.tencent.qbx5.MainActivity");
              else if (localt1.hut == 2)
                localIntent.setClassName("com.tencent.qbx5", "com.tencent.qbx5.SplashActivity");
            }
            else if (localt1.hus == 0)
            {
              if ((localt1.hut >= 4) && (localt1.hut <= 6))
              {
                localIntent.setClassName("com.tencent.qbx", "com.tencent.qbx.SplashActivity");
              }
              else if (localt1.hut > 6)
              {
                localIntent = new Intent("com.tencent.QQBrowser.action.VIEW");
                u localu2 = b(paramContext, (Uri)localObject);
                if ((localu2 != null) && (!TextUtils.isEmpty(localu2.classname)))
                  localIntent.setClassName(localu2.huv, localu2.classname);
              }
            }
            else
            {
              localIntent = new Intent("com.tencent.QQBrowser.action.VIEW");
              u localu1 = b(paramContext, (Uri)localObject);
              if ((localu1 != null) && (!TextUtils.isEmpty(localu1.classname)))
                localIntent.setClassName(localu1.huv, localu1.classname);
            }
          }
        }
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
      }
    }
    return 4;
  }

  private static u b(Context paramContext, Uri paramUri)
  {
    Intent localIntent = new Intent("com.tencent.QQBrowser.action.VIEW");
    localIntent.setData(paramUri);
    List localList = paramContext.getPackageManager().queryIntentActivities(localIntent, 0);
    if (localList.size() <= 0)
      return null;
    u localu = new u((byte)0);
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
      String str = localResolveInfo.activityInfo.packageName;
      if (str.contains("com.tencent.mtt"))
      {
        localu.classname = localResolveInfo.activityInfo.name;
        localu.huv = localResolveInfo.activityInfo.packageName;
        return localu;
      }
      if (str.contains("com.tencent.qbx"))
      {
        localu.classname = localResolveInfo.activityInfo.name;
        localu.huv = localResolveInfo.activityInfo.packageName;
      }
    }
    return localu;
  }

  public static boolean bc(Context paramContext)
  {
    return bd(paramContext).hus != -1;
  }

  private static t bd(Context paramContext)
  {
    t localt = new t();
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      PackageInfo localPackageInfo = null;
      try
      {
        localPackageInfo = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
        localt.hus = 2;
        localt.huu = "ADRQB_";
        if ((localPackageInfo != null) && (localPackageInfo.versionCode > 420000))
        {
          localt.hut = localPackageInfo.versionCode;
          localt.huu += localPackageInfo.versionName.replaceAll("\\.", "");
          return localt;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
      }
      try
      {
        localPackageInfo = localPackageManager.getPackageInfo("com.tencent.qbx", 0);
        localt.hus = 0;
        localt.huu = "ADRQBX_";
        if (localPackageInfo != null)
        {
          localt.hut = localPackageInfo.versionCode;
          localt.huu += localPackageInfo.versionName.replaceAll("\\.", "");
        }
        label177: return localt;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2)
      {
        while (true)
          try
          {
            localPackageInfo = localPackageManager.getPackageInfo("com.tencent.qbx5", 0);
            localt.hus = 1;
            localt.huu = "ADRQBX5_";
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException3)
          {
            try
            {
              localPackageInfo = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
              localt.hus = 2;
              localt.huu = "ADRQB_";
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException4)
            {
              try
              {
                localPackageInfo = localPackageManager.getPackageInfo("com.tencent.mtt.x86", 0);
                localt.hus = 2;
                localt.huu = "ADRQB_";
              }
              catch (Exception localException2)
              {
                try
                {
                  u localu = b(paramContext, Uri.parse("http://mdc.html5.qq.com/d/directdown.jsp?channel_id=10318"));
                  if ((localu != null) && (!TextUtils.isEmpty(localu.huv)))
                  {
                    localPackageInfo = localPackageManager.getPackageInfo(localu.huv, 0);
                    localt.hus = 2;
                    localt.huu = "ADRQB_";
                  }
                }
                catch (Exception localException3)
                {
                }
              }
            }
          }
      }
    }
    catch (Exception localException1)
    {
      break label177;
    }
  }

  public static boolean uR(String paramString)
  {
    String[] arrayOfString = hup;
    int i = arrayOfString.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (arrayOfString[j].equals(paramString))
          bool = true;
      }
      else
        return bool;
    }
  }

  public static int uT(String paramString)
  {
    return E(paramString, false);
  }

  public final String Dz()
  {
    return "http://mdc.html5.qq.com/d/directdown.jsp?channel_id=10318";
  }

  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    if ((paramContext == null) || (paramResolveInfo == null) || (paramResolveInfo.activityInfo == null) || (paramResolveInfo.activityInfo.packageName == null))
      return null;
    String str1 = paramResolveInfo.activityInfo.packageName;
    if ("com.qihoo.browser".equals(str1))
      return "360浏览器";
    if ("com.mx.browser".equals(str1))
      return "傲游云浏览器";
    if ("com.dolphin.browser.xf".equals(str1))
      return "海豚浏览器";
    if ("com.UCMobile".equals(str1))
      return "UC浏览器";
    if ("com.baidu.browser.apps".equals(str1))
      return "百度浏览器";
    if ("sogou.mobile.explorer".equals(str1))
      return "搜狗浏览器";
    if ("com.ijinshan.browser".equals(str1))
      return "猎豹浏览器";
    if ("com.mediawoz.xbrowser".equals(str1))
      return "GO浏览器";
    if ("com.oupeng.browser".equals(str1))
      return "欧朋浏览器";
    if ("com.tiantianmini.android.browser".equals(str1))
      return "天天浏览器";
    CharSequence localCharSequence = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager());
    if (localCharSequence != null)
    {
      String str2 = localCharSequence.toString();
      Matcher localMatcher = Pattern.compile("\\(.*推荐.*\\)", 2).matcher(str2);
      if (localMatcher.find())
        return localMatcher.replaceAll("");
    }
    return paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager()).toString();
  }

  public final String ayA()
  {
    return "qq_browser.apk";
  }

  public final boolean bb(Context paramContext)
  {
    t localt = bd(paramContext);
    if (localt.hus == -1);
    while ((localt.hus == 2) && (localt.hut < 33))
      return false;
    return true;
  }

  public final boolean h(Context paramContext, Intent paramIntent)
  {
    List localList = paramContext.getPackageManager().queryIntentActivities(paramIntent, 0);
    if ((localList != null) && (localList.size() > 0))
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str = ((ResolveInfo)localIterator.next()).activityInfo.packageName;
        if (str.contains("com.tencent.mtt"))
          return true;
        if (str.contains("com.tencent.qbx"))
          return true;
      }
    }
    return false;
  }

  public final boolean uS(String paramString)
  {
    return ("com.tencent.mtt".equals(paramString)) || ("com.tencent.qbx".equals(paramString)) || ("com.tencent.mtt.x86".equals(paramString)) || ("com.tencent.qbx5".equals(paramString));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.s
 * JD-Core Version:    0.6.2
 */