package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class ao extends a
{
  int klo = 22;
  int klp = 1;
  int klq = 1536;

  public ao()
  {
    this.kjD = 24;
  }

  public final byte[] a(long paramLong1, int paramInt1, long paramLong2, int paramInt2)
  {
    byte[] arrayOfByte = new byte[this.klo];
    f.j(arrayOfByte, 0, this.klp);
    f.k(arrayOfByte, 2, this.klq);
    f.k(arrayOfByte, 6, (int)paramLong1);
    f.k(arrayOfByte, 10, paramInt1);
    f.k(arrayOfByte, 14, (int)paramLong2);
    f.j(arrayOfByte, 18, 0);
    f.j(arrayOfByte, 20, 0);
    rY(this.kjD);
    v(arrayOfByte, this.klo);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.ao
 * JD-Core Version:    0.6.2
 */