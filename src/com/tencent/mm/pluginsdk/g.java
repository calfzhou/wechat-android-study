package com.tencent.mm.pluginsdk;

import android.content.Context;
import com.tencent.mm.pluginsdk.a.a;
import com.tencent.mm.pluginsdk.a.b;
import com.tencent.mm.pluginsdk.a.c;
import com.tencent.mm.pluginsdk.a.d;

public final class g
{
  private static af htd;
  private static ag hte;
  private static k htf;
  private static m htg;
  private static l hth;
  private static ad hti;
  private static i htj;
  private static o htk;
  private static ac htl;
  private static n htm;
  private static aj htn;
  private static al hto;
  private static ai htp;
  private static h htq;

  public static void a(ac paramac)
  {
    htl = paramac;
  }

  public static void a(ad paramad)
  {
    hti = paramad;
  }

  public static void a(af paramaf)
  {
    htd = paramaf;
  }

  public static void a(ag paramag)
  {
    hte = paramag;
  }

  public static void a(ai paramai)
  {
    htp = paramai;
  }

  public static void a(aj paramaj)
  {
    htn = paramaj;
  }

  public static void a(al paramal)
  {
    hto = paramal;
  }

  public static void a(h paramh)
  {
    htq = paramh;
  }

  public static void a(i parami)
  {
    htj = parami;
  }

  public static void a(k paramk)
  {
    htf = paramk;
  }

  public static void a(l paraml)
  {
    hth = paraml;
  }

  public static void a(m paramm)
  {
    htg = paramm;
  }

  public static void a(n paramn)
  {
    htm = paramn;
  }

  public static void a(o paramo)
  {
    htk = paramo;
  }

  public static o axQ()
  {
    if (htk == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKhdb2ZkhnNAZZun1WKwwb6seYTmHcGL2c=", "get shake mgr is null, new default");
      htk = new d();
    }
    return htk;
  }

  public static i axR()
  {
    if (htj == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKhdb2ZkhnNAZZun1WKwwb6seYTmHcGL2c=", "get emoji mgr is null, new default");
      htj = new b();
    }
    return htj;
  }

  public static m axS()
  {
    return htg;
  }

  public static af axT()
  {
    return htd;
  }

  public static ag axU()
  {
    return hte;
  }

  public static l axV()
  {
    return hth;
  }

  public static ad axW()
  {
    return hti;
  }

  public static ac axX()
  {
    return htl;
  }

  public static n axY()
  {
    if (htm == null)
      htm = new c();
    return htm;
  }

  public static aj axZ()
  {
    return htn;
  }

  public static al aya()
  {
    return hto;
  }

  public static ai ayb()
  {
    return htp;
  }

  public static h ayc()
  {
    if (htq == null)
      htq = new a();
    return htq;
  }

  public static z b(Context paramContext, aa paramaa)
  {
    if (htf != null)
      return htf.a(paramContext, paramaa);
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g
 * JD-Core Version:    0.6.2
 */