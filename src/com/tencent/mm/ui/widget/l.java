package com.tencent.mm.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.compatible.c.aa;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.e;

public final class l
{
  public static boolean kby = false;

  private static boolean a(Context paramContext, boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
      return false;
    if (ch.jb(paramString))
    {
      z.w("!44@/B4Tb64lLpLUa7oZpyRLqvzHNIkqE5XC557eBqqYh7Y=", "useX5Kernel, x5VersionSection is null");
      return false;
    }
    try
    {
      int i = WebView.getQQBrowserCoreVersion(paramContext);
      boolean bool = m.DD(paramString).rC(i);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(i);
      arrayOfObject[1] = Boolean.valueOf(bool);
      z.i("!44@/B4Tb64lLpLUa7oZpyRLqvzHNIkqE5XC557eBqqYh7Y=", "useX5Kernel, X5CoreVersion = %d, inSection = %b", arrayOfObject);
      return bool;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLUa7oZpyRLqvzHNIkqE5XC557eBqqYh7Y=", "useX5Kernel, init x5 settings");
    }
    return false;
  }

  public static MMWebView cL(Context paramContext)
  {
    cM(paramContext);
    MMWebView localMMWebView = new MMWebView(paramContext);
    MMWebView.a(localMMWebView);
    return localMMWebView;
  }

  private static void cM(Context paramContext)
  {
    int i = 1;
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    boolean bool1 = v.dNE.dNP;
    String str = localSharedPreferences.getString("webview_x5_kernel_section", null);
    kby = localSharedPreferences.getBoolean("forceUseX5Kernel", false);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Boolean.valueOf(bool1);
    arrayOfObject1[i] = str;
    arrayOfObject1[2] = Boolean.valueOf(kby);
    z.i("!44@/B4Tb64lLpLUa7oZpyRLqvzHNIkqE5XC557eBqqYh7Y=", "initX5Settings, forceUseSysWebView = %b, x5VersionSection = %s, forUseX5kernel = %b", arrayOfObject1);
    boolean bool2 = a(paramContext, bool1, str);
    Object[] arrayOfObject2 = new Object[i];
    arrayOfObject2[0] = Boolean.valueOf(bool2);
    z.i("!44@/B4Tb64lLpLUa7oZpyRLqvzHNIkqE5XC557eBqqYh7Y=", "initX5Settings, useX5Kernel = %b", arrayOfObject2);
    int j = WebView.getQQBrowserCoreVersion(paramContext);
    if ((kby) && (!bool2) && (j > 0))
      z.i("!44@/B4Tb64lLpLUa7oZpyRLqvzHNIkqE5XC557eBqqYh7Y=", "force use x5kernel");
    while (true)
    {
      if (i == 0)
        e.bdu();
      return;
      i = bool2;
    }
  }

  public static MMWebView h(Activity paramActivity, int paramInt)
  {
    cM(paramActivity);
    MMWebView localMMWebView = (MMWebView)paramActivity.findViewById(paramInt);
    MMWebView.a(localMMWebView);
    return localMMWebView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.l
 * JD-Core Version:    0.6.2
 */