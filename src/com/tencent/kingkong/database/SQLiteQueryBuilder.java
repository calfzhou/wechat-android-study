package com.tencent.kingkong.database;

import android.text.TextUtils;
import com.tencent.kingkong.Cursor;
import com.tencent.kingkong.DatabaseUtils;
import com.tencent.kingkong.support.CancellationSignal;
import com.tencent.kingkong.support.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLiteQueryBuilder
{
  private static final String TAG = "MicroMsg.kkdb.SQLiteQueryBuilder";
  private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
  private boolean mDistinct = false;
  private SQLiteDatabase.CursorFactory mFactory = null;
  private Map mProjectionMap = null;
  private boolean mStrict;
  private String mTables = "";
  private StringBuilder mWhereClause = null;

  private static void appendClause(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2))
    {
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append(paramString2);
    }
  }

  public static void appendColumns(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        paramStringBuilder.append(' ');
        return;
      }
      String str = paramArrayOfString[j];
      if (str != null)
      {
        if (j > 0)
          paramStringBuilder.append(", ");
        paramStringBuilder.append(str);
      }
    }
  }

  public static String buildQueryString(boolean paramBoolean, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    if ((TextUtils.isEmpty(paramString3)) && (!TextUtils.isEmpty(paramString4)))
      throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
    if ((!TextUtils.isEmpty(paramString6)) && (!sLimitPattern.matcher(paramString6).matches()))
      throw new IllegalArgumentException("invalid LIMIT clauses:" + paramString6);
    StringBuilder localStringBuilder = new StringBuilder(120);
    localStringBuilder.append("SELECT ");
    if (paramBoolean)
      localStringBuilder.append("DISTINCT ");
    if ((paramArrayOfString != null) && (paramArrayOfString.length != 0))
      appendColumns(localStringBuilder, paramArrayOfString);
    while (true)
    {
      localStringBuilder.append("FROM ");
      localStringBuilder.append(paramString1);
      appendClause(localStringBuilder, " WHERE ", paramString2);
      appendClause(localStringBuilder, " GROUP BY ", paramString3);
      appendClause(localStringBuilder, " HAVING ", paramString4);
      appendClause(localStringBuilder, " ORDER BY ", paramString5);
      appendClause(localStringBuilder, " LIMIT ", paramString6);
      return localStringBuilder.toString();
      localStringBuilder.append("* ");
    }
  }

  private String[] computeProjection(String[] paramArrayOfString)
  {
    String[] arrayOfString;
    int m;
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      if (this.mProjectionMap != null)
      {
        arrayOfString = new String[paramArrayOfString.length];
        int k = paramArrayOfString.length;
        m = 0;
        if (m < k)
          break label42;
        paramArrayOfString = arrayOfString;
      }
    while (true)
    {
      return paramArrayOfString;
      label42: String str1 = paramArrayOfString[m];
      String str2 = (String)this.mProjectionMap.get(str1);
      if (str2 != null)
        arrayOfString[m] = str2;
      while (true)
      {
        m++;
        break;
        if ((this.mStrict) || ((!str1.contains(" AS ")) && (!str1.contains(" as "))))
          break label119;
        arrayOfString[m] = str1;
      }
      label119: throw new IllegalArgumentException("Invalid column " + paramArrayOfString[m]);
      if (this.mProjectionMap == null)
        break label248;
      Set localSet = this.mProjectionMap.entrySet();
      paramArrayOfString = new String[localSet.size()];
      Iterator localIterator = localSet.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (!((String)localEntry.getKey()).equals("_count"))
        {
          int j = i + 1;
          paramArrayOfString[i] = ((String)localEntry.getValue());
          i = j;
        }
      }
    }
    label248: return null;
  }

  private void validateQuerySql(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    paramSQLiteDatabase.getThreadSession().prepare(paramString, paramSQLiteDatabase.getThreadDefaultConnectionFlags(true), paramCancellationSignal, null);
  }

  public void appendWhere(CharSequence paramCharSequence)
  {
    if (this.mWhereClause == null)
      this.mWhereClause = new StringBuilder(16 + paramCharSequence.length());
    if (this.mWhereClause.length() == 0)
      this.mWhereClause.append('(');
    this.mWhereClause.append(paramCharSequence);
  }

  public void appendWhereEscapeString(String paramString)
  {
    if (this.mWhereClause == null)
      this.mWhereClause = new StringBuilder(16 + paramString.length());
    if (this.mWhereClause.length() == 0)
      this.mWhereClause.append('(');
    DatabaseUtils.appendEscapedSQLString(this.mWhereClause, paramString);
  }

  public String buildQuery(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    String[] arrayOfString = computeProjection(paramArrayOfString);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((this.mWhereClause != null) && (this.mWhereClause.length() > 0));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localStringBuilder.append(this.mWhereClause.toString());
        localStringBuilder.append(')');
      }
      if ((paramString1 != null) && (paramString1.length() > 0))
      {
        if (i != 0)
          localStringBuilder.append(" AND ");
        localStringBuilder.append('(');
        localStringBuilder.append(paramString1);
        localStringBuilder.append(')');
      }
      return buildQueryString(this.mDistinct, this.mTables, arrayOfString, localStringBuilder.toString(), paramString2, paramString3, paramString4, paramString5);
    }
  }

  @Deprecated
  public String buildQuery(String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return buildQuery(paramArrayOfString1, paramString1, paramString2, paramString3, paramString4, paramString5);
  }

  public String buildUnionQuery(String[] paramArrayOfString, String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    int i = paramArrayOfString.length;
    String str;
    if (this.mDistinct)
      str = " UNION ";
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        appendClause(localStringBuilder, " ORDER BY ", paramString1);
        appendClause(localStringBuilder, " LIMIT ", paramString2);
        return localStringBuilder.toString();
        str = " UNION ALL ";
        break;
      }
      if (j > 0)
        localStringBuilder.append(str);
      localStringBuilder.append(paramArrayOfString[j]);
    }
  }

  public String buildUnionSubQuery(String paramString1, String[] paramArrayOfString, Set paramSet, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    int i = paramArrayOfString.length;
    String[] arrayOfString = new String[i];
    int j = 0;
    if (j >= i)
      return buildQuery(arrayOfString, paramString3, paramString4, paramString5, null, null);
    String str = paramArrayOfString[j];
    if (str.equals(paramString1))
      arrayOfString[j] = ("'" + paramString2 + "' AS " + paramString1);
    while (true)
    {
      j++;
      break;
      if ((j <= paramInt) || (paramSet.contains(str)))
        arrayOfString[j] = str;
      else
        arrayOfString[j] = ("NULL AS " + str);
    }
  }

  @Deprecated
  public String buildUnionSubQuery(String paramString1, String[] paramArrayOfString1, Set paramSet, int paramInt, String paramString2, String paramString3, String[] paramArrayOfString2, String paramString4, String paramString5)
  {
    return buildUnionSubQuery(paramString1, paramArrayOfString1, paramSet, paramInt, paramString2, paramString3, paramString4, paramString5);
  }

  public String getTables()
  {
    return this.mTables;
  }

  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4)
  {
    return query(paramSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramString3, paramString4, null, null);
  }

  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return query(paramSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramString3, paramString4, paramString5, null);
  }

  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5, CancellationSignal paramCancellationSignal)
  {
    if (this.mTables == null)
      return null;
    if ((this.mStrict) && (paramString1 != null) && (paramString1.length() > 0))
      validateQuerySql(paramSQLiteDatabase, buildQuery(paramArrayOfString1, "(" + paramString1 + ")", paramString2, paramString3, paramString4, paramString5), paramCancellationSignal);
    String str = buildQuery(paramArrayOfString1, paramString1, paramString2, paramString3, paramString4, paramString5);
    Log.d("MicroMsg.kkdb.SQLiteQueryBuilder", "Performing query: " + str);
    return paramSQLiteDatabase.rawQueryWithFactory(this.mFactory, str, paramArrayOfString2, SQLiteDatabase.findEditTable(this.mTables), paramCancellationSignal);
  }

  public void setCursorFactory(SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    this.mFactory = paramCursorFactory;
  }

  public void setDistinct(boolean paramBoolean)
  {
    this.mDistinct = paramBoolean;
  }

  public void setProjectionMap(Map paramMap)
  {
    this.mProjectionMap = paramMap;
  }

  public void setStrict(boolean paramBoolean)
  {
    this.mStrict = paramBoolean;
  }

  public void setTables(String paramString)
  {
    this.mTables = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteQueryBuilder
 * JD-Core Version:    0.6.2
 */