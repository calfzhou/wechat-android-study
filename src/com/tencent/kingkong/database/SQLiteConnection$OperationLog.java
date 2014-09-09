package com.tencent.kingkong.database;

import com.tencent.kingkong.support.Log;
import com.tencent.mm.dbsupport.newcursor.k;
import java.util.ArrayList;

final class SQLiteConnection$OperationLog
{
  private static final int COOKIE_GENERATION_SHIFT = 8;
  private static final int COOKIE_INDEX_MASK = 255;
  private static final int MAX_RECENT_OPERATIONS = 20;
  private int mGeneration;
  private int mIndex;
  private final SQLiteConnection.Operation[] mOperations = new SQLiteConnection.Operation[20];

  private boolean endOperationDeferLogLocked(String paramString, int paramInt)
  {
    SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
    if (localOperation != null)
    {
      localOperation.mEndTime = System.currentTimeMillis();
      localOperation.mFinished = true;
      if ((localOperation.mException != null) && (localOperation.mException.getMessage() != null))
        return true;
      switch (localOperation.type)
      {
      case 3:
      case 4:
      case 6:
      default:
      case 1:
      case 2:
      case 7:
      case 5:
      }
    }
    do
    {
      do
      {
        do
        {
          do
            return false;
          while (!SQLiteDebug.shouldLogSlowQuery(localOperation.mEndTime - localOperation.mStartTime));
          k.a(paramString, localOperation.mSql, localOperation.type, localOperation.mEndTime - localOperation.mStartTime);
          return true;
        }
        while (!SQLiteDebug.shouldLogSlowUpdate(localOperation.mEndTime - localOperation.mStartTime));
        k.a(paramString, localOperation.mSql, localOperation.type, localOperation.mEndTime - localOperation.mStartTime);
        return true;
      }
      while (!SQLiteDebug.shouldLogSlowPragma(localOperation.mEndTime - localOperation.mStartTime));
      k.a(paramString, localOperation.mSql, localOperation.type, localOperation.mEndTime - localOperation.mStartTime);
      return true;
    }
    while (!SQLiteDebug.shouldLogSlowTransation(localOperation.mEndTime - localOperation.mStartTime));
    k.a(paramString, localOperation.mSql, localOperation.type, localOperation.mEndTime - localOperation.mStartTime);
    return true;
  }

  private SQLiteConnection.Operation getOperationLocked(int paramInt)
  {
    int i = paramInt & 0xFF;
    SQLiteConnection.Operation localOperation = this.mOperations[i];
    if (localOperation.mCookie == paramInt)
      return localOperation;
    return null;
  }

  private void logOperationLocked(int paramInt, String paramString)
  {
    SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
    StringBuilder localStringBuilder = new StringBuilder();
    localOperation.describe(localStringBuilder, false);
    if (paramString != null)
      localStringBuilder.append(", ").append(paramString);
    Log.i("MicroMsg.kkdb.SQLiteConnection", localStringBuilder.toString());
  }

  private int newOperationCookieLocked(int paramInt)
  {
    int i = this.mGeneration;
    this.mGeneration = (i + 1);
    return paramInt | i << 8;
  }

  public final SQLiteConnection.Operation beginOperation(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    int i = 0;
    while (true)
    {
      SQLiteConnection.Operation localOperation;
      synchronized (this.mOperations)
      {
        int j = (1 + this.mIndex) % 20;
        localOperation = this.mOperations[j];
        if (localOperation == null)
        {
          localOperation = new SQLiteConnection.Operation(null);
          this.mOperations[j] = localOperation;
          localOperation.mStartTime = System.currentTimeMillis();
          localOperation.mKind = paramString1;
          localOperation.mSql = paramString2;
          if (paramArrayOfObject != null)
          {
            if (localOperation.mBindArgs == null)
            {
              localOperation.mBindArgs = new ArrayList();
              if (i < paramArrayOfObject.length)
                break label183;
            }
          }
          else
          {
            localOperation.mCookie = newOperationCookieLocked(j);
            this.mIndex = j;
            return localOperation;
          }
        }
        else
        {
          localOperation.mFinished = false;
          localOperation.mException = null;
          if (localOperation.mBindArgs == null)
            continue;
          localOperation.mBindArgs.clear();
        }
      }
      localOperation.mBindArgs.clear();
      i = 0;
      continue;
      label183: Object localObject2 = paramArrayOfObject[i];
      if ((localObject2 != null) && ((localObject2 instanceof byte[])))
        localOperation.mBindArgs.add(SQLiteConnection.access$2());
      else
        localOperation.mBindArgs.add(localObject2);
      i++;
    }
  }

  public final String describeCurrentOperation()
  {
    synchronized (this.mOperations)
    {
      SQLiteConnection.Operation localOperation = this.mOperations[this.mIndex];
      if ((localOperation != null) && (!localOperation.mFinished))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localOperation.describe(localStringBuilder, false);
        String str = localStringBuilder.toString();
        return str;
      }
      return null;
    }
  }

  public final void dump(boolean paramBoolean)
  {
    while (true)
    {
      SQLiteConnection.Operation localOperation2;
      synchronized (this.mOperations)
      {
        Log.i("MicroMsg.kkdb.SQLiteConnection", "  Most recently executed operations:");
        i = this.mIndex;
        SQLiteConnection.Operation localOperation1 = this.mOperations[i];
        if (localOperation1 != null)
        {
          localObject2 = localOperation1;
          int j = 0;
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("    ").append(j).append(": [");
          localStringBuilder.append(SQLiteConnection.Operation.access$1((SQLiteConnection.Operation)localObject2));
          localStringBuilder.append("] ");
          ((SQLiteConnection.Operation)localObject2).describe(localStringBuilder, paramBoolean);
          Log.i("MicroMsg.kkdb.SQLiteConnection", localStringBuilder.toString());
          if (i <= 0)
            break label169;
          k = i - 1;
          j++;
          localOperation2 = this.mOperations[k];
          if ((localOperation2 != null) && (j < 20));
        }
        else
        {
          Log.i("MicroMsg.kkdb.SQLiteConnection", "    <none>");
        }
      }
      int i = k;
      Object localObject2 = localOperation2;
      continue;
      label169: int k = 19;
    }
  }

  public final void endOperation(String paramString, int paramInt)
  {
    synchronized (this.mOperations)
    {
      if (endOperationDeferLogLocked(paramString, paramInt))
        logOperationLocked(paramInt, null);
      return;
    }
  }

  public final boolean endOperationDeferLog(String paramString, int paramInt)
  {
    synchronized (this.mOperations)
    {
      boolean bool = endOperationDeferLogLocked(paramString, paramInt);
      return bool;
    }
  }

  public final void failOperation(int paramInt, Exception paramException)
  {
    synchronized (this.mOperations)
    {
      SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
      if (localOperation != null)
        localOperation.mException = paramException;
      return;
    }
  }

  public final void logOperation(int paramInt, String paramString)
  {
    synchronized (this.mOperations)
    {
      logOperationLocked(paramInt, paramString);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteConnection.OperationLog
 * JD-Core Version:    0.6.2
 */