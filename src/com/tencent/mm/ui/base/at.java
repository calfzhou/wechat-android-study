package com.tencent.mm.ui.base;

import android.widget.TextView;

final class at
  implements Runnable
{
  at(MMCollapsibleTextView paramMMCollapsibleTextView)
  {
  }

  public final void run()
  {
    MMCollapsibleTextView.d(this.iYG).setMaxLines(10);
    MMCollapsibleTextView.e(this.iYG).setVisibility(0);
    MMCollapsibleTextView.e(this.iYG).setText(MMCollapsibleTextView.f(this.iYG));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.at
 * JD-Core Version:    0.6.2
 */