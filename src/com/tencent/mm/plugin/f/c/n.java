package com.tencent.mm.plugin.f.c;

import android.util.SparseBooleanArray;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.f.a.d;
import com.tencent.mm.plugin.f.a.f;
import com.tencent.mm.plugin.f.b.m;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.List;

public enum n
{
  private SparseBooleanArray fTG = new SparseBooleanArray();
  private c fTH;
  private bp fTI;

  static
  {
    n[] arrayOfn = new n[1];
    arrayOfn[0] = fTF;
  }

  private n()
  {
  }

  private void a(boolean paramBoolean, int paramInt, Object[] paramArrayOfObject)
  {
    if (this.fTH == null)
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(paramInt);
      z.w("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "getReportRuleHelper is null, ignore this report, kvStat logID=%d", arrayOfObject4);
      return;
    }
    if (!this.fTH.jp(1))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      z.w("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvstat report is close, ignore this report, kvStat logID=%d", arrayOfObject3);
      return;
    }
    f localf = new f();
    localf.jo(0);
    localf.ifI = paramInt;
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
    {
      z.w("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvStat vals is null, use '' as value");
      localf.ifH = "";
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      arrayOfObject1[1] = Integer.valueOf(0);
      arrayOfObject1[2] = localf.ifH;
      z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvStat logID=%d, frep = %d, vals.size=0, val = %s", arrayOfObject1);
    }
    while (true)
    {
      localf.hUm = ((int)ch.CL());
      localf.hUn = localf.hUm;
      k.a(localf, paramBoolean);
      e.a(paramInt, localf.hUm, localf.hUn, localf.ifH, false, false);
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      int i = -1 + paramArrayOfObject.length;
      for (int j = 0; j < i; j++)
        localStringBuilder.append(String.valueOf(paramArrayOfObject[j])).append(',');
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i]));
      localf.ifH = localStringBuilder.toString();
      Object[] arrayOfObject2 = new Object[4];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      arrayOfObject2[1] = Integer.valueOf(0);
      arrayOfObject2[2] = Integer.valueOf(paramArrayOfObject.length);
      arrayOfObject2[3] = localf.ifH;
      z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvStat logID=%d, frep = %d, vals.size=%d, val = %s", arrayOfObject2);
    }
  }

  private void afd()
  {
    z.i("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "doRemoveSceneEndListener");
    bg.qX().b(308, this.fTH);
    bg.qX().b(311, this.fTH);
    bg.qX().b(309, this.fTH);
    bg.qX().b(310, this.fTH);
  }

  private void afe()
  {
    if ((this.fTI == null) || (this.fTI.aNy()))
    {
      z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "check worker thread is null or is dead, new one");
      this.fTI = new bp(1, "Report-Manager");
    }
  }

  public static void d(Object[] paramArrayOfObject)
  {
    f localf = new f();
    localf.jo(0);
    localf.ifI = 11135;
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < 9; i++)
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i])).append(',');
    localStringBuilder.append(String.valueOf(paramArrayOfObject[9]));
    localf.ifH = localStringBuilder.toString();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(11135);
    arrayOfObject[1] = Integer.valueOf(0);
    arrayOfObject[2] = Integer.valueOf(10);
    arrayOfObject[3] = localf.ifH;
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvStat logID=%d, frep = %d, vals.size=%d, val = %s", arrayOfObject);
    localf.hUm = ((int)ch.CL());
    localf.hUn = localf.hUm;
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(localf);
    com.tencent.mm.plugin.f.b.o localo = new com.tencent.mm.plugin.f.b.o(localLinkedList);
    bg.qX().d(localo);
  }

  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    if (this.fTH == null)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      z.w("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "getReportRuleHelper is null, ignore this report, kvStat logID=%d", arrayOfObject3);
      return;
    }
    if (!this.fTH.jp(1))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      arrayOfObject2[1] = paramString;
      z.w("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvstat report is close, ignore this report, kvStat logID=%d, val=%s", arrayOfObject2);
      return;
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = paramString;
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvStat logID=%d, val=%s", arrayOfObject1);
    f localf = new f();
    localf.jo(0);
    localf.ifI = paramInt;
    localf.ifH = paramString;
    localf.hUm = ((int)ch.CL());
    localf.hUn = localf.hUm;
    k.a(localf, paramBoolean);
    e.a(paramInt, localf.hUm, localf.hUn, paramString, false, false);
  }

  public final void afc()
  {
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "clean up");
    afd();
    this.fTH = null;
    k.aeZ();
    k.afa();
  }

  final void aff()
  {
    if ((!bg.oE()) || (this.fTH == null))
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Boolean.valueOf(bg.oE());
      if (this.fTH == null);
      for (boolean bool = true; ; bool = false)
      {
        arrayOfObject1[1] = Boolean.valueOf(bool);
        z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "save all : MMCore.hasSetUin() = %B, getReportRuleHelper is null = %B", arrayOfObject1);
        return;
      }
    }
    long l = ch.CM();
    if (l - ch.a((Long)bg.qW().oQ().get(-1413405884), 0L) > 184320L)
    {
      afe();
      this.fTI.c(new p((byte)0));
      bg.qW().oQ().set(-1413405884, Long.valueOf(l));
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Long.valueOf(l);
      z.d("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "ask for save all ok, time = %d", arrayOfObject3);
      return;
    }
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(l);
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "ask for save all fail, time = %d", arrayOfObject2);
  }

  final void afg()
  {
    if (this.fTH != null)
    {
      z.i("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "doGetReportRule");
      if (!bg.oE())
        z.w("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "doGetReportRule error, has not set uin");
    }
    else
    {
      return;
    }
    long l1 = ch.CM();
    long l2 = ch.a((Long)bg.qW().oQ().get(-1413405883));
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(l1);
    arrayOfObject[1] = Long.valueOf(l2);
    arrayOfObject[2] = Long.valueOf(14400000L);
    z.i("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "now = %d, lastTimestamp = %d, cycle = %d", arrayOfObject);
    if (l1 - l2 > 14400000L)
    {
      z.i("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "time out do get report rule");
      bg.qW().oQ().set(-1413405883, Long.valueOf(l1));
      m localm = new m();
      bg.qX().d(localm);
      return;
    }
    z.d("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "min time limit, do not do get report rule");
  }

  final void aj(int paramInt1, int paramInt2)
  {
    if ((this.fTH == null) || (!this.fTH.jp(paramInt1)))
    {
      Object[] arrayOfObject1 = new Object[2];
      if (this.fTH == null);
      for (boolean bool = true; ; bool = false)
      {
        arrayOfObject1[0] = Boolean.valueOf(bool);
        arrayOfObject1[1] = Integer.valueOf(paramInt1);
        z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "report : getReportRuleHelper is null = %B, if not null, it will be close, type = %d", arrayOfObject1);
        return;
      }
    }
    if (!bg.oE())
    {
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Boolean.valueOf(bg.oE());
      z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "report : MMCore.hasSetUin() = %B", arrayOfObject5);
      return;
    }
    long l1 = ch.CM();
    long l2 = ch.a((Long)bg.qW().oQ().get(paramInt2), 0L);
    long l3 = this.fTH.jq(paramInt1);
    Object[] arrayOfObject2 = new Object[4];
    arrayOfObject2[0] = Integer.valueOf(paramInt1);
    arrayOfObject2[1] = Long.valueOf(l1);
    arrayOfObject2[2] = Long.valueOf(l2);
    arrayOfObject2[3] = Long.valueOf(l3);
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "check report : logType = %d, now = %d, lastTimestamp = %d, cycle = %d", arrayOfObject2);
    if (l1 - l2 > l3)
    {
      afe();
      this.fTI.c(new o(paramInt1));
      bg.qW().oQ().set(paramInt2, Long.valueOf(l1));
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = Long.valueOf(l1);
      arrayOfObject4[1] = Integer.valueOf(paramInt1);
      z.d("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "ask for report ok, time = %d, logType = %d", arrayOfObject4);
      return;
    }
    Object[] arrayOfObject3 = new Object[2];
    arrayOfObject3[0] = Long.valueOf(l1);
    arrayOfObject3[1] = Integer.valueOf(paramInt1);
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "ask for report fail, time = %d, logType = %d", arrayOfObject3);
  }

  public final void bA(long paramLong)
  {
    j.e(8, paramLong);
    this.fTG.put(8, true);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(8);
    arrayOfObject[1] = Long.valueOf(8L);
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "operationBegin eventID = %d, beginMark=%d", arrayOfObject);
    d locald = new d();
    locald.hUh = 8;
    locald.hUm = ((int)(paramLong / 1000L));
    locald.hUn = locald.hUm;
    locald.by(paramLong);
    locald.bz(locald.aeO());
    locald.bx(8L);
    locald.bO(true);
    locald.bP(false);
    k.a(locald, false);
  }

  public final void c(int paramInt, List paramList)
  {
    if (this.fTH == null)
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(paramInt);
      z.w("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "getReportRuleHelper is null, ignore this report, kvStat logID=%d", arrayOfObject4);
      return;
    }
    if (!this.fTH.jp(1))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      z.w("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvstat report is close, ignore this report, kvStat logID=%d", arrayOfObject3);
      return;
    }
    f localf = new f();
    localf.jo(0);
    localf.ifI = paramInt;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      z.w("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvStat vals is null, use '' as value");
      localf.ifH = "";
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      arrayOfObject1[1] = Integer.valueOf(0);
      arrayOfObject1[2] = localf.ifH;
      z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvStat logID=%d, frep = %d, vals.size=0, val = %s", arrayOfObject1);
    }
    while (true)
    {
      localf.hUm = ((int)ch.CL());
      localf.hUn = localf.hUm;
      k.a(localf, false);
      e.a(paramInt, localf.hUm, localf.hUn, localf.ifH, false, false);
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      int i = -1 + paramList.size();
      for (int j = 0; j < i; j++)
        localStringBuilder.append((String)paramList.get(j)).append(',');
      localStringBuilder.append((String)paramList.get(i));
      localf.ifH = localStringBuilder.toString();
      Object[] arrayOfObject2 = new Object[4];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      arrayOfObject2[1] = Integer.valueOf(0);
      arrayOfObject2[2] = Integer.valueOf(paramList.size());
      arrayOfObject2[3] = localf.ifH;
      z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "kvStat logID=%d, frep = %d, vals.size=%d, val = %s", arrayOfObject2);
    }
  }

  public final void d(int paramInt, Object[] paramArrayOfObject)
  {
    a(false, paramInt, paramArrayOfObject);
  }

  public final void e(int paramInt, Object[] paramArrayOfObject)
  {
    a(true, paramInt, paramArrayOfObject);
  }

  public final void init()
  {
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "init begin");
    this.fTH = new c();
    afd();
    z.i("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "doAddSceneEndListener");
    bg.qX().a(308, this.fTH);
    bg.qX().a(311, this.fTH);
    bg.qX().a(309, this.fTH);
    bg.qX().a(310, this.fTH);
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "init end");
  }

  public final void js(int paramInt)
  {
    j.js(paramInt);
    if (this.fTH == null);
    while (!this.fTH.jp(0))
      return;
    long l = paramInt;
    this.fTG.put(paramInt, true);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Long.valueOf(l);
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "operationBegin eventID = %d, beginMark=%d", arrayOfObject);
    d locald = new d();
    locald.hUh = paramInt;
    locald.hUm = ((int)ch.CL());
    locald.hUn = locald.hUm;
    locald.by(ch.CM());
    locald.bz(locald.aeO());
    locald.bx(l);
    locald.bO(true);
    locald.bP(false);
    k.a(locald, false);
  }

  public final void jt(int paramInt)
  {
    j.jt(paramInt);
    if (this.fTH == null);
    long l;
    do
    {
      do
        return;
      while (!this.fTH.jp(0));
      l = paramInt;
    }
    while (!this.fTG.get(paramInt));
    this.fTG.put(paramInt, false);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Long.valueOf(l);
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "operationEnd eventID = %d, beginMark=%d", arrayOfObject);
    d locald = new d();
    locald.hUh = paramInt;
    locald.hUm = ((int)ch.CL());
    locald.hUn = locald.hUm;
    locald.by(ch.CM());
    locald.bz(locald.aeO());
    locald.bx(l);
    locald.bO(false);
    locald.bP(false);
    k.a(locald, false);
  }

  public final void jw(int paramInt)
  {
    j.ju(paramInt);
    if (this.fTH == null);
    while (!this.fTH.jp(0))
      return;
    long l = paramInt;
    this.fTG.put(paramInt, false);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Long.valueOf(l);
    z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "stop operation timer eventID = %d, beginMark=%d", arrayOfObject);
    d locald = new d();
    locald.hUh = paramInt;
    locald.bx(l);
    locald.bO(false);
    locald.bP(true);
    k.a(locald, false);
  }

  public final void q(int paramInt, String paramString)
  {
    a(false, paramInt, paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.n
 * JD-Core Version:    0.6.2
 */