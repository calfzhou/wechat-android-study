package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class r extends a
{
  int kkW = 0;
  int kkX = 0;

  public r()
  {
    this.kjD = 278;
  }

  public final byte[] a(int paramInt1, int paramInt2, long[] paramArrayOfLong)
  {
    this.kkW = 10;
    byte[] arrayOfByte = new byte[this.kkW];
    f.i(arrayOfByte, 0, this.kkX);
    f.k(arrayOfByte, 1, paramInt1);
    f.k(arrayOfByte, 5, paramInt2);
    f.i(arrayOfByte, 9, 0);
    rY(this.kjD);
    v(arrayOfByte, this.kkW);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.r
 * JD-Core Version:    0.6.2
 */