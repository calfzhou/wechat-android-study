package com.tencent.mm.sdk.platformtools;

import java.nio.ByteBuffer;

public final class ad
{
  private ByteBuffer As;
  private boolean iEk;

  private int os(int paramInt)
  {
    if (this.As.limit() - this.As.position() > paramInt)
      return 0;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4096 + this.As.limit());
    localByteBuffer.put(this.As.array(), 0, this.As.position());
    this.As = localByteBuffer;
    return 0;
  }

  public final int AM(String paramString)
  {
    if (!this.iEk)
      throw new Exception("Buffer For Parse");
    byte[] arrayOfByte = null;
    if (paramString != null)
      arrayOfByte = paramString.getBytes();
    if (arrayOfByte == null)
      arrayOfByte = new byte[0];
    if (arrayOfByte.length > 2048)
      throw new Exception("Buffer String Length Error");
    os(2 + arrayOfByte.length);
    this.As.putShort((short)arrayOfByte.length);
    if (arrayOfByte.length > 0)
      this.As.put(arrayOfByte);
    return 0;
  }

  public final void aNo()
  {
    if (this.iEk)
      throw new Exception("Buffer For Build");
    int i = this.As.getShort();
    if (i > 2048)
    {
      this.As = null;
      throw new Exception("Buffer String Length Error");
    }
    if (i == 0)
      return;
    this.As.position(i + this.As.position());
  }

  public final boolean aNp()
  {
    return this.As.limit() - this.As.position() <= 1;
  }

  public final int aNq()
  {
    this.As = ByteBuffer.allocate(4096);
    this.As.put((byte)123);
    this.iEk = true;
    return 0;
  }

  public final byte[] aNr()
  {
    if (!this.iEk)
      throw new Exception("Buffer For Parse");
    os(1);
    this.As.put((byte)125);
    byte[] arrayOfByte = new byte[this.As.position()];
    System.arraycopy(this.As.array(), 0, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }

  public final int cO(long paramLong)
  {
    if (!this.iEk)
      throw new Exception("Buffer For Parse");
    os(8);
    this.As.putLong(paramLong);
    return 0;
  }

  public final int cQ(byte[] paramArrayOfByte)
  {
    int i;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      i = -1;
    while (i != 0)
    {
      this.As = null;
      return -1;
      if (paramArrayOfByte[0] != 123)
        i = -2;
      else if (paramArrayOfByte[(-1 + paramArrayOfByte.length)] != 125)
        i = -3;
      else
        i = 0;
    }
    this.As = ByteBuffer.wrap(paramArrayOfByte);
    this.As.position(1);
    this.iEk = false;
    return 0;
  }

  public final int getInt()
  {
    if (this.iEk)
      throw new Exception("Buffer For Build");
    return this.As.getInt();
  }

  public final long getLong()
  {
    if (this.iEk)
      throw new Exception("Buffer For Build");
    return this.As.getLong();
  }

  public final String getString()
  {
    if (this.iEk)
      throw new Exception("Buffer For Build");
    int i = this.As.getShort();
    if (i > 2048)
    {
      this.As = null;
      throw new Exception("Buffer String Length Error");
    }
    if (i == 0)
      return "";
    byte[] arrayOfByte = new byte[i];
    this.As.get(arrayOfByte, 0, i);
    return new String(arrayOfByte, "UTF-8");
  }

  public final void or(int paramInt)
  {
    this.As.position(paramInt + this.As.position());
  }

  public final int ot(int paramInt)
  {
    if (!this.iEk)
      throw new Exception("Buffer For Parse");
    os(4);
    this.As.putInt(paramInt);
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ad
 * JD-Core Version:    0.6.2
 */