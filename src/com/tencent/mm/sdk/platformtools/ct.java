package com.tencent.mm.sdk.platformtools;

import android.os.Process;
import java.io.File;

public final class ct
{
  private static long iGe;
  private static long iGf;
  private static long iGg;
  private static long iGh;
  private static long iGi;
  private static long iGj;
  private static long iGk;
  private static long iGl;
  private static long iGm;
  private static long iGn;
  private static long iGo;
  private static long iGp;
  private static long iGq;
  private static long iGr;
  private static long iGs;
  private static long iGt;
  private static final File iGu;
  private static final File iGv;

  static
  {
    File localFile1 = new File("/proc/" + Process.myPid() + "/net/dev");
    if (localFile1.isFile());
    while (true)
    {
      iGu = localFile1;
      File localFile2 = new File("/proc/net/xt_qtaguid/stats");
      boolean bool = localFile2.isFile();
      File localFile3 = null;
      if (bool)
        localFile3 = localFile2;
      iGv = localFile3;
      return;
      localFile1 = null;
    }
  }

  public static long aNF()
  {
    long l = 0L;
    if (iGo > l)
      l = iGo;
    return l;
  }

  public static long aNG()
  {
    long l = 0L;
    if (iGp > l)
      l = iGp;
    return l;
  }

  public static long aNH()
  {
    long l = 0L;
    if (iGm > l)
      l = iGm;
    return l;
  }

  public static long aNI()
  {
    long l = 0L;
    if (iGn > l)
      l = iGn;
    return l;
  }

  public static long aNJ()
  {
    long l = 0L;
    if (iGs > l)
      l = iGs;
    return l;
  }

  public static long aNK()
  {
    long l = 0L;
    if (iGt > l)
      l = iGt;
    return l;
  }

  public static long aNL()
  {
    long l = 0L;
    if (iGq > l)
      l = iGq;
    return l;
  }

  public static long aNM()
  {
    long l = 0L;
    if (iGr > l)
      l = iGr;
    return l;
  }

  public static void reset()
  {
    iGe = -1L;
    iGf = -1L;
    iGg = -1L;
    iGh = -1L;
    iGj = -1L;
    iGi = -1L;
    iGl = -1L;
    iGk = -1L;
    update();
  }

  // ERROR //
  public static void update()
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_0
    //   2: lconst_0
    //   3: lstore_2
    //   4: aconst_null
    //   5: astore 4
    //   7: getstatic 62	com/tencent/mm/sdk/platformtools/ct:iGu	Ljava/io/File;
    //   10: ifnull +575 -> 585
    //   13: new 117	java/util/Scanner
    //   16: dup
    //   17: getstatic 62	com/tencent/mm/sdk/platformtools/ct:iGu	Ljava/io/File;
    //   20: invokespecial 120	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   23: astore 6
    //   25: aload 6
    //   27: invokevirtual 123	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   30: pop
    //   31: aload 6
    //   33: invokevirtual 123	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   36: pop
    //   37: lconst_0
    //   38: lstore 11
    //   40: lconst_0
    //   41: lstore 13
    //   43: aload 6
    //   45: invokevirtual 126	java/util/Scanner:hasNext	()Z
    //   48: ifeq +146 -> 194
    //   51: aload 6
    //   53: invokevirtual 123	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   56: ldc 128
    //   58: invokevirtual 134	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   61: astore 61
    //   63: aload 61
    //   65: iconst_0
    //   66: aaload
    //   67: invokevirtual 137	java/lang/String:length	()I
    //   70: ifne +1056 -> 1126
    //   73: iconst_1
    //   74: istore 62
    //   76: aload 61
    //   78: iconst_0
    //   79: aaload
    //   80: ldc 139
    //   82: invokevirtual 143	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   85: ifne +45 -> 130
    //   88: aload 61
    //   90: iload 62
    //   92: iconst_0
    //   93: iadd
    //   94: aaload
    //   95: ldc 145
    //   97: invokevirtual 149	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   100: ifeq +30 -> 130
    //   103: lload_0
    //   104: aload 61
    //   106: iload 62
    //   108: bipush 9
    //   110: iadd
    //   111: aaload
    //   112: invokestatic 155	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   115: ladd
    //   116: lstore_0
    //   117: lload_2
    //   118: aload 61
    //   120: iload 62
    //   122: iconst_1
    //   123: iadd
    //   124: aaload
    //   125: invokestatic 155	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   128: ladd
    //   129: lstore_2
    //   130: aload 61
    //   132: iload 62
    //   134: iconst_0
    //   135: iadd
    //   136: aaload
    //   137: ldc 139
    //   139: invokevirtual 143	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   142: ifne -99 -> 43
    //   145: aload 61
    //   147: iload 62
    //   149: iconst_0
    //   150: iadd
    //   151: aaload
    //   152: ldc 145
    //   154: invokevirtual 149	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   157: ifne -114 -> 43
    //   160: lload 13
    //   162: aload 61
    //   164: iload 62
    //   166: bipush 9
    //   168: iadd
    //   169: aaload
    //   170: invokestatic 155	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   173: ladd
    //   174: lstore 13
    //   176: lload 11
    //   178: aload 61
    //   180: iload 62
    //   182: iconst_1
    //   183: iadd
    //   184: aaload
    //   185: invokestatic 155	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   188: ladd
    //   189: lstore 11
    //   191: goto -148 -> 43
    //   194: aload 6
    //   196: invokevirtual 158	java/util/Scanner:close	()V
    //   199: aconst_null
    //   200: astore 6
    //   202: getstatic 96	com/tencent/mm/sdk/platformtools/ct:iGe	J
    //   205: lconst_0
    //   206: lcmp
    //   207: istore 15
    //   209: aconst_null
    //   210: astore 6
    //   212: iload 15
    //   214: ifge +30 -> 244
    //   217: lload_0
    //   218: putstatic 96	com/tencent/mm/sdk/platformtools/ct:iGe	J
    //   221: iconst_1
    //   222: anewarray 4	java/lang/Object
    //   225: astore 16
    //   227: aload 16
    //   229: iconst_0
    //   230: lload_0
    //   231: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   234: aastore
    //   235: ldc 164
    //   237: ldc 166
    //   239: aload 16
    //   241: invokestatic 172	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   244: getstatic 98	com/tencent/mm/sdk/platformtools/ct:iGf	J
    //   247: lconst_0
    //   248: lcmp
    //   249: istore 17
    //   251: aconst_null
    //   252: astore 6
    //   254: iload 17
    //   256: ifge +30 -> 286
    //   259: lload_2
    //   260: putstatic 98	com/tencent/mm/sdk/platformtools/ct:iGf	J
    //   263: iconst_1
    //   264: anewarray 4	java/lang/Object
    //   267: astore 18
    //   269: aload 18
    //   271: iconst_0
    //   272: lload_2
    //   273: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   276: aastore
    //   277: ldc 164
    //   279: ldc 174
    //   281: aload 18
    //   283: invokestatic 172	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: getstatic 100	com/tencent/mm/sdk/platformtools/ct:iGg	J
    //   289: lconst_0
    //   290: lcmp
    //   291: istore 19
    //   293: aconst_null
    //   294: astore 6
    //   296: iload 19
    //   298: ifge +32 -> 330
    //   301: lload 13
    //   303: putstatic 100	com/tencent/mm/sdk/platformtools/ct:iGg	J
    //   306: iconst_1
    //   307: anewarray 4	java/lang/Object
    //   310: astore 20
    //   312: aload 20
    //   314: iconst_0
    //   315: lload 13
    //   317: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   320: aastore
    //   321: ldc 164
    //   323: ldc 176
    //   325: aload 20
    //   327: invokestatic 172	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   330: getstatic 102	com/tencent/mm/sdk/platformtools/ct:iGh	J
    //   333: lconst_0
    //   334: lcmp
    //   335: istore 21
    //   337: aconst_null
    //   338: astore 6
    //   340: iload 21
    //   342: ifge +32 -> 374
    //   345: lload 11
    //   347: putstatic 102	com/tencent/mm/sdk/platformtools/ct:iGh	J
    //   350: iconst_1
    //   351: anewarray 4	java/lang/Object
    //   354: astore 22
    //   356: aload 22
    //   358: iconst_0
    //   359: lload 11
    //   361: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   364: aastore
    //   365: ldc 164
    //   367: ldc 178
    //   369: aload 22
    //   371: invokestatic 172	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   374: lload 11
    //   376: getstatic 102	com/tencent/mm/sdk/platformtools/ct:iGh	J
    //   379: lsub
    //   380: lconst_0
    //   381: lcmp
    //   382: ifge +31 -> 413
    //   385: iconst_1
    //   386: anewarray 4	java/lang/Object
    //   389: astore 60
    //   391: aload 60
    //   393: iconst_0
    //   394: lload 11
    //   396: getstatic 102	com/tencent/mm/sdk/platformtools/ct:iGh	J
    //   399: lsub
    //   400: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   403: aastore
    //   404: ldc 164
    //   406: ldc 180
    //   408: aload 60
    //   410: invokestatic 172	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   413: lload 13
    //   415: getstatic 100	com/tencent/mm/sdk/platformtools/ct:iGg	J
    //   418: lsub
    //   419: lconst_0
    //   420: lcmp
    //   421: ifge +31 -> 452
    //   424: iconst_1
    //   425: anewarray 4	java/lang/Object
    //   428: astore 59
    //   430: aload 59
    //   432: iconst_0
    //   433: lload 13
    //   435: getstatic 100	com/tencent/mm/sdk/platformtools/ct:iGg	J
    //   438: lsub
    //   439: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   442: aastore
    //   443: ldc 164
    //   445: ldc 180
    //   447: aload 59
    //   449: invokestatic 172	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   452: lload_0
    //   453: getstatic 96	com/tencent/mm/sdk/platformtools/ct:iGe	J
    //   456: lcmp
    //   457: istore 23
    //   459: aconst_null
    //   460: astore 6
    //   462: iload 23
    //   464: iflt +668 -> 1132
    //   467: lload_0
    //   468: getstatic 96	com/tencent/mm/sdk/platformtools/ct:iGe	J
    //   471: lsub
    //   472: lstore 24
    //   474: lload 24
    //   476: putstatic 76	com/tencent/mm/sdk/platformtools/ct:iGm	J
    //   479: lload_2
    //   480: getstatic 98	com/tencent/mm/sdk/platformtools/ct:iGf	J
    //   483: lcmp
    //   484: istore 26
    //   486: aconst_null
    //   487: astore 6
    //   489: iload 26
    //   491: iflt +647 -> 1138
    //   494: lload_2
    //   495: getstatic 98	com/tencent/mm/sdk/platformtools/ct:iGf	J
    //   498: lsub
    //   499: lstore 27
    //   501: lload 27
    //   503: putstatic 79	com/tencent/mm/sdk/platformtools/ct:iGn	J
    //   506: lload 13
    //   508: getstatic 100	com/tencent/mm/sdk/platformtools/ct:iGg	J
    //   511: lcmp
    //   512: istore 29
    //   514: aconst_null
    //   515: astore 6
    //   517: iload 29
    //   519: iflt +625 -> 1144
    //   522: lload 13
    //   524: getstatic 100	com/tencent/mm/sdk/platformtools/ct:iGg	J
    //   527: lsub
    //   528: lstore 30
    //   530: lload 30
    //   532: putstatic 70	com/tencent/mm/sdk/platformtools/ct:iGo	J
    //   535: lload 11
    //   537: getstatic 102	com/tencent/mm/sdk/platformtools/ct:iGh	J
    //   540: lcmp
    //   541: istore 32
    //   543: aconst_null
    //   544: astore 6
    //   546: iload 32
    //   548: iflt +603 -> 1151
    //   551: lload 11
    //   553: getstatic 102	com/tencent/mm/sdk/platformtools/ct:iGh	J
    //   556: lsub
    //   557: lstore 33
    //   559: lload 33
    //   561: putstatic 73	com/tencent/mm/sdk/platformtools/ct:iGp	J
    //   564: lload_0
    //   565: putstatic 96	com/tencent/mm/sdk/platformtools/ct:iGe	J
    //   568: lload_2
    //   569: putstatic 98	com/tencent/mm/sdk/platformtools/ct:iGf	J
    //   572: lload 13
    //   574: putstatic 100	com/tencent/mm/sdk/platformtools/ct:iGg	J
    //   577: lload 11
    //   579: putstatic 102	com/tencent/mm/sdk/platformtools/ct:iGh	J
    //   582: aconst_null
    //   583: astore 4
    //   585: getstatic 66	com/tencent/mm/sdk/platformtools/ct:iGv	Ljava/io/File;
    //   588: ifnull +532 -> 1120
    //   591: invokestatic 183	android/os/Process:myUid	()I
    //   594: istore 35
    //   596: new 117	java/util/Scanner
    //   599: dup
    //   600: getstatic 66	com/tencent/mm/sdk/platformtools/ct:iGv	Ljava/io/File;
    //   603: invokespecial 120	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   606: astore 6
    //   608: aload 6
    //   610: invokevirtual 123	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   613: pop
    //   614: lconst_0
    //   615: lstore 37
    //   617: lconst_0
    //   618: lstore 39
    //   620: lconst_0
    //   621: lstore 41
    //   623: lconst_0
    //   624: lstore 43
    //   626: aload 6
    //   628: invokevirtual 126	java/util/Scanner:hasNext	()Z
    //   631: ifeq +106 -> 737
    //   634: aload 6
    //   636: invokevirtual 123	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   639: ldc 128
    //   641: invokevirtual 134	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   644: astore 53
    //   646: aload 53
    //   648: iconst_3
    //   649: aaload
    //   650: invokestatic 189	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   653: iload 35
    //   655: if_icmpne -29 -> 626
    //   658: aload 53
    //   660: iconst_1
    //   661: aaload
    //   662: astore 54
    //   664: aload 53
    //   666: iconst_5
    //   667: aaload
    //   668: invokestatic 155	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   671: lstore 55
    //   673: aload 53
    //   675: bipush 7
    //   677: aaload
    //   678: invokestatic 155	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   681: lstore 57
    //   683: aload 54
    //   685: ldc 145
    //   687: invokevirtual 149	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   690: ifeq +20 -> 710
    //   693: lload 41
    //   695: lload 55
    //   697: ladd
    //   698: lstore 41
    //   700: lload 43
    //   702: lload 57
    //   704: ladd
    //   705: lstore 43
    //   707: goto -81 -> 626
    //   710: aload 54
    //   712: ldc 139
    //   714: invokevirtual 143	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   717: ifne -91 -> 626
    //   720: lload 37
    //   722: lload 55
    //   724: ladd
    //   725: lstore 37
    //   727: lload 39
    //   729: lload 57
    //   731: ladd
    //   732: lstore 39
    //   734: goto -108 -> 626
    //   737: getstatic 104	com/tencent/mm/sdk/platformtools/ct:iGj	J
    //   740: lconst_0
    //   741: lcmp
    //   742: ifge +8 -> 750
    //   745: lload 41
    //   747: putstatic 104	com/tencent/mm/sdk/platformtools/ct:iGj	J
    //   750: getstatic 106	com/tencent/mm/sdk/platformtools/ct:iGi	J
    //   753: lconst_0
    //   754: lcmp
    //   755: ifge +8 -> 763
    //   758: lload 43
    //   760: putstatic 106	com/tencent/mm/sdk/platformtools/ct:iGi	J
    //   763: getstatic 108	com/tencent/mm/sdk/platformtools/ct:iGl	J
    //   766: lconst_0
    //   767: lcmp
    //   768: ifge +8 -> 776
    //   771: lload 37
    //   773: putstatic 108	com/tencent/mm/sdk/platformtools/ct:iGl	J
    //   776: getstatic 110	com/tencent/mm/sdk/platformtools/ct:iGk	J
    //   779: lconst_0
    //   780: lcmp
    //   781: ifge +8 -> 789
    //   784: lload 39
    //   786: putstatic 110	com/tencent/mm/sdk/platformtools/ct:iGk	J
    //   789: lload 43
    //   791: getstatic 106	com/tencent/mm/sdk/platformtools/ct:iGi	J
    //   794: lcmp
    //   795: iflt +211 -> 1006
    //   798: lload 43
    //   800: getstatic 106	com/tencent/mm/sdk/platformtools/ct:iGi	J
    //   803: lsub
    //   804: lstore 45
    //   806: lload 45
    //   808: putstatic 88	com/tencent/mm/sdk/platformtools/ct:iGq	J
    //   811: lload 41
    //   813: getstatic 104	com/tencent/mm/sdk/platformtools/ct:iGj	J
    //   816: lcmp
    //   817: iflt +196 -> 1013
    //   820: lload 41
    //   822: getstatic 104	com/tencent/mm/sdk/platformtools/ct:iGj	J
    //   825: lsub
    //   826: lstore 47
    //   828: lload 47
    //   830: putstatic 91	com/tencent/mm/sdk/platformtools/ct:iGr	J
    //   833: lload 39
    //   835: getstatic 110	com/tencent/mm/sdk/platformtools/ct:iGk	J
    //   838: lcmp
    //   839: iflt +181 -> 1020
    //   842: lload 39
    //   844: getstatic 110	com/tencent/mm/sdk/platformtools/ct:iGk	J
    //   847: lsub
    //   848: lstore 49
    //   850: lload 49
    //   852: putstatic 82	com/tencent/mm/sdk/platformtools/ct:iGs	J
    //   855: lload 37
    //   857: getstatic 108	com/tencent/mm/sdk/platformtools/ct:iGl	J
    //   860: lcmp
    //   861: iflt +166 -> 1027
    //   864: lload 37
    //   866: getstatic 108	com/tencent/mm/sdk/platformtools/ct:iGl	J
    //   869: lsub
    //   870: lstore 51
    //   872: lload 51
    //   874: putstatic 85	com/tencent/mm/sdk/platformtools/ct:iGt	J
    //   877: lload 43
    //   879: putstatic 106	com/tencent/mm/sdk/platformtools/ct:iGi	J
    //   882: lload 41
    //   884: putstatic 104	com/tencent/mm/sdk/platformtools/ct:iGj	J
    //   887: lload 39
    //   889: putstatic 110	com/tencent/mm/sdk/platformtools/ct:iGk	J
    //   892: lload 37
    //   894: putstatic 108	com/tencent/mm/sdk/platformtools/ct:iGl	J
    //   897: aload 6
    //   899: ifnull +8 -> 907
    //   902: aload 6
    //   904: invokevirtual 158	java/util/Scanner:close	()V
    //   907: bipush 8
    //   909: anewarray 4	java/lang/Object
    //   912: astore 8
    //   914: aload 8
    //   916: iconst_0
    //   917: getstatic 73	com/tencent/mm/sdk/platformtools/ct:iGp	J
    //   920: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   923: aastore
    //   924: aload 8
    //   926: iconst_1
    //   927: getstatic 70	com/tencent/mm/sdk/platformtools/ct:iGo	J
    //   930: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   933: aastore
    //   934: aload 8
    //   936: iconst_2
    //   937: getstatic 79	com/tencent/mm/sdk/platformtools/ct:iGn	J
    //   940: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   943: aastore
    //   944: aload 8
    //   946: iconst_3
    //   947: getstatic 76	com/tencent/mm/sdk/platformtools/ct:iGm	J
    //   950: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   953: aastore
    //   954: aload 8
    //   956: iconst_4
    //   957: getstatic 85	com/tencent/mm/sdk/platformtools/ct:iGt	J
    //   960: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   963: aastore
    //   964: aload 8
    //   966: iconst_5
    //   967: getstatic 82	com/tencent/mm/sdk/platformtools/ct:iGs	J
    //   970: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   973: aastore
    //   974: aload 8
    //   976: bipush 6
    //   978: getstatic 91	com/tencent/mm/sdk/platformtools/ct:iGr	J
    //   981: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   984: aastore
    //   985: aload 8
    //   987: bipush 7
    //   989: getstatic 88	com/tencent/mm/sdk/platformtools/ct:iGq	J
    //   992: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   995: aastore
    //   996: ldc 164
    //   998: ldc 191
    //   1000: aload 8
    //   1002: invokestatic 194	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1005: return
    //   1006: lload 43
    //   1008: lstore 45
    //   1010: goto -204 -> 806
    //   1013: lload 41
    //   1015: lstore 47
    //   1017: goto -189 -> 828
    //   1020: lload 39
    //   1022: lstore 49
    //   1024: goto -174 -> 850
    //   1027: lload 37
    //   1029: lstore 51
    //   1031: goto -159 -> 872
    //   1034: astore 7
    //   1036: ldc 164
    //   1038: aload 7
    //   1040: ldc 196
    //   1042: iconst_0
    //   1043: anewarray 4	java/lang/Object
    //   1046: invokestatic 200	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1049: aload 4
    //   1051: ifnull -144 -> 907
    //   1054: aload 4
    //   1056: invokevirtual 158	java/util/Scanner:close	()V
    //   1059: goto -152 -> 907
    //   1062: astore 5
    //   1064: aconst_null
    //   1065: astore 6
    //   1067: aload 6
    //   1069: ifnull +8 -> 1077
    //   1072: aload 6
    //   1074: invokevirtual 158	java/util/Scanner:close	()V
    //   1077: aload 5
    //   1079: athrow
    //   1080: astore 5
    //   1082: goto -15 -> 1067
    //   1085: astore 5
    //   1087: aload 4
    //   1089: astore 6
    //   1091: goto -24 -> 1067
    //   1094: astore 7
    //   1096: aload 6
    //   1098: astore 4
    //   1100: goto -64 -> 1036
    //   1103: astore 7
    //   1105: aconst_null
    //   1106: astore 4
    //   1108: goto -72 -> 1036
    //   1111: astore 7
    //   1113: aload 6
    //   1115: astore 4
    //   1117: goto -81 -> 1036
    //   1120: aconst_null
    //   1121: astore 6
    //   1123: goto -226 -> 897
    //   1126: iconst_0
    //   1127: istore 62
    //   1129: goto -1053 -> 76
    //   1132: lload_0
    //   1133: lstore 24
    //   1135: goto -661 -> 474
    //   1138: lload_2
    //   1139: lstore 27
    //   1141: goto -640 -> 501
    //   1144: lload 13
    //   1146: lstore 30
    //   1148: goto -618 -> 530
    //   1151: lload 11
    //   1153: lstore 33
    //   1155: goto -596 -> 559
    //
    // Exception table:
    //   from	to	target	type
    //   7	25	1034	java/lang/Exception
    //   585	608	1034	java/lang/Exception
    //   7	25	1062	finally
    //   585	608	1062	finally
    //   25	37	1080	finally
    //   43	73	1080	finally
    //   76	130	1080	finally
    //   130	191	1080	finally
    //   194	199	1080	finally
    //   202	209	1080	finally
    //   217	244	1080	finally
    //   244	251	1080	finally
    //   259	286	1080	finally
    //   286	293	1080	finally
    //   301	330	1080	finally
    //   330	337	1080	finally
    //   345	374	1080	finally
    //   374	413	1080	finally
    //   413	452	1080	finally
    //   452	459	1080	finally
    //   467	474	1080	finally
    //   474	486	1080	finally
    //   494	501	1080	finally
    //   501	514	1080	finally
    //   522	530	1080	finally
    //   530	543	1080	finally
    //   551	559	1080	finally
    //   559	582	1080	finally
    //   608	614	1080	finally
    //   626	693	1080	finally
    //   710	720	1080	finally
    //   737	750	1080	finally
    //   750	763	1080	finally
    //   763	776	1080	finally
    //   776	789	1080	finally
    //   789	806	1080	finally
    //   806	828	1080	finally
    //   828	850	1080	finally
    //   850	872	1080	finally
    //   872	897	1080	finally
    //   1036	1049	1085	finally
    //   25	37	1094	java/lang/Exception
    //   43	73	1094	java/lang/Exception
    //   76	130	1094	java/lang/Exception
    //   130	191	1094	java/lang/Exception
    //   194	199	1094	java/lang/Exception
    //   202	209	1103	java/lang/Exception
    //   217	244	1103	java/lang/Exception
    //   244	251	1103	java/lang/Exception
    //   259	286	1103	java/lang/Exception
    //   286	293	1103	java/lang/Exception
    //   301	330	1103	java/lang/Exception
    //   330	337	1103	java/lang/Exception
    //   345	374	1103	java/lang/Exception
    //   374	413	1103	java/lang/Exception
    //   413	452	1103	java/lang/Exception
    //   452	459	1103	java/lang/Exception
    //   467	474	1103	java/lang/Exception
    //   474	486	1103	java/lang/Exception
    //   494	501	1103	java/lang/Exception
    //   501	514	1103	java/lang/Exception
    //   522	530	1103	java/lang/Exception
    //   530	543	1103	java/lang/Exception
    //   551	559	1103	java/lang/Exception
    //   559	582	1103	java/lang/Exception
    //   608	614	1111	java/lang/Exception
    //   626	693	1111	java/lang/Exception
    //   710	720	1111	java/lang/Exception
    //   737	750	1111	java/lang/Exception
    //   750	763	1111	java/lang/Exception
    //   763	776	1111	java/lang/Exception
    //   776	789	1111	java/lang/Exception
    //   789	806	1111	java/lang/Exception
    //   806	828	1111	java/lang/Exception
    //   828	850	1111	java/lang/Exception
    //   850	872	1111	java/lang/Exception
    //   872	897	1111	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ct
 * JD-Core Version:    0.6.2
 */