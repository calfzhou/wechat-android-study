package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class dz
{
  private boolean dmB = false;
  private Set dmC = new HashSet();

  public final boolean a(ea paramea)
  {
    if (this.dmB)
    {
      z.e("!32@/B4Tb64lLpIFIlpC8b6zf6sidN7sYXyI", "add , is running , forbid add");
      return false;
    }
    return this.dmC.add(paramea);
  }

  public final boolean b(ea paramea)
  {
    if (this.dmB)
    {
      z.e("!32@/B4Tb64lLpIFIlpC8b6zf6sidN7sYXyI", "remove , is running , forbid remove");
      return false;
    }
    return this.dmC.remove(paramea);
  }

  final void run()
  {
    this.dmB = true;
    Iterator localIterator = this.dmC.iterator();
    while (localIterator.hasNext())
    {
      ea localea = (ea)localIterator.next();
      if (localea != null)
        localea.sb();
    }
    this.dmB = false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.dz
 * JD-Core Version:    0.6.2
 */