package com.tencent.mm.modelgeo;

import android.content.Context;
import android.location.LocationManager;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h
  implements b
{
  public static h dqP;
  private boolean KG = false;
  private o dvA = new k(this);
  private p dvp;
  private List dvq = new ArrayList();
  private long dvr = 0L;
  private boolean dvs = false;
  private boolean dvt = false;
  private double dvu = 23.0D;
  private double dvv = 100.0D;
  private int dvw = 0;
  private double dvx = 0.0D;
  private double dvy = 0.0D;
  private n dvz = new i(this);
  private Context mContext;

  private h(Context paramContext)
  {
    this.mContext = paramContext;
    this.dvp = p.xp();
  }

  public static h xl()
  {
    if (dqP == null)
      dqP = new h(ak.getContext());
    return dqP;
  }

  public static boolean xm()
  {
    try
    {
      boolean bool = ((LocationManager)ak.getContext().getSystemService("location")).isProviderEnabled("gps");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean xn()
  {
    try
    {
      boolean bool = ((LocationManager)ak.getContext().getSystemService("location")).isProviderEnabled("network");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final void a(c paramc)
  {
    if ((!this.KG) && (this.dvq.size() > 0));
    try
    {
      p.xq();
      p.a(this.dvz, this.mContext);
      this.KG = true;
      Iterator localIterator = this.dvq.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext())
          break;
        localWeakReference = (WeakReference)localIterator.next();
      }
      while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((c)localWeakReference.get()).equals(paramc)));
      i = 0;
      if (i != 0)
        this.dvq.add(new WeakReference(paramc));
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.dvq.size());
      z.i("!32@/B4Tb64lLpIu6Y+BscdrxN3pFdbvvih6", "add listeners size %d", arrayOfObject);
      if (this.dvq.size() != 1);
    }
    catch (q localq2)
    {
      while (true)
      {
        try
        {
          p.a(this.dvz, this.mContext);
          if ((this.dvs) && (System.currentTimeMillis() - this.dvr < 60000L))
            this.dvz.a(true, this.dvu, this.dvv, this.dvw, this.dvx, this.dvy);
          return;
          localq2 = localq2;
          z.d("!32@/B4Tb64lLpIu6Y+BscdrxN3pFdbvvih6", localq2.toString());
        }
        catch (q localq1)
        {
          z.d("!32@/B4Tb64lLpIu6Y+BscdrxN3pFdbvvih6", localq1.toString());
          continue;
        }
        int i = 1;
      }
    }
  }

  public final void b(c paramc)
  {
    if ((this.KG) && (this.dvq.size() > 0));
    try
    {
      p.xq();
      p.a(this.dvA, this.mContext);
      this.KG = false;
      Iterator localIterator = this.dvq.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext())
          break;
        localWeakReference = (WeakReference)localIterator.next();
      }
      while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((c)localWeakReference.get()).equals(paramc)));
      i = 0;
      if (i != 0)
        this.dvq.add(new WeakReference(paramc));
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.dvq.size());
      z.i("!32@/B4Tb64lLpIu6Y+BscdrxN3pFdbvvih6", "add listeners size %d", arrayOfObject);
      if (this.dvq.size() != 1);
    }
    catch (q localq2)
    {
      while (true)
      {
        try
        {
          p.a(this.dvA, this.mContext);
          if ((this.dvt) && (System.currentTimeMillis() - this.dvr < 60000L))
            this.dvz.a(true, this.dvu, this.dvv, this.dvw, this.dvx, this.dvy);
          return;
          localq2 = localq2;
          z.d("!32@/B4Tb64lLpIu6Y+BscdrxN3pFdbvvih6", localq2.toString());
        }
        catch (q localq1)
        {
          z.d("!32@/B4Tb64lLpIu6Y+BscdrxN3pFdbvvih6", localq1.toString());
          continue;
        }
        int i = 1;
      }
    }
  }

  public final void c(c paramc)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = this.dvq.iterator();
    while (localIterator1.hasNext())
    {
      WeakReference localWeakReference2 = (WeakReference)localIterator1.next();
      if ((localWeakReference2 == null) || (localWeakReference2.get() == null) || (((c)localWeakReference2.get()).equals(paramc)))
        localArrayList.add(localWeakReference2);
    }
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      WeakReference localWeakReference1 = (WeakReference)localIterator2.next();
      this.dvq.remove(localWeakReference1);
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.dvq.size());
    z.i("!32@/B4Tb64lLpIu6Y+BscdrxN3pFdbvvih6", "stop listeners size %d", arrayOfObject);
    if ((this.dvq.size() == 0) && (this.dvp != null))
      p.xq();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.h
 * JD-Core Version:    0.6.2
 */