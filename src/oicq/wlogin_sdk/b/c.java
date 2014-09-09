package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class c extends a
{
  int kkI = 1;
  int kkJ = f.klO;
  int kkK = 22;

  public c()
  {
    this.kjD = 256;
  }

  public final byte[] a(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[this.kkK];
    f.j(arrayOfByte, 0, this.kkI);
    f.k(arrayOfByte, 2, this.kkJ);
    f.k(arrayOfByte, 6, (int)paramLong1);
    f.k(arrayOfByte, 10, 1);
    f.k(arrayOfByte, 14, paramInt1);
    f.k(arrayOfByte, 18, paramInt2);
    rY(this.kjD);
    v(arrayOfByte, this.kkK);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.c
 * JD-Core Version:    0.6.2
 */