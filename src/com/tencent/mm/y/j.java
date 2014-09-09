package com.tencent.mm.y;

import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.List;

final class j
{
  public long dxb;
  public long dxc;
  public int dxd;
  public int dxe;
  public List dxf;

  public j(long paramLong1, long paramLong2, int paramInt)
  {
    this.dxb = paramLong1;
    this.dxc = paramLong2;
    this.dxd = paramInt;
    this.dxe = 0;
  }

  public final boolean a(i parami, Object paramObject)
  {
    if (this.dxf == null)
      this.dxf = new LinkedList();
    k localk = new k(parami, paramObject);
    if (this.dxf.contains(localk))
    {
      z.d("!56@K1YhttjqDKGWwIlCcgQK0IubKY9QueKyqByiDnARwSLAZsBxKbvfFA==", "task item already exists");
      return false;
    }
    this.dxf.add(localk);
    return true;
  }

  public final boolean b(i parami)
  {
    k localk = new k(parami, null);
    if (this.dxf.contains(localk))
    {
      this.dxf.remove(localk);
      return true;
    }
    return false;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof j)));
    j localj;
    do
    {
      return false;
      localj = (j)paramObject;
    }
    while ((localj.dxb != this.dxb) || (localj.dxc != this.dxc) || (localj.dxd != this.dxd));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.j
 * JD-Core Version:    0.6.2
 */