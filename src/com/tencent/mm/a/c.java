package com.tencent.mm.a;

import com.tencent.mm.sdk.platformtools.ch;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public final class c
{
  public static int a(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    return c(paramString1, paramString2 + paramString3, paramArrayOfByte);
  }

  // ERROR //
  public static int a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +8 -> 9
    //   4: aload_1
    //   5: arraylength
    //   6: ifne +6 -> 12
    //   9: bipush 254
    //   11: ireturn
    //   12: new 31	java/io/FileOutputStream
    //   15: dup
    //   16: aload_0
    //   17: iconst_1
    //   18: invokespecial 34	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   21: astore_2
    //   22: aload_2
    //   23: aload_1
    //   24: iconst_0
    //   25: aload_1
    //   26: arraylength
    //   27: invokevirtual 38	java/io/FileOutputStream:write	([BII)V
    //   30: aload_2
    //   31: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   34: iconst_0
    //   35: ireturn
    //   36: astore 8
    //   38: iconst_0
    //   39: ireturn
    //   40: astore 9
    //   42: aconst_null
    //   43: astore 4
    //   45: aload 4
    //   47: ifnull +8 -> 55
    //   50: aload 4
    //   52: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   55: iconst_m1
    //   56: ireturn
    //   57: astore 6
    //   59: aconst_null
    //   60: astore_2
    //   61: aload_2
    //   62: ifnull +7 -> 69
    //   65: aload_2
    //   66: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   69: aload 6
    //   71: athrow
    //   72: astore 5
    //   74: goto -19 -> 55
    //   77: astore 7
    //   79: goto -10 -> 69
    //   82: astore 6
    //   84: goto -23 -> 61
    //   87: astore_3
    //   88: aload_2
    //   89: astore 4
    //   91: goto -46 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   30	34	36	java/io/IOException
    //   12	22	40	java/lang/Exception
    //   12	22	57	finally
    //   50	55	72	java/io/IOException
    //   65	69	77	java/io/IOException
    //   22	30	82	finally
    //   22	30	87	java/lang/Exception
  }

  // ERROR //
  public static int a(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +6 -> 7
    //   4: bipush 254
    //   6: ireturn
    //   7: aload_1
    //   8: arraylength
    //   9: iload_2
    //   10: iconst_0
    //   11: iadd
    //   12: if_icmpge +6 -> 18
    //   15: bipush 253
    //   17: ireturn
    //   18: aconst_null
    //   19: astore_3
    //   20: new 31	java/io/FileOutputStream
    //   23: dup
    //   24: aload_0
    //   25: iconst_0
    //   26: invokespecial 34	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   29: astore 4
    //   31: aload 4
    //   33: aload_1
    //   34: iconst_0
    //   35: iload_2
    //   36: invokevirtual 38	java/io/FileOutputStream:write	([BII)V
    //   39: aload 4
    //   41: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   44: iconst_0
    //   45: ireturn
    //   46: astore 10
    //   48: iconst_0
    //   49: ireturn
    //   50: astore 11
    //   52: aconst_null
    //   53: astore 6
    //   55: aload 6
    //   57: ifnull +8 -> 65
    //   60: aload 6
    //   62: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   65: iconst_m1
    //   66: ireturn
    //   67: astore 8
    //   69: aload_3
    //   70: ifnull +7 -> 77
    //   73: aload_3
    //   74: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   77: aload 8
    //   79: athrow
    //   80: astore 7
    //   82: goto -17 -> 65
    //   85: astore 9
    //   87: goto -10 -> 77
    //   90: astore 8
    //   92: aload 4
    //   94: astore_3
    //   95: goto -26 -> 69
    //   98: astore 5
    //   100: aload 4
    //   102: astore 6
    //   104: goto -49 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   39	44	46	java/io/IOException
    //   20	31	50	java/lang/Exception
    //   20	31	67	finally
    //   60	65	80	java/io/IOException
    //   73	77	85	java/io/IOException
    //   31	39	90	finally
    //   31	39	98	java/lang/Exception
  }

  // ERROR //
  public static int a(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +16 -> 17
    //   4: aload_1
    //   5: arraylength
    //   6: ifeq +11 -> 17
    //   9: aload_1
    //   10: arraylength
    //   11: iload_2
    //   12: iload_3
    //   13: iadd
    //   14: if_icmpge +6 -> 20
    //   17: bipush 254
    //   19: ireturn
    //   20: aconst_null
    //   21: astore 4
    //   23: new 31	java/io/FileOutputStream
    //   26: dup
    //   27: aload_0
    //   28: iconst_1
    //   29: invokespecial 34	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   32: astore 5
    //   34: aload 5
    //   36: aload_1
    //   37: iload_2
    //   38: iload_3
    //   39: invokevirtual 38	java/io/FileOutputStream:write	([BII)V
    //   42: aload 5
    //   44: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   47: iconst_0
    //   48: ireturn
    //   49: astore 12
    //   51: aconst_null
    //   52: astore 5
    //   54: aload 5
    //   56: ifnull +8 -> 64
    //   59: aload 5
    //   61: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   64: iconst_m1
    //   65: ireturn
    //   66: astore 9
    //   68: aload 4
    //   70: ifnull +8 -> 78
    //   73: aload 4
    //   75: invokevirtual 41	java/io/FileOutputStream:close	()V
    //   78: aload 9
    //   80: athrow
    //   81: astore 11
    //   83: goto -36 -> 47
    //   86: astore 7
    //   88: goto -24 -> 64
    //   91: astore 10
    //   93: goto -15 -> 78
    //   96: astore 8
    //   98: aload 5
    //   100: astore 4
    //   102: aload 8
    //   104: astore 9
    //   106: goto -38 -> 68
    //   109: astore 6
    //   111: goto -57 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   23	34	49	java/lang/Exception
    //   23	34	66	finally
    //   42	47	81	java/io/IOException
    //   59	64	86	java/io/IOException
    //   73	78	91	java/io/IOException
    //   34	42	96	finally
    //   34	42	109	java/lang/Exception
  }

  public static final void a(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null));
    File localFile1;
    File localFile2;
    do
    {
      return;
      localFile1 = new File(paramString1 + paramString2);
      localFile2 = new File(paramString1 + paramString3);
    }
    while (!localFile1.exists());
    localFile1.renameTo(localFile2);
  }

  public static final boolean a(File paramFile)
  {
    int i = 0;
    if ((paramFile == null) || (!paramFile.exists()))
      return false;
    if (paramFile.isFile())
      paramFile.delete();
    while (true)
    {
      paramFile.delete();
      return true;
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        while (i < arrayOfFile.length)
        {
          a(arrayOfFile[i]);
          i++;
        }
      }
    }
  }

  // ERROR //
  public static byte[] a(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ifnonnull +5 -> 8
    //   6: aload_3
    //   7: areturn
    //   8: new 46	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: astore 4
    //   18: aload 4
    //   20: invokevirtual 53	java/io/File:exists	()Z
    //   23: istore 5
    //   25: aconst_null
    //   26: astore_3
    //   27: iload 5
    //   29: ifeq -23 -> 6
    //   32: iload_2
    //   33: iconst_m1
    //   34: if_icmpne +10 -> 44
    //   37: aload 4
    //   39: invokevirtual 77	java/io/File:length	()J
    //   42: l2i
    //   43: istore_2
    //   44: aconst_null
    //   45: astore_3
    //   46: iload_1
    //   47: iflt -41 -> 6
    //   50: aconst_null
    //   51: astore_3
    //   52: iload_2
    //   53: ifle -47 -> 6
    //   56: iload_1
    //   57: iload_2
    //   58: iadd
    //   59: istore 6
    //   61: aload 4
    //   63: invokevirtual 77	java/io/File:length	()J
    //   66: l2i
    //   67: istore 7
    //   69: aconst_null
    //   70: astore_3
    //   71: iload 6
    //   73: iload 7
    //   75: if_icmpgt -69 -> 6
    //   78: new 79	java/io/RandomAccessFile
    //   81: dup
    //   82: aload_0
    //   83: ldc 81
    //   85: invokespecial 84	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: astore 8
    //   90: iload_2
    //   91: newarray byte
    //   93: astore_3
    //   94: aload 8
    //   96: iload_1
    //   97: i2l
    //   98: invokevirtual 88	java/io/RandomAccessFile:seek	(J)V
    //   101: aload 8
    //   103: aload_3
    //   104: invokevirtual 92	java/io/RandomAccessFile:readFully	([B)V
    //   107: aload 8
    //   109: invokevirtual 93	java/io/RandomAccessFile:close	()V
    //   112: aload_3
    //   113: areturn
    //   114: astore 13
    //   116: aload_3
    //   117: areturn
    //   118: astore 15
    //   120: aconst_null
    //   121: astore 8
    //   123: aload 8
    //   125: ifnull -119 -> 6
    //   128: aload 8
    //   130: invokevirtual 93	java/io/RandomAccessFile:close	()V
    //   133: aload_3
    //   134: areturn
    //   135: astore 10
    //   137: aload_3
    //   138: areturn
    //   139: astore 14
    //   141: aconst_null
    //   142: astore 8
    //   144: aload 14
    //   146: astore 11
    //   148: aload 8
    //   150: ifnull +8 -> 158
    //   153: aload 8
    //   155: invokevirtual 93	java/io/RandomAccessFile:close	()V
    //   158: aload 11
    //   160: athrow
    //   161: astore 12
    //   163: goto -5 -> 158
    //   166: astore 11
    //   168: goto -20 -> 148
    //   171: astore 9
    //   173: goto -50 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   107	112	114	java/io/IOException
    //   78	90	118	java/lang/Exception
    //   128	133	135	java/io/IOException
    //   78	90	139	finally
    //   153	158	161	java/io/IOException
    //   90	107	166	finally
    //   90	107	171	java/lang/Exception
  }

  public static int ab(String paramString)
  {
    if (paramString == null);
    File localFile;
    do
    {
      return 0;
      localFile = new File(paramString);
    }
    while (!localFile.exists());
    return (int)localFile.length();
  }

  public static final boolean ac(String paramString)
  {
    if (paramString == null);
    while (!new File(paramString).exists())
      return false;
    return true;
  }

  public static final String ad(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return "";
    String str = new File(paramString).getName();
    int i = str.lastIndexOf('.');
    if ((i <= 0) || (i == -1 + str.length()))
      return "";
    return str.substring(i + 1);
  }

  public static final boolean ae(String paramString)
  {
    if (ch.jb(paramString));
    String[] arrayOfString;
    do
    {
      return false;
      File localFile1 = new File(paramString);
      if ((localFile1.exists()) && (localFile1.isDirectory()))
        return true;
      arrayOfString = paramString.split("/");
    }
    while ((arrayOfString == null) || (arrayOfString.length < 2));
    String str = "/";
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfString.length)
        break label175;
      if (!ch.jb(arrayOfString[i]))
      {
        str = str + "/" + arrayOfString[i];
        File localFile2 = new File(str);
        if (((localFile2.isFile()) && (!localFile2.renameTo(new File(str + "_mmbak")))) || ((!localFile2.exists()) && (!localFile2.mkdir())))
          break;
      }
    }
    label175: return true;
  }

  public static String af(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    BufferedReader localBufferedReader = new BufferedReader(new FileReader(paramString));
    char[] arrayOfChar = new char[1024];
    while (true)
    {
      int i = localBufferedReader.read(arrayOfChar);
      if (i == -1)
        break;
      localStringBuffer.append(String.valueOf(arrayOfChar, 0, i));
    }
    localBufferedReader.close();
    return localStringBuffer.toString();
  }

  public static final boolean b(File paramFile)
  {
    int i = 0;
    if ((paramFile == null) || (!paramFile.exists()));
    while (!paramFile.isDirectory())
      return false;
    File[] arrayOfFile = paramFile.listFiles();
    while (i < arrayOfFile.length)
    {
      arrayOfFile[i].delete();
      i++;
    }
    return true;
  }

  // ERROR //
  public static byte[] b(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ifnonnull +9 -> 12
    //   6: aconst_null
    //   7: astore 8
    //   9: aload 8
    //   11: areturn
    //   12: new 46	java/io/File
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: astore 4
    //   22: aload 4
    //   24: invokevirtual 53	java/io/File:exists	()Z
    //   27: ifne +5 -> 32
    //   30: aconst_null
    //   31: areturn
    //   32: iload_2
    //   33: iconst_m1
    //   34: if_icmpne +164 -> 198
    //   37: aload 4
    //   39: invokevirtual 77	java/io/File:length	()J
    //   42: l2i
    //   43: istore 5
    //   45: iload_1
    //   46: ifge +5 -> 51
    //   49: aconst_null
    //   50: areturn
    //   51: iload 5
    //   53: ifgt +5 -> 58
    //   56: aconst_null
    //   57: areturn
    //   58: iload_1
    //   59: iload 5
    //   61: iadd
    //   62: aload 4
    //   64: invokevirtual 77	java/io/File:length	()J
    //   67: l2i
    //   68: if_icmple +13 -> 81
    //   71: aload 4
    //   73: invokevirtual 77	java/io/File:length	()J
    //   76: l2i
    //   77: iload_1
    //   78: isub
    //   79: istore 5
    //   81: new 79	java/io/RandomAccessFile
    //   84: dup
    //   85: aload_0
    //   86: ldc 81
    //   88: invokespecial 84	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: astore 6
    //   93: iload 5
    //   95: newarray byte
    //   97: astore 8
    //   99: iload_1
    //   100: i2l
    //   101: lstore 12
    //   103: aload 6
    //   105: lload 12
    //   107: invokevirtual 88	java/io/RandomAccessFile:seek	(J)V
    //   110: aload 6
    //   112: aload 8
    //   114: invokevirtual 92	java/io/RandomAccessFile:readFully	([B)V
    //   117: aload 6
    //   119: invokevirtual 93	java/io/RandomAccessFile:close	()V
    //   122: aload 8
    //   124: areturn
    //   125: astore 15
    //   127: aload 8
    //   129: areturn
    //   130: astore 16
    //   132: aconst_null
    //   133: astore 8
    //   135: aload_3
    //   136: ifnull -127 -> 9
    //   139: aload_3
    //   140: invokevirtual 93	java/io/RandomAccessFile:close	()V
    //   143: aload 8
    //   145: areturn
    //   146: astore 9
    //   148: aload 8
    //   150: areturn
    //   151: astore 10
    //   153: aconst_null
    //   154: astore 6
    //   156: aload 6
    //   158: ifnull +8 -> 166
    //   161: aload 6
    //   163: invokevirtual 93	java/io/RandomAccessFile:close	()V
    //   166: aload 10
    //   168: athrow
    //   169: astore 11
    //   171: goto -5 -> 166
    //   174: astore 10
    //   176: goto -20 -> 156
    //   179: astore 7
    //   181: aload 6
    //   183: astore_3
    //   184: aconst_null
    //   185: astore 8
    //   187: goto -52 -> 135
    //   190: astore 14
    //   192: aload 6
    //   194: astore_3
    //   195: goto -60 -> 135
    //   198: iload_2
    //   199: istore 5
    //   201: goto -156 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   117	122	125	java/io/IOException
    //   81	93	130	java/lang/Exception
    //   139	143	146	java/io/IOException
    //   81	93	151	finally
    //   161	166	169	java/io/IOException
    //   93	99	174	finally
    //   103	117	174	finally
    //   93	99	179	java/lang/Exception
    //   103	117	190	java/lang/Exception
  }

  // ERROR //
  public static int c(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +6 -> 7
    //   4: bipush 254
    //   6: ireturn
    //   7: aconst_null
    //   8: astore_3
    //   9: new 46	java/io/File
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: astore 4
    //   19: aload 4
    //   21: invokevirtual 53	java/io/File:exists	()Z
    //   24: ifne +9 -> 33
    //   27: aload 4
    //   29: invokevirtual 163	java/io/File:mkdirs	()Z
    //   32: pop
    //   33: new 46	java/io/File
    //   36: dup
    //   37: new 8	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 12	java/lang/StringBuilder:<init>	()V
    //   44: aload_0
    //   45: invokevirtual 16	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: aload_1
    //   49: invokevirtual 16	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 20	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;)V
    //   58: astore 11
    //   60: aload 11
    //   62: invokevirtual 53	java/io/File:exists	()Z
    //   65: ifne +9 -> 74
    //   68: aload 11
    //   70: invokevirtual 166	java/io/File:createNewFile	()Z
    //   73: pop
    //   74: new 168	java/io/BufferedOutputStream
    //   77: dup
    //   78: new 31	java/io/FileOutputStream
    //   81: dup
    //   82: aload 11
    //   84: iconst_1
    //   85: invokespecial 171	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   88: invokespecial 174	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   91: astore 6
    //   93: aload 6
    //   95: aload_2
    //   96: invokevirtual 176	java/io/BufferedOutputStream:write	([B)V
    //   99: aload 6
    //   101: invokevirtual 179	java/io/BufferedOutputStream:flush	()V
    //   104: aload 6
    //   106: invokevirtual 180	java/io/BufferedOutputStream:close	()V
    //   109: iconst_0
    //   110: ireturn
    //   111: astore 9
    //   113: aload_3
    //   114: ifnull +7 -> 121
    //   117: aload_3
    //   118: invokevirtual 180	java/io/BufferedOutputStream:close	()V
    //   121: iconst_m1
    //   122: ireturn
    //   123: astore 5
    //   125: aconst_null
    //   126: astore 6
    //   128: aload 5
    //   130: astore 7
    //   132: aload 6
    //   134: ifnull +8 -> 142
    //   137: aload 6
    //   139: invokevirtual 180	java/io/BufferedOutputStream:close	()V
    //   142: aload 7
    //   144: athrow
    //   145: astore 13
    //   147: goto -38 -> 109
    //   150: astore 10
    //   152: goto -31 -> 121
    //   155: astore 8
    //   157: goto -15 -> 142
    //   160: astore 7
    //   162: goto -30 -> 132
    //   165: astore 12
    //   167: aload 6
    //   169: astore_3
    //   170: goto -57 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   9	33	111	java/lang/Exception
    //   33	74	111	java/lang/Exception
    //   74	93	111	java/lang/Exception
    //   9	33	123	finally
    //   33	74	123	finally
    //   74	93	123	finally
    //   104	109	145	java/io/IOException
    //   117	121	150	java/io/IOException
    //   137	142	155	java/io/IOException
    //   93	104	160	finally
    //   93	104	165	java/lang/Exception
  }

  public static final boolean deleteFile(String paramString)
  {
    if (paramString == null);
    File localFile;
    do
    {
      return true;
      localFile = new File(paramString);
    }
    while (!localFile.exists());
    return localFile.delete();
  }

  // ERROR //
  public static long j(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 185	java/io/FileInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 186	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 190	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   13: astore 13
    //   15: aload 13
    //   17: astore 10
    //   19: new 31	java/io/FileOutputStream
    //   22: dup
    //   23: aload_1
    //   24: invokespecial 191	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   27: invokevirtual 192	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   30: astore 16
    //   32: aload 16
    //   34: astore_2
    //   35: aload_2
    //   36: aload 10
    //   38: lconst_0
    //   39: aload 10
    //   41: invokevirtual 197	java/nio/channels/FileChannel:size	()J
    //   44: invokevirtual 201	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   47: pop2
    //   48: aload 10
    //   50: invokevirtual 197	java/nio/channels/FileChannel:size	()J
    //   53: lstore 20
    //   55: aload 10
    //   57: ifnull +8 -> 65
    //   60: aload 10
    //   62: invokevirtual 202	java/nio/channels/FileChannel:close	()V
    //   65: aload_2
    //   66: ifnull +7 -> 73
    //   69: aload_2
    //   70: invokevirtual 202	java/nio/channels/FileChannel:close	()V
    //   73: lload 20
    //   75: lreturn
    //   76: astore 9
    //   78: aconst_null
    //   79: astore 10
    //   81: aload 10
    //   83: ifnull +8 -> 91
    //   86: aload 10
    //   88: invokevirtual 202	java/nio/channels/FileChannel:close	()V
    //   91: aload_2
    //   92: ifnull +7 -> 99
    //   95: aload_2
    //   96: invokevirtual 202	java/nio/channels/FileChannel:close	()V
    //   99: ldc2_w 203
    //   102: lreturn
    //   103: astore_3
    //   104: aconst_null
    //   105: astore 4
    //   107: aload_3
    //   108: astore 5
    //   110: aconst_null
    //   111: astore 6
    //   113: aload 4
    //   115: ifnull +8 -> 123
    //   118: aload 4
    //   120: invokevirtual 202	java/nio/channels/FileChannel:close	()V
    //   123: aload 6
    //   125: ifnull +8 -> 133
    //   128: aload 6
    //   130: invokevirtual 202	java/nio/channels/FileChannel:close	()V
    //   133: aload 5
    //   135: athrow
    //   136: astore 23
    //   138: goto -73 -> 65
    //   141: astore 22
    //   143: goto -70 -> 73
    //   146: astore 12
    //   148: goto -57 -> 91
    //   151: astore 11
    //   153: goto -54 -> 99
    //   156: astore 8
    //   158: goto -35 -> 123
    //   161: astore 7
    //   163: goto -30 -> 133
    //   166: astore 15
    //   168: aload 10
    //   170: astore 4
    //   172: aload 15
    //   174: astore 5
    //   176: aconst_null
    //   177: astore 6
    //   179: goto -66 -> 113
    //   182: astore 17
    //   184: aload 10
    //   186: astore 4
    //   188: aload_2
    //   189: astore 6
    //   191: aload 17
    //   193: astore 5
    //   195: goto -82 -> 113
    //   198: astore 14
    //   200: goto -119 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   2	15	76	java/lang/Exception
    //   2	15	103	finally
    //   60	65	136	java/io/IOException
    //   69	73	141	java/io/IOException
    //   86	91	146	java/io/IOException
    //   95	99	151	java/io/IOException
    //   118	123	156	java/io/IOException
    //   128	133	161	java/io/IOException
    //   19	32	166	finally
    //   35	55	182	finally
    //   19	32	198	java/lang/Exception
    //   35	55	198	java/lang/Exception
  }

  public static String k(String paramString1, String paramString2)
  {
    return new File(new File(paramString1), paramString2).getPath();
  }

  // ERROR //
  public static final boolean renameTo(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 53	java/io/File:exists	()Z
    //   4: istore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iload_2
    //   8: ifeq +86 -> 94
    //   11: aload_0
    //   12: invokevirtual 66	java/io/File:isDirectory	()Z
    //   15: ifeq +81 -> 96
    //   18: aload_1
    //   19: invokevirtual 53	java/io/File:exists	()Z
    //   22: ifne +8 -> 30
    //   25: aload_1
    //   26: invokevirtual 134	java/io/File:mkdir	()Z
    //   29: pop
    //   30: aload_0
    //   31: invokevirtual 70	java/io/File:listFiles	()[Ljava/io/File;
    //   34: astore 20
    //   36: iconst_0
    //   37: istore 21
    //   39: iload_3
    //   40: aload 20
    //   42: arraylength
    //   43: if_icmpge +48 -> 91
    //   46: aload 20
    //   48: iload_3
    //   49: aaload
    //   50: astore 22
    //   52: aload 22
    //   54: new 46	java/io/File
    //   57: dup
    //   58: aload_1
    //   59: invokevirtual 212	java/io/File:getPath	()Ljava/lang/String;
    //   62: aload 22
    //   64: invokevirtual 109	java/io/File:getName	()Ljava/lang/String;
    //   67: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: invokestatic 216	com/tencent/mm/a/c:renameTo	(Ljava/io/File;Ljava/io/File;)Z
    //   73: istore 21
    //   75: iload 21
    //   77: ifeq +8 -> 85
    //   80: aload_0
    //   81: invokevirtual 63	java/io/File:delete	()Z
    //   84: pop
    //   85: iinc 3 1
    //   88: goto -49 -> 39
    //   91: iload 21
    //   93: istore_3
    //   94: iload_3
    //   95: ireturn
    //   96: new 185	java/io/FileInputStream
    //   99: dup
    //   100: aload_0
    //   101: invokespecial 219	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   104: astore 4
    //   106: new 31	java/io/FileOutputStream
    //   109: dup
    //   110: aload_1
    //   111: invokespecial 220	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   114: astore 5
    //   116: ldc 221
    //   118: newarray byte
    //   120: astore 13
    //   122: aload 4
    //   124: aload 13
    //   126: invokevirtual 226	java/io/InputStream:read	([B)I
    //   129: istore 14
    //   131: iload 14
    //   133: iconst_m1
    //   134: if_icmpeq +50 -> 184
    //   137: aload 5
    //   139: aload 13
    //   141: iconst_0
    //   142: iload 14
    //   144: invokevirtual 229	java/io/OutputStream:write	([BII)V
    //   147: goto -25 -> 122
    //   150: astore 9
    //   152: aload 4
    //   154: astore 10
    //   156: aload 10
    //   158: ifnull +8 -> 166
    //   161: aload 10
    //   163: invokevirtual 230	java/io/InputStream:close	()V
    //   166: iconst_0
    //   167: istore_3
    //   168: aload 5
    //   170: ifnull -76 -> 94
    //   173: aload 5
    //   175: invokevirtual 231	java/io/OutputStream:close	()V
    //   178: iconst_0
    //   179: ireturn
    //   180: astore 11
    //   182: iconst_0
    //   183: ireturn
    //   184: aload 5
    //   186: invokevirtual 232	java/io/OutputStream:flush	()V
    //   189: aload_0
    //   190: invokevirtual 63	java/io/File:delete	()Z
    //   193: pop
    //   194: aload 4
    //   196: invokevirtual 230	java/io/InputStream:close	()V
    //   199: aload 5
    //   201: invokevirtual 231	java/io/OutputStream:close	()V
    //   204: iconst_1
    //   205: ireturn
    //   206: astore 6
    //   208: aconst_null
    //   209: astore 5
    //   211: aconst_null
    //   212: astore 4
    //   214: aload 4
    //   216: ifnull +8 -> 224
    //   219: aload 4
    //   221: invokevirtual 230	java/io/InputStream:close	()V
    //   224: aload 5
    //   226: ifnull +8 -> 234
    //   229: aload 5
    //   231: invokevirtual 231	java/io/OutputStream:close	()V
    //   234: aload 6
    //   236: athrow
    //   237: astore 16
    //   239: goto -40 -> 199
    //   242: astore 17
    //   244: goto -40 -> 204
    //   247: astore 12
    //   249: goto -83 -> 166
    //   252: astore 8
    //   254: goto -30 -> 224
    //   257: astore 7
    //   259: goto -25 -> 234
    //   262: astore 6
    //   264: aconst_null
    //   265: astore 5
    //   267: goto -53 -> 214
    //   270: astore 6
    //   272: goto -58 -> 214
    //   275: astore 19
    //   277: aconst_null
    //   278: astore 5
    //   280: aconst_null
    //   281: astore 10
    //   283: goto -127 -> 156
    //   286: astore 18
    //   288: aload 4
    //   290: astore 10
    //   292: aconst_null
    //   293: astore 5
    //   295: goto -139 -> 156
    //
    // Exception table:
    //   from	to	target	type
    //   116	122	150	java/lang/Exception
    //   122	131	150	java/lang/Exception
    //   137	147	150	java/lang/Exception
    //   184	194	150	java/lang/Exception
    //   173	178	180	java/io/IOException
    //   96	106	206	finally
    //   194	199	237	java/io/IOException
    //   199	204	242	java/io/IOException
    //   161	166	247	java/io/IOException
    //   219	224	252	java/io/IOException
    //   229	234	257	java/io/IOException
    //   106	116	262	finally
    //   116	122	270	finally
    //   122	131	270	finally
    //   137	147	270	finally
    //   184	194	270	finally
    //   96	106	275	java/lang/Exception
    //   106	116	286	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.c
 * JD-Core Version:    0.6.2
 */