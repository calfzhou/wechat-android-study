package com.tencent.mm.ui.conversation;

import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.pluginsdk.ui.a.b;

final class ba
  implements Runnable
{
  ba(az paramaz)
  {
  }

  public final void run()
  {
    if ((aj.b(this.jHe.jGZ).Hd()) && (aj.c(this.jHe.jGZ).getVisibility() != 0))
    {
      aj.c(this.jHe.jGZ).setVisibility(0);
      aj.d(this.jHe.jGZ).setVisibility(8);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ba
 * JD-Core Version:    0.6.2
 */