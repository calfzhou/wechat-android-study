package com.tencent.smtt.sdk;

import android.webkit.CookieManager;
import com.tencent.smtt.export.external.WebViewWizardBase;

public final class a
{
  private static a kdF;
  private CookieManager kdE = CookieManager.getInstance();

  public static a bdq()
  {
    try
    {
      if (kdF == null)
        kdF = new a();
      a locala = kdF;
      return locala;
    }
    finally
    {
    }
  }

  public final String getCookie(String paramString)
  {
    h localh = h.gt(false);
    if ((localh != null) && (localh.bdx()))
      return localh.bdw().getCookie(paramString);
    return this.kdE.getCookie(paramString);
  }

  public final void removeAllCookie()
  {
    h localh = h.gt(false);
    if ((localh != null) && (localh.bdx()))
    {
      localh.bdw().cookieManager_removeAllCookie();
      return;
    }
    this.kdE.removeAllCookie();
  }

  public final void removeSessionCookie()
  {
    h localh = h.gt(false);
    if ((localh != null) && (localh.bdx()))
    {
      localh.bdw().cookieManager_removeSessionCookie();
      return;
    }
    this.kdE.removeSessionCookie();
  }

  public final void setCookie(String paramString1, String paramString2)
  {
    h localh = h.gt(false);
    if ((localh != null) && (localh.bdx()))
    {
      localh.bdw().cookieManager_setCookie(paramString1, paramString2);
      return;
    }
    this.kdE.setCookie(paramString1, paramString2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.a
 * JD-Core Version:    0.6.2
 */