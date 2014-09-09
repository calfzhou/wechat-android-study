package com.tencent.mm.ui.chatting;

import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;
import java.util.Iterator;
import java.util.List;

final class nj
  implements cl
{
  nj(List paramList)
  {
  }

  public final void a(cg paramcg)
  {
    Iterator localIterator = this.jvA.iterator();
    while (localIterator.hasNext())
      paramcg.add((String)localIterator.next());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nj
 * JD-Core Version:    0.6.2
 */