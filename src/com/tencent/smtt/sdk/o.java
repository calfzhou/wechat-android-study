package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.KeyEvent;
import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.export.external.proxy.X5ProxyWebViewClient;

final class o extends X5ProxyWebViewClient
{
  private aq fys;
  private WebView jij;

  public o(WebViewWizardBase paramWebViewWizardBase, WebView paramWebView, aq paramaq)
  {
    super(paramWebViewWizardBase);
    this.jij = paramWebView;
    this.fys = paramaq;
    this.fys.keY = this;
  }

  public final void doUpdateVisitedHistory(IX5WebViewBase paramIX5WebViewBase, String paramString, boolean paramBoolean)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
  }

  public final void onFormResubmission(IX5WebViewBase paramIX5WebViewBase, Message paramMessage1, Message paramMessage2)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    paramMessage1.sendToTarget();
  }

  public final void onLoadResource(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    this.fys.d(this.jij, paramString);
  }

  public final void onPageFinished(IX5WebViewBase paramIX5WebViewBase, int paramInt1, int paramInt2, String paramString)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    WebView localWebView = this.jij;
    localWebView.mPv = (1 + localWebView.mPv);
    this.fys.b(this.jij, paramString);
    this.jij.hideSplashLogo();
  }

  public final void onPageStarted(IX5WebViewBase paramIX5WebViewBase, int paramInt1, int paramInt2, String paramString, Bitmap paramBitmap)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    this.fys.a(this.jij, paramString, paramBitmap);
  }

  public final void onReceivedError(IX5WebViewBase paramIX5WebViewBase, int paramInt, String paramString1, String paramString2)
  {
    if (paramInt < -15)
    {
      if (paramInt == -17)
        paramInt = -1;
    }
    else
    {
      this.jij.setX5WebView(paramIX5WebViewBase);
      this.fys.a(this.jij, paramInt, paramString1, paramString2);
    }
  }

  public final void onReceivedHttpAuthRequest(IX5WebViewBase paramIX5WebViewBase, HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    paramHttpAuthHandler.cancel();
  }

  public final void onReceivedLoginRequest(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, String paramString3)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
  }

  public final void onReceivedSslError(IX5WebViewBase paramIX5WebViewBase, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    this.fys.a(this.jij, paramSslErrorHandler, paramSslError);
  }

  public final void onScaleChanged(IX5WebViewBase paramIX5WebViewBase, float paramFloat1, float paramFloat2)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    aq localaq = this.fys;
    localaq.adg();
  }

  public final void onTooManyRedirects(IX5WebViewBase paramIX5WebViewBase, Message paramMessage1, Message paramMessage2)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
  }

  public final void onUnhandledKeyEvent(IX5WebViewBase paramIX5WebViewBase, KeyEvent paramKeyEvent)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
  }

  public final WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    return null;
  }

  public final boolean shouldOverrideKeyEvent(IX5WebViewBase paramIX5WebViewBase, KeyEvent paramKeyEvent)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    return false;
  }

  public final boolean shouldOverrideUrlLoading(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.jij.setX5WebView(paramIX5WebViewBase);
    boolean bool = this.fys.a(this.jij, paramString);
    if ((!bool) && (paramString.startsWith("wtai://wp/mc;")))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("tel:" + paramString.substring(13)));
      this.jij.getContext().startActivity(localIntent);
      bool = true;
    }
    return bool;
  }

  public final void v(String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(this.jij.getX5WebView(), 0, 0, paramString, paramBitmap);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.o
 * JD-Core Version:    0.6.2
 */