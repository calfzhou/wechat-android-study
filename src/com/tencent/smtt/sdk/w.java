package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebViewClient;

final class w extends WebViewClient
{
  private aq fys;
  private WebView jij;

  w(WebView paramWebView, aq paramaq)
  {
    this.jij = paramWebView;
    this.fys = paramaq;
  }

  public final void doUpdateVisitedHistory(android.webkit.WebView paramWebView, String paramString, boolean paramBoolean)
  {
    this.jij.setSysWebView(paramWebView);
  }

  public final void onFormResubmission(android.webkit.WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    this.jij.setSysWebView(paramWebView);
    paramMessage1.sendToTarget();
  }

  public final void onLoadResource(android.webkit.WebView paramWebView, String paramString)
  {
    this.jij.setSysWebView(paramWebView);
    this.fys.d(this.jij, paramString);
  }

  public final void onPageFinished(android.webkit.WebView paramWebView, String paramString)
  {
    this.jij.setSysWebView(paramWebView);
    WebView localWebView = this.jij;
    localWebView.mPv = (1 + localWebView.mPv);
    this.fys.b(this.jij, paramString);
  }

  public final void onPageStarted(android.webkit.WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    this.jij.setSysWebView(paramWebView);
    this.fys.a(this.jij, paramString, paramBitmap);
  }

  public final void onReceivedError(android.webkit.WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.jij.setSysWebView(paramWebView);
    this.fys.a(this.jij, paramInt, paramString1, paramString2);
  }

  public final void onReceivedHttpAuthRequest(android.webkit.WebView paramWebView, android.webkit.HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    this.jij.setSysWebView(paramWebView);
    new x(paramHttpAuthHandler).cancel();
  }

  @TargetApi(12)
  public final void onReceivedLoginRequest(android.webkit.WebView paramWebView, String paramString1, String paramString2, String paramString3)
  {
    if (Build.VERSION.SDK_INT >= 12)
      this.jij.setSysWebView(paramWebView);
  }

  @TargetApi(8)
  public final void onReceivedSslError(android.webkit.WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    if (Build.VERSION.SDK_INT >= 8)
    {
      this.jij.setSysWebView(paramWebView);
      this.fys.a(this.jij, new y(paramSslErrorHandler), new z(paramSslError));
    }
  }

  public final void onScaleChanged(android.webkit.WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    this.jij.setSysWebView(paramWebView);
    aq localaq = this.fys;
    localaq.adg();
  }

  public final void onTooManyRedirects(android.webkit.WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    this.jij.setSysWebView(paramWebView);
  }

  public final void onUnhandledKeyEvent(android.webkit.WebView paramWebView, KeyEvent paramKeyEvent)
  {
    this.jij.setSysWebView(paramWebView);
  }

  public final WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramWebView, String paramString)
  {
    return null;
  }

  public final boolean shouldOverrideKeyEvent(android.webkit.WebView paramWebView, KeyEvent paramKeyEvent)
  {
    this.jij.setSysWebView(paramWebView);
    return false;
  }

  public final boolean shouldOverrideUrlLoading(android.webkit.WebView paramWebView, String paramString)
  {
    this.jij.setSysWebView(paramWebView);
    return this.fys.a(this.jij, paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.w
 * JD-Core Version:    0.6.2
 */