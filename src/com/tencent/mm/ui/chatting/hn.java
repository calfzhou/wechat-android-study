package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;

final class hn
  implements Runnable
{
  hn(hd paramhd)
  {
  }

  public final void run()
  {
    ho localho = new ho(this);
    if (hd.e(this.jtA) != null)
      hd.e(this.jtA).setOnDragListener(localho);
    if (this.jtA.fpD != null)
    {
      this.jtA.fpD.setOnDragListener(localho);
      this.jtA.fpD.a(localho);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hn
 * JD-Core Version:    0.6.2
 */