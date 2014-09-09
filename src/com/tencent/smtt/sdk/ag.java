package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;

final class ag extends X5ProxyWebViewClientExtension
{
  ag(WebView paramWebView, WebViewWizardBase paramWebViewWizardBase)
  {
    super(paramWebViewWizardBase);
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    WebView.access$000(this.keQ, paramInt3, paramInt4, paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ag
 * JD-Core Version:    0.6.2
 */