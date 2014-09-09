package com.tencent.smtt.export.external.extension.proxy;

import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;

public abstract class X5ProxyWebViewClientExtension extends ProxyWebViewClientExtension
{
  public X5ProxyWebViewClientExtension(WebViewWizardBase paramWebViewWizardBase)
  {
    this.mWebViewClientExt = ((IX5WebViewClientExtension)paramWebViewWizardBase.newInstance(paramWebViewWizardBase.isDynamicMode(), "com.tencent.smtt.webkit.WebViewClientExtension"));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension
 * JD-Core Version:    0.6.2
 */