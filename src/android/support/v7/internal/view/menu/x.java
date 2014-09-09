package android.support.v7.internal.view.menu;

import android.support.v7.a.b;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class x extends FrameLayout
  implements CollapsibleActionView
{
  final b lP;

  x(View paramView)
  {
    super(paramView.getContext());
    this.lP = ((b)paramView);
    addView(paramView);
  }

  public final void onActionViewCollapsed()
  {
    this.lP.onActionViewCollapsed();
  }

  public final void onActionViewExpanded()
  {
    this.lP.onActionViewExpanded();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.x
 * JD-Core Version:    0.6.2
 */