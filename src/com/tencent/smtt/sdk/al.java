package com.tencent.smtt.sdk;

import android.view.View;
import android.view.View.OnLongClickListener;

final class al
  implements View.OnLongClickListener
{
  al(WebView paramWebView, View.OnLongClickListener paramOnLongClickListener)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    if (this.keU != null)
    {
      if (!this.keU.onLongClick(paramView))
        return WebView.access$500(this.keQ, paramView);
      return true;
    }
    return WebView.access$500(this.keQ, paramView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.al
 * JD-Core Version:    0.6.2
 */