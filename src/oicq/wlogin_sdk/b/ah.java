package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class ah extends a
{
  int klg = 0;
  int klh = 0;

  public ah()
  {
    this.kjD = 322;
  }

  public final byte[] dk(byte[] paramArrayOfByte)
  {
    this.klh = (4 + paramArrayOfByte.length);
    byte[] arrayOfByte = new byte[this.klh];
    f.j(arrayOfByte, 0, this.klg);
    f.j(arrayOfByte, 2, paramArrayOfByte.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 4, paramArrayOfByte.length);
    rY(this.kjD);
    v(arrayOfByte, arrayOfByte.length);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.ah
 * JD-Core Version:    0.6.2
 */