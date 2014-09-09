package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;

class SystemWebChromeClient extends WebChromeClient
{
  private WebView jij;
  private ab kef;

  SystemWebChromeClient(WebView paramWebView, ab paramab)
  {
    this.jij = paramWebView;
    this.kef = paramab;
  }

  @TargetApi(7)
  public Bitmap getDefaultVideoPoster()
  {
    return null;
  }

  @TargetApi(7)
  public View getVideoLoadingProgressView()
  {
    return this.kef.getVideoLoadingProgressView();
  }

  public void getVisitedHistory(ValueCallback paramValueCallback)
  {
  }

  public void onCloseWindow(android.webkit.WebView paramWebView)
  {
    this.jij.setSysWebView(paramWebView);
  }

  public void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
    this.kef.onConsoleMessage(new q(paramString1, paramString2, paramInt));
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return this.kef.onConsoleMessage(new q(paramConsoleMessage));
  }

  public boolean onCreateWindow(android.webkit.WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView localWebView = this.jij;
    localWebView.getClass();
    ap localap = new ap(localWebView);
    Message.obtain(paramMessage.getTarget(), new p(this, localap, paramMessage)).obj = localap;
    return false;
  }

  @Deprecated
  @TargetApi(5)
  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    new v(this, paramQuotaUpdater).updateQuota(paramLong2);
  }

  @TargetApi(5)
  public void onGeolocationPermissionsHidePrompt()
  {
  }

  @TargetApi(5)
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    this.kef.onGeolocationPermissionsShowPrompt(paramString, new s(this, paramCallback));
  }

  @TargetApi(7)
  public void onHideCustomView()
  {
    this.kef.onHideCustomView();
  }

  public boolean onJsAlert(android.webkit.WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.jij.setSysWebView(paramWebView);
    ab localab = this.kef;
    return localab.a(paramString2, new u(this, paramJsResult));
  }

  public boolean onJsBeforeUnload(android.webkit.WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.jij.setSysWebView(paramWebView);
    new u(this, paramJsResult);
    return false;
  }

  public boolean onJsConfirm(android.webkit.WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.jij.setSysWebView(paramWebView);
    new u(this, paramJsResult);
    return false;
  }

  public boolean onJsPrompt(android.webkit.WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    this.jij.setSysWebView(paramWebView);
    new t(this, paramJsPromptResult);
    return false;
  }

  @TargetApi(7)
  public boolean onJsTimeout()
  {
    return true;
  }

  public void onProgressChanged(android.webkit.WebView paramWebView, int paramInt)
  {
    this.jij.setSysWebView(paramWebView);
    ab localab = this.kef;
    localab.ma(paramInt);
  }

  @Deprecated
  @TargetApi(7)
  public void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    new v(this, paramQuotaUpdater).updateQuota(paramLong2);
  }

  public void onReceivedIcon(android.webkit.WebView paramWebView, Bitmap paramBitmap)
  {
    this.jij.setSysWebView(paramWebView);
  }

  public void onReceivedTitle(android.webkit.WebView paramWebView, String paramString)
  {
    this.jij.setSysWebView(paramWebView);
    this.kef.c(this.jij, paramString);
  }

  @TargetApi(7)
  public void onReceivedTouchIconUrl(android.webkit.WebView paramWebView, String paramString, boolean paramBoolean)
  {
    this.jij.setSysWebView(paramWebView);
  }

  public void onRequestFocus(android.webkit.WebView paramWebView)
  {
    this.jij.setSysWebView(paramWebView);
  }

  @Deprecated
  @TargetApi(14)
  public void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    new r(this, paramCustomViewCallback);
  }

  @TargetApi(7)
  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.kef.onShowCustomView(paramView, new r(this, paramCustomViewCallback));
  }

  public void openFileChooser(ValueCallback paramValueCallback)
  {
    openFileChooser(paramValueCallback, null, null);
  }

  public void openFileChooser(ValueCallback paramValueCallback, String paramString)
  {
    openFileChooser(paramValueCallback, paramString, null);
  }

  public void openFileChooser(ValueCallback paramValueCallback, String paramString1, String paramString2)
  {
    this.kef.openFileChooser(paramValueCallback, paramString1, paramString2);
  }

  public void setupAutoFill(Message paramMessage)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.SystemWebChromeClient
 * JD-Core Version:    0.6.2
 */