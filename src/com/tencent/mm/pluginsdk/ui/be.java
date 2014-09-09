package com.tencent.mm.pluginsdk.ui;

import android.view.WindowManager;

final class be
  implements Runnable
{
  private be(SmileySubGrid paramSmileySubGrid)
  {
  }

  public final void run()
  {
    if (!SmileySubGrid.c(this.hAj))
    {
      SmileySubGrid.f(this.hAj).addView(SmileySubGrid.d(this.hAj), SmileySubGrid.e(this.hAj));
      SmileySubGrid.g(this.hAj);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.be
 * JD-Core Version:    0.6.2
 */