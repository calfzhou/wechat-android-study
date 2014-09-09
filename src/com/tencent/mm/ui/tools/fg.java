package com.tencent.mm.ui.tools;

import android.graphics.Rect;
import android.view.View;

final class fg
{
  private Rect jUp = new Rect();
  private View view = null;

  fg(View paramView)
  {
    this.view = paramView;
    if (paramView != null)
      this.jUp.set(paramView.getPaddingLeft(), paramView.getPaddingTop(), paramView.getPaddingRight(), paramView.getPaddingBottom());
  }

  final void restore()
  {
    if (this.view != null)
      this.view.setPadding(this.jUp.left, this.jUp.top, this.jUp.right, this.jUp.bottom);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fg
 * JD-Core Version:    0.6.2
 */