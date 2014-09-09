package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class am extends a
{
  public am()
  {
    this.kjD = 327;
  }

  private static int dm(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length > 32)
        return 32;
      return paramArrayOfByte.length;
    }
    return 0;
  }

  public final byte[] a(long paramLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = dm(paramArrayOfByte1);
    int j = dm(paramArrayOfByte2);
    byte[] arrayOfByte = new byte[j + (2 + (i + 6))];
    f.c(arrayOfByte, 0, paramLong);
    f.j(arrayOfByte, 4, i);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 6, i);
    int k = i + 6;
    f.j(arrayOfByte, k, j);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, k + 2, j);
    rY(this.kjD);
    v(arrayOfByte, arrayOfByte.length);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.am
 * JD-Core Version:    0.6.2
 */