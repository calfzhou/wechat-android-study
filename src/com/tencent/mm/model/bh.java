package com.tencent.mm.model;

import com.tencent.mm.network.ag;
import com.tencent.mm.network.ah;
import java.util.HashSet;
import java.util.Iterator;

final class bh extends ah
{
  bh(bg parambg)
  {
  }

  public final void aW(int paramInt)
  {
    Iterator localIterator = bg.a(this.dlm).iterator();
    while (localIterator.hasNext())
      ((ag)localIterator.next()).aW(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bh
 * JD-Core Version:    0.6.2
 */