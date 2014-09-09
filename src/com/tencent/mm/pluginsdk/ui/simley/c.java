package com.tencent.mm.pluginsdk.ui.simley;

import com.tencent.mm.sdk.platformtools.z;

public final class c
{
  private int hIh = 0;
  private int hIi = 0;
  private final int hIj = 10000;

  public final boolean aDn()
  {
    return this.hIi > this.hIh;
  }

  public final void aDo()
  {
    if (this.hIi > 10000)
      this.hIi = 0;
    this.hIh = this.hIi;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.hIh);
    z.v("MicroMsg.Smiley.Panel.Cache", "view_version = cache_version, version: %d", arrayOfObject);
  }

  public final void aDp()
  {
    this.hIh = (1 + this.hIh);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.hIh);
    arrayOfObject1[1] = Integer.valueOf(this.hIi);
    z.v("MicroMsg.Smiley.Panel.Cache", "viewVersion++, viewVersion: %d, cacheVersion: %d, sync cacheVertion ", arrayOfObject1);
    if (this.hIh > this.hIi);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        if (this.hIh > 10000)
          this.hIh = 0;
        this.hIi = this.hIh;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(this.hIh);
        z.v("MicroMsg.Smiley.Panel.Cache", "cache_version = view_version, version: %d", arrayOfObject2);
      }
      return;
    }
  }

  public final void aDq()
  {
    this.hIi = (1 + this.hIi);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.hIh);
    arrayOfObject[1] = Integer.valueOf(this.hIi);
    z.v("MicroMsg.Smiley.Panel.Cache", "cacheVersion++, viewVersion: %d, cacheVersion: %d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.c
 * JD-Core Version:    0.6.2
 */