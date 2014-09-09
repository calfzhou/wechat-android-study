package com.qq.taf.jce.dynamic;

public class IntField extends NumberField
{
  private int data;

  IntField(int paramInt1, int paramInt2)
  {
    super(paramInt2);
    this.data = paramInt1;
  }

  public int get()
  {
    return this.data;
  }

  public Number getNumber()
  {
    return Integer.valueOf(this.data);
  }

  public void set(int paramInt)
  {
    this.data = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.IntField
 * JD-Core Version:    0.6.2
 */