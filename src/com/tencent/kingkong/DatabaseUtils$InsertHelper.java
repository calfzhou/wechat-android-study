package com.tencent.kingkong;

import android.content.ContentValues;
import com.tencent.kingkong.database.SQLiteDatabase;
import com.tencent.kingkong.database.SQLiteStatement;
import com.tencent.kingkong.support.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

@Deprecated
public class DatabaseUtils$InsertHelper
{
  public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
  public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
  private HashMap mColumns;
  private final SQLiteDatabase mDb;
  private String mInsertSQL = null;
  private SQLiteStatement mInsertStatement = null;
  private SQLiteStatement mPreparedStatement = null;
  private SQLiteStatement mReplaceStatement = null;
  private final String mTableName;

  public DatabaseUtils$InsertHelper(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    this.mDb = paramSQLiteDatabase;
    this.mTableName = paramString;
  }

  private void buildSQL()
  {
    Cursor localCursor = null;
    StringBuilder localStringBuilder1 = new StringBuilder(128);
    localStringBuilder1.append("INSERT INTO ");
    localStringBuilder1.append(this.mTableName);
    localStringBuilder1.append(" (");
    StringBuilder localStringBuilder2 = new StringBuilder(128);
    localStringBuilder2.append("VALUES (");
    while (true)
    {
      try
      {
        localCursor = this.mDb.rawQuery("PRAGMA table_info(" + this.mTableName + ")", null);
        this.mColumns = new HashMap(localCursor.getCount());
        int i = 1;
        boolean bool = localCursor.moveToNext();
        if (!bool)
        {
          if (localCursor != null)
            localCursor.close();
          localStringBuilder1.append(localStringBuilder2);
          this.mInsertSQL = localStringBuilder1.toString();
          return;
        }
        String str1 = localCursor.getString(1);
        String str2 = localCursor.getString(4);
        this.mColumns.put(str1, Integer.valueOf(i));
        localStringBuilder1.append("'");
        localStringBuilder1.append(str1);
        localStringBuilder1.append("'");
        if (str2 == null)
        {
          localStringBuilder2.append("?");
          if (i != localCursor.getCount())
            break label308;
          str3 = ") ";
          localStringBuilder1.append(str3);
          if (i != localCursor.getCount())
            break label315;
          str4 = ");";
          localStringBuilder2.append(str4);
          i++;
          continue;
        }
        localStringBuilder2.append("COALESCE(?, ");
        localStringBuilder2.append(str2);
        localStringBuilder2.append(")");
        continue;
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
      label308: String str3 = ", ";
      continue;
      label315: String str4 = ", ";
    }
  }

  private SQLiteStatement getStatement(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.mReplaceStatement == null)
      {
        if (this.mInsertSQL == null)
          buildSQL();
        String str = "INSERT OR REPLACE" + this.mInsertSQL.substring(6);
        this.mReplaceStatement = this.mDb.compileStatement(str);
      }
      return this.mReplaceStatement;
    }
    if (this.mInsertStatement == null)
    {
      if (this.mInsertSQL == null)
        buildSQL();
      this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
    }
    return this.mInsertStatement;
  }

  private long insertInternal(ContentValues paramContentValues, boolean paramBoolean)
  {
    this.mDb.beginTransactionNonExclusive();
    try
    {
      SQLiteStatement localSQLiteStatement = getStatement(paramBoolean);
      localSQLiteStatement.clearBindings();
      Iterator localIterator = paramContentValues.valueSet().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
        {
          long l = localSQLiteStatement.executeInsert();
          this.mDb.setTransactionSuccessful();
          return l;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        DatabaseUtils.bindObjectToProgram(localSQLiteStatement, getColumnIndex((String)localEntry.getKey()), localEntry.getValue());
      }
    }
    catch (SQLException localSQLException)
    {
      Log.e("DatabaseUtils", "Error inserting " + paramContentValues + " into table  " + this.mTableName, new Object[] { localSQLException });
      return -1L;
    }
    finally
    {
      this.mDb.endTransaction();
    }
  }

  public void bind(int paramInt, double paramDouble)
  {
    this.mPreparedStatement.bindDouble(paramInt, paramDouble);
  }

  public void bind(int paramInt, float paramFloat)
  {
    this.mPreparedStatement.bindDouble(paramInt, paramFloat);
  }

  public void bind(int paramInt1, int paramInt2)
  {
    this.mPreparedStatement.bindLong(paramInt1, paramInt2);
  }

  public void bind(int paramInt, long paramLong)
  {
    this.mPreparedStatement.bindLong(paramInt, paramLong);
  }

  public void bind(int paramInt, String paramString)
  {
    if (paramString == null)
    {
      this.mPreparedStatement.bindNull(paramInt);
      return;
    }
    this.mPreparedStatement.bindString(paramInt, paramString);
  }

  public void bind(int paramInt, boolean paramBoolean)
  {
    SQLiteStatement localSQLiteStatement = this.mPreparedStatement;
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localSQLiteStatement.bindLong(paramInt, i);
      return;
    }
  }

  public void bind(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      this.mPreparedStatement.bindNull(paramInt);
      return;
    }
    this.mPreparedStatement.bindBlob(paramInt, paramArrayOfByte);
  }

  public void bindNull(int paramInt)
  {
    this.mPreparedStatement.bindNull(paramInt);
  }

  public void close()
  {
    if (this.mInsertStatement != null)
    {
      this.mInsertStatement.close();
      this.mInsertStatement = null;
    }
    if (this.mReplaceStatement != null)
    {
      this.mReplaceStatement.close();
      this.mReplaceStatement = null;
    }
    this.mInsertSQL = null;
    this.mColumns = null;
  }

  public long execute()
  {
    if (this.mPreparedStatement == null)
      throw new IllegalStateException("you must prepare this inserter before calling execute");
    try
    {
      long l = this.mPreparedStatement.executeInsert();
      return l;
    }
    catch (SQLException localSQLException)
    {
      Log.e("DatabaseUtils", "Error executing InsertHelper with table " + this.mTableName, new Object[] { localSQLException });
      return -1L;
    }
    finally
    {
      this.mPreparedStatement = null;
    }
  }

  public int getColumnIndex(String paramString)
  {
    getStatement(false);
    Integer localInteger = (Integer)this.mColumns.get(paramString);
    if (localInteger == null)
      throw new IllegalArgumentException("column '" + paramString + "' is invalid");
    return localInteger.intValue();
  }

  public long insert(ContentValues paramContentValues)
  {
    return insertInternal(paramContentValues, false);
  }

  public void prepareForInsert()
  {
    this.mPreparedStatement = getStatement(false);
    this.mPreparedStatement.clearBindings();
  }

  public void prepareForReplace()
  {
    this.mPreparedStatement = getStatement(true);
    this.mPreparedStatement.clearBindings();
  }

  public long replace(ContentValues paramContentValues)
  {
    return insertInternal(paramContentValues, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.DatabaseUtils.InsertHelper
 * JD-Core Version:    0.6.2
 */