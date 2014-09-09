package com.tencent.kingkong.database;

import com.tencent.kingkong.support.Log;
import com.tencent.kingkong.support.LruCache;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class SQLiteConnection$PreparedStatementCache extends LruCache
{
  public SQLiteConnection$PreparedStatementCache(SQLiteConnection paramSQLiteConnection, int paramInt)
  {
    super(paramInt);
  }

  public final void dump()
  {
    Log.i("MicroMsg.kkdb.SQLiteConnection", "  Prepared statement cache:");
    Map localMap = snapshot();
    if (!localMap.isEmpty())
    {
      Iterator localIterator = localMap.entrySet().iterator();
      for (int i = 0; ; i++)
      {
        if (!localIterator.hasNext())
          return;
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        SQLiteConnection.PreparedStatement localPreparedStatement = (SQLiteConnection.PreparedStatement)localEntry.getValue();
        if (localPreparedStatement.mInCache)
        {
          String str = (String)localEntry.getKey();
          Log.i("MicroMsg.kkdb.SQLiteConnection", "    " + i + ": statementPtr=0x" + Integer.toHexString(localPreparedStatement.mStatementPtr) + ", numParameters=" + localPreparedStatement.mNumParameters + ", type=" + localPreparedStatement.mType + ", readOnly=" + localPreparedStatement.mReadOnly + ", sql=\"" + SQLiteConnection.access$1(str) + "\"");
        }
      }
    }
    Log.i("MicroMsg.kkdb.SQLiteConnection", "    <none>");
  }

  protected final void entryRemoved(boolean paramBoolean, String paramString, SQLiteConnection.PreparedStatement paramPreparedStatement1, SQLiteConnection.PreparedStatement paramPreparedStatement2)
  {
    paramPreparedStatement1.mInCache = false;
    if (!paramPreparedStatement1.mInUse)
      SQLiteConnection.access$0(this.this$0, paramPreparedStatement1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteConnection.PreparedStatementCache
 * JD-Core Version:    0.6.2
 */