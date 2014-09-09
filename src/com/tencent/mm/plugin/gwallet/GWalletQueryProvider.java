package com.tencent.mm.plugin.gwallet;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;

public class GWalletQueryProvider extends ContentProvider
{
  public static final String[] cY = { "_id", "product_id", "full_price", "product_state" };
  private final String TAG = "!44@/B4Tb64lLpJlq3g3dssAoZZ5jyUwqm48qdJiAhkom5Q=";
  private b fdo = null;
  private boolean fdp;
  private boolean fdq;
  private ArrayList fdr;
  private ArrayList fds;
  private int fdt;
  private Context mContext = null;

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    z.d("!44@/B4Tb64lLpJlq3g3dssAoZZ5jyUwqm48qdJiAhkom5Q=", "successfully loaded");
    return true;
  }

  // ERROR //
  public android.database.Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 39
    //   5: ldc 97
    //   7: invokestatic 89	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   10: aload 4
    //   12: ifnull +9 -> 21
    //   15: aload 4
    //   17: arraylength
    //   18: ifne +28 -> 46
    //   21: ldc 39
    //   23: ldc 99
    //   25: invokestatic 89	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: new 101	java/lang/IllegalArgumentException
    //   31: dup
    //   32: ldc 99
    //   34: invokespecial 104	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   37: athrow
    //   38: astore 6
    //   40: ldc 2
    //   42: monitorexit
    //   43: aload 6
    //   45: athrow
    //   46: aload_0
    //   47: aload_0
    //   48: invokevirtual 108	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:getContext	()Landroid/content/Context;
    //   51: putfield 45	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:mContext	Landroid/content/Context;
    //   54: aload_0
    //   55: new 68	com/tencent/mm/plugin/gwallet/a/b
    //   58: dup
    //   59: aload_0
    //   60: getfield 45	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:mContext	Landroid/content/Context;
    //   63: invokespecial 111	com/tencent/mm/plugin/gwallet/a/b:<init>	(Landroid/content/Context;)V
    //   66: putfield 43	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdo	Lcom/tencent/mm/plugin/gwallet/a/b;
    //   69: aload_0
    //   70: iconst_1
    //   71: putfield 55	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdp	Z
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield 74	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdq	Z
    //   79: aload_0
    //   80: new 113	java/util/ArrayList
    //   83: dup
    //   84: invokespecial 114	java/util/ArrayList:<init>	()V
    //   87: putfield 62	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fds	Ljava/util/ArrayList;
    //   90: aload 4
    //   92: arraylength
    //   93: istore 7
    //   95: iconst_0
    //   96: istore 8
    //   98: iload 8
    //   100: iload 7
    //   102: if_icmpge +26 -> 128
    //   105: aload 4
    //   107: iload 8
    //   109: aaload
    //   110: astore 9
    //   112: aload_0
    //   113: getfield 62	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fds	Ljava/util/ArrayList;
    //   116: aload 9
    //   118: invokevirtual 118	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   121: pop
    //   122: iinc 8 1
    //   125: goto -27 -> 98
    //   128: ldc 39
    //   130: ldc 120
    //   132: invokestatic 89	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   135: aload_0
    //   136: getfield 43	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdo	Lcom/tencent/mm/plugin/gwallet/a/b;
    //   139: new 122	com/tencent/mm/plugin/gwallet/a
    //   142: dup
    //   143: aload_0
    //   144: invokespecial 123	com/tencent/mm/plugin/gwallet/a:<init>	(Lcom/tencent/mm/plugin/gwallet/GWalletQueryProvider;)V
    //   147: invokevirtual 126	com/tencent/mm/plugin/gwallet/a/b:a	(Lcom/tencent/mm/plugin/gwallet/a/h;)V
    //   150: lconst_0
    //   151: lstore 11
    //   153: lload 11
    //   155: ldc2_w 127
    //   158: lcmp
    //   159: ifgt +53 -> 212
    //   162: aload_0
    //   163: getfield 55	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdp	Z
    //   166: ifeq +46 -> 212
    //   169: aload_0
    //   170: getfield 74	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdq	Z
    //   173: istore 47
    //   175: iload 47
    //   177: ifne +35 -> 212
    //   180: ldc2_w 129
    //   183: invokestatic 136	java/lang/Thread:sleep	(J)V
    //   186: lload 11
    //   188: ldc2_w 129
    //   191: ladd
    //   192: lstore 11
    //   194: goto -41 -> 153
    //   197: astore 48
    //   199: ldc 39
    //   201: aload 48
    //   203: invokevirtual 140	java/lang/InterruptedException:toString	()Ljava/lang/String;
    //   206: invokestatic 142	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: goto -56 -> 153
    //   212: aload_0
    //   213: getfield 55	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdp	Z
    //   216: ifne +105 -> 321
    //   219: ldc 39
    //   221: ldc 144
    //   223: invokestatic 89	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   226: new 146	android/database/MatrixCursor
    //   229: dup
    //   230: getstatic 34	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:cY	[Ljava/lang/String;
    //   233: invokespecial 149	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   236: astore 43
    //   238: aload_0
    //   239: getfield 62	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fds	Ljava/util/ArrayList;
    //   242: invokevirtual 153	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   245: astore 44
    //   247: aload 44
    //   249: invokeinterface 158 1 0
    //   254: ifeq +61 -> 315
    //   257: aload 44
    //   259: invokeinterface 162 1 0
    //   264: checkcast 24	java/lang/String
    //   267: astore 45
    //   269: iconst_4
    //   270: anewarray 164	java/lang/Object
    //   273: astore 46
    //   275: aload 46
    //   277: iconst_0
    //   278: iconst_0
    //   279: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: aastore
    //   283: aload 46
    //   285: iconst_1
    //   286: aload 45
    //   288: aastore
    //   289: aload 46
    //   291: iconst_2
    //   292: ldc 172
    //   294: aastore
    //   295: aload 46
    //   297: iconst_3
    //   298: sipush 10234
    //   301: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   304: aastore
    //   305: aload 43
    //   307: aload 46
    //   309: invokevirtual 176	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   312: goto -65 -> 247
    //   315: ldc 2
    //   317: monitorexit
    //   318: aload 43
    //   320: areturn
    //   321: lload 11
    //   323: ldc2_w 127
    //   326: lcmp
    //   327: ifle +105 -> 432
    //   330: ldc 39
    //   332: ldc 178
    //   334: invokestatic 89	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   337: new 146	android/database/MatrixCursor
    //   340: dup
    //   341: getstatic 34	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:cY	[Ljava/lang/String;
    //   344: invokespecial 149	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   347: astore 13
    //   349: aload_0
    //   350: getfield 62	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fds	Ljava/util/ArrayList;
    //   353: invokevirtual 153	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   356: astore 14
    //   358: aload 14
    //   360: invokeinterface 158 1 0
    //   365: ifeq +61 -> 426
    //   368: aload 14
    //   370: invokeinterface 162 1 0
    //   375: checkcast 24	java/lang/String
    //   378: astore 15
    //   380: iconst_4
    //   381: anewarray 164	java/lang/Object
    //   384: astore 16
    //   386: aload 16
    //   388: iconst_0
    //   389: iconst_0
    //   390: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   393: aastore
    //   394: aload 16
    //   396: iconst_1
    //   397: aload 15
    //   399: aastore
    //   400: aload 16
    //   402: iconst_2
    //   403: ldc 172
    //   405: aastore
    //   406: aload 16
    //   408: iconst_3
    //   409: sipush 10235
    //   412: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   415: aastore
    //   416: aload 13
    //   418: aload 16
    //   420: invokevirtual 176	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   423: goto -65 -> 358
    //   426: ldc 2
    //   428: monitorexit
    //   429: aload 13
    //   431: areturn
    //   432: ldc 39
    //   434: ldc 180
    //   436: invokestatic 89	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   439: new 146	android/database/MatrixCursor
    //   442: dup
    //   443: getstatic 34	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:cY	[Ljava/lang/String;
    //   446: invokespecial 149	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   449: astore 17
    //   451: aload_0
    //   452: getfield 49	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdt	I
    //   455: ifne +278 -> 733
    //   458: aload_0
    //   459: getfield 52	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdr	Ljava/util/ArrayList;
    //   462: astore 21
    //   464: iconst_0
    //   465: istore 22
    //   467: aload 21
    //   469: ifnull +172 -> 641
    //   472: aload_0
    //   473: getfield 52	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fdr	Ljava/util/ArrayList;
    //   476: invokevirtual 153	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   479: astore 23
    //   481: iconst_0
    //   482: istore 24
    //   484: aload 23
    //   486: invokeinterface 158 1 0
    //   491: ifeq +352 -> 843
    //   494: aload 23
    //   496: invokeinterface 162 1 0
    //   501: checkcast 24	java/lang/String
    //   504: astore 30
    //   506: aload 30
    //   508: invokestatic 186	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   511: istore 31
    //   513: iload 31
    //   515: ifne +314 -> 829
    //   518: new 188	org/json/JSONObject
    //   521: dup
    //   522: aload 30
    //   524: invokespecial 189	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   527: astore 33
    //   529: aload 33
    //   531: ldc 191
    //   533: invokevirtual 195	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   536: astore 36
    //   538: aload 33
    //   540: ldc 197
    //   542: invokevirtual 195	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   545: astore 37
    //   547: sipush 10232
    //   550: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   553: astore 38
    //   555: iconst_4
    //   556: anewarray 164	java/lang/Object
    //   559: astore 39
    //   561: iload 24
    //   563: iconst_1
    //   564: iadd
    //   565: istore 40
    //   567: aload 39
    //   569: iconst_0
    //   570: iload 24
    //   572: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   575: aastore
    //   576: aload 39
    //   578: iconst_1
    //   579: aload 36
    //   581: aastore
    //   582: aload 39
    //   584: iconst_2
    //   585: aload 37
    //   587: aastore
    //   588: aload 39
    //   590: iconst_3
    //   591: aload 38
    //   593: aastore
    //   594: aload 17
    //   596: aload 39
    //   598: invokevirtual 176	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   601: aload_0
    //   602: getfield 62	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fds	Ljava/util/ArrayList;
    //   605: aload 36
    //   607: invokevirtual 200	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   610: pop
    //   611: iload 40
    //   613: istore 24
    //   615: goto -131 -> 484
    //   618: astore 34
    //   620: iload 24
    //   622: istore 32
    //   624: aload 34
    //   626: astore 35
    //   628: ldc 39
    //   630: aload 35
    //   632: invokevirtual 201	org/json/JSONException:toString	()Ljava/lang/String;
    //   635: invokestatic 89	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   638: goto +198 -> 836
    //   641: aload_0
    //   642: getfield 62	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fds	Ljava/util/ArrayList;
    //   645: invokevirtual 153	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   648: astore 25
    //   650: iload 22
    //   652: istore 26
    //   654: aload 25
    //   656: invokeinterface 158 1 0
    //   661: ifeq +149 -> 810
    //   664: aload 25
    //   666: invokeinterface 162 1 0
    //   671: checkcast 24	java/lang/String
    //   674: astore 27
    //   676: iconst_4
    //   677: anewarray 164	java/lang/Object
    //   680: astore 28
    //   682: iload 26
    //   684: iconst_1
    //   685: iadd
    //   686: istore 29
    //   688: aload 28
    //   690: iconst_0
    //   691: iload 26
    //   693: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   696: aastore
    //   697: aload 28
    //   699: iconst_1
    //   700: aload 27
    //   702: aastore
    //   703: aload 28
    //   705: iconst_2
    //   706: ldc 172
    //   708: aastore
    //   709: aload 28
    //   711: iconst_3
    //   712: sipush 10233
    //   715: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   718: aastore
    //   719: aload 17
    //   721: aload 28
    //   723: invokevirtual 176	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   726: iload 29
    //   728: istore 26
    //   730: goto -76 -> 654
    //   733: aload_0
    //   734: getfield 62	com/tencent/mm/plugin/gwallet/GWalletQueryProvider:fds	Ljava/util/ArrayList;
    //   737: invokevirtual 153	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   740: astore 18
    //   742: aload 18
    //   744: invokeinterface 158 1 0
    //   749: ifeq +61 -> 810
    //   752: aload 18
    //   754: invokeinterface 162 1 0
    //   759: checkcast 24	java/lang/String
    //   762: astore 19
    //   764: iconst_4
    //   765: anewarray 164	java/lang/Object
    //   768: astore 20
    //   770: aload 20
    //   772: iconst_0
    //   773: iconst_0
    //   774: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   777: aastore
    //   778: aload 20
    //   780: iconst_1
    //   781: aload 19
    //   783: aastore
    //   784: aload 20
    //   786: iconst_2
    //   787: ldc 172
    //   789: aastore
    //   790: aload 20
    //   792: iconst_3
    //   793: sipush 10236
    //   796: invokestatic 170	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   799: aastore
    //   800: aload 17
    //   802: aload 20
    //   804: invokevirtual 176	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   807: goto -65 -> 742
    //   810: ldc 2
    //   812: monitorexit
    //   813: aload 17
    //   815: areturn
    //   816: astore 41
    //   818: aload 41
    //   820: astore 35
    //   822: iload 40
    //   824: istore 32
    //   826: goto -198 -> 628
    //   829: iload 24
    //   831: istore 32
    //   833: goto +3 -> 836
    //   836: iload 32
    //   838: istore 24
    //   840: goto -356 -> 484
    //   843: iload 24
    //   845: istore 22
    //   847: goto -206 -> 641
    //
    // Exception table:
    //   from	to	target	type
    //   3	10	38	finally
    //   15	21	38	finally
    //   21	38	38	finally
    //   46	95	38	finally
    //   105	122	38	finally
    //   128	150	38	finally
    //   162	175	38	finally
    //   180	186	38	finally
    //   199	209	38	finally
    //   212	247	38	finally
    //   247	312	38	finally
    //   315	318	38	finally
    //   330	358	38	finally
    //   358	423	38	finally
    //   426	429	38	finally
    //   432	464	38	finally
    //   472	481	38	finally
    //   484	513	38	finally
    //   518	561	38	finally
    //   567	611	38	finally
    //   628	638	38	finally
    //   641	650	38	finally
    //   654	682	38	finally
    //   688	726	38	finally
    //   733	742	38	finally
    //   742	807	38	finally
    //   810	813	38	finally
    //   180	186	197	java/lang/InterruptedException
    //   518	561	618	org/json/JSONException
    //   567	611	816	org/json/JSONException
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.GWalletQueryProvider
 * JD-Core Version:    0.6.2
 */