package com.tencent.mm.storage;

import com.tencent.mm.a.c;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

final class y
{
  protected final long iiv = 86400L;
  private x iiw = new x();

  public y()
  {
    byte[] arrayOfByte = c.b(bg.qW().pt() + "checkmsgid.ini", 0, -1);
    if (!ch.B(arrayOfByte));
    try
    {
      this.iiw.cI(arrayOfByte);
      if (aIN())
        aIM();
      return;
    }
    catch (IOException localIOException)
    {
      z.w("!32@/B4Tb64lLpIeyFFi+7ORKM25zAgrDjCa", "DelSvrIDs parse Error");
    }
  }

  private void a(int paramInt, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    if (paramLong1 == 0L)
      return;
    if (paramBoolean)
      aIN();
    int i = paramInt - (int)(paramLong2 / 86400L);
    switch (i)
    {
    default:
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.e("!32@/B4Tb64lLpIeyFFi+7ORKM25zAgrDjCa", "should not add to thease lists, dayIndex:%d", arrayOfObject);
    case 0:
    case 1:
    case 2:
    }
    while (paramBoolean)
    {
      aIM();
      return;
      this.iiw.iis.add(Long.valueOf(paramLong1));
      continue;
      this.iiw.iit.add(Long.valueOf(paramLong1));
      continue;
      this.iiw.iiu.add(Long.valueOf(paramLong1));
    }
  }

  private void aIM()
  {
    try
    {
      this.iiw.iir.clear();
      this.iiw.iiq.clear();
      this.iiw.iip.clear();
      byte[] arrayOfByte = this.iiw.toByteArray();
      c.a(bg.qW().pt() + "checkmsgid.ini", arrayOfByte, arrayOfByte.length);
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  private boolean aIN()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.iiw.iio);
    arrayOfObject[1] = Integer.valueOf(this.iiw.iis.size());
    arrayOfObject[2] = Integer.valueOf(this.iiw.iit.size());
    arrayOfObject[3] = Integer.valueOf(this.iiw.iiu.size());
    z.v("!32@/B4Tb64lLpIeyFFi+7ORKM25zAgrDjCa", "checkOldData todayIndex:%d, t0Size:%d, t1Size:%d, t2Size:%d", arrayOfObject);
    int i = (int)(ch.CL() / 86400L);
    int j = i - this.iiw.iio;
    this.iiw.iio = i;
    boolean bool = false;
    switch (j)
    {
    default:
      this.iiw.iiu.clear();
      this.iiw.iit.clear();
      this.iiw.iis.clear();
      bool = true;
    case 0:
      return bool;
    case 1:
      this.iiw.iiu = this.iiw.iit;
      this.iiw.iit = this.iiw.iis;
      this.iiw.iis.clear();
      return true;
    case 2:
    }
    this.iiw.iiu = this.iiw.iis;
    this.iiw.iit.clear();
    this.iiw.iis.clear();
    return true;
  }

  protected final void b(int paramInt, long paramLong1, long paramLong2)
  {
    a(paramInt, paramLong1, paramLong2, true);
  }

  protected final void c(List paramList1, List paramList2)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramList1.size());
    z.i("!32@/B4Tb64lLpIeyFFi+7ORKM25zAgrDjCa", "add size:%d", arrayOfObject);
    aIN();
    int i = (int)(ch.CL() / 86400L);
    for (int j = 0; j < paramList1.size(); j++)
      a(i, ((Integer)paramList1.get(j)).intValue(), ((Long)paramList2.get(j)).longValue(), false);
    aIM();
  }

  protected final boolean cU(long paramLong)
  {
    if (aIN())
      aIM();
    Long[] arrayOfLong1 = new Long[this.iiw.iis.size()];
    this.iiw.iis.toArray(arrayOfLong1);
    int i = arrayOfLong1.length;
    for (int j = 0; j < i; j++)
      if (arrayOfLong1[j].longValue() == paramLong)
        return true;
    Long[] arrayOfLong2 = new Long[this.iiw.iit.size()];
    this.iiw.iit.toArray(arrayOfLong2);
    int k = arrayOfLong2.length;
    for (int m = 0; ; m++)
    {
      if (m >= k)
        break label133;
      if (arrayOfLong2[m].longValue() == paramLong)
        break;
    }
    label133: Long[] arrayOfLong3 = new Long[this.iiw.iiu.size()];
    this.iiw.iiu.toArray(arrayOfLong3);
    int n = arrayOfLong3.length;
    for (int i1 = 0; ; i1++)
    {
      if (i1 >= n)
        break label195;
      if (arrayOfLong3[i1].longValue() == paramLong)
        break;
    }
    label195: return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.y
 * JD-Core Version:    0.6.2
 */