package com.tencent.mm.ui.base;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;

final class as
  implements View.OnClickListener
{
  as(MMCollapsibleTextView paramMMCollapsibleTextView)
  {
  }

  public final void onClick(View paramView)
  {
    switch (MMCollapsibleTextView.b(this.iYG).get(MMCollapsibleTextView.a(this.iYG), -1))
    {
    default:
      return;
    case 1:
      MMCollapsibleTextView.b(this.iYG).put(MMCollapsibleTextView.a(this.iYG), 2);
    case 2:
    }
    while (true)
    {
      MMCollapsibleTextView.c(this.iYG);
      return;
      MMCollapsibleTextView.b(this.iYG).put(MMCollapsibleTextView.a(this.iYG), 1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.as
 * JD-Core Version:    0.6.2
 */