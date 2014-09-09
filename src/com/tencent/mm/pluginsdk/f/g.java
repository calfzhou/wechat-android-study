package com.tencent.mm.pluginsdk.f;

public final class g
{
  // ERROR //
  public static void a(android.graphics.Bitmap paramBitmap, android.graphics.Bitmap.CompressFormat paramCompressFormat, String paramString)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +10 -> 11
    //   4: aload_2
    //   5: invokevirtual 18	java/lang/String:length	()I
    //   8: ifgt +19 -> 27
    //   11: iconst_1
    //   12: istore_3
    //   13: iload_3
    //   14: ifeq +18 -> 32
    //   17: new 10	java/io/IOException
    //   20: dup
    //   21: ldc 20
    //   23: invokespecial 24	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   26: athrow
    //   27: iconst_0
    //   28: istore_3
    //   29: goto -16 -> 13
    //   32: new 26	java/io/File
    //   35: dup
    //   36: aload_2
    //   37: invokespecial 27	java/io/File:<init>	(Ljava/lang/String;)V
    //   40: astore 4
    //   42: aload 4
    //   44: invokevirtual 31	java/io/File:createNewFile	()Z
    //   47: pop
    //   48: aconst_null
    //   49: astore 6
    //   51: new 33	java/io/FileOutputStream
    //   54: dup
    //   55: aload 4
    //   57: invokespecial 36	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   60: astore 7
    //   62: aload_0
    //   63: aload_1
    //   64: bipush 60
    //   66: aload 7
    //   68: invokevirtual 42	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   71: pop
    //   72: aload 7
    //   74: invokevirtual 46	java/io/FileOutputStream:flush	()V
    //   77: aload 7
    //   79: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   82: aload_0
    //   83: invokevirtual 52	android/graphics/Bitmap:recycle	()V
    //   86: return
    //   87: astore 21
    //   89: aconst_null
    //   90: astore 7
    //   92: aload 7
    //   94: ifnull +8 -> 102
    //   97: aload 7
    //   99: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   102: aload_0
    //   103: invokevirtual 52	android/graphics/Bitmap:recycle	()V
    //   106: return
    //   107: astore 20
    //   109: aconst_null
    //   110: astore 7
    //   112: aload 7
    //   114: ifnull +8 -> 122
    //   117: aload 7
    //   119: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   122: aload_0
    //   123: invokevirtual 52	android/graphics/Bitmap:recycle	()V
    //   126: return
    //   127: astore 19
    //   129: aconst_null
    //   130: astore 7
    //   132: aload 7
    //   134: ifnull +8 -> 142
    //   137: aload 7
    //   139: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   142: aload_0
    //   143: invokevirtual 52	android/graphics/Bitmap:recycle	()V
    //   146: return
    //   147: astore 15
    //   149: aload 6
    //   151: ifnull +8 -> 159
    //   154: aload 6
    //   156: invokevirtual 49	java/io/FileOutputStream:close	()V
    //   159: aload_0
    //   160: invokevirtual 52	android/graphics/Bitmap:recycle	()V
    //   163: aload 15
    //   165: athrow
    //   166: astore 18
    //   168: goto -86 -> 82
    //   171: astore 9
    //   173: goto -71 -> 102
    //   176: astore 11
    //   178: goto -56 -> 122
    //   181: astore 13
    //   183: goto -41 -> 142
    //   186: astore 16
    //   188: goto -29 -> 159
    //   191: astore 14
    //   193: aload 7
    //   195: astore 6
    //   197: aload 14
    //   199: astore 15
    //   201: goto -52 -> 149
    //   204: astore 12
    //   206: goto -74 -> 132
    //   209: astore 10
    //   211: goto -99 -> 112
    //   214: astore 8
    //   216: goto -124 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   51	62	87	java/io/FileNotFoundException
    //   51	62	107	java/io/IOException
    //   51	62	127	java/lang/Exception
    //   51	62	147	finally
    //   77	82	166	java/io/IOException
    //   97	102	171	java/io/IOException
    //   117	122	176	java/io/IOException
    //   137	142	181	java/io/IOException
    //   154	159	186	java/io/IOException
    //   62	77	191	finally
    //   62	77	204	java/lang/Exception
    //   62	77	209	java/io/IOException
    //   62	77	214	java/io/FileNotFoundException
  }

  public static String eY(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(paramInt / 60L);
    arrayOfObject[1] = Long.valueOf(paramInt % 60L);
    return String.format("%d:%02d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.g
 * JD-Core Version:    0.6.2
 */