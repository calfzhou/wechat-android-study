package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.pluginsdk.ui.a.a;
import com.tencent.mm.ui.b.g;
import com.tencent.mm.ui.b.i;

final class av
  implements Runnable
{
  av(au paramau)
  {
  }

  public final void run()
  {
    if (aj.p(this.jHd.jGZ) != null)
    {
      aj.p(this.jHd.jGZ).setVisibility(8);
      aj.p(this.jHd.jGZ).removeAllViews();
    }
    a locala = g.I(this.jHd.jGZ.h(), i.iWv);
    if ((locala != null) && (locala.getView() != null))
    {
      aj.p(this.jHd.jGZ).setVisibility(0);
      View localView = locala.getView();
      aj.p(this.jHd.jGZ).addView(localView, new LinearLayout.LayoutParams(-1, -2));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.av
 * JD-Core Version:    0.6.2
 */