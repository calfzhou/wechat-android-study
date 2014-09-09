package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;

public class aq
{
  o keY;

  public void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
  }

  public void a(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.cancel();
  }

  public void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if (this.keY != null)
      this.keY.v(paramString, paramBitmap);
  }

  public boolean a(WebView paramWebView, String paramString)
  {
    return false;
  }

  public void adg()
  {
  }

  public void b(WebView paramWebView, String paramString)
  {
  }

  public void d(WebView paramWebView, String paramString)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.aq
 * JD-Core Version:    0.6.2
 */