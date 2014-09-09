package com.tencent.qqpinyin.voicerecoapi;

public final class a
{
  public static int kdr = 2000;
  private byte[] kds = null;
  private byte[] kdt = null;
  private int kdu = 0;
  private int kdv = 0;
  TRSpeexNative kdw = new TRSpeexNative();

  public final int bdl()
  {
    int i;
    if (this.kdu != 0)
      i = -103;
    do
    {
      return i;
      i = this.kdw.nativeTRSpeexInit();
    }
    while (i == -1);
    this.kdu = i;
    this.kds = new byte[10 * kdr];
    return 0;
  }

  public final int bdm()
  {
    if (this.kdu == 0)
      return -102;
    this.kds = null;
    int i = this.kdw.nativeTRSpeexRelease(this.kdu);
    this.kdu = 0;
    return i;
  }

  public final int bdn()
  {
    int i;
    if (this.kdv != 0)
      i = -103;
    do
    {
      return i;
      i = this.kdw.nativeTRSpeexDecodeInit();
    }
    while (i == -1);
    this.kdv = i;
    this.kdt = new byte[15 * kdr];
    return 0;
  }

  public final int bdo()
  {
    if (this.kdv == 0)
      return -102;
    this.kdt = null;
    int i = this.kdw.nativeTRSpeexDecodeRelease(this.kdv);
    this.kdv = 0;
    return i;
  }

  public final byte[] q(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.kdu == 0)
      throw new b(-102);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      throw new b(-104);
    int i = this.kdw.nativeTRSpeexEncode(this.kdu, paramArrayOfByte, 0, paramInt, this.kds);
    if (i < 0)
      throw new b(i);
    if (i == 0)
      return null;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(this.kds, 0, arrayOfByte, 0, i);
    return arrayOfByte;
  }

  public final byte[] r(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.kdv == 0)
      throw new b(-102);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      throw new b(-104);
    int i = this.kdw.nativeTRSpeexDecode(this.kdv, paramArrayOfByte, 0, paramInt, this.kdt);
    if (i < 0)
      throw new b(i);
    if (i == 0)
      return null;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(this.kdt, 0, arrayOfByte, 0, i);
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.qqpinyin.voicerecoapi.a
 * JD-Core Version:    0.6.2
 */