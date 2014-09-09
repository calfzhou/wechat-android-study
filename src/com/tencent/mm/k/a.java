package com.tencent.mm.k;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
{
  private static a dQa;
  private f dQb = new f();
  private ArrayList dQc = new ArrayList();
  private boolean dQd = false;
  private final int dQe = 0;
  private final int dQf = 1;
  private cm gQj = new b(this, Looper.getMainLooper());

  public static a Ci()
  {
    if (dQa == null)
      dQa = new a();
    return dQa;
  }

  private void a(int paramInt1, int paramInt2, String paramString)
  {
    if (!this.dQd)
    {
      z.d("!32@/B4Tb64lLpJXpLk432Vuc3N3W2/crXoA", "updateDataSource NewBandage has not initialized");
      return;
    }
    this.dQb.b(paramInt1, paramInt2, paramString);
    this.gQj.sendMessage(this.gQj.obtainMessage(0, new d(this, paramInt1, paramInt2, paramString)));
  }

  private static int parseInt(String paramString)
  {
    if (ch.jb(paramString))
      return 0;
    return ch.xy(paramString);
  }

  public final void K(int paramInt1, int paramInt2)
  {
    if (!this.dQd)
    {
      z.d("!32@/B4Tb64lLpJXpLk432Vuc3N3W2/crXoA", "markRead NewBandage has not initialized");
      return;
    }
    this.dQb.L(paramInt1, paramInt2);
    this.gQj.sendMessage(this.gQj.obtainMessage(1, new e(this, paramInt2, paramInt1)));
  }

  public final void a(c paramc)
  {
    if (!this.dQd)
    {
      z.d("!32@/B4Tb64lLpJXpLk432Vuc3N3W2/crXoA", "addWatch NewBandage has not initialized");
      return;
    }
    this.dQc.add(new WeakReference(paramc));
  }

  public final void b(c paramc)
  {
    if (!this.dQd)
      z.d("!32@/B4Tb64lLpJXpLk432Vuc3N3W2/crXoA", "removeWatch NewBandage has not initialized");
    ArrayList localArrayList;
    do
    {
      return;
      localArrayList = null;
      for (int i = 0; i < this.dQc.size(); i++)
      {
        WeakReference localWeakReference2 = (WeakReference)this.dQc.get(i);
        if ((localWeakReference2 == null) || (localWeakReference2.get() == null) || (localWeakReference2.get() == paramc))
        {
          if (localArrayList == null)
            localArrayList = new ArrayList();
          localArrayList.add(localWeakReference2);
        }
      }
    }
    while (localArrayList == null);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference1 = (WeakReference)localIterator.next();
      this.dQc.remove(localWeakReference1);
    }
    localArrayList.clear();
  }

  public final boolean cC(int paramInt)
  {
    g localg = this.dQb.ej(paramInt);
    if (localg == null);
    while (parseInt(localg.value) == 0)
      return false;
    return true;
  }

  public final void clear()
  {
    this.dQc.clear();
    this.dQb.clear();
    this.dQd = false;
  }

  public final void d(int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean);
    for (String str = "0"; ; str = "1")
    {
      a(paramInt, 1, str);
      return;
    }
  }

  public final void g(int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean);
    for (String str = "0"; ; str = "1")
    {
      a(paramInt, 2, str);
      return;
    }
  }

  public final void init()
  {
    this.dQd = true;
    this.dQb.init();
  }

  public final boolean t(int paramInt1, int paramInt2)
  {
    if (!this.dQd)
      z.d("!32@/B4Tb64lLpJXpLk432Vuc3N3W2/crXoA", "hasNew NewBandage has not initialized");
    g localg;
    do
    {
      return false;
      localg = this.dQb.g(paramInt1, paramInt2, 1);
    }
    while ((localg == null) || (parseInt(localg.value) == 0));
    return true;
  }

  public final boolean u(int paramInt1, int paramInt2)
  {
    if (!this.dQd)
      z.d("!32@/B4Tb64lLpJXpLk432Vuc3N3W2/crXoA", "hasDot NewBandage has not initialized");
    g localg;
    do
    {
      return false;
      localg = this.dQb.g(paramInt1, paramInt2, 2);
    }
    while ((localg == null) || (parseInt(localg.value) == 0));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.k.a
 * JD-Core Version:    0.6.2
 */