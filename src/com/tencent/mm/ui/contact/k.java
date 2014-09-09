package com.tencent.mm.ui.contact;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.at.d;

final class k
  implements AbsListView.OnScrollListener
{
  k(e parame)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 2);
    while (e.j(this.jxW))
      return;
    e.k(this.jxW);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 2)
      d.aNZ().ap(AddressUI.class.getName() + ".Listview", 4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.k
 * JD-Core Version:    0.6.2
 */