package com.tencent.mm.as;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;

public final class d extends AbstractCursor
{
  private final int columnCount;
  private final String[] columnNames;
  private Object[] data;
  private int rowCount = 0;

  private d(String[] paramArrayOfString)
  {
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    this.data = new Object[16 * this.columnCount];
  }

  public d(String[] paramArrayOfString, byte paramByte)
  {
    this(paramArrayOfString);
  }

  private static int ad(Object paramObject)
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

  public final void addRow(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length != this.columnCount)
      throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + paramArrayOfObject.length);
    int i = this.rowCount;
    this.rowCount = (i + 1);
    int j = i * this.columnCount;
    int k = j + this.columnCount;
    Object[] arrayOfObject;
    int m;
    if (k > this.data.length)
    {
      arrayOfObject = this.data;
      m = 2 * this.data.length;
      if (m >= k)
        break label143;
    }
    while (true)
    {
      this.data = new Object[k];
      System.arraycopy(arrayOfObject, 0, this.data, 0, arrayOfObject.length);
      System.arraycopy(paramArrayOfObject, 0, this.data, j, this.columnCount);
      return;
      label143: k = m;
    }
  }

  public final void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    if ((paramInt < 0) || (paramInt >= getCount()))
      return;
    paramCursorWindow.acquireReference();
    try
    {
      int i = getPosition();
      int j = getColumnCount();
      paramCursorWindow.clear();
      paramCursorWindow.setStartPosition(paramInt);
      paramCursorWindow.setNumColumns(j);
      if (moveToPosition(paramInt))
        if (!paramCursorWindow.allocRow());
      label270: for (int k = 0; ; k++)
      {
        boolean bool1;
        if (k < j)
          switch (ad(get(k)))
          {
          case 3:
          default:
            String str = getString(k);
            if (str != null)
              bool1 = paramCursorWindow.putString(str, paramInt, k);
            break;
          case 0:
          case 1:
          case 2:
          case 4:
          }
        while (true)
        {
          if (bool1)
            break label270;
          paramCursorWindow.freeLastRow();
          paramInt++;
          if (moveToNext())
            break;
          moveToPosition(i);
          return;
          bool1 = paramCursorWindow.putNull(paramInt, k);
          continue;
          bool1 = paramCursorWindow.putLong(getLong(k), paramInt, k);
          continue;
          bool1 = paramCursorWindow.putDouble(getDouble(k), paramInt, k);
          continue;
          byte[] arrayOfByte = getBlob(k);
          if (arrayOfByte != null)
          {
            bool1 = paramCursorWindow.putBlob(arrayOfByte, paramInt, k);
          }
          else
          {
            bool1 = paramCursorWindow.putNull(paramInt, k);
            continue;
            boolean bool2 = paramCursorWindow.putNull(paramInt, k);
            bool1 = bool2;
          }
        }
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
    finally
    {
      paramCursorWindow.releaseReference();
    }
  }

  public final byte[] getBlob(int paramInt)
  {
    return (byte[])get(paramInt);
  }

  public final String[] getColumnNames()
  {
    return this.columnNames;
  }

  public final int getCount()
  {
    return this.rowCount;
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

  public final int getType(int paramInt)
  {
    return ad(get(paramInt));
  }

  public final boolean isNull(int paramInt)
  {
    return get(paramInt) == null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.d
 * JD-Core Version:    0.6.2
 */