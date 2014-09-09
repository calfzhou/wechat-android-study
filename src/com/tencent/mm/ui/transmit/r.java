package com.tencent.mm.ui.transmit;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

final class r
  implements AbsListView.OnScrollListener
{
  r(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 0)
    {
      View localView = SelectConversationUI.b(this.jYz).getChildAt(SelectConversationUI.b(this.jYz).getFirstVisiblePosition());
      if ((localView != null) && (localView.getTop() == 0))
      {
        SelectConversationUI.h(this.jYz).setVisibility(8);
        return;
      }
      SelectConversationUI.h(this.jYz).setVisibility(0);
      return;
    }
    SelectConversationUI.h(this.jYz).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.r
 * JD-Core Version:    0.6.2
 */