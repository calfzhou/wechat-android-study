package com.qq.a.a;

import com.qq.taf.RequestPacket;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceUtil;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.HashMap;

public final class d extends c
{
  static HashMap Kz = null;
  protected RequestPacket Ky = new RequestPacket();

  public d()
  {
    this.Ky.iVersion = 2;
  }

  public final void R(String paramString)
  {
    this.Ky.sServantName = paramString;
  }

  public final void S(String paramString)
  {
    this.Ky.sFuncName = paramString;
  }

  public final void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 4)
      throw new IllegalArgumentException("decode package must include size head");
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    byte[] arrayOfByte1 = new byte[4];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, 4);
    localByteBuffer.put(arrayOfByte1).flip();
    int i = -4 + localByteBuffer.getInt();
    byte[] arrayOfByte2 = new byte[i];
    System.arraycopy(paramArrayOfByte, 4, arrayOfByte2, 0, i);
    try
    {
      JceInputStream localJceInputStream1 = new JceInputStream(arrayOfByte2);
      localJceInputStream1.setServerEncoding(this.Kw);
      readFrom(localJceInputStream1);
      JceInputStream localJceInputStream2 = new JceInputStream(this.Ky.sBuffer);
      localJceInputStream2.setServerEncoding(this.Kw);
      if (Kz == null)
      {
        Kz = new HashMap();
        HashMap localHashMap = new HashMap();
        localHashMap.put("", new byte[0]);
        Kz.put("", localHashMap);
      }
      this.Kr = localJceInputStream2.readMap(Kz, 0, false);
      return;
    }
    catch (Exception localException)
    {
      System.out.println("decode error " + e.bytes2HexStr(paramArrayOfByte));
      throw new RuntimeException(localException);
    }
  }

  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    this.Ky.display(paramStringBuilder, paramInt);
  }

  public final byte[] gO()
  {
    if (this.Ky.sServantName.equals(""))
      throw new IllegalArgumentException("servantName can not is null");
    if (this.Ky.sFuncName.equals(""))
      throw new IllegalArgumentException("funcName can not is null");
    JceOutputStream localJceOutputStream1 = new JceOutputStream(0);
    localJceOutputStream1.setServerEncoding(this.Kw);
    localJceOutputStream1.write(this.Kr, 0);
    this.Ky.sBuffer = JceUtil.getJceBufArray(localJceOutputStream1.getByteBuffer());
    JceOutputStream localJceOutputStream2 = new JceOutputStream(0);
    localJceOutputStream2.setServerEncoding(this.Kw);
    writeTo(localJceOutputStream2);
    byte[] arrayOfByte = JceUtil.getJceBufArray(localJceOutputStream2.getByteBuffer());
    int i = arrayOfByte.length;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i + 4);
    localByteBuffer.putInt(i + 4).put(arrayOfByte).flip();
    return localByteBuffer.array();
  }

  public final void put(String paramString, Object paramObject)
  {
    if (paramString.startsWith("."))
      throw new IllegalArgumentException("put name can not startwith . ");
    super.put(paramString, paramObject);
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.Ky.readFrom(paramJceInputStream);
  }

  public final void setRequestId(int paramInt)
  {
    this.Ky.iRequestId = paramInt;
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    this.Ky.writeTo(paramJceOutputStream);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.a.a.d
 * JD-Core Version:    0.6.2
 */