package com.tencent.mm.a;

public final class i
{
  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
      return null;
    return c(paramArrayOfByte1, paramArrayOfByte2);
  }

  public static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
      return null;
    return c(paramArrayOfByte1, paramArrayOfByte2);
  }

  private static byte[] c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    byte[] arrayOfByte1 = new byte[256];
    for (int j = 0; j < 256; j++)
      arrayOfByte1[j] = ((byte)j);
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length == 0))
      arrayOfByte1 = null;
    byte[] arrayOfByte2;
    while (true)
    {
      arrayOfByte2 = new byte[paramArrayOfByte1.length];
      int k = 0;
      int m = 0;
      while (i < paramArrayOfByte1.length)
      {
        m = 0xFF & m + 1;
        k = 0xFF & k + (0xFF & arrayOfByte1[m]);
        int n = arrayOfByte1[m];
        arrayOfByte1[m] = arrayOfByte1[k];
        arrayOfByte1[k] = n;
        int i1 = 0xFF & (0xFF & arrayOfByte1[m]) + (0xFF & arrayOfByte1[k]);
        arrayOfByte2[i] = ((byte)(paramArrayOfByte1[i] ^ arrayOfByte1[i1]));
        i++;
      }
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      while (i2 < 256)
      {
        i3 = 0xFF & i3 + ((0xFF & paramArrayOfByte2[i4]) + (0xFF & arrayOfByte1[i2]));
        int i5 = arrayOfByte1[i2];
        arrayOfByte1[i2] = arrayOfByte1[i3];
        arrayOfByte1[i3] = i5;
        i4 = (i4 + 1) % paramArrayOfByte2.length;
        i2++;
      }
    }
    return arrayOfByte2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.i
 * JD-Core Version:    0.6.2
 */