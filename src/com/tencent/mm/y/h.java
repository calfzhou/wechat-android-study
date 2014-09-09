package com.tencent.mm.y;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.m;
import com.tencent.mm.o.n;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  implements m, n
{
  private List dwW = new LinkedList();
  private HashSet dwX = new HashSet();
  private j dwY = null;
  private ac dwZ = null;
  private boolean dxa = false;

  public h()
  {
    bg.qX().a(109, this);
  }

  private boolean a(j paramj)
  {
    if ((paramj == null) || (paramj.dxf.size() > 0))
      return false;
    return b(paramj);
  }

  private boolean b(j paramj)
  {
    if (paramj == null)
      z.e("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "task is null");
    do
    {
      return false;
      z.i("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "cancel scene, (" + paramj.dxb + ", " + paramj.dxc + ", " + paramj.dxd + ")");
      if ((this.dwY != null) && (this.dwY.equals(paramj)))
      {
        bg.qX().c(this.dwZ);
        this.dwZ = null;
        c(this.dwY);
        this.dwY = null;
        en(-1);
        return true;
      }
    }
    while (!this.dwW.contains(paramj));
    int i = this.dwW.indexOf(paramj);
    j localj = (j)this.dwW.get(i);
    if (localj != null)
    {
      this.dwW.remove(localj);
      c(localj);
    }
    return true;
  }

  private static void c(j paramj)
  {
    if (paramj == null)
      z.e("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "task is null");
    while (true)
    {
      return;
      if (paramj.dxf == null)
      {
        z.e("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "task callback list is null");
        return;
      }
      Iterator localIterator = paramj.dxf.iterator();
      while (localIterator.hasNext())
      {
        k localk = (k)localIterator.next();
        if (k.a(localk) != null)
        {
          i locali = k.a(localk);
          long l = paramj.dxb;
          locali.b(l, k.b(localk));
        }
      }
    }
  }

  private void en(int paramInt)
  {
    if ((this.dwY != null) || (this.dwW.size() <= 0) || (true == this.dxa))
      return;
    this.dwY = ((j)this.dwW.get(0));
    this.dwW.remove(0);
    this.dwZ = new ac(this.dwY.dxb, this.dwY.dxc, this.dwY.dxd, this, paramInt);
    this.dwZ.dO(this.dwY.dxe);
    z.i("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "do scene, (" + this.dwY.dxb + ", " + this.dwY.dxc + ", " + this.dwY.dxd + ")");
    bg.qX().d(this.dwZ);
  }

  public final void a(int paramInt1, int paramInt2, x paramx)
  {
    if (this.dwZ != paramx)
      z.d("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "scene changed");
    while (true)
    {
      return;
      Iterator localIterator = this.dwY.dxf.iterator();
      while (localIterator.hasNext())
      {
        k localk = (k)localIterator.next();
        if (k.a(localk) != null)
        {
          i locali = k.a(localk);
          int i = this.dwY.dxd;
          locali.a(i, k.b(localk), paramInt1, paramInt2, paramx);
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (this.dwZ != paramx)
    {
      z.d("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "scene changed");
      return;
    }
    this.dwX.add(new j(this.dwY.dxb, this.dwY.dxc, this.dwY.dxd));
    z.i("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "scene end, (" + this.dwY.dxb + ", " + this.dwY.dxc + ", " + this.dwY.dxd + ")");
    Iterator localIterator = this.dwY.dxf.iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      if (k.a(localk) != null)
      {
        i locali = k.a(localk);
        long l1 = this.dwY.dxb;
        long l2 = this.dwY.dxc;
        int i = this.dwY.dxd;
        locali.a(l1, l2, i, k.b(localk), paramInt1, paramInt2);
      }
    }
    this.dwY = null;
    this.dwZ = null;
    en(-1);
  }

  public final void a(i parami)
  {
    if (parami == null)
    {
      z.e("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "listener is null");
      return;
    }
    z.i("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "[" + parami.hashCode() + "] cancel all tasks of listener");
    this.dxa = true;
    if (this.dwY != null)
    {
      this.dwY.b(parami);
      a(this.dwY);
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator1 = this.dwW.iterator();
    while (localIterator1.hasNext())
      localLinkedList.add((j)localIterator1.next());
    Iterator localIterator2 = localLinkedList.iterator();
    while (localIterator2.hasNext())
    {
      j localj = (j)localIterator2.next();
      localj.b(parami);
      a(localj);
    }
    xH();
  }

  public final boolean a(long paramLong1, long paramLong2)
  {
    return b(new j(paramLong1, paramLong2, 1));
  }

  public final boolean a(long paramLong1, long paramLong2, int paramInt)
  {
    j localj = new j(paramLong1, paramLong2, paramInt);
    if ((this.dwY != null) && (this.dwY.equals(localj)))
      return true;
    return this.dwW.indexOf(localj) >= 0;
  }

  public final boolean a(long paramLong1, long paramLong2, int paramInt1, Object paramObject, int paramInt2, i parami, int paramInt3)
  {
    if (parami == null)
    {
      z.e("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "listener is null");
      return false;
    }
    j localj = new j(paramLong1, paramLong2, paramInt1);
    localj.dxe = paramInt2;
    if (this.dwX.contains(localj))
    {
      z.e("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "[" + parami.hashCode() + "] add failed, task already done");
      return false;
    }
    if ((this.dwY != null) && (localj.equals(this.dwY)))
      return this.dwY.a(parami, paramObject);
    int i = this.dwW.indexOf(localj);
    if ((i >= 0) && (i < this.dwW.size()))
      return ((j)this.dwW.get(i)).a(parami, paramObject);
    z.i("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "[" + parami.hashCode() + "] no found task, create a new task(" + paramLong1 + " " + paramLong2 + " " + paramInt1 + ")");
    localj.a(parami, paramObject);
    this.dwW.add(localj);
    en(paramInt3);
    return true;
  }

  public final boolean a(long paramLong1, long paramLong2, i parami)
  {
    if (parami == null)
    {
      z.e("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "listener is null");
      return false;
    }
    j localj1 = new j(paramLong1, paramLong2, 1);
    j localj2;
    if ((this.dwY != null) && (this.dwY.equals(localj1)))
      localj2 = this.dwY;
    while (true)
      if (localj2 != null)
      {
        localj2.b(parami);
        a(localj2);
        z.i("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "[" + parami.hashCode() + "] task has been canceled, (" + paramLong1 + ", " + paramLong2 + ", 1)");
        return true;
        int i = this.dwW.indexOf(localj1);
        if (-1 != i)
          localj2 = (j)this.dwW.get(i);
      }
      else
      {
        z.e("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "[" + parami.hashCode() + "] task no found, (" + paramLong1 + ", " + paramLong2 + ", 1)");
        return false;
        localj2 = null;
      }
  }

  public final boolean a(long paramLong1, long paramLong2, Object paramObject, int paramInt, i parami)
  {
    return a(paramLong1, paramLong2, 0, paramObject, paramInt, parami, -1);
  }

  public final void detach()
  {
    z.i("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "on detach");
    z.i("!44@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyKPpsqMboJx0=", "cancel all net scene");
    this.dxa = true;
    b(this.dwY);
    while (this.dwW.size() > 0)
      b((j)this.dwW.get(0));
    xH();
    bg.qX().b(109, this);
  }

  public final void xG()
  {
    this.dxa = true;
  }

  public final void xH()
  {
    this.dxa = false;
    en(-1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.h
 * JD-Core Version:    0.6.2
 */