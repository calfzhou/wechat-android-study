package com.tencent.mm.ui;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.tencent.mm.f.c;
import com.tencent.mm.f.e;
import com.tencent.mm.sdk.platformtools.z;

final class bi
  implements Runnable
{
  bi(LauncherUI paramLauncherUI)
  {
  }

  public final void run()
  {
    SharedPreferences.Editor localEditor = this.iKj.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
    String str = e.or().getValue("WebviewUseX5KernelSection");
    z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "updateWebViewDynamicConfig, value = %s", new Object[] { str });
    localEditor.putString("webview_x5_kernel_section", str);
    if (Build.VERSION.SDK_INT > 8)
    {
      localEditor.apply();
      return;
    }
    localEditor.commit();
  }

  public final String toString()
  {
    return super.toString() + "|updateWebViewDynamicConfigRunnable";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bi
 * JD-Core Version:    0.6.2
 */