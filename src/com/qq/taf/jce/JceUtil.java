package com.qq.taf.jce;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public final class JceUtil
{
  private static final byte[] highDigits;
  private static final int iConstant = 37;
  private static final int iTotal = 17;
  private static final byte[] lowDigits;

  static
  {
    byte[] arrayOfByte1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
    byte[] arrayOfByte2 = new byte[256];
    byte[] arrayOfByte3 = new byte[256];
    for (int i = 0; ; i++)
    {
      if (i >= 256)
      {
        highDigits = arrayOfByte2;
        lowDigits = arrayOfByte3;
        return;
      }
      arrayOfByte2[i] = arrayOfByte1[(i >>> 4)];
      arrayOfByte3[i] = arrayOfByte1[(i & 0xF)];
    }
  }

  public static int compareTo(byte paramByte1, byte paramByte2)
  {
    if (paramByte1 < paramByte2)
      return -1;
    if (paramByte1 > paramByte2)
      return 1;
    return 0;
  }

  public static int compareTo(char paramChar1, char paramChar2)
  {
    if (paramChar1 < paramChar2)
      return -1;
    if (paramChar1 > paramChar2)
      return 1;
    return 0;
  }

  public static int compareTo(double paramDouble1, double paramDouble2)
  {
    if (paramDouble1 < paramDouble2)
      return -1;
    if (paramDouble1 > paramDouble2)
      return 1;
    return 0;
  }

  public static int compareTo(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 < paramFloat2)
      return -1;
    if (paramFloat1 > paramFloat2)
      return 1;
    return 0;
  }

  public static int compareTo(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
      return -1;
    if (paramInt1 > paramInt2)
      return 1;
    return 0;
  }

  public static int compareTo(long paramLong1, long paramLong2)
  {
    if (paramLong1 < paramLong2)
      return -1;
    if (paramLong1 > paramLong2)
      return 1;
    return 0;
  }

  public static int compareTo(Comparable paramComparable1, Comparable paramComparable2)
  {
    return paramComparable1.compareTo(paramComparable2);
  }

  public static int compareTo(List paramList1, List paramList2)
  {
    Iterator localIterator1 = paramList1.iterator();
    Iterator localIterator2 = paramList2.iterator();
    int i;
    do
    {
      if ((!localIterator1.hasNext()) || (!localIterator2.hasNext()))
        return compareTo(localIterator1.hasNext(), localIterator2.hasNext());
      i = ((Comparable)localIterator1.next()).compareTo((Comparable)localIterator2.next());
    }
    while (i == 0);
    return i;
  }

  public static int compareTo(short paramShort1, short paramShort2)
  {
    if (paramShort1 < paramShort2)
      return -1;
    if (paramShort1 > paramShort2)
      return 1;
    return 0;
  }

  public static int compareTo(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    int j;
    if (paramBoolean1)
    {
      j = i;
      if (!paramBoolean2)
        break label21;
    }
    while (true)
    {
      return j - i;
      j = 0;
      break;
      label21: i = 0;
    }
  }

  public static int compareTo(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfByte1.length) || (i >= paramArrayOfByte2.length))
        return compareTo(paramArrayOfByte1.length, paramArrayOfByte2.length);
      int k = compareTo(paramArrayOfByte1[j], paramArrayOfByte2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static int compareTo(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfChar1.length) || (i >= paramArrayOfChar2.length))
        return compareTo(paramArrayOfChar1.length, paramArrayOfChar2.length);
      int k = compareTo(paramArrayOfChar1[j], paramArrayOfChar2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static int compareTo(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfDouble1.length) || (i >= paramArrayOfDouble2.length))
        return compareTo(paramArrayOfDouble1.length, paramArrayOfDouble2.length);
      int k = compareTo(paramArrayOfDouble1[j], paramArrayOfDouble2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static int compareTo(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfFloat1.length) || (i >= paramArrayOfFloat2.length))
        return compareTo(paramArrayOfFloat1.length, paramArrayOfFloat2.length);
      int k = compareTo(paramArrayOfFloat1[j], paramArrayOfFloat2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static int compareTo(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfInt1.length) || (i >= paramArrayOfInt2.length))
        return compareTo(paramArrayOfInt1.length, paramArrayOfInt2.length);
      int k = compareTo(paramArrayOfInt1[j], paramArrayOfInt2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static int compareTo(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfLong1.length) || (i >= paramArrayOfLong2.length))
        return compareTo(paramArrayOfLong1.length, paramArrayOfLong2.length);
      int k = compareTo(paramArrayOfLong1[j], paramArrayOfLong2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static int compareTo(Comparable[] paramArrayOfComparable1, Comparable[] paramArrayOfComparable2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfComparable1.length) || (i >= paramArrayOfComparable2.length))
        return compareTo(paramArrayOfComparable1.length, paramArrayOfComparable2.length);
      int k = paramArrayOfComparable1[j].compareTo(paramArrayOfComparable2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static int compareTo(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfShort1.length) || (i >= paramArrayOfShort2.length))
        return compareTo(paramArrayOfShort1.length, paramArrayOfShort2.length);
      int k = compareTo(paramArrayOfShort1[j], paramArrayOfShort2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static int compareTo(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      if ((j >= paramArrayOfBoolean1.length) || (i >= paramArrayOfBoolean2.length))
        return compareTo(paramArrayOfBoolean1.length, paramArrayOfBoolean2.length);
      int k = compareTo(paramArrayOfBoolean1[j], paramArrayOfBoolean2[i]);
      if (k != 0)
        return k;
      j++;
      i++;
    }
  }

  public static boolean equals(byte paramByte1, byte paramByte2)
  {
    return paramByte1 == paramByte2;
  }

  public static boolean equals(char paramChar1, char paramChar2)
  {
    return paramChar1 == paramChar2;
  }

  public static boolean equals(double paramDouble1, double paramDouble2)
  {
    return paramDouble1 == paramDouble2;
  }

  public static boolean equals(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 == paramFloat2;
  }

  public static boolean equals(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }

  public static boolean equals(long paramLong1, long paramLong2)
  {
    return paramLong1 == paramLong2;
  }

  public static boolean equals(Object paramObject1, Object paramObject2)
  {
    return paramObject1.equals(paramObject2);
  }

  public static boolean equals(short paramShort1, short paramShort2)
  {
    return paramShort1 == paramShort2;
  }

  public static boolean equals(boolean paramBoolean1, boolean paramBoolean2)
  {
    return paramBoolean1 == paramBoolean2;
  }

  public static String getHexdump(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.remaining();
    if (i == 0)
      return "empty";
    StringBuffer localStringBuffer = new StringBuffer(-1 + 3 * paramByteBuffer.remaining());
    int j = paramByteBuffer.position();
    int k = 0xFF & paramByteBuffer.get();
    localStringBuffer.append((char)highDigits[k]);
    localStringBuffer.append((char)lowDigits[k]);
    for (int m = i - 1; ; m--)
    {
      if (m <= 0)
      {
        paramByteBuffer.position(j);
        return localStringBuffer.toString();
      }
      localStringBuffer.append(' ');
      int n = 0xFF & paramByteBuffer.get();
      localStringBuffer.append((char)highDigits[n]);
      localStringBuffer.append((char)lowDigits[n]);
    }
  }

  public static String getHexdump(byte[] paramArrayOfByte)
  {
    return getHexdump(ByteBuffer.wrap(paramArrayOfByte));
  }

  public static byte[] getJceBufArray(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[paramByteBuffer.position()];
    System.arraycopy(paramByteBuffer.array(), 0, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }

  public static int hashCode(byte paramByte)
  {
    return paramByte + 629;
  }

  public static int hashCode(char paramChar)
  {
    return paramChar + 'ɵ';
  }

  public static int hashCode(double paramDouble)
  {
    return hashCode(Double.doubleToLongBits(paramDouble));
  }

  public static int hashCode(float paramFloat)
  {
    return 629 + Float.floatToIntBits(paramFloat);
  }

  public static int hashCode(int paramInt)
  {
    return paramInt + 629;
  }

  public static int hashCode(long paramLong)
  {
    return 629 + (int)(paramLong ^ paramLong >> 32);
  }

  public static int hashCode(Object paramObject)
  {
    for (Object localObject = paramObject; ; localObject = (Object[])localObject)
    {
      if (localObject == null)
        return 629;
      if (!localObject.getClass().isArray())
        break;
      if ((localObject instanceof long[]))
        return hashCode((long[])localObject);
      if ((localObject instanceof int[]))
        return hashCode((int[])localObject);
      if ((localObject instanceof short[]))
        return hashCode((short[])localObject);
      if ((localObject instanceof char[]))
        return hashCode((char[])localObject);
      if ((localObject instanceof byte[]))
        return hashCode((byte[])localObject);
      if ((localObject instanceof double[]))
        return hashCode((double[])localObject);
      if ((localObject instanceof float[]))
        return hashCode((float[])localObject);
      if ((localObject instanceof boolean[]))
        return hashCode((boolean[])localObject);
      if ((localObject instanceof JceStruct[]))
        return hashCode((JceStruct[])localObject);
    }
    if ((localObject instanceof JceStruct))
      return localObject.hashCode();
    return 629 + localObject.hashCode();
  }

  public static int hashCode(short paramShort)
  {
    return paramShort + 629;
  }

  public static int hashCode(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 0; ; i = 1)
      return i + 629;
  }

  public static int hashCode(byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null)
      i = 629;
    while (true)
    {
      return i;
      i = 17;
      for (int j = 0; j < paramArrayOfByte.length; j++)
        i = i * 37 + paramArrayOfByte[j];
    }
  }

  public static int hashCode(char[] paramArrayOfChar)
  {
    int i;
    if (paramArrayOfChar == null)
      i = 629;
    while (true)
    {
      return i;
      i = 17;
      for (int j = 0; j < paramArrayOfChar.length; j++)
        i = i * 37 + paramArrayOfChar[j];
    }
  }

  public static int hashCode(double[] paramArrayOfDouble)
  {
    int i;
    if (paramArrayOfDouble == null)
      i = 629;
    while (true)
    {
      return i;
      i = 17;
      for (int j = 0; j < paramArrayOfDouble.length; j++)
        i = i * 37 + (int)(Double.doubleToLongBits(paramArrayOfDouble[j]) ^ Double.doubleToLongBits(paramArrayOfDouble[j]) >> 32);
    }
  }

  public static int hashCode(float[] paramArrayOfFloat)
  {
    int i;
    if (paramArrayOfFloat == null)
      i = 629;
    while (true)
    {
      return i;
      i = 17;
      for (int j = 0; j < paramArrayOfFloat.length; j++)
        i = i * 37 + Float.floatToIntBits(paramArrayOfFloat[j]);
    }
  }

  public static int hashCode(int[] paramArrayOfInt)
  {
    int i;
    if (paramArrayOfInt == null)
      i = 629;
    while (true)
    {
      return i;
      i = 17;
      for (int j = 0; j < paramArrayOfInt.length; j++)
        i = i * 37 + paramArrayOfInt[j];
    }
  }

  public static int hashCode(long[] paramArrayOfLong)
  {
    int i;
    if (paramArrayOfLong == null)
      i = 629;
    while (true)
    {
      return i;
      i = 17;
      for (int j = 0; j < paramArrayOfLong.length; j++)
        i = i * 37 + (int)(paramArrayOfLong[j] ^ paramArrayOfLong[j] >> 32);
    }
  }

  public static int hashCode(JceStruct[] paramArrayOfJceStruct)
  {
    int i;
    if (paramArrayOfJceStruct == null)
      i = 629;
    while (true)
    {
      return i;
      i = 17;
      for (int j = 0; j < paramArrayOfJceStruct.length; j++)
        i = i * 37 + paramArrayOfJceStruct[j].hashCode();
    }
  }

  public static int hashCode(short[] paramArrayOfShort)
  {
    int i;
    if (paramArrayOfShort == null)
      i = 629;
    while (true)
    {
      return i;
      i = 17;
      for (int j = 0; j < paramArrayOfShort.length; j++)
        i = i * 37 + paramArrayOfShort[j];
    }
  }

  public static int hashCode(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null)
    {
      i = 629;
      return i;
    }
    int i = 17;
    int j = 0;
    label15: int k;
    if (j < paramArrayOfBoolean.length)
    {
      k = i * 37;
      if (paramArrayOfBoolean[j] == 0)
        break label46;
    }
    label46: for (int m = 0; ; m = 1)
    {
      i = m + k;
      j++;
      break label15;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.JceUtil
 * JD-Core Version:    0.6.2
 */