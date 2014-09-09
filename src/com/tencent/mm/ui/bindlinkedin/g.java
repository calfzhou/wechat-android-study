package com.tencent.mm.ui.bindlinkedin;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class g
  implements View.OnClickListener
{
  g(BindLinkedInUI paramBindLinkedInUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (!BindLinkedInUI.b(this.jjm))
    {
      BindLinkedInUI.c(this.jjm);
      return;
    }
    if (!BindLinkedInUI.d(this.jjm))
    {
      BindLinkedInUI.e(this.jjm);
      return;
    }
    e.a(this.jjm, this.jjm.getString(n.bBN), null, new h(this), new i(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.g
 * JD-Core Version:    0.6.2
 */