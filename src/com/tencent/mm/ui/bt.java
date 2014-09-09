package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c.a.fr;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class bt
  implements View.OnClickListener
{
  private final long gLm = 300L;

  bt(LauncherUIBottomTabView paramLauncherUIBottomTabView)
  {
  }

  public final void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    if ((LauncherUIBottomTabView.a(this.iKU) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUIBottomTabView.b(this.iKU) <= 300L))
    {
      z.v("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "onMainTabDoubleClick");
      LauncherUIBottomTabView.c(this.iKU).removeMessages(0);
      a.aGB().g(new fr());
      LauncherUIBottomTabView.a(this.iKU, System.currentTimeMillis());
      LauncherUIBottomTabView.a(this.iKU, i);
      return;
    }
    if (LauncherUIBottomTabView.d(this.iKU) != null)
    {
      if ((i != 0) || (LauncherUIBottomTabView.a(this.iKU) != 0))
      {
        z.v("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "directly dispatch tab click event");
        LauncherUIBottomTabView.a(this.iKU, System.currentTimeMillis());
        LauncherUIBottomTabView.a(this.iKU, i);
        LauncherUIBottomTabView.d(this.iKU).oE(i);
        return;
      }
      z.v("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "do double click check");
      LauncherUIBottomTabView.c(this.iKU).sendEmptyMessageDelayed(0, 300L);
    }
    LauncherUIBottomTabView.a(this.iKU, System.currentTimeMillis());
    LauncherUIBottomTabView.a(this.iKU, i);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ((Integer)paramView.getTag());
    z.w("!44@/B4Tb64lLpKf6BwZaHy6XtTBtHJGvRAE6ZpOmb+TUBQ=", "on tab click, index %d, but listener is null", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bt
 * JD-Core Version:    0.6.2
 */