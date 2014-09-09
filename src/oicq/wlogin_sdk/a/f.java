package oicq.wlogin_sdk.a;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.sharemem.WloginSimpleInfo;

public final class f
{
  Context kjp;
  TreeMap kjq = new TreeMap();

  public f(Context paramContext)
  {
    this.kjp = paramContext;
  }

  // ERROR //
  private static int a(Context paramContext, String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 28	oicq/wlogin_sdk/a/a
    //   5: dup
    //   6: aload_0
    //   7: aload_1
    //   8: invokespecial 31	oicq/wlogin_sdk/a/a:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   11: astore 4
    //   13: aload 4
    //   15: invokevirtual 35	oicq/wlogin_sdk/a/a:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 6
    //   20: aload 6
    //   22: new 37	java/lang/StringBuilder
    //   25: dup
    //   26: ldc 39
    //   28: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   31: aload_1
    //   32: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 48
    //   37: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: aload_1
    //   41: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: ldc 50
    //   46: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: invokevirtual 59	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   55: aload 6
    //   57: aload_1
    //   58: iconst_1
    //   59: anewarray 61	java/lang/String
    //   62: dup
    //   63: iconst_0
    //   64: ldc 63
    //   66: aastore
    //   67: ldc 65
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: aconst_null
    //   73: invokevirtual 69	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   76: astore 9
    //   78: aload 9
    //   80: invokeinterface 75 1 0
    //   85: ifne +65 -> 150
    //   88: new 37	java/lang/StringBuilder
    //   91: dup
    //   92: ldc 77
    //   94: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   97: aload_1
    //   98: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: ldc 79
    //   103: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: aload_1
    //   107: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: ldc 81
    //   112: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: astore 12
    //   120: iconst_2
    //   121: anewarray 4	java/lang/Object
    //   124: astore 13
    //   126: aload 13
    //   128: iconst_0
    //   129: iconst_0
    //   130: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: aastore
    //   134: aload 13
    //   136: iconst_1
    //   137: iconst_1
    //   138: newarray byte
    //   140: aastore
    //   141: aload 6
    //   143: aload 12
    //   145: aload 13
    //   147: invokevirtual 90	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload 6
    //   152: new 37	java/lang/StringBuilder
    //   155: dup
    //   156: ldc 92
    //   158: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: aload_1
    //   162: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: ldc 94
    //   167: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: aload_1
    //   171: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: ldc 96
    //   176: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: iconst_1
    //   183: anewarray 4	java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload_2
    //   189: aastore
    //   190: invokevirtual 90	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: aload 9
    //   195: invokeinterface 99 1 0
    //   200: aload 4
    //   202: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   205: iconst_0
    //   206: ireturn
    //   207: astore 5
    //   209: aload 5
    //   211: invokestatic 105	oicq/wlogin_sdk/c/f:a	(Ljava/lang/Exception;)V
    //   214: aload_3
    //   215: ifnull +7 -> 222
    //   218: aload_3
    //   219: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   222: sipush -1022
    //   225: ireturn
    //   226: astore 7
    //   228: aload 7
    //   230: invokestatic 105	oicq/wlogin_sdk/c/f:a	(Ljava/lang/Exception;)V
    //   233: aload 4
    //   235: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   238: sipush -1022
    //   241: ireturn
    //   242: astore 8
    //   244: aload 8
    //   246: invokestatic 105	oicq/wlogin_sdk/c/f:a	(Ljava/lang/Exception;)V
    //   249: aload 4
    //   251: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   254: sipush -1022
    //   257: ireturn
    //   258: astore 11
    //   260: aload 11
    //   262: invokestatic 105	oicq/wlogin_sdk/c/f:a	(Ljava/lang/Exception;)V
    //   265: aload 9
    //   267: invokeinterface 99 1 0
    //   272: aload 4
    //   274: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   277: sipush -1022
    //   280: ireturn
    //   281: astore 10
    //   283: aload 10
    //   285: invokestatic 105	oicq/wlogin_sdk/c/f:a	(Ljava/lang/Exception;)V
    //   288: aload 9
    //   290: invokeinterface 99 1 0
    //   295: aload 4
    //   297: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   300: sipush -1022
    //   303: ireturn
    //   304: astore 5
    //   306: aload 4
    //   308: astore_3
    //   309: goto -100 -> 209
    //
    // Exception table:
    //   from	to	target	type
    //   2	13	207	java/lang/Exception
    //   20	55	226	android/database/SQLException
    //   55	78	242	android/database/SQLException
    //   88	150	258	android/database/SQLException
    //   150	193	281	android/database/SQLException
    //   13	20	304	java/lang/Exception
  }

  private int a(TreeMap paramTreeMap, String paramString)
  {
    int i = 0;
    if (paramString == "tk_file");
    try
    {
      int j = b(paramTreeMap, paramString);
      i = j;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  private static TreeMap aJ(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: aload_1
    //   4: invokestatic 117	oicq/wlogin_sdk/a/f:aK	(Landroid/content/Context;Ljava/lang/String;)[B
    //   7: astore_3
    //   8: aload_3
    //   9: ifnull +572 -> 581
    //   12: new 119	javax/crypto/spec/SecretKeySpec
    //   15: dup
    //   16: getstatic 125	oicq/wlogin_sdk/a/k:kjS	[B
    //   19: ldc 127
    //   21: invokespecial 130	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   24: astore 4
    //   26: ldc 127
    //   28: invokestatic 136	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   31: astore 35
    //   33: aload 35
    //   35: iconst_2
    //   36: aload 4
    //   38: invokevirtual 140	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   41: new 142	java/io/ObjectInputStream
    //   44: dup
    //   45: new 144	javax/crypto/CipherInputStream
    //   48: dup
    //   49: new 146	java/io/ByteArrayInputStream
    //   52: dup
    //   53: aload_3
    //   54: invokespecial 149	java/io/ByteArrayInputStream:<init>	([B)V
    //   57: aload 35
    //   59: invokespecial 152	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   62: invokespecial 155	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   65: astore 36
    //   67: aload 36
    //   69: invokevirtual 159	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   72: checkcast 15	java/util/TreeMap
    //   75: astore 18
    //   77: aload 18
    //   79: ifnull +496 -> 575
    //   82: aload 36
    //   84: invokevirtual 160	java/io/ObjectInputStream:close	()V
    //   87: aload 18
    //   89: areturn
    //   90: astore 5
    //   92: new 162	java/io/StringWriter
    //   95: dup
    //   96: invokespecial 163	java/io/StringWriter:<init>	()V
    //   99: astore 6
    //   101: new 165	java/io/PrintWriter
    //   104: dup
    //   105: aload 6
    //   107: iconst_1
    //   108: invokespecial 168	java/io/PrintWriter:<init>	(Ljava/io/Writer;Z)V
    //   111: astore 7
    //   113: aload 5
    //   115: aload 7
    //   117: invokevirtual 172	java/lang/Exception:printStackTrace	(Ljava/io/PrintWriter;)V
    //   120: aload 7
    //   122: invokevirtual 175	java/io/PrintWriter:flush	()V
    //   125: aload 6
    //   127: invokevirtual 176	java/io/StringWriter:flush	()V
    //   130: ldc 178
    //   132: aload 6
    //   134: invokevirtual 179	java/io/StringWriter:toString	()Ljava/lang/String;
    //   137: invokestatic 183	oicq/wlogin_sdk/c/f:bT	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: aload_0
    //   141: invokestatic 187	oicq/wlogin_sdk/c/f:cZ	(Landroid/content/Context;)[B
    //   144: astore 30
    //   146: aload 30
    //   148: ifnull +91 -> 239
    //   151: aload 30
    //   153: arraylength
    //   154: ifle +85 -> 239
    //   157: new 119	javax/crypto/spec/SecretKeySpec
    //   160: dup
    //   161: aload 30
    //   163: ldc 127
    //   165: invokespecial 130	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   168: astore 31
    //   170: ldc 127
    //   172: invokestatic 136	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   175: astore 32
    //   177: aload 32
    //   179: iconst_2
    //   180: aload 31
    //   182: invokevirtual 140	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   185: new 142	java/io/ObjectInputStream
    //   188: dup
    //   189: new 144	javax/crypto/CipherInputStream
    //   192: dup
    //   193: new 146	java/io/ByteArrayInputStream
    //   196: dup
    //   197: aload_3
    //   198: invokespecial 149	java/io/ByteArrayInputStream:<init>	([B)V
    //   201: aload 32
    //   203: invokespecial 152	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   206: invokespecial 155	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   209: astore 33
    //   211: aload 33
    //   213: invokevirtual 159	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   216: checkcast 15	java/util/TreeMap
    //   219: astore 9
    //   221: aload 9
    //   223: ifnull +13 -> 236
    //   226: aload 33
    //   228: invokevirtual 160	java/io/ObjectInputStream:close	()V
    //   231: aload 9
    //   233: areturn
    //   234: astore 34
    //   236: aload 9
    //   238: astore_2
    //   239: aload_0
    //   240: invokestatic 190	oicq/wlogin_sdk/c/f:cY	(Landroid/content/Context;)[B
    //   243: astore 25
    //   245: aload 25
    //   247: ifnull +94 -> 341
    //   250: aload 25
    //   252: arraylength
    //   253: ifle +88 -> 341
    //   256: new 119	javax/crypto/spec/SecretKeySpec
    //   259: dup
    //   260: aload 25
    //   262: invokestatic 196	oicq/wlogin_sdk/c/d:dn	([B)[B
    //   265: ldc 127
    //   267: invokespecial 130	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   270: astore 26
    //   272: ldc 127
    //   274: invokestatic 136	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   277: astore 27
    //   279: aload 27
    //   281: iconst_2
    //   282: aload 26
    //   284: invokevirtual 140	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   287: new 142	java/io/ObjectInputStream
    //   290: dup
    //   291: new 144	javax/crypto/CipherInputStream
    //   294: dup
    //   295: new 146	java/io/ByteArrayInputStream
    //   298: dup
    //   299: aload_3
    //   300: invokespecial 149	java/io/ByteArrayInputStream:<init>	([B)V
    //   303: aload 27
    //   305: invokespecial 152	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   308: invokespecial 155	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   311: astore 28
    //   313: aload 28
    //   315: invokevirtual 159	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   318: checkcast 15	java/util/TreeMap
    //   321: astore 11
    //   323: aload 11
    //   325: ifnull +13 -> 338
    //   328: aload 28
    //   330: invokevirtual 160	java/io/ObjectInputStream:close	()V
    //   333: aload 11
    //   335: areturn
    //   336: astore 29
    //   338: aload 11
    //   340: astore_2
    //   341: aload_0
    //   342: invokestatic 199	oicq/wlogin_sdk/c/f:cX	(Landroid/content/Context;)[B
    //   345: astore 20
    //   347: aload 20
    //   349: ifnull +94 -> 443
    //   352: aload 20
    //   354: arraylength
    //   355: ifle +88 -> 443
    //   358: new 119	javax/crypto/spec/SecretKeySpec
    //   361: dup
    //   362: aload 20
    //   364: invokestatic 196	oicq/wlogin_sdk/c/d:dn	([B)[B
    //   367: ldc 127
    //   369: invokespecial 130	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   372: astore 21
    //   374: ldc 127
    //   376: invokestatic 136	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   379: astore 22
    //   381: aload 22
    //   383: iconst_2
    //   384: aload 21
    //   386: invokevirtual 140	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   389: new 142	java/io/ObjectInputStream
    //   392: dup
    //   393: new 144	javax/crypto/CipherInputStream
    //   396: dup
    //   397: new 146	java/io/ByteArrayInputStream
    //   400: dup
    //   401: aload_3
    //   402: invokespecial 149	java/io/ByteArrayInputStream:<init>	([B)V
    //   405: aload 22
    //   407: invokespecial 152	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   410: invokespecial 155	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   413: astore 23
    //   415: aload 23
    //   417: invokevirtual 159	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   420: checkcast 15	java/util/TreeMap
    //   423: astore 13
    //   425: aload 13
    //   427: ifnull +13 -> 440
    //   430: aload 23
    //   432: invokevirtual 160	java/io/ObjectInputStream:close	()V
    //   435: aload 13
    //   437: areturn
    //   438: astore 24
    //   440: aload 13
    //   442: astore_2
    //   443: new 119	javax/crypto/spec/SecretKeySpec
    //   446: dup
    //   447: new 61	java/lang/String
    //   450: dup
    //   451: ldc 201
    //   453: invokespecial 202	java/lang/String:<init>	(Ljava/lang/String;)V
    //   456: invokevirtual 206	java/lang/String:getBytes	()[B
    //   459: ldc 127
    //   461: invokespecial 130	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   464: astore 14
    //   466: ldc 127
    //   468: invokestatic 136	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   471: astore 16
    //   473: aload 16
    //   475: iconst_2
    //   476: aload 14
    //   478: invokevirtual 140	javax/crypto/Cipher:init	(ILjava/security/Key;)V
    //   481: new 142	java/io/ObjectInputStream
    //   484: dup
    //   485: new 144	javax/crypto/CipherInputStream
    //   488: dup
    //   489: new 146	java/io/ByteArrayInputStream
    //   492: dup
    //   493: aload_3
    //   494: invokespecial 149	java/io/ByteArrayInputStream:<init>	([B)V
    //   497: aload 16
    //   499: invokespecial 152	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   502: invokespecial 155	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   505: astore 17
    //   507: aload 17
    //   509: invokevirtual 159	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   512: checkcast 15	java/util/TreeMap
    //   515: astore 18
    //   517: aload 18
    //   519: ifnull -432 -> 87
    //   522: aload 17
    //   524: invokevirtual 160	java/io/ObjectInputStream:close	()V
    //   527: aload 18
    //   529: areturn
    //   530: astore 19
    //   532: aload 18
    //   534: areturn
    //   535: astore 15
    //   537: aload_2
    //   538: areturn
    //   539: astore 12
    //   541: aload_2
    //   542: astore 13
    //   544: goto -104 -> 440
    //   547: astore 10
    //   549: aload_2
    //   550: astore 11
    //   552: goto -214 -> 338
    //   555: astore 8
    //   557: aload_2
    //   558: astore 9
    //   560: goto -324 -> 236
    //   563: astore 37
    //   565: aload 18
    //   567: astore_2
    //   568: aload 37
    //   570: astore 5
    //   572: goto -480 -> 92
    //   575: aload 18
    //   577: astore_2
    //   578: goto -438 -> 140
    //   581: aconst_null
    //   582: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   12	77	90	java/lang/Exception
    //   226	231	234	java/lang/Exception
    //   328	333	336	java/lang/Exception
    //   430	435	438	java/lang/Exception
    //   522	527	530	java/lang/Exception
    //   443	517	535	java/lang/Exception
    //   341	347	539	java/lang/Exception
    //   352	425	539	java/lang/Exception
    //   239	245	547	java/lang/Exception
    //   250	323	547	java/lang/Exception
    //   140	146	555	java/lang/Exception
    //   151	221	555	java/lang/Exception
    //   82	87	563	java/lang/Exception
  }

  // ERROR //
  private static byte[] aK(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: invokestatic 211	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   4: astore_2
    //   5: new 28	oicq/wlogin_sdk/a/a
    //   8: dup
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 31	oicq/wlogin_sdk/a/a:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   14: astore_3
    //   15: aload_3
    //   16: invokevirtual 214	oicq/wlogin_sdk/a/a:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   19: astore 6
    //   21: aload 6
    //   23: new 37	java/lang/StringBuilder
    //   26: dup
    //   27: ldc 216
    //   29: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   32: aload_1
    //   33: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: ldc 218
    //   38: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: aconst_null
    //   45: invokevirtual 222	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   48: astore 9
    //   50: aload 9
    //   52: invokeinterface 226 1 0
    //   57: ifeq +19 -> 76
    //   60: aload 9
    //   62: iconst_0
    //   63: invokeinterface 230 2 0
    //   68: ifle +8 -> 76
    //   71: iconst_1
    //   72: invokestatic 211	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   75: astore_2
    //   76: aload 9
    //   78: ifnull +20 -> 98
    //   81: aload 9
    //   83: invokeinterface 233 1 0
    //   88: ifne +10 -> 98
    //   91: aload 9
    //   93: invokeinterface 99 1 0
    //   98: aload_2
    //   99: invokevirtual 236	java/lang/Boolean:booleanValue	()Z
    //   102: ifne +31 -> 133
    //   105: aload_3
    //   106: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   109: aconst_null
    //   110: areturn
    //   111: astore 4
    //   113: aconst_null
    //   114: astore 5
    //   116: aload 4
    //   118: invokestatic 105	oicq/wlogin_sdk/c/f:a	(Ljava/lang/Exception;)V
    //   121: aload 5
    //   123: ifnull +8 -> 131
    //   126: aload 5
    //   128: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   131: aconst_null
    //   132: areturn
    //   133: aload 6
    //   135: aload_1
    //   136: iconst_1
    //   137: anewarray 61	java/lang/String
    //   140: dup
    //   141: iconst_0
    //   142: aload_1
    //   143: aastore
    //   144: ldc 65
    //   146: aconst_null
    //   147: aconst_null
    //   148: aconst_null
    //   149: aconst_null
    //   150: invokevirtual 69	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   153: astore 10
    //   155: aload 10
    //   157: invokeinterface 75 1 0
    //   162: ifne +54 -> 216
    //   165: aload 10
    //   167: invokeinterface 99 1 0
    //   172: aload_3
    //   173: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   176: aconst_null
    //   177: areturn
    //   178: astore 7
    //   180: aconst_null
    //   181: astore 8
    //   183: aload 7
    //   185: invokestatic 105	oicq/wlogin_sdk/c/f:a	(Ljava/lang/Exception;)V
    //   188: aload 8
    //   190: ifnull +20 -> 210
    //   193: aload 8
    //   195: invokeinterface 233 1 0
    //   200: ifne +10 -> 210
    //   203: aload 8
    //   205: invokeinterface 99 1 0
    //   210: aload_3
    //   211: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   214: aconst_null
    //   215: areturn
    //   216: aload 10
    //   218: invokeinterface 239 1 0
    //   223: pop
    //   224: aload 10
    //   226: iconst_0
    //   227: invokeinterface 243 2 0
    //   232: astore 12
    //   234: aload 10
    //   236: invokeinterface 99 1 0
    //   241: aload_3
    //   242: invokevirtual 100	oicq/wlogin_sdk/a/a:close	()V
    //   245: aload 12
    //   247: areturn
    //   248: astore 7
    //   250: aload 9
    //   252: astore 8
    //   254: goto -71 -> 183
    //   257: astore 4
    //   259: aload_3
    //   260: astore 5
    //   262: goto -146 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   5	15	111	java/lang/Exception
    //   21	50	178	android/database/SQLException
    //   50	76	248	android/database/SQLException
    //   81	98	248	android/database/SQLException
    //   98	109	248	android/database/SQLException
    //   133	155	248	android/database/SQLException
    //   15	21	257	java/lang/Exception
  }

  private int b(TreeMap paramTreeMap, String paramString)
  {
    try
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(k.kjS, "DESede");
      Cipher localCipher = Cipher.getInstance("DESede");
      localCipher.init(1, localSecretKeySpec);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(new CipherOutputStream(localByteArrayOutputStream, localCipher));
      localObjectOutputStream.writeObject(paramTreeMap);
      localObjectOutputStream.close();
      int j = a(this.kjp, paramString, localByteArrayOutputStream.toByteArray());
      i = j;
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        StringWriter localStringWriter = new StringWriter();
        PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
        localException.printStackTrace(localPrintWriter);
        localPrintWriter.flush();
        localStringWriter.flush();
        oicq.wlogin_sdk.c.f.bT("exception", localStringWriter.toString());
        int i = -1022;
      }
    }
    finally
    {
    }
  }

  private c dt(long paramLong)
  {
    try
    {
      oicq.wlogin_sdk.c.f.bS("get_all_siginfo", "uin=" + paramLong);
      Object localObject2 = (c)this.kjq.get(new Long(paramLong));
      if (localObject2 != null);
      while (true)
      {
        return localObject2;
        if (this.kjp == null)
        {
          localObject2 = null;
        }
        else
        {
          TreeMap localTreeMap = aJ(this.kjp, "tk_file");
          if (localTreeMap == null)
          {
            localObject2 = null;
          }
          else
          {
            c localc1 = (c)localTreeMap.get(new Long(paramLong));
            if (localc1 == null)
            {
              oicq.wlogin_sdk.c.f.bS("get_all_siginfo", "null");
              localObject2 = null;
            }
            else
            {
              this.kjq.put(new Long(paramLong), localc1);
              c localc2 = localc1.beK();
              localObject2 = localc2;
            }
          }
        }
      }
    }
    finally
    {
    }
  }

  public final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, byte[] paramArrayOfByte9, byte[] paramArrayOfByte10, byte[] paramArrayOfByte11, byte[] paramArrayOfByte12, byte[] paramArrayOfByte13, byte[] paramArrayOfByte14, byte[] paramArrayOfByte15, byte[] paramArrayOfByte16, byte[][] paramArrayOfByte)
  {
    while (true)
    {
      c localc1;
      byte[] arrayOfByte1;
      try
      {
        localc1 = (c)this.kjq.get(new Long(paramLong1));
        if (localc1 != null)
          break label458;
        localc2 = new c();
        arrayOfByte1 = new byte[0];
        WloginSigInfo localWloginSigInfo1 = (WloginSigInfo)localc2.kiZ.get(new Long(paramLong2));
        if ((localWloginSigInfo1 != null) && (localWloginSigInfo1.kkp != null))
        {
          arrayOfByte2 = (byte[])localWloginSigInfo1.kkp.clone();
          WloginSimpleInfo localWloginSimpleInfo = new WloginSimpleInfo(paramLong1, paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3, paramArrayOfByte4);
          localc2.kiY = localWloginSimpleInfo;
          WloginSigInfo localWloginSigInfo2 = (WloginSigInfo)localc2.kiZ.get(new Long(paramLong2));
          if (localWloginSigInfo2 != null)
          {
            TreeMap localTreeMap1 = localc2.kiZ;
            Long localLong1 = new Long(paramLong2);
            localTreeMap1.put(localLong1, localWloginSigInfo2.a(paramLong3, paramLong4, paramLong5, paramLong6, paramArrayOfByte5, paramArrayOfByte6, paramArrayOfByte7, paramArrayOfByte8, paramArrayOfByte9, paramArrayOfByte10, paramArrayOfByte11, paramArrayOfByte12, paramArrayOfByte13, paramArrayOfByte14, paramArrayOfByte15, paramArrayOfByte16, paramArrayOfByte));
            oicq.wlogin_sdk.c.f.DS("before put_siginfo, ret=0");
            Context localContext = this.kjp;
            int i = 0;
            if (localContext != null)
            {
              TreeMap localTreeMap2 = aJ(this.kjp, "tk_file");
              if (localTreeMap2 == null)
                localTreeMap2 = new TreeMap();
              oicq.wlogin_sdk.c.f.DS("after loadTKTreeMap");
              localTreeMap2.put(new Long(paramLong1), localc2.beK());
              i = a(localTreeMap2, "tk_file");
              oicq.wlogin_sdk.c.f.DS("after refreshTKTreeMap, ret=" + i);
            }
            int j = i;
            if (j != 0)
            {
              WloginSigInfo localWloginSigInfo3 = (WloginSigInfo)localc2.kiZ.get(new Long(paramLong2));
              if (localWloginSigInfo3 != null)
                localWloginSigInfo3.kkp = ((byte[])arrayOfByte2.clone());
            }
            this.kjq.put(new Long(paramLong1), localc2);
            return j;
          }
          TreeMap localTreeMap3 = localc2.kiZ;
          Long localLong2 = new Long(paramLong2);
          localTreeMap3.put(localLong2, new WloginSigInfo(paramLong3, paramLong4, paramLong5, paramLong6, paramArrayOfByte5, paramArrayOfByte6, paramArrayOfByte7, paramArrayOfByte8, paramArrayOfByte9, paramArrayOfByte10, paramArrayOfByte11, paramArrayOfByte12, paramArrayOfByte13, paramArrayOfByte14, paramArrayOfByte15, paramArrayOfByte16, paramArrayOfByte));
          continue;
        }
      }
      finally
      {
      }
      byte[] arrayOfByte2 = arrayOfByte1;
      continue;
      label458: c localc2 = localc1;
    }
  }

  public final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      c localc = (c)this.kjq.get(new Long(paramLong1));
      if (localc == null);
      for (int i = -1; ; i = 0)
      {
        return i;
        localc.kiZ.put(new Long(paramLong2), new WloginSigInfo(paramLong3, paramLong4, paramArrayOfByte1, paramArrayOfByte2));
        if (this.kjp != null)
        {
          TreeMap localTreeMap = aJ(this.kjp, "tk_file");
          if (localTreeMap == null)
            localTreeMap = new TreeMap();
          localTreeMap.put(new Long(paramLong1), localc.beK());
          a(localTreeMap, "tk_file");
        }
      }
    }
    finally
    {
    }
  }

  public final void c(Long paramLong)
  {
    try
    {
      this.kjq.remove(paramLong);
      TreeMap localTreeMap;
      if (this.kjp != null)
      {
        localTreeMap = aJ(this.kjp, "tk_file");
        if (localTreeMap != null)
          break label37;
      }
      while (true)
      {
        return;
        label37: localTreeMap.remove(paramLong);
        a(localTreeMap, "tk_file");
      }
    }
    finally
    {
    }
  }

  public final WloginSigInfo k(long paramLong1, long paramLong2)
  {
    try
    {
      oicq.wlogin_sdk.c.f.bS("get_siginfo", "uin=" + paramLong1 + "appid=" + paramLong2);
      c localc = dt(paramLong1);
      WloginSigInfo localWloginSigInfo;
      if (localc == null)
        localWloginSigInfo = null;
      while (true)
      {
        return localWloginSigInfo;
        localWloginSigInfo = (WloginSigInfo)localc.kiZ.get(new Long(paramLong2));
        if (localWloginSigInfo == null)
          localWloginSigInfo = null;
      }
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.f
 * JD-Core Version:    0.6.2
 */