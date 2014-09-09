package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.regex.Pattern;

final class bm
  implements br
{
  private static Pattern hMF = Pattern.compile("image/[A-Za-z0-9]+");
  private static Pattern hMG = Pattern.compile("filename=[A-Za-z0-9@.]+.[A-Za-z0-9]+");
  private int cDf;
  private Context context;
  private String hMH;
  private String hMI;
  private boolean hMJ;
  private bl hMK;
  private String imagePath;
  private String imageUrl;

  public bm(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    this(paramContext, paramString1, paramString2, paramBoolean, 0, null);
  }

  public bm(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, int paramInt, bl parambl)
  {
    this.context = paramContext;
    this.imageUrl = paramString1;
    this.hMI = paramString2;
    this.hMJ = paramBoolean;
    this.cDf = paramInt;
    this.hMK = parambl;
  }

  // ERROR //
  public final boolean rD()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 53	com/tencent/mm/pluginsdk/ui/tools/bm:hMJ	Z
    //   6: ifne +19 -> 25
    //   9: aload_0
    //   10: aload_0
    //   11: getfield 47	com/tencent/mm/pluginsdk/ui/tools/bm:context	Landroid/content/Context;
    //   14: getstatic 70	com/tencent/mm/n:cul	I
    //   17: invokevirtual 76	android/content/Context:getString	(I)Ljava/lang/String;
    //   20: putfield 78	com/tencent/mm/pluginsdk/ui/tools/bm:hMH	Ljava/lang/String;
    //   23: iconst_1
    //   24: ireturn
    //   25: new 80	org/apache/http/impl/client/DefaultHttpClient
    //   28: dup
    //   29: invokespecial 81	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   32: astore_2
    //   33: new 83	java/net/URI
    //   36: dup
    //   37: aload_0
    //   38: getfield 49	com/tencent/mm/pluginsdk/ui/tools/bm:imageUrl	Ljava/lang/String;
    //   41: invokespecial 86	java/net/URI:<init>	(Ljava/lang/String;)V
    //   44: astore_3
    //   45: new 88	org/apache/http/client/methods/HttpGet
    //   48: dup
    //   49: aload_3
    //   50: invokespecial 91	org/apache/http/client/methods/HttpGet:<init>	(Ljava/net/URI;)V
    //   53: astore 4
    //   55: ldc 93
    //   57: ldc 95
    //   59: invokestatic 101	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   62: pop
    //   63: aload 4
    //   65: ldc 103
    //   67: aload_0
    //   68: getfield 51	com/tencent/mm/pluginsdk/ui/tools/bm:hMI	Ljava/lang/String;
    //   71: invokevirtual 109	org/apache/http/client/methods/HttpRequestBase:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: aload_2
    //   75: aload 4
    //   77: invokeinterface 115 2 0
    //   82: astore 14
    //   84: aload 14
    //   86: invokeinterface 121 1 0
    //   91: invokeinterface 127 1 0
    //   96: sipush 200
    //   99: if_icmpeq +141 -> 240
    //   102: aload_0
    //   103: aload_0
    //   104: getfield 47	com/tencent/mm/pluginsdk/ui/tools/bm:context	Landroid/content/Context;
    //   107: getstatic 130	com/tencent/mm/n:cuk	I
    //   110: invokevirtual 76	android/content/Context:getString	(I)Ljava/lang/String;
    //   113: putfield 78	com/tencent/mm/pluginsdk/ui/tools/bm:hMH	Ljava/lang/String;
    //   116: iconst_1
    //   117: ireturn
    //   118: astore 9
    //   120: aconst_null
    //   121: astore 10
    //   123: ldc 132
    //   125: new 134	java/lang/StringBuilder
    //   128: dup
    //   129: ldc 136
    //   131: invokespecial 137	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: aload 9
    //   136: invokevirtual 141	java/lang/Exception:toString	()Ljava/lang/String;
    //   139: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 151	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: aload_0
    //   149: aload_0
    //   150: getfield 47	com/tencent/mm/pluginsdk/ui/tools/bm:context	Landroid/content/Context;
    //   153: getstatic 130	com/tencent/mm/n:cuk	I
    //   156: invokevirtual 76	android/content/Context:getString	(I)Ljava/lang/String;
    //   159: putfield 78	com/tencent/mm/pluginsdk/ui/tools/bm:hMH	Ljava/lang/String;
    //   162: aload 10
    //   164: ifnull +8 -> 172
    //   167: aload 10
    //   169: invokevirtual 156	java/io/InputStream:close	()V
    //   172: aload_1
    //   173: ifnull -150 -> 23
    //   176: aload_1
    //   177: invokevirtual 159	java/io/OutputStream:close	()V
    //   180: iconst_1
    //   181: ireturn
    //   182: astore 11
    //   184: iconst_1
    //   185: ireturn
    //   186: astore 33
    //   188: aload_0
    //   189: aload_0
    //   190: getfield 49	com/tencent/mm/pluginsdk/ui/tools/bm:imageUrl	Ljava/lang/String;
    //   193: invokestatic 165	com/tencent/mm/pluginsdk/ui/tools/bk:gV	(Ljava/lang/String;)Ljava/lang/String;
    //   196: putfield 49	com/tencent/mm/pluginsdk/ui/tools/bm:imageUrl	Ljava/lang/String;
    //   199: new 83	java/net/URI
    //   202: dup
    //   203: aload_0
    //   204: getfield 49	com/tencent/mm/pluginsdk/ui/tools/bm:imageUrl	Ljava/lang/String;
    //   207: invokespecial 86	java/net/URI:<init>	(Ljava/lang/String;)V
    //   210: astore_3
    //   211: goto -166 -> 45
    //   214: astore 5
    //   216: aconst_null
    //   217: astore 6
    //   219: aload 6
    //   221: ifnull +8 -> 229
    //   224: aload 6
    //   226: invokevirtual 156	java/io/InputStream:close	()V
    //   229: aload_1
    //   230: ifnull +7 -> 237
    //   233: aload_1
    //   234: invokevirtual 159	java/io/OutputStream:close	()V
    //   237: aload 5
    //   239: athrow
    //   240: aload 14
    //   242: invokeinterface 169 1 0
    //   247: invokeinterface 175 1 0
    //   252: invokeinterface 180 1 0
    //   257: astore 15
    //   259: aload 15
    //   261: invokestatic 186	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   264: ifne +399 -> 663
    //   267: getstatic 34	com/tencent/mm/pluginsdk/ui/tools/bm:hMF	Ljava/util/regex/Pattern;
    //   270: aload 15
    //   272: invokevirtual 190	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   275: astore 32
    //   277: aload 32
    //   279: invokevirtual 195	java/util/regex/Matcher:find	()Z
    //   282: ifeq +381 -> 663
    //   285: aload 32
    //   287: invokevirtual 198	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   290: iconst_1
    //   291: aload 32
    //   293: invokevirtual 198	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   296: bipush 47
    //   298: invokevirtual 204	java/lang/String:lastIndexOf	(I)I
    //   301: iadd
    //   302: invokevirtual 207	java/lang/String:substring	(I)Ljava/lang/String;
    //   305: astore 16
    //   307: aload 16
    //   309: invokestatic 186	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   312: ifeq +61 -> 373
    //   315: aload 14
    //   317: ldc 209
    //   319: invokeinterface 213 2 0
    //   324: iconst_0
    //   325: aaload
    //   326: invokeinterface 180 1 0
    //   331: astore 30
    //   333: getstatic 38	com/tencent/mm/pluginsdk/ui/tools/bm:hMG	Ljava/util/regex/Pattern;
    //   336: aload 30
    //   338: invokevirtual 190	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   341: astore 31
    //   343: aload 31
    //   345: invokevirtual 195	java/util/regex/Matcher:find	()Z
    //   348: ifeq +25 -> 373
    //   351: aload 31
    //   353: invokevirtual 198	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   356: iconst_1
    //   357: aload 31
    //   359: invokevirtual 198	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   362: bipush 46
    //   364: invokevirtual 204	java/lang/String:lastIndexOf	(I)I
    //   367: iadd
    //   368: invokevirtual 207	java/lang/String:substring	(I)Ljava/lang/String;
    //   371: astore 16
    //   373: aload 16
    //   375: invokestatic 186	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   378: ifeq +38 -> 416
    //   381: new 215	com/tencent/mm/pluginsdk/ui/tools/bh
    //   384: dup
    //   385: aload_0
    //   386: getfield 49	com/tencent/mm/pluginsdk/ui/tools/bm:imageUrl	Ljava/lang/String;
    //   389: invokespecial 216	com/tencent/mm/pluginsdk/ui/tools/bh:<init>	(Ljava/lang/String;)V
    //   392: astore 17
    //   394: aload 17
    //   396: getfield 219	com/tencent/mm/pluginsdk/ui/tools/bh:mPath	Ljava/lang/String;
    //   399: bipush 46
    //   401: invokevirtual 204	java/lang/String:lastIndexOf	(I)I
    //   404: istore 18
    //   406: iload 18
    //   408: iconst_m1
    //   409: if_icmpne +94 -> 503
    //   412: ldc 221
    //   414: astore 16
    //   416: aload_0
    //   417: aload 16
    //   419: invokestatic 226	com/tencent/mm/pluginsdk/ui/tools/bc:jz	(Ljava/lang/String;)Ljava/lang/String;
    //   422: putfield 228	com/tencent/mm/pluginsdk/ui/tools/bm:imagePath	Ljava/lang/String;
    //   425: aload 14
    //   427: invokeinterface 169 1 0
    //   432: invokeinterface 232 1 0
    //   437: astore 20
    //   439: aload 20
    //   441: astore 6
    //   443: new 234	java/io/FileOutputStream
    //   446: dup
    //   447: aload_0
    //   448: getfield 228	com/tencent/mm/pluginsdk/ui/tools/bm:imagePath	Ljava/lang/String;
    //   451: invokespecial 235	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   454: astore 21
    //   456: sipush 8192
    //   459: newarray byte
    //   461: astore 22
    //   463: aload 6
    //   465: aload 22
    //   467: invokevirtual 239	java/io/InputStream:read	([B)I
    //   470: istore 23
    //   472: iload 23
    //   474: iconst_m1
    //   475: if_icmpeq +49 -> 524
    //   478: aload 21
    //   480: aload 22
    //   482: iconst_0
    //   483: iload 23
    //   485: invokevirtual 243	java/io/OutputStream:write	([BII)V
    //   488: goto -25 -> 463
    //   491: astore 9
    //   493: aload 21
    //   495: astore_1
    //   496: aload 6
    //   498: astore 10
    //   500: goto -377 -> 123
    //   503: aload 17
    //   505: getfield 219	com/tencent/mm/pluginsdk/ui/tools/bh:mPath	Ljava/lang/String;
    //   508: iload 18
    //   510: iconst_1
    //   511: iadd
    //   512: invokevirtual 207	java/lang/String:substring	(I)Ljava/lang/String;
    //   515: astore 19
    //   517: aload 19
    //   519: astore 16
    //   521: goto -105 -> 416
    //   524: aload_0
    //   525: getfield 55	com/tencent/mm/pluginsdk/ui/tools/bm:cDf	I
    //   528: ifne +72 -> 600
    //   531: aload_0
    //   532: getfield 47	com/tencent/mm/pluginsdk/ui/tools/bm:context	Landroid/content/Context;
    //   535: astore 27
    //   537: getstatic 246	com/tencent/mm/n:bDP	I
    //   540: istore 28
    //   542: iconst_1
    //   543: anewarray 4	java/lang/Object
    //   546: astore 29
    //   548: aload 29
    //   550: iconst_0
    //   551: invokestatic 249	com/tencent/mm/pluginsdk/ui/tools/bc:Dv	()Ljava/lang/String;
    //   554: aastore
    //   555: aload_0
    //   556: aload 27
    //   558: iload 28
    //   560: aload 29
    //   562: invokevirtual 252	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   565: putfield 78	com/tencent/mm/pluginsdk/ui/tools/bm:hMH	Ljava/lang/String;
    //   568: aload_0
    //   569: getfield 228	com/tencent/mm/pluginsdk/ui/tools/bm:imagePath	Ljava/lang/String;
    //   572: aload_0
    //   573: getfield 47	com/tencent/mm/pluginsdk/ui/tools/bm:context	Landroid/content/Context;
    //   576: invokestatic 255	com/tencent/mm/pluginsdk/ui/tools/bc:e	(Ljava/lang/String;Landroid/content/Context;)V
    //   579: aload 6
    //   581: ifnull +8 -> 589
    //   584: aload 6
    //   586: invokevirtual 156	java/io/InputStream:close	()V
    //   589: aload 21
    //   591: invokevirtual 159	java/io/OutputStream:close	()V
    //   594: iconst_1
    //   595: ireturn
    //   596: astore 25
    //   598: iconst_1
    //   599: ireturn
    //   600: aload_0
    //   601: getfield 55	com/tencent/mm/pluginsdk/ui/tools/bm:cDf	I
    //   604: pop
    //   605: goto -26 -> 579
    //   608: astore 26
    //   610: goto -21 -> 589
    //   613: astore 12
    //   615: goto -443 -> 172
    //   618: astore 8
    //   620: goto -391 -> 229
    //   623: astore 7
    //   625: goto -388 -> 237
    //   628: astore 5
    //   630: aconst_null
    //   631: astore_1
    //   632: goto -413 -> 219
    //   635: astore 5
    //   637: aload 21
    //   639: astore_1
    //   640: goto -421 -> 219
    //   643: astore 5
    //   645: aload 10
    //   647: astore 6
    //   649: goto -430 -> 219
    //   652: astore 9
    //   654: aload 6
    //   656: astore 10
    //   658: aconst_null
    //   659: astore_1
    //   660: goto -537 -> 123
    //   663: aconst_null
    //   664: astore 16
    //   666: goto -359 -> 307
    //
    // Exception table:
    //   from	to	target	type
    //   25	33	118	java/lang/Exception
    //   33	45	118	java/lang/Exception
    //   45	116	118	java/lang/Exception
    //   188	211	118	java/lang/Exception
    //   240	307	118	java/lang/Exception
    //   307	373	118	java/lang/Exception
    //   373	406	118	java/lang/Exception
    //   416	439	118	java/lang/Exception
    //   503	517	118	java/lang/Exception
    //   176	180	182	java/io/IOException
    //   33	45	186	java/net/URISyntaxException
    //   25	33	214	finally
    //   33	45	214	finally
    //   45	116	214	finally
    //   188	211	214	finally
    //   240	307	214	finally
    //   307	373	214	finally
    //   373	406	214	finally
    //   416	439	214	finally
    //   503	517	214	finally
    //   456	463	491	java/lang/Exception
    //   463	472	491	java/lang/Exception
    //   478	488	491	java/lang/Exception
    //   524	579	491	java/lang/Exception
    //   600	605	491	java/lang/Exception
    //   589	594	596	java/io/IOException
    //   584	589	608	java/io/IOException
    //   167	172	613	java/io/IOException
    //   224	229	618	java/io/IOException
    //   233	237	623	java/io/IOException
    //   443	456	628	finally
    //   456	463	635	finally
    //   463	472	635	finally
    //   478	488	635	finally
    //   524	579	635	finally
    //   600	605	635	finally
    //   123	162	643	finally
    //   443	456	652	java/lang/Exception
  }

  public final boolean rE()
  {
    if (1 == this.cDf)
    {
      this.hMK.ux(this.imagePath);
      return true;
    }
    if (!ch.jb(this.hMH))
    {
      Toast.makeText(this.context, this.hMH, 1).show();
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.bm
 * JD-Core Version:    0.6.2
 */