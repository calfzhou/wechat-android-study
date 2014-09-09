package com.tencent.map.location;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Iterator;

public final class ad
{
  private static int KZ;
  private static int LL;
  private static int LM;
  private static int LN;
  private static int La;
  private static long Lz;
  private static long Mf;
  private static long Qy;
  private static ArrayList Yu;
  private static long ZP;
  private static long ZQ;
  private static int a = 10000;
  private static long aaA;
  private static long aaB;
  private static long aaC;
  private static long abi;
  private static int abj;
  private static int b = 15000;
  private static long d;
  private static int g;
  private static int j;

  static
  {
    KZ = 5000;
    La = 20000;
    LL = 25000;
    LM = 15000;
    a = 12000;
    b = 20000;
    KZ = 8000;
    La = 20000;
    LL = 25000;
    LM = 15000;
    ConnectivityManager localConnectivityManager = (ConnectivityManager)af.hi().getSystemService("connectivity");
    if (localConnectivityManager != null)
    {
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        int i = localNetworkInfo.getType();
        if ((localNetworkInfo.isConnected()) && (i == 0))
        {
          String str = ((TelephonyManager)af.hi().getSystemService("phone")).getSubscriberId();
          if ((str != null) && (str.length() > 3) && (!str.startsWith("46000")) && (!str.startsWith("46002")))
          {
            a = 15000;
            b = 25000;
            KZ = 10000;
            La = 25000;
            LL = 35000;
            LM = 15000;
          }
        }
      }
    }
  }

  public static void G(boolean paramBoolean)
  {
    if (!paramBoolean)
      j = 1 + j;
    ae localae = i(Thread.currentThread().getId());
    if (localae != null);
  }

  public static void a()
  {
    ae localae1 = h(Thread.currentThread().getId());
    if (localae1 == null);
    long l1;
    long l2;
    label77: 
    do
    {
      return;
      localae1.Qy = (System.currentTimeMillis() - localae1.Mf);
      localae1.Mf = System.currentTimeMillis();
      ZQ = localae1.Qy;
      if (localae1.Qy <= d)
        break;
      l1 = localae1.Qy;
      d = l1;
      if (localae1.Qy >= ZP)
        break label150;
      l2 = localae1.Qy;
      ZP = l2;
    }
    while (Yu == null);
    while (true)
    {
      Iterator localIterator;
      int i;
      synchronized (Yu)
      {
        localIterator = Yu.iterator();
        i = 0;
        if (localIterator.hasNext())
          break label173;
        if (i > 0)
          Qy /= i;
        return;
      }
      l1 = d;
      break;
      label150: if (ZP == 0L)
      {
        l2 = localae1.Qy;
        break label77;
      }
      l2 = ZP;
      break label77;
      label173: ae localae2 = (ae)localIterator.next();
      if (localae2.Qy > 0L)
      {
        Qy += localae2.Qy;
        i++;
      }
    }
  }

  public static void aT(int paramInt)
  {
    ae localae1 = h(Thread.currentThread().getId());
    if (localae1 == null)
      return;
    localae1.ZP = (System.currentTimeMillis() - localae1.Mf);
    localae1.Mf = System.currentTimeMillis();
    localae1.a = paramInt;
    long l;
    if (localae1.ZP == 0L)
      l = 1L;
    while (true)
    {
      int i = (int)(paramInt * 1000 / l);
      abj = i;
      int k;
      label79: int m;
      if (i > g)
      {
        k = abj;
        g = k;
        if (abj >= LN)
          break label202;
        m = abj;
        label98: LN = m;
        if (Yu == null);
      }
      label202: ae localae2;
      synchronized (Yu)
      {
        Iterator localIterator = Yu.iterator();
        if (!localIterator.hasNext())
        {
          if ((j > 0) && (localae1.Qy < KZ) && (localae1.d < LM))
            j = -1 + j;
          localae1.b = ((int)localae1.Qy);
          return;
          l = localae1.ZP;
          continue;
          k = g;
          break label79;
          if (LN == 0)
          {
            m = abj;
            break label98;
          }
          m = LN;
          break label98;
        }
        localae2 = (ae)localIterator.next();
      }
    }
  }

  public static void b()
  {
    ae localae1 = h(Thread.currentThread().getId());
    if (localae1 == null);
    long l1;
    long l2;
    label77: 
    do
    {
      return;
      localae1.d = (System.currentTimeMillis() - localae1.Mf);
      localae1.Mf = System.currentTimeMillis();
      abi = localae1.d;
      if (localae1.d <= aaB)
        break;
      l1 = localae1.d;
      aaB = l1;
      if (localae1.d >= aaC)
        break label150;
      l2 = localae1.d;
      aaC = l2;
    }
    while (Yu == null);
    while (true)
    {
      Iterator localIterator;
      int i;
      synchronized (Yu)
      {
        localIterator = Yu.iterator();
        i = 0;
        if (localIterator.hasNext())
          break label173;
        if (i > 0)
          aaA /= i;
        return;
      }
      l1 = aaB;
      break;
      label150: if (aaC == 0L)
      {
        l2 = localae1.d;
        break label77;
      }
      l2 = aaC;
      break label77;
      label173: ae localae2 = (ae)localIterator.next();
      if (localae2.d > 0L)
      {
        aaA += localae2.d;
        i++;
      }
    }
  }

  private static ae g(long paramLong)
  {
    if (Yu == null)
      Yu = new ArrayList();
    int k;
    int m;
    int n;
    label259: int i2;
    int i3;
    synchronized (Yu)
    {
      Iterator localIterator;
      if (Yu.size() > 20)
      {
        int i = Yu.size();
        k = 0;
        m = 0;
        n = 0;
        if (k < i / 2)
          break label259;
        if (m != 0)
        {
          Yu.get(0);
          Lz = 0L;
          Yu.get(0);
          Mf = 0L;
          d = ((ae)Yu.get(0)).Qy;
          ZP = ((ae)Yu.get(0)).Qy;
          aaB = ((ae)Yu.get(0)).d;
          aaC = ((ae)Yu.get(0)).d;
          if (((ae)Yu.get(0)).ZP > 0L)
            g = (int)(1000 * ((ae)Yu.get(0)).a / ((ae)Yu.get(0)).ZP);
          LN = g;
          localIterator = Yu.iterator();
        }
      }
      int i1;
      do
      {
        ae localae2;
        do
        {
          if (!localIterator.hasNext())
          {
            ae localae1 = new ae();
            localae1.Lz = paramLong;
            Yu.add(localae1);
            return localae1;
            if ((((ae)Yu.get(n)).ZP <= 0L) && (System.currentTimeMillis() - ((ae)Yu.get(n)).Mf <= 600000L))
              break label515;
            Yu.remove(n);
            i2 = 1;
            i3 = n;
            break;
          }
          localae2 = (ae)localIterator.next();
          if (0L > Lz)
            Lz = 0L;
          if (0L < Mf)
            Mf = 0L;
          if (localae2.Qy > d)
            d = localae2.Qy;
          if (localae2.Qy < ZP)
            ZP = localae2.Qy;
          if (localae2.d > aaB)
            aaB = localae2.d;
          if (localae2.d < aaC)
            aaC = localae2.d;
        }
        while (localae2.ZP <= 0L);
        i1 = (int)(1000 * localae2.a / localae2.ZP);
        if (i1 > g)
          g = i1;
      }
      while (i1 >= LN);
      LN = i1;
    }
    while (true)
    {
      k++;
      n = i3;
      m = i2;
      break;
      label515: int i4 = n + 1;
      int i5 = m;
      i3 = i4;
      i2 = i5;
    }
  }

  private static ae h(long paramLong)
  {
    if (Yu == null)
      return null;
    synchronized (Yu)
    {
      Iterator localIterator = Yu.iterator();
      ae localae;
      do
      {
        if (!localIterator.hasNext())
          return null;
        localae = (ae)localIterator.next();
      }
      while (localae.Lz != paramLong);
      return localae;
    }
  }

  public static int he()
  {
    int i = a;
    if ((Qy > 0L) && (d > 0L));
    for (int k = (int)(Math.max(ZQ, Qy) + d - ZP); ; k = i)
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)af.hi().getSystemService("connectivity");
      if (localConnectivityManager != null)
      {
        NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
        if (localNetworkInfo != null)
          if ((localNetworkInfo.isConnected()) || (!localNetworkInfo.isAvailable()))
            break label195;
      }
      for (k = b; ; k = KZ)
        label195: 
        do
        {
          int m = k + j * KZ;
          if (m <= KZ)
            m = KZ;
          if (m <= d)
            m = (int)(d + KZ);
          if (m >= b)
            m = b;
          ae localae = h(Thread.currentThread().getId());
          if (localae == null)
            localae = g(Thread.currentThread().getId());
          if (m < localae.b + KZ)
            m = localae.b + KZ;
          localae.b = m;
          return m;
        }
        while ((d <= 0L) || (d >= KZ));
    }
  }

  public static int hf()
  {
    int i = La;
    if ((aaA > 0L) && (aaB > 0L));
    for (int k = (int)(Math.max(abi, aaA) + aaB - aaC); ; k = i)
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)af.hi().getSystemService("connectivity");
      if (localConnectivityManager != null)
      {
        NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
        if (localNetworkInfo != null)
          if ((localNetworkInfo.isConnected()) || (!localNetworkInfo.isAvailable()))
            break label207;
      }
      for (k = LL; ; k = LM)
        label207: 
        do
        {
          int m = k + j * KZ;
          if (m <= LM)
            m = LM;
          if (m <= aaB)
            m = (int)(aaB + LM);
          if (m >= LL)
            m = LL;
          ae localae = h(Thread.currentThread().getId());
          if (localae != null)
          {
            if (m < localae.KZ + LM)
              m = localae.KZ + LM;
            if (m < localae.b + LM)
              m = localae.b + LM;
            localae.KZ = m;
          }
          return m;
        }
        while ((aaB <= 0L) || (aaB >= LM));
    }
  }

  public static void hg()
  {
    ae localae = h(Thread.currentThread().getId());
    if (localae == null)
      localae = g(Thread.currentThread().getId());
    if (localae == null)
      return;
    localae.Mf = System.currentTimeMillis();
  }

  private static ae i(long paramLong)
  {
    if (Yu != null);
    while (true)
    {
      int k;
      synchronized (Yu)
      {
        int i = Yu.size();
        k = i - 1;
        if (k < 0)
          return null;
        if (((ae)Yu.get(k)).Lz == paramLong)
        {
          ae localae = (ae)Yu.remove(k);
          return localae;
        }
      }
      k--;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.ad
 * JD-Core Version:    0.6.2
 */