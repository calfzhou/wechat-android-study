package com.tencent.mm.as;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.kingkong.database.SQLiteDatabase;
import com.tencent.kingkong.database.SQLiteDatabase.Arithmetic;
import com.tencent.mm.dbsupport.newcursor.c;
import com.tencent.mm.dbsupport.newcursor.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;
import junit.framework.Assert;

final class e
{
  private SQLiteDatabase ilh = null;
  private SQLiteDatabase ili = null;
  private boolean ilj = false;

  public static e M(String paramString, boolean paramBoolean)
  {
    e locale = new e();
    if ((paramString == null) || (paramString.length() == 0))
    {
      locale.ili = SQLiteDatabase.create(null);
      locale.ilj = true;
      if (locale.ili != null);
    }
    while (true)
    {
      return null;
      return locale;
      if (paramBoolean);
      try
      {
        for (locale.ili = SQLiteDatabase.openOrCreateDatabaseInWalMode(paramString, null, SQLiteDatabase.Arithmetic.UNKNOWN, null); locale.ili != null; locale.ili = SQLiteDatabase.openOrCreateDatabase(paramString, null, 1))
          label60: return locale;
      }
      catch (Exception localException)
      {
        break label60;
      }
    }
  }

  public static boolean a(e parame, String paramString)
  {
    boolean bool;
    if ((parame == null) || (paramString == null))
    {
      Object[] arrayOfObject = new Object[2];
      if (parame == null)
      {
        bool = true;
        arrayOfObject[0] = Boolean.valueOf(bool);
        arrayOfObject[1] = paramString;
        z.e("!44@/B4Tb64lLpIqYzU7qGnF+O5q3+hkC6HqZPBSz0X7XPA=", "[arthurdan.checkTableExist] Notice!!! null == db: %b, table: %s", arrayOfObject);
      }
    }
    int i;
    do
    {
      Cursor localCursor;
      do
      {
        return false;
        bool = false;
        break;
        localCursor = parame.rawQuery("select tbl_name from sqlite_master  where type = \"table\" and tbl_name=\"" + paramString + "\"", null);
      }
      while (localCursor == null);
      i = localCursor.getCount();
      localCursor.close();
    }
    while (i <= 0);
    return true;
  }

  private boolean aKR()
  {
    if ((this.ilh != null) && (this.ili != null))
      Assert.assertTrue("two db not null at same time", false);
    if ((this.ilh == null) && (this.ili == null))
      Assert.assertTrue("two db null at same time", false);
    SQLiteDatabase localSQLiteDatabase = this.ilh;
    boolean bool = false;
    if (localSQLiteDatabase != null)
      bool = true;
    return bool;
  }

  public static e b(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    e locale = new e();
    if ((paramString1 == null) || (paramString1.length() == 0))
      if (!ch.jb(paramString2))
      {
        locale.ilh = SQLiteDatabase.openOrCreateDatabase(":memory:", paramString2, SQLiteDatabase.Arithmetic.AES256CBC, null, null, 1);
        locale.ilj = true;
        if (locale.ilh != null)
          break label75;
      }
    while (true)
    {
      return null;
      locale.ilh = SQLiteDatabase.openOrCreateDatabase(":memory:", null, 1);
      break;
      label75: return locale;
      try
      {
        if (!ch.jb(paramString2));
        for (locale.ilh = SQLiteDatabase.openOrCreateDatabase(paramString1, paramString2, SQLiteDatabase.Arithmetic.AES256CBC, null, null, 1); locale.ilh != null; locale.ilh = SQLiteDatabase.openOrCreateDatabase(paramString1, null, 1))
          label101: return locale;
      }
      catch (Exception localException)
      {
        break label101;
      }
    }
  }

  public final Cursor a(String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    return this.ilh.rawQuery(paramString, null, paramBoolean);
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, List paramList1, List paramList2, d paramd, boolean paramBoolean)
  {
    return c.a(this.ilh, paramString1, paramString2, paramString3, paramList1, null, paramd, true);
  }

  public final void beginTransaction()
  {
    if (aKR())
    {
      this.ilh.beginTransaction();
      return;
    }
    this.ili.beginTransaction();
  }

  public final void close()
  {
    try
    {
      if ((this.ilh != null) && (this.ilh.isOpen()))
      {
        this.ilh.close();
        this.ilh = null;
      }
      if ((this.ili != null) && (this.ili.isOpen()))
      {
        this.ili.close();
        this.ili = null;
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    if (aKR())
      return this.ilh.delete(paramString1, paramString2, paramArrayOfString);
    return this.ili.delete(paramString1, paramString2, paramArrayOfString);
  }

  public final void endTransaction()
  {
    if (aKR())
    {
      this.ilh.setTransactionSuccessful();
      this.ilh.endTransaction();
      return;
    }
    this.ili.setTransactionSuccessful();
    this.ili.endTransaction();
  }

  public final void execSQL(String paramString)
  {
    if (aKR())
    {
      this.ilh.execSQL(paramString);
      return;
    }
    this.ili.execSQL(paramString);
  }

  public final String getPath()
  {
    if (aKR())
      return this.ilh.getPath();
    return this.ili.getPath();
  }

  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    if (aKR())
      return this.ilh.insert(paramString1, paramString2, paramContentValues);
    return this.ili.insert(paramString1, paramString2, paramContentValues);
  }

  public final boolean isDatabaseIntegrityOk()
  {
    if (this.ilh != null)
      return this.ilh.isDatabaseIntegrityOk();
    if (this.ili != null)
      return this.ili.isDatabaseIntegrityOk();
    return false;
  }

  public final boolean isOpen()
  {
    if ((aKR()) && (this.ilh != null))
      return this.ilh.isOpen();
    if (this.ili != null)
      return this.ili.isOpen();
    return false;
  }

  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    if (aKR())
      return this.ilh.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, null, paramString5);
    return this.ili.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, null, paramString5);
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    if (aKR())
      return this.ilh.rawQuery(paramString, paramArrayOfString);
    return this.ili.rawQuery(paramString, paramArrayOfString);
  }

  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    if (aKR())
      return this.ilh.replace(paramString1, paramString2, paramContentValues);
    return this.ili.replace(paramString1, paramString2, paramContentValues);
  }

  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    if (aKR())
      return this.ilh.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
    return this.ili.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.e
 * JD-Core Version:    0.6.2
 */