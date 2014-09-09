package com.tencent.mm.dbsupport.newcursor;

import android.database.sqlite.SQLiteClosable;
import android.util.SparseArray;
import com.tencent.kingkong.support.Log;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class b extends SQLiteClosable
{
  private SparseArray dPC = new SparseArray();
  private int dPD;
  private HashMap dPE = new HashMap();
  ArrayList dPF;
  a dPG;
  private int mStartPos = 0;

  private void b(Object[] paramArrayOfObject)
  {
    SparseArray localSparseArray = new SparseArray();
    int i = 0;
    int j = 0;
    if (i >= this.dPC.size())
    {
      if (this.dPC.size() != localSparseArray.size())
        Log.i("MicroMsg.kkdb.CursorDataWindow", "newcursor oldposition size :" + this.dPC.size() + " newposistion Size : " + localSparseArray.size());
      this.dPC = localSparseArray;
      return;
    }
    int k = this.dPC.keyAt(i);
    Object localObject = this.dPC.valueAt(i);
    int m = 1;
    int n = paramArrayOfObject.length;
    int i1 = 0;
    label113: if (i1 >= n)
    {
      label120: if (m == 0)
        break label169;
      localSparseArray.put(k - j, localObject);
    }
    while (true)
    {
      i++;
      break;
      if (paramArrayOfObject[i1].equals(localObject))
      {
        j++;
        m = 0;
        break label120;
      }
      i1++;
      break label113;
      label169: Log.i("MicroMsg.kkdb.CursorDataWindow", "newcursor delete index : " + i + " obj : " + localObject);
    }
  }

  public final SparseArray Ad()
  {
    return this.dPC;
  }

  public final int BW()
  {
    return this.dPC.size();
  }

  public final void BX()
  {
    if (this.dPG != null);
  }

  public final void BY()
  {
    if (this.dPG != null);
  }

  public final void BZ()
  {
    if (this.dPG != null);
  }

  public final void Ca()
  {
    this.dPG = null;
    this.dPD = this.dPC.size();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.dPD);
    arrayOfObject[1] = Integer.valueOf(this.dPE.size());
    Log.i("MicroMsg.kkdb.CursorDataWindow", "newcursor fillEnd posistionMaps.size is   %d ,data size is :%d", arrayOfObject);
  }

  public abstract a Cb();

  public final void Cc()
  {
    this.dPC.clear();
    this.dPE.clear();
  }

  public final a K(Object paramObject)
  {
    if (this.dPE == null)
      return null;
    return (a)this.dPE.get(paramObject);
  }

  public final boolean L(Object paramObject)
  {
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject = (Object[])paramObject;
      if (arrayOfObject.length == 1)
        return (this.dPE != null) && (this.dPE.containsKey(arrayOfObject[0]));
    }
    return (this.dPE != null) && (this.dPE.containsKey(paramObject));
  }

  public final void a(int paramInt, long paramLong)
  {
    if (this.dPG != null)
      this.dPG.a(paramInt, paramLong);
  }

  public final boolean a(Object paramObject, a parama)
  {
    if (parama != null)
    {
      Log.i("MicroMsg.kkdb.CursorDataWindow", "newcursor cursor update Memory key : " + paramObject + "values : " + parama);
      this.dPE.put(paramObject, parama);
      return false;
    }
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject = (Object[])paramObject;
      int i = arrayOfObject.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
        {
          b(arrayOfObject);
          return false;
        }
        Object localObject = arrayOfObject[j];
        this.dPE.remove(localObject);
      }
    }
    if (this.dPF == null)
      this.dPF = new ArrayList();
    if (!this.dPF.contains(paramObject))
    {
      this.dPF.add(paramObject);
      Log.i("MicroMsg.kkdb.CursorDataWindow", "newcursor cursor clearData : " + paramObject);
    }
    this.dPE.remove(paramObject);
    return false;
  }

  public abstract ArrayList b(ArrayList paramArrayList);

  public final void b(int paramInt, long paramLong)
  {
    if (this.dPG != null)
      this.dPG.b(paramInt, paramLong);
  }

  public final void c(int paramInt, byte[] paramArrayOfByte)
  {
    if (this.dPG != null)
      this.dPG.c(paramInt, paramArrayOfByte);
  }

  public final a cn(int paramInt)
  {
    if (cx(paramInt))
    {
      Object localObject = this.dPC.get(paramInt);
      a locala1 = (a)this.dPE.get(localObject);
      ArrayList localArrayList;
      int i;
      if (locala1 == null)
      {
        if (this.dPF.size() != 0)
        {
          localArrayList = b(this.dPF);
          i = 0;
          if (i < localArrayList.size())
            break label121;
          this.dPF.clear();
        }
        locala1 = (a)this.dPE.get(localObject);
        if (locala1 == null)
          Log.e("MicroMsg.kkdb.CursorDataWindow", "newcursor error obj : " + localObject + "pos:" + paramInt);
      }
      return locala1;
      label121: a locala2 = (a)localArrayList.get(i);
      if (locala2 != null)
        this.dPE.put(locala2.getKey(), locala2);
      while (true)
      {
        i++;
        break;
        Log.e("MicroMsg.kkdb.CursorDataWindow", "newcursor obj is null");
      }
    }
    Log.e("MicroMsg.kkdb.CursorDataWindow", "newcursor cursor getItem error: pos " + paramInt + " loaded num :" + this.dPC.size());
    return null;
  }

  public final boolean co(int paramInt)
  {
    if (paramInt > 50);
    do
    {
      return false;
      if (this.dPD < 10)
        return true;
    }
    while (paramInt / this.dPD >= 0.1D);
    return true;
  }

  public final boolean cx(int paramInt)
  {
    return this.dPC.indexOfKey(paramInt) >= 0;
  }

  public final void cy(int paramInt)
  {
    if (!cx(paramInt))
      this.dPG = Cb();
  }

  public final void f(int paramInt, String paramString)
  {
    if (this.dPG != null)
      this.dPG.f(paramInt, paramString);
  }

  protected void onAllReferencesReleased()
  {
    Cc();
  }

  public final void s(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt2);
      arrayOfObject[1] = Integer.valueOf(paramInt1);
      Log.e("MicroMsg.kkdb.CursorDataWindow", "newcursor rowEnd with error %d rowNum : %d", arrayOfObject);
      this.dPC.remove(paramInt1);
    }
    while (this.dPG == null)
    {
      Object[] arrayOfObject;
      return;
    }
    Object localObject = this.dPG.getKey();
    this.dPE.put(localObject, this.dPG);
    this.dPC.put(paramInt1, localObject);
  }

  public final void setStartPosition(int paramInt)
  {
    this.mStartPos = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.b
 * JD-Core Version:    0.6.2
 */