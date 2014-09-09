package com.tencent.mm.plugin.f.c;

import android.util.SparseArray;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.f.a.e;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  implements m
{
  public static final int dmp = i;
  public static final int dmq = i + 1;
  public static final int dmr = 2 + dmp;
  private static com.tencent.mm.plugin.f.a.g fTu = null;
  private SparseArray fTt = new SparseArray();
  g fTv = new h(1800L);
  g fTw = new h(3600L);
  g fTx = new h(86400L);
  g fTy = new h(-9223372036854775808L);
  private Object lock = new Object();

  static
  {
    int i = "kv_key_start".hashCode();
  }

  public f()
  {
    this.fTt.put(10222, this.fTy);
    this.fTt.put(10221, this.fTy);
    this.fTt.put(10259, this.fTy);
    this.fTt.put(9, this.fTy);
    this.fTt.put(10, this.fTy);
    this.fTt.put(10090, this.fTy);
    this.fTt.put(10170, this.fTy);
    this.fTt.put(10169, this.fTy);
    this.fTt.put(10108, this.fTy);
    this.fTt.put(10109, this.fTy);
    this.fTt.put(10110, this.fTy);
    this.fTt.put(10111, this.fTy);
    this.fTt.put(dmq, this.fTw);
    this.fTt.put(dmr, this.fTw);
    this.fTt.put(24, this.fTw);
    this.fTt.put(26, this.fTw);
    this.fTt.put(10071, this.fTx);
    this.fTt.put(10076, this.fTw);
    this.fTt.put(19, this.fTx);
    this.fTt.put(10112, this.fTv);
    this.fTt.put(10113, this.fTv);
    this.fTt.put(10114, this.fTv);
    this.fTt.put(10115, this.fTv);
    this.fTt.put(10240, this.fTv);
    this.fTt.put(10241, this.fTv);
    this.fTt.put(15, this.fTv);
    this.fTt.put(16, this.fTv);
    this.fTt.put(27, this.fTw);
    this.fTt.put(38, this.fTv);
  }

  static com.tencent.mm.plugin.f.a.f a(com.tencent.mm.plugin.f.a.g paramg, com.tencent.mm.plugin.f.a.f paramf)
  {
    if ((paramg == null) || (paramf == null))
    {
      z.w("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "get item error, list or info is null");
      return null;
    }
    Iterator localIterator = paramg.fST.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.f.a.f localf = (com.tencent.mm.plugin.f.a.f)localIterator.next();
      if (localf.aew() == paramf.aew())
        return localf;
    }
    return null;
  }

  private static String aeT()
  {
    if (bg.oE())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = bg.qW().pq();
      arrayOfObject[1] = com.tencent.mm.a.f.d("__file_kvstat__".getBytes());
      return String.format("%s/%s", arrayOfObject);
    }
    return "";
  }

  static com.tencent.mm.plugin.f.a.g bQ(boolean paramBoolean)
  {
    Object localObject;
    if (fTu != null)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(fTu.fSK);
      z.v("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "memlist not null, size is %d", arrayOfObject3);
      localObject = fTu;
      return localObject;
    }
    String str = aeT();
    z.d("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "history file name = %s", new Object[] { str });
    byte[] arrayOfByte = ch.oE(str);
    Object[] arrayOfObject1 = new Object[1];
    boolean bool;
    if (arrayOfByte == null)
    {
      bool = true;
      arrayOfObject1[0] = Boolean.valueOf(bool);
      z.d("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "history data is null ? %B", arrayOfObject1);
      if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
        break label213;
    }
    while (true)
    {
      try
      {
        com.tencent.mm.plugin.f.a.g localg = new com.tencent.mm.plugin.f.a.g().am(arrayOfByte);
        localObject = localg;
        if (localObject == null)
          localObject = new com.tencent.mm.plugin.f.a.g();
        fTu = (com.tencent.mm.plugin.f.a.g)localObject;
        if ((!paramBoolean) || (q.pV(str)))
          break;
        ch.deleteFile(str);
        return localObject;
        bool = false;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = str;
        arrayOfObject2[1] = localException.getMessage();
        z.e("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "parse data, from %s error:%s", arrayOfObject2);
        if (!q.pV(str))
          ch.deleteFile(str);
        localObject = null;
        continue;
      }
      label213: localObject = null;
    }
  }

  public final x aeS()
  {
    LinkedList localLinkedList;
    synchronized (this.lock)
    {
      com.tencent.mm.plugin.f.a.g localg = bQ(true);
      fTu = new com.tencent.mm.plugin.f.a.g();
      if ((localg != null) && (localg.fSK > 0))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(localg.fSK);
        z.v("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "kvList.size is %d", arrayOfObject);
        localLinkedList = new LinkedList();
        Iterator localIterator = localg.fST.iterator();
        if (localIterator.hasNext())
          localLinkedList.add((com.tencent.mm.plugin.f.a.f)localIterator.next());
      }
    }
    z.d("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "kvList.size is 0, return null");
    return null;
  }

  public final int b(e parame)
  {
    if ((parame == null) || (parame.getType() != 1))
      return 0;
    com.tencent.mm.plugin.f.a.f localf = (com.tencent.mm.plugin.f.a.f)parame;
    int i = localf.ifI;
    switch (localf.aeP())
    {
    default:
      this.fTt.put(i, this.fTy);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      g localg = (g)this.fTt.get(localf.ifI);
      if (localg == null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(localf.ifI);
        z.w("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "logID = %d, handler is null, use recordNow handler", arrayOfObject);
        localg = this.fTy;
      }
      synchronized (this.lock)
      {
        g.a(localg, localf);
        return 1;
        this.fTt.put(i, this.fTx);
        continue;
        this.fTt.put(i, this.fTw);
        continue;
        this.fTt.put(i, this.fTv);
      }
    }
  }

  public final void clear()
  {
    synchronized (this.lock)
    {
      fTu = null;
      return;
    }
  }

  public final void save()
  {
    synchronized (this.lock)
    {
      com.tencent.mm.plugin.f.a.g localg = fTu;
      if (localg != null);
      try
      {
        z.v("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "kvList = %s", new Object[] { localg });
        String str = aeT();
        z.v("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "history file name = %s", new Object[] { str });
        if (localg.fSK > 0)
        {
          ch.f(str, localg.toByteArray());
          z.d("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "save kvstat list ok!");
        }
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(localg.fSK);
        z.v("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "list size is %d", arrayOfObject2);
        return;
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localIOException.getMessage();
          z.w("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "save data error:%s", arrayOfObject1);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.f
 * JD-Core Version:    0.6.2
 */