package com.tencent.mm.plugin.f.c;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.f.a.h;
import com.tencent.mm.plugin.f.a.i;
import com.tencent.mm.protocal.a.aaz;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

final class c
  implements com.tencent.mm.o.m
{
  private SparseBooleanArray fTp = new SparseBooleanArray();
  private SparseArray fTq = new SparseArray();

  public c()
  {
    b(aeX());
  }

  private static boolean a(i parami)
  {
    boolean bool1 = true;
    String str = k.afb();
    Object[] arrayOfObject1 = new Object[bool1];
    arrayOfObject1[0] = str;
    z.d("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "get report strategy path = %s", arrayOfObject1);
    if ((parami != null) && (str != null));
    try
    {
      byte[] arrayOfByte = parami.toByteArray();
      Object[] arrayOfObject3 = new Object[1];
      if (arrayOfByte == null);
      while (true)
      {
        arrayOfObject3[0] = Boolean.valueOf(bool1);
        z.d("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "data is null ? %B", arrayOfObject3);
        boolean bool4 = false;
        if (arrayOfByte != null)
        {
          boolean bool5 = ch.f(str, arrayOfByte);
          bool4 = bool5;
        }
        return bool4;
        bool1 = false;
      }
      Object[] arrayOfObject2 = new Object[2];
      boolean bool2;
      if (str == null)
      {
        bool2 = bool1;
        arrayOfObject2[0] = Boolean.valueOf(bool2);
        if (parami != null)
          break label148;
      }
      label148: for (boolean bool3 = bool1; ; bool3 = false)
      {
        arrayOfObject2[bool1] = Boolean.valueOf(bool3);
        z.w("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "saveReportRules error:configIni is null ? %B, rules is null ? %B", arrayOfObject2);
        return false;
        bool2 = false;
        break;
      }
    }
    catch (IOException localIOException)
    {
    }
    return false;
  }

  private static i aeX()
  {
    String str = k.afb();
    z.d("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "get report strategy path = %s", new Object[] { str });
    byte[] arrayOfByte = ch.oE(str);
    Object[] arrayOfObject1 = new Object[1];
    boolean bool1;
    if (arrayOfByte == null)
    {
      bool1 = true;
      arrayOfObject1[0] = Boolean.valueOf(bool1);
      z.d("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "data is null ? %B", arrayOfObject1);
      if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
        break label204;
    }
    while (true)
    {
      try
      {
        i locali2 = new i().an(arrayOfByte);
        locali1 = locali2;
        Object[] arrayOfObject2 = new Object[1];
        if (locali1 == null)
          break label210;
        bool2 = true;
        arrayOfObject2[0] = Boolean.valueOf(bool2);
        z.d("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "getStrategyList from file ok ? %B", arrayOfObject2);
        if (locali1 == null)
        {
          z.w("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "getStrategyList from file error, new a default strategy list, make sure kvstat must be reported");
          locali1 = new i();
          aaz localaaz = new aaz();
          localaaz.iuW = 1;
          localaaz.iuX = 1;
          localaaz.iuY = 3600;
          locali1.fSY.add(localaaz);
          locali1.fSK = locali1.fSY.size();
        }
        return locali1;
        bool1 = false;
      }
      catch (Exception localException)
      {
        if (!q.pV(str))
          ch.deleteFile(str);
      }
      label204: i locali1 = null;
      continue;
      label210: boolean bool2 = false;
    }
  }

  private void b(i parami)
  {
    if (parami == null)
      return;
    SparseArray localSparseArray = new SparseArray();
    Iterator localIterator = parami.fSY.iterator();
    while (localIterator.hasNext())
    {
      aaz localaaz2 = (aaz)localIterator.next();
      localSparseArray.put(localaaz2.iuW, localaaz2);
    }
    int i;
    aaz localaaz1;
    SparseBooleanArray localSparseBooleanArray3;
    int m;
    SparseBooleanArray localSparseBooleanArray2;
    int k;
    boolean bool2;
    try
    {
      this.fTp.clear();
      this.fTq.clear();
      i = 0;
      if (i >= localSparseArray.size())
        break label378;
      localaaz1 = (aaz)localSparseArray.valueAt(i);
      if (h.fSU)
      {
        z.i("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "it test model");
        switch (localaaz1.iuW)
        {
        case 2:
        default:
          localSparseBooleanArray3 = this.fTp;
          m = localaaz1.iuW;
          if (localaaz1.iuX == 0)
            break;
          localSparseBooleanArray2 = localSparseBooleanArray3;
          k = m;
          bool2 = true;
        case 1:
        case 0:
        case 3:
          while (true)
          {
            label176: localSparseBooleanArray2.put(k, bool2);
            if (!this.fTp.get(localaaz1.iuW))
              break;
            this.fTq.put(localaaz1.iuW, Long.valueOf(jr(30)));
            break label381;
            localSparseBooleanArray2 = this.fTp;
            k = localaaz1.iuW;
            bool2 = h.fSV;
            continue;
            localSparseBooleanArray2 = this.fTp;
            k = localaaz1.iuW;
            bool2 = h.fSW;
            continue;
            localSparseBooleanArray2 = this.fTp;
            k = localaaz1.iuW;
            bool2 = h.fSX;
          }
          this.fTq.put(localaaz1.iuW, Long.valueOf(jr(localaaz1.iuY)));
        }
      }
    }
    finally
    {
    }
    SparseBooleanArray localSparseBooleanArray1 = this.fTp;
    int j = localaaz1.iuW;
    if (localaaz1.iuX != 0);
    for (boolean bool1 = true; ; bool1 = false)
    {
      localSparseBooleanArray1.put(j, bool1);
      this.fTq.put(localaaz1.iuW, Long.valueOf(jr(localaaz1.iuY)));
      break label381;
      label378: return;
      label381: i++;
      break;
      localSparseBooleanArray2 = localSparseBooleanArray3;
      k = m;
      bool2 = false;
      break label176;
    }
  }

  private static long jr(int paramInt)
  {
    return Math.max(30000L, ch.nW(paramInt));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx == null)
    {
      z.w("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "onSceneEnd error: the arg scene is null");
      return;
    }
    switch (paramx.getType())
    {
    default:
      return;
    case 308:
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(paramInt1);
        arrayOfObject2[1] = Integer.valueOf(paramInt2);
        z.w("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "MMFunc_ReportStrategyCtrl, onSceneEnd error: errType is %d, errorCode is %d", arrayOfObject2);
        return;
      }
      LinkedList localLinkedList = ((com.tencent.mm.plugin.f.b.m)paramx).aeR();
      i locali = new i();
      Iterator localIterator = localLinkedList.iterator();
      while (localIterator.hasNext())
      {
        aaz localaaz = (aaz)localIterator.next();
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = localaaz.toString();
        z.d("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "strategy item = %s", arrayOfObject4);
        locali.fSY.add(localaaz);
      }
      locali.fSK = localLinkedList.size();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(localLinkedList.size());
      z.d("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "get strategy list, size = %d", arrayOfObject3);
      bg.qQ().n(new d(this, locali));
      b(locali);
      return;
    case 309:
    case 310:
    case 311:
    }
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    arrayOfObject1[2] = Integer.valueOf(paramx.getType());
    z.i("!44@/B4Tb64lLpIcBhSpAD9aGITV15Mr/EZEoesLdLFSJRM=", "onSceneEnd end: errType is %d, errorCode is %d, scene.type is %d", arrayOfObject1);
  }

  public final boolean jp(int paramInt)
  {
    try
    {
      boolean bool = this.fTp.get(paramInt, false);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long jq(int paramInt)
  {
    try
    {
      long l = ((Long)this.fTq.get(paramInt, Long.valueOf(0L))).longValue();
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.c
 * JD-Core Version:    0.6.2
 */