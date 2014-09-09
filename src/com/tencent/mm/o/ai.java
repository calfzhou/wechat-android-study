package com.tencent.mm.o;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ai
  implements Runnable
{
  ai(ac paramac, x paramx, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void run()
  {
    Set localSet1 = (Set)ac.i(this.doZ).get(Integer.valueOf(this.dpb.getType()));
    if ((localSet1 != null) && (localSet1.size() > 0))
    {
      HashSet localHashSet2 = new HashSet();
      localHashSet2.addAll(localSet1);
      Iterator localIterator2 = localHashSet2.iterator();
      while (localIterator2.hasNext())
      {
        m localm2 = (m)localIterator2.next();
        if ((localm2 != null) && (localSet1.contains(localm2)))
          localm2.a(this.dpd, this.dpe, this.dpf, this.dpb);
      }
    }
    Set localSet2 = (Set)ac.i(this.doZ).get(Integer.valueOf(-1));
    if ((localSet2 != null) && (localSet2.size() > 0))
    {
      HashSet localHashSet1 = new HashSet();
      localHashSet1.addAll(localSet2);
      Iterator localIterator1 = localHashSet1.iterator();
      while (localIterator1.hasNext())
      {
        m localm1 = (m)localIterator1.next();
        if ((localm1 != null) && (localSet2.contains(localm1)))
          localm1.a(this.dpd, this.dpe, this.dpf, this.dpb);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.ai
 * JD-Core Version:    0.6.2
 */