package com.tencent.mm.sandbox.updater;

import android.os.AsyncTask;
import com.tencent.mm.network.be;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sandbox.c;

final class z extends AsyncTask
{
  private be dhS = null;
  private String host = null;
  private c iBJ = null;
  private int iBN = 200;
  private PInt iBO = new PInt();

  public z(x paramx, String paramString, c paramc)
  {
    this.host = paramString;
    this.iBJ = paramc;
  }

  // ERROR //
  private com.tencent.mm.protocal.a.oa a(com.tencent.mm.protocal.a.nz[] paramArrayOfnz)
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: ifeq +9 -> 11
    //   5: aload_1
    //   6: iconst_0
    //   7: aaload
    //   8: ifnonnull +12 -> 20
    //   11: aload_0
    //   12: iconst_m1
    //   13: putfield 27	com/tencent/mm/sandbox/updater/z:iBN	I
    //   16: aconst_null
    //   17: astore_2
    //   18: aload_2
    //   19: areturn
    //   20: ldc 44
    //   22: new 46	java/lang/StringBuilder
    //   25: dup
    //   26: ldc 48
    //   28: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   31: aload_1
    //   32: iconst_0
    //   33: aaload
    //   34: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 65	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_1
    //   44: iconst_0
    //   45: aaload
    //   46: astore_3
    //   47: new 67	com/tencent/mm/pointers/PByteArray
    //   50: dup
    //   51: invokespecial 68	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   54: astore 4
    //   56: aload_3
    //   57: invokevirtual 74	com/tencent/mm/protocal/a/nz:toByteArray	()[B
    //   60: aload 4
    //   62: aload_0
    //   63: getfield 20	com/tencent/mm/sandbox/updater/z:iBM	Lcom/tencent/mm/sandbox/updater/x;
    //   66: invokestatic 80	com/tencent/mm/sandbox/updater/x:j	(Lcom/tencent/mm/sandbox/updater/x;)Ljava/lang/String;
    //   69: aload_0
    //   70: getfield 20	com/tencent/mm/sandbox/updater/z:iBM	Lcom/tencent/mm/sandbox/updater/x;
    //   73: invokestatic 84	com/tencent/mm/sandbox/updater/x:k	(Lcom/tencent/mm/sandbox/updater/x;)[B
    //   76: invokestatic 89	com/tencent/mm/compatible/c/v:nh	()Ljava/lang/String;
    //   79: aload_0
    //   80: getfield 20	com/tencent/mm/sandbox/updater/z:iBM	Lcom/tencent/mm/sandbox/updater/x;
    //   83: invokestatic 93	com/tencent/mm/sandbox/updater/x:l	(Lcom/tencent/mm/sandbox/updater/x;)I
    //   86: bipush 113
    //   88: iconst_0
    //   89: iconst_0
    //   90: newarray byte
    //   92: iconst_0
    //   93: newarray byte
    //   95: invokestatic 99	com/tencent/mm/protocal/MMProtocalJni:pack	([BLcom/tencent/mm/pointers/PByteArray;Ljava/lang/String;[BLjava/lang/String;III[B[B)Z
    //   98: pop
    //   99: aconst_null
    //   100: astore 8
    //   102: aconst_null
    //   103: astore 9
    //   105: aload_0
    //   106: new 46	java/lang/StringBuilder
    //   109: dup
    //   110: ldc 101
    //   112: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: aload_0
    //   116: getfield 34	com/tencent/mm/sandbox/updater/z:host	Ljava/lang/String;
    //   119: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: ldc 106
    //   124: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokestatic 112	com/tencent/mm/network/k:jr	(Ljava/lang/String;)Lcom/tencent/mm/network/be;
    //   133: putfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   136: aload_0
    //   137: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   140: ldc 114
    //   142: invokevirtual 119	com/tencent/mm/network/be:setRequestMethod	(Ljava/lang/String;)V
    //   145: aload_0
    //   146: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   149: invokevirtual 122	com/tencent/mm/network/be:De	()V
    //   152: aload_0
    //   153: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   156: invokevirtual 125	com/tencent/mm/network/be:Df	()V
    //   159: aload_0
    //   160: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   163: iconst_0
    //   164: invokevirtual 129	com/tencent/mm/network/be:setUseCaches	(Z)V
    //   167: aload_0
    //   168: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   171: ldc 131
    //   173: ldc 133
    //   175: invokevirtual 136	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload_0
    //   179: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   182: ldc 138
    //   184: ldc 140
    //   186: invokevirtual 136	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload_0
    //   190: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   193: ldc 142
    //   195: ldc 144
    //   197: invokevirtual 136	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: aload_0
    //   201: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   204: ldc 146
    //   206: ldc 148
    //   208: invokevirtual 136	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   211: aload_0
    //   212: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   215: ldc 150
    //   217: ldc 152
    //   219: invokevirtual 136	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: aload_0
    //   223: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   226: ldc 154
    //   228: ldc 156
    //   230: invokevirtual 136	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   233: aload_0
    //   234: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   237: sipush 15000
    //   240: invokevirtual 160	com/tencent/mm/network/be:setConnectTimeout	(I)V
    //   243: aload_0
    //   244: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   247: invokevirtual 163	com/tencent/mm/network/be:connect	()V
    //   250: aload_0
    //   251: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   254: invokevirtual 167	com/tencent/mm/network/be:getOutputStream	()Ljava/io/OutputStream;
    //   257: astore 19
    //   259: aload 19
    //   261: astore 8
    //   263: aload 8
    //   265: aload 4
    //   267: getfield 171	com/tencent/mm/pointers/PByteArray:value	[B
    //   270: invokevirtual 177	java/io/OutputStream:write	([B)V
    //   273: aload 8
    //   275: invokevirtual 180	java/io/OutputStream:flush	()V
    //   278: aload_0
    //   279: getfield 36	com/tencent/mm/sandbox/updater/z:iBJ	Lcom/tencent/mm/sandbox/c;
    //   282: ldc2_w 181
    //   285: aload 4
    //   287: getfield 171	com/tencent/mm/pointers/PByteArray:value	[B
    //   290: arraylength
    //   291: i2l
    //   292: ladd
    //   293: invokeinterface 188 3 0
    //   298: aload_0
    //   299: aload_0
    //   300: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   303: invokevirtual 192	com/tencent/mm/network/be:getResponseCode	()I
    //   306: putfield 27	com/tencent/mm/sandbox/updater/z:iBN	I
    //   309: aload_0
    //   310: getfield 27	com/tencent/mm/sandbox/updater/z:iBN	I
    //   313: istore 20
    //   315: iload 20
    //   317: sipush 200
    //   320: if_icmpeq +62 -> 382
    //   323: aload 8
    //   325: ifnull +8 -> 333
    //   328: aload 8
    //   330: invokevirtual 195	java/io/OutputStream:close	()V
    //   333: aload_0
    //   334: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   337: ifnull +15 -> 352
    //   340: aload_0
    //   341: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   344: invokevirtual 198	com/tencent/mm/network/be:disconnect	()V
    //   347: aload_0
    //   348: aconst_null
    //   349: putfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   352: aconst_null
    //   353: areturn
    //   354: astore 5
    //   356: iconst_1
    //   357: anewarray 200	java/lang/Object
    //   360: astore 6
    //   362: aload 6
    //   364: iconst_0
    //   365: aload 5
    //   367: invokevirtual 203	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   370: aastore
    //   371: ldc 44
    //   373: ldc 205
    //   375: aload 6
    //   377: invokestatic 209	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   380: aconst_null
    //   381: areturn
    //   382: aload_0
    //   383: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   386: ldc 211
    //   388: invokevirtual 215	com/tencent/mm/network/be:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   391: astore 21
    //   393: aload_0
    //   394: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   397: invokevirtual 219	com/tencent/mm/network/be:getInputStream	()Ljava/io/InputStream;
    //   400: astore 22
    //   402: ldc2_w 181
    //   405: lstore 23
    //   407: aload 21
    //   409: ifnull +459 -> 868
    //   412: aload 21
    //   414: ldc 221
    //   416: invokevirtual 227	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   419: ifeq +449 -> 868
    //   422: new 229	java/util/zip/GZIPInputStream
    //   425: dup
    //   426: aload 22
    //   428: invokespecial 232	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   431: astore 11
    //   433: iconst_1
    //   434: istore 25
    //   436: new 234	java/io/ByteArrayOutputStream
    //   439: dup
    //   440: invokespecial 235	java/io/ByteArrayOutputStream:<init>	()V
    //   443: astore 26
    //   445: sipush 1024
    //   448: newarray byte
    //   450: astore 27
    //   452: aload 11
    //   454: aload 27
    //   456: invokevirtual 241	java/io/InputStream:read	([B)I
    //   459: istore 28
    //   461: iload 28
    //   463: ifle +24 -> 487
    //   466: aload 26
    //   468: aload 27
    //   470: iconst_0
    //   471: iload 28
    //   473: invokevirtual 244	java/io/ByteArrayOutputStream:write	([BII)V
    //   476: lload 23
    //   478: iload 28
    //   480: i2l
    //   481: ladd
    //   482: lstore 23
    //   484: goto -32 -> 452
    //   487: iload 25
    //   489: ifeq +164 -> 653
    //   492: aload 22
    //   494: invokevirtual 248	java/io/InputStream:markSupported	()Z
    //   497: ifeq +156 -> 653
    //   500: aload 22
    //   502: iconst_1
    //   503: invokevirtual 251	java/io/InputStream:mark	(I)V
    //   506: ldc2_w 181
    //   509: lstore 35
    //   511: aload 22
    //   513: aload 27
    //   515: invokevirtual 241	java/io/InputStream:read	([B)I
    //   518: istore 37
    //   520: iload 37
    //   522: ifle +14 -> 536
    //   525: lload 35
    //   527: iload 37
    //   529: i2l
    //   530: ladd
    //   531: lstore 35
    //   533: goto -22 -> 511
    //   536: aload_0
    //   537: getfield 36	com/tencent/mm/sandbox/updater/z:iBJ	Lcom/tencent/mm/sandbox/c;
    //   540: lload 35
    //   542: invokeinterface 254 3 0
    //   547: new 67	com/tencent/mm/pointers/PByteArray
    //   550: dup
    //   551: invokespecial 68	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   554: astore 29
    //   556: new 67	com/tencent/mm/pointers/PByteArray
    //   559: dup
    //   560: invokespecial 68	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   563: astore 30
    //   565: aload 29
    //   567: aload 26
    //   569: invokevirtual 255	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   572: aload_0
    //   573: getfield 20	com/tencent/mm/sandbox/updater/z:iBM	Lcom/tencent/mm/sandbox/updater/x;
    //   576: invokestatic 80	com/tencent/mm/sandbox/updater/x:j	(Lcom/tencent/mm/sandbox/updater/x;)Ljava/lang/String;
    //   579: invokevirtual 258	java/lang/String:getBytes	()[B
    //   582: aload 30
    //   584: aload_0
    //   585: getfield 32	com/tencent/mm/sandbox/updater/z:iBO	Lcom/tencent/mm/pointers/PInt;
    //   588: invokestatic 262	com/tencent/mm/protocal/MMProtocalJni:unpack	(Lcom/tencent/mm/pointers/PByteArray;[B[BLcom/tencent/mm/pointers/PByteArray;Lcom/tencent/mm/pointers/PInt;)Z
    //   591: pop
    //   592: new 264	com/tencent/mm/protocal/a/oa
    //   595: dup
    //   596: invokespecial 265	com/tencent/mm/protocal/a/oa:<init>	()V
    //   599: aload 29
    //   601: getfield 171	com/tencent/mm/pointers/PByteArray:value	[B
    //   604: invokevirtual 269	com/tencent/mm/protocal/a/oa:bN	([B)Lcom/tencent/mm/protocal/a/oa;
    //   607: astore 32
    //   609: aload 32
    //   611: astore_2
    //   612: aload 8
    //   614: ifnull +8 -> 622
    //   617: aload 8
    //   619: invokevirtual 195	java/io/OutputStream:close	()V
    //   622: aload 11
    //   624: ifnull +8 -> 632
    //   627: aload 11
    //   629: invokevirtual 270	java/io/InputStream:close	()V
    //   632: aload_0
    //   633: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   636: ifnull -618 -> 18
    //   639: aload_0
    //   640: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   643: invokevirtual 198	com/tencent/mm/network/be:disconnect	()V
    //   646: aload_0
    //   647: aconst_null
    //   648: putfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   651: aload_2
    //   652: areturn
    //   653: aload_0
    //   654: getfield 36	com/tencent/mm/sandbox/updater/z:iBJ	Lcom/tencent/mm/sandbox/c;
    //   657: lload 23
    //   659: invokeinterface 254 3 0
    //   664: goto -117 -> 547
    //   667: astore 10
    //   669: aload 8
    //   671: astore 12
    //   673: iconst_1
    //   674: anewarray 200	java/lang/Object
    //   677: astore 16
    //   679: aload 16
    //   681: iconst_0
    //   682: aload 10
    //   684: invokevirtual 203	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   687: aastore
    //   688: ldc 44
    //   690: ldc_w 272
    //   693: aload 16
    //   695: invokestatic 209	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   698: aload_0
    //   699: iconst_m1
    //   700: putfield 27	com/tencent/mm/sandbox/updater/z:iBN	I
    //   703: aload 12
    //   705: ifnull +8 -> 713
    //   708: aload 12
    //   710: invokevirtual 195	java/io/OutputStream:close	()V
    //   713: aload 11
    //   715: ifnull +8 -> 723
    //   718: aload 11
    //   720: invokevirtual 270	java/io/InputStream:close	()V
    //   723: aload_0
    //   724: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   727: ifnull +15 -> 742
    //   730: aload_0
    //   731: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   734: invokevirtual 198	com/tencent/mm/network/be:disconnect	()V
    //   737: aload_0
    //   738: aconst_null
    //   739: putfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   742: aconst_null
    //   743: areturn
    //   744: astore 13
    //   746: aload 8
    //   748: ifnull +8 -> 756
    //   751: aload 8
    //   753: invokevirtual 195	java/io/OutputStream:close	()V
    //   756: aload 9
    //   758: ifnull +8 -> 766
    //   761: aload 9
    //   763: invokevirtual 270	java/io/InputStream:close	()V
    //   766: aload_0
    //   767: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   770: ifnull +15 -> 785
    //   773: aload_0
    //   774: getfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   777: invokevirtual 198	com/tencent/mm/network/be:disconnect	()V
    //   780: aload_0
    //   781: aconst_null
    //   782: putfield 25	com/tencent/mm/sandbox/updater/z:dhS	Lcom/tencent/mm/network/be;
    //   785: aload 13
    //   787: athrow
    //   788: astore 38
    //   790: goto -457 -> 333
    //   793: astore 34
    //   795: goto -173 -> 622
    //   798: astore 33
    //   800: goto -168 -> 632
    //   803: astore 18
    //   805: goto -92 -> 713
    //   808: astore 17
    //   810: goto -87 -> 723
    //   813: astore 15
    //   815: goto -59 -> 756
    //   818: astore 14
    //   820: goto -54 -> 766
    //   823: astore 13
    //   825: aload 11
    //   827: astore 9
    //   829: goto -83 -> 746
    //   832: astore 13
    //   834: aload 12
    //   836: astore 8
    //   838: aload 11
    //   840: astore 9
    //   842: goto -96 -> 746
    //   845: astore 10
    //   847: aconst_null
    //   848: astore 11
    //   850: aconst_null
    //   851: astore 12
    //   853: goto -180 -> 673
    //   856: astore 10
    //   858: aload 8
    //   860: astore 12
    //   862: aconst_null
    //   863: astore 11
    //   865: goto -192 -> 673
    //   868: aload 22
    //   870: astore 11
    //   872: iconst_0
    //   873: istore 25
    //   875: goto -439 -> 436
    //
    // Exception table:
    //   from	to	target	type
    //   56	99	354	java/lang/Exception
    //   436	452	667	java/lang/Exception
    //   452	461	667	java/lang/Exception
    //   466	476	667	java/lang/Exception
    //   492	506	667	java/lang/Exception
    //   511	520	667	java/lang/Exception
    //   536	547	667	java/lang/Exception
    //   547	609	667	java/lang/Exception
    //   653	664	667	java/lang/Exception
    //   105	259	744	finally
    //   263	315	744	finally
    //   382	402	744	finally
    //   412	433	744	finally
    //   328	333	788	java/io/IOException
    //   617	622	793	java/io/IOException
    //   627	632	798	java/io/IOException
    //   708	713	803	java/io/IOException
    //   718	723	808	java/io/IOException
    //   751	756	813	java/io/IOException
    //   761	766	818	java/io/IOException
    //   436	452	823	finally
    //   452	461	823	finally
    //   466	476	823	finally
    //   492	506	823	finally
    //   511	520	823	finally
    //   536	547	823	finally
    //   547	609	823	finally
    //   653	664	823	finally
    //   673	703	832	finally
    //   105	259	845	java/lang/Exception
    //   263	315	856	java/lang/Exception
    //   382	402	856	java/lang/Exception
    //   412	433	856	java/lang/Exception
  }

  protected final void onCancelled()
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkgG6dDIkrLQ8=", "task had been cancelled.");
    if (this.dhS != null)
      this.dhS.disconnect();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.z
 * JD-Core Version:    0.6.2
 */