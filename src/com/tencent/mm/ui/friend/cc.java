package com.tencent.mm.ui.friend;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class cc
  implements AdapterView.OnItemClickListener
{
  cc(RecommendFriendUI paramRecommendFriendUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (!RecommendFriendUI.a(this.jJi))
    {
      RecommendFriendUI.b(this.jJi).eV(paramInt);
      if (RecommendFriendUI.b(this.jJi).aYF().length > 0)
      {
        this.jJi.eC(true);
        return;
      }
      this.jJi.eC(false);
      return;
    }
    RecommendFriendUI.a(this.jJi, RecommendFriendUI.b(this.jJi).qE(paramInt));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.cc
 * JD-Core Version:    0.6.2
 */