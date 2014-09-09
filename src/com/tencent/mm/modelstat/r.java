package com.tencent.mm.modelstat;

import com.tencent.mm.model.at;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.network.ag;
import com.tencent.mm.o.l;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.h;
import java.util.HashMap;

public class r
  implements bd
{
  private static HashMap cZG;
  private g dFg = new g();
  private j dFh;
  private a dFi = null;
  private ag drO = new s(this);

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("NETSTAT_TABLE".hashCode()), new u());
  }

  public static a An()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (Ao().dFi == null)
      Ao().dFi = new a(h.dgF);
    return Ao().dFi;
  }

  private static r Ao()
  {
    r localr = (r)bg.qF().eA(r.class.getName());
    if (localr == null)
    {
      localr = new r();
      bg.qF().a(r.class.getName(), localr);
    }
    return localr;
  }

  public static j Ap()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (Ao().dFh == null)
      Ao().dFh = new j(bg.qW().oO());
    return Ao().dFh;
  }

  public static void d(com.tencent.mm.network.r paramr)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(false);
    arrayOfObject[1] = ch.aHN();
    z.d("!32@/B4Tb64lLpIAhUt0Bg2QTmlgHJ0Y/UE3", "dknetstat setNetworkMoniter  isnull:%b  ,  %s ", arrayOfObject);
    paramr.a(Ao().dFg);
  }

  public final void O(boolean paramBoolean)
  {
    l.a(Integer.valueOf(9998), this.dFg);
    bg.a(this.drO);
    at.a(new v(this));
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    bg.b(this.drO);
    Integer localInteger = Integer.valueOf(9998);
    l.O(localInteger);
    this.dFg = new g();
    at.a(null);
  }

  public final HashMap nw()
  {
    return cZG;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.r
 * JD-Core Version:    0.6.2
 */