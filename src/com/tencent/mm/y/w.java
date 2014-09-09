package com.tencent.mm.y;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import java.util.LinkedList;

final class w
  implements am
{
  w(v paramv)
  {
  }

  public final void xY()
  {
    if (v.a(this.dyd).size() > 0)
    {
      ag localag = (ag)v.a(this.dyd).poll();
      bg.qX().d(localag);
      v.a(this.dyd, true);
      return;
    }
    v.a(this.dyd, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.w
 * JD-Core Version:    0.6.2
 */