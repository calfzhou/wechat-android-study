package com.tencent.mm.booter.notification.a;

import com.tencent.mm.booter.notification.b;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class f
{
  public final Queue dji = new LinkedList();
  private int id = 4097;
  private int mark = -1;

  public static final f lL()
  {
    return g.lM();
  }

  public final b a(b paramb)
  {
    if (paramb == null)
    {
      z.e("!44@/B4Tb64lLpKR3MWtFvfaIPwtPgb87rUCyQv3l0JxiQQ=", "notification item null when put");
      return null;
    }
    if (paramb.getId() < 0)
    {
      z.e("!44@/B4Tb64lLpKR3MWtFvfaIPwtPgb87rUCyQv3l0JxiQQ=", "notification id < 0 when put");
      return null;
    }
    if (this.mark > 0)
    {
      if (this.mark == paramb.getId())
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(this.mark);
        z.d("!44@/B4Tb64lLpKR3MWtFvfaIPwtPgb87rUCyQv3l0JxiQQ=", "remove mark: %d", arrayOfObject3);
        bT(this.mark);
      }
      this.mark = -1;
    }
    if (this.dji.size() >= 5);
    for (b localb1 = (b)this.dji.poll(); ; localb1 = null)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.id);
      z.d("!44@/B4Tb64lLpKR3MWtFvfaIPwtPgb87rUCyQv3l0JxiQQ=", "put item: %d", arrayOfObject1);
      this.dji.add(paramb);
      if (this.id == paramb.getId())
        this.id = -1;
      if (this.id < 0)
        if (localb1 == null)
          break label184;
      label184: int i;
      for (this.id = localb1.getId(); ; this.id = i)
      {
        return localb1;
        long l = System.currentTimeMillis();
        Iterator localIterator = this.dji.iterator();
        b localb2;
        for (String str = ""; localIterator.hasNext(); str = str + localb2.getId() + ",")
          localb2 = (b)localIterator.next();
        for (i = 4097; str.contains(String.valueOf(i)); i++);
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - l);
        arrayOfObject2[1] = Integer.valueOf(i);
        z.d("!44@/B4Tb64lLpKR3MWtFvfaIPwtPgb87rUCyQv3l0JxiQQ=", "create id spend: %d, id: %d", arrayOfObject2);
      }
    }
  }

  public final b bT(int paramInt)
  {
    Iterator localIterator = this.dji.iterator();
    b localb;
    do
    {
      if (!localIterator.hasNext())
        break;
      localb = (b)localIterator.next();
    }
    while ((localb == null) || (localb.getId() != paramInt));
    while (true)
    {
      if (localb != null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        z.d("!44@/B4Tb64lLpKR3MWtFvfaIPwtPgb87rUCyQv3l0JxiQQ=", "delete: %d", arrayOfObject);
        this.dji.remove(localb);
        this.id = localb.getId();
      }
      return localb;
      localb = null;
    }
  }

  public final void clear()
  {
    Iterator localIterator = this.dji.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).clear();
    this.dji.clear();
    this.id = 4097;
  }

  public final b cn(String paramString)
  {
    Iterator localIterator = this.dji.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if ((localb != null) && (localb.kt().equals(paramString)))
        return localb;
    }
    return null;
  }

  public final int co(String paramString)
  {
    b localb = cn(paramString);
    if (localb != null)
      return localb.getId();
    return this.id;
  }

  public final void mark(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpKR3MWtFvfaIPwtPgb87rUCyQv3l0JxiQQ=", "mark: %d", arrayOfObject);
    this.mark = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f
 * JD-Core Version:    0.6.2
 */