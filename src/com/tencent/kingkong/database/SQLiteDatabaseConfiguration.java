package com.tencent.kingkong.database;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SQLiteDatabaseConfiguration
{
  private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
  public static final String MEMORY_DB_PATH = ":memory:";
  public final ArrayList customFunctions = new ArrayList();
  public boolean foreignKeyConstraintsEnabled;
  public final String label;
  public Locale locale;
  public int maxSqlCacheSize;
  public int openFlags;
  public final String path;

  public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    if (paramSQLiteDatabaseConfiguration == null)
      throw new IllegalArgumentException("other must not be null.");
    this.path = paramSQLiteDatabaseConfiguration.path;
    this.label = paramSQLiteDatabaseConfiguration.label;
    updateParametersFrom(paramSQLiteDatabaseConfiguration);
  }

  public SQLiteDatabaseConfiguration(String paramString, int paramInt)
  {
    if (paramString == null)
      throw new IllegalArgumentException("path must not be null.");
    this.path = paramString;
    this.label = stripPathForLogs(paramString);
    this.openFlags = paramInt;
    this.maxSqlCacheSize = 25;
    this.locale = Locale.getDefault();
  }

  private static String stripPathForLogs(String paramString)
  {
    if (paramString.indexOf('@') == -1)
      return paramString;
    return EMAIL_IN_DB_PATTERN.matcher(paramString).replaceAll("XX@YY");
  }

  public final boolean isInMemoryDb()
  {
    return this.path.equalsIgnoreCase(":memory:");
  }

  public final void updateParametersFrom(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    if (paramSQLiteDatabaseConfiguration == null)
      throw new IllegalArgumentException("other must not be null.");
    if (!this.path.equals(paramSQLiteDatabaseConfiguration.path))
      throw new IllegalArgumentException("other configuration must refer to the same database.");
    this.openFlags = paramSQLiteDatabaseConfiguration.openFlags;
    this.maxSqlCacheSize = paramSQLiteDatabaseConfiguration.maxSqlCacheSize;
    this.locale = paramSQLiteDatabaseConfiguration.locale;
    this.foreignKeyConstraintsEnabled = paramSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
    this.customFunctions.clear();
    this.customFunctions.addAll(paramSQLiteDatabaseConfiguration.customFunctions);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDatabaseConfiguration
 * JD-Core Version:    0.6.2
 */