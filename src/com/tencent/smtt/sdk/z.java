package com.tencent.smtt.sdk;

import android.net.http.SslCertificate;

final class z
  implements com.tencent.smtt.export.external.interfaces.SslError
{
  android.net.http.SslError kev;

  z(android.net.http.SslError paramSslError)
  {
    this.kev = paramSslError;
  }

  public final boolean addError(int paramInt)
  {
    return this.kev.addError(paramInt);
  }

  public final SslCertificate getCertificate()
  {
    return this.kev.getCertificate();
  }

  public final int getPrimaryError()
  {
    return this.kev.getPrimaryError();
  }

  public final boolean hasError(int paramInt)
  {
    return this.kev.hasError(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.z
 * JD-Core Version:    0.6.2
 */