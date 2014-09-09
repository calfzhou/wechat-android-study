package com.tencent.mm.modelgeo;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

final class l
  implements Runnable
{
  l(k paramk, boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4)
  {
  }

  public final void run()
  {
    Iterator localIterator = h.b(this.dvJ.dvB).iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null))
        ((c)localWeakReference.get()).a(this.dvC, (float)this.dvD, (float)this.dvE, this.dvF, (float)this.dvG, this.dvH);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.l
 * JD-Core Version:    0.6.2
 */