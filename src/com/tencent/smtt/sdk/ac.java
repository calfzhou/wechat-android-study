package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebSettings.TextSize;
import com.tencent.smtt.a.a;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings.LayoutAlgorithm;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings.RenderPriority;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings.TextSize;

public final class ac
{
  private WebSettings keA = null;
  private boolean keB = false;
  private IX5WebSettings kez = null;

  ac(WebSettings paramWebSettings)
  {
    this.kez = null;
    this.keA = paramWebSettings;
    this.keB = false;
  }

  ac(IX5WebSettings paramIX5WebSettings)
  {
    this.kez = paramIX5WebSettings;
    this.keA = null;
    this.keB = true;
  }

  public final void a(ad paramad)
  {
    if (this.keB)
    {
      this.kez.setLayoutAlgorithm(IX5WebSettings.LayoutAlgorithm.valueOf(paramad.name()));
      return;
    }
    this.keA.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.valueOf(paramad.name()));
  }

  public final void a(ae paramae)
  {
    if (this.keB)
    {
      this.kez.setRenderPriority(IX5WebSettings.RenderPriority.valueOf(paramae.name()));
      return;
    }
    this.keA.setRenderPriority(WebSettings.RenderPriority.valueOf(paramae.name()));
  }

  public final void a(af paramaf)
  {
    if (this.keB)
    {
      this.kez.setTextSize(IX5WebSettings.TextSize.valueOf(paramaf.name()));
      return;
    }
    this.keA.setTextSize(WebSettings.TextSize.valueOf(paramaf.name()));
  }

  public final void bdA()
  {
    try
    {
      if (this.keB)
        this.kez.setDefaultFontSize(8);
      while (true)
      {
        return;
        this.keA.setDefaultFontSize(8);
      }
    }
    finally
    {
    }
  }

  @TargetApi(7)
  public final void bdB()
  {
    if (this.keB)
    {
      this.kez.setDomStorageEnabled(true);
      return;
    }
    this.keA.setDomStorageEnabled(true);
  }

  public final void bdy()
  {
    if (this.keB)
    {
      this.kez.setSaveFormData(false);
      return;
    }
    this.keA.setSaveFormData(false);
  }

  public final void bdz()
  {
    if (this.keB)
    {
      this.kez.setSavePassword(false);
      return;
    }
    this.keA.setSavePassword(false);
  }

  @TargetApi(3)
  public final String getUserAgentString()
  {
    if (this.keB)
      return this.kez.getUserAgentString();
    return this.keA.getUserAgentString();
  }

  @TargetApi(3)
  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    if (this.keB)
    {
      this.kez.setBuiltInZoomControls(paramBoolean);
      return;
    }
    this.keA.setBuiltInZoomControls(paramBoolean);
  }

  public final void setDefaultTextEncodingName(String paramString)
  {
    try
    {
      if (this.keB)
        this.kez.setDefaultTextEncodingName(paramString);
      while (true)
      {
        return;
        this.keA.setDefaultTextEncodingName(paramString);
      }
    }
    finally
    {
    }
  }

  @TargetApi(5)
  public final void setGeolocationEnabled(boolean paramBoolean)
  {
    if (this.keB)
    {
      this.kez.setGeolocationEnabled(paramBoolean);
      return;
    }
    this.keA.setGeolocationEnabled(paramBoolean);
  }

  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    try
    {
      if (this.keB)
        this.kez.setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
      while (true)
      {
        return;
        this.keA.setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
      }
    }
    finally
    {
    }
  }

  @Deprecated
  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    if (this.keB)
    {
      this.kez.setJavaScriptEnabled(paramBoolean);
      return;
    }
    this.keA.setJavaScriptEnabled(paramBoolean);
  }

  @TargetApi(7)
  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    if (this.keB)
    {
      this.kez.setLoadWithOverviewMode(paramBoolean);
      return;
    }
    this.keA.setLoadWithOverviewMode(paramBoolean);
  }

  @Deprecated
  public final void setPluginsEnabled(boolean paramBoolean)
  {
    if (this.keB)
    {
      this.kez.setPluginsEnabled(paramBoolean);
      return;
    }
    WebSettings localWebSettings = this.keA;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Boolean.TYPE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    a.a(localWebSettings, "setPluginsEnabled", arrayOfClass, arrayOfObject);
  }

  public final void setSupportZoom(boolean paramBoolean)
  {
    if (this.keB)
    {
      this.kez.setSupportZoom(paramBoolean);
      return;
    }
    this.keA.setSupportZoom(paramBoolean);
  }

  public final void setUseWideViewPort(boolean paramBoolean)
  {
    if (this.keB)
    {
      this.kez.setUseWideViewPort(paramBoolean);
      return;
    }
    this.keA.setUseWideViewPort(paramBoolean);
  }

  @TargetApi(3)
  public final void setUserAgentString(String paramString)
  {
    if (this.keB)
    {
      this.kez.setUserAgentString(paramString);
      return;
    }
    this.keA.setUserAgentString(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ac
 * JD-Core Version:    0.6.2
 */