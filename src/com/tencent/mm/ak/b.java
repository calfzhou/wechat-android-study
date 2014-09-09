package com.tencent.mm.ak;

import android.os.AsyncTask;

final class b extends AsyncTask
{
  int ret = 0;

  b(a parama)
  {
  }

  // ERROR //
  private java.lang.String AI()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: iconst_0
    //   4: putfield 17	com/tencent/mm/ak/b:ret	I
    //   7: invokestatic 27	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   10: invokestatic 33	com/tencent/mm/sdk/platformtools/bc:bE	(Landroid/content/Context;)Z
    //   13: istore_2
    //   14: aload_0
    //   15: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   18: getfield 39	com/tencent/mm/ak/a:context	Landroid/content/Context;
    //   21: aload_0
    //   22: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   25: getfield 43	com/tencent/mm/ak/a:intent	Landroid/content/Intent;
    //   28: invokestatic 49	com/tencent/mm/compatible/h/a:a	(Landroid/content/Context;Landroid/content/Intent;)Lcom/tencent/mm/compatible/h/b;
    //   31: astore 11
    //   33: aload 11
    //   35: astore 4
    //   37: aload 4
    //   39: ifnonnull +25 -> 64
    //   42: ldc 51
    //   44: ldc 53
    //   46: invokestatic 59	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   49: aload_0
    //   50: ldc 60
    //   52: putfield 17	com/tencent/mm/ak/b:ret	I
    //   55: aconst_null
    //   56: areturn
    //   57: astore_3
    //   58: aconst_null
    //   59: astore 4
    //   61: goto -24 -> 37
    //   64: aload_0
    //   65: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   68: aload 4
    //   70: getfield 66	com/tencent/mm/compatible/h/b:filename	Ljava/lang/String;
    //   73: putfield 69	com/tencent/mm/ak/a:dFB	Ljava/lang/String;
    //   76: aload_0
    //   77: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   80: getfield 69	com/tencent/mm/ak/a:dFB	Ljava/lang/String;
    //   83: invokestatic 75	com/tencent/mm/a/c:ab	(Ljava/lang/String;)I
    //   86: istore 5
    //   88: iconst_4
    //   89: anewarray 77	java/lang/Object
    //   92: astore 6
    //   94: aload 6
    //   96: iconst_0
    //   97: iload_2
    //   98: invokestatic 83	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   101: aastore
    //   102: aload 6
    //   104: iconst_1
    //   105: iload 5
    //   107: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   110: aastore
    //   111: aload 6
    //   113: iconst_2
    //   114: aload 4
    //   116: getfield 91	com/tencent/mm/compatible/h/b:duration	I
    //   119: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   122: aastore
    //   123: aload 6
    //   125: iconst_3
    //   126: aload_0
    //   127: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   130: getfield 69	com/tencent/mm/ak/a:dFB	Ljava/lang/String;
    //   133: aastore
    //   134: ldc 51
    //   136: ldc 93
    //   138: aload 6
    //   140: invokestatic 97	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: iload 5
    //   145: ifgt +11 -> 156
    //   148: aload_0
    //   149: ldc 98
    //   151: putfield 17	com/tencent/mm/ak/b:ret	I
    //   154: aconst_null
    //   155: areturn
    //   156: iload_2
    //   157: ifeq +22 -> 179
    //   160: ldc 99
    //   162: istore 7
    //   164: iload 5
    //   166: iload 7
    //   168: if_icmple +18 -> 186
    //   171: aload_0
    //   172: ldc 100
    //   174: putfield 17	com/tencent/mm/ak/b:ret	I
    //   177: aconst_null
    //   178: areturn
    //   179: ldc 101
    //   181: istore 7
    //   183: goto -19 -> 164
    //   186: aload_0
    //   187: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   190: getfield 69	com/tencent/mm/ak/a:dFB	Ljava/lang/String;
    //   193: aload_0
    //   194: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   197: getfield 104	com/tencent/mm/ak/a:dFC	Ljava/lang/String;
    //   200: iconst_0
    //   201: invokestatic 110	com/tencent/mm/sdk/platformtools/p:f	(Ljava/lang/String;Ljava/lang/String;Z)Z
    //   204: pop
    //   205: aload_0
    //   206: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   209: aload 4
    //   211: getfield 91	com/tencent/mm/compatible/h/b:duration	I
    //   214: sipush 1000
    //   217: idiv
    //   218: putfield 111	com/tencent/mm/ak/a:duration	I
    //   221: aload 4
    //   223: getfield 115	com/tencent/mm/compatible/h/b:bitmap	Landroid/graphics/Bitmap;
    //   226: ifnull +89 -> 315
    //   229: aload 4
    //   231: getfield 115	com/tencent/mm/compatible/h/b:bitmap	Landroid/graphics/Bitmap;
    //   234: bipush 60
    //   236: getstatic 121	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   239: aload_0
    //   240: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   243: getfield 124	com/tencent/mm/ak/a:cEF	Ljava/lang/String;
    //   246: iconst_1
    //   247: invokestatic 129	com/tencent/mm/sdk/platformtools/i:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   250: iload_1
    //   251: ifeq +22 -> 273
    //   254: invokestatic 133	com/tencent/mm/sdk/platformtools/i:aGD	()Landroid/graphics/Bitmap;
    //   257: bipush 60
    //   259: getstatic 121	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   262: aload_0
    //   263: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   266: getfield 124	com/tencent/mm/ak/a:cEF	Ljava/lang/String;
    //   269: iconst_1
    //   270: invokestatic 129	com/tencent/mm/sdk/platformtools/i:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   273: aload_0
    //   274: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   277: getfield 104	com/tencent/mm/ak/a:dFC	Ljava/lang/String;
    //   280: invokestatic 137	com/tencent/mm/a/c:ac	(Ljava/lang/String;)Z
    //   283: ifne +9 -> 292
    //   286: aload_0
    //   287: ldc 138
    //   289: putfield 17	com/tencent/mm/ak/b:ret	I
    //   292: aload_0
    //   293: getfield 12	com/tencent/mm/ak/b:dFE	Lcom/tencent/mm/ak/a;
    //   296: getfield 124	com/tencent/mm/ak/a:cEF	Ljava/lang/String;
    //   299: invokestatic 137	com/tencent/mm/a/c:ac	(Ljava/lang/String;)Z
    //   302: ifne -247 -> 55
    //   305: aload_0
    //   306: ldc 139
    //   308: putfield 17	com/tencent/mm/ak/b:ret	I
    //   311: aconst_null
    //   312: areturn
    //   313: astore 10
    //   315: iconst_1
    //   316: istore_1
    //   317: goto -67 -> 250
    //   320: astore 9
    //   322: goto -49 -> 273
    //
    // Exception table:
    //   from	to	target	type
    //   14	33	57	java/lang/Exception
    //   229	250	313	java/lang/Exception
    //   254	273	320	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.b
 * JD-Core Version:    0.6.2
 */