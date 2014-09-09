package com.tencent.kingkong.database;

import com.tencent.kingkong.support.CancellationSignal;

public final class SQLiteQuery extends SQLiteProgram
{
  private static final String TAG = "MicroMsg.kkdb.SQLiteQuery";
  private final CancellationSignal mCancellationSignal;

  SQLiteQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    super(paramSQLiteDatabase, paramString, null, paramCancellationSignal);
    this.mCancellationSignal = paramCancellationSignal;
  }

  // ERROR //
  final int fillWindow(com.tencent.kingkong.CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 27	com/tencent/kingkong/database/SQLiteQuery:acquireReference	()V
    //   4: aload_1
    //   5: invokevirtual 30	com/tencent/kingkong/CursorWindow:acquireReference	()V
    //   8: aload_0
    //   9: invokevirtual 34	com/tencent/kingkong/database/SQLiteQuery:getSession	()Lcom/tencent/kingkong/database/SQLiteSession;
    //   12: aload_0
    //   13: invokevirtual 38	com/tencent/kingkong/database/SQLiteQuery:getSql	()Ljava/lang/String;
    //   16: aload_0
    //   17: invokevirtual 42	com/tencent/kingkong/database/SQLiteQuery:getBindArgs	()[Ljava/lang/Object;
    //   20: aload_1
    //   21: iload_2
    //   22: iload_3
    //   23: iload 4
    //   25: aload_0
    //   26: invokevirtual 46	com/tencent/kingkong/database/SQLiteQuery:getConnectionFlags	()I
    //   29: aload_0
    //   30: getfield 17	com/tencent/kingkong/database/SQLiteQuery:mCancellationSignal	Lcom/tencent/kingkong/support/CancellationSignal;
    //   33: invokevirtual 52	com/tencent/kingkong/database/SQLiteSession:executeForCursorWindow	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/CursorWindow;IIZILcom/tencent/kingkong/support/CancellationSignal;)I
    //   36: istore 9
    //   38: aload_1
    //   39: invokevirtual 55	com/tencent/kingkong/CursorWindow:releaseReference	()V
    //   42: aload_0
    //   43: invokevirtual 56	com/tencent/kingkong/database/SQLiteQuery:releaseReference	()V
    //   46: iload 9
    //   48: ireturn
    //   49: astore 8
    //   51: aload_0
    //   52: invokevirtual 59	com/tencent/kingkong/database/SQLiteQuery:onCorruption	()V
    //   55: aload 8
    //   57: athrow
    //   58: astore 7
    //   60: aload_1
    //   61: invokevirtual 55	com/tencent/kingkong/CursorWindow:releaseReference	()V
    //   64: aload 7
    //   66: athrow
    //   67: astore 5
    //   69: aload_0
    //   70: invokevirtual 56	com/tencent/kingkong/database/SQLiteQuery:releaseReference	()V
    //   73: aload 5
    //   75: athrow
    //   76: astore 6
    //   78: ldc 8
    //   80: new 61	java/lang/StringBuilder
    //   83: dup
    //   84: ldc 63
    //   86: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: aload 6
    //   91: invokevirtual 69	com/tencent/kingkong/database/SQLiteException:getMessage	()Ljava/lang/String;
    //   94: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc 75
    //   99: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aload_0
    //   103: invokevirtual 38	com/tencent/kingkong/database/SQLiteQuery:getSql	()Ljava/lang/String;
    //   106: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokestatic 84	com/tencent/kingkong/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   115: aload 6
    //   117: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   8	38	49	com/tencent/kingkong/database/SQLiteDatabaseCorruptException
    //   8	38	58	finally
    //   51	58	58	finally
    //   78	118	58	finally
    //   4	8	67	finally
    //   38	42	67	finally
    //   60	67	67	finally
    //   8	38	76	com/tencent/kingkong/database/SQLiteException
  }

  public final String toString()
  {
    return "SQLiteQuery: " + getSql();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteQuery
 * JD-Core Version:    0.6.2
 */