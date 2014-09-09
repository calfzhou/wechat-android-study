package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;
import com.tencent.smtt.export.external.proxy.X5ProxyWebChromeClient;

final class l extends X5ProxyWebChromeClient
{
  private WebView jij;
  private ab kef;

  public l(WebViewWizardBase paramWebViewWizardBase, WebView paramWebView, ab paramab)
  {
    super(paramWebViewWizardBase);
    this.jij = paramWebView;
    this.kef = paramab;
  }

  public final Bitmap getDefaultVideoPoster()
  {
    return null;
  }

  public final void getVisitedHistory(ValueCallback paramValueCallback)
  {
  }

  public final void onCloseWindow(IX5WebViewBase paramIX5WebViewBase)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
  }

  public final void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return this.kef.onConsoleMessage(paramConsoleMessage);
  }

  public final boolean onCreateWindow(IX5WebViewBase paramIX5WebViewBase, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView localWebView = this.jij;
    localWebView.getClass();
    ap localap = new ap(localWebView);
    Message.obtain(paramMessage.getTarget(), new m(this, localap, paramMessage)).obj = localap;
    return false;
  }

  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, QuotaUpdater paramQuotaUpdater)
  {
    paramQuotaUpdater.updateQuota(paramLong2);
  }

  public final void onGeolocationPermissionsHidePrompt()
  {
  }

  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
  {
    this.kef.onGeolocationPermissionsShowPrompt(paramString, paramGeolocationPermissionsCallback);
  }

  public final void onHideCustomView()
  {
    this.kef.onHideCustomView();
  }

  public final boolean onJsAlert(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    ab localab = this.kef;
    return localab.a(paramString2, paramJsResult);
  }

  public final boolean onJsBeforeUnload(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    return false;
  }

  public final boolean onJsConfirm(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    return false;
  }

  public final boolean onJsPrompt(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    return false;
  }

  public final boolean onJsTimeout()
  {
    return true;
  }

  public final void onProgressChanged(IX5WebViewBase paramIX5WebViewBase, int paramInt)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    ab localab = this.kef;
    localab.ma(paramInt);
  }

  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, QuotaUpdater paramQuotaUpdater)
  {
    paramQuotaUpdater.updateQuota(paramLong2);
  }

  public final void onReceivedIcon(IX5WebViewBase paramIX5WebViewBase, Bitmap paramBitmap)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
  }

  public final void onReceivedTitle(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    this.kef.c(this.jij, paramString);
    this.jij.hideSplashLogo();
  }

  public final void onReceivedTouchIconUrl(IX5WebViewBase paramIX5WebViewBase, String paramString, boolean paramBoolean)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
  }

  public final void onRequestFocus(IX5WebViewBase paramIX5WebViewBase)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
  }

  public final void onShowCustomView(View paramView, int paramInt, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
  }

  public final void onShowCustomView(View paramView, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.kef.onShowCustomView(paramView, paramCustomViewCallback);
  }

  public final void openFileChooser(ValueCallback paramValueCallback, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.kef.openFileChooser(new n(this, paramValueCallback), paramString1, paramString2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.l
 * JD-Core Version:    0.6.2
 */