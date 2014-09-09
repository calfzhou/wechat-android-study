package com.tencent.smtt.sdk;

import android.content.Context;
import android.webkit.CookieSyncManager;
import com.tencent.smtt.export.external.WebViewWizardBase;
import java.lang.reflect.Field;

public final class b
{
  private static CookieSyncManager kdG;
  private static b kdH;

  public static b bdr()
  {
    try
    {
      if (kdH == null)
        throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
    }
    finally
    {
    }
    b localb = kdH;
    return localb;
  }

  public static b cN(Context paramContext)
  {
    try
    {
      kdG = CookieSyncManager.createInstance(paramContext);
      if (kdH == null)
      {
        paramContext.getApplicationContext();
        kdH = new b();
      }
      b localb = kdH;
      return localb;
    }
    finally
    {
    }
  }

  public static void startSync()
  {
    h localh = h.gt(false);
    if ((localh != null) && (localh.bdx()))
    {
      localh.bdw().cookieSyncManager_startSync();
      return;
    }
    kdG.startSync();
    try
    {
      Field localField = Class.forName("android.webkit.WebSyncManager").getDeclaredField("mSyncThread");
      localField.setAccessible(true);
      ((Thread)localField.get(kdG)).setUncaughtExceptionHandler(new k());
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void sync()
  {
    h localh = h.gt(false);
    if ((localh != null) && (localh.bdx()))
    {
      localh.bdw().cookieSyncManager_Sync();
      return;
    }
    kdG.sync();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.b
 * JD-Core Version:    0.6.2
 */