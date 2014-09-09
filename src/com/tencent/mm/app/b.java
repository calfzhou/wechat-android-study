package com.tencent.mm.app;

import com.tencent.mm.storage.h;
import java.io.File;

public final class b
{
  private static final String cFK = h.dgF + "channel_history.cfg";

  // ERROR //
  public static void g(android.content.Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 40	com/tencent/mm/app/b:hM	()Z
    //   3: ifeq +4 -> 7
    //   6: return
    //   7: aload_0
    //   8: invokestatic 45	com/tencent/mm/sdk/platformtools/l:bv	(Landroid/content/Context;)V
    //   11: aload_0
    //   12: invokevirtual 51	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   15: astore_1
    //   16: aload_1
    //   17: aload_0
    //   18: invokevirtual 54	android/content/Context:getPackageName	()Ljava/lang/String;
    //   21: iconst_0
    //   22: invokevirtual 60	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   25: getfield 66	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   28: getfield 71	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   31: invokestatic 77	com/tencent/mm/b/a:aj	(Ljava/lang/String;)Lcom/tencent/mm/b/a;
    //   34: astore 12
    //   36: aload 12
    //   38: ifnull +47 -> 85
    //   41: aload 12
    //   43: invokevirtual 81	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   46: ifnull +39 -> 85
    //   49: ldc 83
    //   51: ldc 85
    //   53: invokestatic 91	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload 12
    //   58: invokevirtual 81	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   61: invokevirtual 96	com/tencent/mm/b/c:hp	()Z
    //   64: ifeq +21 -> 85
    //   67: aload 12
    //   69: invokevirtual 81	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   72: invokevirtual 100	com/tencent/mm/b/c:ho	()I
    //   75: putstatic 104	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   78: ldc 83
    //   80: ldc 106
    //   82: invokestatic 91	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: new 108	java/io/RandomAccessFile
    //   88: dup
    //   89: getstatic 30	com/tencent/mm/app/b:cFK	Ljava/lang/String;
    //   92: ldc 110
    //   94: invokespecial 112	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: astore 4
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: astore 9
    //   105: aload 9
    //   107: iconst_0
    //   108: getstatic 104	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   111: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   114: aastore
    //   115: aload 4
    //   117: ldc 120
    //   119: aload 9
    //   121: invokestatic 126	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   124: invokevirtual 130	java/lang/String:getBytes	()[B
    //   127: invokevirtual 134	java/io/RandomAccessFile:write	([B)V
    //   130: aload 4
    //   132: invokevirtual 137	java/io/RandomAccessFile:close	()V
    //   135: return
    //   136: astore 10
    //   138: ldc 83
    //   140: aload 10
    //   142: ldc 139
    //   144: iconst_1
    //   145: anewarray 4	java/lang/Object
    //   148: dup
    //   149: iconst_0
    //   150: ldc 141
    //   152: aastore
    //   153: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: return
    //   157: astore 11
    //   159: ldc 83
    //   161: ldc 147
    //   163: invokestatic 150	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   166: goto -81 -> 85
    //   169: astore_2
    //   170: iconst_1
    //   171: anewarray 4	java/lang/Object
    //   174: astore_3
    //   175: aload_3
    //   176: iconst_0
    //   177: aload_2
    //   178: invokevirtual 153	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   181: aastore
    //   182: ldc 83
    //   184: ldc 155
    //   186: aload_3
    //   187: invokestatic 158	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: goto -105 -> 85
    //   193: astore 5
    //   195: aconst_null
    //   196: astore 4
    //   198: ldc 83
    //   200: aload 5
    //   202: ldc 160
    //   204: iconst_1
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: ldc 141
    //   212: aastore
    //   213: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: aload 4
    //   218: ifnull -212 -> 6
    //   221: aload 4
    //   223: invokevirtual 137	java/io/RandomAccessFile:close	()V
    //   226: return
    //   227: astore 8
    //   229: ldc 83
    //   231: aload 8
    //   233: ldc 139
    //   235: iconst_1
    //   236: anewarray 4	java/lang/Object
    //   239: dup
    //   240: iconst_0
    //   241: ldc 141
    //   243: aastore
    //   244: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: return
    //   248: astore 6
    //   250: aconst_null
    //   251: astore 4
    //   253: aload 4
    //   255: ifnull +8 -> 263
    //   258: aload 4
    //   260: invokevirtual 137	java/io/RandomAccessFile:close	()V
    //   263: aload 6
    //   265: athrow
    //   266: astore 7
    //   268: ldc 83
    //   270: aload 7
    //   272: ldc 139
    //   274: iconst_1
    //   275: anewarray 4	java/lang/Object
    //   278: dup
    //   279: iconst_0
    //   280: ldc 141
    //   282: aastore
    //   283: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: goto -23 -> 263
    //   289: astore 6
    //   291: goto -38 -> 253
    //   294: astore 5
    //   296: goto -98 -> 198
    //
    // Exception table:
    //   from	to	target	type
    //   130	135	136	java/lang/Exception
    //   16	36	157	android/content/pm/PackageManager$NameNotFoundException
    //   41	85	157	android/content/pm/PackageManager$NameNotFoundException
    //   16	36	169	java/lang/Exception
    //   41	85	169	java/lang/Exception
    //   85	99	193	java/lang/Exception
    //   221	226	227	java/lang/Exception
    //   85	99	248	finally
    //   258	263	266	java/lang/Exception
    //   99	130	289	finally
    //   198	216	289	finally
    //   99	130	294	java/lang/Exception
  }

  // ERROR //
  public static void hL()
  {
    // Byte code:
    //   0: invokestatic 40	com/tencent/mm/app/b:hM	()Z
    //   3: ifne +11 -> 14
    //   6: ldc 83
    //   8: ldc 163
    //   10: invokestatic 166	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: return
    //   14: new 108	java/io/RandomAccessFile
    //   17: dup
    //   18: getstatic 30	com/tencent/mm/app/b:cFK	Ljava/lang/String;
    //   21: ldc 110
    //   23: invokespecial 112	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: astore_0
    //   27: aload_0
    //   28: invokevirtual 170	java/io/RandomAccessFile:length	()J
    //   31: lstore 5
    //   33: iconst_2
    //   34: anewarray 4	java/lang/Object
    //   37: astore 7
    //   39: aload 7
    //   41: iconst_0
    //   42: lload 5
    //   44: invokestatic 175	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   47: aastore
    //   48: aload 7
    //   50: iconst_1
    //   51: getstatic 104	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   54: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   57: aastore
    //   58: ldc 83
    //   60: ldc 177
    //   62: aload 7
    //   64: invokestatic 179	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: lload 5
    //   69: lconst_0
    //   70: lcmp
    //   71: ifgt +36 -> 107
    //   74: ldc 83
    //   76: ldc 181
    //   78: invokestatic 166	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: aload_0
    //   82: invokevirtual 137	java/io/RandomAccessFile:close	()V
    //   85: return
    //   86: astore 8
    //   88: ldc 83
    //   90: aload 8
    //   92: ldc 139
    //   94: iconst_1
    //   95: anewarray 4	java/lang/Object
    //   98: dup
    //   99: iconst_0
    //   100: ldc 141
    //   102: aastore
    //   103: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: return
    //   107: aload_0
    //   108: invokevirtual 184	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   111: astore 9
    //   113: getstatic 104	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   116: istore 10
    //   118: ldc 141
    //   120: astore 11
    //   122: aload 9
    //   124: invokestatic 190	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   127: ifne +73 -> 200
    //   130: new 10	java/lang/StringBuilder
    //   133: dup
    //   134: invokespecial 13	java/lang/StringBuilder:<init>	()V
    //   137: aload 11
    //   139: invokevirtual 22	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: aload 9
    //   144: invokevirtual 22	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc 192
    //   149: invokevirtual 22	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual 28	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: astore 11
    //   157: aload 9
    //   159: invokestatic 196	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   162: istore 17
    //   164: iload 17
    //   166: getstatic 104	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   169: if_icmpeq +31 -> 200
    //   172: iload 17
    //   174: putstatic 104	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   177: ldc 83
    //   179: new 10	java/lang/StringBuilder
    //   182: dup
    //   183: ldc 198
    //   185: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   188: getstatic 104	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   191: invokevirtual 204	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   194: invokevirtual 28	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokestatic 91	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: getstatic 210	com/tencent/mm/app/MMApplication:cGe	Z
    //   203: ifeq +150 -> 353
    //   206: getstatic 104	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   209: istore 13
    //   211: aload_0
    //   212: invokevirtual 184	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   215: astore 14
    //   217: aload 14
    //   219: invokestatic 190	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   222: ifne +40 -> 262
    //   225: new 10	java/lang/StringBuilder
    //   228: dup
    //   229: invokespecial 13	java/lang/StringBuilder:<init>	()V
    //   232: aload 11
    //   234: invokevirtual 22	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: aload 14
    //   239: invokevirtual 22	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: ldc 192
    //   244: invokevirtual 22	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: invokevirtual 28	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   250: astore 11
    //   252: aload 14
    //   254: invokestatic 196	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   257: istore 13
    //   259: goto -48 -> 211
    //   262: ldc 83
    //   264: ldc 212
    //   266: iconst_1
    //   267: anewarray 4	java/lang/Object
    //   270: dup
    //   271: iconst_0
    //   272: aload 11
    //   274: aastore
    //   275: invokestatic 179	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   278: iload 13
    //   280: iload 10
    //   282: if_icmpeq +71 -> 353
    //   285: aload_0
    //   286: lload 5
    //   288: invokevirtual 216	java/io/RandomAccessFile:seek	(J)V
    //   291: iconst_1
    //   292: anewarray 4	java/lang/Object
    //   295: astore 15
    //   297: aload 15
    //   299: iconst_0
    //   300: iload 10
    //   302: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   305: aastore
    //   306: aload_0
    //   307: ldc 120
    //   309: aload 15
    //   311: invokestatic 126	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   314: invokevirtual 130	java/lang/String:getBytes	()[B
    //   317: invokevirtual 134	java/io/RandomAccessFile:write	([B)V
    //   320: iconst_2
    //   321: anewarray 4	java/lang/Object
    //   324: astore 16
    //   326: aload 16
    //   328: iconst_0
    //   329: iload 13
    //   331: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   334: aastore
    //   335: aload 16
    //   337: iconst_1
    //   338: iload 10
    //   340: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   343: aastore
    //   344: ldc 83
    //   346: ldc 218
    //   348: aload 16
    //   350: invokestatic 179	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: aload_0
    //   354: invokevirtual 137	java/io/RandomAccessFile:close	()V
    //   357: return
    //   358: astore 12
    //   360: ldc 83
    //   362: aload 12
    //   364: ldc 139
    //   366: iconst_1
    //   367: anewarray 4	java/lang/Object
    //   370: dup
    //   371: iconst_0
    //   372: ldc 141
    //   374: aastore
    //   375: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   378: return
    //   379: astore_1
    //   380: aconst_null
    //   381: astore_0
    //   382: ldc 83
    //   384: aload_1
    //   385: ldc 160
    //   387: iconst_1
    //   388: anewarray 4	java/lang/Object
    //   391: dup
    //   392: iconst_0
    //   393: ldc 141
    //   395: aastore
    //   396: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: aload_0
    //   400: ifnull -387 -> 13
    //   403: aload_0
    //   404: invokevirtual 137	java/io/RandomAccessFile:close	()V
    //   407: return
    //   408: astore 4
    //   410: ldc 83
    //   412: aload 4
    //   414: ldc 139
    //   416: iconst_1
    //   417: anewarray 4	java/lang/Object
    //   420: dup
    //   421: iconst_0
    //   422: ldc 141
    //   424: aastore
    //   425: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   428: return
    //   429: astore_2
    //   430: aconst_null
    //   431: astore_0
    //   432: aload_0
    //   433: ifnull +7 -> 440
    //   436: aload_0
    //   437: invokevirtual 137	java/io/RandomAccessFile:close	()V
    //   440: aload_2
    //   441: athrow
    //   442: astore_3
    //   443: ldc 83
    //   445: aload_3
    //   446: ldc 139
    //   448: iconst_1
    //   449: anewarray 4	java/lang/Object
    //   452: dup
    //   453: iconst_0
    //   454: ldc 141
    //   456: aastore
    //   457: invokestatic 145	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   460: goto -20 -> 440
    //   463: astore_2
    //   464: goto -32 -> 432
    //   467: astore_1
    //   468: goto -86 -> 382
    //
    // Exception table:
    //   from	to	target	type
    //   81	85	86	java/lang/Exception
    //   353	357	358	java/lang/Exception
    //   14	27	379	java/lang/Exception
    //   403	407	408	java/lang/Exception
    //   14	27	429	finally
    //   436	440	442	java/lang/Exception
    //   27	67	463	finally
    //   74	81	463	finally
    //   107	118	463	finally
    //   122	200	463	finally
    //   200	211	463	finally
    //   211	259	463	finally
    //   262	278	463	finally
    //   285	353	463	finally
    //   382	399	463	finally
    //   27	67	467	java/lang/Exception
    //   74	81	467	java/lang/Exception
    //   107	118	467	java/lang/Exception
    //   122	200	467	java/lang/Exception
    //   200	211	467	java/lang/Exception
    //   211	259	467	java/lang/Exception
    //   262	278	467	java/lang/Exception
    //   285	353	467	java/lang/Exception
  }

  private static boolean hM()
  {
    return new File(cFK).exists();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.b
 * JD-Core Version:    0.6.2
 */