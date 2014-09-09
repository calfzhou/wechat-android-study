package com.tencent.mm.sandbox.updater;

import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ch;

final class c
  implements Runnable
{
  c(AppInstallerUI paramAppInstallerUI, String paramString)
  {
  }

  public final void run()
  {
    String str = this.iBv;
    Intent localIntent = ch.xo(str);
    this.iBu.startActivity(localIntent);
    AppInstallerUI.d(this.iBu);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.c
 * JD-Core Version:    0.6.2
 */