package com.tencent.mm.ui.contact;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.dl;

final class ax
  implements dl
{
  ax(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final void S(Object paramObject)
  {
    if (paramObject == null)
    {
      z.e("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "onItemDel object null");
      return;
    }
    ChatroomContactUI.Ct(paramObject.toString());
    ChatroomContactUI.c(this.jyq);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ax
 * JD-Core Version:    0.6.2
 */