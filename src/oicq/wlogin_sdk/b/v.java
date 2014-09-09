package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class v extends a
{
  int kkZ = 0;

  public v()
  {
    this.kjD = 285;
  }

  public final Boolean beS()
  {
    if (this.kkC < 22)
      return Boolean.valueOf(false);
    this.kkZ = f.z(this.kjx, 16 + (4 + this.kkB));
    this.kkZ = (0xFFFF & this.kkZ);
    if (this.kkC < 22 + this.kkZ)
      return Boolean.valueOf(false);
    return Boolean.valueOf(true);
  }

  public final long beZ()
  {
    return 0xFFFFFFFF & f.A(this.kjx, this.kkB);
  }

  public final byte[] bfa()
  {
    byte[] arrayOfByte = new byte[16];
    System.arraycopy(this.kjx, 4 + this.kkB, arrayOfByte, 0, 16);
    return arrayOfByte;
  }

  public final byte[] bfb()
  {
    byte[] arrayOfByte = new byte[this.kkZ];
    System.arraycopy(this.kjx, 2 + (16 + (4 + this.kkB)), arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.v
 * JD-Core Version:    0.6.2
 */