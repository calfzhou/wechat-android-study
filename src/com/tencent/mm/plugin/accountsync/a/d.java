package com.tencent.mm.plugin.accountsync.a;

import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.cr;

final class d
  implements Runnable
{
  d(b paramb, int paramInt)
  {
  }

  public final void run()
  {
    if (b.b(this.dWs) != null)
      b.b(this.dWs).setMessage(b.c(this.dWs).getString(n.btG) + this.dWt + "%");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.a.d
 * JD-Core Version:    0.6.2
 */