package com.tencent.smtt.sdk;

import android.os.Message;
import android.webkit.WebView.WebViewTransport;

final class p
  implements Runnable
{
  p(SystemWebChromeClient paramSystemWebChromeClient, ap paramap, Message paramMessage)
  {
  }

  public final void run()
  {
    WebView localWebView = this.keg.bdC();
    if (localWebView != null)
      ((WebView.WebViewTransport)this.keh.obj).setWebView(localWebView.getSysWebView());
    this.keh.sendToTarget();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.p
 * JD-Core Version:    0.6.2
 */