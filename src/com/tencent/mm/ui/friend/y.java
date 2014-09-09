package com.tencent.mm.ui.friend;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.dl;

final class y
  implements dl
{
  y(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final void S(Object paramObject)
  {
    if (paramObject == null)
    {
      z.e("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "onItemDel object null");
      return;
    }
    FMessageConversationUI.Da(paramObject.toString());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.y
 * JD-Core Version:    0.6.2
 */