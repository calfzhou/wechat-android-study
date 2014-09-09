package com.tencent.mm.a;

import com.tencent.mm.pointers.PByteArray;

public final class a
{
  public static int a(PByteArray paramPByteArray, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
      return 2;
    if ((paramArrayOfByte1.length < 0) || (paramArrayOfByte2.length <= 0))
      return 2;
    int i = 8 - paramArrayOfByte1.length % 8;
    if (i == 0);
    for (int j = 8; ; j = i)
    {
      byte[] arrayOfByte1 = new byte[j + paramArrayOfByte1.length];
      for (int k = 0; k < paramArrayOfByte1.length; k++)
        arrayOfByte1[k] = paramArrayOfByte1[k];
      for (int m = 0; m < j; m++)
        arrayOfByte1[(m + paramArrayOfByte1.length)] = ((byte)j);
      paramPByteArray.value = new byte[32 + (j + paramArrayOfByte1.length)];
      if (h.a(paramPByteArray.value, arrayOfByte1, arrayOfByte1.length, paramArrayOfByte2.length, paramArrayOfByte2, 0) == 0)
        return 11;
      byte[] arrayOfByte2 = new byte[8 + (j + paramArrayOfByte1.length)];
      for (int n = 0; n < arrayOfByte2.length; n++)
        arrayOfByte2[n] = paramPByteArray.value[n];
      paramPByteArray.value = arrayOfByte2;
      return 0;
    }
  }

  public static int b(PByteArray paramPByteArray, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
      return 2;
    if ((paramArrayOfByte1.length < 0) || (paramArrayOfByte2.length <= 0))
      return 2;
    int i = paramArrayOfByte1.length;
    paramPByteArray.value = new byte[i];
    if (h.a(paramPByteArray.value, paramArrayOfByte1, i, paramArrayOfByte2.length, paramArrayOfByte2, 1) == 0)
      return 12;
    int j = paramPByteArray.value[(-8 + (i - 1))];
    if ((j <= 0) || (j > 8))
      return 12;
    byte[] arrayOfByte = new byte[-8 + (i - j)];
    for (int k = 0; k < arrayOfByte.length; k++)
      arrayOfByte[k] = paramPByteArray.value[k];
    paramPByteArray.value = arrayOfByte;
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.a
 * JD-Core Version:    0.6.2
 */