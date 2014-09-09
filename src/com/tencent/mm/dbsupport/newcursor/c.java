package com.tencent.mm.dbsupport.newcursor;

import java.io.PrintStream;
import java.util.ArrayList;

public final class c
{
  // ERROR //
  public static boolean a(com.tencent.kingkong.database.SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, java.util.List paramList1, java.util.List paramList2, d paramd, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: invokevirtual 18	com/tencent/kingkong/database/SQLiteDatabase:isOpen	()Z
    //   8: ifne +12 -> 20
    //   11: ldc 20
    //   13: ldc 22
    //   15: invokestatic 28	com/tencent/kingkong/support/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: iconst_0
    //   19: ireturn
    //   20: aload_1
    //   21: aload_2
    //   22: aload_3
    //   23: invokestatic 34	com/tencent/mm/dbsupport/newcursor/ShellUtil:dbDump	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    //   26: ifne +5 -> 31
    //   29: iconst_0
    //   30: ireturn
    //   31: new 36	java/io/FileReader
    //   34: dup
    //   35: new 38	java/io/File
    //   38: dup
    //   39: aload_3
    //   40: invokespecial 42	java/io/File:<init>	(Ljava/lang/String;)V
    //   43: invokespecial 45	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   46: astore 8
    //   48: new 47	java/io/BufferedReader
    //   51: dup
    //   52: aload 8
    //   54: invokespecial 50	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   57: astore 9
    //   59: aload_0
    //   60: ldc 52
    //   62: invokevirtual 55	com/tencent/kingkong/database/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   65: aload_0
    //   66: invokevirtual 59	com/tencent/kingkong/database/SQLiteDatabase:beginTransaction	()V
    //   69: iconst_0
    //   70: istore 10
    //   72: new 61	java/util/HashMap
    //   75: dup
    //   76: invokespecial 63	java/util/HashMap:<init>	()V
    //   79: astore 11
    //   81: aconst_null
    //   82: astore 12
    //   84: iconst_0
    //   85: istore 13
    //   87: iconst_0
    //   88: istore 14
    //   90: iconst_0
    //   91: istore 15
    //   93: aload 9
    //   95: invokevirtual 67	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   98: astore 20
    //   100: aload 20
    //   102: astore 21
    //   104: aload 21
    //   106: ifnonnull +136 -> 242
    //   109: aload 9
    //   111: invokevirtual 70	java/io/BufferedReader:close	()V
    //   114: iload 13
    //   116: iload 14
    //   118: if_icmple +678 -> 796
    //   121: aload_0
    //   122: invokevirtual 73	com/tencent/kingkong/database/SQLiteDatabase:inTransaction	()Z
    //   125: ifeq +7 -> 132
    //   128: aload_0
    //   129: invokevirtual 76	com/tencent/kingkong/database/SQLiteDatabase:setTransactionSuccessful	()V
    //   132: aload_0
    //   133: invokevirtual 73	com/tencent/kingkong/database/SQLiteDatabase:inTransaction	()Z
    //   136: ifeq +7 -> 143
    //   139: aload_0
    //   140: invokevirtual 79	com/tencent/kingkong/database/SQLiteDatabase:endTransaction	()V
    //   143: iload 7
    //   145: ifeq +51 -> 196
    //   148: new 38	java/io/File
    //   151: dup
    //   152: aload_3
    //   153: invokespecial 42	java/io/File:<init>	(Ljava/lang/String;)V
    //   156: astore 41
    //   158: aload 41
    //   160: invokevirtual 82	java/io/File:exists	()Z
    //   163: ifeq +9 -> 172
    //   166: aload 41
    //   168: invokevirtual 85	java/io/File:delete	()Z
    //   171: pop
    //   172: new 38	java/io/File
    //   175: dup
    //   176: aload_1
    //   177: invokespecial 42	java/io/File:<init>	(Ljava/lang/String;)V
    //   180: astore 42
    //   182: aload 42
    //   184: invokevirtual 82	java/io/File:exists	()Z
    //   187: ifeq +9 -> 196
    //   190: aload 42
    //   192: invokevirtual 85	java/io/File:delete	()Z
    //   195: pop
    //   196: iconst_2
    //   197: anewarray 4	java/lang/Object
    //   200: astore 43
    //   202: aload 43
    //   204: iconst_0
    //   205: iload 13
    //   207: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   210: aastore
    //   211: aload 43
    //   213: iconst_1
    //   214: iload 14
    //   216: invokestatic 91	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   219: aastore
    //   220: ldc 20
    //   222: ldc 93
    //   224: aload 43
    //   226: invokestatic 97	com/tencent/kingkong/support/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: iconst_1
    //   230: ireturn
    //   231: astore 46
    //   233: ldc 20
    //   235: ldc 99
    //   237: invokestatic 28	com/tencent/kingkong/support/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   240: iconst_0
    //   241: ireturn
    //   242: iload 15
    //   244: ifeq +55 -> 299
    //   247: new 101	java/lang/StringBuilder
    //   250: dup
    //   251: aload 12
    //   253: invokestatic 106	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   256: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   259: ldc 109
    //   261: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: aload 21
    //   266: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: astore 39
    //   274: aload 39
    //   276: ldc 118
    //   278: invokevirtual 122	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   281: ifeq +564 -> 845
    //   284: aload 39
    //   286: invokestatic 125	com/tencent/mm/dbsupport/newcursor/ShellUtil:isSqlComplete	(Ljava/lang/String;)Z
    //   289: ifne +549 -> 838
    //   292: aload 39
    //   294: astore 12
    //   296: goto -203 -> 93
    //   299: aload 21
    //   301: ldc 127
    //   303: invokevirtual 130	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   306: ifne +13 -> 319
    //   309: aload 21
    //   311: ldc 132
    //   313: invokevirtual 130	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   316: ifeq -223 -> 93
    //   319: aload 21
    //   321: ldc 118
    //   323: invokevirtual 122	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   326: ifeq +11 -> 337
    //   329: aload 21
    //   331: invokestatic 125	com/tencent/mm/dbsupport/newcursor/ShellUtil:isSqlComplete	(Ljava/lang/String;)Z
    //   334: ifne +528 -> 862
    //   337: aload 12
    //   339: invokestatic 138	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   342: ifeq +6 -> 348
    //   345: goto +507 -> 852
    //   348: new 101	java/lang/StringBuilder
    //   351: dup
    //   352: aload 12
    //   354: invokestatic 106	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   357: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   360: ldc 109
    //   362: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: aload 21
    //   367: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: astore 21
    //   375: goto +477 -> 852
    //   378: aload 5
    //   380: ifnull +117 -> 497
    //   383: aload 5
    //   385: invokeinterface 144 1 0
    //   390: ifle +107 -> 497
    //   393: aload 22
    //   395: invokestatic 148	com/tencent/mm/dbsupport/newcursor/c:iK	(Ljava/lang/String;)Ljava/lang/String;
    //   398: astore 24
    //   400: aload 5
    //   402: invokeinterface 152 1 0
    //   407: astore 38
    //   409: aload 38
    //   411: invokeinterface 157 1 0
    //   416: ifne +53 -> 469
    //   419: iconst_1
    //   420: istore 23
    //   422: aload 22
    //   424: astore 12
    //   426: iload 23
    //   428: ifeq +148 -> 576
    //   431: ldc 20
    //   433: ldc 159
    //   435: iconst_1
    //   436: anewarray 4	java/lang/Object
    //   439: dup
    //   440: iconst_0
    //   441: aload 24
    //   443: aastore
    //   444: invokestatic 97	com/tencent/kingkong/support/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   447: iconst_0
    //   448: istore 15
    //   450: goto -357 -> 93
    //   453: astore 18
    //   455: ldc 20
    //   457: ldc 161
    //   459: invokestatic 28	com/tencent/kingkong/support/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   462: aload 9
    //   464: invokevirtual 70	java/io/BufferedReader:close	()V
    //   467: iconst_0
    //   468: ireturn
    //   469: aload 24
    //   471: aload 38
    //   473: invokeinterface 165 1 0
    //   478: checkcast 103	java/lang/String
    //   481: invokevirtual 169	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   484: ifeq -75 -> 409
    //   487: aload 22
    //   489: astore 12
    //   491: iconst_0
    //   492: istore 23
    //   494: goto -68 -> 426
    //   497: aload 4
    //   499: ifnull +326 -> 825
    //   502: aload 4
    //   504: invokeinterface 144 1 0
    //   509: ifle +316 -> 825
    //   512: aload 22
    //   514: invokestatic 148	com/tencent/mm/dbsupport/newcursor/c:iK	(Ljava/lang/String;)Ljava/lang/String;
    //   517: astore 24
    //   519: aload 4
    //   521: invokeinterface 152 1 0
    //   526: astore 37
    //   528: aload 37
    //   530: invokeinterface 157 1 0
    //   535: ifne +13 -> 548
    //   538: aload 22
    //   540: astore 12
    //   542: iconst_0
    //   543: istore 23
    //   545: goto -119 -> 426
    //   548: aload 24
    //   550: aload 37
    //   552: invokeinterface 165 1 0
    //   557: checkcast 103	java/lang/String
    //   560: invokevirtual 169	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   563: ifeq -35 -> 528
    //   566: iconst_1
    //   567: istore 23
    //   569: ldc 171
    //   571: astore 12
    //   573: goto -147 -> 426
    //   576: aload 12
    //   578: ldc 132
    //   580: invokevirtual 130	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   583: ifeq +96 -> 679
    //   586: aload 11
    //   588: aload 24
    //   590: aload 12
    //   592: invokestatic 175	com/tencent/mm/dbsupport/newcursor/c:iL	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   595: invokestatic 179	com/tencent/mm/dbsupport/newcursor/c:c	(Ljava/util/ArrayList;)Ljava/lang/String;
    //   598: invokevirtual 183	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   601: pop
    //   602: aload 12
    //   604: astore 27
    //   606: aload 6
    //   608: ifnull +11 -> 619
    //   611: aload 6
    //   613: invokeinterface 188 1 0
    //   618: pop
    //   619: aconst_null
    //   620: invokestatic 138	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   623: ifne +6 -> 629
    //   626: aconst_null
    //   627: astore 27
    //   629: iinc 13 1
    //   632: aload_0
    //   633: aload 27
    //   635: invokevirtual 55	com/tencent/kingkong/database/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   638: iload 10
    //   640: iconst_1
    //   641: iadd
    //   642: istore 26
    //   644: iload 26
    //   646: bipush 100
    //   648: if_icmplt +18 -> 666
    //   651: aload_0
    //   652: invokevirtual 76	com/tencent/kingkong/database/SQLiteDatabase:setTransactionSuccessful	()V
    //   655: aload_0
    //   656: invokevirtual 79	com/tencent/kingkong/database/SQLiteDatabase:endTransaction	()V
    //   659: aload_0
    //   660: invokevirtual 59	com/tencent/kingkong/database/SQLiteDatabase:beginTransaction	()V
    //   663: iconst_0
    //   664: istore 26
    //   666: iload 26
    //   668: istore 10
    //   670: iconst_0
    //   671: istore 15
    //   673: aconst_null
    //   674: astore 12
    //   676: goto -583 -> 93
    //   679: aload 12
    //   681: ldc 190
    //   683: invokevirtual 130	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   686: ifeq +132 -> 818
    //   689: aload 11
    //   691: aload 24
    //   693: invokevirtual 194	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   696: checkcast 103	java/lang/String
    //   699: astore 30
    //   701: aload 30
    //   703: invokestatic 138	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   706: ifne +112 -> 818
    //   709: new 101	java/lang/StringBuilder
    //   712: dup
    //   713: ldc 196
    //   715: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   718: astore 31
    //   720: aload 31
    //   722: ldc 198
    //   724: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: aload 24
    //   729: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   732: ldc 198
    //   734: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   737: pop
    //   738: aload 31
    //   740: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   743: astore 33
    //   745: aload 31
    //   747: aload 30
    //   749: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   752: pop
    //   753: aload 12
    //   755: aload 33
    //   757: aload 31
    //   759: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   762: invokevirtual 202	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   765: astore 35
    //   767: aload 35
    //   769: astore 27
    //   771: goto -165 -> 606
    //   774: astore 25
    //   776: iload 10
    //   778: istore 26
    //   780: iinc 14 1
    //   783: goto -117 -> 666
    //   786: astore 16
    //   788: aload 9
    //   790: invokevirtual 70	java/io/BufferedReader:close	()V
    //   793: aload 16
    //   795: athrow
    //   796: iconst_0
    //   797: ireturn
    //   798: astore 19
    //   800: goto -333 -> 467
    //   803: astore 17
    //   805: goto -12 -> 793
    //   808: astore 40
    //   810: goto -696 -> 114
    //   813: astore 29
    //   815: goto -35 -> 780
    //   818: aload 12
    //   820: astore 27
    //   822: goto -216 -> 606
    //   825: aload 22
    //   827: astore 12
    //   829: iconst_0
    //   830: istore 23
    //   832: aconst_null
    //   833: astore 24
    //   835: goto -409 -> 426
    //   838: aload 39
    //   840: astore 22
    //   842: goto -464 -> 378
    //   845: aload 39
    //   847: astore 12
    //   849: goto -756 -> 93
    //   852: iconst_1
    //   853: istore 15
    //   855: aload 21
    //   857: astore 12
    //   859: goto -766 -> 93
    //   862: aload 21
    //   864: astore 22
    //   866: goto -488 -> 378
    //
    // Exception table:
    //   from	to	target	type
    //   31	48	231	java/io/FileNotFoundException
    //   72	81	453	java/io/IOException
    //   93	100	453	java/io/IOException
    //   247	292	453	java/io/IOException
    //   299	319	453	java/io/IOException
    //   319	337	453	java/io/IOException
    //   337	345	453	java/io/IOException
    //   348	375	453	java/io/IOException
    //   383	409	453	java/io/IOException
    //   409	419	453	java/io/IOException
    //   431	447	453	java/io/IOException
    //   469	487	453	java/io/IOException
    //   502	528	453	java/io/IOException
    //   528	538	453	java/io/IOException
    //   548	566	453	java/io/IOException
    //   576	602	453	java/io/IOException
    //   611	619	453	java/io/IOException
    //   619	626	453	java/io/IOException
    //   632	638	453	java/io/IOException
    //   651	663	453	java/io/IOException
    //   679	767	453	java/io/IOException
    //   576	602	774	java/lang/Exception
    //   611	619	774	java/lang/Exception
    //   619	626	774	java/lang/Exception
    //   632	638	774	java/lang/Exception
    //   679	767	774	java/lang/Exception
    //   72	81	786	finally
    //   93	100	786	finally
    //   247	292	786	finally
    //   299	319	786	finally
    //   319	337	786	finally
    //   337	345	786	finally
    //   348	375	786	finally
    //   383	409	786	finally
    //   409	419	786	finally
    //   431	447	786	finally
    //   455	462	786	finally
    //   469	487	786	finally
    //   502	528	786	finally
    //   528	538	786	finally
    //   548	566	786	finally
    //   576	602	786	finally
    //   611	619	786	finally
    //   619	626	786	finally
    //   632	638	786	finally
    //   651	663	786	finally
    //   679	767	786	finally
    //   462	467	798	java/io/IOException
    //   788	793	803	java/io/IOException
    //   109	114	808	java/io/IOException
    //   651	663	813	java/lang/Exception
  }

  private static String c(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayList.size())
      {
        localStringBuilder.append(")");
        String str = localStringBuilder.toString();
        System.out.println(str);
        return str;
      }
      localStringBuilder.append((String)paramArrayList.get(i));
      if (i != -1 + paramArrayList.size())
        localStringBuilder.append(",");
    }
  }

  private static String iK(String paramString)
  {
    if (paramString.length() > 100)
      paramString = paramString.substring(0, 100);
    String[] arrayOfString = paramString.split("\\s");
    if ((arrayOfString != null) && (arrayOfString.length > 1))
      return arrayOfString[2].replaceAll("\"", "");
    return null;
  }

  private static ArrayList iL(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = paramString.substring(1 + paramString.indexOf("("), paramString.lastIndexOf(")")).trim().split(",");
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfString.length)
        return localArrayList;
      arrayOfString[i] = arrayOfString[i].trim();
      int j = arrayOfString[i].indexOf(" ");
      localArrayList.add(arrayOfString[i].substring(0, j));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.c
 * JD-Core Version:    0.6.2
 */