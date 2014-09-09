package com.tencent.mm.ui;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;

final class ci
  implements View.OnClickListener
{
  ci(cg paramcg, Runnable paramRunnable)
  {
  }

  public final void onClick(View paramView)
  {
    if (SystemClock.elapsedRealtime() - cg.i(this.iMo) < 300L)
      this.iMp.run();
    cg.a(this.iMo, SystemClock.elapsedRealtime());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ci
 * JD-Core Version:    0.6.2
 */