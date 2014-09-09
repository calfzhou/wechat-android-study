package com.tencent.mm.protocal;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.nio.charset.Charset;

public final class bd extends q
  implements o
{
  private String cPq = null;
  private byte[] dlr = null;
  private long hNS = 7L;
  private byte[] hNT;

  public final boolean aDH()
  {
    return true;
  }

  public final long aHd()
  {
    return this.hNS;
  }

  @TargetApi(9)
  public final String aHl()
  {
    if (this.dlr == null)
      return "";
    byte[] arrayOfByte;
    if (this.cPq == null)
    {
      arrayOfByte = MMProtocalJni.aesDecrypt(this.hNT, this.dlr);
      if (ch.B(arrayOfByte))
        return "";
      if (Build.VERSION.SDK_INT < 9)
        break label69;
    }
    label69: for (this.cPq = new String(arrayOfByte, Charset.forName("UTF-8")); ; this.cPq = new String(arrayOfByte))
      return this.cPq;
  }

  public final void aU(byte[] paramArrayOfByte)
  {
    this.dlr = paramArrayOfByte;
  }

  public final int getCmdId()
  {
    return 1000000205;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 12))
    {
      StringBuilder localStringBuilder = new StringBuilder("dksynccheck err resp buf:");
      if (paramArrayOfByte == null);
      for (int i = -1; ; i = paramArrayOfByte.length)
      {
        z.e("!32@/B4Tb64lLpLvtrHN/17JwFCpcNWAqzKG", i);
        return -1;
      }
    }
    this.hNS = (0xFF & paramArrayOfByte[3] | (0xFF & paramArrayOfByte[2]) << 8 | (0xFF & paramArrayOfByte[1]) << 16 | (0xFF & paramArrayOfByte[0]) << 24);
    int j = 0xFF & paramArrayOfByte[7] | (0xFF & paramArrayOfByte[6]) << 8 | (0xFF & paramArrayOfByte[5]) << 16 | (0xFF & paramArrayOfByte[4]) << 24;
    int k = 0xFF & paramArrayOfByte[11] | (0xFF & paramArrayOfByte[10]) << 8 | (0xFF & paramArrayOfByte[9]) << 16 | (0xFF & paramArrayOfByte[8]) << 24;
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Long.valueOf(this.hNS);
    arrayOfObject1[1] = Integer.valueOf(j);
    arrayOfObject1[2] = Integer.valueOf(k);
    z.d("!32@/B4Tb64lLpLvtrHN/17JwFCpcNWAqzKG", " fromProtoBuf oreh synccheck resp selector:%d, redCode:%d, keyLen:%d", arrayOfObject1);
    if (j != -3002)
    {
      this.cPq = "";
      return j;
    }
    if ((k != -12 + paramArrayOfByte.length) && (k != -16 + (-12 + paramArrayOfByte.length)))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(k);
      arrayOfObject2[1] = Integer.valueOf(paramArrayOfByte.length);
      z.e("!32@/B4Tb64lLpLvtrHN/17JwFCpcNWAqzKG", " the key len is invalid keyLen:%d, bufLen:%d", arrayOfObject2);
      return -1;
    }
    if (k == -16 + (-12 + paramArrayOfByte.length))
    {
      this.dlr = new byte[16];
      System.arraycopy(paramArrayOfByte, -16 + paramArrayOfByte.length, this.dlr, 0, 16);
    }
    this.hNT = new byte[k];
    System.arraycopy(paramArrayOfByte, 12, this.hNT, 0, k);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.bd
 * JD-Core Version:    0.6.2
 */