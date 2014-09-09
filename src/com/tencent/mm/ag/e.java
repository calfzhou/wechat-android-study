package com.tencent.mm.ag;

import com.tencent.mm.sdk.platformtools.br;
import java.io.File;

final class e
  implements br
{
  private boolean dBm = false;
  private d dBn;
  private String ddt;
  private String imageUrl;
  private String username;

  public e(c paramc, String paramString1, String paramString2, d paramd)
  {
    this.username = paramString1;
    this.imageUrl = paramString2;
    this.dBn = paramd;
  }

  // ERROR //
  public final boolean rD()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 27	com/tencent/mm/ag/e:username	Ljava/lang/String;
    //   6: invokestatic 41	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   9: ifeq +5 -> 14
    //   12: iconst_0
    //   13: ireturn
    //   14: aload_0
    //   15: aload_0
    //   16: getfield 20	com/tencent/mm/ag/e:dBo	Lcom/tencent/mm/ag/c;
    //   19: aload_0
    //   20: getfield 27	com/tencent/mm/ag/e:username	Ljava/lang/String;
    //   23: invokevirtual 47	com/tencent/mm/ag/c:hk	(Ljava/lang/String;)Ljava/lang/String;
    //   26: putfield 49	com/tencent/mm/ag/e:ddt	Ljava/lang/String;
    //   29: ldc 51
    //   31: astore_2
    //   32: invokestatic 56	com/tencent/mm/model/bg:oE	()Z
    //   35: ifeq +66 -> 101
    //   38: iconst_4
    //   39: anewarray 4	java/lang/Object
    //   42: astore 35
    //   44: aload 35
    //   46: iconst_0
    //   47: getstatic 62	com/tencent/mm/protocal/a:hrn	I
    //   50: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: aastore
    //   54: aload 35
    //   56: iconst_1
    //   57: invokestatic 72	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   60: invokevirtual 78	com/tencent/mm/model/b:oD	()I
    //   63: invokestatic 84	com/tencent/mm/a/k:getString	(I)Ljava/lang/String;
    //   66: aastore
    //   67: aload 35
    //   69: iconst_2
    //   70: invokestatic 90	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   73: invokestatic 96	com/tencent/mm/sdk/platformtools/bc:bX	(Landroid/content/Context;)I
    //   76: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   79: aastore
    //   80: aload 35
    //   82: iconst_3
    //   83: invokestatic 90	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   86: invokestatic 99	com/tencent/mm/sdk/platformtools/bc:bY	(Landroid/content/Context;)I
    //   89: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   92: aastore
    //   93: ldc 101
    //   95: aload 35
    //   97: invokestatic 107	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   100: astore_2
    //   101: iconst_3
    //   102: anewarray 4	java/lang/Object
    //   105: astore_3
    //   106: aload_3
    //   107: iconst_0
    //   108: aload_0
    //   109: getfield 27	com/tencent/mm/ag/e:username	Ljava/lang/String;
    //   112: aastore
    //   113: aload_3
    //   114: iconst_1
    //   115: aload_2
    //   116: aastore
    //   117: aload_3
    //   118: iconst_2
    //   119: aload_0
    //   120: getfield 29	com/tencent/mm/ag/e:imageUrl	Ljava/lang/String;
    //   123: aastore
    //   124: ldc 109
    //   126: ldc 111
    //   128: aload_3
    //   129: invokestatic 117	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: aload_0
    //   133: iconst_0
    //   134: putfield 25	com/tencent/mm/ag/e:dBm	Z
    //   137: aload_0
    //   138: getfield 29	com/tencent/mm/ag/e:imageUrl	Ljava/lang/String;
    //   141: invokestatic 123	com/tencent/mm/network/k:jr	(Ljava/lang/String;)Lcom/tencent/mm/network/be;
    //   144: astore 18
    //   146: aload 18
    //   148: astore 9
    //   150: aload 9
    //   152: ldc 125
    //   154: invokevirtual 131	com/tencent/mm/network/be:setRequestMethod	(Ljava/lang/String;)V
    //   157: aload 9
    //   159: ldc 133
    //   161: aload_2
    //   162: invokevirtual 137	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   165: aload 9
    //   167: sipush 5000
    //   170: invokevirtual 141	com/tencent/mm/network/be:setConnectTimeout	(I)V
    //   173: aload 9
    //   175: sipush 5000
    //   178: invokevirtual 144	com/tencent/mm/network/be:setReadTimeout	(I)V
    //   181: aload 9
    //   183: invokestatic 148	com/tencent/mm/network/k:a	(Lcom/tencent/mm/network/be;)I
    //   186: ifeq +38 -> 224
    //   189: iconst_1
    //   190: anewarray 4	java/lang/Object
    //   193: astore 33
    //   195: aload 33
    //   197: iconst_0
    //   198: aload_0
    //   199: getfield 29	com/tencent/mm/ag/e:imageUrl	Ljava/lang/String;
    //   202: aastore
    //   203: ldc 109
    //   205: ldc 150
    //   207: aload 33
    //   209: invokestatic 153	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: aload 9
    //   214: ifnull +8 -> 222
    //   217: aload 9
    //   219: invokevirtual 156	com/tencent/mm/network/be:disconnect	()V
    //   222: iconst_1
    //   223: ireturn
    //   224: aload 9
    //   226: invokevirtual 160	com/tencent/mm/network/be:getInputStream	()Ljava/io/InputStream;
    //   229: astore 20
    //   231: aload 20
    //   233: astore 5
    //   235: aload 5
    //   237: ifnonnull +48 -> 285
    //   240: iconst_1
    //   241: anewarray 4	java/lang/Object
    //   244: astore 30
    //   246: aload 30
    //   248: iconst_0
    //   249: aload_0
    //   250: getfield 29	com/tencent/mm/ag/e:imageUrl	Ljava/lang/String;
    //   253: aastore
    //   254: ldc 109
    //   256: ldc 162
    //   258: aload 30
    //   260: invokestatic 117	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: aload 9
    //   265: ifnull +8 -> 273
    //   268: aload 9
    //   270: invokevirtual 156	com/tencent/mm/network/be:disconnect	()V
    //   273: aload 5
    //   275: ifnull +8 -> 283
    //   278: aload 5
    //   280: invokevirtual 167	java/io/InputStream:close	()V
    //   283: iconst_1
    //   284: ireturn
    //   285: sipush 1024
    //   288: newarray byte
    //   290: astore 23
    //   292: new 169	java/io/FileOutputStream
    //   295: dup
    //   296: new 171	java/lang/StringBuilder
    //   299: dup
    //   300: invokespecial 172	java/lang/StringBuilder:<init>	()V
    //   303: aload_0
    //   304: getfield 49	com/tencent/mm/ag/e:ddt	Ljava/lang/String;
    //   307: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: ldc 178
    //   312: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   318: invokespecial 184	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   321: astore 10
    //   323: aload 5
    //   325: aload 23
    //   327: invokevirtual 188	java/io/InputStream:read	([B)I
    //   330: istore 26
    //   332: iload 26
    //   334: iconst_m1
    //   335: if_icmpeq +63 -> 398
    //   338: aload 10
    //   340: aload 23
    //   342: iconst_0
    //   343: iload 26
    //   345: invokevirtual 194	java/io/OutputStream:write	([BII)V
    //   348: goto -25 -> 323
    //   351: astore 25
    //   353: aload 10
    //   355: astore 7
    //   357: aload 9
    //   359: astore 6
    //   361: aload_0
    //   362: iconst_0
    //   363: putfield 25	com/tencent/mm/ag/e:dBm	Z
    //   366: aload 6
    //   368: ifnull +8 -> 376
    //   371: aload 6
    //   373: invokevirtual 156	com/tencent/mm/network/be:disconnect	()V
    //   376: aload 5
    //   378: ifnull +8 -> 386
    //   381: aload 5
    //   383: invokevirtual 167	java/io/InputStream:close	()V
    //   386: aload 7
    //   388: ifnull +8 -> 396
    //   391: aload 7
    //   393: invokevirtual 195	java/io/OutputStream:close	()V
    //   396: iconst_1
    //   397: ireturn
    //   398: aload_0
    //   399: iconst_1
    //   400: putfield 25	com/tencent/mm/ag/e:dBm	Z
    //   403: aload 9
    //   405: ifnull +8 -> 413
    //   408: aload 9
    //   410: invokevirtual 156	com/tencent/mm/network/be:disconnect	()V
    //   413: aload 5
    //   415: ifnull +8 -> 423
    //   418: aload 5
    //   420: invokevirtual 167	java/io/InputStream:close	()V
    //   423: aload 10
    //   425: invokevirtual 195	java/io/OutputStream:close	()V
    //   428: goto -32 -> 396
    //   431: astore 27
    //   433: goto -37 -> 396
    //   436: astore 11
    //   438: aconst_null
    //   439: astore 10
    //   441: aconst_null
    //   442: astore 9
    //   444: aload 9
    //   446: ifnull +8 -> 454
    //   449: aload 9
    //   451: invokevirtual 156	com/tencent/mm/network/be:disconnect	()V
    //   454: aload_1
    //   455: ifnull +7 -> 462
    //   458: aload_1
    //   459: invokevirtual 167	java/io/InputStream:close	()V
    //   462: aload 10
    //   464: ifnull +8 -> 472
    //   467: aload 10
    //   469: invokevirtual 195	java/io/OutputStream:close	()V
    //   472: aload 11
    //   474: athrow
    //   475: astore 34
    //   477: goto -255 -> 222
    //   480: astore 32
    //   482: goto -209 -> 273
    //   485: astore 31
    //   487: goto -204 -> 283
    //   490: astore 29
    //   492: goto -79 -> 413
    //   495: astore 28
    //   497: goto -74 -> 423
    //   500: astore 17
    //   502: goto -126 -> 376
    //   505: astore 16
    //   507: goto -121 -> 386
    //   510: astore 15
    //   512: goto -116 -> 396
    //   515: astore 14
    //   517: goto -63 -> 454
    //   520: astore 13
    //   522: goto -60 -> 462
    //   525: astore 12
    //   527: goto -55 -> 472
    //   530: astore 11
    //   532: aconst_null
    //   533: astore 10
    //   535: aconst_null
    //   536: astore_1
    //   537: goto -93 -> 444
    //   540: astore 22
    //   542: aload 5
    //   544: astore_1
    //   545: aload 22
    //   547: astore 11
    //   549: aconst_null
    //   550: astore 10
    //   552: goto -108 -> 444
    //   555: astore 24
    //   557: aload 5
    //   559: astore_1
    //   560: aload 24
    //   562: astore 11
    //   564: goto -120 -> 444
    //   567: astore 8
    //   569: aload 6
    //   571: astore 9
    //   573: aload 7
    //   575: astore 10
    //   577: aload 5
    //   579: astore_1
    //   580: aload 8
    //   582: astore 11
    //   584: goto -140 -> 444
    //   587: astore 4
    //   589: aconst_null
    //   590: astore 5
    //   592: aconst_null
    //   593: astore 6
    //   595: aconst_null
    //   596: astore 7
    //   598: goto -237 -> 361
    //   601: astore 19
    //   603: aload 9
    //   605: astore 6
    //   607: aconst_null
    //   608: astore 5
    //   610: aconst_null
    //   611: astore 7
    //   613: goto -252 -> 361
    //   616: astore 21
    //   618: aload 9
    //   620: astore 6
    //   622: aconst_null
    //   623: astore 7
    //   625: goto -264 -> 361
    //
    // Exception table:
    //   from	to	target	type
    //   323	332	351	java/lang/Exception
    //   338	348	351	java/lang/Exception
    //   398	403	351	java/lang/Exception
    //   423	428	431	java/lang/Exception
    //   137	146	436	finally
    //   217	222	475	java/lang/Exception
    //   268	273	480	java/lang/Exception
    //   278	283	485	java/lang/Exception
    //   408	413	490	java/lang/Exception
    //   418	423	495	java/lang/Exception
    //   371	376	500	java/lang/Exception
    //   381	386	505	java/lang/Exception
    //   391	396	510	java/lang/Exception
    //   449	454	515	java/lang/Exception
    //   458	462	520	java/lang/Exception
    //   467	472	525	java/lang/Exception
    //   150	212	530	finally
    //   224	231	530	finally
    //   240	263	540	finally
    //   285	323	540	finally
    //   323	332	555	finally
    //   338	348	555	finally
    //   398	403	555	finally
    //   361	366	567	finally
    //   137	146	587	java/lang/Exception
    //   150	212	601	java/lang/Exception
    //   224	231	601	java/lang/Exception
    //   240	263	616	java/lang/Exception
    //   285	323	616	java/lang/Exception
  }

  public final boolean rE()
  {
    if (!this.dBm)
    {
      d locald2 = this.dBn;
      locald2.ab(false);
      return false;
    }
    com.tencent.mm.a.c.deleteFile(this.ddt);
    new File(this.ddt + ".tmp").renameTo(new File(this.ddt));
    d locald1 = this.dBn;
    locald1.ab(true);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ag.e
 * JD-Core Version:    0.6.2
 */