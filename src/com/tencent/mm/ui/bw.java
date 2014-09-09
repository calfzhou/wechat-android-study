package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c.a.fr;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class bw
  implements View.OnClickListener
{
  private final long gLm = 300L;

  bw(LauncherUITabView paramLauncherUITabView)
  {
  }

  public final void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    if ((LauncherUITabView.a(this.iLi) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUITabView.b(this.iLi) <= 300L))
    {
      z.v("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "onMainTabDoubleClick");
      LauncherUITabView.c(this.iLi).removeMessages(0);
      a.aGB().g(new fr());
      LauncherUITabView.a(this.iLi, System.currentTimeMillis());
      LauncherUITabView.a(this.iLi, i);
      return;
    }
    if (LauncherUITabView.d(this.iLi) != null)
    {
      if ((i != 0) || (LauncherUITabView.a(this.iLi) != 0))
      {
        LauncherUITabView.a(this.iLi, System.currentTimeMillis());
        LauncherUITabView.a(this.iLi, i);
        LauncherUITabView.d(this.iLi).oE(i);
        return;
      }
      LauncherUITabView.c(this.iLi).sendEmptyMessageDelayed(0, 300L);
    }
    LauncherUITabView.a(this.iLi, System.currentTimeMillis());
    LauncherUITabView.a(this.iLi, i);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ((Integer)paramView.getTag());
    z.w("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "on tab click, index %d, but listener is null", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bw
 * JD-Core Version:    0.6.2
 */