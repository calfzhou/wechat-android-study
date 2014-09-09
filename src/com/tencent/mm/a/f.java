package com.tencent.mm.a;

import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

public final class f
{
  // ERROR //
  private static String a(File paramFile, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 16	java/io/File:exists	()Z
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 18	java/io/FileInputStream
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 22	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   17: astore_3
    //   18: aload_3
    //   19: ldc 23
    //   21: iconst_0
    //   22: sipush 256
    //   25: aconst_null
    //   26: invokestatic 26	com/tencent/mm/a/f:a	(Ljava/io/InputStream;III[B)Ljava/lang/String;
    //   29: astore 9
    //   31: aload_3
    //   32: invokevirtual 30	java/io/FileInputStream:close	()V
    //   35: aload_3
    //   36: invokevirtual 30	java/io/FileInputStream:close	()V
    //   39: aload 9
    //   41: areturn
    //   42: astore 12
    //   44: aconst_null
    //   45: astore 5
    //   47: aload 5
    //   49: ifnull -42 -> 7
    //   52: aload 5
    //   54: invokevirtual 30	java/io/FileInputStream:close	()V
    //   57: aconst_null
    //   58: areturn
    //   59: astore 6
    //   61: aconst_null
    //   62: areturn
    //   63: astore 11
    //   65: aconst_null
    //   66: astore_3
    //   67: aload 11
    //   69: astore 7
    //   71: aload_3
    //   72: ifnull +7 -> 79
    //   75: aload_3
    //   76: invokevirtual 30	java/io/FileInputStream:close	()V
    //   79: aload 7
    //   81: athrow
    //   82: astore 10
    //   84: goto -45 -> 39
    //   87: astore 8
    //   89: goto -10 -> 79
    //   92: astore 7
    //   94: goto -23 -> 71
    //   97: astore 4
    //   99: aload_3
    //   100: astore 5
    //   102: goto -55 -> 47
    //
    // Exception table:
    //   from	to	target	type
    //   9	18	42	java/lang/Exception
    //   52	57	59	java/io/IOException
    //   9	18	63	finally
    //   35	39	82	java/io/IOException
    //   75	79	87	java/io/IOException
    //   18	35	92	finally
    //   18	35	97	java/lang/Exception
  }

  // ERROR //
  public static String a(File paramFile, int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 16	java/io/File:exists	()Z
    //   4: ifeq +7 -> 11
    //   7: iload_1
    //   8: ifgt +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: new 18	java/io/FileInputStream
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 22	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   21: astore_3
    //   22: aload_3
    //   23: ldc 23
    //   25: iconst_0
    //   26: iload_1
    //   27: aload_2
    //   28: invokestatic 26	com/tencent/mm/a/f:a	(Ljava/io/InputStream;III[B)Ljava/lang/String;
    //   31: astore 9
    //   33: aload_3
    //   34: invokevirtual 30	java/io/FileInputStream:close	()V
    //   37: aload_3
    //   38: invokevirtual 30	java/io/FileInputStream:close	()V
    //   41: aload 9
    //   43: areturn
    //   44: astore 10
    //   46: aload 9
    //   48: areturn
    //   49: astore 11
    //   51: aconst_null
    //   52: astore 5
    //   54: aload 5
    //   56: ifnull +8 -> 64
    //   59: aload 5
    //   61: invokevirtual 30	java/io/FileInputStream:close	()V
    //   64: aconst_null
    //   65: areturn
    //   66: astore 7
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_3
    //   71: ifnull +7 -> 78
    //   74: aload_3
    //   75: invokevirtual 30	java/io/FileInputStream:close	()V
    //   78: aload 7
    //   80: athrow
    //   81: astore 6
    //   83: goto -19 -> 64
    //   86: astore 8
    //   88: goto -10 -> 78
    //   91: astore 7
    //   93: goto -23 -> 70
    //   96: astore 4
    //   98: aload_3
    //   99: astore 5
    //   101: goto -47 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   37	41	44	java/io/IOException
    //   13	22	49	java/lang/Exception
    //   13	22	66	finally
    //   59	64	81	java/io/IOException
    //   74	78	86	java/io/IOException
    //   22	37	91	finally
    //   22	37	96	java/lang/Exception
  }

  private static String a(InputStream paramInputStream, int paramInt)
  {
    int i = 0;
    if (paramInt <= 0)
      return null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      StringBuilder localStringBuilder = new StringBuilder(32);
      byte[] arrayOfByte1 = new byte[paramInt];
      while (true)
      {
        int j = paramInputStream.read(arrayOfByte1);
        if (j == -1)
          break;
        localMessageDigest.update(arrayOfByte1, 0, j);
      }
      byte[] arrayOfByte2 = localMessageDigest.digest();
      while (i < arrayOfByte2.length)
      {
        localStringBuilder.append(Integer.toString(256 + (0xFF & arrayOfByte2[i]), 16).substring(1));
        i++;
      }
      String str = localStringBuilder.toString();
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private static String a(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    int i = 0;
    if ((paramInt2 < 0) || (paramInt3 <= 0));
    while (true)
    {
      return null;
      long l = paramInt2;
      try
      {
        if (paramInputStream.skip(l) >= paramInt2)
        {
          MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
          StringBuilder localStringBuilder = new StringBuilder(32);
          byte[] arrayOfByte1 = new byte[102400];
          int j = 0;
          while (true)
          {
            int k = paramInputStream.read(arrayOfByte1);
            if ((k == -1) || (j >= paramInt3))
              break;
            if (j + k <= paramInt3)
            {
              localMessageDigest.update(arrayOfByte1, 0, k);
              j += k;
            }
            else
            {
              localMessageDigest.update(arrayOfByte1, 0, paramInt3 - j);
              j = paramInt3;
            }
          }
          if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
            localMessageDigest.update(paramArrayOfByte);
          byte[] arrayOfByte2 = localMessageDigest.digest();
          while (i < arrayOfByte2.length)
          {
            localStringBuilder.append(Integer.toString(256 + (0xFF & arrayOfByte2[i]), 16).substring(1));
            i++;
          }
          String str = localStringBuilder.toString();
          return str;
        }
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }

  public static String ag(String paramString)
  {
    if (paramString == null);
    File localFile;
    do
    {
      return null;
      localFile = new File(paramString);
    }
    while (!localFile.exists());
    return c(localFile);
  }

  public static String ah(String paramString)
  {
    if (paramString == null);
    File localFile;
    do
    {
      return null;
      localFile = new File(paramString);
    }
    while (!localFile.exists());
    return a(localFile, 0, 256);
  }

  // ERROR //
  public static String c(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 98
    //   3: lstore_1
    //   4: aload_0
    //   5: ifnull +10 -> 15
    //   8: aload_0
    //   9: invokevirtual 16	java/io/File:exists	()Z
    //   12: ifne +5 -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: new 18	java/io/FileInputStream
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 22	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   25: astore_3
    //   26: lload_1
    //   27: aload_0
    //   28: invokevirtual 103	java/io/File:length	()J
    //   31: lcmp
    //   32: ifgt +27 -> 59
    //   35: aload_3
    //   36: lload_1
    //   37: l2i
    //   38: invokestatic 105	com/tencent/mm/a/f:a	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   41: astore 9
    //   43: aload_3
    //   44: invokevirtual 30	java/io/FileInputStream:close	()V
    //   47: aload_3
    //   48: invokevirtual 30	java/io/FileInputStream:close	()V
    //   51: aload 9
    //   53: areturn
    //   54: astore 10
    //   56: aload 9
    //   58: areturn
    //   59: aload_0
    //   60: invokevirtual 103	java/io/File:length	()J
    //   63: lstore 11
    //   65: lload 11
    //   67: lstore_1
    //   68: goto -33 -> 35
    //   71: astore 13
    //   73: aconst_null
    //   74: astore 5
    //   76: aload 5
    //   78: ifnull +8 -> 86
    //   81: aload 5
    //   83: invokevirtual 30	java/io/FileInputStream:close	()V
    //   86: aconst_null
    //   87: areturn
    //   88: astore 7
    //   90: aconst_null
    //   91: astore_3
    //   92: aload_3
    //   93: ifnull +7 -> 100
    //   96: aload_3
    //   97: invokevirtual 30	java/io/FileInputStream:close	()V
    //   100: aload 7
    //   102: athrow
    //   103: astore 6
    //   105: goto -19 -> 86
    //   108: astore 8
    //   110: goto -10 -> 100
    //   113: astore 7
    //   115: goto -23 -> 92
    //   118: astore 4
    //   120: aload_3
    //   121: astore 5
    //   123: goto -47 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   47	51	54	java/io/IOException
    //   17	26	71	java/lang/Exception
    //   17	26	88	finally
    //   81	86	103	java/io/IOException
    //   96	100	108	java/io/IOException
    //   26	35	113	finally
    //   35	47	113	finally
    //   59	65	113	finally
    //   26	35	118	java/lang/Exception
    //   35	47	118	java/lang/Exception
    //   59	65	118	java/lang/Exception
  }

  public static final String d(byte[] paramArrayOfByte)
  {
    int i = 0;
    char[] arrayOfChar1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      byte[] arrayOfByte = localMessageDigest.digest();
      int j = arrayOfByte.length;
      char[] arrayOfChar2 = new char[j * 2];
      int k = 0;
      while (i < j)
      {
        int m = arrayOfByte[i];
        int n = k + 1;
        arrayOfChar2[k] = arrayOfChar1[(0xF & m >>> 4)];
        k = n + 1;
        arrayOfChar2[n] = arrayOfChar1[(m & 0xF)];
        i++;
      }
      String str = new String(arrayOfChar2);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static final byte[] e(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      byte[] arrayOfByte = localMessageDigest.digest();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.f
 * JD-Core Version:    0.6.2
 */