package com.tencent.kingkong.support;

import android.content.pm.ApplicationInfo;
import com.tencent.kingkong.DatabaseErrorHandler;
import com.tencent.kingkong.FileUtils;
import com.tencent.kingkong.database.SQLiteDatabase;
import com.tencent.kingkong.database.SQLiteDatabase.Arithmetic;
import com.tencent.kingkong.database.SQLiteDatabase.CursorFactory;
import com.tencent.kingkong.database.SQLiteDatabase.LockedDevice;
import java.io.File;

public final class Context
{
  public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;

  public static void OverInitWaitedDefault(android.content.Context paramContext, String paramString, int paramInt)
  {
    setFilePermissionsFromMode(validateFilePath(paramContext, paramString, true).getPath(), paramInt, 0);
  }

  private static File getDataDirFile(android.content.Context paramContext)
  {
    if (paramContext != null)
    {
      String str = paramContext.getApplicationInfo().dataDir;
      if (str != null)
        return new File(str);
      return null;
    }
    throw new RuntimeException("Not supported in system context");
  }

  private static File getDatabasesDir(android.content.Context paramContext)
  {
    File localFile = new File(getDataDirFile(paramContext), "databases");
    if (localFile.getPath().equals("databases"))
      localFile = new File("/data/system");
    return localFile;
  }

  private static File makeFilename(File paramFile, String paramString)
  {
    if (paramString.indexOf(File.separatorChar) < 0)
      return new File(paramFile, paramString);
    throw new IllegalArgumentException("File " + paramString + " contains a path separator");
  }

  public static SQLiteDatabase openOrCreateDatabase(android.content.Context paramContext, String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, boolean paramBoolean)
  {
    File localFile = validateFilePath(paramContext, paramString1, true);
    int i = 268435456;
    if ((paramInt & 0x8) != 0)
      i = 805306368;
    SQLiteDatabase localSQLiteDatabase = SQLiteDatabase.openDatabase(localFile.getPath(), paramLockedDevice, paramString2, paramArithmetic, paramCursorFactory, i, paramDatabaseErrorHandler, paramBoolean, 1);
    if (!paramBoolean)
      setFilePermissionsFromMode(localFile.getPath(), paramInt, 0);
    return localSQLiteDatabase;
  }

  public static SQLiteDatabase openOrCreateDatabase(android.content.Context paramContext, String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, boolean paramBoolean)
  {
    return openOrCreateDatabase(paramContext, paramString1, paramLockedDevice, paramString2, paramArithmetic, paramInt, paramCursorFactory, null, paramBoolean);
  }

  private static void setFilePermissionsFromMode(String paramString, int paramInt1, int paramInt2)
  {
    int i = paramInt2 | 0x1B0;
    if ((paramInt1 & 0x1) != 0)
      i |= 4;
    if ((paramInt1 & 0x2) != 0)
      i |= 2;
    FileUtils.setPermissions(paramString, i, -1, -1);
  }

  private static File validateFilePath(android.content.Context paramContext, String paramString, boolean paramBoolean)
  {
    File localFile1;
    if (paramString.charAt(0) == File.separatorChar)
      localFile1 = new File(paramString.substring(0, paramString.lastIndexOf(File.separatorChar)));
    for (File localFile2 = new File(localFile1, paramString.substring(paramString.lastIndexOf(File.separatorChar))); ; localFile2 = makeFilename(localFile1, paramString))
    {
      if ((paramBoolean) && (!localFile1.isDirectory()) && (localFile1.mkdir()))
        FileUtils.setPermissions(localFile1.getPath(), 505, -1, -1);
      return localFile2;
      localFile1 = getDatabasesDir(paramContext);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.support.Context
 * JD-Core Version:    0.6.2
 */