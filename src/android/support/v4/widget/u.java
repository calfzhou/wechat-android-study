package android.support.v4.widget;

import android.support.v4.view.ba;
import android.view.View;
import java.util.ArrayList;

final class u
  implements Runnable
{
  final View hc;

  u(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    this.hc = paramView;
  }

  public final void run()
  {
    if (this.hc.getParent() == this.hb)
    {
      ba.a(this.hc, 0, null);
      SlidingPaneLayout.a(this.hb, this.hc);
    }
    SlidingPaneLayout.f(this.hb).remove(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.u
 * JD-Core Version:    0.6.2
 */