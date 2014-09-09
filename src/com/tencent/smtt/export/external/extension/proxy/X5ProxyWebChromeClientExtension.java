package com.tencent.smtt.export.external.extension.proxy;

import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;

public abstract class X5ProxyWebChromeClientExtension extends ProxyWebChromeClientExtension
{
  public X5ProxyWebChromeClientExtension(WebViewWizardBase paramWebViewWizardBase)
  {
    this.mWebChromeClient = ((IX5WebChromeClientExtension)paramWebViewWizardBase.newInstance(paramWebViewWizardBase.isDynamicMode(), "com.tencent.smtt.webkit.WebChromeClientExtension"));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.extension.proxy.X5ProxyWebChromeClientExtension
 * JD-Core Version:    0.6.2
 */