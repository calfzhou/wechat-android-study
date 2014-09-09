package com.tencent.mm.model;

import java.util.Iterator;
import java.util.List;

final class j
  implements Runnable
{
  j(b paramb)
  {
  }

  public final void run()
  {
    Iterator localIterator = b.c(this.dkb).iterator();
    while (localIterator.hasNext())
      ((bc)localIterator.next()).qD();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.j
 * JD-Core Version:    0.6.2
 */