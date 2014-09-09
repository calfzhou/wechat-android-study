package com.tencent.kingkong;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import java.util.ArrayList;
import java.util.Iterator;

public class MatrixCursor extends AbstractCursor
{
  private final int columnCount;
  private final String[] columnNames;
  private Object[] data;
  private int rowCount = 0;

  public MatrixCursor(String[] paramArrayOfString)
  {
    this(paramArrayOfString, 16);
  }

  public MatrixCursor(String[] paramArrayOfString, int paramInt)
  {
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    if (paramInt <= 0)
      paramInt = 1;
    this.data = new Object[paramInt * this.columnCount];
  }

  private void addRow(ArrayList paramArrayList, int paramInt)
  {
    int i = paramArrayList.size();
    if (i != this.columnCount)
      throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.size() = " + i);
    this.rowCount = (1 + this.rowCount);
    Object[] arrayOfObject = this.data;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      arrayOfObject[(paramInt + j)] = paramArrayList.get(j);
    }
  }

  private void ensureCapacity(int paramInt)
  {
    Object[] arrayOfObject;
    int i;
    if (paramInt > this.data.length)
    {
      arrayOfObject = this.data;
      i = 2 * this.data.length;
      if (i >= paramInt)
        break label48;
    }
    while (true)
    {
      this.data = new Object[paramInt];
      System.arraycopy(arrayOfObject, 0, this.data, 0, arrayOfObject.length);
      return;
      label48: paramInt = i;
    }
  }

  private Object get(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.columnCount))
      throw new CursorIndexOutOfBoundsException("Requested column: " + paramInt + ", # of columns: " + this.columnCount);
    if (this.mPos < 0)
      throw new CursorIndexOutOfBoundsException("Before first row.");
    if (this.mPos >= this.rowCount)
      throw new CursorIndexOutOfBoundsException("After last row.");
    return this.data[(paramInt + this.mPos * this.columnCount)];
  }

  public void addRow(Iterable paramIterable)
  {
    int i = this.rowCount * this.columnCount;
    int j = i + this.columnCount;
    ensureCapacity(j);
    if ((paramIterable instanceof ArrayList))
    {
      addRow((ArrayList)paramIterable, i);
      return;
    }
    Object[] arrayOfObject = this.data;
    Iterator localIterator = paramIterable.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        if (i == j)
          break;
        throw new IllegalArgumentException("columnValues.size() < columnNames.length");
      }
      Object localObject = localIterator.next();
      if (i == j)
        throw new IllegalArgumentException("columnValues.size() > columnNames.length");
      int k = i + 1;
      arrayOfObject[i] = localObject;
      i = k;
    }
    this.rowCount = (1 + this.rowCount);
  }

  public void addRow(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length != this.columnCount)
      throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + paramArrayOfObject.length);
    int i = this.rowCount;
    this.rowCount = (i + 1);
    int j = i * this.columnCount;
    ensureCapacity(j + this.columnCount);
    System.arraycopy(paramArrayOfObject, 0, this.data, j, this.columnCount);
  }

  public void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public byte[] getBlob(int paramInt)
  {
    return (byte[])get(paramInt);
  }

  public String[] getColumnNames()
  {
    return this.columnNames;
  }

  public int getCount()
  {
    return this.rowCount;
  }

  public double getDouble(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0.0D;
    if ((localObject instanceof Number))
      return ((Number)localObject).doubleValue();
    return Double.parseDouble(localObject.toString());
  }

  public float getFloat(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0.0F;
    if ((localObject instanceof Number))
      return ((Number)localObject).floatValue();
    return Float.parseFloat(localObject.toString());
  }

  public int getInt(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0;
    if ((localObject instanceof Number))
      return ((Number)localObject).intValue();
    return Integer.parseInt(localObject.toString());
  }

  public long getLong(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0L;
    if ((localObject instanceof Number))
      return ((Number)localObject).longValue();
    return Long.parseLong(localObject.toString());
  }

  public short getShort(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return 0;
    if ((localObject instanceof Number))
      return ((Number)localObject).shortValue();
    return Short.parseShort(localObject.toString());
  }

  public String getString(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null)
      return null;
    return localObject.toString();
  }

  public int getType(int paramInt)
  {
    return DatabaseUtils.getTypeOfObject(get(paramInt));
  }

  public boolean isNull(int paramInt)
  {
    return get(paramInt) == null;
  }

  public MatrixCursor.RowBuilder newRow()
  {
    this.rowCount = (1 + this.rowCount);
    int i = this.rowCount * this.columnCount;
    ensureCapacity(i);
    return new MatrixCursor.RowBuilder(this, i - this.columnCount, i);
  }

  public void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.MatrixCursor
 * JD-Core Version:    0.6.2
 */