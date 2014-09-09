package com.tencent.kingkong.database;

import com.tencent.kingkong.DatabaseErrorHandler;
import com.tencent.kingkong.support.Log;

public abstract class SQLiteOpenHelper
{
  private static final boolean DEBUG_STRICT_READONLY;
  private static final String TAG = SQLiteOpenHelper.class.getSimpleName();
  private SQLiteDatabase.Arithmetic mArithmeticl;
  private final android.content.Context mContext;
  private SQLiteDatabase mDatabase;
  private boolean mEnableWriteAheadLogging;
  private final DatabaseErrorHandler mErrorHandler;
  private final SQLiteDatabase.CursorFactory mFactory;
  private boolean mIsInitWaited;
  private boolean mIsInitializing;
  private int mMode;
  private final String mName;
  private boolean mNeedMode;
  private final int mNewVersion;
  private String mPassword;
  private SQLiteDatabase.LockedDevice mlockedDevice;

  public SQLiteOpenHelper(android.content.Context paramContext, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString, SQLiteDatabase.LockedDevice.DEFAULT, paramArithmetic, paramCursorFactory, paramInt, paramDatabaseErrorHandler);
  }

  public SQLiteOpenHelper(android.content.Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    this(paramContext, paramString, paramCursorFactory, paramInt, null);
  }

  public SQLiteOpenHelper(android.content.Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, paramInt, paramDatabaseErrorHandler, false);
  }

  public SQLiteOpenHelper(android.content.Context paramContext, String paramString, SQLiteDatabase.LockedDevice paramLockedDevice, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString, paramLockedDevice, null, paramArithmetic, paramCursorFactory, paramInt, paramDatabaseErrorHandler, true);
  }

  public SQLiteOpenHelper(android.content.Context paramContext, String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString1, paramLockedDevice, paramString2, paramArithmetic, paramCursorFactory, paramInt, paramDatabaseErrorHandler, false);
  }

  public SQLiteOpenHelper(android.content.Context paramContext, String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler, boolean paramBoolean)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("Version must be >= 1, was " + paramInt);
    this.mContext = paramContext;
    this.mName = paramString1;
    this.mFactory = paramCursorFactory;
    this.mNewVersion = paramInt;
    this.mErrorHandler = paramDatabaseErrorHandler;
    this.mPassword = paramString2;
    this.mArithmeticl = paramArithmetic;
    this.mIsInitWaited = paramBoolean;
    this.mlockedDevice = paramLockedDevice;
    this.mNeedMode = false;
  }

  public SQLiteOpenHelper(android.content.Context paramContext, String paramString1, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString1, SQLiteDatabase.LockedDevice.DEFAULT, paramString2, paramArithmetic, paramCursorFactory, paramInt, paramDatabaseErrorHandler);
  }

  public SQLiteOpenHelper(android.content.Context paramContext, String paramString1, String paramString2, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString1, paramString2, SQLiteDatabase.Arithmetic.DEFAULT, paramCursorFactory, paramInt, paramDatabaseErrorHandler);
  }

  // ERROR //
  private SQLiteDatabase getDatabaseLocked(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   4: ifnull +18 -> 22
    //   7: aload_0
    //   8: getfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   11: invokevirtual 121	com/tencent/kingkong/database/SQLiteDatabase:isOpen	()Z
    //   14: ifne +25 -> 39
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   22: aload_0
    //   23: getfield 123	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitializing	Z
    //   26: ifeq +36 -> 62
    //   29: new 125	java/lang/IllegalStateException
    //   32: dup
    //   33: ldc 127
    //   35: invokespecial 128	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   38: athrow
    //   39: iload_1
    //   40: ifeq +13 -> 53
    //   43: aload_0
    //   44: getfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   47: invokevirtual 131	com/tencent/kingkong/database/SQLiteDatabase:isReadOnly	()Z
    //   50: ifne -28 -> 22
    //   53: aload_0
    //   54: getfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   57: astore 7
    //   59: aload 7
    //   61: areturn
    //   62: aload_0
    //   63: getfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   66: astore_2
    //   67: aload_0
    //   68: iconst_1
    //   69: putfield 123	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitializing	Z
    //   72: aload_2
    //   73: ifnull +61 -> 134
    //   76: iload_1
    //   77: ifeq +345 -> 422
    //   80: aload_2
    //   81: invokevirtual 131	com/tencent/kingkong/database/SQLiteDatabase:isReadOnly	()Z
    //   84: ifeq +338 -> 422
    //   87: aload_2
    //   88: invokevirtual 134	com/tencent/kingkong/database/SQLiteDatabase:reopenReadWrite	()V
    //   91: aload_2
    //   92: astore 7
    //   94: aload_0
    //   95: getfield 97	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitWaited	Z
    //   98: ifeq +277 -> 375
    //   101: aload_0
    //   102: aload 7
    //   104: putfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   107: aload_0
    //   108: iconst_0
    //   109: putfield 123	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitializing	Z
    //   112: aload 7
    //   114: ifnull -55 -> 59
    //   117: aload 7
    //   119: aload_0
    //   120: getfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   123: if_acmpeq -64 -> 59
    //   126: aload 7
    //   128: invokevirtual 137	com/tencent/kingkong/database/SQLiteDatabase:close	()V
    //   131: aload 7
    //   133: areturn
    //   134: aload_0
    //   135: getfield 85	com/tencent/kingkong/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   138: ifnonnull +32 -> 170
    //   141: aconst_null
    //   142: aload_0
    //   143: getfield 99	com/tencent/kingkong/database/SQLiteOpenHelper:mlockedDevice	Lcom/tencent/kingkong/database/SQLiteDatabase$LockedDevice;
    //   146: aload_0
    //   147: getfield 93	com/tencent/kingkong/database/SQLiteOpenHelper:mPassword	Ljava/lang/String;
    //   150: aload_0
    //   151: getfield 95	com/tencent/kingkong/database/SQLiteOpenHelper:mArithmeticl	Lcom/tencent/kingkong/database/SQLiteDatabase$Arithmetic;
    //   154: aload_0
    //   155: getfield 97	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitWaited	Z
    //   158: invokestatic 141	com/tencent/kingkong/database/SQLiteDatabase:create	(Lcom/tencent/kingkong/database/SQLiteDatabase$CursorFactory;Lcom/tencent/kingkong/database/SQLiteDatabase$LockedDevice;Ljava/lang/String;Lcom/tencent/kingkong/database/SQLiteDatabase$Arithmetic;Z)Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   161: astore 12
    //   163: aload 12
    //   165: astore 7
    //   167: goto -73 -> 94
    //   170: aload_0
    //   171: iconst_1
    //   172: putfield 101	com/tencent/kingkong/database/SQLiteOpenHelper:mNeedMode	Z
    //   175: aload_0
    //   176: getfield 143	com/tencent/kingkong/database/SQLiteOpenHelper:mEnableWriteAheadLogging	Z
    //   179: ifeq +61 -> 240
    //   182: bipush 8
    //   184: istore 10
    //   186: aload_0
    //   187: iload 10
    //   189: putfield 145	com/tencent/kingkong/database/SQLiteOpenHelper:mMode	I
    //   192: aload_0
    //   193: getfield 83	com/tencent/kingkong/database/SQLiteOpenHelper:mContext	Landroid/content/Context;
    //   196: aload_0
    //   197: getfield 85	com/tencent/kingkong/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   200: aload_0
    //   201: getfield 99	com/tencent/kingkong/database/SQLiteOpenHelper:mlockedDevice	Lcom/tencent/kingkong/database/SQLiteDatabase$LockedDevice;
    //   204: aload_0
    //   205: getfield 93	com/tencent/kingkong/database/SQLiteOpenHelper:mPassword	Ljava/lang/String;
    //   208: aload_0
    //   209: getfield 95	com/tencent/kingkong/database/SQLiteOpenHelper:mArithmeticl	Lcom/tencent/kingkong/database/SQLiteDatabase$Arithmetic;
    //   212: aload_0
    //   213: getfield 145	com/tencent/kingkong/database/SQLiteOpenHelper:mMode	I
    //   216: aload_0
    //   217: getfield 87	com/tencent/kingkong/database/SQLiteOpenHelper:mFactory	Lcom/tencent/kingkong/database/SQLiteDatabase$CursorFactory;
    //   220: aload_0
    //   221: getfield 91	com/tencent/kingkong/database/SQLiteOpenHelper:mErrorHandler	Lcom/tencent/kingkong/DatabaseErrorHandler;
    //   224: aload_0
    //   225: getfield 97	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitWaited	Z
    //   228: invokestatic 151	com/tencent/kingkong/support/Context:openOrCreateDatabase	(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/kingkong/database/SQLiteDatabase$LockedDevice;Ljava/lang/String;Lcom/tencent/kingkong/database/SQLiteDatabase$Arithmetic;ILcom/tencent/kingkong/database/SQLiteDatabase$CursorFactory;Lcom/tencent/kingkong/DatabaseErrorHandler;Z)Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   231: astore 11
    //   233: aload 11
    //   235: astore 7
    //   237: goto -143 -> 94
    //   240: iconst_0
    //   241: istore 10
    //   243: goto -57 -> 186
    //   246: astore 5
    //   248: iload_1
    //   249: ifeq +36 -> 285
    //   252: aload 5
    //   254: athrow
    //   255: astore_3
    //   256: aload_2
    //   257: astore 4
    //   259: aload_0
    //   260: iconst_0
    //   261: putfield 123	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitializing	Z
    //   264: aload 4
    //   266: ifnull +17 -> 283
    //   269: aload 4
    //   271: aload_0
    //   272: getfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   275: if_acmpeq +8 -> 283
    //   278: aload 4
    //   280: invokevirtual 137	com/tencent/kingkong/database/SQLiteDatabase:close	()V
    //   283: aload_3
    //   284: athrow
    //   285: getstatic 39	com/tencent/kingkong/database/SQLiteOpenHelper:TAG	Ljava/lang/String;
    //   288: new 68	java/lang/StringBuilder
    //   291: dup
    //   292: ldc 153
    //   294: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   297: aload_0
    //   298: getfield 85	com/tencent/kingkong/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   301: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: ldc 158
    //   306: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   312: iconst_1
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: aload 5
    //   320: aastore
    //   321: invokestatic 164	com/tencent/kingkong/support/Log:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: aload_0
    //   325: getfield 83	com/tencent/kingkong/database/SQLiteOpenHelper:mContext	Landroid/content/Context;
    //   328: aload_0
    //   329: getfield 85	com/tencent/kingkong/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   332: invokevirtual 170	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   335: invokevirtual 175	java/io/File:getPath	()Ljava/lang/String;
    //   338: aload_0
    //   339: getfield 99	com/tencent/kingkong/database/SQLiteOpenHelper:mlockedDevice	Lcom/tencent/kingkong/database/SQLiteDatabase$LockedDevice;
    //   342: aload_0
    //   343: getfield 93	com/tencent/kingkong/database/SQLiteOpenHelper:mPassword	Ljava/lang/String;
    //   346: aload_0
    //   347: getfield 95	com/tencent/kingkong/database/SQLiteOpenHelper:mArithmeticl	Lcom/tencent/kingkong/database/SQLiteDatabase$Arithmetic;
    //   350: aload_0
    //   351: getfield 87	com/tencent/kingkong/database/SQLiteOpenHelper:mFactory	Lcom/tencent/kingkong/database/SQLiteDatabase$CursorFactory;
    //   354: iconst_1
    //   355: aload_0
    //   356: getfield 91	com/tencent/kingkong/database/SQLiteOpenHelper:mErrorHandler	Lcom/tencent/kingkong/DatabaseErrorHandler;
    //   359: aload_0
    //   360: getfield 97	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitWaited	Z
    //   363: invokestatic 179	com/tencent/kingkong/database/SQLiteDatabase:openDatabase	(Ljava/lang/String;Lcom/tencent/kingkong/database/SQLiteDatabase$LockedDevice;Ljava/lang/String;Lcom/tencent/kingkong/database/SQLiteDatabase$Arithmetic;Lcom/tencent/kingkong/database/SQLiteDatabase$CursorFactory;ILcom/tencent/kingkong/DatabaseErrorHandler;Z)Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   366: astore 6
    //   368: aload 6
    //   370: astore 7
    //   372: goto -278 -> 94
    //   375: aload_0
    //   376: aload 7
    //   378: invokespecial 183	com/tencent/kingkong/database/SQLiteOpenHelper:getDatabaseLockedLast	(Lcom/tencent/kingkong/database/SQLiteDatabase;)Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   381: astore 9
    //   383: aload_0
    //   384: iconst_0
    //   385: putfield 123	com/tencent/kingkong/database/SQLiteOpenHelper:mIsInitializing	Z
    //   388: aload 7
    //   390: ifnull +17 -> 407
    //   393: aload 7
    //   395: aload_0
    //   396: getfield 115	com/tencent/kingkong/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/kingkong/database/SQLiteDatabase;
    //   399: if_acmpeq +8 -> 407
    //   402: aload 7
    //   404: invokevirtual 137	com/tencent/kingkong/database/SQLiteDatabase:close	()V
    //   407: aload 9
    //   409: areturn
    //   410: astore 8
    //   412: aload 7
    //   414: astore 4
    //   416: aload 8
    //   418: astore_3
    //   419: goto -160 -> 259
    //   422: aload_2
    //   423: astore 7
    //   425: goto -331 -> 94
    //
    // Exception table:
    //   from	to	target	type
    //   170	182	246	com/tencent/kingkong/database/SQLiteException
    //   186	233	246	com/tencent/kingkong/database/SQLiteException
    //   67	72	255	finally
    //   80	91	255	finally
    //   134	163	255	finally
    //   170	182	255	finally
    //   186	233	255	finally
    //   252	255	255	finally
    //   285	368	255	finally
    //   94	107	410	finally
    //   375	383	410	finally
  }

  private SQLiteDatabase getDatabaseLockedLast(SQLiteDatabase paramSQLiteDatabase)
  {
    onConfigure(paramSQLiteDatabase);
    int i = paramSQLiteDatabase.getVersion();
    if (i != this.mNewVersion)
    {
      if (paramSQLiteDatabase.isReadOnly())
        throw new SQLiteException("Can't upgrade read-only database from version " + paramSQLiteDatabase.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
      paramSQLiteDatabase.beginTransaction();
      if (i != 0)
        break label154;
    }
    while (true)
    {
      try
      {
        onCreate(paramSQLiteDatabase);
        paramSQLiteDatabase.setVersion(this.mNewVersion);
        paramSQLiteDatabase.setTransactionSuccessful();
        paramSQLiteDatabase.endTransaction();
        onOpen(paramSQLiteDatabase);
        if (paramSQLiteDatabase.isReadOnly())
          Log.w(TAG, "Opened " + this.mName + " in read-only mode");
        this.mDatabase = paramSQLiteDatabase;
        return paramSQLiteDatabase;
        label154: if (i > this.mNewVersion)
        {
          onDowngrade(paramSQLiteDatabase, i, this.mNewVersion);
          continue;
        }
      }
      finally
      {
        paramSQLiteDatabase.endTransaction();
      }
      onUpgrade(paramSQLiteDatabase, i, this.mNewVersion);
    }
  }

  public void OverInitWaitedDefault()
  {
    try
    {
      this.mDatabase.OverInitWaitedDefault();
      if (this.mNeedMode)
        com.tencent.kingkong.support.Context.OverInitWaitedDefault(this.mContext, this.mName, this.mMode);
      SQLiteDatabase localSQLiteDatabase = getDatabaseLockedLast(this.mDatabase);
      this.mIsInitializing = false;
      if ((localSQLiteDatabase != null) && (localSQLiteDatabase != this.mDatabase))
        localSQLiteDatabase.close();
      return;
    }
    finally
    {
      this.mIsInitializing = false;
      if ((0 != 0) && (this.mDatabase != null))
        null.close();
    }
  }

  public void close()
  {
    try
    {
      if (this.mIsInitializing)
        throw new IllegalStateException("Closed during initialization");
    }
    finally
    {
    }
    if ((this.mDatabase != null) && (this.mDatabase.isOpen()))
    {
      this.mDatabase.close();
      this.mDatabase = null;
    }
  }

  public String getDatabaseName()
  {
    return this.mName;
  }

  public SQLiteDatabase getReadableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getDatabaseLocked(false);
      return localSQLiteDatabase;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getDatabaseLocked(true);
      return localSQLiteDatabase;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void onConfigure(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  public abstract void onCreate(SQLiteDatabase paramSQLiteDatabase);

  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    throw new SQLiteException("Can't downgrade database from version " + paramInt1 + " to " + paramInt2);
  }

  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  public abstract void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2);

  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    try
    {
      if (this.mEnableWriteAheadLogging != paramBoolean)
        if ((this.mDatabase != null) && (this.mDatabase.isOpen()) && (!this.mDatabase.isReadOnly()))
        {
          if (!paramBoolean)
            break label57;
          this.mDatabase.enableWriteAheadLogging();
        }
      while (true)
      {
        this.mEnableWriteAheadLogging = paramBoolean;
        return;
        label57: this.mDatabase.disableWriteAheadLogging();
      }
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteOpenHelper
 * JD-Core Version:    0.6.2
 */