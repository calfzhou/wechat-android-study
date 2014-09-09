package com.tencent.mm.as;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.mm.dbsupport.newcursor.a;
import com.tencent.mm.dbsupport.newcursor.g;
import com.tencent.mm.dbsupport.newcursor.p;

public final class c
  implements Cursor, g
{
  private static Cursor ilg;

  public static Cursor aKQ()
  {
    if (ilg == null)
      ilg = new c();
    return ilg;
  }

  public final a K(Object paramObject)
  {
    return null;
  }

  public final boolean L(Object paramObject)
  {
    return false;
  }

  public final void P(boolean paramBoolean)
  {
  }

  public final void a(p paramp)
  {
  }

  public final boolean a(Object paramObject, a parama)
  {
    return false;
  }

  public final void close()
  {
  }

  public final a cn(int paramInt)
  {
    return null;
  }

  public final boolean co(int paramInt)
  {
    return false;
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final void cs(int paramInt)
  {
  }

  public final void deactivate()
  {
  }

  public final byte[] getBlob(int paramInt)
  {
    return null;
  }

  public final int getColumnCount()
  {
    return 0;
  }

  public final int getColumnIndex(String paramString)
  {
    return 0;
  }

  public final int getColumnIndexOrThrow(String paramString)
  {
    return 0;
  }

  public final String getColumnName(int paramInt)
  {
    return null;
  }

  public final String[] getColumnNames()
  {
    return null;
  }

  public final int getCount()
  {
    return 0;
  }

  public final double getDouble(int paramInt)
  {
    return 0.0D;
  }

  public final Bundle getExtras()
  {
    return null;
  }

  public final float getFloat(int paramInt)
  {
    return 0.0F;
  }

  public final int getInt(int paramInt)
  {
    return 0;
  }

  public final long getLong(int paramInt)
  {
    return 0L;
  }

  public final int getPosition()
  {
    return 0;
  }

  public final short getShort(int paramInt)
  {
    return 0;
  }

  public final String getString(int paramInt)
  {
    return null;
  }

  public final int getType(int paramInt)
  {
    return 0;
  }

  public final boolean getWantsAllOnMoveCalls()
  {
    return false;
  }

  public final boolean isAfterLast()
  {
    return false;
  }

  public final boolean isBeforeFirst()
  {
    return false;
  }

  public final boolean isClosed()
  {
    return false;
  }

  public final boolean isFirst()
  {
    return false;
  }

  public final boolean isLast()
  {
    return false;
  }

  public final boolean isNull(int paramInt)
  {
    return false;
  }

  public final boolean move(int paramInt)
  {
    return false;
  }

  public final boolean moveToFirst()
  {
    return false;
  }

  public final boolean moveToLast()
  {
    return false;
  }

  public final boolean moveToNext()
  {
    return false;
  }

  public final boolean moveToPosition(int paramInt)
  {
    return false;
  }

  public final boolean moveToPrevious()
  {
    return false;
  }

  public final boolean op()
  {
    return false;
  }

  public final SparseArray[] oq()
  {
    return null;
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public final boolean requery()
  {
    return false;
  }

  public final Bundle respond(Bundle paramBundle)
  {
    return null;
  }

  public final void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri)
  {
  }

  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.c
 * JD-Core Version:    0.6.2
 */