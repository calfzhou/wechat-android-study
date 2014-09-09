package com.tencent.mm.model;

import com.tencent.mm.protocal.a.qc;
import com.tencent.mm.protocal.a.qd;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class cx
{
  public static final int dmp = i;
  public static final int dmq = i + 1;
  public static final int dmr = 2 + dmp;
  private static cx dmu;
  private long dms = 0L;
  private Map dmt = new HashMap();

  static
  {
    int i = "kv_key_start".hashCode();
  }

  private cx()
  {
    this.dmt.put(Integer.valueOf(dmq), new cy(this));
    this.dmt.put(Integer.valueOf(dmr), new dj(this));
    this.dmt.put(Integer.valueOf(24), new dn(this));
    this.dmt.put(Integer.valueOf(25), new do(this));
    this.dmt.put(Integer.valueOf(26), new dp(this));
    this.dmt.put(Integer.valueOf(10071), new dq(this));
    this.dmt.put(Integer.valueOf(10076), new dr(this));
    this.dmt.put(Integer.valueOf(19), new ds(this));
    this.dmt.put(Integer.valueOf(10112), new dt(this));
    this.dmt.put(Integer.valueOf(10113), new cz(this));
    this.dmt.put(Integer.valueOf(10114), new da(this));
    this.dmt.put(Integer.valueOf(10115), new db(this));
    this.dmt.put(Integer.valueOf(10240), new dc(this));
    this.dmt.put(Integer.valueOf(10241), new dd(this));
    this.dmt.put(Integer.valueOf(15), new de(this));
    this.dmt.put(Integer.valueOf(16), new df(this));
    this.dmt.put(Integer.valueOf(27), new dg(this));
    this.dmt.put(Integer.valueOf(38), new dh(this));
    this.dmt.put(Integer.valueOf(10090), new di(this));
    this.dmt.put(Integer.valueOf(10237), new dk(this));
    this.dmt.put(Integer.valueOf(10238), new dl(this));
    this.dmt.put(Integer.valueOf(10239), new dm(this));
  }

  private static void a(cw paramcw)
  {
    if ((paramcw != null) && (bg.qW() != null) && (bg.oE()) && (bg.qW().oQ() != null) && (!bg.rd()));
    try
    {
      bg.qW().oQ().set(8215, ch.cH(paramcw.toByteArray()));
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static void a(LinkedList paramLinkedList)
  {
    qd localqd;
    if ((bg.oE()) && (!bg.rd()))
    {
      localqd = new qd();
      localqd.hQc = paramLinkedList;
      localqd.huF = paramLinkedList.size();
    }
    try
    {
      bg.qW().oS().a(new com.tencent.mm.storage.bg(36, localqd.toByteArray()));
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static void g(int paramInt, String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    qc localqc = new qc();
    localqc.hPS = paramInt;
    localqc.ifH = paramString;
    localLinkedList.add(localqc);
    a(localLinkedList);
  }

  public static cx rV()
  {
    if (dmu == null)
      dmu = new cx();
    return dmu;
  }

  private static cw rX()
  {
    if ((bg.qW() != null) && (bg.oE()) && (!bg.rd()) && (bg.qW().oQ() != null))
    {
      byte[] arrayOfByte = ch.jg((String)bg.qW().oQ().get(8215));
      if (arrayOfByte.length <= 0)
        return new cw();
      try
      {
        cw localcw = new cw();
        localcw.o(arrayOfByte);
        return localcw;
      }
      catch (IOException localIOException)
      {
      }
    }
    return new cw();
  }

  public final void a(int paramInt, Object[] paramArrayOfObject)
  {
    du localdu = (du)this.dmt.get(Integer.valueOf(paramInt));
    if (localdu == null)
      return;
    cw localcw = rX();
    Iterator localIterator = localcw.dmo.iterator();
    while (localIterator.hasNext())
    {
      cv localcv = (cv)localIterator.next();
      if (localcv.key == paramInt)
        localdu.a(localcv, paramArrayOfObject);
    }
    while (true)
    {
      a(localcw);
      return;
      localcw.dmo.add(localdu.b(paramInt, paramArrayOfObject));
    }
  }

  public final void rW()
  {
    if (System.currentTimeMillis() - this.dms < 60000L)
      return;
    this.dms = System.currentTimeMillis();
    while (true)
    {
      try
      {
        cw localcw = rX();
        i = 0;
        Iterator localIterator = localcw.dmo.iterator();
        if (localIterator.hasNext())
        {
          cv localcv = (cv)localIterator.next();
          du localdu = (du)this.dmt.get(Integer.valueOf(localcv.key));
          if ((localdu != null) && (localdu.a(localcv)))
          {
            j = 1;
            break label119;
          }
        }
        else
        {
          if (i == 0)
            break;
          a(localcw);
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      int j = i;
      label119: int i = j;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cx
 * JD-Core Version:    0.6.2
 */