package com.tencent.smtt.sdk;

final class t
  implements com.tencent.smtt.export.external.interfaces.JsPromptResult
{
  android.webkit.JsPromptResult keq;

  t(SystemWebChromeClient paramSystemWebChromeClient, android.webkit.JsPromptResult paramJsPromptResult)
  {
    this.keq = paramJsPromptResult;
  }

  public final void cancel()
  {
    this.keq.cancel();
  }

  public final void confirm()
  {
    this.keq.confirm();
  }

  public final void confirm(String paramString)
  {
    this.keq.confirm(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.t
 * JD-Core Version:    0.6.2
 */