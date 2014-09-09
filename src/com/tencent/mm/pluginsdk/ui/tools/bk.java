package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.smtt.sdk.WebView;
import junit.framework.Assert;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class bk
{
  private static bp dUT = null;

  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, bl parambl)
  {
    if (dUT == null)
      dUT = new bp(1, "webview-save-image", 1);
    dUT.c(new bm(paramContext, paramString1, paramString2, paramBoolean, 1, parambl));
  }

  public static void a(WebView paramWebView)
  {
    z.d("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "initIFrame");
    paramWebView.loadUrl("javascript:var edw_iframe = document.getElementById('_edw_iframe_');if (edw_iframe === null) {edw_iframe = document.createElement('iframe');edw_iframe.id = '_edw_iframe_';edw_iframe.style.display = 'none';document.documentElement.appendChild(edw_iframe);}");
  }

  public static void a(WebView paramWebView, String paramString1, String paramString2)
  {
    if ((paramWebView == null) || (ch.jb(paramString1)) || (ch.jb(paramString2)))
    {
      z.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "getJsResult fail, invalid argument, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      return;
    }
    z.d("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "getJsResult, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
    a(paramWebView);
    paramWebView.loadUrl("javascript:document.getElementById('_edw_iframe_').src = '" + paramString1 + "' + " + paramString2);
  }

  private static PackageInfo ai(Context paramContext, String paramString)
  {
    if (paramString == null)
    {
      z.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "getPackageInfo fail, packageName is null");
      return null;
    }
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  public static String aq(Context paramContext, String paramString)
  {
    String str1 = "!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg, appendUserAgent fail, context is null, stack = " + ch.aHN();
    boolean bool;
    if (paramContext != null)
    {
      bool = true;
      Assert.assertTrue(str1, bool);
      if (paramString != null)
        break label172;
    }
    label172: for (String str2 = " MicroMessenger/"; ; str2 = paramString + " MicroMessenger/")
    {
      PackageInfo localPackageInfo = ai(paramContext, ak.getPackageName());
      if (localPackageInfo != null)
      {
        String str5 = str2 + localPackageInfo.versionName;
        str2 = str5 + "." + localPackageInfo.versionCode;
      }
      String str3 = bc.bz(ak.getContext());
      String str4 = str2 + " NetType/" + str3;
      z.d("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "appendUserAgent, uaStr = " + str4);
      return str4;
      bool = false;
      break;
    }
  }

  public static String bn(String paramString1, String paramString2)
  {
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)))
    {
      z.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "genJsCode fail, invalid argument, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      return null;
    }
    z.d("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "genJsCode, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
    return "document.getElementById('_edw_iframe_').src = '" + paramString1 + "' + " + paramString2;
  }

  public static void c(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (dUT == null)
      dUT = new bp(1, "webview-save-image", 1);
    dUT.c(new bm(paramContext, paramString1, paramString2, paramBoolean));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.bk
 * JD-Core Version:    0.6.2
 */