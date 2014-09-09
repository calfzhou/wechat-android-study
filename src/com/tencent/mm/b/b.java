package com.tencent.mm.b;

public final class b
{
  private static final long cFj = "Micromsg".hashCode();
  int cFk = 0;

  public b(int paramInt)
  {
    this.cFk = paramInt;
  }

  public static b g(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 8)
    {
      long l = 0L;
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayOfByte.length)
        {
          if (l >> 32 != cFj)
            break;
          return new b((int)l);
        }
        l |= (0xFF & paramArrayOfByte[i]) << i * 8;
      }
    }
    return null;
  }

  public final byte[] getBytes()
  {
    long l = cFj << 32 | this.cFk;
    byte[] arrayOfByte = new byte[8];
    for (int i = 0; ; i++)
    {
      if (i >= 8)
        return arrayOfByte;
      arrayOfByte[i] = ((byte)(int)(0xFF & l >> i * 8));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.b
 * JD-Core Version:    0.6.2
 */