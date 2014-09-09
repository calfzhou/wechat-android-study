package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.mm.ui.tools.ei;

final class o
  implements AdapterView.OnItemLongClickListener
{
  o(BizConversationUI paramBizConversationUI)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    BizConversationUI.a(this.jFf, (com.tencent.mm.storage.r)BizConversationUI.c(this.jFf).getItem(paramInt));
    BizConversationUI.a(this.jFf, BizConversationUI.d(this.jFf).getUsername());
    BizConversationUI.f(this.jFf).a(paramView, paramInt, paramLong, this.jFf, BizConversationUI.e(this.jFf));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.o
 * JD-Core Version:    0.6.2
 */