package com.tencent.mm.ui.bindgooglecontact;

import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.mm.pluginsdk.ui.tools.bk;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.aq;

final class h extends aq
{
  h(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    z.d("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "shouldOverrideUrlLoading, url = %s", new Object[] { paramString });
    if (paramString.toLowerCase().startsWith("weixin://private/googlegetcode"))
    {
      BindGoogleContactUI.a(this.jiq, paramString);
      return true;
    }
    return super.a(paramWebView, paramString);
  }

  public final void b(WebView paramWebView, String paramString)
  {
    z.d("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "onPageFinished URL:" + paramString);
    if ((BindGoogleContactUI.a(this.jiq) != null) && (BindGoogleContactUI.a(this.jiq).getVisibility() != 0))
    {
      BindGoogleContactUI.a(this.jiq).setVisibility(0);
      if (BindGoogleContactUI.b(this.jiq) != null)
        BindGoogleContactUI.b(this.jiq).setVisibility(4);
    }
    BindGoogleContactUI.c(this.jiq);
    String str;
    if (paramWebView != null)
    {
      str = paramWebView.getTitle();
      z.d("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "title:%s", new Object[] { str });
      if (!TextUtils.isEmpty(str))
      {
        if (!str.toLowerCase().contains("success"))
          break label162;
        if (BindGoogleContactUI.a(this.jiq) != null)
          BindGoogleContactUI.a(this.jiq).setVisibility(4);
        bk.a(BindGoogleContactUI.a(this.jiq), "weixin://private/googlegetcode", "document.getElementById('code').value");
      }
    }
    label162: 
    while (!str.toLowerCase().contains("error"))
      return;
    z.w("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBoluueOUk5Rr", "failed." + str.substring(str.indexOf("=")));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.h
 * JD-Core Version:    0.6.2
 */