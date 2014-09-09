package com.tencent.mm.model;

public final class ec
{
  private static int dmD = 536870913;
  private int dmE;

  // ERROR //
  public ec(java.lang.String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 18	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: ldc 19
    //   7: putfield 21	com/tencent/mm/model/ec:dmE	I
    //   10: ldc 23
    //   12: astore_3
    //   13: new 25	java/io/RandomAccessFile
    //   16: dup
    //   17: new 27	java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial 28	java/lang/StringBuilder:<init>	()V
    //   24: aload_1
    //   25: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc 34
    //   30: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: ldc 40
    //   38: invokespecial 43	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: astore 4
    //   43: aload 4
    //   45: invokevirtual 47	java/io/RandomAccessFile:length	()J
    //   48: lstore 14
    //   50: iconst_3
    //   51: anewarray 4	java/lang/Object
    //   54: astore 16
    //   56: aload 16
    //   58: iconst_0
    //   59: lload 14
    //   61: invokestatic 53	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   64: aastore
    //   65: aload 16
    //   67: iconst_1
    //   68: iload_2
    //   69: invokestatic 58	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   72: aastore
    //   73: aload 16
    //   75: iconst_2
    //   76: getstatic 63	com/tencent/mm/protocal/a:hrn	I
    //   79: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: aastore
    //   83: ldc 70
    //   85: ldc 72
    //   87: aload 16
    //   89: invokestatic 78	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: lload 14
    //   94: lconst_0
    //   95: lcmp
    //   96: ifgt +241 -> 337
    //   99: iload_2
    //   100: ifeq +94 -> 194
    //   103: aload_0
    //   104: getstatic 63	com/tencent/mm/protocal/a:hrn	I
    //   107: putfield 21	com/tencent/mm/model/ec:dmE	I
    //   110: iconst_1
    //   111: anewarray 4	java/lang/Object
    //   114: astore 24
    //   116: aload 24
    //   118: iconst_0
    //   119: getstatic 63	com/tencent/mm/protocal/a:hrn	I
    //   122: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   125: aastore
    //   126: aload 4
    //   128: ldc 80
    //   130: aload 24
    //   132: invokestatic 86	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   135: invokevirtual 90	java/lang/String:getBytes	()[B
    //   138: invokevirtual 94	java/io/RandomAccessFile:write	([B)V
    //   141: aload_0
    //   142: getfield 21	com/tencent/mm/model/ec:dmE	I
    //   145: ldc 19
    //   147: if_icmpne +10 -> 157
    //   150: aload_0
    //   151: getstatic 12	com/tencent/mm/model/ec:dmD	I
    //   154: putfield 21	com/tencent/mm/model/ec:dmE	I
    //   157: iconst_2
    //   158: anewarray 4	java/lang/Object
    //   161: astore 20
    //   163: aload 20
    //   165: iconst_0
    //   166: aload_0
    //   167: getfield 21	com/tencent/mm/model/ec:dmE	I
    //   170: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   173: aastore
    //   174: aload 20
    //   176: iconst_1
    //   177: aload_3
    //   178: aastore
    //   179: ldc 70
    //   181: ldc 96
    //   183: aload 20
    //   185: invokestatic 78	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: aload 4
    //   190: invokevirtual 99	java/io/RandomAccessFile:close	()V
    //   193: return
    //   194: aload_0
    //   195: getstatic 12	com/tencent/mm/model/ec:dmD	I
    //   198: putfield 21	com/tencent/mm/model/ec:dmE	I
    //   201: iconst_1
    //   202: anewarray 4	java/lang/Object
    //   205: astore 25
    //   207: aload 25
    //   209: iconst_0
    //   210: getstatic 12	com/tencent/mm/model/ec:dmD	I
    //   213: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   216: aastore
    //   217: aload 4
    //   219: ldc 80
    //   221: aload 25
    //   223: invokestatic 86	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   226: invokevirtual 90	java/lang/String:getBytes	()[B
    //   229: invokevirtual 94	java/io/RandomAccessFile:write	([B)V
    //   232: goto -122 -> 110
    //   235: astore 10
    //   237: aload_3
    //   238: astore 6
    //   240: aload 10
    //   242: astore 11
    //   244: ldc 70
    //   246: aload 11
    //   248: ldc 101
    //   250: iconst_1
    //   251: anewarray 4	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: ldc 23
    //   258: aastore
    //   259: invokestatic 105	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   262: aload_0
    //   263: getfield 21	com/tencent/mm/model/ec:dmE	I
    //   266: ldc 19
    //   268: if_icmpne +10 -> 278
    //   271: aload_0
    //   272: getstatic 12	com/tencent/mm/model/ec:dmD	I
    //   275: putfield 21	com/tencent/mm/model/ec:dmE	I
    //   278: iconst_2
    //   279: anewarray 4	java/lang/Object
    //   282: astore 12
    //   284: aload 12
    //   286: iconst_0
    //   287: aload_0
    //   288: getfield 21	com/tencent/mm/model/ec:dmE	I
    //   291: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   294: aastore
    //   295: aload 12
    //   297: iconst_1
    //   298: aload 6
    //   300: aastore
    //   301: ldc 70
    //   303: ldc 96
    //   305: aload 12
    //   307: invokestatic 78	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   310: aload 4
    //   312: invokevirtual 99	java/io/RandomAccessFile:close	()V
    //   315: return
    //   316: astore 13
    //   318: ldc 70
    //   320: aload 13
    //   322: ldc 107
    //   324: iconst_1
    //   325: anewarray 4	java/lang/Object
    //   328: dup
    //   329: iconst_0
    //   330: ldc 23
    //   332: aastore
    //   333: invokestatic 105	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   336: return
    //   337: iconst_0
    //   338: istore 17
    //   340: aload 4
    //   342: invokevirtual 110	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   345: astore 18
    //   347: aload 18
    //   349: invokestatic 116	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   352: ifne +67 -> 419
    //   355: new 27	java/lang/StringBuilder
    //   358: dup
    //   359: invokespecial 28	java/lang/StringBuilder:<init>	()V
    //   362: aload_3
    //   363: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: aload 18
    //   368: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   371: ldc 118
    //   373: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   379: astore 22
    //   381: aload 22
    //   383: astore 6
    //   385: aload 18
    //   387: bipush 16
    //   389: invokestatic 122	java/lang/Integer:parseInt	(Ljava/lang/String;I)I
    //   392: istore 23
    //   394: aload_0
    //   395: getfield 21	com/tencent/mm/model/ec:dmE	I
    //   398: iload 23
    //   400: if_icmple +225 -> 625
    //   403: aload_0
    //   404: iload 23
    //   406: putfield 21	com/tencent/mm/model/ec:dmE	I
    //   409: aload 6
    //   411: astore_3
    //   412: iload 23
    //   414: istore 17
    //   416: goto -76 -> 340
    //   419: iload 17
    //   421: getstatic 63	com/tencent/mm/protocal/a:hrn	I
    //   424: if_icmpeq -283 -> 141
    //   427: aload 4
    //   429: lload 14
    //   431: invokevirtual 126	java/io/RandomAccessFile:seek	(J)V
    //   434: iconst_1
    //   435: anewarray 4	java/lang/Object
    //   438: astore 19
    //   440: aload 19
    //   442: iconst_0
    //   443: getstatic 63	com/tencent/mm/protocal/a:hrn	I
    //   446: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   449: aastore
    //   450: aload 4
    //   452: ldc 80
    //   454: aload 19
    //   456: invokestatic 86	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   459: invokevirtual 90	java/lang/String:getBytes	()[B
    //   462: invokevirtual 94	java/io/RandomAccessFile:write	([B)V
    //   465: goto -324 -> 141
    //   468: astore 5
    //   470: aload_3
    //   471: astore 6
    //   473: aload 5
    //   475: astore 7
    //   477: aload_0
    //   478: getfield 21	com/tencent/mm/model/ec:dmE	I
    //   481: ldc 19
    //   483: if_icmpne +10 -> 493
    //   486: aload_0
    //   487: getstatic 12	com/tencent/mm/model/ec:dmD	I
    //   490: putfield 21	com/tencent/mm/model/ec:dmE	I
    //   493: iconst_2
    //   494: anewarray 4	java/lang/Object
    //   497: astore 8
    //   499: aload 8
    //   501: iconst_0
    //   502: aload_0
    //   503: getfield 21	com/tencent/mm/model/ec:dmE	I
    //   506: invokestatic 68	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   509: aastore
    //   510: aload 8
    //   512: iconst_1
    //   513: aload 6
    //   515: aastore
    //   516: ldc 70
    //   518: ldc 96
    //   520: aload 8
    //   522: invokestatic 78	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   525: aload 4
    //   527: invokevirtual 99	java/io/RandomAccessFile:close	()V
    //   530: aload 7
    //   532: athrow
    //   533: astore 21
    //   535: ldc 70
    //   537: aload 21
    //   539: ldc 107
    //   541: iconst_1
    //   542: anewarray 4	java/lang/Object
    //   545: dup
    //   546: iconst_0
    //   547: ldc 23
    //   549: aastore
    //   550: invokestatic 105	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   553: return
    //   554: astore 9
    //   556: ldc 70
    //   558: aload 9
    //   560: ldc 107
    //   562: iconst_1
    //   563: anewarray 4	java/lang/Object
    //   566: dup
    //   567: iconst_0
    //   568: ldc 23
    //   570: aastore
    //   571: invokestatic 105	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   574: goto -44 -> 530
    //   577: astore 28
    //   579: aload_3
    //   580: astore 29
    //   582: aload 28
    //   584: astore 7
    //   586: aload 29
    //   588: astore 6
    //   590: aconst_null
    //   591: astore 4
    //   593: goto -116 -> 477
    //   596: astore 7
    //   598: goto -121 -> 477
    //   601: astore 26
    //   603: aload_3
    //   604: astore 27
    //   606: aload 26
    //   608: astore 11
    //   610: aload 27
    //   612: astore 6
    //   614: aconst_null
    //   615: astore 4
    //   617: goto -373 -> 244
    //   620: astore 11
    //   622: goto -378 -> 244
    //   625: aload 6
    //   627: astore_3
    //   628: iload 23
    //   630: istore 17
    //   632: goto -292 -> 340
    //
    // Exception table:
    //   from	to	target	type
    //   43	92	235	java/lang/Exception
    //   103	110	235	java/lang/Exception
    //   110	141	235	java/lang/Exception
    //   194	232	235	java/lang/Exception
    //   340	381	235	java/lang/Exception
    //   419	465	235	java/lang/Exception
    //   310	315	316	java/lang/Exception
    //   43	92	468	finally
    //   103	110	468	finally
    //   110	141	468	finally
    //   194	232	468	finally
    //   340	381	468	finally
    //   419	465	468	finally
    //   188	193	533	java/lang/Exception
    //   525	530	554	java/lang/Exception
    //   13	43	577	finally
    //   244	262	596	finally
    //   385	409	596	finally
    //   13	43	601	java/lang/Exception
    //   385	409	620	java/lang/Exception
  }

  public static int a(ec paramec)
  {
    if (paramec != null)
      return paramec.dmE;
    return dmD;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ec
 * JD-Core Version:    0.6.2
 */