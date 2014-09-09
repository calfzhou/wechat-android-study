package com.tencent.smtt.sdk;

final class x
  implements com.tencent.smtt.export.external.interfaces.HttpAuthHandler
{
  private android.webkit.HttpAuthHandler ket;

  x(android.webkit.HttpAuthHandler paramHttpAuthHandler)
  {
    this.ket = paramHttpAuthHandler;
  }

  public final void cancel()
  {
    this.ket.cancel();
  }

  public final void proceed(String paramString1, String paramString2)
  {
    this.ket.proceed(paramString1, paramString2);
  }

  public final boolean useHttpAuthUsernamePassword()
  {
    return this.ket.useHttpAuthUsernamePassword();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.x
 * JD-Core Version:    0.6.2
 */