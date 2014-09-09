package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class i extends a
{
  int kkT = 6;

  public i()
  {
    this.kjD = 263;
  }

  public final byte[] l(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    byte[] arrayOfByte = new byte[this.kkT];
    f.j(arrayOfByte, 0, 0);
    f.i(arrayOfByte, 2, 1);
    f.j(arrayOfByte, 3, 102400);
    f.i(arrayOfByte, 5, 1);
    rY(this.kjD);
    v(arrayOfByte, this.kkT);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.i
 * JD-Core Version:    0.6.2
 */