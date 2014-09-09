package com.tencent.mm.protocal;

import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Locale;

public final class bc extends p
  implements n
{
  private byte[] dlr;
  private byte[] eqj = new byte[0];
  private int uin = 0;

  public final boolean aDH()
  {
    return true;
  }

  public final byte[] aHc()
  {
    return this.dlr;
  }

  public final void aT(byte[] paramArrayOfByte)
  {
    this.eqj = paramArrayOfByte;
  }

  public final void bk(int paramInt)
  {
    this.uin = paramInt;
  }

  public final int getCmdId()
  {
    return 205;
  }

  public final int sV()
  {
    return 0;
  }

  public final byte[] sW()
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.uin);
    if (this.eqj == null);
    for (int i = -1; ; i = this.eqj.length)
    {
      arrayOfObject1[1] = Integer.valueOf(i);
      z.d("!32@/B4Tb64lLpLvtrHN/17JwFCpcNWAqzKG", "toProtoBuf dksynccheck uin:%d keybuf:%d", arrayOfObject1);
      if ((this.uin != 0) && (!ch.B(this.eqj)))
        break;
      return new byte[0];
    }
    int j = 0x5601F281 ^ (0x7FFFF & this.uin >> 13 | this.eqj.length << 19);
    int k = 0x5601F281 ^ (0x7FFFF & this.eqj.length >> 13 | this.uin << 19);
    byte[] arrayOfByte1 = new byte[20 + this.eqj.length];
    Object[] arrayOfObject2 = new Object[5];
    arrayOfObject2[0] = Integer.valueOf(this.uin);
    arrayOfObject2[1] = Integer.valueOf(j);
    arrayOfObject2[2] = Integer.valueOf(this.eqj.length);
    arrayOfObject2[3] = Integer.valueOf(k);
    arrayOfObject2[4] = Integer.valueOf(arrayOfByte1.length);
    z.d("!32@/B4Tb64lLpLvtrHN/17JwFCpcNWAqzKG", "dksynccheck uin=[%d/%d], keyBufLen=[%d/%d] outBuf=[%d]", arrayOfObject2);
    arrayOfByte1[0] = ((byte)(0xFF & j >> 24));
    arrayOfByte1[1] = ((byte)(0xFF & j >> 16));
    arrayOfByte1[2] = ((byte)(0xFF & j >> 8));
    arrayOfByte1[3] = ((byte)(j & 0xFF));
    arrayOfByte1[4] = ((byte)(0xFF & k >> 24));
    arrayOfByte1[5] = ((byte)(0xFF & k >> 16));
    arrayOfByte1[6] = ((byte)(0xFF & k >> 8));
    arrayOfByte1[7] = ((byte)(k & 0xFF));
    System.arraycopy(this.eqj, 0, arrayOfByte1, 8, this.eqj.length);
    arrayOfByte1[(-12 + arrayOfByte1.length)] = ((byte)(0xFF & a.hrn >> 24));
    arrayOfByte1[(-11 + arrayOfByte1.length)] = ((byte)(0xFF & a.hrn >> 16));
    arrayOfByte1[(-10 + arrayOfByte1.length)] = ((byte)(0xFF & a.hrn >> 8));
    arrayOfByte1[(-9 + arrayOfByte1.length)] = ((byte)(0xFF & a.hrn));
    String str = Locale.getDefault().toString();
    if (str.length() > 8)
      str = str.substring(0, 8);
    byte[] arrayOfByte2 = str.getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, -8 + arrayOfByte1.length, arrayOfByte2.length);
    this.dlr = f.e(arrayOfByte1);
    return arrayOfByte1;
  }

  public final boolean tM()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.bc
 * JD-Core Version:    0.6.2
 */