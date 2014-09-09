package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class aa extends a
{
  int klb = 0;
  int klc = 0;

  public aa()
  {
    this.kjD = 293;
  }

  public final Boolean beS()
  {
    if (this.kkC < 2)
      return Boolean.valueOf(false);
    this.klb = f.z(this.kjx, this.kkB);
    if (this.kkC < 2 + (2 + this.klb))
      return Boolean.valueOf(false);
    this.klc = f.z(this.kjx, 2 + this.kkB + this.klb);
    return Boolean.valueOf(true);
  }

  public final byte[] bfe()
  {
    byte[] arrayOfByte = new byte[this.klb];
    System.arraycopy(this.kjx, 2 + this.kkB, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }

  public final byte[] bff()
  {
    byte[] arrayOfByte = new byte[this.klc];
    System.arraycopy(this.kjx, 2 + (2 + this.kkB + this.klb), arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.aa
 * JD-Core Version:    0.6.2
 */