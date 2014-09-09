package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class al extends a
{
  public int kll = 0;
  public int klm = 0;
  public int kln = 0;

  public al()
  {
    this.kjD = 326;
  }

  public final Boolean beS()
  {
    if (this.kkC < 12)
      return Boolean.valueOf(false);
    int i = f.z(this.kjx, 4 + this.kkB);
    if (this.kkC < i + 12)
      return Boolean.valueOf(false);
    this.kll = i;
    int j = f.z(this.kjx, 6 + this.kkB + this.kll);
    if (this.kkC < j + (12 + this.kll))
      return Boolean.valueOf(false);
    this.klm = j;
    int k = f.z(this.kjx, 10 + this.kkB + this.kll + this.klm);
    if (this.kkC < k + (12 + this.kll + this.klm))
      return Boolean.valueOf(false);
    this.kln = k;
    return Boolean.valueOf(true);
  }

  public final byte[] bfi()
  {
    byte[] arrayOfByte = new byte[this.kll];
    System.arraycopy(this.kjx, 6 + this.kkB, arrayOfByte, 0, this.kll);
    return arrayOfByte;
  }

  public final byte[] bfj()
  {
    byte[] arrayOfByte = new byte[this.klm];
    System.arraycopy(this.kjx, 8 + this.kkB + this.kll, arrayOfByte, 0, this.klm);
    return arrayOfByte;
  }

  public final byte[] bfk()
  {
    byte[] arrayOfByte = new byte[this.kln];
    System.arraycopy(this.kjx, 12 + this.kkB + this.kll + this.klm, arrayOfByte, 0, this.kln);
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.al
 * JD-Core Version:    0.6.2
 */