package com.tencent.mm.model;

import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.g.a;
import com.tencent.mm.n;
import com.tencent.mm.o.j;
import com.tencent.mm.o.l;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.Iterator;
import java.util.List;

public final class bw
{
  public static String A(String paramString1, String paramString2)
  {
    if (ch.jb(paramString1))
      paramString1 = null;
    while (ch.jb(paramString2))
      return paramString1;
    return paramString2 + ": " + paramString1;
  }

  public static int a(String paramString, cd paramcd)
  {
    z.d("!44@/B4Tb64lLpLj7S4izLo0fBMWNYO9d/rc0VQyi6V1H5o=", "deleteMsgByTalker %s", new Object[] { paramString });
    bg.qQ().n(new bx(paramString, paramcd));
    return 0;
  }

  public static void a(cd paramcd)
  {
    bg.qQ().n(new bz(paramcd));
  }

  public static void a(String paramString1, List paramList, String paramString2, boolean paramBoolean, String paramString3)
  {
    a(paramString1, paramList, paramString2, paramBoolean, paramString3, 2);
  }

  public static void a(String paramString1, List paramList, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    ar localar = new ar();
    localar.bJ(paramString1);
    localar.setType(10000);
    localar.q(System.currentTimeMillis());
    localar.setStatus(4);
    localar.bv(paramInt);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramList != null)
    {
      String str1 = x.pG();
      String str2 = ak.getContext().getString(n.byx);
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        if (!str3.equals(str1))
        {
          i locali = bg.qW().oT().ys(str3);
          if ((locali != null) && ((int)locali.dhv != 0))
          {
            if (paramBoolean)
              localStringBuffer.append("<a href=\"" + paramString3 + str3 + "\">" + locali.od() + "</a>" + str2);
            else
              localStringBuffer.append(locali.od() + str2);
          }
          else if (paramBoolean)
            localStringBuffer.append("<a href=\"" + paramString3 + str3 + "\">" + str3 + "</a>" + str2);
          else
            localStringBuffer.append(str3 + str2);
        }
      }
      if (localStringBuffer.length() > 0)
        localStringBuffer.deleteCharAt(localStringBuffer.lastIndexOf(str2));
    }
    localar.setContent(paramString2.replace("%s", localStringBuffer));
    bg.qW().oV().y(localar);
  }

  public static void a(List paramList, cd paramcd)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      z.d("!44@/B4Tb64lLpLj7S4izLo0fBMWNYO9d/rc0VQyi6V1H5o=", "deleteMsgByTalkers, empty talkers");
      return;
    }
    z.d("!44@/B4Tb64lLpLj7S4izLo0fBMWNYO9d/rc0VQyi6V1H5o=", "deleteMsgByTalkers");
    bg.qQ().n(new cb(paramList, paramcd));
  }

  public static void a(boolean paramBoolean, String paramString)
  {
    int i = 3;
    ar localar1 = bg.qW().oV().zr("qqsync");
    if ((localar1 == null) || (localar1.kk() == 0L))
    {
      ar localar2 = new ar();
      localar2.bJ("qqsync");
      if (paramBoolean);
      while (true)
      {
        localar2.setStatus(i);
        localar2.setType(1);
        if (paramString == null)
          paramString = "";
        localar2.setContent(paramString);
        localar2.q(ch.CM());
        bg.qW().oV().y(localar2);
        z.i("!44@/B4Tb64lLpLj7S4izLo0fBMWNYO9d/rc0VQyi6V1H5o=", "qqsync reminder new");
        return;
        i = 4;
      }
    }
    localar1.bJ("qqsync");
    if (paramBoolean);
    while (true)
    {
      localar1.setStatus(i);
      localar1.setType(1);
      if (paramString != null)
        localar1.setContent(paramString);
      localar1.q(ch.CM());
      bg.qW().oV().a(localar1.kk(), localar1);
      z.i("!44@/B4Tb64lLpLj7S4izLo0fBMWNYO9d/rc0VQyi6V1H5o=", "qqsync reminder updated");
      return;
      i = 4;
    }
  }

  public static long b(String paramString, long paramLong)
  {
    long l = 0L;
    if (paramString != null)
    {
      ar localar = bg.qW().oV().zr(paramString);
      if (localar != null)
        l = 1L + localar.kn();
    }
    if (l > paramLong * 1000L)
      return l;
    return paramLong * 1000L;
  }

  public static int c(String paramString, long paramLong)
  {
    ar localar = bg.qW().oV().q(paramString, paramLong);
    if (localar.kl() != paramLong)
      return 0;
    f(localar);
    return bg.qW().oV().s(paramString, paramLong);
  }

  public static boolean cM(int paramInt)
  {
    switch (paramInt)
    {
    case 25:
    default:
      return false;
    case 22:
    case 23:
    case 24:
    case 26:
    case 27:
    case 28:
    case 29:
    }
    return true;
  }

  public static long e(ar paramar)
  {
    i locali = bg.qW().oT().ys(paramar.kt());
    if ((locali == null) || ((int)locali.dhv == 0))
      bg.qW().oT().F(new i(paramar.kt()));
    return bg.qW().oV().y(paramar);
  }

  @Deprecated
  public static int ek(String paramString)
  {
    return el(paramString);
  }

  private static int el(String paramString)
  {
    if (paramString == null);
    int i;
    do
    {
      do
        return -1;
      while ((paramString.length() <= 0) || (paramString.startsWith("~SEMI_XML~")));
      i = paramString.indexOf(':');
    }
    while ((i != -1) && (paramString.substring(0, i).contains("<")));
    return i;
  }

  public static String em(String paramString)
  {
    int i = el(paramString);
    if (i == -1)
      return null;
    return paramString.substring(0, i);
  }

  public static String en(String paramString)
  {
    int i = el(paramString);
    if (i == -1);
    while (i + 2 >= paramString.length())
      return paramString;
    return paramString.substring(i + 2);
  }

  public static long eo(String paramString)
  {
    long l = System.currentTimeMillis();
    if (paramString != null)
    {
      ar localar = bg.qW().oV().zr(paramString);
      if ((localar != null) && (1L + localar.kn() > l))
        l = 1L + localar.kn();
    }
    return l;
  }

  public static int ep(String paramString)
  {
    return bg.qW().oV().zw(paramString);
  }

  private static void f(ar paramar)
  {
    if (paramar == null)
      return;
    int i = paramar.getType();
    switch (i)
    {
    default:
    case -1879048191:
    case -1879048190:
    case -1879048189:
    }
    while (true)
    {
      j localj = l.P(Integer.valueOf(i));
      if (localj == null)
        break;
      localj.d(paramar);
      return;
      i = 49;
    }
  }

  public static void f(List paramList)
  {
    if (paramList.size() == 0);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        v(((Long)localIterator.next()).longValue());
    }
  }

  public static int j(String paramString, int paramInt)
  {
    Cursor localCursor = bg.qW().oV().aj(paramString, paramInt);
    if (localCursor.moveToFirst())
      while (!localCursor.isAfterLast())
      {
        ar localar = new ar();
        localar.b(localCursor);
        f(localar);
        localCursor.moveToNext();
      }
    localCursor.close();
    return bg.qW().oV().ai(paramString, paramInt);
  }

  public static void rr()
  {
    List localList = bg.qW().oV().zt("bottlemessage");
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
        f((ar)localList.get(i));
    bg.qW().oV().zv("bottlemessage");
  }

  public static void rs()
  {
    List localList = bg.qW().oV().zt("qmessage");
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
        f((ar)localList.get(i));
    bg.qW().oV().zv("qmessage");
  }

  public static void rt()
  {
    List localList = bg.qW().oV().zt("tmessage");
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
        f((ar)localList.get(i));
    bg.qW().oV().zv("tmessage");
  }

  public static void ru()
  {
    List localList = bg.qW().oV().zt("message");
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
        f((ar)localList.get(i));
    bg.qW().oV().zv("message");
  }

  public static int v(long paramLong)
  {
    ar localar = bg.qW().oV().cV(paramLong);
    if (localar.kk() != paramLong)
      return 0;
    f(localar);
    return bg.qW().oV().cW(paramLong);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bw
 * JD-Core Version:    0.6.2
 */