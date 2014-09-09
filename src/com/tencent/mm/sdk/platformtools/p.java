package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;

public final class p
{
  // ERROR //
  private static boolean a(java.io.InputStream paramInputStream, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: invokevirtual 16	java/io/InputStream:available	()I
    //   6: istore 12
    //   8: new 18	java/io/FileOutputStream
    //   11: dup
    //   12: aload_1
    //   13: iload_2
    //   14: invokespecial 22	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   17: astore 9
    //   19: sipush 16384
    //   22: newarray byte
    //   24: astore 14
    //   26: aload_0
    //   27: aload 14
    //   29: invokevirtual 26	java/io/InputStream:read	([B)I
    //   32: istore 15
    //   34: iload 15
    //   36: iconst_m1
    //   37: if_icmpeq +42 -> 79
    //   40: aload 9
    //   42: aload 14
    //   44: iconst_0
    //   45: iload 15
    //   47: invokevirtual 30	java/io/FileOutputStream:write	([BII)V
    //   50: goto -24 -> 26
    //   53: astore 13
    //   55: aload 9
    //   57: astore 5
    //   59: aload_0
    //   60: ifnull +7 -> 67
    //   63: aload_0
    //   64: invokevirtual 34	java/io/InputStream:close	()V
    //   67: aload 5
    //   69: ifnull +8 -> 77
    //   72: aload 5
    //   74: invokevirtual 35	java/io/FileOutputStream:close	()V
    //   77: iconst_0
    //   78: ireturn
    //   79: iload_2
    //   80: ifeq +18 -> 98
    //   83: aload_0
    //   84: ifnull +7 -> 91
    //   87: aload_0
    //   88: invokevirtual 34	java/io/InputStream:close	()V
    //   91: aload 9
    //   93: invokevirtual 35	java/io/FileOutputStream:close	()V
    //   96: iload_3
    //   97: ireturn
    //   98: new 37	java/io/File
    //   101: dup
    //   102: aload_1
    //   103: invokespecial 40	java/io/File:<init>	(Ljava/lang/String;)V
    //   106: astore 16
    //   108: aload 16
    //   110: invokevirtual 44	java/io/File:exists	()Z
    //   113: ifeq +23 -> 136
    //   116: iload 12
    //   118: i2l
    //   119: lstore 17
    //   121: aload 16
    //   123: invokevirtual 48	java/io/File:length	()J
    //   126: lstore 19
    //   128: lload 17
    //   130: lload 19
    //   132: lcmp
    //   133: ifeq -50 -> 83
    //   136: iconst_0
    //   137: istore_3
    //   138: goto -55 -> 83
    //   141: astore 22
    //   143: iconst_0
    //   144: istore_3
    //   145: goto -54 -> 91
    //   148: astore 8
    //   150: aconst_null
    //   151: astore 9
    //   153: aload_0
    //   154: ifnull +7 -> 161
    //   157: aload_0
    //   158: invokevirtual 34	java/io/InputStream:close	()V
    //   161: aload 9
    //   163: ifnull +8 -> 171
    //   166: aload 9
    //   168: invokevirtual 35	java/io/FileOutputStream:close	()V
    //   171: aload 8
    //   173: athrow
    //   174: astore 21
    //   176: iconst_0
    //   177: ireturn
    //   178: astore 7
    //   180: goto -113 -> 67
    //   183: astore 6
    //   185: iconst_0
    //   186: ireturn
    //   187: astore 11
    //   189: goto -28 -> 161
    //   192: astore 10
    //   194: goto -23 -> 171
    //   197: astore 8
    //   199: goto -46 -> 153
    //   202: astore 4
    //   204: aconst_null
    //   205: astore 5
    //   207: goto -148 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   19	26	53	java/lang/Exception
    //   26	34	53	java/lang/Exception
    //   40	50	53	java/lang/Exception
    //   98	116	53	java/lang/Exception
    //   121	128	53	java/lang/Exception
    //   87	91	141	java/io/IOException
    //   2	19	148	finally
    //   91	96	174	java/io/IOException
    //   63	67	178	java/io/IOException
    //   72	77	183	java/io/IOException
    //   157	161	187	java/io/IOException
    //   166	171	192	java/io/IOException
    //   19	26	197	finally
    //   26	34	197	finally
    //   40	50	197	finally
    //   98	116	197	finally
    //   121	128	197	finally
    //   2	19	202	java/lang/Exception
  }

  // ERROR //
  public static boolean bA(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 52	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 53	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   8: astore_2
    //   9: new 18	java/io/FileOutputStream
    //   12: dup
    //   13: aload_1
    //   14: invokespecial 54	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   17: astore_3
    //   18: sipush 16384
    //   21: newarray byte
    //   23: astore 12
    //   25: aload_2
    //   26: aload 12
    //   28: invokevirtual 55	java/io/FileInputStream:read	([B)I
    //   31: istore 13
    //   33: iload 13
    //   35: iconst_m1
    //   36: if_icmpeq +45 -> 81
    //   39: aload_3
    //   40: aload 12
    //   42: iconst_0
    //   43: iload 13
    //   45: invokevirtual 30	java/io/FileOutputStream:write	([BII)V
    //   48: goto -23 -> 25
    //   51: astore 7
    //   53: aload_3
    //   54: astore 8
    //   56: aload_2
    //   57: astore 9
    //   59: aload 9
    //   61: ifnull +8 -> 69
    //   64: aload 9
    //   66: invokevirtual 56	java/io/FileInputStream:close	()V
    //   69: aload 8
    //   71: ifnull +122 -> 193
    //   74: aload 8
    //   76: invokevirtual 35	java/io/FileOutputStream:close	()V
    //   79: iconst_0
    //   80: ireturn
    //   81: iconst_1
    //   82: istore 14
    //   84: aload_2
    //   85: invokevirtual 56	java/io/FileInputStream:close	()V
    //   88: aload_3
    //   89: invokevirtual 35	java/io/FileOutputStream:close	()V
    //   92: iload 14
    //   94: ireturn
    //   95: astore 16
    //   97: iconst_0
    //   98: ireturn
    //   99: astore 15
    //   101: iconst_0
    //   102: istore 14
    //   104: goto -16 -> 88
    //   107: astore 10
    //   109: iconst_0
    //   110: ireturn
    //   111: astore 20
    //   113: aconst_null
    //   114: astore_3
    //   115: aconst_null
    //   116: astore_2
    //   117: aload 20
    //   119: astore 4
    //   121: aload_2
    //   122: ifnull +7 -> 129
    //   125: aload_2
    //   126: invokevirtual 56	java/io/FileInputStream:close	()V
    //   129: aload_3
    //   130: ifnull +7 -> 137
    //   133: aload_3
    //   134: invokevirtual 35	java/io/FileOutputStream:close	()V
    //   137: aload 4
    //   139: athrow
    //   140: astore 11
    //   142: goto -73 -> 69
    //   145: astore 6
    //   147: goto -18 -> 129
    //   150: astore 5
    //   152: goto -15 -> 137
    //   155: astore 18
    //   157: aload 18
    //   159: astore 4
    //   161: aconst_null
    //   162: astore_3
    //   163: goto -42 -> 121
    //   166: astore 4
    //   168: goto -47 -> 121
    //   171: astore 19
    //   173: aconst_null
    //   174: astore 8
    //   176: aconst_null
    //   177: astore 9
    //   179: goto -120 -> 59
    //   182: astore 17
    //   184: aload_2
    //   185: astore 9
    //   187: aconst_null
    //   188: astore 8
    //   190: goto -131 -> 59
    //   193: iconst_0
    //   194: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   18	25	51	java/lang/Exception
    //   25	33	51	java/lang/Exception
    //   39	48	51	java/lang/Exception
    //   88	92	95	java/io/IOException
    //   84	88	99	java/io/IOException
    //   74	79	107	java/io/IOException
    //   0	9	111	finally
    //   64	69	140	java/io/IOException
    //   125	129	145	java/io/IOException
    //   133	137	150	java/io/IOException
    //   9	18	155	finally
    //   18	25	166	finally
    //   25	33	166	finally
    //   39	48	166	finally
    //   0	9	171	java/lang/Exception
    //   9	18	182	java/lang/Exception
  }

  public static boolean f(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 0;
    File localFile1 = new File(paramString1);
    if (!localFile1.exists());
    File localFile2;
    do
    {
      return false;
      localFile2 = new File(paramString2);
      if (!localFile1.isFile())
        break;
    }
    while ((!localFile2.isFile()) && (localFile2.exists()));
    bA(paramString1, paramString2);
    if (paramBoolean)
      localFile1.delete();
    while (true)
    {
      return true;
      if (localFile1.isDirectory())
      {
        if (!localFile2.exists())
          localFile2.mkdir();
        if (!localFile2.isDirectory())
          break;
        String[] arrayOfString = localFile1.list();
        while (i < arrayOfString.length)
        {
          f(paramString1 + "/" + arrayOfString[i], paramString2 + "/" + arrayOfString[i], paramBoolean);
          i++;
        }
      }
    }
  }

  public static boolean n(Context paramContext, String paramString1, String paramString2)
  {
    int i = 0;
    try
    {
      boolean bool = a(paramContext.getAssets().open(paramString1), paramString2, false);
      return bool;
    }
    catch (IOException localIOException1)
    {
      z.d("!32@/B4Tb64lLpKEimhusr6EBVHdaUJF77fu", "copy assets file srcpath=%s to=%s failed, try pattern now", new Object[] { paramString1, paramString2 });
      while (true)
      {
        String str = paramString1 + "." + i;
        try
        {
          if (a(paramContext.getAssets().open(str), paramString2, true))
          {
            z.d("!32@/B4Tb64lLpKEimhusr6EBVHdaUJF77fu", "copy pattern %s", new Object[] { str });
            i++;
          }
        }
        catch (IOException localIOException2)
        {
        }
      }
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.p
 * JD-Core Version:    0.6.2
 */