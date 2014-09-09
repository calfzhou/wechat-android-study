package com.qq.taf.jce.dynamic;

public class LongField extends NumberField
{
  private long data;

  LongField(long paramLong, int paramInt)
  {
    super(paramInt);
    this.data = paramLong;
  }

  public long get()
  {
    return this.data;
  }

  public Number getNumber()
  {
    return Long.valueOf(this.data);
  }

  public void set(long paramLong)
  {
    this.data = paramLong;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.LongField
 * JD-Core Version:    0.6.2
 */