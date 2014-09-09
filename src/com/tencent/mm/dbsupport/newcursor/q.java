package com.tencent.mm.dbsupport.newcursor;

import android.util.SparseArray;
import java.util.ArrayList;

public abstract class q
{
  g dPY;

  public q(g paramg, int paramInt)
  {
    this.dPY = paramg;
    this.dPY.P(true);
    this.dPY.a(new r(this));
    if (paramInt != 0)
      this.dPY.cs(paramInt);
    getCount();
  }

  public abstract a Cg();

  public final g Ch()
  {
    return this.dPY;
  }

  public final a K(Object paramObject)
  {
    return this.dPY.K(paramObject);
  }

  public final boolean L(Object paramObject)
  {
    return this.dPY.L(paramObject);
  }

  public abstract ArrayList b(ArrayList paramArrayList);

  public final void b(Object paramObject, a parama)
  {
    this.dPY.a(paramObject, parama);
  }

  public final void cB(int paramInt)
  {
    this.dPY.moveToPosition(paramInt);
  }

  public final void close()
  {
    this.dPY.close();
    this.dPY = null;
  }

  public final a cn(int paramInt)
  {
    return this.dPY.cn(paramInt);
  }

  public final boolean co(int paramInt)
  {
    return this.dPY.co(paramInt);
  }

  public final int getCount()
  {
    return this.dPY.getCount();
  }

  public final boolean isClosed()
  {
    return this.dPY.isClosed();
  }

  public final boolean op()
  {
    return this.dPY.op();
  }

  public final SparseArray[] oq()
  {
    return this.dPY.oq();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.q
 * JD-Core Version:    0.6.2
 */