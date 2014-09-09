package com.tencent.mm.ui;

import android.content.Context;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.am;

final class dv
  implements Runnable
{
  dv(String paramString, Context paramContext)
  {
  }

  public final void run()
  {
    if (g.AB(this.iMU) != null)
      am.h(new dw(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dv
 * JD-Core Version:    0.6.2
 */