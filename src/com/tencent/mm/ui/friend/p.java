package com.tencent.mm.ui.friend;

import com.tencent.mm.aj.b;
import com.tencent.mm.aj.l;

final class p
  implements Runnable
{
  p(m paramm)
  {
  }

  public final void run()
  {
    m.a(this.jId, l.AF().yF());
    this.jId.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.p
 * JD-Core Version:    0.6.2
 */