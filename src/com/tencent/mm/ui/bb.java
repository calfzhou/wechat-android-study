package com.tencent.mm.ui;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Iterator;
import java.util.LinkedList;

final class bb
  implements View.OnClickListener
{
  bb(LauncherUI paramLauncherUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (SystemClock.elapsedRealtime() - LauncherUI.x(this.iKj) < 300L)
    {
      Iterator localIterator = LauncherUI.y(this.iKj).iterator();
      while (localIterator.hasNext())
        ((Runnable)localIterator.next()).run();
    }
    LauncherUI.a(this.iKj, SystemClock.elapsedRealtime());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bb
 * JD-Core Version:    0.6.2
 */