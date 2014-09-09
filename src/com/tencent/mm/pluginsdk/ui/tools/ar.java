package com.tencent.mm.pluginsdk.ui.tools;

import java.util.HashMap;

abstract class ar
{
  private final int hLJ;
  private HashMap hLP;
  private as hLQ;
  private as hLR;
  private int hLS;

  public ar(ag paramag, int paramInt)
  {
    this.hLJ = Math.max(1, paramInt);
    this.hLP = new HashMap();
    this.hLQ = new as(this);
    this.hLR = new as(this);
    this.hLQ.hLU = this.hLR;
    this.hLR.hLT = this.hLQ;
    this.hLS = 0;
  }

  private void a(as paramas)
  {
    paramas.hLU = this.hLQ.hLU;
    paramas.hLU.hLT = paramas;
    this.hLQ.hLU = paramas;
    paramas.hLT = this.hLQ;
  }

  private static void b(as paramas)
  {
    paramas.hLT.hLU = paramas.hLU;
    paramas.hLU.hLT = paramas.hLT;
    paramas.hLU = null;
    paramas.hLT = null;
  }

  protected abstract void ab(Object paramObject);

  public final void clear()
  {
    while (this.hLS > 0)
    {
      as localas = this.hLR.hLT;
      b(localas);
      this.hLP.remove(localas.IO);
      ab(localas.IP);
      this.hLS = (-1 + this.hLS);
    }
  }

  public final Object get(Object paramObject)
  {
    try
    {
      as localas = (as)this.hLP.get(paramObject);
      if (localas != null)
      {
        b(localas);
        a(localas);
        Object localObject2 = localas.IP;
        return localObject2;
      }
      return null;
    }
    finally
    {
    }
  }

  public final Object put(Object paramObject1, Object paramObject2)
  {
    try
    {
      as localas1 = (as)this.hLP.get(paramObject1);
      if (localas1 != null)
      {
        b(localas1);
        Object localObject2 = localas1.IP;
        localas1.IP = paramObject2;
        a(localas1);
        return localObject2;
      }
      as localas2 = new as(this, paramObject1, paramObject2);
      a(localas2);
      this.hLP.put(paramObject1, localas2);
      for (this.hLS = (1 + this.hLS); this.hLJ < this.hLS; this.hLS = (-1 + this.hLS))
      {
        as localas3 = this.hLR.hLT;
        b(localas3);
        this.hLP.remove(localas3.IO);
        ab(localas3.IP);
      }
    }
    finally
    {
    }
    return null;
  }

  public String toString()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      for (as localas = this.hLQ.hLU; localas != this.hLR; localas = localas.hLU)
        localStringBuilder.append("[key:").append(localas.IO).append(", value:").append(localas.IP).append("]");
      String str = localStringBuilder.toString();
      return str;
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.ar
 * JD-Core Version:    0.6.2
 */