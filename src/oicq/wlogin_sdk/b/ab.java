package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class ab extends a
{
  int kld = 0;

  public ab()
  {
    this.kjD = 296;
  }

  private static int w(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length > paramInt)
        return paramInt;
      return paramArrayOfByte.length;
    }
    return 0;
  }

  public final byte[] a(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = w(paramArrayOfByte1, 32);
    int j = w(paramArrayOfByte2, 16);
    this.kld = (2 + (j + (2 + (i + 11))));
    byte[] arrayOfByte = new byte[this.kld];
    f.j(arrayOfByte, 0, 0);
    f.i(arrayOfByte, 2, paramInt1);
    f.i(arrayOfByte, 3, paramInt2);
    f.i(arrayOfByte, 4, paramInt3);
    f.k(arrayOfByte, 5, 0);
    f.j(arrayOfByte, 9, i);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 11, i);
    int k = i + 11;
    f.j(arrayOfByte, k, j);
    int m = k + 2;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, m, j);
    f.j(arrayOfByte, m + j, 0);
    rY(this.kjD);
    v(arrayOfByte, this.kld);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.ab
 * JD-Core Version:    0.6.2
 */