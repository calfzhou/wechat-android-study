package com.tencent.mm.dbsupport.newcursor;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.kingkong.AbstractCursor;
import com.tencent.kingkong.DatabaseUtils;
import com.tencent.kingkong.database.SQLiteCursorDriver;
import com.tencent.kingkong.database.SQLiteDatabase;
import com.tencent.kingkong.support.Log;
import java.util.HashMap;
import java.util.Map;

public final class n extends AbstractCursor
  implements g
{
  private final s dPQ;
  private int dPR = 3000;
  public p dPS;
  private boolean dPT;
  private b dPU;
  e dPV;
  private boolean dPW;
  private Map mColumnNameMap;
  private final String[] mColumns;
  private int mCount = -1;
  private final SQLiteCursorDriver mDriver;
  private final String mEditTable;
  private final Throwable mStackTrace = null;

  public n(SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, s params)
  {
    this.mDriver = paramSQLiteCursorDriver;
    this.mEditTable = paramString;
    this.mColumnNameMap = null;
    this.dPQ = params;
    this.mColumns = params.getColumnNames();
    this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(this.mColumns);
  }

  private void Cf()
  {
    if (this.dPV == null)
      this.dPV = new e(this.mColumns, (byte)0);
  }

  private int cA(int paramInt)
  {
    if ((this.dPU == null) && (this.dPT))
    {
      this.dPU = new o(this);
      this.dPU.setStartPosition(paramInt);
    }
    while (true)
    {
      return this.dPQ.a(this.dPU, paramInt, this.dPR, this.dPV);
      Cf();
    }
  }

  public final a K(Object paramObject)
  {
    if (!this.dPT)
    {
      Log.e("MicroMsg.kkdb.SQLiteNewCursor", "newcursor getItemByKey error " + paramObject);
      return null;
    }
    if (this.dPU == null)
    {
      Log.e("MicroMsg.kkdb.SQLiteNewCursor", "newcursor error getItemByKey window is null");
      return null;
    }
    return this.dPU.K(paramObject);
  }

  public final boolean L(Object paramObject)
  {
    if (!this.dPT);
    while (this.dPU == null)
      return false;
    return this.dPU.L(paramObject);
  }

  public final void P(boolean paramBoolean)
  {
    this.dPT = paramBoolean;
  }

  public final void a(p paramp)
  {
    this.dPS = paramp;
  }

  public final boolean a(Object paramObject, a parama)
  {
    if ((this.dPT) && (this.dPU != null))
    {
      if ((!this.dPW) && ((paramObject instanceof Object[])) && (this.dPU.L(paramObject)))
      {
        this.mCount -= ((Object[])paramObject).length;
        this.dPR -= ((Object[])paramObject).length;
      }
      return this.dPU.a(paramObject, parama);
    }
    if (!this.dPT)
      this.dPV.clear();
    return false;
  }

  protected final void checkPosition()
  {
    super.checkPosition();
  }

  public final void close()
  {
    super.close();
    try
    {
      this.dPQ.close();
      this.mDriver.cursorClosed();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final a cn(int paramInt)
  {
    if (this.dPU != null)
      return this.dPU.cn(paramInt);
    return null;
  }

  public final boolean co(int paramInt)
  {
    if (!this.dPT)
      return false;
    return this.dPU.co(paramInt);
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final void cs(int paramInt)
  {
    if ((paramInt <= 15000) && (paramInt >= 2000))
      this.dPR = paramInt;
  }

  public final void deactivate()
  {
    super.deactivate();
    this.mDriver.cursorDeactivated();
  }

  protected final void finalize()
  {
    try
    {
      if (this.dPU != null)
        close();
      return;
    }
    finally
    {
      super.finalize();
    }
  }

  public final byte[] getBlob(int paramInt)
  {
    if (!this.dPT)
      return this.dPV.getBlob(paramInt);
    return null;
  }

  public final int getColumnIndex(String paramString)
  {
    String[] arrayOfString;
    int j;
    HashMap localHashMap;
    if (this.mColumnNameMap == null)
    {
      arrayOfString = this.mColumns;
      j = arrayOfString.length;
      localHashMap = new HashMap(j, 1.0F);
    }
    for (int k = 0; ; k++)
    {
      if (k >= j)
      {
        this.mColumnNameMap = localHashMap;
        int i = paramString.lastIndexOf('.');
        if (i != -1)
        {
          Exception localException = new Exception();
          Log.e("MicroMsg.kkdb.SQLiteNewCursor", "requesting column name with table name -- " + paramString, new Object[] { localException });
          paramString = paramString.substring(i + 1);
        }
        Integer localInteger = (Integer)this.mColumnNameMap.get(paramString);
        if (localInteger == null)
          break;
        return localInteger.intValue();
      }
      localHashMap.put(arrayOfString[k], Integer.valueOf(k));
    }
    return -1;
  }

  public final String[] getColumnNames()
  {
    return this.mColumns;
  }

  public final int getCount()
  {
    if (this.mCount == -1)
    {
      this.mCount = cA(0);
      if (this.dPU != null)
      {
        int i = this.mCount;
        boolean bool = false;
        if (i != -1)
        {
          int j = this.mCount;
          int k = this.dPU.BW();
          bool = false;
          if (j == k)
            bool = true;
        }
        this.dPW = bool;
      }
    }
    if (this.dPT)
    {
      if (this.dPW)
        return this.dPU.BW();
      return this.mCount;
    }
    return this.mCount;
  }

  public final double getDouble(int paramInt)
  {
    if (!this.dPT)
      return this.dPV.getDouble(paramInt);
    return 0.0D;
  }

  public final float getFloat(int paramInt)
  {
    if (!this.dPT)
      return this.dPV.getFloat(paramInt);
    return 0.0F;
  }

  public final int getInt(int paramInt)
  {
    if (!this.dPT)
      return this.dPV.getInt(paramInt);
    return 0;
  }

  public final long getLong(int paramInt)
  {
    if (!this.dPT)
      return this.dPV.getLong(paramInt);
    return 0L;
  }

  public final short getShort(int paramInt)
  {
    if (!this.dPT)
      return this.dPV.getShort(paramInt);
    return 0;
  }

  public final String getString(int paramInt)
  {
    if (!this.dPT)
      return this.dPV.getString(paramInt);
    return null;
  }

  public final boolean isNull(int paramInt)
  {
    if (!this.dPT)
      return this.dPV.isNull(paramInt);
    return false;
  }

  public final boolean onMove(int paramInt1, int paramInt2)
  {
    if (this.dPT)
      if ((this.dPU == null) || (!this.dPU.cx(paramInt2)))
        cA(paramInt2 / this.dPR * this.dPR);
    while (true)
    {
      return true;
      if (this.dPV == null)
        Cf();
      if (!this.dPV.cx(paramInt2))
        cA(paramInt2 / this.dPR * this.dPR);
      this.dPV.moveToPosition(paramInt2);
    }
  }

  public final boolean op()
  {
    return this.dPW;
  }

  public final SparseArray[] oq()
  {
    if (!this.dPT)
      return null;
    SparseArray[] arrayOfSparseArray = new SparseArray[1];
    arrayOfSparseArray[0] = this.dPU.Ad();
    return arrayOfSparseArray;
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public final boolean requery()
  {
    if (isClosed())
      return false;
    try
    {
      if (!this.dPQ.getDatabase().isOpen())
        return false;
    }
    finally
    {
    }
    if (this.dPU != null)
      this.dPU.Cc();
    this.mPos = -1;
    this.mCount = -1;
    this.mDriver.cursorRequeried(this);
    try
    {
      boolean bool = super.requery();
      return bool;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Log.w("MicroMsg.kkdb.SQLiteNewCursor", "requery() failed " + localIllegalStateException.getMessage(), new Object[] { localIllegalStateException });
    }
    return false;
  }

  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.n
 * JD-Core Version:    0.6.2
 */