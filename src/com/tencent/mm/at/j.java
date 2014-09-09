package com.tencent.mm.at;

public final class j
{
  public static byte[] cS(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++)
      paramArrayOfByte[i] = ((byte)(0x12 ^ paramArrayOfByte[i]));
    return paramArrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.j
 * JD-Core Version:    0.6.2
 */