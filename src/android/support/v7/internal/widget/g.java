package android.support.v7.internal.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

final class g
  implements View.OnClickListener
{
  g(ActionBarView paramActionBarView)
  {
  }

  public final void onClick(View paramView)
  {
    this.nq.nm.onMenuItemSelected(0, ActionBarView.c(this.nq));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.g
 * JD-Core Version:    0.6.2
 */