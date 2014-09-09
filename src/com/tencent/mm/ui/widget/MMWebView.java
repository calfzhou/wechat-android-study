package com.tencent.mm.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.f;
import java.util.Map;

public class MMWebView extends WebView
{
  private boolean dNY = false;

  static
  {
    f.a(new k());
  }

  public MMWebView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      if (Build.VERSION.SDK_INT >= 11)
        super.removeJavascriptInterface("searchBoxJavaBridge_");
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      z.e("!32@/B4Tb64lLpLUa7oZpyRLqvfaQ8r05r/t", "removeConfigJsInterface, ex = %s", arrayOfObject);
    }
  }

  public final void bcu()
  {
    if (Build.VERSION.SDK_INT >= 5)
    {
      new o(this, (byte)0);
      setScrollbarFadingEnabled(true);
      setScrollBarStyle(0);
      return;
    }
    new n(this, (byte)0);
    setScrollBarStyle(0);
  }

  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    super.loadData(paramString1, paramString2, paramString3);
  }

  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }

  public void loadUrl(String paramString)
  {
    super.loadUrl(paramString);
  }

  @TargetApi(8)
  public void loadUrl(String paramString, Map paramMap)
  {
    super.loadUrl(paramString, paramMap);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMWebView
 * JD-Core Version:    0.6.2
 */