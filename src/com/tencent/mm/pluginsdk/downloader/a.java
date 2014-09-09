package com.tencent.mm.pluginsdk.downloader;

import com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger;
import com.tencent.mm.pluginsdk.model.downloader.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private List dhZ = Collections.synchronizedList(new ArrayList());
  final n htz = new b(this);

  public a()
  {
    FileDownloadManger.a(this.htz);
  }

  public final void a(n paramn)
  {
    if (paramn != null)
    {
      Iterator localIterator = this.dhZ.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while ((n)((WeakReference)localIterator.next()).get() != paramn);
    }
    return;
    this.dhZ.add(new WeakReference(paramn));
  }

  public final void b(n paramn)
  {
    if (paramn != null)
    {
      Iterator localIterator = this.dhZ.iterator();
      while (localIterator.hasNext())
      {
        n localn = (n)((WeakReference)localIterator.next()).get();
        if (localn == null)
          localIterator.remove();
        else if (localn == paramn)
          localIterator.remove();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.a
 * JD-Core Version:    0.6.2
 */