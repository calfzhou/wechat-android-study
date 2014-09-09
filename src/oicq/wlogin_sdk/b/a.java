package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.e;
import oicq.wlogin_sdk.c.f;

public class a
{
  int kjD = 0;
  int kjr = 128;
  int kjs = 0;
  byte[] kjx = new byte[this.kjr];
  int kkA = 0;
  int kkB = 4;
  int kkC = 0;

  private static int g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte.length;
    int k;
    for (int j = paramInt1; ; j = k + (2 + f.z(paramArrayOfByte, k)))
    {
      if (j >= i);
      do
      {
        j = -1;
        do
        {
          return j;
          if (j + 2 > i)
            break;
        }
        while (f.z(paramArrayOfByte, j) == paramInt2);
        k = j + 2;
      }
      while (k + 2 > i);
    }
  }

  public final int a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    int i = g(paramArrayOfByte1, paramInt1, this.kjD);
    if (i < 0);
    int j;
    byte[] arrayOfByte1;
    do
    {
      do
      {
        return -1;
        j = paramInt2 - (i - paramInt1);
        arrayOfByte1 = new byte[j];
        System.arraycopy(paramArrayOfByte1, i, arrayOfByte1, 0, j);
      }
      while (this.kkB >= j);
      this.kkC = f.z(arrayOfByte1, 2);
    }
    while (this.kkB + this.kkC > j);
    byte[] arrayOfByte2 = e.decrypt(arrayOfByte1, this.kkB, this.kkC, paramArrayOfByte2);
    if (arrayOfByte2 == null)
      return -1015;
    if (this.kkB + arrayOfByte2.length > this.kjr)
    {
      this.kjr = (this.kkB + arrayOfByte2.length);
      this.kjx = new byte[this.kjr];
    }
    this.kjs = 0;
    System.arraycopy(arrayOfByte1, 0, this.kjx, 0, this.kkB);
    this.kjs += this.kkB;
    System.arraycopy(arrayOfByte2, 0, this.kjx, this.kjs, arrayOfByte2.length);
    this.kjs += arrayOfByte2.length;
    this.kkC = arrayOfByte2.length;
    if (!beS().booleanValue())
      return -1005;
    return 0;
  }

  public final byte[] beN()
  {
    byte[] arrayOfByte = new byte[this.kjs];
    System.arraycopy(this.kjx, 0, arrayOfByte, 0, this.kjs);
    return arrayOfByte;
  }

  public final byte[] beQ()
  {
    byte[] arrayOfByte = new byte[this.kkC];
    System.arraycopy(this.kjx, this.kkB, arrayOfByte, 0, this.kkC);
    return arrayOfByte;
  }

  public final void beR()
  {
    f.j(this.kjx, 2, this.kjs - this.kkB);
  }

  public Boolean beS()
  {
    return Boolean.valueOf(true);
  }

  public final int h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = g(paramArrayOfByte, paramInt1, this.kjD);
    if (i < 0);
    int j;
    do
    {
      do
      {
        return -1;
        j = paramInt2 - (i - paramInt1);
      }
      while (this.kkB >= j);
      this.kkC = f.z(paramArrayOfByte, i + 2);
    }
    while (this.kkB + this.kkC > j);
    int k = this.kkB + this.kkC;
    if (k > this.kjr)
    {
      this.kjr = (k + 128);
      this.kjx = new byte[this.kjr];
    }
    this.kjs = k;
    System.arraycopy(paramArrayOfByte, i, this.kjx, 0, k);
    this.kjD = f.z(paramArrayOfByte, i);
    this.kkC = (k - this.kkB);
    if (!beS().booleanValue())
      return -1005;
    return i + this.kkB + this.kkC;
  }

  public final void rY(int paramInt)
  {
    f.j(this.kjx, this.kjs, paramInt);
    this.kjs = (2 + this.kjs);
    f.j(this.kjx, this.kjs, 0);
    this.kjs = (2 + this.kjs);
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; ; i++)
    {
      if (i >= this.kjs)
        return str;
      str = new StringBuilder(String.valueOf(str)).append(Integer.toHexString(0xF & this.kjx[i] >> 4)).toString() + Integer.toHexString(0xF & this.kjx[i]);
    }
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt + this.kkB > this.kjr)
    {
      this.kjr = (128 + (paramInt + this.kkB));
      byte[] arrayOfByte = new byte[this.kjr];
      System.arraycopy(this.kjx, 0, arrayOfByte, 0, this.kkB);
      this.kjx = arrayOfByte;
    }
    this.kjs = (paramInt + this.kkB);
    System.arraycopy(paramArrayOfByte, 0, this.kjx, this.kkB, paramInt);
    this.kkC = paramInt;
    f.j(this.kjx, 0, this.kjD);
    f.j(this.kjx, 2, this.kkC);
  }

  public final void v(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt > this.kjr - this.kkB)
    {
      this.kjr = (64 + (paramInt + this.kkB));
      byte[] arrayOfByte = new byte[this.kjr];
      System.arraycopy(this.kjx, 0, arrayOfByte, 0, this.kjs);
      this.kjx = arrayOfByte;
    }
    this.kkC = paramInt;
    System.arraycopy(paramArrayOfByte, 0, this.kjx, this.kjs, paramInt);
    this.kjs = (paramInt + this.kjs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.a
 * JD-Core Version:    0.6.2
 */