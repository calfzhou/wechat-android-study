package com.tencent.mm.plugin.c.a.a;

public final class a
{
  private int ehZ = 20;
  private int eia = 0;
  private int eib = 0;
  private byte[] mData = null;

  public final byte[] HN()
  {
    int i = this.eib - this.eia;
    if (i == 0)
      return null;
    if (i < this.ehZ);
    while (true)
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.mData, this.eia, arrayOfByte, 0, i);
      this.eia = (i + this.eia);
      return arrayOfByte;
      i = this.ehZ;
    }
  }

  public final void setData(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      this.mData = null;
      this.eib = 0;
      this.eia = 0;
      return;
    }
    this.mData = new byte[paramArrayOfByte.length];
    System.arraycopy(paramArrayOfByte, 0, this.mData, 0, paramArrayOfByte.length);
    this.eib = paramArrayOfByte.length;
    this.eia = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.a
 * JD-Core Version:    0.6.2
 */