package com.tencent.smtt.sdk;

final class y
  implements com.tencent.smtt.export.external.interfaces.SslErrorHandler
{
  android.webkit.SslErrorHandler keu;

  y(android.webkit.SslErrorHandler paramSslErrorHandler)
  {
    this.keu = paramSslErrorHandler;
  }

  public final void cancel()
  {
    this.keu.cancel();
  }

  public final void proceed()
  {
    this.keu.proceed();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.y
 * JD-Core Version:    0.6.2
 */