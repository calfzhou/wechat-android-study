package com.tencent.smtt.export.external;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.util.ArrayList;

public class LibraryLoader
{
  private static String[] sLibrarySearchPaths = null;

  public static String[] getLibrarySearchPaths(Context paramContext)
  {
    if (sLibrarySearchPaths != null)
      return sLibrarySearchPaths;
    if (paramContext == null)
      return new String[] { "/system/lib" };
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(getNativeLibraryDir(paramContext));
    localArrayList.add("/system/lib");
    String[] arrayOfString = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString);
    sLibrarySearchPaths = arrayOfString;
    return arrayOfString;
  }

  public static String getNativeLibraryDir(Context paramContext)
  {
    int i = getSdkVersion();
    if (i >= 9)
      return X5Adapter_23.getNativeLibraryDirGB(paramContext);
    if (i >= 4)
      return X5Adapter_16.getNativeLibraryDirDonut(paramContext);
    return "/data/data/" + paramContext.getPackageName() + "/lib";
  }

  public static int getSdkVersion()
  {
    return Integer.parseInt(Build.VERSION.SDK);
  }

  public static void loadLibrary(Context paramContext, String paramString)
  {
    String[] arrayOfString = getLibrarySearchPaths(paramContext);
    String str1 = System.mapLibraryName(paramString);
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str2 = arrayOfString[j];
      String str3 = str2 + "/" + str1;
      if (new File(str3).exists())
      {
        System.load(str3);
        return;
      }
    }
    System.loadLibrary(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.LibraryLoader
 * JD-Core Version:    0.6.2
 */