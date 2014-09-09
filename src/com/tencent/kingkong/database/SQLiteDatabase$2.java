package com.tencent.kingkong.database;

import java.io.File;
import java.io.FileFilter;

class SQLiteDatabase$2
  implements FileFilter
{
  SQLiteDatabase$2(String paramString)
  {
  }

  public boolean accept(File paramFile)
  {
    return paramFile.getName().startsWith(this.val$prefix);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDatabase.2
 * JD-Core Version:    0.6.2
 */