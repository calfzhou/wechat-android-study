package com.tencent.mm.sdk.f;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public abstract class am
{
  private int iGD = 0;
  private final Hashtable iGE = new Hashtable();
  private final HashSet iGF = new HashSet();

  private Vector aNQ()
  {
    try
    {
      Vector localVector = new Vector();
      localVector.addAll(this.iGE.keySet());
      return localVector;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void aNR()
  {
    Vector localVector = aNQ();
    if (localVector.size() <= 0)
      return;
    while (true)
    {
      Object localObject2;
      Object localObject4;
      synchronized (this.iGF)
      {
        ArrayList localArrayList = new ArrayList(this.iGF);
        this.iGF.clear();
        HashMap localHashMap = new HashMap();
        Iterator localIterator1 = localVector.iterator();
        continue;
        if (!localIterator1.hasNext())
          break;
        localObject2 = localIterator1.next();
        Object localObject3 = this.iGE.get(localObject2);
        Iterator localIterator2 = localArrayList.iterator();
        if (localIterator2.hasNext())
        {
          localObject4 = localIterator2.next();
          if ((localObject4 != null) && (localObject3 != null))
            if ((localObject3 instanceof Looper))
            {
              Looper localLooper = (Looper)localObject3;
              cm localcm = (cm)localHashMap.get(localLooper);
              if (localcm == null)
              {
                localcm = new cm(localLooper);
                localHashMap.put(localLooper, localcm);
              }
              localcm.post(new an(this, localObject2, localObject4));
            }
        }
      }
    }
  }

  public final void Bo()
  {
    if (this.iGD > 0);
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        aNR();
      return;
    }
  }

  public void a(Object paramObject, Looper paramLooper)
  {
    try
    {
      if (!this.iGE.containsKey(paramObject))
      {
        if (paramLooper == null)
          break label30;
        this.iGE.put(paramObject, paramLooper);
      }
      while (true)
      {
        return;
        label30: this.iGE.put(paramObject, new Object());
      }
    }
    finally
    {
    }
  }

  public final boolean ae(Object paramObject)
  {
    synchronized (this.iGF)
    {
      boolean bool = this.iGF.add(paramObject);
      return bool;
    }
  }

  protected abstract void e(Object paramObject1, Object paramObject2);

  public final void lock()
  {
    this.iGD = (1 + this.iGD);
  }

  public final void remove(Object paramObject)
  {
    try
    {
      this.iGE.remove(paramObject);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void removeAll()
  {
    try
    {
      this.iGE.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void unlock()
  {
    this.iGD = (-1 + this.iGD);
    if (this.iGD <= 0)
    {
      this.iGD = 0;
      aNR();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.am
 * JD-Core Version:    0.6.2
 */