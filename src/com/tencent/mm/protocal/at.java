package com.tencent.mm.protocal;

import com.tencent.mm.sdk.platformtools.ch;

public final class at extends p
  implements n
{
  byte[] cJw = null;
  long hNN = -1L;

  public final void aS(byte[] paramArrayOfByte)
  {
    this.cJw = paramArrayOfByte;
  }

  public final void cE(long paramLong)
  {
    this.hNN = paramLong;
  }

  public final int getCmdId()
  {
    return 1000000190;
  }

  public final int sV()
  {
    return 268369922;
  }

  public final byte[] sW()
  {
    byte[] arrayOfByte = new byte[8 + this.cJw.length];
    int i = (int)(ch.CM() - this.hNN);
    arrayOfByte[0] = ((byte)(0xFF & i >> 24));
    arrayOfByte[1] = ((byte)(0xFF & i >> 16));
    arrayOfByte[2] = ((byte)(0xFF & i >> 8));
    arrayOfByte[3] = ((byte)(i & 0xFF));
    arrayOfByte[4] = ((byte)(0xFF & this.cJw.length >> 24));
    arrayOfByte[5] = ((byte)(0xFF & this.cJw.length >> 16));
    arrayOfByte[6] = ((byte)(0xFF & this.cJw.length >> 8));
    arrayOfByte[7] = ((byte)(0xFF & this.cJw.length));
    System.arraycopy(this.cJw, 0, arrayOfByte, 8, this.cJw.length);
    ch.cF(arrayOfByte);
    return arrayOfByte;
  }

  public final boolean tM()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.at
 * JD-Core Version:    0.6.2
 */