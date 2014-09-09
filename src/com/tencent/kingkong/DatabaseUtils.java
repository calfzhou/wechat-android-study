package com.tencent.kingkong;

import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.tencent.kingkong.database.SQLiteAbortException;
import com.tencent.kingkong.database.SQLiteConstraintException;
import com.tencent.kingkong.database.SQLiteDatabase;
import com.tencent.kingkong.database.SQLiteDatabase.Arithmetic;
import com.tencent.kingkong.database.SQLiteDatabase.LockedDevice;
import com.tencent.kingkong.database.SQLiteDatabaseCorruptException;
import com.tencent.kingkong.database.SQLiteDiskIOException;
import com.tencent.kingkong.database.SQLiteException;
import com.tencent.kingkong.database.SQLiteFullException;
import com.tencent.kingkong.database.SQLiteProgram;
import com.tencent.kingkong.database.SQLiteStatement;
import com.tencent.kingkong.support.Log;
import com.tencent.kingkong.support.OperationCanceledException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.CollationKey;
import java.text.Collator;
import java.util.Locale;

public class DatabaseUtils
{
  private static final boolean DEBUG = false;
  private static final char[] DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final int EX_HAS_REPLY_HEADER = -128;
  private static final Locale ROOT = new Locale("", "", "");
  public static final int STATEMENT_ABORT = 6;
  public static final int STATEMENT_ATTACH = 3;
  public static final int STATEMENT_BEGIN = 4;
  public static final int STATEMENT_COMMIT = 5;
  public static final int STATEMENT_DDL = 8;
  public static final int STATEMENT_OTHER = 99;
  public static final int STATEMENT_PRAGMA = 7;
  public static final int STATEMENT_SELECT = 1;
  public static final int STATEMENT_UNPREPARED = 9;
  public static final int STATEMENT_UPDATE = 2;
  private static final String TAG = "DatabaseUtils";
  private static Collator mColl = null;

  public static void appendEscapedSQLString(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append('\'');
    int j;
    if (paramString.indexOf('\'') != -1)
    {
      int i = paramString.length();
      j = 0;
      if (j < i);
    }
    while (true)
    {
      paramStringBuilder.append('\'');
      return;
      char c = paramString.charAt(j);
      if (c == '\'')
        paramStringBuilder.append('\'');
      paramStringBuilder.append(c);
      j++;
      break;
      paramStringBuilder.append(paramString);
    }
  }

  public static String[] appendSelectionArgs(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if ((paramArrayOfString1 == null) || (paramArrayOfString1.length == 0))
      return paramArrayOfString2;
    String[] arrayOfString = new String[paramArrayOfString1.length + paramArrayOfString2.length];
    System.arraycopy(paramArrayOfString1, 0, arrayOfString, 0, paramArrayOfString1.length);
    System.arraycopy(paramArrayOfString2, 0, arrayOfString, paramArrayOfString1.length, paramArrayOfString2.length);
    return arrayOfString;
  }

  public static final void appendValueToSql(StringBuilder paramStringBuilder, Object paramObject)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("NULL");
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      if (((Boolean)paramObject).booleanValue())
      {
        paramStringBuilder.append('1');
        return;
      }
      paramStringBuilder.append('0');
      return;
    }
    appendEscapedSQLString(paramStringBuilder, paramObject.toString());
  }

  public static void bindObjectToProgram(SQLiteProgram paramSQLiteProgram, int paramInt, Object paramObject)
  {
    if (paramObject == null)
    {
      paramSQLiteProgram.bindNull(paramInt);
      return;
    }
    if (((paramObject instanceof Double)) || ((paramObject instanceof Float)))
    {
      paramSQLiteProgram.bindDouble(paramInt, ((Number)paramObject).doubleValue());
      return;
    }
    if ((paramObject instanceof Number))
    {
      paramSQLiteProgram.bindLong(paramInt, ((Number)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      if (((Boolean)paramObject).booleanValue())
      {
        paramSQLiteProgram.bindLong(paramInt, 1L);
        return;
      }
      paramSQLiteProgram.bindLong(paramInt, 0L);
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      paramSQLiteProgram.bindBlob(paramInt, (byte[])paramObject);
      return;
    }
    paramSQLiteProgram.bindString(paramInt, paramObject.toString());
  }

  public static ParcelFileDescriptor blobFileDescriptorForQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, String[] paramArrayOfString)
  {
    SQLiteStatement localSQLiteStatement = paramSQLiteDatabase.compileStatement(paramString);
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = blobFileDescriptorForQuery(localSQLiteStatement, paramArrayOfString);
      return localParcelFileDescriptor;
    }
    finally
    {
      localSQLiteStatement.close();
    }
  }

  public static ParcelFileDescriptor blobFileDescriptorForQuery(SQLiteStatement paramSQLiteStatement, String[] paramArrayOfString)
  {
    paramSQLiteStatement.bindAllArgsAsStrings(paramArrayOfString);
    return paramSQLiteStatement.simpleQueryForBlobFileDescriptor();
  }

  public static String concatenateWhere(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
      return paramString2;
    if (TextUtils.isEmpty(paramString2))
      return paramString1;
    return "(" + paramString1 + ") AND (" + paramString2 + ")";
  }

  public static void createDbFromSqlStatements(android.content.Context paramContext, String paramString1, int paramInt, String paramString2)
  {
    createDbFromSqlStatements(paramContext, paramString1, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramInt, paramString2);
  }

  public static void createDbFromSqlStatements(android.content.Context paramContext, String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, int paramInt, String paramString3)
  {
    int i = 0;
    SQLiteDatabase localSQLiteDatabase = com.tencent.kingkong.support.Context.openOrCreateDatabase(paramContext, paramString1, paramLockedDevice, paramString2, paramArithmetic, 0, null, false);
    String[] arrayOfString = TextUtils.split(paramString3, ";\n");
    int j = arrayOfString.length;
    while (true)
    {
      if (i >= j)
      {
        localSQLiteDatabase.setVersion(paramInt);
        localSQLiteDatabase.close();
        return;
      }
      String str = arrayOfString[i];
      if (!TextUtils.isEmpty(str))
        localSQLiteDatabase.execSQL(str);
      i++;
    }
  }

  public static void cursorDoubleToContentValues(Cursor paramCursor, String paramString1, ContentValues paramContentValues, String paramString2)
  {
    int i = paramCursor.getColumnIndex(paramString1);
    if (!paramCursor.isNull(i))
    {
      paramContentValues.put(paramString2, Double.valueOf(paramCursor.getDouble(i)));
      return;
    }
    paramContentValues.put(paramString2, null);
  }

  public static void cursorDoubleToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Double.valueOf(paramCursor.getDouble(i)));
  }

  public static void cursorDoubleToCursorValues(Cursor paramCursor, String paramString, ContentValues paramContentValues)
  {
    cursorDoubleToContentValues(paramCursor, paramString, paramContentValues, paramString);
  }

  public static void cursorFillWindow(Cursor paramCursor, int paramInt, CursorWindow paramCursorWindow)
  {
    if ((paramInt < 0) || (paramInt >= paramCursor.getCount()))
      return;
    int i = paramCursor.getPosition();
    int j = paramCursor.getColumnCount();
    paramCursorWindow.clear();
    paramCursorWindow.setStartPosition(paramInt);
    paramCursorWindow.setNumColumns(j);
    if (paramCursor.moveToPosition(paramInt))
      if (!paramCursorWindow.allocRow());
    label279: for (int k = 0; ; k++)
    {
      if (k >= j)
      {
        paramInt++;
        if (paramCursor.moveToNext())
          break;
        paramCursor.moveToPosition(i);
        return;
      }
      boolean bool;
      switch (paramCursor.getType(k))
      {
      case 3:
      default:
        String str = paramCursor.getString(k);
        if (str != null)
          bool = paramCursorWindow.putString(str, paramInt, k);
        break;
      case 0:
      case 1:
      case 2:
      case 4:
      }
      while (true)
      {
        if (bool)
          break label279;
        paramCursorWindow.freeLastRow();
        break;
        bool = paramCursorWindow.putNull(paramInt, k);
        continue;
        bool = paramCursorWindow.putLong(paramCursor.getLong(k), paramInt, k);
        continue;
        bool = paramCursorWindow.putDouble(paramCursor.getDouble(k), paramInt, k);
        continue;
        byte[] arrayOfByte = paramCursor.getBlob(k);
        if (arrayOfByte != null)
        {
          bool = paramCursorWindow.putBlob(arrayOfByte, paramInt, k);
        }
        else
        {
          bool = paramCursorWindow.putNull(paramInt, k);
          continue;
          bool = paramCursorWindow.putNull(paramInt, k);
        }
      }
    }
  }

  public static void cursorFloatToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Float.valueOf(paramCursor.getFloat(i)));
  }

  public static void cursorIntToContentValues(Cursor paramCursor, String paramString, ContentValues paramContentValues)
  {
    cursorIntToContentValues(paramCursor, paramString, paramContentValues, paramString);
  }

  public static void cursorIntToContentValues(Cursor paramCursor, String paramString1, ContentValues paramContentValues, String paramString2)
  {
    int i = paramCursor.getColumnIndex(paramString1);
    if (!paramCursor.isNull(i))
    {
      paramContentValues.put(paramString2, Integer.valueOf(paramCursor.getInt(i)));
      return;
    }
    paramContentValues.put(paramString2, null);
  }

  public static void cursorIntToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Integer.valueOf(paramCursor.getInt(i)));
  }

  public static void cursorLongToContentValues(Cursor paramCursor, String paramString, ContentValues paramContentValues)
  {
    cursorLongToContentValues(paramCursor, paramString, paramContentValues, paramString);
  }

  public static void cursorLongToContentValues(Cursor paramCursor, String paramString1, ContentValues paramContentValues, String paramString2)
  {
    int i = paramCursor.getColumnIndex(paramString1);
    if (!paramCursor.isNull(i))
    {
      paramContentValues.put(paramString2, Long.valueOf(paramCursor.getLong(i)));
      return;
    }
    paramContentValues.put(paramString2, null);
  }

  public static void cursorLongToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Long.valueOf(paramCursor.getLong(i)));
  }

  public static int cursorPickFillWindowStartPosition(int paramInt1, int paramInt2)
  {
    return Math.max(paramInt1 - paramInt2 / 3, 0);
  }

  public static void cursorRowToContentValues(Cursor paramCursor, ContentValues paramContentValues)
  {
    if ((paramCursor instanceof AbstractWindowedCursor));
    String[] arrayOfString;
    int j;
    for (AbstractWindowedCursor localAbstractWindowedCursor = (AbstractWindowedCursor)paramCursor; ; localAbstractWindowedCursor = null)
    {
      arrayOfString = paramCursor.getColumnNames();
      int i = arrayOfString.length;
      j = 0;
      if (j < i)
        break;
      return;
    }
    if ((localAbstractWindowedCursor != null) && (localAbstractWindowedCursor.isBlob(j)))
      paramContentValues.put(arrayOfString[j], paramCursor.getBlob(j));
    while (true)
    {
      j++;
      break;
      paramContentValues.put(arrayOfString[j], paramCursor.getString(j));
    }
  }

  public static void cursorShortToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Short.valueOf(paramCursor.getShort(i)));
  }

  public static void cursorStringToContentValues(Cursor paramCursor, String paramString, ContentValues paramContentValues)
  {
    cursorStringToContentValues(paramCursor, paramString, paramContentValues, paramString);
  }

  public static void cursorStringToContentValues(Cursor paramCursor, String paramString1, ContentValues paramContentValues, String paramString2)
  {
    paramContentValues.put(paramString2, paramCursor.getString(paramCursor.getColumnIndexOrThrow(paramString1)));
  }

  public static void cursorStringToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, paramCursor.getString(i));
  }

  public static void cursorStringToInsertHelper(Cursor paramCursor, String paramString, DatabaseUtils.InsertHelper paramInsertHelper, int paramInt)
  {
    paramInsertHelper.bind(paramInt, paramCursor.getString(paramCursor.getColumnIndexOrThrow(paramString)));
  }

  public static void dumpCurrentRow(Cursor paramCursor)
  {
    dumpCurrentRow(paramCursor, System.out);
  }

  public static void dumpCurrentRow(Cursor paramCursor, PrintStream paramPrintStream)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    paramPrintStream.println(paramCursor.getPosition() + " {");
    int i = arrayOfString.length;
    int j = 0;
    while (true)
    {
      if (j >= i)
      {
        paramPrintStream.println("}");
        return;
      }
      try
      {
        String str2 = paramCursor.getString(j);
        str1 = str2;
        paramPrintStream.println("   " + arrayOfString[j] + '=' + str1);
        j++;
      }
      catch (SQLiteException localSQLiteException)
      {
        while (true)
          String str1 = "<unprintable>";
      }
    }
  }

  public static void dumpCurrentRow(Cursor paramCursor, StringBuilder paramStringBuilder)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    paramStringBuilder.append(paramCursor.getPosition() + " {\n");
    int i = arrayOfString.length;
    int j = 0;
    while (true)
    {
      if (j >= i)
      {
        paramStringBuilder.append("}\n");
        return;
      }
      try
      {
        String str2 = paramCursor.getString(j);
        str1 = str2;
        paramStringBuilder.append("   " + arrayOfString[j] + '=' + str1 + "\n");
        j++;
      }
      catch (SQLiteException localSQLiteException)
      {
        while (true)
          String str1 = "<unprintable>";
      }
    }
  }

  public static String dumpCurrentRowToString(Cursor paramCursor)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    dumpCurrentRow(paramCursor, localStringBuilder);
    return localStringBuilder.toString();
  }

  public static void dumpCursor(Cursor paramCursor)
  {
    dumpCursor(paramCursor, System.out);
  }

  public static void dumpCursor(Cursor paramCursor, PrintStream paramPrintStream)
  {
    paramPrintStream.println(">>>>> Dumping cursor " + paramCursor);
    int i;
    if (paramCursor != null)
    {
      i = paramCursor.getPosition();
      paramCursor.moveToPosition(-1);
    }
    while (true)
    {
      if (!paramCursor.moveToNext())
      {
        paramCursor.moveToPosition(i);
        paramPrintStream.println("<<<<<");
        return;
      }
      dumpCurrentRow(paramCursor, paramPrintStream);
    }
  }

  public static void dumpCursor(Cursor paramCursor, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(">>>>> Dumping cursor " + paramCursor + "\n");
    int i;
    if (paramCursor != null)
    {
      i = paramCursor.getPosition();
      paramCursor.moveToPosition(-1);
    }
    while (true)
    {
      if (!paramCursor.moveToNext())
      {
        paramCursor.moveToPosition(i);
        paramStringBuilder.append("<<<<<\n");
        return;
      }
      dumpCurrentRow(paramCursor, paramStringBuilder);
    }
  }

  public static String dumpCursorToString(Cursor paramCursor)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    dumpCursor(paramCursor, localStringBuilder);
    return localStringBuilder.toString();
  }

  private static char[] encodeHex(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    char[] arrayOfChar = new char[j << 1];
    for (int k = 0; ; k++)
    {
      if (k >= j)
        return arrayOfChar;
      int m = i + 1;
      arrayOfChar[i] = DIGITS[((0xF0 & paramArrayOfByte[k]) >>> 4)];
      i = m + 1;
      arrayOfChar[m] = DIGITS[(0xF & paramArrayOfByte[k])];
    }
  }

  public static int findRowIdColumnIndex(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        j = -1;
      while (paramArrayOfString[j].equals("_id"))
        return j;
    }
  }

  public static String getCollationKey(String paramString)
  {
    byte[] arrayOfByte = getCollationKeyInBytes(paramString);
    try
    {
      String str = new String(arrayOfByte, 0, getKeyLen(arrayOfByte), "ISO8859_1");
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private static byte[] getCollationKeyInBytes(String paramString)
  {
    if (mColl == null)
    {
      Collator localCollator = Collator.getInstance();
      mColl = localCollator;
      localCollator.setStrength(0);
    }
    return mColl.getCollationKey(paramString).toByteArray();
  }

  public static String getHexCollationKey(String paramString)
  {
    byte[] arrayOfByte = getCollationKeyInBytes(paramString);
    return new String(encodeHex(arrayOfByte), 0, 2 * getKeyLen(arrayOfByte));
  }

  private static int getKeyLen(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte[(-1 + paramArrayOfByte.length)] != 0)
      return paramArrayOfByte.length;
    return -1 + paramArrayOfByte.length;
  }

  public static int getSqlStatementType(String paramString)
  {
    String str1 = paramString.trim();
    if (str1.length() < 3);
    String str2;
    do
    {
      return 99;
      str2 = str1.substring(0, 3).toUpperCase(ROOT);
      if (str2.equals("SEL"))
        return 1;
      if ((str2.equals("INS")) || (str2.equals("UPD")) || (str2.equals("REP")) || (str2.equals("DEL")))
        return 2;
      if (str2.equals("ATT"))
        return 3;
      if (str2.equals("COM"))
        return 5;
      if (str2.equals("END"))
        return 5;
      if (str2.equals("ROL"))
        return 6;
      if (str2.equals("BEG"))
        return 4;
      if (str2.equals("PRA"))
        return 7;
      if ((str2.equals("CRE")) || (str2.equals("DRO")) || (str2.equals("ALT")))
        return 8;
    }
    while ((!str2.equals("ANA")) && (!str2.equals("DET")));
    return 9;
  }

  public static int getTypeOfObject(Object paramObject)
  {
    if (paramObject == null)
      return 0;
    if ((paramObject instanceof byte[]))
      return 4;
    if (((paramObject instanceof Float)) || ((paramObject instanceof Double)))
      return 2;
    if (((paramObject instanceof Long)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Short)) || ((paramObject instanceof Byte)))
      return 1;
    return 3;
  }

  public static long longForQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, String[] paramArrayOfString)
  {
    SQLiteStatement localSQLiteStatement = paramSQLiteDatabase.compileStatement(paramString);
    try
    {
      long l = longForQuery(localSQLiteStatement, paramArrayOfString);
      return l;
    }
    finally
    {
      localSQLiteStatement.close();
    }
  }

  public static long longForQuery(SQLiteStatement paramSQLiteStatement, String[] paramArrayOfString)
  {
    paramSQLiteStatement.bindAllArgsAsStrings(paramArrayOfString);
    return paramSQLiteStatement.simpleQueryForLong();
  }

  public static boolean queryIsEmpty(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    return longForQuery(paramSQLiteDatabase, "select exists(select 1 from " + paramString + ")", null) == 0L;
  }

  public static long queryNumEntries(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    return queryNumEntries(paramSQLiteDatabase, paramString, null, null);
  }

  public static long queryNumEntries(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    return queryNumEntries(paramSQLiteDatabase, paramString1, paramString2, null);
  }

  public static long queryNumEntries(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    if (!TextUtils.isEmpty(paramString2));
    for (String str = " where " + paramString2; ; str = "")
      return longForQuery(paramSQLiteDatabase, "select count(*) from " + paramString1 + str, paramArrayOfString);
  }

  private static final int readExceptionCode(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    if (i == -128)
    {
      if (paramParcel.readInt() == 0)
        Log.e("DatabaseUtils", "Unexpected zero-sized Parcel reply header.");
      i = 0;
    }
    return i;
  }

  public static final void readExceptionFromParcel(Parcel paramParcel)
  {
    int i = readExceptionCode(paramParcel);
    if (i == 0)
      return;
    readExceptionFromParcel(paramParcel, paramParcel.readString(), i);
  }

  private static final void readExceptionFromParcel(Parcel paramParcel, String paramString, int paramInt)
  {
    switch (paramInt)
    {
    case 10:
    default:
      paramParcel.readException(paramInt, paramString);
      return;
    case 2:
      throw new IllegalArgumentException(paramString);
    case 3:
      throw new UnsupportedOperationException(paramString);
    case 4:
      throw new SQLiteAbortException(paramString);
    case 5:
      throw new SQLiteConstraintException(paramString);
    case 6:
      throw new SQLiteDatabaseCorruptException(paramString);
    case 7:
      throw new SQLiteFullException(paramString);
    case 8:
      throw new SQLiteDiskIOException(paramString);
    case 9:
      throw new SQLiteException(paramString);
    case 11:
    }
    throw new OperationCanceledException(paramString);
  }

  public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel paramParcel)
  {
    int i = readExceptionCode(paramParcel);
    if (i == 0)
      return;
    String str = paramParcel.readString();
    if (i == 1)
      throw new FileNotFoundException(str);
    readExceptionFromParcel(paramParcel, str, i);
  }

  public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel paramParcel)
  {
    int i = readExceptionCode(paramParcel);
    if (i == 0)
      return;
    String str = paramParcel.readString();
    if (i == 10)
      throw new OperationApplicationException(str);
    readExceptionFromParcel(paramParcel, str, i);
  }

  public static String sqlEscapeString(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    appendEscapedSQLString(localStringBuilder, paramString);
    return localStringBuilder.toString();
  }

  public static String stringForQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, String[] paramArrayOfString)
  {
    SQLiteStatement localSQLiteStatement = paramSQLiteDatabase.compileStatement(paramString);
    try
    {
      String str = stringForQuery(localSQLiteStatement, paramArrayOfString);
      return str;
    }
    finally
    {
      localSQLiteStatement.close();
    }
  }

  public static String stringForQuery(SQLiteStatement paramSQLiteStatement, String[] paramArrayOfString)
  {
    paramSQLiteStatement.bindAllArgsAsStrings(paramArrayOfString);
    return paramSQLiteStatement.simpleQueryForString();
  }

  public static final void writeExceptionToParcel(Parcel paramParcel, Exception paramException)
  {
    int j;
    int i;
    if ((paramException instanceof FileNotFoundException))
    {
      j = 0;
      i = 1;
    }
    while (true)
    {
      paramParcel.writeInt(i);
      paramParcel.writeString(paramException.getMessage());
      if (j != 0)
        Log.e("DatabaseUtils", "Writing exception to parcel", new Object[] { paramException });
      return;
      if ((paramException instanceof IllegalArgumentException))
      {
        i = 2;
        j = 1;
      }
      else if ((paramException instanceof UnsupportedOperationException))
      {
        i = 3;
        j = 1;
      }
      else if ((paramException instanceof SQLiteAbortException))
      {
        i = 4;
        j = 1;
      }
      else if ((paramException instanceof SQLiteConstraintException))
      {
        i = 5;
        j = 1;
      }
      else if ((paramException instanceof SQLiteDatabaseCorruptException))
      {
        i = 6;
        j = 1;
      }
      else if ((paramException instanceof SQLiteFullException))
      {
        i = 7;
        j = 1;
      }
      else if ((paramException instanceof SQLiteDiskIOException))
      {
        i = 8;
        j = 1;
      }
      else if ((paramException instanceof SQLiteException))
      {
        i = 9;
        j = 1;
      }
      else if ((paramException instanceof OperationApplicationException))
      {
        i = 10;
        j = 1;
      }
      else
      {
        if (!(paramException instanceof OperationCanceledException))
          break;
        i = 11;
        j = 0;
      }
    }
    paramParcel.writeException(paramException);
    Log.e("DatabaseUtils", "Writing exception to parcel", new Object[] { paramException });
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.DatabaseUtils
 * JD-Core Version:    0.6.2
 */