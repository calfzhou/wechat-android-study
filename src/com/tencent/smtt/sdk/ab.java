package com.tencent.smtt.sdk;

import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.JsResult;

public class ab
{
  public boolean a(String paramString, JsResult paramJsResult)
  {
    return false;
  }

  public void c(WebView paramWebView, String paramString)
  {
  }

  public View getVideoLoadingProgressView()
  {
    return null;
  }

  public void ma(int paramInt)
  {
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return false;
  }

  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
  {
    paramGeolocationPermissionsCallback.invoke(paramString, true, true);
  }

  public void onHideCustomView()
  {
  }

  public void onShowCustomView(View paramView, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
  }

  public void openFileChooser(ValueCallback paramValueCallback, String paramString1, String paramString2)
  {
    paramValueCallback.onReceiveValue(null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ab
 * JD-Core Version:    0.6.2
 */