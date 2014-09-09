package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class t extends a
{
  public int kkY = 0;

  public t()
  {
    this.kjD = 282;
  }

  public final Boolean beS()
  {
    if (this.kkC < 5)
      return Boolean.valueOf(false);
    int i = f.y(this.kjx, 1 + (1 + (2 + this.kkB)));
    if (this.kkC < i + 5)
      return Boolean.valueOf(false);
    this.kkY = i;
    return Boolean.valueOf(true);
  }

  public final byte[] beV()
  {
    byte[] arrayOfByte = new byte[2];
    System.arraycopy(this.kjx, this.kkB, arrayOfByte, 0, 2);
    return arrayOfByte;
  }

  public final byte[] beW()
  {
    byte[] arrayOfByte = new byte[1];
    System.arraycopy(this.kjx, 2 + this.kkB, arrayOfByte, 0, 1);
    return arrayOfByte;
  }

  public final byte[] beX()
  {
    byte[] arrayOfByte = new byte[1];
    System.arraycopy(this.kjx, 1 + (2 + this.kkB), arrayOfByte, 0, 1);
    return arrayOfByte;
  }

  public final byte[] beY()
  {
    byte[] arrayOfByte = new byte[this.kkY];
    System.arraycopy(this.kjx, 1 + (1 + (1 + (2 + this.kkB))), arrayOfByte, 0, this.kkY);
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.t
 * JD-Core Version:    0.6.2
 */