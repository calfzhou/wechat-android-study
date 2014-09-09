package com.tencent.mm.ui.b;

import android.view.View;
import android.view.View.OnClickListener;

final class c
  implements View.OnClickListener
{
  c(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    if ((a.a(this.iWs) != null) && (a.b(this.iWs) != null))
    {
      ad localad = a.a(this.iWs).pi(a.c(this.iWs));
      a.b(this.iWs).onClick(localad.getId(), localad.getUrl());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.c
 * JD-Core Version:    0.6.2
 */