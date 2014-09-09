package com.tencent.smtt.sdk;

import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;

final class r
  implements IX5WebChromeClient.CustomViewCallback
{
  WebChromeClient.CustomViewCallback keo;

  r(SystemWebChromeClient paramSystemWebChromeClient, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.keo = paramCustomViewCallback;
  }

  public final void onCustomViewHidden()
  {
    this.keo.onCustomViewHidden();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.r
 * JD-Core Version:    0.6.2
 */