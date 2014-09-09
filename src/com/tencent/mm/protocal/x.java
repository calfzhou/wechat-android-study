package com.tencent.mm.protocal;

import com.tencent.mm.a.a;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import junit.framework.Assert;

public final class x extends p
  implements n
{
  private int cEg = 0;
  private int cGN = 0;
  private int ebz = 0;
  private String hNy = "";
  private byte[] hNz = new byte[0];

  private byte[] aHb()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      localDataOutputStream.writeInt(this.ebz);
      localDataOutputStream.writeShort(this.hNy.getBytes().length);
      localDataOutputStream.write(this.hNy.getBytes());
      localDataOutputStream.writeShort(this.hNz.length);
      localDataOutputStream.write(this.hNz);
      localDataOutputStream.close();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      while (true)
        z.e("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "direct merge tail failed, err=" + localIOException.getMessage());
    }
  }

  private byte[] aQ(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      localDataOutputStream.writeByte(this.cEg);
      localDataOutputStream.writeByte(this.cGN);
      localDataOutputStream.write(paramArrayOfByte);
      localDataOutputStream.close();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      while (true)
        z.e("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "direct merge all failed, err=" + localIOException.getMessage());
    }
  }

  public final boolean aDH()
  {
    return true;
  }

  public final void aHa()
  {
    this.cGN = 0;
  }

  public final void aP(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.hNz = paramArrayOfByte;
      return;
    }
  }

  public final int getCmdId()
  {
    return 8;
  }

  public final void nv(int paramInt)
  {
    this.cEg = 111;
  }

  public final void nw(int paramInt)
  {
    this.ebz = paramInt;
  }

  public final int sV()
  {
    return 10;
  }

  public final byte[] sW()
  {
    byte[] arrayOfByte = aHb();
    PByteArray localPByteArray = new PByteArray();
    a.a(localPByteArray, arrayOfByte, w.wp(super.tI()));
    return aQ(localPByteArray.value);
  }

  public final boolean tM()
  {
    return false;
  }

  public final void wq(String paramString)
  {
    if (paramString != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.hNy = paramString;
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.x
 * JD-Core Version:    0.6.2
 */