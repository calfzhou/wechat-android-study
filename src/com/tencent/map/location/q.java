package com.tencent.map.location;

import android.location.Location;

public final class q
  implements Cloneable
{
  private Location LY = null;
  private long Lz = 0L;
  private int a = 0;

  public q(Location paramLocation, int paramInt, long paramLong)
  {
    if (paramLocation != null)
    {
      this.LY = new Location(paramLocation);
      this.a = paramInt;
      this.Lz = paramLong;
    }
  }

  public final Object clone()
  {
    try
    {
      localq = (q)super.clone();
      if (this.LY != null)
        localq.LY = new Location(this.LY);
      return localq;
    }
    catch (Exception localException)
    {
      while (true)
        q localq = null;
    }
  }

  public final boolean gZ()
  {
    if (this.LY == null);
    while (((this.a > 0) && (this.a < 3)) || (System.currentTimeMillis() - this.Lz > 30000L))
      return false;
    return true;
  }

  public final Location ha()
  {
    return this.LY;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.q
 * JD-Core Version:    0.6.2
 */