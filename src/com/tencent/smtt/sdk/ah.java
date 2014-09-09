package com.tencent.smtt.sdk;

import android.webkit.WebView.FindListener;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.FindListener;

final class ah
  implements WebView.FindListener
{
  ah(WebView paramWebView, IX5WebViewBase.FindListener paramFindListener)
  {
  }

  public final void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.keR.onFindResultReceived(paramInt1, paramInt2, paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ah
 * JD-Core Version:    0.6.2
 */