package com.tencent.mm.a;

public final class j
{
  public static byte[] aX(int paramInt)
  {
    int i = 0;
    byte[] arrayOfByte1 = new byte[4];
    for (int j = 0; j < 4; j++)
      arrayOfByte1[j] = ((byte)(0xFF & paramInt >> j * 8));
    byte[] arrayOfByte2 = new byte[4];
    while (i < 4)
    {
      arrayOfByte2[i] = arrayOfByte1[(3 - i)];
      i++;
    }
    return arrayOfByte2;
  }

  public static int b(byte[] paramArrayOfByte, int paramInt)
  {
    return (0xFF & paramArrayOfByte[paramInt]) << 24 | (0xFF & paramArrayOfByte[(paramInt + 1)]) << 16 | (0xFF & paramArrayOfByte[(paramInt + 2)]) << 8 | (0xFF & paramArrayOfByte[(paramInt + 3)]) << 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.j
 * JD-Core Version:    0.6.2
 */