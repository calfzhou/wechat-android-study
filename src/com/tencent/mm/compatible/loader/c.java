package com.tencent.mm.compatible.loader;

public final class c
{
  private static final Object jdField_do = new Object();
  private int cQ;
  private long[] dNX;
  private boolean dp = false;
  private Object[] dr;

  public c()
  {
    this((byte)0);
  }

  private c(byte paramByte)
  {
    int i = a.cg(10);
    this.dNX = new long[i];
    this.dr = new Object[i];
    this.cQ = 0;
  }

  private static int a(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    int i = paramInt + 0;
    int j = -1;
    int k = i;
    while (k - j > 1)
    {
      int m = (k + j) / 2;
      if (paramArrayOfLong[m] < paramLong)
        j = m;
      else
        k = m;
    }
    if (k == paramInt + 0)
      k = 0xFFFFFFFF ^ paramInt + 0;
    while (paramArrayOfLong[k] == paramLong)
      return k;
    return k ^ 0xFFFFFFFF;
  }

  public final void delete(long paramLong)
  {
    int i = a(this.dNX, this.cQ, paramLong);
    if ((i >= 0) && (this.dr[i] != jdField_do))
    {
      this.dr[i] = jdField_do;
      this.dp = true;
    }
  }

  public final Object get(long paramLong)
  {
    int i = a(this.dNX, this.cQ, paramLong);
    if ((i < 0) || (this.dr[i] == jdField_do))
      return null;
    return this.dr[i];
  }

  public final void put(long paramLong, Object paramObject)
  {
    int i = a(this.dNX, this.cQ, paramLong);
    if (i >= 0)
    {
      this.dr[i] = paramObject;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.cQ) && (this.dr[j] == jdField_do))
    {
      this.dNX[j] = paramLong;
      this.dr[j] = paramObject;
      return;
    }
    if ((this.dp) && (this.cQ >= this.dNX.length))
    {
      int m = this.cQ;
      long[] arrayOfLong2 = this.dNX;
      Object[] arrayOfObject2 = this.dr;
      int n = 0;
      int i1 = 0;
      while (n < m)
      {
        Object localObject = arrayOfObject2[n];
        if (localObject != jdField_do)
        {
          if (n != i1)
          {
            arrayOfLong2[i1] = arrayOfLong2[n];
            arrayOfObject2[i1] = localObject;
          }
          i1++;
        }
        n++;
      }
      this.dp = false;
      this.cQ = i1;
      j = 0xFFFFFFFF ^ a(this.dNX, this.cQ, paramLong);
    }
    if (this.cQ >= this.dNX.length)
    {
      int k = a.cg(1 + this.cQ);
      long[] arrayOfLong1 = new long[k];
      Object[] arrayOfObject1 = new Object[k];
      System.arraycopy(this.dNX, 0, arrayOfLong1, 0, this.dNX.length);
      System.arraycopy(this.dr, 0, arrayOfObject1, 0, this.dr.length);
      this.dNX = arrayOfLong1;
      this.dr = arrayOfObject1;
    }
    if (this.cQ - j != 0)
    {
      System.arraycopy(this.dNX, j, this.dNX, j + 1, this.cQ - j);
      System.arraycopy(this.dr, j, this.dr, j + 1, this.cQ - j);
    }
    this.dNX[j] = paramLong;
    this.dr[j] = paramObject;
    this.cQ = (1 + this.cQ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.c
 * JD-Core Version:    0.6.2
 */