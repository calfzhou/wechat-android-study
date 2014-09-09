package com.tencent.mm.sandbox.updater;

import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ch;

final class t
  implements Runnable
{
  t(AppUpdaterUI paramAppUpdaterUI, String paramString)
  {
  }

  public final void run()
  {
    String str = this.iBv;
    Intent localIntent = ch.xo(str);
    this.iBB.startActivity(localIntent);
    AppUpdaterUI.f(this.iBB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.t
 * JD-Core Version:    0.6.2
 */