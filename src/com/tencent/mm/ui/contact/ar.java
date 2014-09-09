package com.tencent.mm.ui.contact;

import android.widget.ListView;
import com.tencent.mm.pluginsdk.ui.bm;
import com.tencent.mm.sdk.platformtools.z;

final class ar
  implements bm
{
  ar(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final void dj(boolean paramBoolean)
  {
    z.d("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "visible " + paramBoolean);
    if (paramBoolean)
    {
      int i = ChatroomContactUI.b(this.jyq).getFirstVisiblePosition();
      z.d("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "getFirstVisiblePosition  " + i);
      if (i > 0)
        ChatroomContactUI.b(this.jyq).post(new as(this));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ar
 * JD-Core Version:    0.6.2
 */