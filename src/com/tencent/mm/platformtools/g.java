package com.tencent.mm.platformtools;

import com.tencent.mm.sdk.platformtools.z;
import java.util.Properties;

public final class g
{
  private Properties dUD;
  private String filePath;

  // ERROR //
  public g(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 17	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: aconst_null
    //   6: putfield 19	com/tencent/mm/platformtools/g:dUD	Ljava/util/Properties;
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield 21	com/tencent/mm/platformtools/g:filePath	Ljava/lang/String;
    //   14: aload_0
    //   15: new 23	java/util/Properties
    //   18: dup
    //   19: invokespecial 24	java/util/Properties:<init>	()V
    //   22: putfield 19	com/tencent/mm/platformtools/g:dUD	Ljava/util/Properties;
    //   25: aload_0
    //   26: aload_1
    //   27: putfield 21	com/tencent/mm/platformtools/g:filePath	Ljava/lang/String;
    //   30: new 26	java/io/FileInputStream
    //   33: dup
    //   34: aload_1
    //   35: invokespecial 28	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   38: astore_2
    //   39: aload_0
    //   40: getfield 19	com/tencent/mm/platformtools/g:dUD	Ljava/util/Properties;
    //   43: aload_2
    //   44: invokevirtual 32	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   47: aload_2
    //   48: invokevirtual 35	java/io/FileInputStream:close	()V
    //   51: return
    //   52: astore 10
    //   54: iconst_2
    //   55: anewarray 4	java/lang/Object
    //   58: astore 11
    //   60: aload 11
    //   62: iconst_0
    //   63: aload_1
    //   64: aastore
    //   65: aload 11
    //   67: iconst_1
    //   68: aload 10
    //   70: invokevirtual 39	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   73: aastore
    //   74: ldc 41
    //   76: ldc 43
    //   78: aload 11
    //   80: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: return
    //   84: astore_3
    //   85: aconst_null
    //   86: astore_2
    //   87: iconst_2
    //   88: anewarray 4	java/lang/Object
    //   91: astore 7
    //   93: aload 7
    //   95: iconst_0
    //   96: aload_1
    //   97: aastore
    //   98: aload 7
    //   100: iconst_1
    //   101: aload_3
    //   102: invokevirtual 50	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   105: aastore
    //   106: ldc 41
    //   108: ldc 52
    //   110: aload 7
    //   112: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload_2
    //   116: ifnull -65 -> 51
    //   119: aload_2
    //   120: invokevirtual 35	java/io/FileInputStream:close	()V
    //   123: return
    //   124: astore 8
    //   126: iconst_2
    //   127: anewarray 4	java/lang/Object
    //   130: astore 9
    //   132: aload 9
    //   134: iconst_0
    //   135: aload_1
    //   136: aastore
    //   137: aload 9
    //   139: iconst_1
    //   140: aload 8
    //   142: invokevirtual 39	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   145: aastore
    //   146: ldc 41
    //   148: ldc 43
    //   150: aload 9
    //   152: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: return
    //   156: astore 4
    //   158: aconst_null
    //   159: astore_2
    //   160: aload_2
    //   161: ifnull +7 -> 168
    //   164: aload_2
    //   165: invokevirtual 35	java/io/FileInputStream:close	()V
    //   168: aload 4
    //   170: athrow
    //   171: astore 5
    //   173: iconst_2
    //   174: anewarray 4	java/lang/Object
    //   177: astore 6
    //   179: aload 6
    //   181: iconst_0
    //   182: aload_1
    //   183: aastore
    //   184: aload 6
    //   186: iconst_1
    //   187: aload 5
    //   189: invokevirtual 39	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   192: aastore
    //   193: ldc 41
    //   195: ldc 43
    //   197: aload 6
    //   199: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: goto -34 -> 168
    //   205: astore 4
    //   207: goto -47 -> 160
    //   210: astore_3
    //   211: goto -124 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   47	51	52	java/io/IOException
    //   30	39	84	java/lang/Exception
    //   119	123	124	java/io/IOException
    //   30	39	156	finally
    //   164	168	171	java/io/IOException
    //   39	47	205	finally
    //   87	115	205	finally
    //   39	47	210	java/lang/Exception
  }

  public static Long X(String paramString1, String paramString2)
  {
    return new g(paramString1).jx(paramString2);
  }

  public static long a(String paramString1, String paramString2, long paramLong)
  {
    Long localLong = new g(paramString1).jx(paramString2);
    if (localLong == null)
      return paramLong;
    return localLong.longValue();
  }

  public static boolean b(String paramString1, String paramString2, long paramLong)
  {
    return new g(paramString1).W(paramString2, String.valueOf(paramLong));
  }

  public static boolean d(String paramString1, String paramString2, int paramInt)
  {
    return new g(paramString1).v(paramString2, paramInt);
  }

  public static String getValue(String paramString1, String paramString2)
  {
    return new g(paramString1).getValue(paramString2);
  }

  public static boolean h(String paramString1, String paramString2, String paramString3)
  {
    return new g(paramString1).W(paramString2, paramString3);
  }

  private Long jx(String paramString)
  {
    String str = getValue(paramString);
    if (str == null)
      return null;
    try
    {
      Long localLong = Long.valueOf(Long.parseLong(str));
      return localLong;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str;
      arrayOfObject[1] = localException.getLocalizedMessage();
      z.e("!32@/B4Tb64lLpI24FTqnIlF6kXlwDUHA2X3", "getLongValue ParseLong : %s Failed. [%s]", arrayOfObject);
    }
    return null;
  }

  // ERROR //
  public final boolean W(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 103	java/io/FileOutputStream
    //   3: dup
    //   4: aload_0
    //   5: getfield 21	com/tencent/mm/platformtools/g:filePath	Ljava/lang/String;
    //   8: invokespecial 104	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   11: astore_3
    //   12: aload_0
    //   13: getfield 19	com/tencent/mm/platformtools/g:dUD	Ljava/util/Properties;
    //   16: aload_1
    //   17: aload_2
    //   18: invokevirtual 108	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   21: pop
    //   22: aload_0
    //   23: getfield 19	com/tencent/mm/platformtools/g:dUD	Ljava/util/Properties;
    //   26: aload_3
    //   27: ldc 110
    //   29: invokevirtual 114	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   32: aload_3
    //   33: invokevirtual 115	java/io/FileOutputStream:close	()V
    //   36: iconst_1
    //   37: ireturn
    //   38: astore 12
    //   40: iconst_2
    //   41: anewarray 4	java/lang/Object
    //   44: astore 13
    //   46: aload 13
    //   48: iconst_0
    //   49: aload_0
    //   50: getfield 21	com/tencent/mm/platformtools/g:filePath	Ljava/lang/String;
    //   53: aastore
    //   54: aload 13
    //   56: iconst_1
    //   57: aload 12
    //   59: invokevirtual 39	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   62: aastore
    //   63: ldc 41
    //   65: ldc 43
    //   67: aload 13
    //   69: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: iconst_1
    //   73: ireturn
    //   74: astore 4
    //   76: aconst_null
    //   77: astore_3
    //   78: iconst_2
    //   79: anewarray 4	java/lang/Object
    //   82: astore 8
    //   84: aload 8
    //   86: iconst_0
    //   87: aload_0
    //   88: getfield 21	com/tencent/mm/platformtools/g:filePath	Ljava/lang/String;
    //   91: aastore
    //   92: aload 8
    //   94: iconst_1
    //   95: aload 4
    //   97: invokevirtual 50	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   100: aastore
    //   101: ldc 41
    //   103: ldc 117
    //   105: aload 8
    //   107: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_3
    //   111: ifnull +107 -> 218
    //   114: aload_3
    //   115: invokevirtual 115	java/io/FileOutputStream:close	()V
    //   118: iconst_0
    //   119: ireturn
    //   120: astore 9
    //   122: iconst_2
    //   123: anewarray 4	java/lang/Object
    //   126: astore 10
    //   128: aload 10
    //   130: iconst_0
    //   131: aload_0
    //   132: getfield 21	com/tencent/mm/platformtools/g:filePath	Ljava/lang/String;
    //   135: aastore
    //   136: aload 10
    //   138: iconst_1
    //   139: aload 9
    //   141: invokevirtual 39	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   144: aastore
    //   145: ldc 41
    //   147: ldc 43
    //   149: aload 10
    //   151: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: iconst_0
    //   155: ireturn
    //   156: astore 5
    //   158: aconst_null
    //   159: astore_3
    //   160: aload_3
    //   161: ifnull +7 -> 168
    //   164: aload_3
    //   165: invokevirtual 115	java/io/FileOutputStream:close	()V
    //   168: aload 5
    //   170: athrow
    //   171: astore 6
    //   173: iconst_2
    //   174: anewarray 4	java/lang/Object
    //   177: astore 7
    //   179: aload 7
    //   181: iconst_0
    //   182: aload_0
    //   183: getfield 21	com/tencent/mm/platformtools/g:filePath	Ljava/lang/String;
    //   186: aastore
    //   187: aload 7
    //   189: iconst_1
    //   190: aload 6
    //   192: invokevirtual 39	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   195: aastore
    //   196: ldc 41
    //   198: ldc 43
    //   200: aload 7
    //   202: invokestatic 49	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: goto -37 -> 168
    //   208: astore 5
    //   210: goto -50 -> 160
    //   213: astore 4
    //   215: goto -137 -> 78
    //   218: iconst_0
    //   219: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   32	36	38	java/io/IOException
    //   0	12	74	java/lang/Exception
    //   114	118	120	java/io/IOException
    //   0	12	156	finally
    //   164	168	171	java/io/IOException
    //   12	32	208	finally
    //   78	110	208	finally
    //   12	32	213	java/lang/Exception
  }

  public final String getValue(String paramString)
  {
    if ((this.dUD != null) && (this.dUD.containsKey(paramString)))
      return this.dUD.getProperty(paramString);
    return null;
  }

  public final Integer jy(String paramString)
  {
    String str = getValue(paramString);
    if (str == null)
      return null;
    try
    {
      Integer localInteger = Integer.valueOf(Integer.parseInt(str));
      return localInteger;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str;
      arrayOfObject[1] = localException.getLocalizedMessage();
      z.e("!32@/B4Tb64lLpI24FTqnIlF6kXlwDUHA2X3", "getIntegerValue ParseInteger : %s Failed. [%s]", arrayOfObject);
    }
    return null;
  }

  public final boolean v(String paramString, int paramInt)
  {
    return W(paramString, String.valueOf(paramInt));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.g
 * JD-Core Version:    0.6.2
 */