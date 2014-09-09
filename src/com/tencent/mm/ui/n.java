package com.tencent.mm.ui;

import android.content.Context;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import com.tencent.mm.dbsupport.newcursor.a;
import com.tencent.mm.dbsupport.newcursor.g;
import com.tencent.mm.dbsupport.newcursor.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public abstract class n extends BaseAdapter
{
  public String TAG = "!44@/B4Tb64lLpJ+mcb97U9hxtX6gGooumjq7DJ96+X83HQ=";
  protected Context context;
  private int dPR;
  private int fif = 0;
  private boolean iIm = true;
  private s iIn;
  private HashMap iIo;
  protected q iIp;
  public int iIq = 1000;
  public int iIr = 3000;
  private boolean iIs = true;
  int iIt = 0;
  private boolean iIu;
  private boolean iIv;
  private u iIw;
  public Object iIx = null;

  public n(Context paramContext)
  {
    this(true, paramContext);
    this.dPR = 5000;
    String str = this.TAG;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(5000);
    z.i(str, "newCursor setPageSize %d", arrayOfObject);
  }

  public n(Context paramContext, byte paramByte)
  {
    this(paramContext, 800, 2000);
  }

  private n(Context paramContext, int paramInt1, int paramInt2)
  {
    this.context = paramContext;
    this.iIu = true;
    this.iIv = false;
    this.iIq = 800;
    this.iIr = 2000;
  }

  private n(boolean paramBoolean, Context paramContext)
  {
    this.context = paramContext;
    this.iIu = true;
  }

  private void O(String paramString, boolean paramBoolean)
  {
    if (this.fif == 0);
    for (int i = 1; ; i = 0)
    {
      if ((i == 0) && ((paramBoolean | this.iIs)))
      {
        if (!paramBoolean)
        {
          String str = this.TAG;
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Boolean.valueOf(this.iIs);
          arrayOfObject[1] = paramString;
          arrayOfObject[2] = ch.aHN();
          z.i(str, "newcursor cache needRefresh : needRefreshInfront :%b from : %s %s", arrayOfObject);
        }
        et(false);
      }
      return;
    }
  }

  private void a(g paramg)
  {
    eu(true);
    if ((this.iIn == null) || (this.iIn.Ch() != paramg))
    {
      if ((this.iIn != null) && (!this.iIn.isClosed()))
      {
        this.iIn.close();
        this.iIn = null;
      }
      this.iIn = new s(this, paramg);
      this.iIn.getCount();
      aOE();
      notifyDataSetChanged();
    }
  }

  private void a(s params)
  {
    eu(false);
    this.iIn = params;
    this.iIn.getCount();
    aOE();
  }

  private void a(s params, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      if ((this.iIw != null) && (this.iIw.aOS()))
        this.iIw.aOQ();
      if (this.iIo != null)
        this.iIo.clear();
    }
    if (paramBoolean2)
    {
      a(new p(this, params));
      return;
    }
    a(params);
  }

  private void a(t paramt)
  {
    long l = System.currentTimeMillis();
    if (this.iIp != null)
      this.iIp.DU();
    paramt.aON();
    notifyDataSetChanged();
    if (this.iIp != null)
      this.iIp.DT();
    if (this.iIw != null)
      u.b(this.iIw);
    String str = this.TAG;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
    z.i(str, "newcursor update callback last :%d ", arrayOfObject);
  }

  private void aOE()
  {
    if (this.iIu)
      if (!this.iIn.op())
        break label99;
    label99: for (int i = 1; ; i = 2)
    {
      if ((i != this.iIt) && (this.iIt != 0))
      {
        if ((this.iIw != null) && (this.iIw.aOS()))
          a(new s(this, aOG()), true, false);
        String str = this.TAG;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        z.i(str, "newcursor change update stats  %d ", arrayOfObject);
      }
      this.iIt = i;
      return;
    }
  }

  private void aOI()
  {
    this.iIo.clear();
    this.iIo.put(this.iIx, null);
  }

  private int aOJ()
  {
    if ((this.iIo == null) || (this.iIo.size() == 0))
      return 0;
    if (this.iIo.containsKey(this.iIx))
      return 2;
    return 1;
  }

  private void aOL()
  {
    if ((this.iIn != null) && (!this.iIn.isClosed()) && (this.iIo.size() == 0))
    {
      z.i(this.TAG, "events size is 0  ");
      return;
    }
    a(new o(this));
  }

  private void et(boolean paramBoolean)
  {
    int i;
    int j;
    int k;
    if ((this.iIv) || (paramBoolean))
      if (((this.iIw != null) && (this.iIw.aOS())) || (aOJ() != 0))
      {
        i = 1;
        if (i != 0)
        {
          j = aOJ();
          if (this.iIw == null)
            break label264;
          k = u.a(this.iIw);
          String str2 = this.TAG;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(k);
          z.i(str2, "newcursor mWorkerHandler.isHandingMsg,type is %d ", arrayOfObject2);
          if (k != 0)
            this.iIw.aOQ();
          if (j == 2)
            break label264;
        }
      }
    while (true)
    {
      String str1 = this.TAG;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(k);
      z.i(str1, "newcursor ensureNewState  refreshstatus is %d ", arrayOfObject1);
      this.fif = 0;
      if (k == 2)
        a(new s(this, aOG()), true, true);
      while (true)
      {
        this.fif = 0;
        return;
        i = 0;
        break;
        aOL();
        continue;
        int m = aOJ();
        if (m == 0)
        {
          z.i(this.TAG, "newcursor need not change ");
          return;
        }
        if (m == 2)
        {
          z.i(this.TAG, "newcursor enqueueMessage resetcursor ");
          this.iIo.clear();
        }
        if (this.iIw == null)
          this.iIw = new u(this);
        u.a(this.iIw, m);
      }
      label264: k = j;
    }
  }

  private void eu(boolean paramBoolean)
  {
    if (this.iIn != null)
    {
      this.iIn.close();
      this.iIn = null;
    }
    if ((paramBoolean) && (this.iIw != null))
    {
      this.iIw.quit();
      this.iIw = null;
      if (this.iIo != null)
      {
        this.iIo.clear();
        z.i(this.TAG, "newcursor closeCursor,clear events");
      }
    }
    this.fif = 0;
    this.iIt = 0;
  }

  public abstract a Cb();

  public final a K(Object paramObject)
  {
    if (this.iIn == null)
      return null;
    return this.iIn.K(paramObject);
  }

  public final void a(q paramq)
  {
    this.iIp = paramq;
  }

  public final void a(SparseArray[] paramArrayOfSparseArray)
  {
    SparseArray[] arrayOfSparseArray = this.iIn.oq();
    for (int i = 0; i < arrayOfSparseArray.length; i++)
    {
      arrayOfSparseArray[i].clear();
      for (int j = 0; j < paramArrayOfSparseArray[i].size(); j++)
        arrayOfSparseArray[i].put(j, paramArrayOfSparseArray[i].get(j));
    }
  }

  public abstract SparseArray[] a(HashSet paramHashSet, SparseArray[] paramArrayOfSparseArray);

  public final void aOD()
  {
    this.iIp = null;
  }

  public final int aOF()
  {
    if (this.iIn == null)
      return 0;
    g localg = this.iIn.Ch();
    if (localg == null)
      return 0;
    if ((localg instanceof h))
      return ((h)localg).Cd()[0].getCount();
    throw new RuntimeException("the cursor is not instanceof MergeHeapCursor ,please call getCount() instead ");
  }

  public abstract g aOG();

  public final SparseArray[] aOH()
  {
    if (this.iIn == null)
      return null;
    SparseArray[] arrayOfSparseArray1 = this.iIn.oq();
    SparseArray[] arrayOfSparseArray2 = new SparseArray[arrayOfSparseArray1.length];
    for (int i = 0; i < arrayOfSparseArray2.length; i++)
    {
      arrayOfSparseArray2[i] = new SparseArray();
      for (int j = 0; j < arrayOfSparseArray1[i].size(); j++)
        arrayOfSparseArray2[i].put(j, arrayOfSparseArray1[i].get(j));
    }
    return arrayOfSparseArray2;
  }

  public final void aOK()
  {
    z.i(this.TAG, "newcursor resume syncNow ");
    this.iIm = true;
    et(true);
  }

  public final void aOM()
  {
    this.iIs = false;
  }

  public abstract ArrayList b(ArrayList paramArrayList);

  public final void closeCursor()
  {
    eu(true);
  }

  public final a cn(int paramInt)
  {
    if (this.iIn == null)
      a(aOG());
    O("getItem", false);
    this.iIn.cB(paramInt);
    a locala = this.iIn.cn(paramInt);
    if (locala != null)
    {
      this.iIn.Ch();
      locala.og();
      return locala;
    }
    String str = this.TAG;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.e(str, "newcursor getItem error %d", arrayOfObject);
    return locala;
  }

  public int getCount()
  {
    if (this.iIn == null)
    {
      long l = System.currentTimeMillis();
      a(aOG());
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
      z.i(str, "newcursor createCursor last : %d", arrayOfObject);
    }
    O("getcount", false);
    return this.iIn.getCount();
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public void i(Object paramObject, int paramInt)
  {
    boolean bool1;
    if (this.iIn != null)
    {
      if (this.iIo == null)
        this.iIo = new HashMap();
      bool1 = this.iIo.containsKey(this.iIx);
      if ((paramInt != 5) && (this.iIu) && (paramInt != 1))
        break label212;
      if (paramInt == 5)
        break label186;
      aOI();
    }
    label96: label745: 
    do
    {
      break label185;
      String str1 = this.TAG;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      z.i(str1, "newcursor syncHandle is true ,changeType is %d  ", arrayOfObject1);
      int i = 1;
      this.fif = aOJ();
      String str2 = this.TAG;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(this.fif);
      if (this.iIt == 1);
      for (boolean bool2 = true; ; bool2 = false)
      {
        arrayOfObject2[1] = Boolean.valueOf(bool2);
        arrayOfObject2[2] = Integer.valueOf(paramInt);
        z.i(str2, "newcursor refreshStatus: %d ,hasLoadedAllDataStatus %b changeType :%d ", arrayOfObject2);
        if (i == 0)
          break label745;
        z.i(this.TAG, "newcursor event is refresh sync ");
        et(true);
        return;
        if (bool1)
          break;
        this.iIo.put(paramObject, new r(paramObject, paramInt, null));
        break;
        if (bool1)
        {
          z.i(this.TAG, "newcursor need reset ,return ");
          return;
        }
        if (this.iIt == 1)
        {
          if ((this.iIn.L(paramObject)) || (paramInt == 2))
          {
            HashMap localHashMap = this.iIo;
            r localr1 = new r(paramObject, paramInt, null);
            if ((localr1.iIA == 2) && (this.iIn.L(localr1.fa)))
              localr1.iIA = 3;
            r localr2 = (r)localHashMap.get(paramObject);
            int j;
            if (localr2 != null)
            {
              j = 1;
              if (j == 0)
                break label701;
              localHashMap.remove(localr2);
              switch (localr1.iIA)
              {
              case 3:
              case 4:
              default:
                switch (localr2.iIA)
                {
                case 3:
                case 4:
                default:
                  localr1.iIA = 3;
                  localHashMap.put(paramObject, localr1);
                case 5:
                case 2:
                }
                break;
              case 5:
              case 2:
              }
            }
            while (true)
            {
              if (!this.iIn.co(localHashMap.size()))
              {
                String str4 = this.TAG;
                Object[] arrayOfObject4 = new Object[1];
                arrayOfObject4[0] = Integer.valueOf(localHashMap.size());
                z.i(str4, "newcursor events size exceed limit :size is :  %d", arrayOfObject4);
                localHashMap.clear();
                localHashMap.put(this.iIx, null);
              }
              String str3 = this.TAG;
              Object[] arrayOfObject3 = new Object[1];
              arrayOfObject3[0] = Integer.valueOf(this.iIo.size());
              z.i(str3, "newcursor add event events size %d", arrayOfObject3);
              i = 0;
              break;
              j = 0;
              break label318;
              switch (localr2.iIA)
              {
              case 2:
              case 3:
              case 4:
              default:
                localr1.iIA = 5;
                break;
              case 5:
                z.i(this.TAG, "newcursor processEvent last delete, now delete, impossible");
                localr1.iIA = 5;
                break;
                switch (localr2.iIA)
                {
                case 3:
                case 4:
                default:
                  z.i(this.TAG, "newcursor processEvent last update, now insert, impossible");
                  localr1.iIA = 2;
                  break;
                case 5:
                  localr1.iIA = 3;
                  break;
                case 2:
                  z.i(this.TAG, "newcursor processEvent last insert, now insert, impossible");
                  localr1.iIA = 2;
                  break;
                  z.i(this.TAG, "newcursor processEvent last delete, now update, impossible");
                  break label404;
                  localr1.iIA = 2;
                  break;
                  localHashMap.put(paramObject, localr1);
                }
                break;
              }
            }
          }
          z.i(this.TAG, "newcursor event pass ");
          i = 0;
          break label96;
        }
        aOI();
        i = 0;
        break label96;
      }
    }
    while ((!this.iIm) || (!this.iIs));
    label185: label186: label212: et(false);
    label318:
  }

  protected boolean op()
  {
    if (this.iIn == null)
      return false;
    return this.iIn.op();
  }

  public void pause()
  {
    this.iIm = false;
    z.i(this.TAG, "new cursor pasue");
  }

  public final void resume()
  {
    z.i(this.TAG, "newcursor resume ");
    this.iIm = true;
    O("resume", true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.n
 * JD-Core Version:    0.6.2
 */