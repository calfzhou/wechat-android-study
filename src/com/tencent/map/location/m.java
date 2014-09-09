package com.tencent.map.location;

public final class m
  implements Cloneable
{
  public int KZ = 0;
  public int LL = 0;
  public int LM = 0;
  public int LN = 2147483647;
  public int La = 0;
  public int a = 0;
  public int b = 0;
  public int g = 2147483647;

  public m(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.KZ = paramInt3;
    this.La = paramInt4;
    this.LL = paramInt5;
    this.LM = paramInt6;
    this.g = paramInt7;
    this.LN = paramInt8;
  }

  public final Object clone()
  {
    try
    {
      m localm = (m)super.clone();
      return localm;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.m
 * JD-Core Version:    0.6.2
 */