package com.tencent.mm.plugin.exdevice.service;

import android.os.IInterface;

public abstract interface ag extends IInterface
{
  public abstract long HW();

  public abstract byte[] PG();

  public abstract int PH();

  public abstract int PI();

  public abstract int PJ();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.ag
 * JD-Core Version:    0.6.2
 */