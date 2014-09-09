package com.tencent.mm.ui.tools;

import android.support.v4.app.FragmentActivity;
import com.tencent.mm.sdk.platformtools.z;

final class fu
  implements Runnable
{
  fu(fj paramfj, FragmentActivity paramFragmentActivity)
  {
  }

  public final void run()
  {
    if ((this.jUE == null) || (this.jUE.isFinishing()))
    {
      z.w(fj.c(this.jUD), "want to expand search view, but activity status error");
      return;
    }
    this.jUE.n();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fu
 * JD-Core Version:    0.6.2
 */