package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.cm;

final class f
  implements cm
{
  f(BizConversationUI paramBizConversationUI)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 1:
    }
    BizConversationUI.b(this.jFf, BizConversationUI.i(this.jFf));
    bg.qW().oW().yC(BizConversationUI.i(this.jFf));
    bg.qX().d(new k(5));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.f
 * JD-Core Version:    0.6.2
 */