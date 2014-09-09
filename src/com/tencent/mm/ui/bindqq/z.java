package com.tencent.mm.ui.bindqq;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.base.e;

final class z
  implements View.OnClickListener
{
  z(StartUnbindQQ paramStartUnbindQQ)
  {
  }

  public final void onClick(View paramView)
  {
    if (StartUnbindQQ.a(this.jlk) == null)
    {
      StartUnbindQQ.a(this.jlk, e.a(this.jlk, null, StartUnbindQQ.b(this.jlk), new aa(this), new ab(this)));
      return;
    }
    StartUnbindQQ.a(this.jlk).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.z
 * JD-Core Version:    0.6.2
 */