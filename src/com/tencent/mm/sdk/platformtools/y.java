package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class y
{
  public static void a(Context paramContext, Locale paramLocale)
  {
    Resources localResources = paramContext.getResources();
    Configuration localConfiguration = localResources.getConfiguration();
    if (localConfiguration.locale.equals(paramLocale))
      return;
    DisplayMetrics localDisplayMetrics = localResources.getDisplayMetrics();
    localConfiguration.locale = paramLocale;
    localResources.updateConfiguration(localConfiguration, localDisplayMetrics);
    Resources.getSystem().updateConfiguration(localConfiguration, localDisplayMetrics);
  }

  public static String aGV()
  {
    return Locale.getDefault().getCountry().trim();
  }

  public static String aGW()
  {
    String str = ch.ja(cq.getProperty("language_key"));
    if ((str.length() > 0) && (!str.equals("language_default")))
      return str;
    return xb("en");
  }

  public static String bx(Context paramContext)
  {
    String str1 = e(paramContext.getSharedPreferences(ak.aHi(), 0));
    String str2 = aGW();
    if (str1.equalsIgnoreCase("language_default"))
      return str2;
    return str1;
  }

  public static String d(SharedPreferences paramSharedPreferences)
  {
    String str1 = ch.ja(paramSharedPreferences.getString("language_key", null));
    if ((str1.length() > 0) && (!str1.equals("language_default")))
    {
      cq.setProperty("language_key", str1);
      return str1;
    }
    String str2 = xb("en");
    cq.setProperty("language_key", str2);
    return str2;
  }

  public static String e(SharedPreferences paramSharedPreferences)
  {
    String str = ch.ja(paramSharedPreferences.getString("language_key", null));
    if (!ch.jb(str))
      return str;
    return "language_default";
  }

  public static Locale xa(String paramString)
  {
    if ((paramString.equals("zh_TW")) || (paramString.equals("zh_HK")))
      return Locale.TAIWAN;
    if (paramString.equals("en"))
      return Locale.ENGLISH;
    if (paramString.equals("zh_CN"))
      return Locale.CHINA;
    if (paramString.equalsIgnoreCase("th"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("id"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("vi"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("pt"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("es"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("ru"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("ar"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("iw"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("pl"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("hi"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("ja"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("it"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("ko"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("ms"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("tr"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("de"))
      return new Locale(paramString);
    if (paramString.equalsIgnoreCase("fr"))
      return new Locale(paramString);
    z.e("!32@/B4Tb64lLpLP+TxLmxot54R/l4xnzF0l", "transLanguageToLocale country = " + paramString);
    return Locale.ENGLISH;
  }

  private static String xb(String paramString)
  {
    String str1 = Locale.getDefault().getLanguage().trim();
    if (str1.equals("en"))
      paramString = str1;
    do
    {
      return paramString;
      String str2 = Locale.getDefault().getLanguage().trim() + "_" + Locale.getDefault().getCountry().trim();
      if ((str2.equals("zh_TW")) || (str2.equals("zh_HK")))
        return "zh_TW";
      if ((Locale.getDefault().getLanguage().trim() + "_" + Locale.getDefault().getCountry().trim()).equals("zh_CN"))
        return "zh_CN";
      if (Locale.getDefault().getLanguage().trim().equals("th"))
        return "th";
      if (Locale.getDefault().getLanguage().trim().equals("id"))
        return "id";
      if (Locale.getDefault().getLanguage().trim().equals("vi"))
        return "vi";
      if (Locale.getDefault().getLanguage().trim().equals("pt"))
        return "pt";
      if (Locale.getDefault().getLanguage().trim().equals("es"))
        return "es";
      if (Locale.getDefault().getLanguage().trim().equals("ru"))
        return "ru";
      if (Locale.getDefault().getLanguage().trim().equals("ar"))
        return "ar";
      if (Locale.getDefault().getLanguage().trim().equals("iw"))
        return "iw";
      if (Locale.getDefault().getLanguage().trim().equals("pl"))
        return "pl";
      if (Locale.getDefault().getLanguage().trim().equals("hi"))
        return "hi";
      if (Locale.getDefault().getLanguage().trim().equals("ja"))
        return "ja";
      if (Locale.getDefault().getLanguage().trim().equals("it"))
        return "it";
      if (Locale.getDefault().getLanguage().trim().equals("ko"))
        return "ko";
      if (Locale.getDefault().getLanguage().trim().equals("ms"))
        return "ms";
      if (Locale.getDefault().getLanguage().trim().equals("tr"))
        return "tr";
      if (Locale.getDefault().getLanguage().trim().equals("de"))
        return "de";
    }
    while (!Locale.getDefault().getLanguage().trim().equals("fr"));
    return "fr";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.y
 * JD-Core Version:    0.6.2
 */