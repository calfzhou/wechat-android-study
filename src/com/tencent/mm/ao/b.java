package com.tencent.mm.ao;

import java.io.UnsupportedEncodingException;

public final class b
{
  private byte[] hNb;

  private b()
  {
  }

  public b(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  private b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.hNb = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, this.hNb, 0, paramInt2);
  }

  public static b aO(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null);
    while (true)
    {
      return new b(paramArrayOfByte);
      paramArrayOfByte = new byte[0];
    }
  }

  public static b c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new b(paramArrayOfByte, paramInt1, paramInt2);
  }

  public final String aFt()
  {
    int i = 0;
    try
    {
      while (true)
      {
        if (i >= this.hNb.length);
        int j;
        do
        {
          return new String(this.hNb, 0, i, "UTF-8");
          j = this.hNb[i];
        }
        while (j == 0);
        i++;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new RuntimeException("UTF-8 not supported?");
  }

  public final byte[] getBytes()
  {
    return this.hNb;
  }

  public final b ns(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    if (this.hNb.length >= paramInt)
    {
      System.arraycopy(this.hNb, 0, arrayOfByte, 0, paramInt - 1);
      this.hNb = arrayOfByte;
      return this;
    }
    System.arraycopy(this.hNb, 0, arrayOfByte, 0, this.hNb.length);
    this.hNb = arrayOfByte;
    return this;
  }

  public final int size()
  {
    return this.hNb.length;
  }

  public final byte[] toByteArray()
  {
    int i = this.hNb.length;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(this.hNb, 0, arrayOfByte, 0, i);
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ao.b
 * JD-Core Version:    0.6.2
 */