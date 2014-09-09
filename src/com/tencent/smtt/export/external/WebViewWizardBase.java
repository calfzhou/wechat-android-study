package com.tencent.smtt.export.external;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.proxy.ProxyWebChromeClient;
import com.tencent.smtt.export.external.proxy.ProxyWebViewClient;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Map;

public class WebViewWizardBase
{
  private DexLoader mDexLoader = null;
  protected boolean mIsDynamicMode = false;
  protected boolean mX5Used = true;

  public void HTML5NotificationPresenter_exitCleanUp()
  {
    if (!this.mX5Used)
      return;
    invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.HTML5NotificationPresenter", "exitCleanUp", null, new Object[0]);
  }

  public void ScaleManager_destroy()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.ScaleManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.ScaleManager", "destroy", null, new Object[0]);
  }

  public void SmttPermanentPermissions_clearAllPermanentPermission()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.SmttPermanentPermissions", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.SmttPermanentPermissions", "clearAllPermanentPermission", null, new Object[0]);
  }

  public void SmttResource_UpdateContext(Context paramContext)
  {
    if (!this.mX5Used)
      return;
    invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.SmttResource", "updateContext", new Class[] { Context.class }, new Object[] { paramContext });
  }

  public void appendDomain(URL paramURL)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.SMTTCookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.SMTTCookieManager", "appendDomain", new Class[] { URL.class }, new Object[] { paramURL });
  }

  public Object base64Decode(String paramString, int paramInt)
  {
    if (!this.mX5Used)
      return null;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[2];
    arrayOfClass[0] = String.class;
    arrayOfClass[1] = Integer.TYPE;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(paramInt);
    return invokeStaticMethod(bool, "com.tencent.smtt.AlgorithmIdentifier.Base64", "decode", arrayOfClass, arrayOfObject);
  }

  public Object base64Encode(byte[] paramArrayOfByte)
  {
    if (!this.mX5Used)
      return null;
    return invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.AlgorithmIdentifier.Base64", "encode", new Class[] { [B.class }, new Object[] { paramArrayOfByte });
  }

  public Object cacheDisabled()
  {
    if (!this.mX5Used)
      return null;
    return invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CacheManager", "cacheDisabled", new Class[0], new Object[0]);
  }

  public void clearCache()
  {
    if (!this.mX5Used)
      return;
    invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CacheManager", "removeAllCacheFiles", null, new Object[0]);
    invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CacheManager", "clearLocalStorage", null, new Object[0]);
  }

  public void clearChromiumCookie(Context paramContext)
  {
    if (!this.mX5Used);
    Object localObject2;
    do
    {
      return;
      invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieSyncManager", "createInstance", new Class[] { Context.class }, new Object[] { paramContext });
      Object localObject1 = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.ChromiumCookieManager", "getChromiumInstance", null, new Object[0]);
      if (localObject1 != null)
      {
        invokeMethod(this.mIsDynamicMode, localObject1, "com.tencent.smtt.webkit.ChromiumCookieManager", "removeAllCookie", null, new Object[0]);
        invokeMethod(this.mIsDynamicMode, localObject1, "com.tencent.smtt.webkit.ChromiumCookieManager", "removeExpiredCookie", null, new Object[0]);
      }
      localObject2 = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebViewDatabase", "getInstance", new Class[] { Context.class }, new Object[] { paramContext });
    }
    while (localObject2 == null);
    invokeMethod(this.mIsDynamicMode, localObject2, "com.tencent.smtt.webkit.WebViewDatabase", "clearFormData", null, new Object[0]);
  }

  public void clearCookie(Context paramContext)
  {
    if (!this.mX5Used);
    Object localObject2;
    do
    {
      return;
      invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieSyncManager", "createInstance", new Class[] { Context.class }, new Object[] { paramContext });
      boolean bool = this.mIsDynamicMode;
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(false);
      Object localObject1 = invokeStaticMethod(bool, "com.tencent.smtt.webkit.CookieManager", "getInstance", arrayOfClass, arrayOfObject);
      if (localObject1 != null)
      {
        invokeMethod(this.mIsDynamicMode, localObject1, "com.tencent.smtt.webkit.CookieManager", "removeAllCookie", null, new Object[0]);
        invokeMethod(this.mIsDynamicMode, localObject1, "com.tencent.smtt.webkit.CookieManager", "removeExpiredCookie", null, new Object[0]);
      }
      localObject2 = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebViewDatabase", "getInstance", new Class[] { Context.class }, new Object[] { paramContext });
    }
    while (localObject2 == null);
    invokeMethod(this.mIsDynamicMode, localObject2, "com.tencent.smtt.webkit.WebViewDatabase", "clearFormData", null, new Object[0]);
  }

  public void clearDns()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      if (((Boolean)invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.export.internal.utils.ChromiumUtil", "getIsUseChromium", null, new Object[0])).booleanValue())
      {
        invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CacheManager", "clearDns", null, new Object[0]);
        return;
      }
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.net.http.DnsManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.net.http.DnsManager", "removeAllDns", null, new Object[0]);
  }

  public void clearFormData(Context paramContext)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebViewDatabase", "getInstance", new Class[] { Context.class }, new Object[] { paramContext });
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.WebViewDatabase", "clearFormData", null, new Object[0]);
  }

  public void clearPasswords(Context paramContext)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebViewDatabase", "getInstance", new Class[] { Context.class }, new Object[] { paramContext });
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.WebViewDatabase", "clearUsernamePassword", null, new Object[0]);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.WebViewDatabase", "clearHttpAuthUsernamePassword", null, new Object[0]);
  }

  public void closeIconDB()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebIconDatabase", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.WebIconDatabase", "close", null, new Object[0]);
  }

  public boolean cookieManager_acceptCookie()
  {
    if (!this.mX5Used)
      return false;
    Object localObject1 = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieManager", "getInstance", null, new Object[0]);
    if (localObject1 != null)
    {
      Object localObject2 = invokeMethod(this.mIsDynamicMode, localObject1, "com.tencent.smtt.webkit.CookieManager", "acceptCookie", null, new Object[0]);
      if (localObject2 != null)
        return ((Boolean)localObject2).booleanValue();
    }
    return false;
  }

  public boolean cookieManager_hasCookies()
  {
    if (!this.mX5Used)
      return false;
    Object localObject1 = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieManager", "getInstance", null, new Object[0]);
    if (localObject1 != null)
    {
      Object localObject2 = invokeMethod(this.mIsDynamicMode, localObject1, "com.tencent.smtt.webkit.CookieManager", "hasCookies", null, new Object[0]);
      if (localObject2 != null)
        return ((Boolean)localObject2).booleanValue();
    }
    return false;
  }

  public void cookieManager_removeAllCookie()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieManager", "removeAllCookie", null, new Object[0]);
  }

  public void cookieManager_removeExpiredCookie()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieManager", "removeExpiredCookie", null, new Object[0]);
  }

  public void cookieManager_removeSessionCookie()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieManager", "removeSessionCookie", null, new Object[0]);
  }

  public void cookieManager_setAcceptCookie(boolean paramBoolean)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Boolean.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    invokeMethod(bool, localObject, "com.tencent.smtt.webkit.CookieManager", "setAcceptCookie", arrayOfClass, arrayOfObject);
  }

  public void cookieManager_setCookie(String paramString1, String paramString2)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieManager", "setCookie", new Class[] { String.class, String.class }, new Object[] { paramString1, paramString2 });
  }

  public void cookieSyncManager_Sync()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieSyncManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieSyncManager", "sync", null, new Object[0]);
  }

  public void cookieSyncManager_startSync()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieSyncManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieSyncManager", "startSync", null, new Object[0]);
  }

  public void cookieSyncManager_stopSync()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieSyncManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieSyncManager", "stopSync", null, new Object[0]);
  }

  public IX5WebViewBase createSDKWebview(Context paramContext)
  {
    if (this.mX5Used)
    {
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Context.class;
      arrayOfClass[1] = Boolean.TYPE;
      boolean bool = this.mIsDynamicMode;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramContext;
      arrayOfObject[1] = Boolean.valueOf(false);
      return (IX5WebViewBase)newInstance(bool, "com.tencent.smtt.webkit.adapter.X5WebViewAdapter", arrayOfClass, arrayOfObject);
    }
    return null;
  }

  public IX5WebChromeClient createWebChromeClient(ProxyWebChromeClient paramProxyWebChromeClient)
  {
    if (this.mX5Used)
      paramProxyWebChromeClient.setWebChromeClient((IX5WebChromeClient)newInstance(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebChromeClient"));
    return paramProxyWebChromeClient;
  }

  public IX5WebViewClient createWebViewClient(ProxyWebViewClient paramProxyWebViewClient)
  {
    if (this.mX5Used)
      paramProxyWebViewClient.setWebViewClient((IX5WebViewClient)newInstance(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebViewClient"));
    return paramProxyWebViewClient;
  }

  public Object getCachFileBaseDir()
  {
    if (!this.mX5Used)
      return null;
    return invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CacheManager", "getCacheFileBaseDir", new Class[0], new Object[0]);
  }

  public Object getCacheFile(String paramString, Map paramMap)
  {
    if (!this.mX5Used)
      return null;
    return invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CacheManager", "getCacheFile", new Class[] { String.class, Map.class }, new Object[] { paramString, paramMap });
  }

  public String getCookie(String paramString)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return null;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.SMTTCookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    return (String)invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.SMTTCookieManager", "getCookie", new Class[] { String.class }, new Object[] { paramString });
  }

  public String getCookie(String paramString, boolean paramBoolean)
  {
    if (!this.mX5Used)
      return null;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Boolean.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    Object localObject = invokeStaticMethod(bool, "com.tencent.smtt.webkit.SMTTCookieManager", "getInstance", arrayOfClass, arrayOfObject);
    if (localObject != null)
      return (String)invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.SMTTCookieManager", "getCookie", new Class[] { String.class }, new Object[] { paramString });
    return null;
  }

  public Object getCrashExtraMessage()
  {
    if (!this.mX5Used)
      return new String();
    return invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
  }

  public Bitmap getIconForPageUrl(String paramString)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return null;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebIconDatabase", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    return (Bitmap)invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.WebIconDatabase", "getIconForPageUrl", new Class[] { String.class }, new Object[] { paramString });
  }

  public Object getInputStream(String paramString)
  {
    if (!this.mX5Used)
      return null;
    Object localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CacheManager", "getCacheFile", new Class[] { String.class, Map.class }, new Object[] { paramString, null });
    if (localObject != null)
      return invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CacheManager$CacheResult", "getInputStream", null, new Object[0]);
    return null;
  }

  public Object getLocalPath(String paramString)
  {
    if (!this.mX5Used)
      return null;
    Object localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CacheManager", "getCacheFile", new Class[] { String.class, Map.class }, new Object[] { paramString, null });
    if (localObject != null)
      return invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CacheManager$CacheResult", "getLocalPath", null, new Object[0]);
    return null;
  }

  public String getPluginDownloadURL(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if (!this.mX5Used)
      return null;
    Object localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.PluginManager", "getInstance", new Class[] { Context.class }, new Object[] { paramContext });
    if (localObject != null)
      return (String)invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.PluginManager", "getPluginDownloadURL", new Class[] { String.class, String.class, String.class }, new Object[] { paramString1, paramString2, paramString3 });
    return null;
  }

  public String getQCookie(String paramString)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return null;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.SMTTCookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    return (String)invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.SMTTCookieManager", "getQCookie", new Class[] { String.class }, new Object[] { paramString });
  }

  public Object getStaticField(boolean paramBoolean, String paramString1, String paramString2)
  {
    if (paramBoolean)
    {
      DexLoader localDexLoader = this.mDexLoader;
      Object localObject2 = null;
      if (localDexLoader != null)
        localObject2 = this.mDexLoader.getStaticField(paramString1, paramString2);
      return localObject2;
    }
    try
    {
      Field localField = Class.forName(paramString1).getField(paramString2);
      localField.setAccessible(true);
      Object localObject1 = localField.get(null);
      return localObject1;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' get field '").append(paramString2).append("' failed");
    }
    return null;
  }

  public void initChromiumCookieModule(Context paramContext)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieSyncManager", "createInstance", new Class[] { Context.class }, new Object[] { paramContext });
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.ChromiumCookieManager", "getChromiumInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.ChromiumCookieManager", "removeExpiredCookie", null, new Object[0]);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.ChromiumCookieManager", "removeSessionCookie", null, new Object[0]);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.ChromiumCookieManager", "preInitCookieStore", null, new Object[0]);
  }

  public void initCookieModule(Context paramContext)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieSyncManager", "createInstance", new Class[] { Context.class }, new Object[] { paramContext });
      boolean bool = this.mIsDynamicMode;
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(false);
      localObject = invokeStaticMethod(bool, "com.tencent.smtt.webkit.CookieManager", "getInstance", arrayOfClass, arrayOfObject);
    }
    while (localObject == null);
    Boolean localBoolean = (Boolean)invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.export.internal.utils.ChromiumUtil", "isChromiumBuiltIn", null, new Object[0]);
    if ((localBoolean.booleanValue()) && (localBoolean.booleanValue()))
    {
      invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.ChromiumCookieManager", "preInitCookieStore", null, new Object[0]);
      return;
    }
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieManager", "removeExpiredCookie", null, new Object[0]);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.CookieManager", "removeSessionCookie", null, new Object[0]);
  }

  public void initCookieSyncManager(Context paramContext)
  {
    if (!this.mX5Used)
      return;
    invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.CookieSyncManager", "createInstance", new Class[] { Context.class }, new Object[] { paramContext });
  }

  public Object invokeMethod(boolean paramBoolean, Object paramObject, String paramString1, String paramString2, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    if (paramBoolean)
    {
      DexLoader localDexLoader = this.mDexLoader;
      Object localObject2 = null;
      if (localDexLoader != null)
        localObject2 = this.mDexLoader.invokeMethod(paramObject, paramString1, paramString2, paramArrayOfClass, paramArrayOfObject);
      return localObject2;
    }
    try
    {
      Method localMethod = Class.forName(paramString1).getMethod(paramString2, paramArrayOfClass);
      localMethod.setAccessible(true);
      Object localObject1 = localMethod.invoke(paramObject, paramArrayOfObject);
      return localObject1;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' invoke method '").append(paramString2).append("' failed");
    }
    return null;
  }

  public Object invokeStaticMethod(boolean paramBoolean, String paramString1, String paramString2, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    if (paramBoolean)
    {
      DexLoader localDexLoader = this.mDexLoader;
      Object localObject2 = null;
      if (localDexLoader != null)
        localObject2 = this.mDexLoader.invokeStaticMethod(paramString1, paramString2, paramArrayOfClass, paramArrayOfObject);
      return localObject2;
    }
    try
    {
      Method localMethod = Class.forName(paramString1).getMethod(paramString2, paramArrayOfClass);
      localMethod.setAccessible(true);
      Object localObject1 = localMethod.invoke(null, paramArrayOfObject);
      return localObject1;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' invoke static method '").append(paramString2).append("' failed");
    }
    return null;
  }

  public boolean isAllowQHead()
  {
    if (!this.mX5Used)
      return false;
    return ((Boolean)getStaticField(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebSettings", "isAllowQHead")).booleanValue();
  }

  public boolean isDynamicMode()
  {
    return this.mIsDynamicMode;
  }

  public boolean isUploadingWebCoreLog2Server()
  {
    if (!this.mX5Used)
      return true;
    return ((Boolean)invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.util.MttLog", "isUploadingLog", null, new Object[0])).booleanValue();
  }

  public boolean isWritingWebCoreLogToFile()
  {
    if (!this.mX5Used)
      return true;
    return ((Boolean)invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.util.MttLog", "isLogWritten2File", null, new Object[0])).booleanValue();
  }

  public boolean isX5ShowMemValueEnabled()
  {
    if (!this.mX5Used)
      return false;
    return ((Boolean)getStaticField(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebSettings", "isX5ShowMemValueEnabled")).booleanValue();
  }

  public void liveLog(String paramString)
  {
    if (!this.mX5Used)
      return;
    invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.util.MttLog", "liveLog", new Class[] { String.class }, new Object[] { paramString });
  }

  public Class loadClass(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      DexLoader localDexLoader = this.mDexLoader;
      Class localClass2 = null;
      if (localDexLoader != null)
        localClass2 = this.mDexLoader.loadClass(paramString);
      return localClass2;
    }
    try
    {
      Class localClass1 = Class.forName(paramString);
      return localClass1;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("loadClass '").append(paramString).append("' failed");
    }
    return null;
  }

  public Object newInstance(boolean paramBoolean, String paramString)
  {
    Object localObject1;
    if (paramBoolean)
    {
      DexLoader localDexLoader = this.mDexLoader;
      localObject1 = null;
      if (localDexLoader != null)
        localObject1 = this.mDexLoader.newInstance(paramString);
    }
    while (true)
    {
      return localObject1;
      try
      {
        Class localClass = Class.forName(paramString);
        localObject1 = null;
        if (localClass != null)
        {
          Object localObject2 = localClass.newInstance();
          return localObject2;
        }
      }
      catch (Exception localException)
      {
        getClass().getSimpleName();
        new StringBuilder("create '").append(paramString).append("' instance failed");
      }
    }
    return null;
  }

  public Object newInstance(boolean paramBoolean, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    Object localObject1;
    if (paramBoolean)
    {
      DexLoader localDexLoader = this.mDexLoader;
      localObject1 = null;
      if (localDexLoader != null)
        localObject1 = this.mDexLoader.newInstance(paramString, paramArrayOfClass, paramArrayOfObject);
    }
    while (true)
    {
      return localObject1;
      try
      {
        Class localClass = Class.forName(paramString);
        localObject1 = null;
        if (localClass != null)
        {
          Object localObject2 = localClass.getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
          return localObject2;
        }
      }
      catch (Exception localException)
      {
        getClass().getSimpleName();
        new StringBuilder("create '").append(paramString).append("' instance failed");
      }
    }
    return null;
  }

  public void openIconDB(String paramString)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.WebIconDatabase", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.WebIconDatabase", "open", new Class[] { String.class }, new Object[] { paramString });
  }

  public void preConnect(boolean paramBoolean, String paramString)
  {
    if (!this.mX5Used);
    do
    {
      return;
      Boolean localBoolean1 = (Boolean)invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.export.internal.utils.ChromiumUtil", "isChromiumBuiltIn", null, new Object[0]);
      Boolean localBoolean2 = (Boolean)invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.export.internal.utils.ChromiumUtil", "getIsUseChromium", null, new Object[0]);
      if ((!localBoolean1.booleanValue()) || (!localBoolean2.booleanValue()))
        break;
    }
    while (paramString == null);
    boolean bool2 = this.mIsDynamicMode;
    Class[] arrayOfClass2 = new Class[2];
    arrayOfClass2[0] = String.class;
    arrayOfClass2[1] = Integer.TYPE;
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = paramString;
    arrayOfObject2[1] = Integer.valueOf(1);
    invokeStaticMethod(bool2, "com.tencent.smtt.export.internal.utils.JniUtil", "setPreConnect", arrayOfClass2, arrayOfObject2);
    return;
    boolean bool1 = this.mIsDynamicMode;
    Class[] arrayOfClass1 = new Class[2];
    arrayOfClass1[0] = Boolean.TYPE;
    arrayOfClass1[1] = String.class;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject1[1] = paramString;
    invokeStaticMethod(bool1, "com.tencent.smtt.net.http.NetworkInterfaces", "preConnect", arrayOfClass1, arrayOfObject1);
  }

  public void refreshPlugins(Context paramContext, boolean paramBoolean)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.PluginManager", "getInstance", new Class[] { Context.class }, new Object[] { paramContext });
    }
    while (localObject == null);
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Boolean.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    invokeMethod(bool, localObject, "com.tencent.smtt.webkit.PluginManager", "refreshPlugins", arrayOfClass, arrayOfObject);
  }

  public void resumeActiveH5VideoProxy()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.h5video.H5VideoHolder", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.h5video.H5VideoHolder", "resumeActiveH5VideoProxy", null, new Object[0]);
  }

  public void setAllowQHead(boolean paramBoolean)
  {
    if (!this.mX5Used)
      return;
    setStaticBooleanField("com.tencent.smtt.webkit.WebSettings", "isAllowQHead", paramBoolean);
  }

  public void setContextHolderDevelopMode(boolean paramBoolean)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.ContextHolder", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Boolean.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    invokeMethod(bool, localObject, "com.tencent.smtt.webkit.ContextHolder", "setSdkDevelopMode", arrayOfClass, arrayOfObject);
  }

  public boolean setContextHolderParams(Context paramContext, String paramString)
  {
    if (!this.mX5Used)
      return false;
    Object[] arrayOfObject;
    Object localObject1;
    Object localObject2;
    if ((this.mIsDynamicMode) && (!TextUtils.isEmpty(paramString)))
    {
      Class[] arrayOfClass2 = { Context.class, String.class };
      arrayOfObject = new Object[] { paramContext, paramString };
      localObject1 = arrayOfClass2;
      localObject2 = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.ContextHolder", "getInstance", null, new Object[0]);
      if (localObject2 == null)
        break label139;
    }
    label139: for (boolean bool = ((Boolean)invokeMethod(this.mIsDynamicMode, localObject2, "com.tencent.smtt.webkit.ContextHolder", "setContext", (Class[])localObject1, arrayOfObject)).booleanValue(); ; bool = false)
    {
      return bool;
      Class[] arrayOfClass1 = { Context.class };
      arrayOfObject = new Object[] { paramContext };
      localObject1 = arrayOfClass1;
      break;
    }
  }

  public void setCookie(URL paramURL, Map paramMap)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.SMTTCookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.SMTTCookieManager", "setCookie", new Class[] { URL.class, Map.class }, new Object[] { paramURL, paramMap });
  }

  public void setDexLoader(Context paramContext, String paramString1, String paramString2)
  {
    if ((this.mX5Used) && (this.mIsDynamicMode) && (this.mDexLoader == null))
      this.mDexLoader = new DexLoader(paramContext, paramString1, paramString2);
  }

  public void setDexLoader(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    if ((this.mX5Used) && (this.mIsDynamicMode) && (this.mDexLoader == null))
      this.mDexLoader = new DexLoader(paramContext, paramArrayOfString, paramString);
  }

  public void setGUID(String paramString)
  {
    if (!this.mX5Used);
    Object localObject;
    Class[] arrayOfClass;
    Object[] arrayOfObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.net.http.JNISmttService", "getInstance", null, new Object[0]);
      arrayOfClass = new Class[] { String.class };
      arrayOfObject = new Object[] { paramString };
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.net.http.JNISmttService", "setGUID", arrayOfClass, arrayOfObject);
  }

  public void setLocalSmttService(Object paramObject)
  {
    if (!this.mX5Used);
    while (true)
    {
      return;
      try
      {
        Class localClass = Class.forName("com.tencent.smtt.service.SmttService");
        Object localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.service.SmttServiceProxy", "getInstance", null, new Object[0]);
        if (localObject != null)
        {
          invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.service.SmttServiceProxy", "setLocalSmttService", new Class[] { localClass }, new Object[] { paramObject });
          return;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
      }
    }
  }

  public void setNetworkOnLine(boolean paramBoolean)
  {
    if (!this.mX5Used)
      return;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Boolean.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    invokeStaticMethod(bool, "com.tencent.smtt.webkit.JWebCoreJavaBridge", "setNetworkOnLine", arrayOfClass, arrayOfObject);
  }

  public void setQCookie(String paramString1, String paramString2)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.SMTTCookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.SMTTCookieManager", "setQCookie", new Class[] { String.class, String.class }, new Object[] { paramString1, paramString2 });
  }

  public void setSdkVersion(int paramInt)
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.ContextHolder", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Integer.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    invokeMethod(bool, localObject, "com.tencent.smtt.webkit.ContextHolder", "setSdkVersion", arrayOfClass, arrayOfObject);
  }

  public void setStaticBooleanField(String paramString1, String paramString2, boolean paramBoolean)
  {
    try
    {
      Field localField = loadClass(true, paramString1).getField(paramString2);
      localField.setAccessible(true);
      localField.setBoolean(null, paramBoolean);
      return;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' set field '").append(paramString2).append("' failed");
    }
  }

  public void setStaticIntField(String paramString1, String paramString2, int paramInt)
  {
    try
    {
      Field localField = loadClass(true, paramString1).getField(paramString2);
      localField.setAccessible(true);
      localField.setInt(null, paramInt);
      return;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' set field '").append(paramString2).append("' failed");
    }
  }

  public void setWebCoreLogWrite2FileFlag(boolean paramBoolean)
  {
    if (!this.mX5Used)
      return;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Boolean.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    invokeStaticMethod(bool, "com.tencent.smtt.util.MttLog", "setLogWrite2FileFlag", arrayOfClass, arrayOfObject);
  }

  public void setWizardMode(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mX5Used = paramBoolean1;
    this.mIsDynamicMode = paramBoolean2;
  }

  public void setX5ShowMemValueEnabled(boolean paramBoolean)
  {
    if (!this.mX5Used)
      return;
    setStaticBooleanField("com.tencent.smtt.webkit.WebSettings", "isX5ShowMemValueEnabled", paramBoolean);
  }

  public void stopActiveH5VideoProxy()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.h5video.H5VideoHolder", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.h5video.H5VideoHolder", "stopActiveH5VideoProxy", null, new Object[0]);
  }

  public void syncImmediately()
  {
    if (!this.mX5Used);
    Object localObject;
    do
    {
      return;
      localObject = invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.webkit.SMTTCookieManager", "getInstance", null, new Object[0]);
    }
    while (localObject == null);
    invokeMethod(this.mIsDynamicMode, localObject, "com.tencent.smtt.webkit.SMTTCookieManager", "syncImmediately", null, new Object[0]);
  }

  public void traceBegin(int paramInt)
  {
    if (!this.mX5Used)
      return;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Integer.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    invokeStaticMethod(bool, "com.tencent.smtt.util.MttTraceEvent", "begin", arrayOfClass, arrayOfObject);
  }

  public void traceBegin(int paramInt, String paramString)
  {
    if (!this.mX5Used)
      return;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[2];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = String.class;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramString;
    invokeStaticMethod(bool, "com.tencent.smtt.util.MttTraceEvent", "begin", arrayOfClass, arrayOfObject);
  }

  public void traceBegin(int paramInt, String paramString1, String paramString2)
  {
    if (!this.mX5Used)
      return;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[3];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = String.class;
    arrayOfClass[2] = String.class;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramString2;
    invokeStaticMethod(bool, "com.tencent.smtt.util.MttTraceEvent", "begin", arrayOfClass, arrayOfObject);
  }

  public void traceEnd(int paramInt)
  {
    if (!this.mX5Used)
      return;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Integer.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    invokeStaticMethod(bool, "com.tencent.smtt.util.MttTraceEvent", "end", arrayOfClass, arrayOfObject);
  }

  public void traceEnd(int paramInt, String paramString)
  {
    if (!this.mX5Used)
      return;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[2];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = String.class;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramString;
    invokeStaticMethod(bool, "com.tencent.smtt.util.MttTraceEvent", "end", arrayOfClass, arrayOfObject);
  }

  public void traceEnd(int paramInt, String paramString1, String paramString2)
  {
    if (!this.mX5Used)
      return;
    boolean bool = this.mIsDynamicMode;
    Class[] arrayOfClass = new Class[3];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = String.class;
    arrayOfClass[2] = String.class;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramString2;
    invokeStaticMethod(bool, "com.tencent.smtt.util.MttTraceEvent", "end", arrayOfClass, arrayOfObject);
  }

  public void uploadWebCoreLog2Server()
  {
    if (!this.mX5Used)
      return;
    invokeStaticMethod(this.mIsDynamicMode, "com.tencent.smtt.util.MttLog", "uploadLogFilesToServer", null, new Object[0]);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.WebViewWizardBase
 * JD-Core Version:    0.6.2
 */