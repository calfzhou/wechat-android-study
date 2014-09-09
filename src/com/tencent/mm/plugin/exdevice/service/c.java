package com.tencent.mm.plugin.exdevice.service;

final class c
{
  private byte[] eIh = null;
  private short eIn = 0;
  private short eJY = 0;
  private long ejo = 0L;

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

  public final c X(byte[] paramArrayOfByte)
  {
    this.eIh = paramArrayOfByte;
    return this;
  }

  public final c ax(long paramLong)
  {
    this.ejo = paramLong;
    return this;
  }

  public final c b(short paramShort)
  {
    this.eIn = paramShort;
    return this;
  }

  public final c c(short paramShort)
  {
    this.eJY = paramShort;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.c
 * JD-Core Version:    0.6.2
 */