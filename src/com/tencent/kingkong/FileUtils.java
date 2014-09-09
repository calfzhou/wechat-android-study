package com.tencent.kingkong;

import com.tencent.kingkong.support.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtils
{
  private static final Pattern SAFE_FILENAME_PATTERN = Pattern.compile("[\\w%+,./=_-]+");
  public static final int S_IRGRP = 32;
  public static final int S_IROTH = 4;
  public static final int S_IRUSR = 256;
  public static final int S_IRWXG = 56;
  public static final int S_IRWXO = 7;
  public static final int S_IRWXU = 448;
  public static final int S_IWGRP = 16;
  public static final int S_IWOTH = 2;
  public static final int S_IWUSR = 128;
  public static final int S_IXGRP = 8;
  public static final int S_IXOTH = 1;
  public static final int S_IXUSR = 64;
  private static final String TAG = "FileUtils";

  // ERROR //
  public static long checksumCrc32(File paramFile)
  {
    // Byte code:
    //   0: new 56	java/util/zip/CRC32
    //   3: dup
    //   4: invokespecial 57	java/util/zip/CRC32:<init>	()V
    //   7: astore_1
    //   8: new 59	java/util/zip/CheckedInputStream
    //   11: dup
    //   12: new 61	java/io/FileInputStream
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 64	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   20: aload_1
    //   21: invokespecial 67	java/util/zip/CheckedInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Checksum;)V
    //   24: astore_2
    //   25: sipush 128
    //   28: newarray byte
    //   30: astore 5
    //   32: aload_2
    //   33: aload 5
    //   35: invokevirtual 71	java/util/zip/CheckedInputStream:read	([B)I
    //   38: ifge -6 -> 32
    //   41: aload_1
    //   42: invokevirtual 75	java/util/zip/CRC32:getValue	()J
    //   45: lstore 6
    //   47: aload_2
    //   48: invokevirtual 78	java/util/zip/CheckedInputStream:close	()V
    //   51: lload 6
    //   53: lreturn
    //   54: astore_3
    //   55: aconst_null
    //   56: astore_2
    //   57: aload_2
    //   58: ifnull +7 -> 65
    //   61: aload_2
    //   62: invokevirtual 78	java/util/zip/CheckedInputStream:close	()V
    //   65: aload_3
    //   66: athrow
    //   67: astore 8
    //   69: lload 6
    //   71: lreturn
    //   72: astore 4
    //   74: goto -9 -> 65
    //   77: astore_3
    //   78: goto -21 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   8	25	54	finally
    //   47	51	67	java/io/IOException
    //   61	65	72	java/io/IOException
    //   25	32	77	finally
    //   32	47	77	finally
  }

  public static boolean copyFile(File paramFile1, File paramFile2)
  {
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramFile1);
      try
      {
        boolean bool = copyToFile(localFileInputStream, paramFile2);
        return bool;
      }
      finally
      {
        localFileInputStream.close();
      }
    }
    catch (IOException localIOException)
    {
    }
    return false;
  }

  // ERROR //
  public static boolean copyToFile(InputStream paramInputStream, File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 93	java/io/File:exists	()Z
    //   4: ifeq +8 -> 12
    //   7: aload_1
    //   8: invokevirtual 96	java/io/File:delete	()Z
    //   11: pop
    //   12: new 98	java/io/FileOutputStream
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 99	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   20: astore_3
    //   21: sipush 4096
    //   24: newarray byte
    //   26: astore 6
    //   28: aload_0
    //   29: aload 6
    //   31: invokevirtual 100	java/io/InputStream:read	([B)I
    //   34: istore 7
    //   36: iload 7
    //   38: ifge +20 -> 58
    //   41: aload_3
    //   42: invokevirtual 103	java/io/FileOutputStream:flush	()V
    //   45: aload_3
    //   46: invokevirtual 107	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   49: invokevirtual 112	java/io/FileDescriptor:sync	()V
    //   52: aload_3
    //   53: invokevirtual 113	java/io/FileOutputStream:close	()V
    //   56: iconst_1
    //   57: ireturn
    //   58: aload_3
    //   59: aload 6
    //   61: iconst_0
    //   62: iload 7
    //   64: invokevirtual 117	java/io/FileOutputStream:write	([BII)V
    //   67: goto -39 -> 28
    //   70: astore 4
    //   72: aload_3
    //   73: invokevirtual 103	java/io/FileOutputStream:flush	()V
    //   76: aload_3
    //   77: invokevirtual 107	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   80: invokevirtual 112	java/io/FileDescriptor:sync	()V
    //   83: aload_3
    //   84: invokevirtual 113	java/io/FileOutputStream:close	()V
    //   87: aload 4
    //   89: athrow
    //   90: astore_2
    //   91: iconst_0
    //   92: ireturn
    //   93: astore 8
    //   95: goto -43 -> 52
    //   98: astore 5
    //   100: goto -17 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   21	28	70	finally
    //   28	36	70	finally
    //   58	67	70	finally
    //   0	12	90	java/io/IOException
    //   12	21	90	java/io/IOException
    //   41	45	90	java/io/IOException
    //   52	56	90	java/io/IOException
    //   72	76	90	java/io/IOException
    //   83	90	90	java/io/IOException
    //   45	52	93	java/io/IOException
    //   76	83	98	java/io/IOException
  }

  public static void deleteOlderFiles(File paramFile, int paramInt, long paramLong)
  {
    if ((paramInt < 0) || (paramLong < 0L))
      throw new IllegalArgumentException("Constraints must be positive or 0");
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null);
    while (true)
    {
      return;
      Arrays.sort(arrayOfFile, new FileUtils.1());
      while (paramInt < arrayOfFile.length)
      {
        File localFile = arrayOfFile[paramInt];
        if (System.currentTimeMillis() - localFile.lastModified() > paramLong)
        {
          Log.d("FileUtils", "Deleting old file " + localFile);
          localFile.delete();
        }
        paramInt++;
      }
    }
  }

  public static boolean isFilenameSafe(File paramFile)
  {
    return SAFE_FILENAME_PATTERN.matcher(paramFile.getPath()).matches();
  }

  public static String readTextFile(File paramFile, int paramInt, String paramString)
  {
    Object localObject1 = null;
    int i = 1;
    int j = 0;
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(localFileInputStream);
    label527: 
    while (true)
    {
      long l;
      try
      {
        l = paramFile.length();
        if (paramInt > 0)
          break label501;
        if ((l > 0L) && (paramInt == 0))
        {
          break label501;
          byte[] arrayOfByte1 = new byte[paramInt + 1];
          int k = localBufferedInputStream.read(arrayOfByte1);
          if (k <= 0)
            return "";
          if (k <= paramInt)
          {
            String str3 = new String(arrayOfByte1, 0, k);
            return str3;
          }
          if (paramString == null)
          {
            String str2 = new String(arrayOfByte1, 0, paramInt);
            return str2;
          }
          String str1 = new String(arrayOfByte1, 0, paramInt) + paramString;
          return str1;
        }
        if (paramInt < 0)
        {
          localObject3 = null;
          if (localObject1 != null)
            j = i;
          if (localObject1 == null)
          {
            int i2 = -paramInt;
            localObject1 = new byte[i2];
          }
          int n = localBufferedInputStream.read((byte[])localObject1);
          int i1 = localObject1.length;
          if (n == i1)
            break label488;
          if ((localObject3 == null) && (n <= 0))
            return "";
          if (localObject3 == null)
          {
            String str7 = new String((byte[])localObject1, 0, n);
            return str7;
          }
          if (n > 0)
          {
            System.arraycopy(localObject3, n, localObject3, 0, localObject3.length - n);
            System.arraycopy(localObject1, 0, localObject3, localObject3.length - n, n);
            break label527;
            String str5 = new String(localObject3);
            return str5;
            String str6 = paramString + new String(localObject3);
            return str6;
          }
        }
        else
        {
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          byte[] arrayOfByte2 = new byte[1024];
          int m = localBufferedInputStream.read(arrayOfByte2);
          if (m > 0)
            localByteArrayOutputStream.write(arrayOfByte2, 0, m);
          if (m == 1024)
            continue;
          String str4 = localByteArrayOutputStream.toString();
          return str4;
        }
      }
      finally
      {
        localBufferedInputStream.close();
        localFileInputStream.close();
      }
      i = j;
      break label527;
      label488: Object localObject4 = localObject1;
      localObject1 = localObject3;
      Object localObject3 = localObject4;
      continue;
      label501: if ((l > 0L) && ((paramInt == 0) || (l < paramInt)))
      {
        paramInt = (int)l;
        continue;
        if (paramString != null)
          if (i != 0);
      }
    }
  }

  public static native int setPermissions(String paramString, int paramInt1, int paramInt2, int paramInt3);

  public static void stringToFile(String paramString1, String paramString2)
  {
    FileWriter localFileWriter = new FileWriter(paramString1);
    try
    {
      localFileWriter.write(paramString2);
      return;
    }
    finally
    {
      localFileWriter.close();
    }
  }

  public static boolean sync(FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream != null);
    try
    {
      paramFileOutputStream.getFD().sync();
      return true;
    }
    catch (IOException localIOException)
    {
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.FileUtils
 * JD-Core Version:    0.6.2
 */