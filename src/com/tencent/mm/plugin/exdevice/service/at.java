package com.tencent.mm.plugin.exdevice.service;

final class at
{
  private byte[] eIh = null;
  private short eIn = 0;
  private short eJY = 0;
  private long ejo = 0L;
  private int ejr = 0;

  public final long HW()
  {
    return this.ejo;
  }

  public final byte[] Pt()
  {
    return this.eIh;
  }

  public final short Pu()
  {
    return this.eIn;
  }

  public final short Pv()
  {
    return this.eJY;
  }

  public final at Y(byte[] paramArrayOfByte)
  {
    this.eIh = paramArrayOfByte;
    return this;
  }

  public final at aN(long paramLong)
  {
    this.ejo = paramLong;
    return this;
  }

  public final at d(short paramShort)
  {
    this.eIn = paramShort;
    return this;
  }

  public final at e(short paramShort)
  {
    this.eJY = paramShort;
    return this;
  }

  public final at gZ(int paramInt)
  {
    this.ejr = paramInt;
    return this;
  }

  public final int getErrorCode()
  {
    return this.ejr;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.at
 * JD-Core Version:    0.6.2
 */