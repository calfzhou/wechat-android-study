package com.tencent.mm.ui.chatting;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.mm.pluginsdk.ui.EmojiView;

final class kf
  implements AbsListView.OnScrollListener
{
  kf(hd paramhd)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      if (hd.u(this.jtA) != 0)
        EmojiView.azW();
      if (hd.P(this.jtA))
      {
        int i = hd.e(this.jtA).getLastVisiblePosition();
        if (i == paramInt3 - 1);
      }
      while (true)
      {
        return;
        hd.Q(this.jtA);
        if ((hd.R(this.jtA) > 0) && (paramInt3 - (paramInt1 + 1) == hd.R(this.jtA)))
          hd.S(this.jtA);
      }
    }
    finally
    {
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    hd.b(this.jtA, paramInt);
    this.jtA.ql(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kf
 * JD-Core Version:    0.6.2
 */