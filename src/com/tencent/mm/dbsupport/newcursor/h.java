package com.tencent.mm.dbsupport.newcursor;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.kingkong.AbstractCursor;

public final class h extends AbstractCursor
  implements g
{
  private g dPM;
  private g[] dPN;
  private DataSetObserver pg = new i(this);

  public h(n[] paramArrayOfn)
  {
    this.dPN = paramArrayOfn;
    this.dPM = paramArrayOfn[0];
    while (true)
    {
      if (i >= this.dPN.length)
        return;
      if (this.dPN[i] != null)
        this.dPN[i].registerDataSetObserver(this.pg);
      i++;
    }
  }

  public final g[] Cd()
  {
    return this.dPN;
  }

  public final a K(Object paramObject)
  {
    return this.dPM.K(paramObject);
  }

  public final boolean L(Object paramObject)
  {
    boolean bool = false;
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return bool;
      if ((this.dPN[j] != null) && (this.dPN[j].L(paramObject)))
        bool = true;
    }
  }

  public final void P(boolean paramBoolean)
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.dPN[j] != null)
        this.dPN[j].P(paramBoolean);
    }
  }

  public final void a(p paramp)
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.dPN[j] != null)
        this.dPN[j].a(paramp);
    }
  }

  public final boolean a(Object paramObject, a parama)
  {
    boolean bool = false;
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return bool;
      if ((this.dPN[j] != null) && (this.dPN[j].a(paramObject, parama)))
        bool = true;
    }
  }

  public final void close()
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        super.close();
        return;
      }
      if (this.dPN[j] != null)
        this.dPN[j].close();
    }
  }

  public final a cn(int paramInt)
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return null;
      int k = this.dPN[j].getCount();
      if (paramInt < k)
        return this.dPN[j].cn(paramInt);
      paramInt -= k;
    }
  }

  public final boolean co(int paramInt)
  {
    int i = this.dPN.length;
    boolean bool = true;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return bool;
      if ((this.dPN[j] != null) && (!this.dPN[j].co(paramInt)))
        bool = false;
    }
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final void cs(int paramInt)
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.dPN[j] != null)
        this.dPN[j].cs(paramInt);
    }
  }

  public final void deactivate()
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        super.deactivate();
        return;
      }
      if (this.dPN[j] != null)
        this.dPN[j].deactivate();
    }
  }

  public final byte[] getBlob(int paramInt)
  {
    return this.dPM.getBlob(paramInt);
  }

  public final String[] getColumnNames()
  {
    if (this.dPM != null)
      return this.dPM.getColumnNames();
    return new String[0];
  }

  public final int getCount()
  {
    int i = 0;
    int j = this.dPN.length;
    for (int k = 0; ; k++)
    {
      if (k >= j)
        return i;
      if (this.dPN[k] != null)
        i += this.dPN[k].getCount();
    }
  }

  public final double getDouble(int paramInt)
  {
    return this.dPM.getDouble(paramInt);
  }

  public final float getFloat(int paramInt)
  {
    return this.dPM.getFloat(paramInt);
  }

  public final int getInt(int paramInt)
  {
    return this.dPM.getInt(paramInt);
  }

  public final long getLong(int paramInt)
  {
    return this.dPM.getLong(paramInt);
  }

  public final short getShort(int paramInt)
  {
    return this.dPM.getShort(paramInt);
  }

  public final String getString(int paramInt)
  {
    return this.dPM.getString(paramInt);
  }

  public final boolean isNull(int paramInt)
  {
    return this.dPM.isNull(paramInt);
  }

  public final boolean onMove(int paramInt1, int paramInt2)
  {
    this.dPM = null;
    int i = this.dPN.length;
    int j = 0;
    int k = 0;
    while (true)
    {
      if (j >= i);
      while (true)
      {
        if (this.dPM == null)
          break label110;
        return this.dPM.moveToPosition(paramInt2 - k);
        if (this.dPN[j] == null)
          break label104;
        if (paramInt2 >= k + this.dPN[j].getCount())
          break;
        this.dPM = this.dPN[j];
      }
      k += this.dPN[j].getCount();
      label104: j++;
    }
    label110: return false;
  }

  public final boolean op()
  {
    int i = this.dPN.length;
    boolean bool = true;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return bool;
      if ((this.dPN[j] != null) && (!this.dPN[j].op()))
        bool = false;
    }
  }

  public final SparseArray[] oq()
  {
    int i = this.dPN.length;
    SparseArray[] arrayOfSparseArray = new SparseArray[i];
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return arrayOfSparseArray;
      arrayOfSparseArray[j] = this.dPN[j].oq()[0];
    }
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.dPN[j] != null)
        this.dPN[j].registerContentObserver(paramContentObserver);
    }
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.dPN[j] != null)
        this.dPN[j].registerDataSetObserver(paramDataSetObserver);
    }
  }

  public final boolean requery()
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      boolean bool2;
      if (j >= i)
        bool2 = true;
      boolean bool1;
      do
      {
        return bool2;
        if (this.dPN[j] == null)
          break;
        bool1 = this.dPN[j].requery();
        bool2 = false;
      }
      while (!bool1);
    }
  }

  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.dPN[j] != null)
        this.dPN[j].unregisterContentObserver(paramContentObserver);
    }
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    int i = this.dPN.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      if (this.dPN[j] != null)
        this.dPN[j].unregisterDataSetObserver(paramDataSetObserver);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.h
 * JD-Core Version:    0.6.2
 */