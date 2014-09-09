package oicq.wlogin_sdk.b;

public final class j extends a
{
  int kkU = 0;

  public j()
  {
    this.kjD = 264;
  }

  public final byte[] di(byte[] paramArrayOfByte)
  {
    this.kkU = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.kkU];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    rY(this.kjD);
    v(arrayOfByte, this.kkU);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.j
 * JD-Core Version:    0.6.2
 */