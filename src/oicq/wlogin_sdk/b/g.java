package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class g extends a
{
  int kkM = 0;
  int kkN = 0;
  int kkO = 0;
  int kkP = 0;

  public g()
  {
    this.kjD = 261;
  }

  public final Boolean beS()
  {
    if (this.kkC < 2)
      return Boolean.valueOf(false);
    this.kkN = f.z(this.kjx, this.kkB);
    if (this.kkC < 2 + (2 + this.kkN))
      return Boolean.valueOf(false);
    this.kkM = f.z(this.kjx, 2 + this.kkB + this.kkN);
    if (this.kkC < 2 + (2 + this.kkN) + this.kkM)
      return Boolean.valueOf(false);
    this.kkP = (2 + this.kkB);
    this.kkO = (2 + (2 + this.kkN) + this.kkB);
    return Boolean.valueOf(true);
  }

  public final byte[] beT()
  {
    byte[] arrayOfByte = new byte[this.kkM];
    if (this.kkM <= 0)
      return arrayOfByte;
    System.arraycopy(this.kjx, this.kkO, arrayOfByte, 0, this.kkM);
    return arrayOfByte;
  }

  public final byte[] beU()
  {
    byte[] arrayOfByte = new byte[this.kkN];
    if (this.kkN <= 0)
      return arrayOfByte;
    System.arraycopy(this.kjx, this.kkP, arrayOfByte, 0, this.kkN);
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.g
 * JD-Core Version:    0.6.2
 */