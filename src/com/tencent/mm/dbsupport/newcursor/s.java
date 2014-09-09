package com.tencent.mm.dbsupport.newcursor;

import com.tencent.kingkong.database.SQLiteDatabase;
import com.tencent.kingkong.database.SQLiteProgram;
import com.tencent.kingkong.support.CancellationSignal;

public final class s extends SQLiteProgram
{
  private final CancellationSignal mCancellationSignal;

  s(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    super(paramSQLiteDatabase, paramString, null, paramCancellationSignal);
    this.mCancellationSignal = paramCancellationSignal;
  }

  // ERROR //
  final int a(b paramb, int paramInt1, int paramInt2, e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 23	com/tencent/mm/dbsupport/newcursor/s:acquireReference	()V
    //   4: aload_1
    //   5: ifnull +7 -> 12
    //   8: aload_1
    //   9: invokevirtual 26	com/tencent/mm/dbsupport/newcursor/b:acquireReference	()V
    //   12: aload_0
    //   13: invokevirtual 30	com/tencent/mm/dbsupport/newcursor/s:getSession	()Lcom/tencent/kingkong/database/SQLiteSession;
    //   16: aload_0
    //   17: invokevirtual 34	com/tencent/mm/dbsupport/newcursor/s:getSql	()Ljava/lang/String;
    //   20: aload_0
    //   21: invokevirtual 38	com/tencent/mm/dbsupport/newcursor/s:getBindArgs	()[Ljava/lang/Object;
    //   24: aload_0
    //   25: invokevirtual 42	com/tencent/mm/dbsupport/newcursor/s:getConnectionFlags	()I
    //   28: iload_2
    //   29: iload_3
    //   30: aload_1
    //   31: aload 4
    //   33: invokevirtual 48	com/tencent/kingkong/database/SQLiteSession:executeForCursorWindow	(Ljava/lang/String;[Ljava/lang/Object;IIILcom/tencent/mm/dbsupport/newcursor/b;Lcom/tencent/mm/dbsupport/newcursor/e;)I
    //   36: istore 9
    //   38: aload_1
    //   39: ifnull +7 -> 46
    //   42: aload_1
    //   43: invokevirtual 51	com/tencent/mm/dbsupport/newcursor/b:releaseReference	()V
    //   46: aload_0
    //   47: invokevirtual 52	com/tencent/mm/dbsupport/newcursor/s:releaseReference	()V
    //   50: iload 9
    //   52: ireturn
    //   53: astore 8
    //   55: aload_0
    //   56: invokevirtual 55	com/tencent/mm/dbsupport/newcursor/s:onCorruption	()V
    //   59: aload 8
    //   61: athrow
    //   62: astore 6
    //   64: aload_1
    //   65: ifnull +7 -> 72
    //   68: aload_1
    //   69: invokevirtual 51	com/tencent/mm/dbsupport/newcursor/b:releaseReference	()V
    //   72: aload 6
    //   74: athrow
    //   75: astore 7
    //   77: aload_0
    //   78: invokevirtual 52	com/tencent/mm/dbsupport/newcursor/s:releaseReference	()V
    //   81: aload 7
    //   83: athrow
    //   84: astore 5
    //   86: ldc 57
    //   88: new 59	java/lang/StringBuilder
    //   91: dup
    //   92: ldc 61
    //   94: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   97: aload 5
    //   99: invokevirtual 67	com/tencent/kingkong/database/SQLiteException:getMessage	()Ljava/lang/String;
    //   102: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: ldc 73
    //   107: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: aload_0
    //   111: invokevirtual 34	com/tencent/mm/dbsupport/newcursor/s:getSql	()Ljava/lang/String;
    //   114: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: invokestatic 82	com/tencent/kingkong/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: aload 5
    //   125: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   12	38	53	com/tencent/kingkong/database/SQLiteDatabaseCorruptException
    //   12	38	62	finally
    //   55	62	62	finally
    //   86	126	62	finally
    //   8	12	75	finally
    //   42	46	75	finally
    //   68	72	75	finally
    //   72	75	75	finally
    //   12	38	84	com/tencent/kingkong/database/SQLiteException
  }

  public final String toString()
  {
    return "SQLiteNewQuery: " + getSql();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.s
 * JD-Core Version:    0.6.2
 */