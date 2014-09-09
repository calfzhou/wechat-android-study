package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.ui.tools.ei;

public final class az
{
  public static void H(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, null, null, null);
  }

  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    ei localei = new ei(paramContext);
    localei.a(new ba(paramInt, paramContext));
    localei.b(new bb(paramContext, paramString2, paramString1, paramString3));
    localei.baG();
  }

  public static void au(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.hNg);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.hNd);
    a.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.az
 * JD-Core Version:    0.6.2
 */