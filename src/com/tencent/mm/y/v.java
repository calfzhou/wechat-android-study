package com.tencent.mm.y;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public final class v
  implements m, com.tencent.mm.o.n
{
  private static Set dxS = new HashSet();
  private LinkedList dxT = new LinkedList();
  private aa dxU = null;
  private boolean dxV = false;
  private am dxW = new w(this);
  private Queue dxX = new LinkedList();
  private int dxY = 0;
  private long dxZ = 0L;
  private boolean dya = false;
  com.tencent.mm.compatible.g.l dyb = new com.tencent.mm.compatible.g.l();
  private ay dyc = new ay(bg.qQ().getLooper(), new z(this), false);
  private boolean tm = false;

  public v()
  {
    if (bg.qX() != null)
      bg.qX().a(110, this);
    this.dxT.clear();
    this.dxV = false;
  }

  public static boolean dV(int paramInt)
  {
    return dxS.add(Integer.valueOf(paramInt));
  }

  public static boolean dW(int paramInt)
  {
    return dxS.remove(Integer.valueOf(paramInt));
  }

  public static void dX(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpItZQqBsJlKfJDbcgjEYBqK", "setImgError, %d", arrayOfObject);
    l locall1 = ap.yg().dT(paramInt);
    if (locall1.xM() <= 0L);
    while (true)
    {
      return;
      l locall2 = ap.yg().dU((int)locall1.xM());
      if (locall2 != null)
      {
        locall2.setStatus(-1);
        locall2.db(264);
        ap.yg().a((int)locall2.xM(), locall2);
      }
      for (ar localar = bg.qW().oV().cV(locall2.xL()); localar.kk() == locall1.xL(); localar = bg.qW().oV().cV(locall1.xL()))
      {
        localar.setStatus(5);
        bg.qW().oV().a((int)localar.kk(), localar);
        return;
        locall1.setStatus(-1);
        locall1.db(264);
        ap.yg().a(paramInt, locall1);
      }
    }
  }

  private void xW()
  {
    this.dxX.clear();
    this.tm = false;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpItZQqBsJlKfJDbcgjEYBqK", "Finish service use time(ms):" + this.dyb.nM());
  }

  public final void a(int paramInt1, int paramInt2, com.tencent.mm.o.x paramx)
  {
    ag localag = (ag)paramx;
    if ((this.dxU != null) && (localag != null) && (localag.yc() != null))
      this.dxU.a(localag.yc().kk(), paramInt1, paramInt2);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    aa localaa;
    long l;
    if ((paramx instanceof ag))
    {
      ag localag = (ag)paramx;
      if ((this.dxU != null) && (localag != null) && (localag.yc() != null))
      {
        localaa = this.dxU;
        l = localag.yc().kk();
        if (localag.yc().getStatus() == 5)
          break label95;
      }
    }
    label95: for (boolean bool = true; ; bool = false)
    {
      localaa.a(l, bool);
      bg.qQ().n(new x(this, paramx));
      return;
    }
  }

  public final void a(int paramInt1, String paramString1, String paramString2, ArrayList paramArrayList, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (com.tencent.mm.model.x.b(str, paramString2, paramBoolean));
      ag localag;
      for (int i = 1; ; i = 0)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Boolean.valueOf(paramBoolean);
        arrayOfObject[1] = Integer.valueOf(i);
        com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpItZQqBsJlKfJDbcgjEYBqK", "pushsendimage, param.compressImg:%b, compresstype:%d", arrayOfObject);
        localag = new ag(paramInt1, paramString1, paramString2, str, i, this, paramInt2, this.dxW, paramInt3);
        if (!this.dxV)
          break label128;
        this.dxT.offer(localag);
        break;
      }
      label128: bg.qX().d(localag);
      this.dxV = true;
    }
  }

  public final void a(aa paramaa)
  {
    this.dxU = paramaa;
  }

  public final void a(ArrayList paramArrayList1, int paramInt1, String paramString1, String paramString2, ArrayList paramArrayList2, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    Iterator localIterator = paramArrayList2.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      int j = ((Integer)paramArrayList1.get(i)).intValue();
      int k = i + 1;
      if (com.tencent.mm.model.x.b(str, paramString2, paramBoolean));
      ag localag;
      for (int m = 1; ; m = 0)
      {
        localag = new ag(j, paramInt1, paramString1, paramString2, str, m, this, paramInt2, "", "", paramInt3);
        localag.a(this.dxW);
        if (!this.dxV)
          break label136;
        this.dxT.offer(localag);
        i = k;
        break;
      }
      label136: bg.qX().d(localag);
      this.dxV = true;
      i = k;
    }
  }

  public final void run()
  {
    bg.qQ().n(new y(this));
  }

  public final void stop()
  {
    this.dxY = 0;
    bg.qX().b(110, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.v
 * JD-Core Version:    0.6.2
 */