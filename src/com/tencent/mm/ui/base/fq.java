package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;

final class fq
  implements View.OnClickListener
{
  fq(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onClick(View paramView)
  {
    TalkRoomPopupNav.b(this.jfE);
    if (TalkRoomPopupNav.a(this.jfE) != null)
      TalkRoomPopupNav.a(this.jfE).aTv();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fq
 * JD-Core Version:    0.6.2
 */