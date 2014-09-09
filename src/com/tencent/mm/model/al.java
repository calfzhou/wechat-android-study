package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.z;

public abstract class al
{
  private long dkz = 0L;

  public abstract boolean cG(int paramInt);

  public final void cH(int paramInt)
  {
    long l = System.currentTimeMillis();
    transfer(paramInt);
    this.dkz = (System.currentTimeMillis() - l);
    z.d("!44@/B4Tb64lLpJAUoyR9+C90JZoF6rMyZgZ/nFr3FCiGXA=", "doTransfer, timeConsumed = " + this.dkz + ", tag = " + getTag());
  }

  public abstract String getTag();

  public abstract void transfer(int paramInt);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.al
 * JD-Core Version:    0.6.2
 */