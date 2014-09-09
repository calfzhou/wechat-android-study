package com.tencent.smtt.sdk;

final class u
  implements com.tencent.smtt.export.external.interfaces.JsResult
{
  android.webkit.JsResult ker;

  u(SystemWebChromeClient paramSystemWebChromeClient, android.webkit.JsResult paramJsResult)
  {
    this.ker = paramJsResult;
  }

  public final void cancel()
  {
    this.ker.cancel();
  }

  public final void confirm()
  {
    this.ker.confirm();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.u
 * JD-Core Version:    0.6.2
 */