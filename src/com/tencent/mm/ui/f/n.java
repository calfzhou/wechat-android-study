package com.tencent.mm.ui.f;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.c.a.d;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.aq;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
final class n extends aq
{
  private boolean jHR = true;

  private n(k paramk)
  {
  }

  private static Bundle CY(String paramString)
  {
    Bundle localBundle = new Bundle();
    if (paramString != null)
    {
      String[] arrayOfString1 = paramString.split("&");
      int i = arrayOfString1.length;
      for (int j = 0; j < i; j++)
      {
        String[] arrayOfString2 = arrayOfString1[j].split("=");
        localBundle.putString(URLDecoder.decode(arrayOfString2[0]), URLDecoder.decode(arrayOfString2[1]));
      }
    }
    return localBundle;
  }

  private static Bundle CZ(String paramString)
  {
    String str = paramString.replace("wechatapp", "http");
    try
    {
      URL localURL = new URL(str);
      Bundle localBundle = CY(localURL.getQuery());
      localBundle.putAll(CY(localURL.getRef()));
      return localBundle;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return new Bundle();
  }

  public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.a(paramWebView, paramInt, paramString1, paramString2);
    this.jHR = false;
    m localm = k.a(this.jZj);
    new d(paramString1, paramInt, paramString2);
    localm.bbZ();
    try
    {
      this.jZj.dismiss();
      k.b(this.jZj).dismiss();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    z.d("Twitter-WebView", "Webview loading URL: " + paramString);
    super.a(paramWebView, paramString, paramBitmap);
    try
    {
      k.b(this.jZj).show();
      k.b(this.jZj).setOnDismissListener(new o(this));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    z.d("Twitter-WebView", "Redirect URL: " + paramString);
    if (paramString.startsWith("wechatapp://sign-in-twitter.wechatapp.com/"))
    {
      Bundle localBundle = CZ(paramString);
      if (localBundle.getString("denied") == null)
        k.a(this.jZj).a(localBundle);
      while (true)
      {
        this.jZj.dismiss();
        return true;
        k.a(this.jZj).onCancel();
      }
    }
    this.jZj.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
    return true;
  }

  public final void b(WebView paramWebView, String paramString)
  {
    super.b(paramWebView, paramString);
    this.jHR = false;
    try
    {
      k.b(this.jZj).dismiss();
      label21: k.c(this.jZj).setBackgroundColor(0);
      k.d(this.jZj).setVisibility(0);
      k.e(this.jZj).setVisibility(0);
      return;
    }
    catch (Exception localException)
    {
      break label21;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.n
 * JD-Core Version:    0.6.2
 */