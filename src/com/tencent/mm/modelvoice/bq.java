package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import junit.framework.Assert;

public final class bq
{
  // ERROR //
  public static boolean a(String paramString, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iload_2
    //   3: ifeq +70 -> 73
    //   6: ldc 12
    //   8: new 14	java/lang/StringBuilder
    //   11: dup
    //   12: ldc 16
    //   14: invokespecial 20	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_0
    //   18: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 28	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: invokestatic 34	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: new 36	java/io/RandomAccessFile
    //   30: dup
    //   31: aload_0
    //   32: ldc 38
    //   34: invokespecial 40	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: astore 4
    //   39: bipush 6
    //   41: newarray byte
    //   43: astore 10
    //   45: aload 4
    //   47: aload 10
    //   49: iconst_0
    //   50: bipush 6
    //   52: invokevirtual 44	java/io/RandomAccessFile:read	([BII)I
    //   55: iconst_m1
    //   56: if_icmpne +29 -> 85
    //   59: ldc 12
    //   61: ldc 46
    //   63: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: aload 4
    //   68: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   71: iconst_0
    //   72: ireturn
    //   73: iload_1
    //   74: ifne +178 -> 252
    //   77: aload_0
    //   78: invokestatic 59	com/tencent/mm/modelvoice/bs:gP	(Ljava/lang/String;)Ljava/lang/String;
    //   81: astore_0
    //   82: goto -76 -> 6
    //   85: new 61	java/lang/String
    //   88: dup
    //   89: aload 10
    //   91: invokespecial 64	java/lang/String:<init>	([B)V
    //   94: astore 11
    //   96: iconst_3
    //   97: anewarray 4	java/lang/Object
    //   100: astore 12
    //   102: aload 12
    //   104: iconst_0
    //   105: aload 10
    //   107: invokestatic 70	com/tencent/mm/sdk/platformtools/ch:cF	([B)Ljava/lang/String;
    //   110: aastore
    //   111: aload 12
    //   113: iconst_1
    //   114: aload 11
    //   116: aastore
    //   117: aload 12
    //   119: iconst_2
    //   120: ldc 72
    //   122: aastore
    //   123: ldc 12
    //   125: ldc 74
    //   127: aload 12
    //   129: invokestatic 78	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: aload 11
    //   134: ldc 72
    //   136: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   139: istore 13
    //   141: iload 13
    //   143: ifeq +10 -> 153
    //   146: aload 4
    //   148: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   151: iconst_1
    //   152: ireturn
    //   153: aload 4
    //   155: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   158: iconst_0
    //   159: ireturn
    //   160: astore 18
    //   162: ldc 12
    //   164: ldc 84
    //   166: invokestatic 34	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   169: aload_3
    //   170: ifnull -12 -> 158
    //   173: aload_3
    //   174: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   177: goto -19 -> 158
    //   180: astore 9
    //   182: goto -24 -> 158
    //   185: astore 17
    //   187: aconst_null
    //   188: astore 4
    //   190: aload 17
    //   192: astore 7
    //   194: aload 4
    //   196: ifnull +8 -> 204
    //   199: aload 4
    //   201: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   204: aload 7
    //   206: athrow
    //   207: astore 16
    //   209: goto -138 -> 71
    //   212: astore 15
    //   214: goto -63 -> 151
    //   217: astore 14
    //   219: goto -61 -> 158
    //   222: astore 8
    //   224: goto -20 -> 204
    //   227: astore 7
    //   229: goto -35 -> 194
    //   232: astore 6
    //   234: aload_3
    //   235: astore 4
    //   237: aload 6
    //   239: astore 7
    //   241: goto -47 -> 194
    //   244: astore 5
    //   246: aload 4
    //   248: astore_3
    //   249: goto -87 -> 162
    //   252: aconst_null
    //   253: astore_0
    //   254: goto -248 -> 6
    //
    // Exception table:
    //   from	to	target	type
    //   27	39	160	java/lang/Exception
    //   173	177	180	java/io/IOException
    //   27	39	185	finally
    //   66	71	207	java/io/IOException
    //   146	151	212	java/io/IOException
    //   153	158	217	java/io/IOException
    //   199	204	222	java/io/IOException
    //   39	66	227	finally
    //   85	141	227	finally
    //   162	169	232	finally
    //   39	66	244	java/lang/Exception
    //   85	141	244	java/lang/Exception
  }

  // ERROR //
  public static boolean b(String paramString, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iload_2
    //   3: ifeq +73 -> 76
    //   6: ldc 12
    //   8: new 14	java/lang/StringBuilder
    //   11: dup
    //   12: ldc 87
    //   14: invokespecial 20	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_0
    //   18: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 28	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: invokestatic 34	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: new 36	java/io/RandomAccessFile
    //   30: dup
    //   31: aload_0
    //   32: ldc 38
    //   34: invokespecial 40	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: astore 4
    //   39: bipush 9
    //   41: newarray byte
    //   43: astore 10
    //   45: aload 4
    //   47: lconst_1
    //   48: invokevirtual 91	java/io/RandomAccessFile:seek	(J)V
    //   51: aload 4
    //   53: aload 10
    //   55: iconst_0
    //   56: bipush 9
    //   58: invokevirtual 44	java/io/RandomAccessFile:read	([BII)I
    //   61: istore 11
    //   63: iload 11
    //   65: iconst_m1
    //   66: if_icmpne +44 -> 110
    //   69: aload 4
    //   71: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   74: iconst_0
    //   75: ireturn
    //   76: iload_1
    //   77: ifne +11 -> 88
    //   80: aload_0
    //   81: invokestatic 59	com/tencent/mm/modelvoice/bs:gP	(Ljava/lang/String;)Ljava/lang/String;
    //   84: astore_0
    //   85: goto -79 -> 6
    //   88: iload_1
    //   89: iconst_1
    //   90: if_icmpne +187 -> 277
    //   93: ldc 12
    //   95: ldc 93
    //   97: iconst_1
    //   98: anewarray 4	java/lang/Object
    //   101: dup
    //   102: iconst_0
    //   103: aload_0
    //   104: aastore
    //   105: invokestatic 95	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: iconst_0
    //   109: ireturn
    //   110: new 61	java/lang/String
    //   113: dup
    //   114: aload 10
    //   116: invokespecial 64	java/lang/String:<init>	([B)V
    //   119: astore 12
    //   121: iconst_3
    //   122: anewarray 4	java/lang/Object
    //   125: astore 13
    //   127: aload 13
    //   129: iconst_0
    //   130: aload 10
    //   132: invokestatic 70	com/tencent/mm/sdk/platformtools/ch:cF	([B)Ljava/lang/String;
    //   135: aastore
    //   136: aload 13
    //   138: iconst_1
    //   139: aload 12
    //   141: aastore
    //   142: aload 13
    //   144: iconst_2
    //   145: ldc 97
    //   147: aastore
    //   148: ldc 12
    //   150: ldc 99
    //   152: aload 13
    //   154: invokestatic 78	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload 12
    //   159: ldc 97
    //   161: invokevirtual 82	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   164: istore 14
    //   166: iload 14
    //   168: ifeq +10 -> 178
    //   171: aload 4
    //   173: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   176: iconst_1
    //   177: ireturn
    //   178: aload 4
    //   180: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   183: iconst_0
    //   184: ireturn
    //   185: astore 19
    //   187: ldc 12
    //   189: ldc 101
    //   191: invokestatic 34	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   194: aload_3
    //   195: ifnull -12 -> 183
    //   198: aload_3
    //   199: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   202: goto -19 -> 183
    //   205: astore 9
    //   207: goto -24 -> 183
    //   210: astore 18
    //   212: aconst_null
    //   213: astore 4
    //   215: aload 18
    //   217: astore 7
    //   219: aload 4
    //   221: ifnull +8 -> 229
    //   224: aload 4
    //   226: invokevirtual 53	java/io/RandomAccessFile:close	()V
    //   229: aload 7
    //   231: athrow
    //   232: astore 17
    //   234: goto -160 -> 74
    //   237: astore 16
    //   239: goto -63 -> 176
    //   242: astore 15
    //   244: goto -61 -> 183
    //   247: astore 8
    //   249: goto -20 -> 229
    //   252: astore 7
    //   254: goto -35 -> 219
    //   257: astore 6
    //   259: aload_3
    //   260: astore 4
    //   262: aload 6
    //   264: astore 7
    //   266: goto -47 -> 219
    //   269: astore 5
    //   271: aload 4
    //   273: astore_3
    //   274: goto -87 -> 187
    //   277: aconst_null
    //   278: astore_0
    //   279: goto -273 -> 6
    //
    // Exception table:
    //   from	to	target	type
    //   27	39	185	java/lang/Exception
    //   198	202	205	java/io/IOException
    //   27	39	210	finally
    //   69	74	232	java/io/IOException
    //   171	176	237	java/io/IOException
    //   178	183	242	java/io/IOException
    //   224	229	247	java/io/IOException
    //   39	63	252	finally
    //   110	166	252	finally
    //   187	194	257	finally
    //   39	63	269	java/lang/Exception
    //   110	166	269	java/lang/Exception
  }

  public static int id(String paramString)
  {
    boolean bool1 = true;
    int i;
    switch (ir(paramString))
    {
    default:
      i = is(bs.gP(paramString));
      return i;
    case 0:
      return is(bs.gP(paramString));
    case 1:
      String str2 = bs.gP(paramString);
      if (str2.length() >= 0);
      while (true)
      {
        Assert.assertTrue(bool1);
        File localFile2 = new File(str2);
        boolean bool3 = localFile2.exists();
        i = 0;
        if (!bool3)
          break;
        int k = (int)localFile2.length();
        i = 0;
        if (k <= 0)
          break;
        return k;
        bool1 = false;
      }
    case 2:
    }
    String str1 = bs.gP(paramString);
    if (str1.length() >= 0);
    while (true)
    {
      Assert.assertTrue(bool1);
      File localFile1 = new File(str1);
      boolean bool2 = localFile1.exists();
      i = 0;
      if (!bool2)
        break;
      int j = (int)localFile1.length();
      i = 0;
      if (j <= 0)
        break;
      return j;
      bool1 = false;
    }
  }

  public static int ir(String paramString)
  {
    int i;
    if (ch.jb(paramString))
      i = -1;
    boolean bool;
    do
    {
      return i;
      z.d("!32@/B4Tb64lLpLz7JvmHlUIfrN9/jVx6uz4", "fileName " + paramString);
      bool = a(paramString, 0, false);
      i = 0;
    }
    while (bool);
    if (b(paramString, 0, false))
      return 2;
    return 1;
  }

  private static int is(String paramString)
  {
    boolean bool;
    File localFile;
    if (paramString.length() >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      localFile = new File(paramString);
      if (localFile.exists())
        break label36;
    }
    label36: int i;
    do
    {
      return 0;
      bool = false;
      break;
      i = -6 + (int)localFile.length();
    }
    while (i <= 0);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bq
 * JD-Core Version:    0.6.2
 */