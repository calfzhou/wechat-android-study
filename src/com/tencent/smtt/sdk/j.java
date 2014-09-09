package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import com.tencent.smtt.export.external.WebViewWizardBase;
import java.io.File;

final class j
  implements Runnable
{
  j(h paramh, Context paramContext)
  {
  }

  public final void run()
  {
    WebViewWizardBase localWebViewWizardBase = new WebViewWizardBase();
    localWebViewWizardBase.setWizardMode(true, true);
    Context localContext1 = h.aH(this.dLL, "com.tencent.mtt");
    if (localContext1 == null)
      return;
    File localFile1 = localContext1.getDir("x5_share", 0);
    File localFile2 = new File(localFile1, "x5core");
    Context localContext2 = this.dLL;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = new File(localFile1, "webview_interfaces_dex.jar").getAbsolutePath();
    arrayOfString[1] = new File(localFile2, "webview_dex.jar").getAbsolutePath();
    localWebViewWizardBase.setDexLoader(localContext2, arrayOfString, h.a(this.kee).getAbsolutePath());
    h.f(this.kee).removeMessages(100);
    h.f(this.kee).sendEmptyMessage(100);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.j
 * JD-Core Version:    0.6.2
 */