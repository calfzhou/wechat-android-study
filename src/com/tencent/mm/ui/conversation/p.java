package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.ListView;
import com.tencent.mm.ui.base.di;

final class p
  implements di
{
  p(BizConversationUI paramBizConversationUI)
  {
  }

  public final int K(View paramView)
  {
    return BizConversationUI.a(this.jFf).getPositionForView(paramView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.p
 * JD-Core Version:    0.6.2
 */