package oicq.wlogin_sdk.b;

public final class k extends a
{
  int kkV = 0;

  public k()
  {
    this.kjD = 265;
  }

  public final byte[] dj(byte[] paramArrayOfByte)
  {
    this.kkV = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.kkV];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    rY(this.kjD);
    v(arrayOfByte, this.kkV);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.k
 * JD-Core Version:    0.6.2
 */