package com.tencent.mm.n;

import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;
import java.util.Vector;

final class o
  implements p
{
  o(m paramm)
  {
  }

  public final void eX(String paramString)
  {
    Vector localVector1 = new Vector();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(m.a(this.dnm).size());
    arrayOfObject[2] = Integer.valueOf(m.a(this.dnm).size());
    z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "notifyChanged user:%s clonesize:%d watchers:%d", arrayOfObject);
    Vector localVector2 = new Vector();
    Vector localVector3 = m.a(this.dnm);
    for (int i = 0; ; i++)
    {
      try
      {
        if (i < m.a(this.dnm).size())
        {
          WeakReference localWeakReference = (WeakReference)m.a(this.dnm).get(i);
          if (localWeakReference == null)
            continue;
          p localp = (p)localWeakReference.get();
          if (localp != null)
            localVector2.add(localp);
          else
            localVector1.add(localWeakReference);
        }
      }
      finally
      {
      }
      m.a(this.dnm).removeAll(localVector1);
      for (int j = 0; j < localVector2.size(); j++)
        ((p)localVector2.get(j)).eX(paramString);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.o
 * JD-Core Version:    0.6.2
 */