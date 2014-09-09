package com.tencent.mm.ui.conversation;

import com.tencent.mm.plugin.f.c.j;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;

final class an
  implements Runnable
{
  an(aj paramaj)
  {
  }

  public final void run()
  {
    if (!ak.aHe())
    {
      ak.ed(true);
      am.b(new ao(this), 100L);
    }
    n.fTF.jt(8);
    j.jt(16);
    j.ju(15);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.an
 * JD-Core Version:    0.6.2
 */