package com.tencent.mm.ah;

import com.tencent.mm.ad.m;
import com.tencent.mm.ad.s;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class d
{
  public int cOn = 0;
  public String dDn = "BeiJing;GuangZhou;ShangHai;";
  public int dDo = 0;
  public int dDp = 2;
  public int dDq = 2;
  public int dDr = 2;
  public int dDs = 10240;
  public int dDt = 10240000;
  public int dDu = 100;
  public int dDv = 100;
  public int dDw = 100;
  private Random dDx = new Random();
  public List dDy = null;

  private int zN()
  {
    switch (c.dDl)
    {
    default:
      return this.dDu;
    case 0:
      return this.dDu;
    case 1:
      return this.dDv;
    case 2:
    }
    return this.dDw;
  }

  public static d zP()
  {
    z.d("!12@nLQl5Xo8bwA=", "parseFromFile");
    m localm = s.yO();
    String str1 = localm.yL() + localm.E(1, 9);
    int i = com.tencent.mm.a.c.ab(str1);
    d locald1;
    if (i == -1)
    {
      z.e("!12@nLQl5Xo8bwA=", "read file failed " + i + str1);
      locald1 = null;
      return locald1;
    }
    byte[] arrayOfByte = com.tencent.mm.a.c.a(str1, 0, i);
    if (arrayOfByte == null)
    {
      z.e("!12@nLQl5Xo8bwA=", "read file failed " + i + str1);
      return null;
    }
    String str2 = new String(arrayOfByte);
    if (ch.jb(str2))
      return null;
    int j = str2.indexOf('<');
    String str3;
    if (j > 0)
      str3 = str2.substring(j);
    while (true)
    {
      int k = str3.hashCode();
      locald1 = (d)c.zK().get(Integer.valueOf(k));
      if (locald1 != null)
        break;
      Map localMap = com.tencent.mm.sdk.platformtools.x.bB(str3, "Config");
      if (localMap == null)
      {
        z.e("!12@nLQl5Xo8bwA=", "parse msg failed");
        return null;
      }
      label1196: 
      try
      {
        d locald2 = new d();
        label328: label466: label476: label1501: for (int m = 0; ; m++)
        {
          StringBuilder localStringBuilder1 = new StringBuilder(".Config.Item");
          Object localObject1;
          label244: String str4;
          Object localObject2;
          String[] arrayOfString;
          if (m == 0)
          {
            localObject1 = "";
            str4 = (String)localMap.get(localObject1 + ".$key");
            z.d("!12@nLQl5Xo8bwA=", "key " + str4);
            if (str4 == null)
              break label1196;
            if (!str4.equals("region"))
              break label476;
            StringBuilder localStringBuilder2 = new StringBuilder(".Config.Item");
            if (m != 0)
              break label466;
            localObject2 = "";
            locald2.dDn = ((String)localMap.get(localObject2));
            if ((locald2.dDn == null) || (locald2.dDn.length() <= 0))
              continue;
            arrayOfString = locald2.dDn.split(";");
            locald2.dDy = new ArrayList();
            if ((arrayOfString == null) || (arrayOfString.length <= 0))
              continue;
          }
          for (int n = 0; ; n++)
          {
            if (n >= arrayOfString.length)
              break label1501;
            if ((arrayOfString[n] != null) && (arrayOfString[n].length() > 0))
            {
              locald2.dDy.add(arrayOfString[n]);
              continue;
              localObject1 = Integer.valueOf(m);
              break label244;
              localObject2 = Integer.valueOf(m);
              break label328;
              if (str4.equals("sex"))
              {
                StringBuilder localStringBuilder3 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject3 = ""; ; localObject3 = Integer.valueOf(m))
                {
                  locald2.cOn = ch.getInt((String)localMap.get(localObject3), 0);
                  break;
                }
              }
              if (str4.equals("rate"))
              {
                StringBuilder localStringBuilder4 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject4 = ""; ; localObject4 = Integer.valueOf(m))
                {
                  locald2.dDo = ch.getInt((String)localMap.get(localObject4), 0);
                  break;
                }
              }
              if (str4.equals("minsize"))
              {
                StringBuilder localStringBuilder5 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject5 = ""; ; localObject5 = Integer.valueOf(m))
                {
                  locald2.dDs = ch.getInt((String)localMap.get(localObject5), 0);
                  break;
                }
              }
              if (str4.equals("maxsize"))
              {
                StringBuilder localStringBuilder6 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject6 = ""; ; localObject6 = Integer.valueOf(m))
                {
                  locald2.dDt = ch.getInt((String)localMap.get(localObject6), 0);
                  break;
                }
              }
              if (str4.equals("daycount_single"))
              {
                StringBuilder localStringBuilder7 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject7 = ""; ; localObject7 = Integer.valueOf(m))
                {
                  locald2.dDu = ch.getInt((String)localMap.get(localObject7), 0);
                  break;
                }
              }
              if (str4.equals("daycount_chatroom"))
              {
                StringBuilder localStringBuilder8 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject8 = ""; ; localObject8 = Integer.valueOf(m))
                {
                  locald2.dDv = ch.getInt((String)localMap.get(localObject8), 0);
                  break;
                }
              }
              if (str4.equals("daycount_app"))
              {
                StringBuilder localStringBuilder9 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject9 = ""; ; localObject9 = Integer.valueOf(m))
                {
                  locald2.dDw = ch.getInt((String)localMap.get(localObject9), 0);
                  break;
                }
              }
              if (str4.equals("rate_single"))
              {
                StringBuilder localStringBuilder10 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject10 = ""; ; localObject10 = Integer.valueOf(m))
                {
                  locald2.dDp = ch.getInt((String)localMap.get(localObject10), 0);
                  break;
                }
              }
              if (str4.equals("rate_chatroom"))
              {
                StringBuilder localStringBuilder11 = new StringBuilder(".Config.Item");
                if (m == 0);
                for (Object localObject11 = ""; ; localObject11 = Integer.valueOf(m))
                {
                  locald2.dDq = ch.getInt((String)localMap.get(localObject11), 0);
                  break;
                }
              }
              if (!str4.equals("rate_app"))
                break label1501;
              StringBuilder localStringBuilder12 = new StringBuilder(".Config.Item");
              if (m == 0);
              for (Object localObject12 = ""; ; localObject12 = Integer.valueOf(m))
              {
                locald2.dDr = ch.getInt((String)localMap.get(localObject12), 0);
                break;
              }
              z.d("!12@nLQl5Xo8bwA=", "sex " + locald2.cOn);
              z.d("!12@nLQl5Xo8bwA=", "rate_single " + locald2.dDp);
              z.d("!12@nLQl5Xo8bwA=", "rate_chatroom " + locald2.dDq);
              z.d("!12@nLQl5Xo8bwA=", "rate_app " + locald2.dDr);
              z.d("!12@nLQl5Xo8bwA=", "rate " + locald2.dDo);
              z.d("!12@nLQl5Xo8bwA=", "minsize " + locald2.dDs);
              z.d("!12@nLQl5Xo8bwA=", "maxsize " + locald2.dDt);
              z.d("!12@nLQl5Xo8bwA=", "daycount_single " + locald2.dDu);
              z.d("!12@nLQl5Xo8bwA=", "daycount_chatroom " + locald2.dDv);
              z.d("!12@nLQl5Xo8bwA=", "daycount_app " + locald2.dDw);
              z.d("!12@nLQl5Xo8bwA=", "region " + locald2.dDn);
              c.zK().b(Integer.valueOf(k), locald2);
              return locald2;
              str3 = str2;
              break;
            }
          }
        }
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }

  public final boolean zL()
  {
    i locali = com.tencent.mm.model.x.qh();
    String str1;
    boolean bool;
    String[] arrayOfString;
    if ("  getRegionCode " + locali != null)
    {
      str1 = locali.jz();
      z.d("!12@nLQl5Xo8bwA=", str1);
      String str2 = locali.jz();
      bool = false;
      if (str2 != null)
      {
        int i = str2.length();
        bool = false;
        if (i > 0)
        {
          List localList = this.dDy;
          bool = false;
          if (localList != null)
          {
            int j = this.dDy.size();
            bool = false;
            if (j > 0)
            {
              arrayOfString = str2.split("_");
              bool = false;
              if (arrayOfString != null)
              {
                int k = arrayOfString.length;
                bool = false;
                if (k <= 0);
              }
            }
          }
        }
      }
    }
    for (int m = 0; ; m++)
    {
      int n = arrayOfString.length;
      bool = false;
      if (m < n)
      {
        if ((arrayOfString[m] != null) && (arrayOfString[m].length() > 0))
        {
          Iterator localIterator = this.dDy.iterator();
          do
            if (!localIterator.hasNext())
              break;
          while (!((String)localIterator.next()).trim().toLowerCase().equals(arrayOfString[m].trim().toLowerCase()));
          z.d("!12@nLQl5Xo8bwA=", "isInRegion");
          bool = true;
        }
      }
      else
      {
        return bool;
        str1 = "";
        break;
      }
    }
  }

  public final int zM()
  {
    switch (c.dDl)
    {
    default:
      return this.dDp;
    case 0:
      return this.dDp;
    case 1:
      return this.dDq;
    case 2:
    }
    return this.dDr;
  }

  public final boolean zO()
  {
    z.d("!12@nLQl5Xo8bwA=", "type " + c.dDl);
    int i = zN();
    int j = zM();
    Integer localInteger = Integer.valueOf(ch.a((Integer)bg.qW().oQ().get(16646145)));
    z.d("!12@nLQl5Xo8bwA=", "daycount " + zN() + "  count " + localInteger + " rate " + j);
    if (localInteger.intValue() > i);
    while ((j == 0) || (!bc.bP(ak.getContext())))
      return false;
    int k = ch.a((Integer)bg.qW().oQ().get(12290), 0);
    boolean bool;
    if (this.cOn == 0)
      bool = true;
    while (true)
    {
      z.d("!12@nLQl5Xo8bwA=", "fitSex " + this.cOn + " " + bool + " " + this.cOn);
      if ((!bool) || (!zL()))
        break;
      int m = this.dDx.nextInt(j);
      z.d("!12@nLQl5Xo8bwA=", "luck " + m);
      if (m != j / 2)
        break;
      return true;
      if (this.cOn == k)
        bool = true;
      else
        bool = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.d
 * JD-Core Version:    0.6.2
 */