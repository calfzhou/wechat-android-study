package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c
  implements m
{
  private Map doT = new HashMap();

  public c()
  {
    bg.qX().a(452, this);
  }

  public static void a(int paramInt, ac paramac)
  {
    ad localad = new ad(paramInt, paramac);
    bg.qX().d(localad);
  }

  public final void SU()
  {
    bg.qX().b(452, this);
    this.doT.clear();
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    ad localad = (ad)paramx;
    Set localSet = (Set)this.doT.get(Integer.valueOf(localad.ayK()));
    if ((localSet != null) && (localSet.size() > 0))
    {
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(localSet);
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext())
      {
        x localx = (x)localIterator.next();
        if ((localx != null) && (localSet.contains(localx)))
          localx.a(paramInt1, paramInt2, paramString, localad.ayL());
      }
    }
  }

  public final void a(int paramInt, x paramx)
  {
    if (!this.doT.containsKey(Integer.valueOf(paramInt)))
      this.doT.put(Integer.valueOf(paramInt), new HashSet());
    if (!((Set)this.doT.get(Integer.valueOf(paramInt))).contains(paramx))
      ((Set)this.doT.get(Integer.valueOf(paramInt))).add(paramx);
  }

  public final void b(int paramInt, x paramx)
  {
    if (this.doT.get(Integer.valueOf(paramInt)) != null)
      ((Set)this.doT.get(Integer.valueOf(paramInt))).remove(paramx);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.c
 * JD-Core Version:    0.6.2
 */