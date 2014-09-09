package com.qq.taf.jce.dynamic;

public class DoubleField extends NumberField
{
  private double data;

  DoubleField(double paramDouble, int paramInt)
  {
    super(paramInt);
    this.data = paramDouble;
  }

  public double get()
  {
    return this.data;
  }

  public Number getNumber()
  {
    return Double.valueOf(this.data);
  }

  public void set(double paramDouble)
  {
    this.data = paramDouble;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.DoubleField
 * JD-Core Version:    0.6.2
 */