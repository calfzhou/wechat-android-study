package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class bt
{
  private final ay dHm;
  private volatile boolean fhM = false;
  private final ae iFq;
  private final LinkedHashMap iFr = new LinkedHashMap();
  private final by iFs;
  private final ay iFt;
  private final long iFu;
  private final long iFv;
  private boolean iFw = true;
  private final long threshold;

  public bt(by paramby, Looper paramLooper, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    if (paramby == null)
      throw new IllegalArgumentException("arg appender can not be null!");
    if (paramLooper == null)
      throw new IllegalArgumentException("arg looper can not be null!");
    if (paramInt1 <= 0)
      throw new IllegalArgumentException("arg size can not be <= 0!");
    this.iFs = paramby;
    this.iFq = new ae(paramInt1);
    long l;
    if (paramInt2 > 0)
    {
      l = paramInt2;
      this.threshold = l;
      if (paramLong1 <= 0L)
        break label188;
      label107: this.iFu = paramLong1;
      if (paramLong2 <= 0L)
        break label196;
    }
    while (true)
    {
      this.iFv = paramLong2;
      this.dHm = new ay(paramLooper, new bu(this), false);
      this.iFt = new ay(new am("RWCache_timeoutChecker").getLooper(), new bv(this), false);
      return;
      l = 40L;
      break;
      label188: paramLong1 = 60000L;
      break label107;
      label196: paramLong2 = 60000L;
    }
  }

  public final void clear()
  {
    try
    {
      this.iFq.trimToSize(-1);
      this.iFr.clear();
      this.dHm.aNu();
      this.iFt.aNu();
      this.fhM = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void en(boolean paramBoolean)
  {
    z.i("!32@/B4Tb64lLpKVcgwO/AJ6cRDJPmRljB7e", "summer appendAll force: " + paramBoolean + " tid: " + Thread.currentThread().getId() + " holderMap size: " + this.iFr.size());
    try
    {
      this.iFw = true;
      if (this.iFr.isEmpty())
        return;
      if (!this.iFs.Ag())
        return;
    }
    finally
    {
    }
    Iterator localIterator = this.iFr.entrySet().iterator();
    if (paramBoolean)
      while (localIterator.hasNext())
      {
        this.iFs.a((bx)((Map.Entry)localIterator.next()).getValue());
        localIterator.remove();
      }
    this.fhM = false;
    this.iFt.cP(this.iFv);
    while ((!this.fhM) && (localIterator.hasNext()))
    {
      this.iFs.a((bx)((Map.Entry)localIterator.next()).getValue());
      localIterator.remove();
    }
    this.iFt.aNu();
    this.iFs.Ah();
  }

  public final boolean f(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
      throw new NullPointerException("key == null");
    bw localbw1 = (bw)this.iFq.get(paramObject1);
    bw localbw2 = new bw(paramObject2);
    if (localbw2.equals(localbw1))
      return false;
    this.iFq.put(paramObject1, localbw2);
    bx localbx = new bx();
    localbx.IO = paramObject1;
    localbx.values = paramObject2;
    int i;
    if (paramObject2 == null)
    {
      i = 2;
      localbx.igg = i;
    }
    while (true)
    {
      try
      {
        this.iFr.put(paramObject1, localbx);
        if ((!this.iFw) || (this.iFr.size() <= this.threshold))
          break label159;
        this.dHm.cP(0L);
        this.iFw = false;
        return true;
      }
      finally
      {
      }
      i = 1;
      break;
      label159: if (this.dHm.aNx())
        this.dHm.cP(this.iFu);
    }
  }

  public final Object get(Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException("key == null");
    bw localbw = (bw)this.iFq.get(paramObject);
    if (localbw != null)
      return localbw.iFy;
    this.iFq.put(paramObject, new bw(null));
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bt
 * JD-Core Version:    0.6.2
 */