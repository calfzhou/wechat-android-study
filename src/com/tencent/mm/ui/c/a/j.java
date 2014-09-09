package com.tencent.mm.ui.c.a;

import android.view.View;
import android.view.View.OnClickListener;

final class j
  implements View.OnClickListener
{
  j(i parami)
  {
  }

  public final void onClick(View paramView)
  {
    i.a(this.jHQ).onCancel();
    this.jHQ.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.j
 * JD-Core Version:    0.6.2
 */