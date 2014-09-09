package com.tencent.mm.ui.conversation;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.at.d;

final class ce
  implements AbsListView.OnScrollListener
{
  ce(aj paramaj)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 2);
    while (aj.i(this.jGZ))
      return;
    aj.j(this.jGZ);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 2)
      d.aNZ().ap(aj.class.getName() + ".Listview", 4);
    if (paramInt == 0)
    {
      if (aj.c(this.jGZ) == null)
        return;
      aj.a(this.jGZ, -1);
      return;
    }
    aj.k(this.jGZ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ce
 * JD-Core Version:    0.6.2
 */