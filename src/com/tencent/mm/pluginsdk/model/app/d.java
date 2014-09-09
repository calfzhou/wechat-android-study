package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.be;
import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.z;

public final class d
{
  private boolean dZU = false;
  private bp dvm = new bp(1, "appdownimage_worker");
  private f huC;
  private g huD;

  public d(f paramf)
  {
    this.huC = paramf;
    this.huD = null;
  }

  // ERROR //
  private boolean ayC()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 30	com/tencent/mm/pluginsdk/model/app/d:huC	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   6: ifnull +16 -> 22
    //   9: aload_0
    //   10: getfield 30	com/tencent/mm/pluginsdk/model/app/d:huC	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   13: getfield 48	com/tencent/mm/pluginsdk/model/app/f:url	Ljava/lang/String;
    //   16: invokestatic 54	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   19: ifeq +12 -> 31
    //   22: ldc 56
    //   24: ldc 58
    //   26: invokestatic 64	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: iconst_0
    //   30: ireturn
    //   31: ldc 56
    //   33: new 66	java/lang/StringBuilder
    //   36: dup
    //   37: ldc 68
    //   39: invokespecial 71	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: getfield 30	com/tencent/mm/pluginsdk/model/app/d:huC	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   46: getfield 74	com/tencent/mm/pluginsdk/model/app/f:huG	Ljava/lang/String;
    //   49: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: ldc 80
    //   54: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: aload_0
    //   58: getfield 30	com/tencent/mm/pluginsdk/model/app/d:huC	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   61: getfield 48	com/tencent/mm/pluginsdk/model/app/f:url	Ljava/lang/String;
    //   64: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 84	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokestatic 64	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload_0
    //   74: invokespecial 88	com/tencent/mm/pluginsdk/model/app/d:ayD	()Lcom/tencent/mm/network/be;
    //   77: astore 13
    //   79: aload 13
    //   81: astore 10
    //   83: aload 10
    //   85: ifnonnull +22 -> 107
    //   88: ldc 56
    //   90: ldc 90
    //   92: invokestatic 64	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: aload 10
    //   97: ifnull -68 -> 29
    //   100: aload 10
    //   102: invokevirtual 95	com/tencent/mm/network/be:disconnect	()V
    //   105: iconst_0
    //   106: ireturn
    //   107: aload 10
    //   109: invokevirtual 99	com/tencent/mm/network/be:getInputStream	()Ljava/io/InputStream;
    //   112: astore 15
    //   114: aload 15
    //   116: astore 9
    //   118: sipush 1024
    //   121: newarray byte
    //   123: astore 17
    //   125: new 101	java/io/FileOutputStream
    //   128: dup
    //   129: aload_0
    //   130: getfield 30	com/tencent/mm/pluginsdk/model/app/d:huC	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   133: getfield 74	com/tencent/mm/pluginsdk/model/app/f:huG	Ljava/lang/String;
    //   136: iconst_1
    //   137: invokespecial 104	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   140: astore 18
    //   142: aload 9
    //   144: aload 17
    //   146: invokevirtual 110	java/io/InputStream:read	([B)I
    //   149: istore 20
    //   151: iload 20
    //   153: iconst_m1
    //   154: if_icmpeq +63 -> 217
    //   157: aload 18
    //   159: aload 17
    //   161: iconst_0
    //   162: iload 20
    //   164: invokevirtual 116	java/io/OutputStream:write	([BII)V
    //   167: goto -25 -> 142
    //   170: astore 19
    //   172: aload 18
    //   174: astore_3
    //   175: aload 9
    //   177: astore 4
    //   179: aload 10
    //   181: astore 5
    //   183: aload 5
    //   185: ifnull +8 -> 193
    //   188: aload 5
    //   190: invokevirtual 95	com/tencent/mm/network/be:disconnect	()V
    //   193: aload 4
    //   195: ifnull +8 -> 203
    //   198: aload 4
    //   200: invokevirtual 119	java/io/InputStream:close	()V
    //   203: aload_3
    //   204: ifnull -175 -> 29
    //   207: aload_3
    //   208: invokevirtual 120	java/io/OutputStream:close	()V
    //   211: iconst_0
    //   212: ireturn
    //   213: astore 6
    //   215: iconst_0
    //   216: ireturn
    //   217: aload 18
    //   219: invokevirtual 123	java/io/OutputStream:flush	()V
    //   222: aload 18
    //   224: invokevirtual 120	java/io/OutputStream:close	()V
    //   227: aload 9
    //   229: invokevirtual 119	java/io/InputStream:close	()V
    //   232: ldc 56
    //   234: ldc 125
    //   236: invokestatic 64	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: aload 10
    //   241: ifnull +8 -> 249
    //   244: aload 10
    //   246: invokevirtual 95	com/tencent/mm/network/be:disconnect	()V
    //   249: aload 9
    //   251: ifnull +8 -> 259
    //   254: aload 9
    //   256: invokevirtual 119	java/io/InputStream:close	()V
    //   259: aload 18
    //   261: invokevirtual 120	java/io/OutputStream:close	()V
    //   264: iconst_1
    //   265: ireturn
    //   266: astore 8
    //   268: aconst_null
    //   269: astore 9
    //   271: aconst_null
    //   272: astore 10
    //   274: aload 10
    //   276: ifnull +8 -> 284
    //   279: aload 10
    //   281: invokevirtual 95	com/tencent/mm/network/be:disconnect	()V
    //   284: aload 9
    //   286: ifnull +8 -> 294
    //   289: aload 9
    //   291: invokevirtual 119	java/io/InputStream:close	()V
    //   294: aload_1
    //   295: ifnull +7 -> 302
    //   298: aload_1
    //   299: invokevirtual 120	java/io/OutputStream:close	()V
    //   302: aload 8
    //   304: athrow
    //   305: astore 22
    //   307: goto -48 -> 259
    //   310: astore 21
    //   312: goto -48 -> 264
    //   315: astore 7
    //   317: goto -114 -> 203
    //   320: astore 12
    //   322: goto -28 -> 294
    //   325: astore 11
    //   327: goto -25 -> 302
    //   330: astore 8
    //   332: aconst_null
    //   333: astore_1
    //   334: aconst_null
    //   335: astore 9
    //   337: goto -63 -> 274
    //   340: astore 8
    //   342: aconst_null
    //   343: astore_1
    //   344: goto -70 -> 274
    //   347: astore 8
    //   349: aload 18
    //   351: astore_1
    //   352: goto -78 -> 274
    //   355: astore_2
    //   356: aconst_null
    //   357: astore_3
    //   358: aconst_null
    //   359: astore 4
    //   361: aconst_null
    //   362: astore 5
    //   364: goto -181 -> 183
    //   367: astore 14
    //   369: aload 10
    //   371: astore 5
    //   373: aconst_null
    //   374: astore_3
    //   375: aconst_null
    //   376: astore 4
    //   378: goto -195 -> 183
    //   381: astore 16
    //   383: aload 10
    //   385: astore 5
    //   387: aload 9
    //   389: astore 4
    //   391: aconst_null
    //   392: astore_3
    //   393: goto -210 -> 183
    //
    // Exception table:
    //   from	to	target	type
    //   142	151	170	java/lang/Exception
    //   157	167	170	java/lang/Exception
    //   217	239	170	java/lang/Exception
    //   207	211	213	java/io/IOException
    //   73	79	266	finally
    //   254	259	305	java/io/IOException
    //   259	264	310	java/io/IOException
    //   198	203	315	java/io/IOException
    //   289	294	320	java/io/IOException
    //   298	302	325	java/io/IOException
    //   88	95	330	finally
    //   107	114	330	finally
    //   118	142	340	finally
    //   142	151	347	finally
    //   157	167	347	finally
    //   217	239	347	finally
    //   73	79	355	java/lang/Exception
    //   88	95	367	java/lang/Exception
    //   107	114	367	java/lang/Exception
    //   118	142	381	java/lang/Exception
  }

  private be ayD()
  {
    try
    {
      be localbe = k.jr(this.huC.url);
      localbe.setRequestMethod("GET");
      localbe.setConnectTimeout(25000);
      localbe.setReadTimeout(25000);
      if (k.a(localbe) != 0)
      {
        z.e("!44@/B4Tb64lLpK7a38fMf1Zl0Pl18AtFtp2FQm+kJniqYo=", "checkHttpConnection failed! ");
        return null;
      }
      return localbe;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final void start()
  {
    this.dvm.c(new e(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.d
 * JD-Core Version:    0.6.2
 */