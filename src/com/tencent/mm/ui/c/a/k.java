package com.tencent.mm.ui.c.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.aq;

final class k extends aq
{
  private boolean jHR = true;

  private k(i parami)
  {
  }

  public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.a(paramWebView, paramInt, paramString1, paramString2);
    this.jHR = false;
    i.a(this.jHQ).a(new d(paramString1, paramInt, paramString2));
    try
    {
      this.jHQ.dismiss();
      i.b(this.jHQ).dismiss();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    z.d("Facebook-WebView", "Webview loading URL: " + paramString);
    super.a(paramWebView, paramString, paramBitmap);
    try
    {
      i.b(this.jHQ).show();
      i.b(this.jHQ).setOnDismissListener(new l(this));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    z.d("Facebook-WebView", "Redirect URL: " + paramString);
    if (paramString.startsWith("fbconnect://success"))
    {
      Bundle localBundle = m.CZ(paramString);
      String str = localBundle.getString("error");
      if (str == null)
        str = localBundle.getString("error_type");
      if (str == null)
        i.a(this.jHQ).a(localBundle);
      while (true)
      {
        this.jHQ.dismiss();
        return true;
        if ((str.equals("access_denied")) || (str.equals("OAuthAccessDeniedException")))
          i.a(this.jHQ).onCancel();
        else
          i.a(this.jHQ).a(new h(str));
      }
    }
    if (paramString.startsWith("fbconnect://cancel"))
    {
      i.a(this.jHQ).onCancel();
      try
      {
        this.jHQ.dismiss();
        return true;
      }
      catch (Exception localException)
      {
        return true;
      }
    }
    if (paramString.contains("touch"))
      return false;
    this.jHQ.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
    return true;
  }

  public final void b(WebView paramWebView, String paramString)
  {
    super.b(paramWebView, paramString);
    this.jHR = false;
    try
    {
      i.b(this.jHQ).dismiss();
      label21: i.c(this.jHQ).setBackgroundColor(0);
      i.d(this.jHQ).setVisibility(0);
      i.e(this.jHQ).setVisibility(0);
      return;
    }
    catch (Exception localException)
    {
      break label21;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.k
 * JD-Core Version:    0.6.2
 */