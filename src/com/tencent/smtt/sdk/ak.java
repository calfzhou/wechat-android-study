package com.tencent.smtt.sdk;

import android.graphics.Picture;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener;

final class ak
  implements IX5WebViewBase.PictureListener
{
  ak(WebView paramWebView, an paraman)
  {
  }

  public final void onNewPicture(IX5WebViewBase paramIX5WebViewBase, Picture paramPicture, boolean paramBoolean)
  {
    this.keQ.setX5WebView(paramIX5WebViewBase);
  }

  public final void onNewPictureIfHaveContent(IX5WebViewBase paramIX5WebViewBase, Picture paramPicture)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ak
 * JD-Core Version:    0.6.2
 */