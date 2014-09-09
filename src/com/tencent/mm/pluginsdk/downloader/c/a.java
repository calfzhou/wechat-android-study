package com.tencent.mm.pluginsdk.downloader.c;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class a
{
  private static final String[] htS = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

  public static void a(InputStream paramInputStream, File paramFile)
  {
    try
    {
      localFileOutputStream = new FileOutputStream(paramFile);
      try
      {
        byte[] arrayOfByte = new byte[1024];
        while (true)
        {
          int i = paramInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          localFileOutputStream.write(arrayOfByte, 0, i);
        }
      }
      finally
      {
      }
      b(paramInputStream);
      b(localFileOutputStream);
      throw localObject1;
      b(paramInputStream);
      b(localFileOutputStream);
      return;
    }
    finally
    {
      while (true)
        FileOutputStream localFileOutputStream = null;
    }
  }

  public static void b(Closeable paramCloseable)
  {
    if (paramCloseable == null)
      return;
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  // ERROR //
  public static void b(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ifnonnull +11 -> 14
    //   6: ldc 76
    //   8: ldc 78
    //   10: invokestatic 83	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: return
    //   14: iconst_2
    //   15: anewarray 4	java/lang/Object
    //   18: astore_3
    //   19: aload_3
    //   20: iconst_0
    //   21: aload_0
    //   22: invokevirtual 89	java/io/File:getAbsoluteFile	()Ljava/io/File;
    //   25: aastore
    //   26: aload_3
    //   27: iconst_1
    //   28: aload_1
    //   29: invokevirtual 93	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   32: aastore
    //   33: ldc 76
    //   35: ldc 95
    //   37: aload_3
    //   38: invokestatic 99	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: new 101	java/io/FileInputStream
    //   44: dup
    //   45: aload_0
    //   46: invokespecial 102	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   49: invokevirtual 106	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   52: astore 6
    //   54: new 47	java/io/FileOutputStream
    //   57: dup
    //   58: aload_1
    //   59: invokespecial 51	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   62: invokevirtual 107	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   65: astore 7
    //   67: aload 7
    //   69: aload 6
    //   71: lconst_0
    //   72: aload 6
    //   74: invokevirtual 113	java/nio/channels/FileChannel:size	()J
    //   77: invokevirtual 117	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   80: pop2
    //   81: aload 6
    //   83: invokestatic 121	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   86: aload 7
    //   88: invokestatic 121	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   91: return
    //   92: astore 4
    //   94: aconst_null
    //   95: astore 5
    //   97: aload_2
    //   98: invokestatic 121	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   101: aload 5
    //   103: invokestatic 121	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   106: aload 4
    //   108: athrow
    //   109: astore 4
    //   111: aload 6
    //   113: astore_2
    //   114: aconst_null
    //   115: astore 5
    //   117: goto -20 -> 97
    //   120: astore 8
    //   122: aload 6
    //   124: astore_2
    //   125: aload 7
    //   127: astore 5
    //   129: aload 8
    //   131: astore 4
    //   133: goto -36 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   41	54	92	finally
    //   54	67	109	finally
    //   67	81	120	finally
  }

  public static byte[] e(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[1024];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }

  // ERROR //
  public static String h(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 101	java/io/FileInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 102	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   10: astore_2
    //   11: aload_2
    //   12: invokevirtual 106	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   15: getstatic 139	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   18: lconst_0
    //   19: aload_0
    //   20: invokevirtual 142	java/io/File:length	()J
    //   23: invokevirtual 146	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   26: astore 4
    //   28: ldc 148
    //   30: invokestatic 154	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   33: astore 5
    //   35: aload 5
    //   37: aload 4
    //   39: invokevirtual 158	java/security/MessageDigest:update	(Ljava/nio/ByteBuffer;)V
    //   42: new 160	java/math/BigInteger
    //   45: dup
    //   46: iconst_1
    //   47: aload 5
    //   49: invokevirtual 163	java/security/MessageDigest:digest	()[B
    //   52: invokespecial 166	java/math/BigInteger:<init>	(I[B)V
    //   55: bipush 16
    //   57: invokevirtual 170	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   60: astore 6
    //   62: aload_2
    //   63: invokestatic 66	com/tencent/mm/pluginsdk/downloader/c/a:b	(Ljava/io/Closeable;)V
    //   66: aload 6
    //   68: areturn
    //   69: astore_3
    //   70: aload_1
    //   71: invokestatic 66	com/tencent/mm/pluginsdk/downloader/c/a:b	(Ljava/io/Closeable;)V
    //   74: aload_3
    //   75: athrow
    //   76: astore_3
    //   77: aload_2
    //   78: astore_1
    //   79: goto -9 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   2	11	69	finally
    //   11	62	76	finally
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.c.a
 * JD-Core Version:    0.6.2
 */