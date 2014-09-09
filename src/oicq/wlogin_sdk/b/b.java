package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class b extends a
{
  int kkD = 4;
  int kkE = 14;
  int kkF = 1;
  int kkG = 20;
  byte[] kkH = new byte[2];

  public b()
  {
    this.kjD = 1;
  }

  public final Boolean beS()
  {
    if (this.kkC < 20)
      return Boolean.valueOf(false);
    return Boolean.valueOf(true);
  }

  public final byte[] i(long paramLong, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[this.kkG];
    f.j(arrayOfByte, 0, this.kkF);
    f.k(arrayOfByte, 2, f.bfo());
    f.k(arrayOfByte, 6, (int)paramLong);
    f.c(arrayOfByte, 10, f.bfq());
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 14, paramArrayOfByte.length);
    f.j(arrayOfByte, 14 + paramArrayOfByte.length, 0);
    rY(this.kjD);
    v(arrayOfByte, this.kkG);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.b
 * JD-Core Version:    0.6.2
 */