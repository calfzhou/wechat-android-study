package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class dv
{
  private static be dmx;
  private Map dmw = new HashMap();
  private String dmy = "";

  public static void a(be parambe)
  {
    dmx = parambe;
  }

  public final void O(boolean paramBoolean)
  {
    long l1;
    try
    {
      l1 = ch.CM();
      this.dmy = "onAccountPostReset";
      Iterator localIterator = this.dmw.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        long l2 = ch.CM();
        ((bd)localEntry.getValue()).O(paramBoolean);
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = localEntry.getKey();
        arrayOfObject2[1] = Long.valueOf(ch.ac(l2));
        z.d("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "onSubCoreAccountPostReset post:%s %d", arrayOfObject2);
      }
    }
    finally
    {
    }
    this.dmy = "";
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.dmw.size());
    arrayOfObject1[1] = Long.valueOf(ch.ac(l1));
    z.i("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "onSubCoreAccountPostReset finish Count:%d time:%d", arrayOfObject1);
  }

  public final boolean a(String paramString, bd parambd)
  {
    boolean bool = false;
    try
    {
      if (!ch.jb(this.dmy))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.dmy;
        z.e("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "REFUSE to addSubCore doing:%s", arrayOfObject);
      }
      while (true)
      {
        return bool;
        this.dmw.put(paramString, parambd);
        bool = true;
      }
    }
    finally
    {
    }
  }

  public final Map adE()
  {
    return this.dmw;
  }

  public final void cW(int paramInt)
  {
    try
    {
      this.dmy = "clearSubCorePluginData";
      Iterator localIterator = this.dmw.entrySet().iterator();
      while (localIterator.hasNext())
        ((bd)((Map.Entry)localIterator.next()).getValue()).ci(paramInt);
    }
    finally
    {
    }
    this.dmy = "";
  }

  public final void d(b paramb)
  {
    long l1;
    try
    {
      l1 = ch.CM();
      this.dmy = "onAccountInit";
      Iterator localIterator = this.dmw.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        long l2 = ch.CM();
        ((bd)localEntry.getValue()).r(paramb.pu(), paramb.pt());
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = localEntry.getKey();
        arrayOfObject2[1] = Long.valueOf(ch.ac(l2));
        z.i("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "onAccountInit %s time:%d", arrayOfObject2);
      }
    }
    finally
    {
    }
    this.dmy = "";
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.dmw.size());
    arrayOfObject1[1] = Long.valueOf(ch.ac(l1));
    z.i("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "onSubCoreAccountInit finish Count:%d time:%d", arrayOfObject1);
  }

  public final bd eA(String paramString)
  {
    return (bd)this.dmw.get(paramString);
  }

  public final void rY()
  {
    try
    {
      if (!ch.jb(this.dmy))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.dmy;
        z.w("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "ERR: Looping:%s , failed to resetSubCore", arrayOfObject2);
      }
      while (true)
      {
        return;
        this.dmw.clear();
        if (dmx != null)
        {
          this.dmw = dmx.ik();
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(this.dmw.size());
          z.i("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "resetSubCore get sub core map from sub core factory. count:%d", arrayOfObject1);
        }
      }
    }
    finally
    {
    }
  }

  public final void rZ()
  {
    long l1;
    try
    {
      l1 = ch.CM();
      this.dmy = "releaseSubCore";
      Iterator localIterator = this.dmw.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        long l2 = ch.CM();
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localEntry.getKey();
        z.i("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "releaseSubCore release:%s begin...", arrayOfObject2);
        ((bd)localEntry.getValue()).nv();
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = localEntry.getKey();
        arrayOfObject3[1] = Long.valueOf(ch.ac(l2));
        z.i("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "releaseSubCore release:%s %d", arrayOfObject3);
      }
    }
    finally
    {
    }
    this.dmy = "";
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(this.dmw.size());
    arrayOfObject1[1] = Long.valueOf(ch.ac(l1));
    z.i("!44@/B4Tb64lLpJEjYGMBUKuW1yoncBJdLoyd26QMGhtE8w=", "releaseSubCore finish Count:%d time:%d", arrayOfObject1);
  }

  public final Map sa()
  {
    HashMap localHashMap;
    try
    {
      this.dmy = "getSubCoreBaseDBFacotries";
      localHashMap = new HashMap();
      Iterator localIterator = this.dmw.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (((bd)localEntry.getValue()).nw() != null)
          localHashMap.putAll(((bd)localEntry.getValue()).nw());
      }
    }
    finally
    {
    }
    this.dmy = "";
    return localHashMap;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.dv
 * JD-Core Version:    0.6.2
 */