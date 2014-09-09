package com.tencent.mm.sdk.platformtools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class af
{
  private static ah dhz;
  private static int iEl;
  private static Map iEp = new HashMap();
  private static boolean iEr = false;
  private static boolean iEs;
  private final boolean hyh;
  private final int iEm;
  private long iEn = 0L;
  private long iEo = 0L;
  private final ag iEq;

  public af(ag paramag)
  {
    Assert.assertTrue("bumper not initialized", iEr);
    this.iEq = paramag;
    this.hyh = true;
    if (iEl >= 8192)
      iEl = 0;
    int i = 1 + iEl;
    iEl = i;
    this.iEm = i;
  }

  public static void a(ah paramah)
  {
    iEr = true;
    dhz = paramah;
  }

  public static long aNs()
  {
    iEs = false;
    LinkedList localLinkedList = new LinkedList();
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(iEp.keySet());
    Iterator localIterator = localHashSet.iterator();
    long l1 = 9223372036854775807L;
    af localaf;
    long l3;
    if (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      localaf = (af)iEp.get(localInteger);
      if (localaf == null)
        break label276;
      l3 = ch.ad(localaf.iEn);
      if (l3 < 0L)
        l3 = 0L;
      if (l3 > localaf.iEo)
      {
        if ((!localaf.iEq.kJ()) || (!localaf.hyh))
          localLinkedList.add(localInteger);
        while (true)
        {
          localaf.iEn = ch.CN();
          break;
          l1 = localaf.iEo;
        }
      }
      if (localaf.iEo - l3 >= l1)
        break label276;
    }
    label276: for (long l2 = localaf.iEo - l3; ; l2 = l1)
    {
      l1 = l2;
      break;
      for (int i = 0; i < localLinkedList.size(); i++)
        iEp.remove(localLinkedList.get(i));
      if ((!iEs) && (l1 == 9223372036854775807L) && (dhz != null))
      {
        dhz.cancel();
        z.v("!32@/B4Tb64lLpIraIIYhljH18U8Zao9ShTz", "cancel bumper for no more handler");
      }
      return l1;
    }
  }

  public final void aNt()
  {
    iEs = true;
    this.iEo = 50000L;
    this.iEn = ch.CN();
    long l1 = this.iEo;
    z.d("!32@/B4Tb64lLpIraIIYhljH18U8Zao9ShTz", "check need prepare: check=" + l1);
    Iterator localIterator = iEp.entrySet().iterator();
    long l2 = 9223372036854775807L;
    af localaf;
    long l4;
    while (localIterator.hasNext())
    {
      localaf = (af)((Map.Entry)localIterator.next()).getValue();
      if (localaf == null)
        break label232;
      l4 = ch.ad(localaf.iEn);
      if (l4 < 0L)
        l4 = 0L;
      if (l4 > localaf.iEo)
        l2 = localaf.iEo;
      else
        if (localaf.iEo - l4 >= l2)
          break label232;
    }
    label232: for (long l3 = localaf.iEo - l4; ; l3 = l2)
    {
      l2 = l3;
      break;
      if (l2 > l1);
      for (int i = 1; ; i = 0)
      {
        aNu();
        iEp.put(Integer.valueOf(this.iEm), this);
        if ((dhz != null) && (i != 0))
        {
          z.v("!32@/B4Tb64lLpIraIIYhljH18U8Zao9ShTz", "prepare bumper");
          dhz.prepare();
        }
        return;
      }
    }
  }

  public final void aNu()
  {
    iEp.remove(Integer.valueOf(this.iEm));
  }

  protected final void finalize()
  {
    aNu();
    super.finalize();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.af
 * JD-Core Version:    0.6.2
 */