package com.tencent.mm.ui.tools;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.cm;

final class fr
  implements Runnable
{
  fr(fj paramfj, FragmentActivity paramFragmentActivity)
  {
  }

  public final void run()
  {
    if (fj.f(this.jUD) == null)
    {
      com.tencent.mm.sdk.platformtools.z.w(fj.c(this.jUD), "on post expand search menu, but item is null");
      return;
    }
    com.tencent.mm.sdk.platformtools.z.v(fj.c(this.jUD), "try to expand action view");
    if (fj.e(this.jUD))
      android.support.v4.view.z.d(fj.f(this.jUD));
    while (true)
    {
      View localView = android.support.v4.view.z.c(fj.f(this.jUD));
      if ((localView == null) || (!fj.b(this.jUD)))
        break;
      localView.findViewById(i.aqy).requestFocus();
      if (!fj.h(this.jUD))
        break;
      fj.i(this.jUD).postDelayed(new fs(this, localView), 128L);
      return;
      if (fj.g(this.jUD) != null)
        fj.g(this.jUD).baO();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fr
 * JD-Core Version:    0.6.2
 */