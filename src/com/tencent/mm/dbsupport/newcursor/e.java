package com.tencent.mm.dbsupport.newcursor;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CursorIndexOutOfBoundsException;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.kingkong.AbstractCursor;

public final class e extends AbstractCursor
{
  private final int columnCount;
  private final String[] columnNames;
  SparseArray dPH;
  public int dPI = 3000;
  int dPJ;

  private e(String[] paramArrayOfString)
  {
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    this.dPH = new SparseArray();
  }

  public e(String[] paramArrayOfString, byte paramByte)
  {
    this(paramArrayOfString);
  }

  private Object get(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.columnCount))
      throw new CursorIndexOutOfBoundsException("Requested column: " + paramInt + ", # of columns: " + this.columnCount);
    if (this.mPos < 0)
      throw new CursorIndexOutOfBoundsException("Before first row.");
    if (this.mPos >= this.dPJ)
      throw new CursorIndexOutOfBoundsException("After last row.");
    int i = this.mPos / this.dPI;
    int j = this.mPos % this.dPI * this.columnCount;
    return ((Object[])this.dPH.get(i))[(j + paramInt)];
  }

  public final void clear()
  {
    this.mPos = 0;
    this.dPH.clear();
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final boolean cx(int paramInt)
  {
    int i = paramInt / this.dPI;
    if (this.dPH.indexOfKey(i) < 0)
      return false;
    int j = paramInt % this.dPI * this.columnCount;
    return ((Object[])this.dPH.get(i))[j] != null;
  }

  public final f cz(int paramInt)
  {
    int i = paramInt / this.dPI;
    Object[] arrayOfObject;
    int j;
    int k;
    int m;
    if (this.dPH.indexOfKey(i) < 0)
    {
      arrayOfObject = new Object[this.dPI * this.columnCount];
      this.dPH.put(i, arrayOfObject);
      j = paramInt % this.dPI * this.columnCount;
      k = j + this.columnCount;
      m = paramInt + 1;
      if (m <= this.dPJ)
        break label111;
    }
    while (true)
    {
      this.dPJ = m;
      return new f(this, j, k, arrayOfObject);
      arrayOfObject = (Object[])this.dPH.get(i);
      break;
      label111: m = this.dPJ;
    }
  }

  public final byte[] getBlob(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return null;
    return (byte[])localObject;
  }

  public final String[] getColumnNames()
  {
    return this.columnNames;
  }

  public final int getCount()
  {
    return this.dPJ;
  }

  public final double getDouble(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0.0D;
    if ((localObject instanceof Number))
      return ((Number)localObject).doubleValue();
    return Double.parseDouble(localObject.toString());
  }

  public final float getFloat(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0.0F;
    if ((localObject instanceof Number))
      return ((Number)localObject).floatValue();
    return Float.parseFloat(localObject.toString());
  }

  public final int getInt(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0;
    if ((localObject instanceof Number))
      return ((Number)localObject).intValue();
    return Integer.parseInt(localObject.toString());
  }

  public final long getLong(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0L;
    if ((localObject instanceof Number))
      return ((Number)localObject).longValue();
    return Long.parseLong(localObject.toString());
  }

  public final short getShort(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0;
    if ((localObject instanceof Number))
      return ((Number)localObject).shortValue();
    return Short.parseShort(localObject.toString());
  }

  public final String getString(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return null;
    return localObject.toString();
  }

  public final boolean isNull(int paramInt)
  {
    return get(paramInt) == null;
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
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
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.e
 * JD-Core Version:    0.6.2
 */