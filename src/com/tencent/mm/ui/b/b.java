package com.tencent.mm.ui.b;

import android.view.View;
import android.view.View.OnClickListener;

final class b
  implements View.OnClickListener
{
  b(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    if ((a.a(this.iWs) != null) && (a.b(this.iWs) != null))
    {
      ad localad = a.a(this.iWs).pi(a.c(this.iWs));
      a.b(this.iWs).BI(localad.getId());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.b
 * JD-Core Version:    0.6.2
 */