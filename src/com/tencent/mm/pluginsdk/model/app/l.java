package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.tencent.mm.a.f;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.ad;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.sdk.a.a;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.m;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.ArrayList;
import java.util.List;

public final class l
{
  public static k F(String paramString, boolean paramBoolean)
  {
    k localk = null;
    if ((paramString == null) || (paramString.length() == 0))
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getAppInfo, appId is null");
    while (true)
    {
      return localk;
      if (g.axW() == null)
      {
        z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getISubCorePluginBase() == null");
        return null;
      }
      localk = g.axW().nt(paramString);
      if (paramBoolean)
      {
        if ((localk == null) || (localk.field_appName == null) || (localk.field_appName.length() == 0));
        for (int i = 1; i != 0; i = 0)
        {
          g.axW().uJ(paramString);
          return localk;
        }
      }
    }
  }

  public static m a(Context paramContext, String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2)
  {
    z.d("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "request pkg = " + paramString1 + ", openId = " + paramString2);
    m localm = new m();
    localm.iDh = paramWXMediaMessage;
    localm.hvw = f.d(ch.CM().getBytes());
    localm.ehE = paramString2;
    localm.dAo = y.d(paramContext.getSharedPreferences(ak.aHi(), 0));
    localm.dCE = ((String)bg.qW().oQ().get(274436));
    Bundle localBundle = new Bundle();
    localm.d(localBundle);
    u.u(localBundle);
    u.v(localBundle);
    com.tencent.mm.sdk.a.b localb = new com.tencent.mm.sdk.a.b();
    localb.iCY = paramString1;
    localb.iDa = localBundle;
    a.a(paramContext, localb);
    return localm;
  }

  public static String a(Context paramContext, k paramk, String paramString)
  {
    if ((paramContext == null) || (paramk == null));
    label131: label140: label147: 
    while (true)
    {
      return paramString;
      String str1 = bf(paramContext);
      boolean bool = str1.equalsIgnoreCase("zh_CN");
      String str2 = null;
      if (bool)
        str2 = paramk.field_appName;
      if (str1.equalsIgnoreCase("en"))
      {
        if (ch.jb(paramk.field_appName_en))
          str2 = paramk.field_appName;
      }
      else
      {
        if (str1.equalsIgnoreCase("zh_TW"))
        {
          if (!ch.jb(paramk.field_appName_tw))
            break label131;
          str2 = paramk.field_appName;
        }
        label87: if (ch.jb(str2))
          if (!ch.jb(paramk.field_appName_en))
            break label140;
      }
      for (str2 = paramk.field_appName; ; str2 = paramk.field_appName_en)
      {
        if (ch.jb(str2))
          break label147;
        return str2;
        str2 = paramk.field_appName_en;
        break;
        str2 = paramk.field_appName_tw;
        break label87;
      }
    }
  }

  public static List a(Context paramContext, boolean paramBoolean, int paramInt)
  {
    Object localObject = new ArrayList();
    if (g.axW() == null)
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getISubCorePluginBase() == null");
    Cursor localCursor;
    do
    {
      int[] arrayOfInt;
      do
      {
        return localObject;
        localObject = aI(1, paramInt);
        arrayOfInt = null;
        if (paramBoolean)
          arrayOfInt = new int[] { 5 };
      }
      while (arrayOfInt == null);
      localCursor = g.axW().d(arrayOfInt);
    }
    while (localCursor == null);
    while (localCursor.moveToNext())
    {
      k localk = new k();
      localk.b(localCursor);
      if (localk.field_status == 1)
      {
        if (d(paramContext, localk.field_appId))
        {
          if (!ch.jb(localk.field_signature))
            ((List)localObject).add(localk);
        }
        else
        {
          localk.field_status = 4;
          g.axW().f(localk);
        }
      }
      else if (localk.field_signature != null)
        ((List)localObject).add(localk);
    }
    localCursor.close();
    return localObject;
  }

  private static List aI(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    if (g.axW() == null)
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
    Cursor localCursor;
    do
    {
      return localArrayList;
      localCursor = g.axW().aH(1, paramInt2);
    }
    while (localCursor == null);
    while (localCursor.moveToNext())
    {
      k localk = new k();
      localk.b(localCursor);
      if (!ch.jb(localk.field_openId))
        localArrayList.add(localk);
    }
    localCursor.close();
    return localArrayList;
  }

  public static boolean at(String paramString)
  {
    return (paramString != null) && (paramString.trim().length() != 0) && (!paramString.equals("weixinfile")) && (!paramString.equals("invalid_appname"));
  }

  public static boolean au(String paramString)
  {
    if (ch.jb(paramString))
      return false;
    k localk = F(paramString, false);
    if (localk == null)
    {
      z.w("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "app is null, appId = " + paramString);
      return false;
    }
    return localk.avN();
  }

  public static void ayF()
  {
    SharedPreferences localSharedPreferences = ak.aHj();
    if (localSharedPreferences != null)
      localSharedPreferences.edit().putString("key_app_ids_registion_while_not_login", "").commit();
  }

  public static Bitmap b(String paramString, int paramInt, float paramFloat)
  {
    if ((paramString == null) || (paramString.length() == 0))
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getAppIcon, appId is null");
    Bitmap localBitmap1;
    do
    {
      Bitmap localBitmap2;
      do
      {
        do
        {
          do
            return null;
          while (!bg.oE());
          if (bg.qW().isSDCardAvailable())
            break;
        }
        while ((ak.getContext() == null) || (ak.getContext().getResources() == null));
        switch (paramInt)
        {
        case 2:
        default:
          z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getAppIcon, unknown iconType = " + paramInt);
          return null;
        case 1:
        case 3:
        case 4:
        case 5:
        }
        localBitmap2 = BitmapFactory.decodeResource(ak.getContext().getResources(), h.aaG);
      }
      while ((localBitmap2 == null) || (localBitmap2.isRecycled()));
      return localBitmap2;
      localBitmap1 = g.axW().a(paramString, paramInt, paramFloat);
      if (localBitmap1 == null)
      {
        z.w("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getAppIcon, bm does not exist or has been recycled");
        g.axW().aa(paramString, paramInt);
        return null;
      }
    }
    while (localBitmap1.isRecycled());
    return localBitmap1;
  }

  public static List be(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    if (g.axW() == null)
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getISubCorePluginBase() == null");
    Cursor localCursor;
    do
    {
      return localArrayList;
      localCursor = g.axW().mf(5);
    }
    while (localCursor == null);
    while (localCursor.moveToNext())
    {
      k localk = new k();
      localk.b(localCursor);
      if (localk.field_status == 1)
      {
        if (d(paramContext, localk.field_appId))
        {
          if (!ch.jb(localk.field_signature))
            localArrayList.add(localk);
        }
        else
        {
          localk.field_status = 4;
          g.axW().f(localk);
        }
      }
      else if (localk.field_signature != null)
        localArrayList.add(localk);
    }
    localCursor.close();
    return localArrayList;
  }

  private static String bf(Context paramContext)
  {
    String str = y.d(paramContext.getSharedPreferences(ak.aHi(), 0));
    if ((str == null) || (str.length() == 0) || (str.equalsIgnoreCase("zh_CN")))
      str = "zh_CN";
    return str;
  }

  public static String c(Context paramContext, String paramString)
  {
    return a(paramContext, F(paramString, true), null);
  }

  public static boolean c(Context paramContext, k paramk)
  {
    if (paramk == null)
    {
      z.w("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "app is null");
      return false;
    }
    if ((paramk.field_packageName == null) || (paramk.field_packageName.length() == 0))
    {
      z.w("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "field_packageName is null");
      return false;
    }
    return u.d(paramContext, paramk.field_packageName);
  }

  public static String d(Context paramContext, k paramk)
  {
    return a(paramContext, paramk, null);
  }

  public static boolean d(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "isAppInstalled, invalid arguments");
      return false;
    }
    return c(paramContext, F(paramString, true));
  }

  public static String e(Context paramContext, k paramk)
  {
    if ((paramContext == null) || (paramk == null))
      return null;
    String str = bf(paramContext);
    if (str.equalsIgnoreCase("zh_CN"))
      return paramk.field_appDiscription;
    if (str.equalsIgnoreCase("zh_TW"))
    {
      if (ch.jb(paramk.field_appDiscription_tw))
        return paramk.field_appDiscription;
      return paramk.field_appDiscription_tw;
    }
    if (str.equalsIgnoreCase("en"))
    {
      if (ch.jb(paramk.field_appDiscription_en))
        return paramk.field_appDiscription;
      return paramk.field_appDiscription_en;
    }
    if (ch.jb(paramk.field_appDiscription_en))
      return paramk.field_appDiscription;
    return paramk.field_appDiscription_en;
  }

  public static boolean i(k paramk)
  {
    if ((paramk == null) || (ch.jb(paramk.field_appId)));
    while ((0x1 & paramk.field_appInfoFlag) <= 0)
      return false;
    return true;
  }

  public static boolean j(k paramk)
  {
    if (paramk == null);
    while ((0x2 & paramk.field_appInfoFlag) == 0)
      return true;
    return false;
  }

  public static boolean k(k paramk)
  {
    if ((paramk == null) || (ch.jb(paramk.field_appId)))
      return false;
    if ((0x40 & paramk.field_appInfoFlag) > 0);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramk.field_appId;
      arrayOfObject[1] = Boolean.valueOf(bool);
      z.v("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "canReadMMMsg, appid = %s, ret = %b", arrayOfObject);
      return bool;
    }
  }

  public static boolean l(k paramk)
  {
    if ((paramk == null) || (ch.jb(paramk.field_appId)));
    label61: 
    while (true)
    {
      return false;
      if ((0x80 & paramk.field_appInfoFlag) > 0);
      for (int i = 1; ; i = 0)
      {
        if (1 != i)
          break label61;
        String str = x.da(paramk.field_appId);
        if ((str != null) && (!str.equals("0")))
          break;
        return true;
      }
    }
  }

  public static k nt(String paramString)
  {
    return F(paramString, true);
  }

  public static boolean uV(String paramString)
  {
    if (ch.jb(paramString));
    k localk;
    do
    {
      return false;
      localk = F(paramString, true);
      if (localk == null)
      {
        z.w("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "app is null, appId = " + paramString);
        return false;
      }
      if (localk.field_authFlag == 0)
        return true;
    }
    while ((0x2 & localk.field_authFlag) <= 0);
    return true;
  }

  public static boolean uW(String paramString)
  {
    if (ch.jb(paramString));
    k localk;
    do
    {
      return false;
      localk = F(paramString, true);
    }
    while ((localk == null) || (ch.jb(localk.field_appId)) || ((0x8 & localk.field_appInfoFlag) <= 0));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.l
 * JD-Core Version:    0.6.2
 */