package com.tencent.kingkong;

import android.database.CharArrayBuffer;

public class MergeCursor extends AbstractCursor
{
  private Cursor mCursor;
  private Cursor[] mCursors;
  private DataSetObserver mObserver = new MergeCursor.1(this);

  public MergeCursor(Cursor[] paramArrayOfCursor)
  {
    this.mCursors = paramArrayOfCursor;
    this.mCursor = paramArrayOfCursor[0];
    while (true)
    {
      if (i >= this.mCursors.length)
        return;
      if (this.mCursors[i] != null)
        this.mCursors[i].registerDataSetObserver(this.mObserver);
      i++;
    }
  }

  public void close()
  {
    int i = this.mCursors.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        super.close();
        return;
      }
      if (this.mCursors[j] != null)
        this.mCursors[j].close();
    }
  }

  public void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public void deactivate()
  {
    int i = this.mCursors.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        super.deactivate();
        return;
      }
      if (this.mCursors[j] != null)
        this.mCursors[j].deactivate();
    }
  }

  public byte[] getBlob(int paramInt)
  {
    return this.mCursor.getBlob(paramInt);
  }

  public String[] getColumnNames()
  {
    if (this.mCursor != null)
      return this.mCursor.getColumnNames();
    return new String[0];
  }

  public int getCount()
  {
    int i = 0;
    int j = this.mCursors.length;
    for (int k = 0; ; k++)
    {
      if (k >= j)
        return i;
      if (this.mCursors[k] != null)
        i += this.mCursors[k].getCount();
    }
  }

  public double getDouble(int paramInt)
  {
    return this.mCursor.getDouble(paramInt);
  }

  public float getFloat(int paramInt)
  {
    return this.mCursor.getFloat(paramInt);
  }

  public int getInt(int paramInt)
  {
    return this.mCursor.getInt(paramInt);
  }

  public long getLong(int paramInt)
  {
    return this.mCursor.getLong(paramInt);
  }

  public short getShort(int paramInt)
  {
    return this.mCursor.getShort(paramInt);
  }

  public String getString(int paramInt)
  {
    return this.mCursor.getString(paramInt);
  }

  public int getType(int paramInt)
  {
    return this.mCursor.getType(paramInt);
  }

  public boolean isNull(int paramInt)
  {
    return this.mCursor.isNull(paramInt);
  }

  public boolean onMove(int paramInt1, int paramInt2)
  {
    this.mCursor = null;
    int i = this.mCursors.length;
    int j = 0;
    int k = 0;
    while (true)
    {
      if (j >= i);
      while (true)
      {
        if (this.mCursor == null)
          break label110;
        return this.mCursor.moveToPosition(paramInt2 - k);
        if (this.mCursors[j] == null)
          break label104;
        if (paramInt2 >= k + this.mCursors[j].getCount())
          break;
        this.mCursor = this.mCursors[j];
      }
      k += this.mCursors[j].getCount();
      label104: j++;
    }
    label110: return false;
  }

  public void registerContentObserver(android.database.ContentObserver paramContentObserver)
  {
  }

  public void registerContentObserver(ContentObserver paramContentObserver)
  {
    int i = this.mCursors.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.mCursors[j] != null)
        this.mCursors[j].registerContentObserver(paramContentObserver);
    }
  }

  public void registerDataSetObserver(android.database.DataSetObserver paramDataSetObserver)
  {
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    int i = this.mCursors.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.mCursors[j] != null)
        this.mCursors[j].registerDataSetObserver(paramDataSetObserver);
    }
  }

  public boolean requery()
  {
    int i = this.mCursors.length;
    for (int j = 0; ; j++)
    {
      boolean bool2;
      if (j >= i)
        bool2 = true;
      boolean bool1;
      do
      {
        return bool2;
        if (this.mCursors[j] == null)
          break;
        bool1 = this.mCursors[j].requery();
        bool2 = false;
      }
      while (!bool1);
    }
  }

  public void unregisterContentObserver(android.database.ContentObserver paramContentObserver)
  {
  }

  public void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    int i = this.mCursors.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.mCursors[j] != null)
        this.mCursors[j].unregisterContentObserver(paramContentObserver);
    }
  }

  public void unregisterDataSetObserver(android.database.DataSetObserver paramDataSetObserver)
  {
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    int i = this.mCursors.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.mCursors[j] != null)
        this.mCursors[j].unregisterDataSetObserver(paramDataSetObserver);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.MergeCursor
 * JD-Core Version:    0.6.2
 */