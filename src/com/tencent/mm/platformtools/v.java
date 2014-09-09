package com.tencent.mm.platformtools;

import android.graphics.Bitmap;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ay;
import com.tencent.mm.sdk.platformtools.br;

final class v
  implements br
{
  private int dUW = 0;
  private q dUX;
  private Bitmap dnb = null;

  public v(q paramq)
  {
    if (!s.c(paramq))
      throw new IllegalArgumentException("from net, picture strategy here must be validity");
    this.dUX = paramq;
  }

  // ERROR //
  public final boolean rD()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   6: ifnonnull +12 -> 18
    //   9: ldc 44
    //   11: ldc 46
    //   13: invokestatic 52	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: iconst_1
    //   17: ireturn
    //   18: new 54	java/io/File
    //   21: dup
    //   22: aload_0
    //   23: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   26: invokeinterface 60 1 0
    //   31: invokespecial 61	java/io/File:<init>	(Ljava/lang/String;)V
    //   34: astore_2
    //   35: new 63	java/io/FileOutputStream
    //   38: dup
    //   39: new 65	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   46: aload_2
    //   47: invokevirtual 69	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   50: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc 75
    //   55: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: invokespecial 79	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   64: astore_3
    //   65: aload_0
    //   66: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   69: invokeinterface 82 1 0
    //   74: sipush 10000
    //   77: sipush 20000
    //   80: invokestatic 88	com/tencent/mm/network/k:g	(Ljava/lang/String;II)Ljava/io/InputStream;
    //   83: astore 13
    //   85: aload 13
    //   87: ifnonnull +51 -> 138
    //   90: iconst_1
    //   91: anewarray 4	java/lang/Object
    //   94: astore 26
    //   96: aload 26
    //   98: iconst_0
    //   99: aload_0
    //   100: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   103: invokeinterface 82 1 0
    //   108: aastore
    //   109: ldc 44
    //   111: ldc 90
    //   113: aload 26
    //   115: invokestatic 94	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: aload 13
    //   120: ifnull +8 -> 128
    //   123: aload 13
    //   125: invokevirtual 99	java/io/InputStream:close	()V
    //   128: aload_3
    //   129: invokevirtual 100	java/io/FileOutputStream:close	()V
    //   132: iconst_1
    //   133: ireturn
    //   134: astore 27
    //   136: iconst_1
    //   137: ireturn
    //   138: sipush 1024
    //   141: newarray byte
    //   143: astore 16
    //   145: aload 13
    //   147: aload 16
    //   149: invokevirtual 104	java/io/InputStream:read	([B)I
    //   152: istore 17
    //   154: iload 17
    //   156: iconst_m1
    //   157: if_icmpeq +86 -> 243
    //   160: aload_0
    //   161: iload 17
    //   163: aload_0
    //   164: getfield 19	com/tencent/mm/platformtools/v:dUW	I
    //   167: iadd
    //   168: putfield 19	com/tencent/mm/platformtools/v:dUW	I
    //   171: aload_3
    //   172: aload 16
    //   174: iconst_0
    //   175: iload 17
    //   177: invokevirtual 108	java/io/FileOutputStream:write	([BII)V
    //   180: goto -35 -> 145
    //   183: astore 15
    //   185: aload 13
    //   187: astore_1
    //   188: aload_3
    //   189: astore 5
    //   191: iconst_1
    //   192: anewarray 4	java/lang/Object
    //   195: astore 10
    //   197: aload 10
    //   199: iconst_0
    //   200: aload_0
    //   201: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   204: invokeinterface 82 1 0
    //   209: aastore
    //   210: ldc 44
    //   212: ldc 110
    //   214: aload 10
    //   216: invokestatic 94	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: aload_1
    //   220: ifnull +7 -> 227
    //   223: aload_1
    //   224: invokevirtual 99	java/io/InputStream:close	()V
    //   227: aload 5
    //   229: ifnull -213 -> 16
    //   232: aload 5
    //   234: invokevirtual 100	java/io/FileOutputStream:close	()V
    //   237: iconst_1
    //   238: ireturn
    //   239: astore 11
    //   241: iconst_1
    //   242: ireturn
    //   243: iconst_2
    //   244: anewarray 4	java/lang/Object
    //   247: astore 18
    //   249: aload 18
    //   251: iconst_0
    //   252: aload_0
    //   253: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   256: invokeinterface 82 1 0
    //   261: aastore
    //   262: aload 18
    //   264: iconst_1
    //   265: aload_0
    //   266: getfield 19	com/tencent/mm/platformtools/v:dUW	I
    //   269: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   272: aastore
    //   273: ldc 44
    //   275: ldc 118
    //   277: aload 18
    //   279: invokestatic 121	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: aload 13
    //   284: ifnull +8 -> 292
    //   287: aload 13
    //   289: invokevirtual 99	java/io/InputStream:close	()V
    //   292: aload_3
    //   293: invokevirtual 100	java/io/FileOutputStream:close	()V
    //   296: new 65	java/lang/StringBuilder
    //   299: dup
    //   300: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   303: aload_2
    //   304: invokevirtual 69	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   307: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: ldc 75
    //   312: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   318: invokestatic 127	com/tencent/mm/platformtools/u:jA	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   321: astore 23
    //   323: aload_0
    //   324: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   327: aload 23
    //   329: getstatic 133	com/tencent/mm/platformtools/r:dUL	Lcom/tencent/mm/platformtools/r;
    //   332: invokeinterface 137 3 0
    //   337: astore 22
    //   339: aload 22
    //   341: aload 23
    //   343: if_acmpeq +16 -> 359
    //   346: aload 23
    //   348: invokevirtual 142	android/graphics/Bitmap:isRecycled	()Z
    //   351: ifne +8 -> 359
    //   354: aload 23
    //   356: invokevirtual 145	android/graphics/Bitmap:recycle	()V
    //   359: getstatic 149	com/tencent/mm/platformtools/u:dUP	Lcom/tencent/mm/platformtools/u;
    //   362: aload_0
    //   363: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   366: aload 22
    //   368: invokestatic 152	com/tencent/mm/platformtools/u:a	(Lcom/tencent/mm/platformtools/u;Lcom/tencent/mm/platformtools/q;Landroid/graphics/Bitmap;)V
    //   371: new 54	java/io/File
    //   374: dup
    //   375: new 65	java/lang/StringBuilder
    //   378: dup
    //   379: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   382: aload_2
    //   383: invokevirtual 69	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   386: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: ldc 75
    //   391: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   397: invokespecial 61	java/io/File:<init>	(Ljava/lang/String;)V
    //   400: invokevirtual 155	java/io/File:delete	()Z
    //   403: pop
    //   404: aload_0
    //   405: aload 22
    //   407: putfield 21	com/tencent/mm/platformtools/v:dnb	Landroid/graphics/Bitmap;
    //   410: iconst_1
    //   411: ireturn
    //   412: astore 7
    //   414: aconst_null
    //   415: astore_3
    //   416: aload_1
    //   417: ifnull +7 -> 424
    //   420: aload_1
    //   421: invokevirtual 99	java/io/InputStream:close	()V
    //   424: aload_3
    //   425: ifnull +7 -> 432
    //   428: aload_3
    //   429: invokevirtual 100	java/io/FileOutputStream:close	()V
    //   432: aload 7
    //   434: athrow
    //   435: astore 20
    //   437: iconst_1
    //   438: anewarray 4	java/lang/Object
    //   441: astore 21
    //   443: aload 21
    //   445: iconst_0
    //   446: aload_0
    //   447: getfield 36	com/tencent/mm/platformtools/v:dUX	Lcom/tencent/mm/platformtools/q;
    //   450: invokeinterface 82 1 0
    //   455: aastore
    //   456: ldc 44
    //   458: ldc 157
    //   460: aload 21
    //   462: invokestatic 94	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   465: aconst_null
    //   466: astore 22
    //   468: goto -64 -> 404
    //   471: astore 28
    //   473: goto -345 -> 128
    //   476: astore 25
    //   478: goto -186 -> 292
    //   481: astore 19
    //   483: goto -187 -> 296
    //   486: astore 12
    //   488: goto -261 -> 227
    //   491: astore 9
    //   493: goto -69 -> 424
    //   496: astore 8
    //   498: goto -66 -> 432
    //   501: astore 7
    //   503: aconst_null
    //   504: astore_1
    //   505: goto -89 -> 416
    //   508: astore 14
    //   510: aload 13
    //   512: astore_1
    //   513: aload 14
    //   515: astore 7
    //   517: goto -101 -> 416
    //   520: astore 6
    //   522: aload 5
    //   524: astore_3
    //   525: aload 6
    //   527: astore 7
    //   529: goto -113 -> 416
    //   532: astore 29
    //   534: aconst_null
    //   535: astore 5
    //   537: aconst_null
    //   538: astore_1
    //   539: goto -348 -> 191
    //   542: astore 4
    //   544: aload_3
    //   545: astore 5
    //   547: aconst_null
    //   548: astore_1
    //   549: goto -358 -> 191
    //
    // Exception table:
    //   from	to	target	type
    //   128	132	134	java/io/IOException
    //   90	118	183	java/lang/Exception
    //   138	145	183	java/lang/Exception
    //   145	154	183	java/lang/Exception
    //   160	180	183	java/lang/Exception
    //   243	282	183	java/lang/Exception
    //   232	237	239	java/io/IOException
    //   18	65	412	finally
    //   296	339	435	java/lang/Exception
    //   346	359	435	java/lang/Exception
    //   359	404	435	java/lang/Exception
    //   123	128	471	java/io/IOException
    //   287	292	476	java/io/IOException
    //   292	296	481	java/io/IOException
    //   223	227	486	java/io/IOException
    //   420	424	491	java/io/IOException
    //   428	432	496	java/io/IOException
    //   65	85	501	finally
    //   90	118	508	finally
    //   138	145	508	finally
    //   145	154	508	finally
    //   160	180	508	finally
    //   243	282	508	finally
    //   191	219	520	finally
    //   18	65	532	java/lang/Exception
    //   65	85	542	java/lang/Exception
  }

  public final boolean rE()
  {
    try
    {
      at.qy().x(this.dUW, 0);
      label13: u.a(u.dUP, this.dUX.Dz(), this.dUX.DA(), this.dnb);
      this.dnb = null;
      return false;
    }
    catch (Exception localException)
    {
      break label13;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.v
 * JD-Core Version:    0.6.2
 */