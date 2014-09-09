package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.tools.fj;

final class gn
  implements View.OnClickListener
{
  gn(gm paramgm)
  {
  }

  public final void onClick(View paramView)
  {
    if (gm.a(this.jrm).de(((Long)paramView.getTag()).longValue()))
    {
      int i = gm.a(this.jrm).acU();
      gm.b(this.jrm).aVI();
      gm.c(this.jrm).baN();
      gm.d(this.jrm).setVisibility(0);
      gm.d(this.jrm).qf(i);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gn
 * JD-Core Version:    0.6.2
 */