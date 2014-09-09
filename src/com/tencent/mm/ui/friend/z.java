package com.tencent.mm.ui.friend;

import com.tencent.mm.ui.cc;

final class z
  implements cc
{
  z(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final void DT()
  {
    if (FMessageConversationUI.b(this.jIq).getCount() >= 0)
    {
      this.jIq.t(0, true);
      return;
    }
    this.jIq.t(0, false);
  }

  public final void DU()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.z
 * JD-Core Version:    0.6.2
 */