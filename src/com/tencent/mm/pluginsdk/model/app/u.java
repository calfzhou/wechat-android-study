package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.a.f;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ad;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class u
{
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "buildSourceUrl fail, invalid arguments");
      return null;
    }
    String str = y.d(paramContext.getSharedPreferences(ak.aHi(), 0));
    if ((str == null) || (str.length() == 0))
      str = "zh_CN";
    while (true)
    {
      int i = n.bUG;
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = Integer.valueOf(a.hrn);
      arrayOfObject[2] = str;
      arrayOfObject[3] = a.hrg;
      arrayOfObject[4] = paramString2;
      return paramContext.getString(i, arrayOfObject);
      if (str.equals("en"))
        str = "en_US";
    }
  }

  public static String a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "buildRedirectUrl fail, invalid arguments");
      return null;
    }
    int i;
    String str1;
    LinkedHashMap localLinkedHashMap;
    int n;
    label164: String str6;
    String str8;
    String str7;
    if (paramBoolean)
    {
      i = 1;
      int j = paramString1.indexOf("#");
      str1 = "";
      if (j >= 0)
      {
        str1 = paramString1.substring(j);
        paramString1 = paramString1.substring(0, j);
      }
      int k = paramString1.indexOf("?");
      String str2 = "";
      if (k >= 0)
      {
        str2 = paramString1.substring(k + 1);
        paramString1 = paramString1.substring(0, k);
      }
      z.v("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "buildRedirectUrl, sharpStr = %s, paramStr = %s, srcUrl = %s", new Object[] { str1, str2, paramString1 });
      localLinkedHashMap = new LinkedHashMap();
      if (ch.jb(str2))
        break label281;
      String[] arrayOfString = str2.split("&");
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
        break label281;
      int m = arrayOfString.length;
      n = 0;
      if (n >= m)
        break label281;
      str6 = arrayOfString[n];
      if (!ch.jb(str6))
      {
        int i1 = str6.indexOf("=");
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i1);
        z.v("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "buildRedirectUrl, equalIdx = %d", arrayOfObject2);
        if (i1 < 0)
          break label270;
        str8 = str6.substring(0, i1 + 1);
        str7 = str6.substring(i1 + 1);
      }
    }
    while (true)
    {
      localLinkedHashMap.put(str8, str7);
      n++;
      break label164;
      i = 0;
      break;
      label270: str7 = "";
      str8 = str6;
    }
    label281: if (paramString2 == null)
      paramString2 = "";
    localLinkedHashMap.put("from=", paramString2);
    localLinkedHashMap.put("isappinstalled=", String.valueOf(i));
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(localLinkedHashMap.size());
    z.v("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "buildRedirectUrl, pMap size = %d", arrayOfObject1);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = localLinkedHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str5 = (String)localIterator.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append(str5);
      localStringBuilder.append((String)localLinkedHashMap.get(str5));
    }
    String str3 = localStringBuilder.toString();
    String str4 = paramString1 + "?" + str3;
    if (!ch.jb(str1))
      str4 = str4 + str1;
    z.v("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "buildRedirectUrl, ret url = %s", new Object[] { str4 });
    return str4;
  }

  public static PackageInfo ai(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "getPackageInfo, packageName is null");
      return null;
    }
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      z.w("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "app not installed, packageName = " + paramString);
    }
    return null;
  }

  public static String aj(Context paramContext, String paramString)
  {
    Signature[] arrayOfSignature = ak(paramContext, paramString);
    if ((arrayOfSignature == null) || (arrayOfSignature.length == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "signs is null");
      return null;
    }
    return vf(f.d(arrayOfSignature[0].toByteArray()));
  }

  public static Signature[] ak(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "getSignature, packageName is null");
      return null;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    PackageInfo localPackageInfo;
    try
    {
      localPackageInfo = localPackageManager.getPackageInfo(paramString, 64);
      if (localPackageInfo == null)
      {
        z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "info is null, packageName = " + paramString);
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "NameNotFoundException");
      return null;
    }
    return localPackageInfo.signatures;
  }

  public static boolean an(Context paramContext, String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    Intent localIntent1 = new Intent("android.intent.action.VIEW", localUri);
    localIntent1.addFlags(268435456);
    if (ai(paramContext, "com.android.vending") != null)
    {
      z.v("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "installAppWithGP, gp is installed, url = %s", new Object[] { paramString });
      localIntent1.setPackage("com.android.vending");
    }
    try
    {
      while (true)
      {
        paramContext.startActivity(localIntent1);
        return true;
        z.v("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "installAppWithGP, gp is not installed, url = %s", new Object[] { paramString });
      }
    }
    catch (Exception localException1)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException1.getMessage();
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "installAppWithGP first, ex = %s", arrayOfObject1);
      try
      {
        Intent localIntent2 = new Intent("android.intent.action.VIEW", localUri);
        localIntent2.addFlags(268435456);
        paramContext.startActivity(localIntent2);
        return true;
      }
      catch (Exception localException2)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException2.getMessage();
        z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "installAppWithGP second, ex = %s", arrayOfObject2);
      }
    }
    return false;
  }

  public static boolean b(Context paramContext, k paramk, String paramString)
  {
    ad localad = g.axW();
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "isAppValid, packageName is null");
      localad.g(paramk);
      return false;
    }
    if (paramk == null)
    {
      z.i("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "app does not exist");
      return true;
    }
    if ((paramk.field_packageName == null) || (paramk.field_packageName.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "isAppValid fail, local packageName is null");
      localad.g(paramk);
      return false;
    }
    if ((paramk.field_signature == null) || (paramk.field_signature.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "isAppValid fail, local signature is null");
      localad.g(paramk);
      return false;
    }
    Signature[] arrayOfSignature = ak(paramContext, paramString);
    if ((arrayOfSignature == null) || (arrayOfSignature.length == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "isAppValid, apk signatures is null");
      localad.g(paramk);
      return false;
    }
    if (!paramk.field_packageName.equals(paramString))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "isAppValid, packageName is diff, src=" + paramk.field_packageName);
      localad.g(paramk);
      return false;
    }
    int i = arrayOfSignature.length;
    for (int j = 0; j < i; j++)
    {
      String str = vf(f.d(arrayOfSignature[j].toByteArray()));
      if ((paramk.field_signature != null) && (paramk.field_signature.equals(str)))
      {
        localad.h(paramk);
        return true;
      }
    }
    z.w("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "isAppValid, signature is diff");
    localad.g(paramk);
    return false;
  }

  public static boolean c(Context paramContext, Uri paramUri)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(paramUri, "application/vnd.android.package-archive");
    localIntent.addFlags(268435456);
    try
    {
      paramContext.startActivity(localIntent);
      return true;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "install app failed: " + paramUri.toString() + ", ex = " + localException.getMessage());
    }
    return false;
  }

  public static boolean d(Context paramContext, String paramString)
  {
    return ai(paramContext, paramString) != null;
  }

  public static boolean f(Context paramContext, k paramk)
  {
    z.i("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "check the signature of the Application.");
    if (paramContext == null)
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "context is null.");
      return true;
    }
    if (paramk == null)
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "appInfo is null.");
      return true;
    }
    if (ch.jb(paramk.field_packageName))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "packageName is null.");
      return true;
    }
    if (ch.jb(paramk.field_signature))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = paramk.field_packageName;
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "app.field_signature is null. app.field_packageName is %s", arrayOfObject3);
      return true;
    }
    Signature[] arrayOfSignature = ak(paramContext, paramk.field_packageName);
    if ((arrayOfSignature == null) || (arrayOfSignature.length == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "apk signatures is null");
      return false;
    }
    int i = arrayOfSignature.length;
    for (int j = 0; j < i; j++)
    {
      String str = vf(f.d(arrayOfSignature[j].toByteArray()));
      if (paramk.field_signature.equals(str))
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = paramk.field_appName;
        arrayOfObject2[1] = paramk.field_signature;
        z.i("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "app_name : %s ,signature : %s", arrayOfObject2);
        return true;
      }
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = paramk.field_appName;
    z.w("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "signature is diff.(app_name:%s)", arrayOfObject1);
    return false;
  }

  public static String i(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "buildUnistallUrl fail, invalid arguments");
      return null;
    }
    String str = y.d(paramContext.getSharedPreferences(ak.aHi(), 0));
    if ((str == null) || (str.length() == 0))
      str = "zh_CN";
    while (true)
    {
      int i = n.bUH;
      Object[] arrayOfObject = new Object[6];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = Integer.valueOf(a.hrn);
      arrayOfObject[2] = str;
      arrayOfObject[3] = a.hrg;
      arrayOfObject[4] = paramString2;
      arrayOfObject[5] = Integer.valueOf(0);
      return paramContext.getString(i, arrayOfObject);
      if (str.equals("en"))
        str = "en_US";
    }
  }

  public static void u(Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.putString("wx_token_key", "com.tencent.mm.openapi.token");
  }

  public static void v(Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.putString("platformId", "wechat");
  }

  public static String ve(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "getDbSignature, svrSign is null");
      return null;
    }
    return vf(paramString);
  }

  private static String vf(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString.toLowerCase());
    localStringBuffer.append("mMHc ItnStR");
    return f.d(localStringBuffer.toString().getBytes());
  }

  public static void vg(String paramString)
  {
    if (ch.jb(paramString))
      z.e("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "appid is null");
    SharedPreferences localSharedPreferences;
    do
    {
      return;
      localSharedPreferences = ak.aHj();
    }
    while (localSharedPreferences == null);
    String str1 = localSharedPreferences.getString("key_app_ids_registion_while_not_login", "");
    if (str1.contains(paramString))
    {
      z.i("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "this app has been saved : %s in %s", new Object[] { paramString, str1 });
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("|");
    localStringBuilder.append(str1);
    String str2 = localStringBuilder.toString();
    localSharedPreferences.edit().putString("key_app_ids_registion_while_not_login", str2).commit();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.u
 * JD-Core Version:    0.6.2
 */