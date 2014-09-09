package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;

final class bv
  implements View.OnClickListener
{
  bv(bt parambt)
  {
  }

  public final void onClick(View paramView)
  {
    bt.a(this.jof).de(((Long)paramView.getTag()).longValue());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bv
 * JD-Core Version:    0.6.2
 */