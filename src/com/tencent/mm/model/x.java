package com.tencent.mm.model;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.mm.a.c;
import com.tencent.mm.a.k;
import com.tencent.mm.g.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class x
{
  public static boolean CE()
  {
    return (0x2000 & pL()) != 0;
  }

  private static void a(int paramInt, Map paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localEntry.getKey();
      arrayOfObject[1] = localEntry.getValue();
      localStringBuilder.append(String.format(localLocale, "%s\n%s\n", arrayOfObject));
    }
    if ((bg.qW() != null) && (bg.qW().oQ() != null))
      bg.qW().oQ().set(327682, localStringBuilder.toString());
  }

  private static void b(int paramInt, Map paramMap)
  {
    paramMap.clear();
    if ((bg.qW() == null) || (bg.qW().oQ() == null))
      z.d("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "acc stg is null");
    while (true)
    {
      return;
      String str = (String)bg.qW().oQ().get(327682);
      if (str != null)
      {
        String[] arrayOfString = str.split("\n");
        if (arrayOfString.length % 2 != 0)
        {
          z.e("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "key and value not match, len: " + String.valueOf(arrayOfString.length));
          return;
        }
        for (int i = 0; i < arrayOfString.length; i += 2)
          paramMap.put(arrayOfString[i], arrayOfString[(i + 1)]);
      }
    }
  }

  public static boolean b(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((paramString1 == null) || (paramString1.length() == 0))
      z.e("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "canSendRawImage, invalid argument");
    do
    {
      do
        return false;
      while ((paramString2 != null) && (paramString2.length() > 0) && ((i.xY(paramString2)) || (i.ya(paramString2))));
      if (cZ(paramString1))
      {
        z.i("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "canSendRawImage : true. isSmallImg");
        return true;
      }
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(paramString1, localOptions);
      double d1 = localOptions.outWidth;
      double d2 = localOptions.outHeight;
      if ((d1 / d2 >= 2.5D) || (d2 / d1 >= 2.5D))
      {
        z.i("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "canSendRawImage : true, width height ratio > 2.5");
        return true;
      }
    }
    while (paramBoolean);
    return true;
  }

  public static boolean cY(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return false;
    String str = pG();
    if ((str == null) || (str.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "get userinfo fail");
      return false;
    }
    return str.equals(paramString);
  }

  public static boolean cZ(String paramString)
  {
    boolean bool = true;
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "isSmallImg, invalid argument");
      bool = false;
    }
    while (c.ab(paramString) < 65536)
      return bool;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = bool;
    BitmapFactory.decodeFile(paramString, localOptions);
    double d1 = localOptions.outWidth;
    double d2 = localOptions.outHeight;
    if ((d1 < 100.0D) && (d2 < 100.0D))
    {
      z.i("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "isSmallImg : true, width = " + d1 + ", height = " + d2);
      return bool;
    }
    return false;
  }

  public static String da(String paramString)
  {
    HashMap localHashMap = new HashMap();
    b(327682, localHashMap);
    if (localHashMap.containsKey(paramString))
      return (String)localHashMap.get(paramString);
    return null;
  }

  public static String getUserBindEmail()
  {
    return ch.ja((String)bg.qW().oQ().get(5));
  }

  public static int pF()
  {
    Integer localInteger = (Integer)bg.qW().oQ().get(9);
    if (localInteger == null)
      return 0;
    return localInteger.intValue();
  }

  public static String pG()
  {
    return (String)bg.qW().oQ().get(2);
  }

  public static String pH()
  {
    return (String)bg.qW().oQ().get(42);
  }

  public static String pI()
  {
    return (String)bg.qW().oQ().get(4);
  }

  public static String pJ()
  {
    String str = pH();
    if (!ch.jb(str))
      return str;
    return pG();
  }

  public static int pK()
  {
    Integer localInteger = (Integer)bg.qW().oQ().get(7);
    if (localInteger == null)
      return 0;
    return localInteger.intValue();
  }

  public static int pL()
  {
    Integer localInteger = (Integer)bg.qW().oQ().get(40);
    if (localInteger == null)
      return 0;
    return localInteger.intValue();
  }

  public static boolean pM()
  {
    return (0x4000 & pL()) != 0;
  }

  public static boolean pN()
  {
    return (0x8000 & pL()) != 0;
  }

  public static int pO()
  {
    Integer localInteger = (Integer)bg.qW().oQ().get(34);
    if (localInteger == null)
      return 0;
    return localInteger.intValue();
  }

  public static boolean pP()
  {
    return (0x40 & pK()) != 0;
  }

  public static boolean pQ()
  {
    if ((0x40000 & pK()) != 0);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!44@/B4Tb64lLpIASzWhbQWz2YUPL7bBfwfOEGvq4vvm/NU=", "isGooglePay: %s", arrayOfObject);
      return bool;
    }
  }

  public static boolean pR()
  {
    return (0x20 & pO()) == 0;
  }

  public static boolean pS()
  {
    return (0x1000 & pK()) != 0;
  }

  public static boolean pT()
  {
    cj localcj = bg.qW().oY().zX("@t.qq.com");
    return (localcj != null) && (localcj.aJt());
  }

  public static boolean pU()
  {
    return (0x2 & pO()) == 0;
  }

  public static boolean pV()
  {
    return (0x10 & pO()) == 0;
  }

  public static boolean pW()
  {
    return (0x80 & pO()) == 0;
  }

  public static boolean pX()
  {
    return ch.b((Boolean)bg.qW().oQ().get(8200));
  }

  public static boolean pY()
  {
    return (0x80000 & pO()) == 0;
  }

  public static boolean pZ()
  {
    return (0x40000 & pO()) == 0;
  }

  public static boolean qa()
  {
    return (0x2000 & pO()) == 0;
  }

  public static boolean qb()
  {
    return (0x10000 & pO()) == 0;
  }

  public static boolean qc()
  {
    String str = (String)bg.qW().oQ().get(65825);
    if (ch.jb(str))
      return false;
    if (str.equals("0"))
      return false;
    try
    {
      long l = ch.a(Long.valueOf(Long.parseLong(str)));
      if (l == 0L)
        return false;
    }
    catch (Exception localException)
    {
      return false;
    }
    return true;
  }

  public static boolean qd()
  {
    return (0x1 & pO()) == 0;
  }

  public static boolean qe()
  {
    return (0x20000 & pK()) == 0;
  }

  public static int qf()
  {
    return ch.a((Integer)bg.qW().oQ().get(8201), 22);
  }

  public static int qg()
  {
    return ch.a((Integer)bg.qW().oQ().get(8208), 8);
  }

  public static i qh()
  {
    i locali1 = bg.qW().oT().ys(pG());
    if ((locali1 != null) && ((int)locali1.dhv > 0))
      return locali1;
    i locali2 = new i();
    String str1 = (String)bg.qW().oQ().get(2);
    String str2 = (String)bg.qW().oQ().get(4);
    locali2.setUsername(str1);
    locali2.aU(str2);
    bg.qW().oT().F(locali2);
    return bg.qW().oT().ys(str1);
  }

  public static boolean qi()
  {
    return new k(ch.a((Integer)bg.qW().oQ().get(9))).longValue() != 0L;
  }

  public static void t(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    b(327682, localHashMap);
    localHashMap.put(paramString1, paramString2);
    a(327682, localHashMap);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.x
 * JD-Core Version:    0.6.2
 */