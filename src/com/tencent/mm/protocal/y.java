package com.tencent.mm.protocal;

import com.tencent.mm.a.a;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public final class y extends q
  implements o
{
  private int cEg = 0;
  private int cGN = 0;
  private byte[] content = new byte[0];
  private String dCB = "";
  private int ebz = 0;
  private String hNA = "";

  private byte[] aR(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 2))
    {
      z.e("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "parse all failed, empty buf");
      return null;
    }
    byte[] arrayOfByte = new byte[-2 + paramArrayOfByte.length];
    try
    {
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
      DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
      this.cEg = localDataInputStream.readByte();
      this.cGN = localDataInputStream.readByte();
      localDataInputStream.readFully(arrayOfByte);
      z.d("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "cmdId:" + this.cEg + ", flag=" + this.cGN + ", tail len=" + arrayOfByte.length);
      localByteArrayInputStream.close();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      z.e("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "direct parse all failed, err=" + localIOException.getMessage());
    }
    return arrayOfByte;
  }

  public final boolean aDH()
  {
    return true;
  }

  public final void fo(String paramString)
  {
    this.hNA = paramString;
  }

  public final int getCmdId()
  {
    return 8;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = w.wp(this.hNA);
    PByteArray localPByteArray = new PByteArray();
    if (a.b(localPByteArray, aR(paramArrayOfByte), arrayOfByte1) != 0)
    {
      byte[] arrayOfByte4 = new byte[16];
      for (int k = 0; k < 16; k++)
        arrayOfByte4[k] = 0;
      if (a.b(localPByteArray, aR(paramArrayOfByte), arrayOfByte4) != 0)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = ch.cF(arrayOfByte1);
        z.e("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "decrypting from buffer using key=%s error", arrayOfObject);
        return -1;
      }
    }
    byte[] arrayOfByte2 = localPByteArray.value;
    if (arrayOfByte2 == null)
    {
      z.e("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "parse tail failed, empty buf");
      return 0;
    }
    DataInputStream localDataInputStream;
    int i;
    try
    {
      localDataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte2));
      this.ebz = localDataInputStream.readInt();
      z.d("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "seq=" + this.ebz);
      i = localDataInputStream.readShort();
      if (i < 0)
        throw new IOException("sender empty");
    }
    catch (IOException localIOException)
    {
      z.e("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "direct parse all failed, err=" + localIOException.getMessage());
      return 0;
    }
    byte[] arrayOfByte3 = new byte[i];
    localDataInputStream.readFully(arrayOfByte3);
    this.dCB = new String(arrayOfByte3);
    z.d("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "recievers len=" + i + ", sender=" + this.dCB);
    int j = localDataInputStream.readShort();
    if (j < 0)
      throw new IOException("content empty");
    this.content = new byte[j];
    localDataInputStream.readFully(this.content);
    z.d("!32@/B4Tb64lLpI4Uvj4juC2KG7/IKjuiFml", "content len=" + this.content.length);
    return 0;
  }

  public final String zj()
  {
    return this.dCB;
  }

  public final byte[] zk()
  {
    return this.content;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.y
 * JD-Core Version:    0.6.2
 */