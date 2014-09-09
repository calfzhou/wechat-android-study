package com.tencent.smtt.export.external;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;

public class X5Adapter_16
{
  @TargetApi(4)
  public static String getNativeLibraryDirDonut(Context paramContext)
  {
    String str = paramContext.getApplicationInfo().dataDir;
    return str + "/lib";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.X5Adapter_16
 * JD-Core Version:    0.6.2
 */