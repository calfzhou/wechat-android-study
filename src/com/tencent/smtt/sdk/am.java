package com.tencent.smtt.sdk;

import android.webkit.WebView.HitTestResult;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.HitTestResult;

public final class am
{
  private IX5WebViewBase.HitTestResult keV;
  private WebView.HitTestResult keW = null;

  public am()
  {
    this.keV = null;
    this.keW = null;
  }

  public am(WebView.HitTestResult paramHitTestResult)
  {
    this.keV = null;
    this.keW = paramHitTestResult;
  }

  public am(IX5WebViewBase.HitTestResult paramHitTestResult)
  {
    this.keV = paramHitTestResult;
    this.keW = null;
  }

  public final String getExtra()
  {
    String str = "";
    if (this.keV != null)
      str = this.keV.getExtra();
    while (this.keW == null)
      return str;
    return this.keW.getExtra();
  }

  public final int getType()
  {
    int i;
    if (this.keV != null)
      i = this.keV.getType();
    WebView.HitTestResult localHitTestResult;
    do
    {
      return i;
      localHitTestResult = this.keW;
      i = 0;
    }
    while (localHitTestResult == null);
    return this.keW.getType();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.am
 * JD-Core Version:    0.6.2
 */