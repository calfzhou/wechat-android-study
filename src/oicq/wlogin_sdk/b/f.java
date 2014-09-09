package oicq.wlogin_sdk.b;

public final class f extends a
{
  int kkL = 0;

  public f()
  {
    this.kjD = 260;
  }

  public final byte[] dh(byte[] paramArrayOfByte)
  {
    this.kkL = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.kkL];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    rY(this.kjD);
    v(arrayOfByte, this.kkL);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.f
 * JD-Core Version:    0.6.2
 */