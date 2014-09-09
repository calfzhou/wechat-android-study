package com.tencent.mm.compatible.g;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class o
{
  public static String dOY = "/data/data/com.tencent.mm/AssetsLibs/";
  private static final String[] dOZ = { "libvoipCodec_v7a.so" };
  private static final HashMap dPa = new HashMap();
  private static AtomicInteger dPb = new AtomicInteger(0);

  // ERROR //
  public static void a(String paramString, ClassLoader paramClassLoader)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 55	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   4: ifne +7 -> 11
    //   7: aload_1
    //   8: ifnonnull +869 -> 877
    //   11: iconst_1
    //   12: istore_2
    //   13: ldc 57
    //   15: iload_2
    //   16: invokestatic 63	junit/framework/Assert:assertFalse	(Ljava/lang/String;Z)V
    //   19: getstatic 38	com/tencent/mm/compatible/g/o:dPb	Ljava/util/concurrent/atomic/AtomicInteger;
    //   22: invokevirtual 67	java/util/concurrent/atomic/AtomicInteger:getAndIncrement	()I
    //   25: pop
    //   26: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   29: astore 4
    //   31: aload 4
    //   33: monitorenter
    //   34: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   37: aload_0
    //   38: invokevirtual 71	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   41: checkcast 73	java/lang/ref/WeakReference
    //   44: astore 6
    //   46: aload 6
    //   48: ifnull +823 -> 871
    //   51: aload 6
    //   53: invokevirtual 76	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   56: checkcast 78	java/lang/ClassLoader
    //   59: astore 7
    //   61: aload 7
    //   63: ifnull +57 -> 120
    //   66: aload 7
    //   68: aload_1
    //   69: if_acmpne +14 -> 83
    //   72: getstatic 38	com/tencent/mm/compatible/g/o:dPb	Ljava/util/concurrent/atomic/AtomicInteger;
    //   75: invokevirtual 81	java/util/concurrent/atomic/AtomicInteger:getAndDecrement	()I
    //   78: pop
    //   79: aload 4
    //   81: monitorexit
    //   82: return
    //   83: new 47	java/lang/UnsatisfiedLinkError
    //   86: dup
    //   87: new 83	java/lang/StringBuilder
    //   90: dup
    //   91: ldc 85
    //   93: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   96: aload_0
    //   97: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: ldc 94
    //   102: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   111: athrow
    //   112: astore 5
    //   114: aload 4
    //   116: monitorexit
    //   117: aload 5
    //   119: athrow
    //   120: aload 4
    //   122: monitorexit
    //   123: invokestatic 105	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   126: astore 8
    //   128: aload 8
    //   130: ifnonnull +122 -> 252
    //   133: aload_0
    //   134: aload_1
    //   135: invokestatic 108	com/tencent/mm/compatible/g/o:c	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   138: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   141: astore 39
    //   143: aload 39
    //   145: monitorenter
    //   146: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   149: aload_0
    //   150: new 73	java/lang/ref/WeakReference
    //   153: dup
    //   154: aload_1
    //   155: invokespecial 111	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   158: invokevirtual 115	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: aload 39
    //   164: monitorexit
    //   165: getstatic 38	com/tencent/mm/compatible/g/o:dPb	Ljava/util/concurrent/atomic/AtomicInteger;
    //   168: invokevirtual 81	java/util/concurrent/atomic/AtomicInteger:getAndDecrement	()I
    //   171: pop
    //   172: return
    //   173: astore 38
    //   175: new 47	java/lang/UnsatisfiedLinkError
    //   178: dup
    //   179: new 83	java/lang/StringBuilder
    //   182: dup
    //   183: ldc 117
    //   185: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   188: aload_0
    //   189: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   198: aload 38
    //   200: invokevirtual 121	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   203: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   206: checkcast 47	java/lang/UnsatisfiedLinkError
    //   209: athrow
    //   210: astore 40
    //   212: aload 39
    //   214: monitorexit
    //   215: aload 40
    //   217: athrow
    //   218: astore 37
    //   220: new 47	java/lang/UnsatisfiedLinkError
    //   223: dup
    //   224: new 83	java/lang/StringBuilder
    //   227: dup
    //   228: ldc 117
    //   230: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   233: aload_0
    //   234: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   240: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   243: aload 37
    //   245: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   248: checkcast 47	java/lang/UnsatisfiedLinkError
    //   251: athrow
    //   252: new 127	java/io/File
    //   255: dup
    //   256: aload 8
    //   258: ldc 129
    //   260: iconst_0
    //   261: invokevirtual 135	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   264: new 83	java/lang/StringBuilder
    //   267: dup
    //   268: ldc 137
    //   270: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   273: aload_0
    //   274: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: ldc 139
    //   279: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: invokespecial 142	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   288: astore 9
    //   290: aload 9
    //   292: invokevirtual 146	java/io/File:isFile	()Z
    //   295: ifeq +570 -> 865
    //   298: aload 9
    //   300: invokevirtual 149	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   303: aload_1
    //   304: invokestatic 152	com/tencent/mm/compatible/g/o:b	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   307: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   310: astore 33
    //   312: aload 33
    //   314: monitorenter
    //   315: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   318: aload_0
    //   319: new 73	java/lang/ref/WeakReference
    //   322: dup
    //   323: aload_1
    //   324: invokespecial 111	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   327: invokevirtual 115	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   330: pop
    //   331: aload 33
    //   333: monitorexit
    //   334: getstatic 38	com/tencent/mm/compatible/g/o:dPb	Ljava/util/concurrent/atomic/AtomicInteger;
    //   337: invokevirtual 81	java/util/concurrent/atomic/AtomicInteger:getAndDecrement	()I
    //   340: pop
    //   341: return
    //   342: astore 31
    //   344: aload 9
    //   346: invokevirtual 155	java/io/File:delete	()Z
    //   349: pop
    //   350: aload 31
    //   352: astore 10
    //   354: aload_0
    //   355: aload_1
    //   356: invokestatic 108	com/tencent/mm/compatible/g/o:c	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   359: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   362: astore 25
    //   364: aload 25
    //   366: monitorenter
    //   367: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   370: aload_0
    //   371: new 73	java/lang/ref/WeakReference
    //   374: dup
    //   375: aload_1
    //   376: invokespecial 111	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   379: invokevirtual 115	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   382: pop
    //   383: aload 25
    //   385: monitorexit
    //   386: getstatic 38	com/tencent/mm/compatible/g/o:dPb	Ljava/util/concurrent/atomic/AtomicInteger;
    //   389: invokevirtual 81	java/util/concurrent/atomic/AtomicInteger:getAndDecrement	()I
    //   392: pop
    //   393: return
    //   394: astore 13
    //   396: aload 10
    //   398: ifnonnull +460 -> 858
    //   401: new 157	java/util/zip/ZipFile
    //   404: dup
    //   405: aload 8
    //   407: invokevirtual 161	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   410: getfield 166	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   413: invokespecial 167	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   416: astore 14
    //   418: aload 14
    //   420: aload_0
    //   421: invokestatic 171	com/tencent/mm/compatible/g/o:nP	()Ljava/util/List;
    //   424: aload 9
    //   426: invokestatic 174	com/tencent/mm/compatible/g/o:a	(Ljava/util/zip/ZipFile;Ljava/lang/String;Ljava/util/List;Ljava/io/File;)Z
    //   429: ifne +273 -> 702
    //   432: new 176	java/lang/RuntimeException
    //   435: dup
    //   436: new 83	java/lang/StringBuilder
    //   439: dup
    //   440: ldc 178
    //   442: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   445: aload_0
    //   446: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   452: invokespecial 179	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   455: athrow
    //   456: astore 17
    //   458: new 47	java/lang/UnsatisfiedLinkError
    //   461: dup
    //   462: ldc 181
    //   464: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   467: aload 17
    //   469: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   472: checkcast 47	java/lang/UnsatisfiedLinkError
    //   475: athrow
    //   476: astore 15
    //   478: aload 14
    //   480: ifnull +8 -> 488
    //   483: aload 14
    //   485: invokevirtual 184	java/util/zip/ZipFile:close	()V
    //   488: aload 15
    //   490: athrow
    //   491: astore 34
    //   493: aload 33
    //   495: monitorexit
    //   496: aload 34
    //   498: athrow
    //   499: astore 30
    //   501: aload 30
    //   503: invokevirtual 121	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   506: instanceof 47
    //   509: ifne +38 -> 547
    //   512: new 47	java/lang/UnsatisfiedLinkError
    //   515: dup
    //   516: new 83	java/lang/StringBuilder
    //   519: dup
    //   520: ldc 186
    //   522: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   525: aload_0
    //   526: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   529: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   532: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   535: aload 30
    //   537: invokevirtual 121	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   540: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   543: checkcast 47	java/lang/UnsatisfiedLinkError
    //   546: athrow
    //   547: aload 30
    //   549: invokevirtual 121	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   552: checkcast 47	java/lang/UnsatisfiedLinkError
    //   555: astore 31
    //   557: goto -213 -> 344
    //   560: astore 29
    //   562: new 47	java/lang/UnsatisfiedLinkError
    //   565: dup
    //   566: new 83	java/lang/StringBuilder
    //   569: dup
    //   570: ldc 186
    //   572: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   575: aload_0
    //   576: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   582: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   585: aload 29
    //   587: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   590: checkcast 47	java/lang/UnsatisfiedLinkError
    //   593: athrow
    //   594: astore 26
    //   596: aload 25
    //   598: monitorexit
    //   599: aload 26
    //   601: athrow
    //   602: astore 12
    //   604: aload 12
    //   606: invokevirtual 121	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   609: instanceof 47
    //   612: ifne +38 -> 650
    //   615: new 47	java/lang/UnsatisfiedLinkError
    //   618: dup
    //   619: new 83	java/lang/StringBuilder
    //   622: dup
    //   623: ldc 186
    //   625: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   628: aload_0
    //   629: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   632: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   635: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   638: aload 12
    //   640: invokevirtual 121	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   643: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   646: checkcast 47	java/lang/UnsatisfiedLinkError
    //   649: athrow
    //   650: aload 10
    //   652: ifnonnull +206 -> 858
    //   655: aload 12
    //   657: invokevirtual 121	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   660: checkcast 47	java/lang/UnsatisfiedLinkError
    //   663: astore 13
    //   665: goto -264 -> 401
    //   668: astore 11
    //   670: new 47	java/lang/UnsatisfiedLinkError
    //   673: dup
    //   674: new 83	java/lang/StringBuilder
    //   677: dup
    //   678: ldc 186
    //   680: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   683: aload_0
    //   684: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   687: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   690: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   693: aload 11
    //   695: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   698: checkcast 47	java/lang/UnsatisfiedLinkError
    //   701: athrow
    //   702: aload 14
    //   704: invokevirtual 184	java/util/zip/ZipFile:close	()V
    //   707: aload 9
    //   709: invokevirtual 149	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   712: aload_1
    //   713: invokestatic 152	com/tencent/mm/compatible/g/o:b	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   716: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   719: astore 21
    //   721: aload 21
    //   723: monitorenter
    //   724: getstatic 31	com/tencent/mm/compatible/g/o:dPa	Ljava/util/HashMap;
    //   727: aload_0
    //   728: new 73	java/lang/ref/WeakReference
    //   731: dup
    //   732: aload_1
    //   733: invokespecial 111	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   736: invokevirtual 115	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   739: pop
    //   740: aload 21
    //   742: monitorexit
    //   743: getstatic 38	com/tencent/mm/compatible/g/o:dPb	Ljava/util/concurrent/atomic/AtomicInteger;
    //   746: invokevirtual 81	java/util/concurrent/atomic/AtomicInteger:getAndDecrement	()I
    //   749: pop
    //   750: return
    //   751: astore 20
    //   753: aload 13
    //   755: ifnonnull +71 -> 826
    //   758: new 47	java/lang/UnsatisfiedLinkError
    //   761: dup
    //   762: new 83	java/lang/StringBuilder
    //   765: dup
    //   766: ldc 186
    //   768: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   771: aload_0
    //   772: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   775: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   778: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   781: aload 20
    //   783: invokevirtual 121	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   786: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   789: checkcast 47	java/lang/UnsatisfiedLinkError
    //   792: athrow
    //   793: astore 22
    //   795: aload 21
    //   797: monitorexit
    //   798: aload 22
    //   800: athrow
    //   801: astore 19
    //   803: aload 13
    //   805: ifnonnull +24 -> 829
    //   808: new 47	java/lang/UnsatisfiedLinkError
    //   811: dup
    //   812: ldc 181
    //   814: invokespecial 99	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   817: aload 19
    //   819: invokevirtual 125	java/lang/UnsatisfiedLinkError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   822: checkcast 47	java/lang/UnsatisfiedLinkError
    //   825: athrow
    //   826: aload 13
    //   828: athrow
    //   829: aload 13
    //   831: athrow
    //   832: astore 18
    //   834: goto -127 -> 707
    //   837: astore 16
    //   839: goto -351 -> 488
    //   842: astore 15
    //   844: aconst_null
    //   845: astore 14
    //   847: goto -369 -> 478
    //   850: astore 17
    //   852: aconst_null
    //   853: astore 14
    //   855: goto -397 -> 458
    //   858: aload 10
    //   860: astore 13
    //   862: goto -461 -> 401
    //   865: aconst_null
    //   866: astore 10
    //   868: goto -514 -> 354
    //   871: aconst_null
    //   872: astore 7
    //   874: goto -813 -> 61
    //   877: iconst_0
    //   878: istore_2
    //   879: goto -866 -> 13
    //
    // Exception table:
    //   from	to	target	type
    //   34	46	112	finally
    //   51	61	112	finally
    //   72	82	112	finally
    //   83	112	112	finally
    //   120	123	112	finally
    //   133	146	173	java/lang/reflect/InvocationTargetException
    //   165	172	173	java/lang/reflect/InvocationTargetException
    //   212	218	173	java/lang/reflect/InvocationTargetException
    //   146	165	210	finally
    //   133	146	218	java/lang/Exception
    //   165	172	218	java/lang/Exception
    //   212	218	218	java/lang/Exception
    //   298	315	342	java/lang/UnsatisfiedLinkError
    //   334	341	342	java/lang/UnsatisfiedLinkError
    //   493	499	342	java/lang/UnsatisfiedLinkError
    //   354	367	394	java/lang/UnsatisfiedLinkError
    //   386	393	394	java/lang/UnsatisfiedLinkError
    //   596	602	394	java/lang/UnsatisfiedLinkError
    //   418	456	456	java/lang/Exception
    //   418	456	476	finally
    //   458	476	476	finally
    //   315	334	491	finally
    //   298	315	499	java/lang/reflect/InvocationTargetException
    //   334	341	499	java/lang/reflect/InvocationTargetException
    //   493	499	499	java/lang/reflect/InvocationTargetException
    //   298	315	560	java/lang/Exception
    //   334	341	560	java/lang/Exception
    //   493	499	560	java/lang/Exception
    //   367	386	594	finally
    //   354	367	602	java/lang/reflect/InvocationTargetException
    //   386	393	602	java/lang/reflect/InvocationTargetException
    //   596	602	602	java/lang/reflect/InvocationTargetException
    //   354	367	668	java/lang/Exception
    //   386	393	668	java/lang/Exception
    //   596	602	668	java/lang/Exception
    //   707	724	751	java/lang/reflect/InvocationTargetException
    //   743	750	751	java/lang/reflect/InvocationTargetException
    //   795	801	751	java/lang/reflect/InvocationTargetException
    //   724	743	793	finally
    //   707	724	801	java/lang/Exception
    //   743	750	801	java/lang/Exception
    //   795	801	801	java/lang/Exception
    //   702	707	832	java/io/IOException
    //   483	488	837	java/io/IOException
    //   401	418	842	finally
    //   401	418	850	java/lang/Exception
  }

  private static boolean a(ZipFile paramZipFile, String paramString, List paramList, File paramFile)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ZipEntry localZipEntry = paramZipFile.getEntry("lib/" + str + "/lib" + paramString + ".so");
      if (localZipEntry != null)
      {
        InputStream localInputStream = paramZipFile.getInputStream(localZipEntry);
        FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
        byte[] arrayOfByte = new byte[2048];
        try
        {
          while (true)
          {
            int i = localInputStream.read(arrayOfByte, 0, 2048);
            if (i == -1)
              break;
            localFileOutputStream.write(arrayOfByte, 0, i);
          }
        }
        finally
        {
          localInputStream.close();
          localFileOutputStream.close();
        }
        localInputStream.close();
        localFileOutputStream.close();
        return true;
      }
    }
    return false;
  }

  private static void b(String paramString, ClassLoader paramClassLoader)
  {
    Runtime localRuntime = Runtime.getRuntime();
    Method localMethod = localRuntime.getClass().getDeclaredMethod("load", new Class[] { String.class, ClassLoader.class });
    localMethod.setAccessible(true);
    localMethod.invoke(localRuntime, new Object[] { paramString, paramClassLoader });
  }

  private static void c(String paramString, ClassLoader paramClassLoader)
  {
    Runtime localRuntime = Runtime.getRuntime();
    Method localMethod = localRuntime.getClass().getDeclaredMethod("loadLibrary", new Class[] { String.class, ClassLoader.class });
    localMethod.setAccessible(true);
    localMethod.invoke(localRuntime, new Object[] { paramString, paramClassLoader });
  }

  public static String cI(String paramString)
  {
    try
    {
      ClassLoader localClassLoader = o.class.getClassLoader();
      Method localMethod = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[] { String.class });
      localMethod.setAccessible(true);
      str = (String)localMethod.invoke(localClassLoader, new Object[] { paramString });
      if (str == null)
      {
        File localFile = new File(ak.getContext().getDir("recover_lib", 0), "lib" + paramString + ".so");
        if (localFile.canRead())
          str = localFile.getAbsolutePath();
      }
      return str;
    }
    catch (Exception localException)
    {
      while (true)
        String str = null;
    }
  }

  private static List nP()
  {
    ArrayList localArrayList = new ArrayList(3);
    Method localMethod = Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class });
    String str1 = (String)localMethod.invoke(null, new Object[] { "ro.product.cpu.abi" });
    if ((str1 != null) && (str1.length() > 0))
      localArrayList.add(str1);
    String str2 = (String)localMethod.invoke(null, new Object[] { "ro.product.cpu.abi2" });
    if ((str2 != null) && (str2.length() > 0))
      localArrayList.add(str2);
    localArrayList.add("armeabi");
    return localArrayList;
  }

  public static void nQ()
  {
    Thread.setDefaultUncaughtExceptionHandler(new p(Thread.getDefaultUncaughtExceptionHandler()));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.o
 * JD-Core Version:    0.6.2
 */