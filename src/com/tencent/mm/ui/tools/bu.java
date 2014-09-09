package com.tencent.mm.ui.tools;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class bu
{
  private String cEh;
  private int eeP;
  private cm gQj = new cm();
  private List hpV;
  private int jQU;
  private int jQV;
  protected boolean jQW = false;
  protected int jQX;
  protected int jQY;
  protected int jQZ;
  protected long jRa;
  private bt jRb;
  public HashMap jRc = new HashMap();
  public HashMap jRd = new HashMap();

  public bu(long paramLong, String paramString, bt parambt)
  {
    this.cEh = paramString;
    this.hpV = new LinkedList();
    this.jRb = parambt;
    ar localar = bg.qW().oV().cV(paramLong);
    if (localar.kk() == 0L)
    {
      Assert.assertTrue("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46 <init>, currentMsg does not exist, currentMsgId = " + paramLong + ", stack = " + ch.aHN(), false);
      return;
    }
    this.hpV.add(localar);
    bg.qQ().n(new bv(this, paramLong, parambt));
  }

  private void bm(List paramList)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
      if (bt.ac((ar)paramList.get(i)))
      {
        localArrayList1.add(Long.valueOf(((ar)paramList.get(i)).kl()));
        if (((ar)paramList.get(i)).jK() == 1)
          localArrayList2.add(Long.valueOf(((ar)paramList.get(i)).kk()));
      }
    this.jRc.putAll(ap.yg().a((Long[])localArrayList1.toArray(new Long[0])));
    this.jRd.putAll(ap.yg().b((Long[])localArrayList2.toArray(new Long[0])));
  }

  private void h(long paramLong, boolean paramBoolean)
  {
    z.i("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46", "start loadMsgInfo, currentMsgId = " + paramLong + ", forward = " + paramBoolean);
    List localList = bg.qW().oV().c(this.cEh, paramLong, paramBoolean);
    if ((localList == null) || (localList.size() == 0))
    {
      z.w("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46", "loadMsgInfo fail, addedMsgList is null, forward = " + paramBoolean);
      return;
    }
    z.i("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46", "loadMsgInfo done, new added list, size = " + localList.size() + ", forward = " + paramBoolean);
    long l = System.currentTimeMillis();
    bm(localList);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
    z.i("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46", "loadImgInfo spent : %s", arrayOfObject);
    if (paramBoolean)
    {
      this.hpV.addAll(localList);
      return;
    }
    this.hpV.addAll(0, localList);
    this.jQU -= localList.size();
    if (this.jQU < 0)
    {
      z.e("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46", "loadMsgInfo fail, min should not be minus, min = " + this.jQU);
      return;
    }
    z.i("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46", "min from " + (this.jQU + localList.size()) + " to " + this.jQU);
  }

  public final int Us()
  {
    return 1 + (100000 + (this.eeP - this.jQV));
  }

  public final int aPA()
  {
    return this.eeP;
  }

  public final int qW(int paramInt)
  {
    return paramInt - 100000 + this.jQV;
  }

  public final ar qX(int paramInt)
  {
    int i = qW(paramInt);
    int j = -1 + (this.jQU + this.hpV.size());
    ar localar;
    if ((i < this.jQU) || (i > j))
    {
      z.e("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46", "get, invalid pos " + i + ", min = " + this.jQU + ", max = " + j);
      localar = null;
    }
    do
    {
      do
      {
        return localar;
        z.d("!32@/B4Tb64lLpLT/XXrlQGkNC01J8nNff46", "get, pos = " + i);
        if (i != this.jQU)
          break;
        localar = (ar)this.hpV.get(0);
      }
      while (!this.jQW);
      h(localar.kk(), false);
      return localar;
      if ((i != j) || (j >= -1 + this.eeP))
        break;
      localar = (ar)this.hpV.get(-1 + this.hpV.size());
    }
    while (!this.jQW);
    h(localar.kk(), true);
    return localar;
    return (ar)this.hpV.get(i - this.jQU);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AutoList, Size = " + this.hpV.size());
    localStringBuilder.append("; Content = {");
    Iterator localIterator = this.hpV.iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(((ar)localIterator.next()).kk());
      localStringBuilder.append(",");
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bu
 * JD-Core Version:    0.6.2
 */