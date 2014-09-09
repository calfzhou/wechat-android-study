package com.tencent.mm.modelstat;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.protocal.a.aau;
import com.tencent.mm.protocal.a.aav;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class d extends x
  implements ab
{
  private int dDS = 5;
  private int dDT = 1;
  private Queue dDU = null;
  private m dlH;
  private a dmI;
  private ay dmV = new ay(new e(this), false);

  public d()
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new aau());
    localb.b(new aav());
    localb.fi("/cgi-bin/micromsg-bin/statreport");
    localb.de(250);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    this.dDT = ((int)g.a(l.dEG + "wd.ini", "ReportFlag", 1L));
    this.dDU = zT();
    StringBuilder localStringBuilder = new StringBuilder("getFileList : ");
    if (this.dDU == null);
    for (Object localObject = "null"; ; localObject = Integer.valueOf(this.dDU.size()))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", localObject);
      return;
    }
  }

  // ERROR //
  private boolean a(File paramFile, aau paramaau)
  {
    // Byte code:
    //   0: new 144	java/io/RandomAccessFile
    //   3: dup
    //   4: aload_1
    //   5: ldc 146
    //   7: invokespecial 149	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   10: astore_3
    //   11: new 151	com/tencent/mm/modelstat/q
    //   14: dup
    //   15: invokespecial 152	com/tencent/mm/modelstat/q:<init>	()V
    //   18: astore 4
    //   20: aload 4
    //   22: aload_3
    //   23: invokevirtual 155	com/tencent/mm/modelstat/q:a	(Ljava/io/RandomAccessFile;)I
    //   26: pop
    //   27: new 157	com/tencent/mm/protocal/a/aar
    //   30: dup
    //   31: invokespecial 158	com/tencent/mm/protocal/a/aar:<init>	()V
    //   34: astore 6
    //   36: aload 6
    //   38: aload 4
    //   40: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   43: iconst_0
    //   44: laload
    //   45: l2i
    //   46: putfield 165	com/tencent/mm/protocal/a/aar:hVv	I
    //   49: aload 6
    //   51: aload 4
    //   53: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   56: iconst_1
    //   57: laload
    //   58: l2i
    //   59: putfield 168	com/tencent/mm/protocal/a/aar:hUn	I
    //   62: aload 6
    //   64: aload 4
    //   66: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   69: iconst_3
    //   70: laload
    //   71: l2i
    //   72: putfield 171	com/tencent/mm/protocal/a/aar:itG	I
    //   75: aload 6
    //   77: aload 4
    //   79: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   82: iconst_4
    //   83: laload
    //   84: l2i
    //   85: putfield 174	com/tencent/mm/protocal/a/aar:itH	I
    //   88: aload 6
    //   90: aload 4
    //   92: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   95: iconst_5
    //   96: laload
    //   97: l2i
    //   98: putfield 177	com/tencent/mm/protocal/a/aar:itI	I
    //   101: aload 6
    //   103: aload 4
    //   105: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   108: bipush 6
    //   110: laload
    //   111: l2i
    //   112: putfield 180	com/tencent/mm/protocal/a/aar:itJ	I
    //   115: aload 6
    //   117: aload 4
    //   119: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   122: bipush 7
    //   124: laload
    //   125: l2i
    //   126: putfield 183	com/tencent/mm/protocal/a/aar:itK	I
    //   129: aload 6
    //   131: aload 4
    //   133: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   136: bipush 8
    //   138: laload
    //   139: l2i
    //   140: putfield 186	com/tencent/mm/protocal/a/aar:itL	I
    //   143: aload 6
    //   145: aload 4
    //   147: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   150: bipush 9
    //   152: laload
    //   153: l2i
    //   154: putfield 189	com/tencent/mm/protocal/a/aar:itM	I
    //   157: aload 6
    //   159: aload 4
    //   161: getfield 162	com/tencent/mm/modelstat/q:dFf	[J
    //   164: bipush 11
    //   166: laload
    //   167: l2i
    //   168: putfield 192	com/tencent/mm/protocal/a/aar:itN	I
    //   171: aload 6
    //   173: invokestatic 198	com/tencent/mm/sdk/platformtools/ch:CL	()J
    //   176: l2i
    //   177: putfield 201	com/tencent/mm/protocal/a/aar:itF	I
    //   180: aload_2
    //   181: aload 6
    //   183: putfield 205	com/tencent/mm/protocal/a/aau:iuK	Lcom/tencent/mm/protocal/a/aar;
    //   186: new 207	java/util/LinkedList
    //   189: dup
    //   190: invokespecial 208	java/util/LinkedList:<init>	()V
    //   193: astore 7
    //   195: aload_3
    //   196: invokevirtual 211	java/io/RandomAccessFile:getFilePointer	()J
    //   199: aload_3
    //   200: invokevirtual 214	java/io/RandomAccessFile:length	()J
    //   203: lcmp
    //   204: ifge +56 -> 260
    //   207: aload_3
    //   208: invokevirtual 217	java/io/RandomAccessFile:readInt	()I
    //   211: istore 11
    //   213: iload 11
    //   215: ifle +11 -> 226
    //   218: iload 11
    //   220: sipush 1024
    //   223: if_icmple +79 -> 302
    //   226: ldc 115
    //   228: new 79	java/lang/StringBuilder
    //   231: dup
    //   232: ldc 219
    //   234: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   237: iload 11
    //   239: invokevirtual 222	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   242: ldc 224
    //   244: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: aload_1
    //   248: invokevirtual 229	java/io/File:getName	()Ljava/lang/String;
    //   251: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: invokestatic 232	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: aload_3
    //   261: invokevirtual 235	java/io/RandomAccessFile:close	()V
    //   264: new 237	com/tencent/mm/protocal/a/aas
    //   267: dup
    //   268: invokespecial 238	com/tencent/mm/protocal/a/aas:<init>	()V
    //   271: astore 10
    //   273: aload 10
    //   275: aload 7
    //   277: invokevirtual 239	java/util/LinkedList:size	()I
    //   280: putfield 242	com/tencent/mm/protocal/a/aas:huF	I
    //   283: aload 10
    //   285: aload 7
    //   287: putfield 246	com/tencent/mm/protocal/a/aas:hQc	Ljava/util/LinkedList;
    //   290: aload_2
    //   291: aload 10
    //   293: putfield 250	com/tencent/mm/protocal/a/aau:iuJ	Lcom/tencent/mm/protocal/a/aas;
    //   296: iconst_1
    //   297: ireturn
    //   298: astore 20
    //   300: iconst_0
    //   301: ireturn
    //   302: iload 11
    //   304: newarray byte
    //   306: astore 12
    //   308: aload_3
    //   309: aload 12
    //   311: iconst_0
    //   312: iload 11
    //   314: invokevirtual 254	java/io/RandomAccessFile:read	([BII)I
    //   317: pop
    //   318: new 256	com/tencent/mm/protocal/a/aat
    //   321: dup
    //   322: invokespecial 257	com/tencent/mm/protocal/a/aat:<init>	()V
    //   325: aload 12
    //   327: invokevirtual 261	com/tencent/mm/protocal/a/aat:cu	([B)Lcom/tencent/mm/protocal/a/aat;
    //   330: astore 14
    //   332: aload 14
    //   334: ifnonnull +31 -> 365
    //   337: ldc 115
    //   339: new 79	java/lang/StringBuilder
    //   342: dup
    //   343: ldc_w 263
    //   346: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   349: aload_1
    //   350: invokevirtual 229	java/io/File:getName	()Ljava/lang/String;
    //   353: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   359: invokestatic 266	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   362: goto -167 -> 195
    //   365: aload 14
    //   367: getfield 269	com/tencent/mm/protocal/a/aat:itO	I
    //   370: iflt -175 -> 195
    //   373: aload 14
    //   375: getfield 269	com/tencent/mm/protocal/a/aat:itO	I
    //   378: ifle +53 -> 431
    //   381: aload_0
    //   382: getfield 25	com/tencent/mm/modelstat/d:dDT	I
    //   385: iconst_5
    //   386: if_icmpne +45 -> 431
    //   389: ldc 115
    //   391: new 79	java/lang/StringBuilder
    //   394: dup
    //   395: ldc_w 271
    //   398: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   401: aload 14
    //   403: getfield 269	com/tencent/mm/protocal/a/aat:itO	I
    //   406: invokevirtual 222	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   409: ldc_w 273
    //   412: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: aload_0
    //   416: getfield 25	com/tencent/mm/modelstat/d:dDT	I
    //   419: invokevirtual 222	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   422: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   425: invokestatic 232	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   428: goto -233 -> 195
    //   431: aload 14
    //   433: getfield 276	com/tencent/mm/protocal/a/aat:itT	I
    //   436: ifle +61 -> 497
    //   439: aload_0
    //   440: getfield 25	com/tencent/mm/modelstat/d:dDT	I
    //   443: iconst_2
    //   444: if_icmpeq +11 -> 455
    //   447: aload_0
    //   448: getfield 25	com/tencent/mm/modelstat/d:dDT	I
    //   451: iconst_5
    //   452: if_icmpne +45 -> 497
    //   455: ldc 115
    //   457: new 79	java/lang/StringBuilder
    //   460: dup
    //   461: ldc_w 278
    //   464: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   467: aload 14
    //   469: getfield 269	com/tencent/mm/protocal/a/aat:itO	I
    //   472: invokevirtual 222	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   475: ldc_w 273
    //   478: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   481: aload_0
    //   482: getfield 25	com/tencent/mm/modelstat/d:dDT	I
    //   485: invokevirtual 222	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   488: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   491: invokestatic 232	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   494: goto -299 -> 195
    //   497: invokestatic 281	com/tencent/mm/sdk/platformtools/ch:CM	()J
    //   500: lstore 15
    //   502: aload 14
    //   504: ifnonnull +22 -> 526
    //   507: iconst_0
    //   508: istore 17
    //   510: iload 17
    //   512: ifeq -317 -> 195
    //   515: aload 7
    //   517: aload 14
    //   519: invokevirtual 285	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   522: pop
    //   523: goto -328 -> 195
    //   526: aload 14
    //   528: getfield 269	com/tencent/mm/protocal/a/aat:itO	I
    //   531: ldc_w 286
    //   534: if_icmple +9 -> 543
    //   537: iconst_0
    //   538: istore 17
    //   540: goto -30 -> 510
    //   543: aload 14
    //   545: getfield 290	com/tencent/mm/protocal/a/aat:itZ	J
    //   548: ldc2_w 291
    //   551: lcmp
    //   552: ifeq +13 -> 565
    //   555: aload 14
    //   557: getfield 290	com/tencent/mm/protocal/a/aat:itZ	J
    //   560: lconst_0
    //   561: lcmp
    //   562: iflt +249 -> 811
    //   565: aload 14
    //   567: getfield 290	com/tencent/mm/protocal/a/aat:itZ	J
    //   570: lload 15
    //   572: lcmp
    //   573: ifle +6 -> 579
    //   576: goto +235 -> 811
    //   579: aload 14
    //   581: getfield 295	com/tencent/mm/protocal/a/aat:iua	J
    //   584: ldc2_w 291
    //   587: lcmp
    //   588: ifeq +13 -> 601
    //   591: aload 14
    //   593: getfield 295	com/tencent/mm/protocal/a/aat:iua	J
    //   596: lconst_0
    //   597: lcmp
    //   598: iflt +219 -> 817
    //   601: aload 14
    //   603: getfield 295	com/tencent/mm/protocal/a/aat:iua	J
    //   606: lload 15
    //   608: lcmp
    //   609: ifle +6 -> 615
    //   612: goto +205 -> 817
    //   615: aload 14
    //   617: getfield 290	com/tencent/mm/protocal/a/aat:itZ	J
    //   620: aload 14
    //   622: getfield 295	com/tencent/mm/protocal/a/aat:iua	J
    //   625: lcmp
    //   626: ifle +9 -> 635
    //   629: iconst_0
    //   630: istore 17
    //   632: goto -122 -> 510
    //   635: aload 14
    //   637: getfield 298	com/tencent/mm/protocal/a/aat:itU	I
    //   640: i2l
    //   641: aload 14
    //   643: getfield 295	com/tencent/mm/protocal/a/aat:iua	J
    //   646: aload 14
    //   648: getfield 290	com/tencent/mm/protocal/a/aat:itZ	J
    //   651: lsub
    //   652: lcmp
    //   653: ifle +9 -> 662
    //   656: iconst_0
    //   657: istore 17
    //   659: goto -149 -> 510
    //   662: aload 14
    //   664: getfield 298	com/tencent/mm/protocal/a/aat:itU	I
    //   667: ldc_w 299
    //   670: if_icmpeq +11 -> 681
    //   673: aload 14
    //   675: getfield 298	com/tencent/mm/protocal/a/aat:itU	I
    //   678: iflt +145 -> 823
    //   681: aload 14
    //   683: getfield 298	com/tencent/mm/protocal/a/aat:itU	I
    //   686: i2l
    //   687: ldc2_w 300
    //   690: lcmp
    //   691: ifle +6 -> 697
    //   694: goto +129 -> 823
    //   697: aload 14
    //   699: getfield 304	com/tencent/mm/protocal/a/aat:itV	I
    //   702: ldc_w 299
    //   705: if_icmpeq +17 -> 722
    //   708: aload 14
    //   710: getfield 304	com/tencent/mm/protocal/a/aat:itV	I
    //   713: ifge +9 -> 722
    //   716: iconst_0
    //   717: istore 17
    //   719: goto -209 -> 510
    //   722: aload 14
    //   724: getfield 307	com/tencent/mm/protocal/a/aat:itX	I
    //   727: ldc_w 299
    //   730: if_icmpeq +11 -> 741
    //   733: aload 14
    //   735: getfield 307	com/tencent/mm/protocal/a/aat:itX	I
    //   738: iflt +91 -> 829
    //   741: aload 14
    //   743: getfield 307	com/tencent/mm/protocal/a/aat:itX	I
    //   746: ldc_w 308
    //   749: if_icmple +6 -> 755
    //   752: goto +77 -> 829
    //   755: aload 14
    //   757: getfield 311	com/tencent/mm/protocal/a/aat:itW	I
    //   760: ldc_w 299
    //   763: if_icmpeq +11 -> 774
    //   766: aload 14
    //   768: getfield 311	com/tencent/mm/protocal/a/aat:itW	I
    //   771: iflt +18 -> 789
    //   774: aload 14
    //   776: getfield 311	com/tencent/mm/protocal/a/aat:itW	I
    //   779: istore 19
    //   781: iload 19
    //   783: ldc_w 308
    //   786: if_icmple +9 -> 795
    //   789: iconst_0
    //   790: istore 17
    //   792: goto -282 -> 510
    //   795: iconst_1
    //   796: istore 17
    //   798: goto -288 -> 510
    //   801: astore 9
    //   803: goto -539 -> 264
    //   806: astore 8
    //   808: goto -548 -> 260
    //   811: iconst_0
    //   812: istore 17
    //   814: goto -304 -> 510
    //   817: iconst_0
    //   818: istore 17
    //   820: goto -310 -> 510
    //   823: iconst_0
    //   824: istore 17
    //   826: goto -316 -> 510
    //   829: iconst_0
    //   830: istore 17
    //   832: goto -322 -> 510
    //
    // Exception table:
    //   from	to	target	type
    //   0	11	298	java/lang/Exception
    //   260	264	801	java/io/IOException
    //   195	213	806	java/lang/Exception
    //   226	260	806	java/lang/Exception
    //   302	332	806	java/lang/Exception
    //   337	362	806	java/lang/Exception
    //   365	428	806	java/lang/Exception
    //   431	455	806	java/lang/Exception
    //   455	494	806	java/lang/Exception
    //   497	502	806	java/lang/Exception
    //   515	523	806	java/lang/Exception
    //   526	537	806	java/lang/Exception
    //   543	565	806	java/lang/Exception
    //   565	576	806	java/lang/Exception
    //   579	601	806	java/lang/Exception
    //   601	612	806	java/lang/Exception
    //   615	629	806	java/lang/Exception
    //   635	656	806	java/lang/Exception
    //   662	681	806	java/lang/Exception
    //   681	694	806	java/lang/Exception
    //   697	716	806	java/lang/Exception
    //   722	741	806	java/lang/Exception
    //   741	752	806	java/lang/Exception
    //   755	774	806	java/lang/Exception
    //   774	781	806	java/lang/Exception
  }

  public static long hz(String paramString)
  {
    if (ch.jb(paramString));
    int j;
    int k;
    do
    {
      int i;
      do
      {
        return -1L;
        i = paramString.indexOf("wd_");
      }
      while (i < 0);
      j = i + 3;
      k = paramString.indexOf(".bin");
    }
    while ((k <= 0) || (j >= k));
    return ch.getLong(paramString.substring(j, k), -1L);
  }

  private static Queue zT()
  {
    int i = 0;
    File[] arrayOfFile = new File(l.dEG).listFiles();
    Object localObject;
    if (arrayOfFile == null)
      localObject = null;
    while (true)
    {
      return localObject;
      long l1 = hz(l.hA(g.getValue(l.dEG + "wd.ini", "LastFile")));
      HashMap localHashMap = new HashMap();
      long l2 = ch.CM();
      int j = 0;
      if (j < arrayOfFile.length)
      {
        String str = arrayOfFile[j].getPath();
        long l3;
        if (!str.endsWith("wd.ini"))
        {
          l3 = hz(str);
          if ((l3 != -1L) && (l1 != l3))
            break label164;
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "getTimeByFle failed tLast:" + l1 + " file:" + str);
        }
        while (true)
        {
          j++;
          break;
          label164: if (l2 - 604800000L > l3)
          {
            arrayOfFile[j].delete();
            com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "Give up file:" + str);
          }
          else if (str.endsWith(".send"))
          {
            com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "file has send :" + str);
          }
          else
          {
            localHashMap.put(Long.valueOf(l3), arrayOfFile[j]);
          }
        }
      }
      if (localHashMap.size() == 0)
        return null;
      localObject = new LinkedList();
      Object[] arrayOfObject = localHashMap.keySet().toArray();
      Arrays.sort(arrayOfObject);
      int k = arrayOfObject.length;
      while (i < k)
      {
        ((Queue)localObject).add(localHashMap.get(arrayOfObject[i]));
        i++;
      }
    }
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    if (!bg.qW().isSDCardAvailable())
      return -1;
    if ((this.dDU == null) || (this.dDU.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "doScene get queue failed");
      return -1;
    }
    while (this.dDU.size() > 0)
    {
      File localFile = (File)this.dDU.peek();
      boolean bool = a(localFile, (aau)this.dmI.sO());
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "getReqFromFile:" + localFile.getName() + " succ:" + bool);
      if (bool)
        break;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "get req failed file:" + localFile.getPath());
      ((File)this.dDU.poll()).delete();
    }
    if (this.dDU.size() <= 0)
      return -1;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    File localFile = (File)this.dDU.poll();
    localFile.renameTo(new File(localFile.getAbsoluteFile() + ".send"));
    aav localaav = (aav)this.dmI.sP();
    long l1 = localaav.iuL;
    int i = localaav.iuM;
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "onGYEnetEnd nextTime:" + l1 + " flag:" + i);
    long l2;
    if (l1 <= 0L)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "ERROR Resp getNextReportTime :" + l1);
      l2 = 43200L;
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvvTQpYk3qKu1t/IVNJX2uDg=", "onGYEnetEnd FIX: nextTime:" + l2 + " flag:" + i);
      g.b(l.dEG + "wd.ini", "NextReportTime", l2 + ch.CL());
      g.d(l.dEG + "wd.ini", "ReportFlag", i);
      if ((this.dDU.size() > 0) && (this.dDS > 0))
      {
        this.dmV.cP(2000L);
        return;
        if ((l1 > 43200L) && (i != 1))
          l2 = 43200L;
      }
      else
      {
        WatchDogPushReceiver.Aq();
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
        l2 = l1;
      }
    }
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
  }

  public final int getType()
  {
    return 250;
  }

  protected final int sB()
  {
    return 5;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.d
 * JD-Core Version:    0.6.2
 */