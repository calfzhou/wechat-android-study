package com.tencent.mm.ui.friend;

import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

final class bl
  implements cl
{
  bl(bi parambi, HashMap paramHashMap)
  {
  }

  public final void a(cg paramcg)
  {
    Iterator localIterator = this.jIT.keySet().iterator();
    while (localIterator.hasNext())
      paramcg.add((String)localIterator.next());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bl
 * JD-Core Version:    0.6.2
 */