package com.tencent.mm.plugin.gwallet.a;

import com.tencent.mm.sdk.platformtools.cm;
import java.util.Iterator;
import java.util.List;

final class d
  implements Runnable
{
  d(b paramb, List paramList, i parami, cm paramcm)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.fdJ.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        b.a(this.fdI, str);
      }
      catch (a locala)
      {
        i = locala.fdz.fdS;
      }
    }
    if (this.fdK != null)
    {
      k localk = new k(i, "");
      this.elF.post(new e(this, localk));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.d
 * JD-Core Version:    0.6.2
 */