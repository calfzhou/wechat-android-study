package com.tencent.mm.ui.tools;

final class g
  implements Runnable
{
  g(ActionBarSearchView paramActionBarSearchView)
  {
  }

  public final void run()
  {
    ActionBarSearchView.f(this.jOM).removeTextChangedListener(ActionBarSearchView.e(this.jOM));
    ActionBarSearchView.f(this.jOM).setText("");
    ActionBarSearchView.f(this.jOM).addTextChangedListener(ActionBarSearchView.e(this.jOM));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.g
 * JD-Core Version:    0.6.2
 */