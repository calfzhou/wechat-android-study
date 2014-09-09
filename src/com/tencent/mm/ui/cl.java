package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c.a.t;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;

final class cl
  implements View.OnClickListener
{
  cl(cg paramcg)
  {
  }

  public final void onClick(View paramView)
  {
    t localt = new t();
    localt.cHt.type = 1;
    a.aGB().g(localt);
    cg.b(this.iMo).setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.cl
 * JD-Core Version:    0.6.2
 */