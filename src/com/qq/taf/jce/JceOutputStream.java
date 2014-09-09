package com.qq.taf.jce;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JceOutputStream
{
  private ByteBuffer bs;
  protected String sServerEncoding = "GBK";

  public JceOutputStream()
  {
    this(128);
  }

  public JceOutputStream(int paramInt)
  {
    this.bs = ByteBuffer.allocate(paramInt);
  }

  public JceOutputStream(ByteBuffer paramByteBuffer)
  {
    this.bs = paramByteBuffer;
  }

  public static void main(String[] paramArrayOfString)
  {
    JceOutputStream localJceOutputStream = new JceOutputStream();
    localJceOutputStream.write(1311768467283714885L, 0);
    ByteBuffer localByteBuffer = localJceOutputStream.getByteBuffer();
    System.out.println(HexUtil.bytes2HexStr(localByteBuffer.array()));
    System.out.println(Arrays.toString(localJceOutputStream.toByteArray()));
  }

  private void writeArray(Object[] paramArrayOfObject, int paramInt)
  {
    reserve(8);
    writeHead((byte)9, paramInt);
    write(paramArrayOfObject.length, 0);
    int i = paramArrayOfObject.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      write(paramArrayOfObject[j], 0);
    }
  }

  public ByteBuffer getByteBuffer()
  {
    return this.bs;
  }

  public void reserve(int paramInt)
  {
    if (this.bs.remaining() < paramInt)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(2 * (paramInt + this.bs.capacity()));
      localByteBuffer.put(this.bs.array(), 0, this.bs.position());
      this.bs = localByteBuffer;
    }
  }

  public int setServerEncoding(String paramString)
  {
    this.sServerEncoding = paramString;
    return 0;
  }

  public byte[] toByteArray()
  {
    byte[] arrayOfByte = new byte[this.bs.position()];
    System.arraycopy(this.bs.array(), 0, arrayOfByte, 0, this.bs.position());
    return arrayOfByte;
  }

  public void write(byte paramByte, int paramInt)
  {
    reserve(3);
    if (paramByte == 0)
    {
      writeHead((byte)12, paramInt);
      return;
    }
    writeHead((byte)0, paramInt);
    this.bs.put(paramByte);
  }

  public void write(double paramDouble, int paramInt)
  {
    reserve(10);
    writeHead((byte)5, paramInt);
    this.bs.putDouble(paramDouble);
  }

  public void write(float paramFloat, int paramInt)
  {
    reserve(6);
    writeHead((byte)4, paramInt);
    this.bs.putFloat(paramFloat);
  }

  public void write(int paramInt1, int paramInt2)
  {
    reserve(6);
    if ((paramInt1 >= -32768) && (paramInt1 <= 32767))
    {
      write((short)paramInt1, paramInt2);
      return;
    }
    writeHead((byte)2, paramInt2);
    this.bs.putInt(paramInt1);
  }

  public void write(long paramLong, int paramInt)
  {
    reserve(10);
    if ((paramLong >= -2147483648L) && (paramLong <= 2147483647L))
    {
      write((int)paramLong, paramInt);
      return;
    }
    writeHead((byte)3, paramInt);
    this.bs.putLong(paramLong);
  }

  public void write(JceStruct paramJceStruct, int paramInt)
  {
    reserve(2);
    writeHead((byte)10, paramInt);
    paramJceStruct.writeTo(this);
    reserve(2);
    writeHead((byte)11, 0);
  }

  public void write(Boolean paramBoolean, int paramInt)
  {
    write(paramBoolean.booleanValue(), paramInt);
  }

  public void write(Byte paramByte, int paramInt)
  {
    write(paramByte.byteValue(), paramInt);
  }

  public void write(Double paramDouble, int paramInt)
  {
    write(paramDouble.doubleValue(), paramInt);
  }

  public void write(Float paramFloat, int paramInt)
  {
    write(paramFloat.floatValue(), paramInt);
  }

  public void write(Integer paramInteger, int paramInt)
  {
    write(paramInteger.intValue(), paramInt);
  }

  public void write(Long paramLong, int paramInt)
  {
    write(paramLong.longValue(), paramInt);
  }

  public void write(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof Byte))
    {
      write(((Byte)paramObject).byteValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      write(((Boolean)paramObject).booleanValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Short))
    {
      write(((Short)paramObject).shortValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      write(((Integer)paramObject).intValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Long))
    {
      write(((Long)paramObject).longValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Float))
    {
      write(((Float)paramObject).floatValue(), paramInt);
      return;
    }
    if ((paramObject instanceof Double))
    {
      write(((Double)paramObject).doubleValue(), paramInt);
      return;
    }
    if ((paramObject instanceof String))
    {
      write((String)paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof Map))
    {
      write((Map)paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof List))
    {
      write((List)paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof JceStruct))
    {
      write((JceStruct)paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      write((byte[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof boolean[]))
    {
      write((boolean[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof short[]))
    {
      write((short[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof int[]))
    {
      write((int[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof long[]))
    {
      write((long[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof float[]))
    {
      write((float[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof double[]))
    {
      write((double[])paramObject, paramInt);
      return;
    }
    if (paramObject.getClass().isArray())
    {
      writeArray((Object[])paramObject, paramInt);
      return;
    }
    if ((paramObject instanceof Collection))
    {
      write((Collection)paramObject, paramInt);
      return;
    }
    throw new JceEncodeException("write object error: unsupport type. " + paramObject.getClass());
  }

  public void write(Short paramShort, int paramInt)
  {
    write(paramShort.shortValue(), paramInt);
  }

  public void write(String paramString, int paramInt)
  {
    try
    {
      byte[] arrayOfByte2 = paramString.getBytes(this.sServerEncoding);
      arrayOfByte1 = arrayOfByte2;
      reserve(10 + arrayOfByte1.length);
      if (arrayOfByte1.length > 255)
      {
        writeHead((byte)7, paramInt);
        this.bs.putInt(arrayOfByte1.length);
        this.bs.put(arrayOfByte1);
        return;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      byte[] arrayOfByte1;
      while (true)
        arrayOfByte1 = paramString.getBytes();
      writeHead((byte)6, paramInt);
      this.bs.put((byte)arrayOfByte1.length);
      this.bs.put(arrayOfByte1);
    }
  }

  public void write(Collection paramCollection, int paramInt)
  {
    reserve(8);
    writeHead((byte)9, paramInt);
    int i;
    Iterator localIterator;
    if (paramCollection == null)
    {
      i = 0;
      write(i, 0);
      if (paramCollection != null)
        localIterator = paramCollection.iterator();
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        return;
        i = paramCollection.size();
        break;
      }
      write((Object)localIterator.next(), 0);
    }
  }

  public void write(Map paramMap, int paramInt)
  {
    reserve(8);
    writeHead((byte)8, paramInt);
    int i;
    Iterator localIterator;
    if (paramMap == null)
    {
      i = 0;
      write(i, 0);
      if (paramMap != null)
        localIterator = paramMap.entrySet().iterator();
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        return;
        i = paramMap.size();
        break;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      write(localEntry.getKey(), 0);
      write(localEntry.getValue(), 1);
    }
  }

  public void write(short paramShort, int paramInt)
  {
    reserve(4);
    if ((paramShort >= -128) && (paramShort <= 127))
    {
      write((byte)paramShort, paramInt);
      return;
    }
    writeHead((byte)1, paramInt);
    this.bs.putShort(paramShort);
  }

  public void write(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      write((byte)i, paramInt);
      return;
    }
  }

  public void write(byte[] paramArrayOfByte, int paramInt)
  {
    reserve(8 + paramArrayOfByte.length);
    writeHead((byte)13, paramInt);
    writeHead((byte)0, 0);
    write(paramArrayOfByte.length, 0);
    this.bs.put(paramArrayOfByte);
  }

  public void write(double[] paramArrayOfDouble, int paramInt)
  {
    reserve(8);
    writeHead((byte)9, paramInt);
    write(paramArrayOfDouble.length, 0);
    int i = paramArrayOfDouble.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      write(paramArrayOfDouble[j], 0);
    }
  }

  public void write(float[] paramArrayOfFloat, int paramInt)
  {
    reserve(8);
    writeHead((byte)9, paramInt);
    write(paramArrayOfFloat.length, 0);
    int i = paramArrayOfFloat.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      write(paramArrayOfFloat[j], 0);
    }
  }

  public void write(int[] paramArrayOfInt, int paramInt)
  {
    reserve(8);
    writeHead((byte)9, paramInt);
    write(paramArrayOfInt.length, 0);
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      write(paramArrayOfInt[j], 0);
    }
  }

  public void write(long[] paramArrayOfLong, int paramInt)
  {
    reserve(8);
    writeHead((byte)9, paramInt);
    write(paramArrayOfLong.length, 0);
    int i = paramArrayOfLong.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      write(paramArrayOfLong[j], 0);
    }
  }

  public void write(Object[] paramArrayOfObject, int paramInt)
  {
    writeArray(paramArrayOfObject, paramInt);
  }

  public void write(short[] paramArrayOfShort, int paramInt)
  {
    reserve(8);
    writeHead((byte)9, paramInt);
    write(paramArrayOfShort.length, 0);
    int i = paramArrayOfShort.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      write(paramArrayOfShort[j], 0);
    }
  }

  public void write(boolean[] paramArrayOfBoolean, int paramInt)
  {
    reserve(8);
    writeHead((byte)9, paramInt);
    write(paramArrayOfBoolean.length, 0);
    int i = paramArrayOfBoolean.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      write(paramArrayOfBoolean[j], 0);
    }
  }

  public void writeByteString(String paramString, int paramInt)
  {
    reserve(10 + paramString.length());
    byte[] arrayOfByte = HexUtil.hexStr2Bytes(paramString);
    if (arrayOfByte.length > 255)
    {
      writeHead((byte)7, paramInt);
      this.bs.putInt(arrayOfByte.length);
      this.bs.put(arrayOfByte);
      return;
    }
    writeHead((byte)6, paramInt);
    this.bs.put((byte)arrayOfByte.length);
    this.bs.put(arrayOfByte);
  }

  public void writeHead(byte paramByte, int paramInt)
  {
    if (paramInt < 15)
    {
      byte b2 = (byte)(paramByte | paramInt << 4);
      this.bs.put(b2);
      return;
    }
    if (paramInt < 256)
    {
      byte b1 = (byte)(paramByte | 0xF0);
      this.bs.put(b1);
      this.bs.put((byte)paramInt);
      return;
    }
    throw new JceEncodeException("tag is too large: " + paramInt);
  }

  public void writeStringByte(String paramString, int paramInt)
  {
    byte[] arrayOfByte = HexUtil.hexStr2Bytes(paramString);
    reserve(10 + arrayOfByte.length);
    if (arrayOfByte.length > 255)
    {
      writeHead((byte)7, paramInt);
      this.bs.putInt(arrayOfByte.length);
      this.bs.put(arrayOfByte);
      return;
    }
    writeHead((byte)6, paramInt);
    this.bs.put((byte)arrayOfByte.length);
    this.bs.put(arrayOfByte);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.JceOutputStream
 * JD-Core Version:    0.6.2
 */