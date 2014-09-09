package com.tencent.kingkong;

import com.tencent.kingkong.support.Log;
import com.tencent.mm.dbsupport.newcursor.k;
import java.io.File;

public final class DefaultDatabaseErrorHandler
  implements DatabaseErrorHandler
{
  private static final String TAG = "MicroMsg.kkdb.DefaultDatabaseErrorHandler";

  private void deleteDatabaseFile(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      k.iN(paramString);
    while ((paramString.equalsIgnoreCase(":memory:")) || (paramString.trim().length() == 0))
      return;
    Log.e("MicroMsg.kkdb.DefaultDatabaseErrorHandler", "deleting the database file: " + paramString);
    try
    {
      String str = paramString + "err" + System.currentTimeMillis();
      renameTo(new File(paramString), new File(str));
      return;
    }
    catch (Exception localException)
    {
      Log.w("MicroMsg.kkdb.DefaultDatabaseErrorHandler", "delete failed: " + localException.getMessage());
    }
  }

  // ERROR //
  private static final boolean renameTo(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 95	java/io/File:exists	()Z
    //   4: istore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iload_2
    //   8: ifeq +41 -> 49
    //   11: aload_0
    //   12: invokevirtual 98	java/io/File:isDirectory	()Z
    //   15: ifeq +81 -> 96
    //   18: aload_1
    //   19: invokevirtual 95	java/io/File:exists	()Z
    //   22: ifne +8 -> 30
    //   25: aload_1
    //   26: invokevirtual 101	java/io/File:mkdir	()Z
    //   29: pop
    //   30: aload_0
    //   31: invokevirtual 105	java/io/File:listFiles	()[Ljava/io/File;
    //   34: astore 20
    //   36: iconst_0
    //   37: istore 21
    //   39: iload_3
    //   40: aload 20
    //   42: arraylength
    //   43: if_icmplt +8 -> 51
    //   46: iload 21
    //   48: istore_3
    //   49: iload_3
    //   50: ireturn
    //   51: aload 20
    //   53: iload_3
    //   54: aaload
    //   55: astore 22
    //   57: aload 22
    //   59: new 76	java/io/File
    //   62: dup
    //   63: aload_1
    //   64: invokevirtual 108	java/io/File:getPath	()Ljava/lang/String;
    //   67: aload 22
    //   69: invokevirtual 111	java/io/File:getName	()Ljava/lang/String;
    //   72: invokespecial 113	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: invokestatic 81	com/tencent/kingkong/DefaultDatabaseErrorHandler:renameTo	(Ljava/io/File;Ljava/io/File;)Z
    //   78: istore 21
    //   80: iload 21
    //   82: ifeq +8 -> 90
    //   85: aload_0
    //   86: invokevirtual 116	java/io/File:delete	()Z
    //   89: pop
    //   90: iinc 3 1
    //   93: goto -54 -> 39
    //   96: new 118	java/io/FileInputStream
    //   99: dup
    //   100: aload_0
    //   101: invokespecial 121	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   104: astore 4
    //   106: new 123	java/io/FileOutputStream
    //   109: dup
    //   110: aload_1
    //   111: invokespecial 124	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   114: astore 5
    //   116: ldc 125
    //   118: newarray byte
    //   120: astore 13
    //   122: aload 4
    //   124: aload 13
    //   126: invokevirtual 131	java/io/InputStream:read	([B)I
    //   129: istore 14
    //   131: iload 14
    //   133: iconst_m1
    //   134: if_icmpne +25 -> 159
    //   137: aload 5
    //   139: invokevirtual 136	java/io/OutputStream:flush	()V
    //   142: aload_0
    //   143: invokevirtual 116	java/io/File:delete	()Z
    //   146: pop
    //   147: aload 4
    //   149: invokevirtual 139	java/io/InputStream:close	()V
    //   152: aload 5
    //   154: invokevirtual 140	java/io/OutputStream:close	()V
    //   157: iconst_1
    //   158: ireturn
    //   159: aload 5
    //   161: aload 13
    //   163: iconst_0
    //   164: iload 14
    //   166: invokevirtual 144	java/io/OutputStream:write	([BII)V
    //   169: goto -47 -> 122
    //   172: astore 9
    //   174: aload 4
    //   176: astore 10
    //   178: aload 10
    //   180: ifnull +8 -> 188
    //   183: aload 10
    //   185: invokevirtual 139	java/io/InputStream:close	()V
    //   188: iconst_0
    //   189: istore_3
    //   190: aload 5
    //   192: ifnull -143 -> 49
    //   195: aload 5
    //   197: invokevirtual 140	java/io/OutputStream:close	()V
    //   200: iconst_0
    //   201: ireturn
    //   202: astore 11
    //   204: iconst_0
    //   205: ireturn
    //   206: astore 6
    //   208: aconst_null
    //   209: astore 5
    //   211: aconst_null
    //   212: astore 4
    //   214: aload 4
    //   216: ifnull +8 -> 224
    //   219: aload 4
    //   221: invokevirtual 139	java/io/InputStream:close	()V
    //   224: aload 5
    //   226: ifnull +8 -> 234
    //   229: aload 5
    //   231: invokevirtual 140	java/io/OutputStream:close	()V
    //   234: aload 6
    //   236: athrow
    //   237: astore 16
    //   239: goto -87 -> 152
    //   242: astore 17
    //   244: goto -87 -> 157
    //   247: astore 12
    //   249: goto -61 -> 188
    //   252: astore 8
    //   254: goto -30 -> 224
    //   257: astore 7
    //   259: goto -25 -> 234
    //   262: astore 6
    //   264: aconst_null
    //   265: astore 5
    //   267: goto -53 -> 214
    //   270: astore 6
    //   272: goto -58 -> 214
    //   275: astore 19
    //   277: aconst_null
    //   278: astore 5
    //   280: aconst_null
    //   281: astore 10
    //   283: goto -105 -> 178
    //   286: astore 18
    //   288: aload 4
    //   290: astore 10
    //   292: aconst_null
    //   293: astore 5
    //   295: goto -117 -> 178
    //
    // Exception table:
    //   from	to	target	type
    //   116	122	172	java/lang/Exception
    //   122	131	172	java/lang/Exception
    //   137	147	172	java/lang/Exception
    //   159	169	172	java/lang/Exception
    //   195	200	202	java/io/IOException
    //   96	106	206	finally
    //   147	152	237	java/io/IOException
    //   152	157	242	java/io/IOException
    //   183	188	247	java/io/IOException
    //   219	224	252	java/io/IOException
    //   229	234	257	java/io/IOException
    //   106	116	262	finally
    //   116	122	270	finally
    //   122	131	270	finally
    //   137	147	270	finally
    //   159	169	270	finally
    //   96	106	275	java/lang/Exception
    //   106	116	286	java/lang/Exception
  }

  // ERROR //
  public final void onCorruption(com.tencent.kingkong.database.SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 10
    //   2: new 42	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 150
    //   8: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_1
    //   12: invokevirtual 153	com/tencent/kingkong/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   15: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   21: invokestatic 59	com/tencent/kingkong/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: aload_1
    //   25: invokevirtual 156	com/tencent/kingkong/database/SQLiteDatabase:isOpen	()Z
    //   28: ifne +13 -> 41
    //   31: aload_0
    //   32: aload_1
    //   33: invokevirtual 153	com/tencent/kingkong/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   36: iload_2
    //   37: invokespecial 158	com/tencent/kingkong/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;Z)V
    //   40: return
    //   41: aload_1
    //   42: invokevirtual 162	com/tencent/kingkong/database/SQLiteDatabase:getAttachedDbs	()Ljava/util/List;
    //   45: astore 12
    //   47: aload 12
    //   49: astore 4
    //   51: aload_1
    //   52: invokevirtual 163	com/tencent/kingkong/database/SQLiteDatabase:close	()V
    //   55: aload 4
    //   57: ifnull +118 -> 175
    //   60: aload 4
    //   62: invokeinterface 169 1 0
    //   67: astore 10
    //   69: aload 10
    //   71: invokeinterface 174 1 0
    //   76: ifeq -36 -> 40
    //   79: aload_0
    //   80: aload 10
    //   82: invokeinterface 178 1 0
    //   87: checkcast 180	android/util/Pair
    //   90: getfield 184	android/util/Pair:second	Ljava/lang/Object;
    //   93: checkcast 28	java/lang/String
    //   96: iload_2
    //   97: invokespecial 158	com/tencent/kingkong/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;Z)V
    //   100: goto -31 -> 69
    //   103: astore 11
    //   105: aconst_null
    //   106: astore 6
    //   108: aload 11
    //   110: astore 7
    //   112: aload 6
    //   114: ifnull +49 -> 163
    //   117: aload 6
    //   119: invokeinterface 169 1 0
    //   124: astore 8
    //   126: aload 8
    //   128: invokeinterface 174 1 0
    //   133: ifne +6 -> 139
    //   136: aload 7
    //   138: athrow
    //   139: aload_0
    //   140: aload 8
    //   142: invokeinterface 178 1 0
    //   147: checkcast 180	android/util/Pair
    //   150: getfield 184	android/util/Pair:second	Ljava/lang/Object;
    //   153: checkcast 28	java/lang/String
    //   156: iload_2
    //   157: invokespecial 158	com/tencent/kingkong/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;Z)V
    //   160: goto -34 -> 126
    //   163: aload_0
    //   164: aload_1
    //   165: invokevirtual 153	com/tencent/kingkong/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   168: iload_2
    //   169: invokespecial 158	com/tencent/kingkong/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;Z)V
    //   172: goto -36 -> 136
    //   175: aload_0
    //   176: aload_1
    //   177: invokevirtual 153	com/tencent/kingkong/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   180: iload_2
    //   181: invokespecial 158	com/tencent/kingkong/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;Z)V
    //   184: return
    //   185: astore_3
    //   186: aconst_null
    //   187: astore 4
    //   189: goto -138 -> 51
    //   192: astore 9
    //   194: goto -139 -> 55
    //   197: astore 5
    //   199: aload 4
    //   201: astore 6
    //   203: aload 5
    //   205: astore 7
    //   207: goto -95 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   41	47	103	finally
    //   41	47	185	com/tencent/kingkong/database/SQLiteException
    //   51	55	192	com/tencent/kingkong/database/SQLiteException
    //   51	55	197	finally
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.DefaultDatabaseErrorHandler
 * JD-Core Version:    0.6.2
 */