package com.tencent.mm.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

public final class d
{
  public static int a(RandomAccessFile paramRandomAccessFile, int paramInt1, byte[] paramArrayOfByte, int paramInt2, File paramFile, int paramInt3)
  {
    if (paramInt1 <= 0)
      return 3;
    if (paramInt2 <= 0)
      return 2;
    int i = -2 + (paramInt1 - paramInt3);
    if (i <= 2)
      return 3;
    DataInputStream localDataInputStream1 = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte, 0, paramInt2));
    localDataInputStream1.skip(8L);
    long l1 = localDataInputStream1.readLong();
    long l2 = localDataInputStream1.readLong();
    int j = (int)localDataInputStream1.readLong();
    localDataInputStream1.close();
    ByteArrayInputStream localByteArrayInputStream1 = new ByteArrayInputStream(paramArrayOfByte, 0, paramInt2);
    localByteArrayInputStream1.skip(32L);
    DataInputStream localDataInputStream2 = new DataInputStream(new GZIPInputStream(localByteArrayInputStream1));
    ByteArrayInputStream localByteArrayInputStream2 = new ByteArrayInputStream(paramArrayOfByte, 0, paramInt2);
    localByteArrayInputStream2.skip(32L + l1);
    GZIPInputStream localGZIPInputStream1 = new GZIPInputStream(localByteArrayInputStream2);
    ByteArrayInputStream localByteArrayInputStream3 = new ByteArrayInputStream(paramArrayOfByte, 0, paramInt2);
    localByteArrayInputStream3.skip(32L + (l1 + l2));
    GZIPInputStream localGZIPInputStream2 = new GZIPInputStream(localByteArrayInputStream3);
    FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
    int[] arrayOfInt = new int[3];
    int k = 0;
    int i4;
    for (int m = 0; ; m = i4)
    {
      if (m >= j)
      {
        localDataInputStream2.close();
        localGZIPInputStream1.close();
        localGZIPInputStream2.close();
        paramRandomAccessFile.close();
        localFileOutputStream.close();
        return 1;
      }
      for (int n = 0; ; n++)
      {
        if (n > 2)
        {
          if (m + arrayOfInt[0] <= j)
            break;
          localFileOutputStream.close();
          return 2;
        }
        arrayOfInt[n] = localDataInputStream2.readInt();
      }
      byte[] arrayOfByte1 = new byte[arrayOfInt[0]];
      if (!e.a(localGZIPInputStream1, arrayOfByte1, arrayOfInt[0]))
      {
        localFileOutputStream.close();
        return 2;
      }
      byte[] arrayOfByte2 = new byte[arrayOfInt[0]];
      if (paramRandomAccessFile.read(arrayOfByte2, 0, arrayOfInt[0]) < arrayOfInt[0])
      {
        localFileOutputStream.close();
        return 2;
      }
      int i2;
      int i3;
      for (int i1 = 0; ; i1++)
      {
        if (i1 >= arrayOfInt[0])
        {
          localFileOutputStream.write(arrayOfByte1);
          i2 = m + arrayOfInt[0];
          i3 = k + arrayOfInt[0];
          if (i2 + arrayOfInt[1] <= j)
            break;
          localFileOutputStream.close();
          return 2;
        }
        if (k + i1 == i)
        {
          arrayOfByte2[i1] = 0;
          arrayOfByte2[(i1 + 1)] = 0;
        }
        if ((k + i1 >= 0) && (k + i1 < paramInt1))
          arrayOfByte1[i1] = ((byte)(arrayOfByte1[i1] + arrayOfByte2[i1]));
      }
      byte[] arrayOfByte3 = new byte[arrayOfInt[1]];
      if (!e.a(localGZIPInputStream2, arrayOfByte3, arrayOfInt[1]))
      {
        localFileOutputStream.close();
        return 2;
      }
      localFileOutputStream.write(arrayOfByte3);
      localFileOutputStream.flush();
      i4 = i2 + arrayOfInt[1];
      int i5 = i3 + arrayOfInt[2];
      paramRandomAccessFile.seek(i5);
      k = i5;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.d
 * JD-Core Version:    0.6.2
 */