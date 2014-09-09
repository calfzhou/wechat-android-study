package com.tencent.mm.n;

import com.tencent.mm.model.at;
import com.tencent.mm.model.ay;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Set;

final class i
  implements br
{
  public x dmZ = null;
  public byte[] dna = null;

  public i(e parame, x paramx)
  {
    this.dmZ = paramx;
  }

  // ERROR //
  public final boolean rD()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	com/tencent/mm/n/i:dmZ	Lcom/tencent/mm/n/x;
    //   4: ifnonnull +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: getfield 21	com/tencent/mm/n/i:dmZ	Lcom/tencent/mm/n/x;
    //   13: invokevirtual 33	com/tencent/mm/n/x:su	()Ljava/lang/String;
    //   16: astore_1
    //   17: ldc 35
    //   19: astore_2
    //   20: invokestatic 40	com/tencent/mm/model/bg:oE	()Z
    //   23: ifeq +66 -> 89
    //   26: iconst_4
    //   27: anewarray 4	java/lang/Object
    //   30: astore 20
    //   32: aload 20
    //   34: iconst_0
    //   35: getstatic 46	com/tencent/mm/protocal/a:hrn	I
    //   38: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   41: aastore
    //   42: aload 20
    //   44: iconst_1
    //   45: invokestatic 56	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   48: invokevirtual 62	com/tencent/mm/model/b:oD	()I
    //   51: invokestatic 68	com/tencent/mm/a/k:getString	(I)Ljava/lang/String;
    //   54: aastore
    //   55: aload 20
    //   57: iconst_2
    //   58: invokestatic 74	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   61: invokestatic 80	com/tencent/mm/sdk/platformtools/bc:bX	(Landroid/content/Context;)I
    //   64: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   67: aastore
    //   68: aload 20
    //   70: iconst_3
    //   71: invokestatic 74	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   74: invokestatic 83	com/tencent/mm/sdk/platformtools/bc:bY	(Landroid/content/Context;)I
    //   77: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aastore
    //   81: ldc 85
    //   83: aload 20
    //   85: invokestatic 91	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   88: astore_2
    //   89: iconst_2
    //   90: anewarray 4	java/lang/Object
    //   93: astore_3
    //   94: aload_3
    //   95: iconst_0
    //   96: aload_0
    //   97: getfield 21	com/tencent/mm/n/i:dmZ	Lcom/tencent/mm/n/x;
    //   100: invokevirtual 94	com/tencent/mm/n/x:getUsername	()Ljava/lang/String;
    //   103: aastore
    //   104: aload_3
    //   105: iconst_1
    //   106: aload_2
    //   107: aastore
    //   108: ldc 96
    //   110: ldc 98
    //   112: aload_3
    //   113: invokestatic 104	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aload_0
    //   117: aconst_null
    //   118: putfield 23	com/tencent/mm/n/i:dna	[B
    //   121: new 106	java/io/ByteArrayOutputStream
    //   124: dup
    //   125: invokespecial 107	java/io/ByteArrayOutputStream:<init>	()V
    //   128: astore 4
    //   130: aload_1
    //   131: invokestatic 113	com/tencent/mm/network/k:jr	(Ljava/lang/String;)Lcom/tencent/mm/network/be;
    //   134: astore 12
    //   136: aload 12
    //   138: astore 7
    //   140: aload 7
    //   142: ldc 115
    //   144: invokevirtual 121	com/tencent/mm/network/be:setRequestMethod	(Ljava/lang/String;)V
    //   147: aload 7
    //   149: ldc 123
    //   151: aload_2
    //   152: invokevirtual 127	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: aload 7
    //   157: sipush 5000
    //   160: invokevirtual 131	com/tencent/mm/network/be:setConnectTimeout	(I)V
    //   163: aload 7
    //   165: sipush 5000
    //   168: invokevirtual 134	com/tencent/mm/network/be:setReadTimeout	(I)V
    //   171: aload 7
    //   173: invokestatic 138	com/tencent/mm/network/k:a	(Lcom/tencent/mm/network/be;)I
    //   176: ifeq +20 -> 196
    //   179: ldc 96
    //   181: ldc 140
    //   183: iconst_1
    //   184: anewarray 4	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: aload_1
    //   190: aastore
    //   191: invokestatic 143	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: iconst_1
    //   195: ireturn
    //   196: aload 7
    //   198: invokevirtual 147	com/tencent/mm/network/be:getInputStream	()Ljava/io/InputStream;
    //   201: astore 14
    //   203: aload 14
    //   205: astore 6
    //   207: aload 6
    //   209: ifnonnull +20 -> 229
    //   212: ldc 96
    //   214: ldc 149
    //   216: iconst_1
    //   217: anewarray 4	java/lang/Object
    //   220: dup
    //   221: iconst_0
    //   222: aload_1
    //   223: aastore
    //   224: invokestatic 104	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: iconst_1
    //   228: ireturn
    //   229: sipush 1024
    //   232: newarray byte
    //   234: astore 16
    //   236: aload 6
    //   238: aload 16
    //   240: invokevirtual 155	java/io/InputStream:read	([B)I
    //   243: istore 17
    //   245: iload 17
    //   247: iconst_m1
    //   248: if_icmpeq +85 -> 333
    //   251: aload 4
    //   253: aload 16
    //   255: iconst_0
    //   256: iload 17
    //   258: invokevirtual 159	java/io/ByteArrayOutputStream:write	([BII)V
    //   261: goto -25 -> 236
    //   264: astore 15
    //   266: iconst_1
    //   267: anewarray 4	java/lang/Object
    //   270: astore 8
    //   272: aload 8
    //   274: iconst_0
    //   275: aload_0
    //   276: getfield 21	com/tencent/mm/n/i:dmZ	Lcom/tencent/mm/n/x;
    //   279: invokevirtual 33	com/tencent/mm/n/x:su	()Ljava/lang/String;
    //   282: aastore
    //   283: ldc 96
    //   285: ldc 161
    //   287: aload 8
    //   289: invokestatic 143	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   292: aload_0
    //   293: aconst_null
    //   294: putfield 23	com/tencent/mm/n/i:dna	[B
    //   297: aload 6
    //   299: astore 9
    //   301: aload 7
    //   303: ifnull +8 -> 311
    //   306: aload 7
    //   308: invokevirtual 164	com/tencent/mm/network/be:disconnect	()V
    //   311: aload 9
    //   313: ifnull +8 -> 321
    //   316: aload 9
    //   318: invokevirtual 167	java/io/InputStream:close	()V
    //   321: aload 4
    //   323: ifnull +8 -> 331
    //   326: aload 4
    //   328: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   331: iconst_1
    //   332: ireturn
    //   333: aload_0
    //   334: aload 4
    //   336: invokevirtual 172	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   339: putfield 23	com/tencent/mm/n/i:dna	[B
    //   342: aload 4
    //   344: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   347: aload 7
    //   349: invokevirtual 164	com/tencent/mm/network/be:disconnect	()V
    //   352: aload 6
    //   354: invokevirtual 167	java/io/InputStream:close	()V
    //   357: aconst_null
    //   358: astore 9
    //   360: aconst_null
    //   361: astore 4
    //   363: aconst_null
    //   364: astore 7
    //   366: goto -65 -> 301
    //   369: astore 10
    //   371: iconst_1
    //   372: anewarray 4	java/lang/Object
    //   375: astore 11
    //   377: aload 11
    //   379: iconst_0
    //   380: aload 10
    //   382: invokevirtual 175	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   385: aastore
    //   386: ldc 96
    //   388: ldc 177
    //   390: aload 11
    //   392: invokestatic 143	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   395: goto -64 -> 331
    //   398: astore 5
    //   400: aconst_null
    //   401: astore 6
    //   403: aconst_null
    //   404: astore 7
    //   406: goto -140 -> 266
    //   409: astore 13
    //   411: aconst_null
    //   412: astore 6
    //   414: goto -148 -> 266
    //   417: astore 18
    //   419: aconst_null
    //   420: astore 4
    //   422: goto -156 -> 266
    //   425: astore 19
    //   427: aconst_null
    //   428: astore 4
    //   430: aconst_null
    //   431: astore 7
    //   433: goto -167 -> 266
    //
    // Exception table:
    //   from	to	target	type
    //   212	227	264	java/lang/Exception
    //   229	236	264	java/lang/Exception
    //   236	245	264	java/lang/Exception
    //   251	261	264	java/lang/Exception
    //   333	347	264	java/lang/Exception
    //   306	311	369	java/lang/Exception
    //   316	321	369	java/lang/Exception
    //   326	331	369	java/lang/Exception
    //   130	136	398	java/lang/Exception
    //   140	194	409	java/lang/Exception
    //   196	203	409	java/lang/Exception
    //   347	352	417	java/lang/Exception
    //   352	357	425	java/lang/Exception
  }

  public final boolean rE()
  {
    if ((this.dmZ == null) || (ch.jb(this.dmZ.getUsername())))
      return false;
    if (ch.B(this.dna))
    {
      e.e(this.dmW).remove(this.dmZ.getUsername());
      return false;
    }
    if (at.qy() != null)
      at.qy().x(this.dna.length, 0);
    e.a(this.dmW, new l(this.dmW, this.dmZ, this.dna));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.i
 * JD-Core Version:    0.6.2
 */