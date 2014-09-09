package com.qq.taf.jce;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class JceInputStream
{
  private ByteBuffer bs;
  protected String sServerEncoding = "GBK";

  public JceInputStream()
  {
  }

  public JceInputStream(ByteBuffer paramByteBuffer)
  {
    this.bs = paramByteBuffer;
  }

  public JceInputStream(byte[] paramArrayOfByte)
  {
    this.bs = ByteBuffer.wrap(paramArrayOfByte);
  }

  public JceInputStream(byte[] paramArrayOfByte, int paramInt)
  {
    this.bs = ByteBuffer.wrap(paramArrayOfByte);
    this.bs.position(paramInt);
  }

  public static void main(String[] paramArrayOfString)
  {
  }

  private int peakHead(JceInputStream.HeadData paramHeadData)
  {
    return readHead(paramHeadData, this.bs.duplicate());
  }

  private Object[] readArrayImpl(Object paramObject, int paramInt, boolean paramBoolean)
  {
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 9:
      }
      int i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      Object[] arrayOfObject = (Object[])Array.newInstance(paramObject.getClass(), i);
      for (int j = 0; ; j++)
      {
        if (j >= i)
          return arrayOfObject;
        arrayOfObject[j] = read(paramObject, 0, true);
      }
    }
    if (paramBoolean)
      throw new JceDecodeException("require field not exist.");
    return null;
  }

  public static int readHead(JceInputStream.HeadData paramHeadData, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get();
    paramHeadData.type = ((byte)(i & 0xF));
    paramHeadData.tag = ((i & 0xF0) >> 4);
    if (paramHeadData.tag == 15)
    {
      paramHeadData.tag = (0xFF & paramByteBuffer.get());
      return 2;
    }
    return 1;
  }

  private Map readMap(Map paramMap1, Map paramMap2, int paramInt, boolean paramBoolean)
  {
    if ((paramMap2 == null) || (paramMap2.isEmpty()))
      paramMap1 = new HashMap();
    do
      while (true)
      {
        return paramMap1;
        Map.Entry localEntry = (Map.Entry)paramMap2.entrySet().iterator().next();
        Object localObject1 = localEntry.getKey();
        Object localObject2 = localEntry.getValue();
        if (!skipToTag(paramInt))
          break;
        JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
        readHead(localHeadData);
        switch (localHeadData.type)
        {
        default:
          throw new JceDecodeException("type mismatch.");
        case 8:
        }
        int i = read(0, 0, true);
        if (i < 0)
          throw new JceDecodeException("size invalid: " + i);
        for (int j = 0; j < i; j++)
          paramMap1.put(read(localObject1, 0, true), read(localObject2, 1, true));
      }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  private void skip(int paramInt)
  {
    this.bs.position(paramInt + this.bs.position());
  }

  private void skipField()
  {
    JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
    readHead(localHeadData);
    skipField(localHeadData.type);
  }

  private void skipField(byte paramByte)
  {
    int i = 0;
    switch (paramByte)
    {
    default:
      throw new JceDecodeException("invalid type.");
    case 0:
      skip(1);
    case 11:
    case 12:
      return;
    case 1:
      skip(2);
      return;
    case 2:
      skip(4);
      return;
    case 3:
      skip(8);
      return;
    case 4:
      skip(4);
      return;
    case 5:
      skip(8);
      return;
    case 6:
      int m = this.bs.get();
      if (m < 0)
        m += 256;
      skip(m);
      return;
    case 7:
      skip(this.bs.getInt());
      return;
    case 8:
      int k = read(0, 0, true);
      while (i < k * 2)
      {
        skipField();
        i++;
      }
    case 9:
      int j = read(0, 0, true);
      while (i < j)
      {
        skipField();
        i++;
      }
    case 13:
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      if (localHeadData.type != 0)
        throw new JceDecodeException("skipField with invalid type, type value: " + paramByte + ", " + localHeadData.type);
      skip(read(0, 0, true));
      return;
    case 10:
    }
    skipToStructEnd();
  }

  public final JceStruct directRead(JceStruct paramJceStruct, int paramInt, boolean paramBoolean)
  {
    JceStruct localJceStruct1;
    if (skipToTag(paramInt))
    {
      try
      {
        JceStruct localJceStruct2 = paramJceStruct.newInit();
        localJceStruct1 = localJceStruct2;
        JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
        readHead(localHeadData);
        if (localHeadData.type != 10)
          throw new JceDecodeException("type mismatch.");
      }
      catch (Exception localException)
      {
        throw new JceDecodeException(localException.getMessage());
      }
      localJceStruct1.readFrom(this);
      skipToStructEnd();
    }
    do
    {
      return localJceStruct1;
      localJceStruct1 = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final ByteBuffer getBs()
  {
    return this.bs;
  }

  public final byte read(byte paramByte, int paramInt, boolean paramBoolean)
  {
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 12:
        paramByte = 0;
      case 0:
      }
    }
    while (!paramBoolean)
    {
      JceInputStream.HeadData localHeadData;
      return paramByte;
      return this.bs.get();
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final double read(double paramDouble, int paramInt, boolean paramBoolean)
  {
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 12:
        paramDouble = 0.0D;
      case 4:
      case 5:
      }
    }
    while (!paramBoolean)
    {
      JceInputStream.HeadData localHeadData;
      return paramDouble;
      return this.bs.getFloat();
      return this.bs.getDouble();
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final float read(float paramFloat, int paramInt, boolean paramBoolean)
  {
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 12:
        paramFloat = 0.0F;
      case 4:
      }
    }
    while (!paramBoolean)
    {
      JceInputStream.HeadData localHeadData;
      return paramFloat;
      return this.bs.getFloat();
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final int read(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (skipToTag(paramInt2))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 12:
        paramInt1 = 0;
      case 0:
      case 1:
      case 2:
      }
    }
    while (!paramBoolean)
    {
      JceInputStream.HeadData localHeadData;
      return paramInt1;
      return this.bs.get();
      return this.bs.getShort();
      return this.bs.getInt();
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final long read(long paramLong, int paramInt, boolean paramBoolean)
  {
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 12:
        paramLong = 0L;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (!paramBoolean)
    {
      JceInputStream.HeadData localHeadData;
      return paramLong;
      return this.bs.get();
      return this.bs.getShort();
      return this.bs.getInt();
      return this.bs.getLong();
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final JceStruct read(JceStruct paramJceStruct, int paramInt, boolean paramBoolean)
  {
    JceStruct localJceStruct;
    if (skipToTag(paramInt))
    {
      try
      {
        localJceStruct = (JceStruct)paramJceStruct.getClass().newInstance();
        JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
        readHead(localHeadData);
        if (localHeadData.type != 10)
          throw new JceDecodeException("type mismatch.");
      }
      catch (Exception localException)
      {
        throw new JceDecodeException(localException.getMessage());
      }
      localJceStruct.readFrom(this);
      skipToStructEnd();
    }
    do
    {
      return localJceStruct;
      localJceStruct = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final Object read(Object paramObject, int paramInt, boolean paramBoolean)
  {
    if ((paramObject instanceof Byte))
      return Byte.valueOf(read((byte)0, paramInt, paramBoolean));
    if ((paramObject instanceof Boolean))
      return Boolean.valueOf(read(false, paramInt, paramBoolean));
    if ((paramObject instanceof Short))
      return Short.valueOf(read((short)0, paramInt, paramBoolean));
    if ((paramObject instanceof Integer))
      return Integer.valueOf(read(0, paramInt, paramBoolean));
    if ((paramObject instanceof Long))
      return Long.valueOf(read(0L, paramInt, paramBoolean));
    if ((paramObject instanceof Float))
      return Float.valueOf(read(0.0F, paramInt, paramBoolean));
    if ((paramObject instanceof Double))
      return Double.valueOf(read(0.0D, paramInt, paramBoolean));
    if ((paramObject instanceof String))
      return readString(paramInt, paramBoolean);
    if ((paramObject instanceof Map))
      return readMap((Map)paramObject, paramInt, paramBoolean);
    if ((paramObject instanceof List))
      return readArray((List)paramObject, paramInt, paramBoolean);
    if ((paramObject instanceof JceStruct))
      return read((JceStruct)paramObject, paramInt, paramBoolean);
    if (paramObject.getClass().isArray())
    {
      if (((paramObject instanceof byte[])) || ((paramObject instanceof Byte[])))
        return read(null, paramInt, paramBoolean);
      if ((paramObject instanceof boolean[]))
        return read(null, paramInt, paramBoolean);
      if ((paramObject instanceof short[]))
        return read(null, paramInt, paramBoolean);
      if ((paramObject instanceof int[]))
        return read(null, paramInt, paramBoolean);
      if ((paramObject instanceof long[]))
        return read(null, paramInt, paramBoolean);
      if ((paramObject instanceof float[]))
        return read(null, paramInt, paramBoolean);
      if ((paramObject instanceof double[]))
        return read(null, paramInt, paramBoolean);
      return readArray((Object[])paramObject, paramInt, paramBoolean);
    }
    throw new JceDecodeException("read object error: unsupport type.");
  }

  public final String read(String paramString, int paramInt, boolean paramBoolean)
  {
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 6:
        j = this.bs.get();
        if (j < 0)
          j += 256;
        arrayOfByte2 = new byte[j];
        this.bs.get(arrayOfByte2);
      case 7:
      }
    }
    while (!paramBoolean)
    {
      try
      {
        JceInputStream.HeadData localHeadData;
        int j;
        paramString = new String(arrayOfByte2, this.sServerEncoding);
        return paramString;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        byte[] arrayOfByte2;
        return new String(arrayOfByte2);
      }
      int i = this.bs.getInt();
      if ((i > 104857600) || (i < 0))
        throw new JceDecodeException("String too long: " + i);
      byte[] arrayOfByte1 = new byte[i];
      this.bs.get(arrayOfByte1);
      try
      {
        String str = new String(arrayOfByte1, this.sServerEncoding);
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        return new String(arrayOfByte1);
      }
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final short read(short paramShort, int paramInt, boolean paramBoolean)
  {
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 12:
        paramShort = 0;
      case 0:
      case 1:
      }
    }
    while (!paramBoolean)
    {
      JceInputStream.HeadData localHeadData;
      return paramShort;
      return (short)this.bs.get();
      return this.bs.getShort();
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final boolean read(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    int i = read((byte)0, paramInt, paramBoolean2);
    boolean bool = false;
    if (i != 0)
      bool = true;
    return bool;
  }

  public final byte[] read(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    byte[] arrayOfByte;
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData1 = new JceInputStream.HeadData();
      readHead(localHeadData1);
      switch (localHeadData1.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 13:
        JceInputStream.HeadData localHeadData2 = new JceInputStream.HeadData();
        readHead(localHeadData2);
        if (localHeadData2.type != 0)
          throw new JceDecodeException("type mismatch, tag: " + paramInt + ", type: " + localHeadData1.type + ", " + localHeadData2.type);
        int k = read(0, 0, true);
        if (k < 0)
          throw new JceDecodeException("invalid size, tag: " + paramInt + ", type: " + localHeadData1.type + ", " + localHeadData2.type + ", size: " + k);
        arrayOfByte = new byte[k];
        this.bs.get(arrayOfByte);
      case 9:
      }
    }
    do
    {
      while (true)
      {
        return arrayOfByte;
        int i = read(0, 0, true);
        if (i < 0)
          throw new JceDecodeException("size invalid: " + i);
        arrayOfByte = new byte[i];
        for (int j = 0; j < i; j++)
          arrayOfByte[j] = read(arrayOfByte[0], 0, true);
      }
      arrayOfByte = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final double[] read(double[] paramArrayOfDouble, int paramInt, boolean paramBoolean)
  {
    double[] arrayOfDouble;
    int j;
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 9:
      }
      int i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      arrayOfDouble = new double[i];
      j = 0;
      if (j < i);
    }
    do
    {
      return arrayOfDouble;
      arrayOfDouble[j] = read(arrayOfDouble[0], 0, true);
      j++;
      break;
      arrayOfDouble = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final float[] read(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
  {
    float[] arrayOfFloat;
    int j;
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 9:
      }
      int i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      arrayOfFloat = new float[i];
      j = 0;
      if (j < i);
    }
    do
    {
      return arrayOfFloat;
      arrayOfFloat[j] = read(arrayOfFloat[0], 0, true);
      j++;
      break;
      arrayOfFloat = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final int[] read(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    int[] arrayOfInt;
    int j;
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 9:
      }
      int i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      arrayOfInt = new int[i];
      j = 0;
      if (j < i);
    }
    do
    {
      return arrayOfInt;
      arrayOfInt[j] = read(arrayOfInt[0], 0, true);
      j++;
      break;
      arrayOfInt = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final long[] read(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    long[] arrayOfLong;
    int j;
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 9:
      }
      int i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      arrayOfLong = new long[i];
      j = 0;
      if (j < i);
    }
    do
    {
      return arrayOfLong;
      arrayOfLong[j] = read(arrayOfLong[0], 0, true);
      j++;
      break;
      arrayOfLong = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final JceStruct[] read(JceStruct[] paramArrayOfJceStruct, int paramInt, boolean paramBoolean)
  {
    return (JceStruct[])readArray(paramArrayOfJceStruct, paramInt, paramBoolean);
  }

  public final String[] read(String[] paramArrayOfString, int paramInt, boolean paramBoolean)
  {
    return (String[])readArray(paramArrayOfString, paramInt, paramBoolean);
  }

  public final short[] read(short[] paramArrayOfShort, int paramInt, boolean paramBoolean)
  {
    short[] arrayOfShort;
    int j;
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 9:
      }
      int i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      arrayOfShort = new short[i];
      j = 0;
      if (j < i);
    }
    do
    {
      return arrayOfShort;
      arrayOfShort[j] = read(arrayOfShort[0], 0, true);
      j++;
      break;
      arrayOfShort = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final boolean[] read(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    boolean[] arrayOfBoolean;
    int j;
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 9:
      }
      int i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      arrayOfBoolean = new boolean[i];
      j = 0;
      if (j < i);
    }
    do
    {
      return arrayOfBoolean;
      arrayOfBoolean[j] = read(arrayOfBoolean[0], 0, true);
      j++;
      break;
      arrayOfBoolean = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final List readArray(List paramList, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    if ((paramList == null) || (paramList.isEmpty()))
      return new ArrayList();
    Object[] arrayOfObject = readArrayImpl(paramList.get(0), paramInt, paramBoolean);
    if (arrayOfObject == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      if (i >= arrayOfObject.length)
        return localArrayList;
      localArrayList.add(arrayOfObject[i]);
      i++;
    }
  }

  public final Object[] readArray(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0))
      throw new JceDecodeException("unable to get type of key and value.");
    return readArrayImpl(paramArrayOfObject[0], paramInt, paramBoolean);
  }

  public final String readByteString(String paramString, int paramInt, boolean paramBoolean)
  {
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 6:
        j = this.bs.get();
        if (j < 0)
          j += 256;
        arrayOfByte2 = new byte[j];
        this.bs.get(arrayOfByte2);
        paramString = HexUtil.bytes2HexStr(arrayOfByte2);
      case 7:
      }
    }
    while (!paramBoolean)
    {
      JceInputStream.HeadData localHeadData;
      int j;
      byte[] arrayOfByte2;
      return paramString;
      int i = this.bs.getInt();
      if ((i > 104857600) || (i < 0))
        throw new JceDecodeException("String too long: " + i);
      byte[] arrayOfByte1 = new byte[i];
      this.bs.get(arrayOfByte1);
      return HexUtil.bytes2HexStr(arrayOfByte1);
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final void readHead(JceInputStream.HeadData paramHeadData)
  {
    readHead(paramHeadData, this.bs);
  }

  public final List readList(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (skipToTag(paramInt))
    {
      localHeadData1 = new JceInputStream.HeadData();
      readHead(localHeadData1);
      switch (localHeadData1.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 9:
      }
      i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      j = 0;
      if (j < i);
    }
    while (!paramBoolean)
    {
      JceInputStream.HeadData localHeadData1;
      int i;
      int j;
      return localArrayList;
      JceInputStream.HeadData localHeadData2 = new JceInputStream.HeadData();
      readHead(localHeadData2);
      switch (localHeadData2.type)
      {
      case 11:
      default:
        throw new JceDecodeException("type mismatch.");
      case 0:
        skip(1);
      case 8:
      case 9:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 10:
      case 12:
      }
      while (true)
      {
        j++;
        break;
        skip(2);
        continue;
        skip(4);
        continue;
        skip(8);
        continue;
        skip(4);
        continue;
        skip(8);
        continue;
        int k = this.bs.get();
        if (k < 0)
          k += 256;
        skip(k);
        continue;
        skip(this.bs.getInt());
        continue;
        try
        {
          JceStruct localJceStruct = (JceStruct)Class.forName(JceStruct.class.getName()).getConstructor(new Class[0]).newInstance(new Object[0]);
          localJceStruct.readFrom(this);
          skipToStructEnd();
          localArrayList.add(localJceStruct);
        }
        catch (Exception localException)
        {
          throw new JceDecodeException("type mismatch." + localException);
        }
        localArrayList.add(new Integer(0));
      }
    }
    throw new JceDecodeException("require field not exist.");
  }

  public final HashMap readMap(Map paramMap, int paramInt, boolean paramBoolean)
  {
    return (HashMap)readMap(new HashMap(), paramMap, paramInt, paramBoolean);
  }

  public final String readString(int paramInt, boolean paramBoolean)
  {
    byte[] arrayOfByte2;
    if (skipToTag(paramInt))
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 6:
        int j = this.bs.get();
        if (j < 0)
          j += 256;
        arrayOfByte2 = new byte[j];
        this.bs.get(arrayOfByte2);
      case 7:
      }
    }
    do
    {
      try
      {
        str2 = new String(arrayOfByte2, this.sServerEncoding);
        return str2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        return new String(arrayOfByte2);
      }
      int i = this.bs.getInt();
      if ((i > 104857600) || (i < 0))
        throw new JceDecodeException("String too long: " + i);
      byte[] arrayOfByte1 = new byte[i];
      this.bs.get(arrayOfByte1);
      try
      {
        String str1 = new String(arrayOfByte1, this.sServerEncoding);
        return str1;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        return new String(arrayOfByte1);
      }
      String str2 = null;
    }
    while (!paramBoolean);
    throw new JceDecodeException("require field not exist.");
  }

  public final Map readStringMap(int paramInt, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        throw new JceDecodeException("type mismatch.");
      case 8:
      }
      i = read(0, 0, true);
      if (i < 0)
        throw new JceDecodeException("size invalid: " + i);
      j = 0;
      if (j < i);
    }
    while (!paramBoolean)
      while (true)
      {
        JceInputStream.HeadData localHeadData;
        int i;
        int j;
        return localHashMap;
        localHashMap.put(readString(0, true), readString(1, true));
        j++;
      }
    throw new JceDecodeException("require field not exist.");
  }

  public final int setServerEncoding(String paramString)
  {
    this.sServerEncoding = paramString;
    return 0;
  }

  public final void skipToStructEnd()
  {
    JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
    do
    {
      readHead(localHeadData);
      skipField(localHeadData.type);
    }
    while (localHeadData.type != 11);
  }

  public final boolean skipToTag(int paramInt)
  {
    try
    {
      JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
      while (true)
      {
        int i = peakHead(localHeadData);
        if ((paramInt <= localHeadData.tag) || (localHeadData.type == 11))
        {
          if (paramInt != localHeadData.tag)
            break;
          return true;
        }
        skip(i);
        skipField(localHeadData.type);
      }
    }
    catch (JceDecodeException localJceDecodeException)
    {
      return false;
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
    }
    return false;
  }

  public final void warp(byte[] paramArrayOfByte)
  {
    wrap(paramArrayOfByte);
  }

  public final void wrap(byte[] paramArrayOfByte)
  {
    this.bs = ByteBuffer.wrap(paramArrayOfByte);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.JceInputStream
 * JD-Core Version:    0.6.2
 */