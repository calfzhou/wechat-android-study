package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class ac extends a
{
  public int kle = 0;

  public ac()
  {
    this.kjD = 306;
  }

  public final Boolean beS()
  {
    if (this.kkC < 2)
      return Boolean.valueOf(false);
    this.kle = f.z(this.kjx, this.kkB);
    if (2 + this.kle > this.kkC)
      return Boolean.valueOf(false);
    return Boolean.valueOf(true);
  }

  public final byte[] bfg()
  {
    byte[] arrayOfByte = new byte[this.kle];
    System.arraycopy(this.kjx, 2 + this.kkB, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.ac
 * JD-Core Version:    0.6.2
 */