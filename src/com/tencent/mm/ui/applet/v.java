package com.tencent.mm.ui.applet;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import com.tencent.mm.at.d;

final class v
  implements View.OnClickListener
{
  v(t paramt)
  {
  }

  public final void onClick(View paramView)
  {
    if ((t.b(this.iWh)) && (t.c(this.iWh).getVisibility() != 0))
      d.aNZ().b(this.iWh.iWe);
    this.iWh.hP();
    s.aRl();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.v
 * JD-Core Version:    0.6.2
 */