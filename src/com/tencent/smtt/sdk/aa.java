package com.tencent.smtt.sdk;

import android.webkit.WebBackForwardList;
import com.tencent.smtt.export.external.interfaces.IX5WebBackForwardList;

public final class aa
{
  private IX5WebBackForwardList kew = null;
  private WebBackForwardList kex = null;

  static aa a(WebBackForwardList paramWebBackForwardList)
  {
    if (paramWebBackForwardList == null)
      return null;
    aa localaa = new aa();
    localaa.kex = paramWebBackForwardList;
    return localaa;
  }

  static aa a(IX5WebBackForwardList paramIX5WebBackForwardList)
  {
    if (paramIX5WebBackForwardList == null)
      return null;
    aa localaa = new aa();
    localaa.kew = paramIX5WebBackForwardList;
    return localaa;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.aa
 * JD-Core Version:    0.6.2
 */