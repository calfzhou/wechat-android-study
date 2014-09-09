package com.tencent.smtt.sdk;

import android.os.Message;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.WebViewTransport;

final class m
  implements Runnable
{
  m(l paraml, ap paramap, Message paramMessage)
  {
  }

  public final void run()
  {
    WebView localWebView = this.keg.bdC();
    if (localWebView != null)
      ((IX5WebViewBase.WebViewTransport)this.keh.obj).setWebView(localWebView.getX5WebView());
    this.keh.sendToTarget();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.m
 * JD-Core Version:    0.6.2
 */