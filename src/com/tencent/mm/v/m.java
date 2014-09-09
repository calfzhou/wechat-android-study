package com.tencent.mm.v;

import com.tencent.mm.model.a;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.o.ac;
import java.util.HashMap;

public class m
  implements bd
{
  private static HashMap cZG;
  private b dwi;
  private c dwj;

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("GETCONTACTINFO_TABLE".hashCode()), new n());
  }

  private static m xx()
  {
    m localm = (m)bg.qF().eA(m.class.getName());
    if (localm == null)
    {
      localm = new m();
      bg.qF().a(m.class.getName(), localm);
    }
    return localm;
  }

  public static b xy()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (xx().dwi == null)
      xx().dwi = new b(bg.qW().oO());
    return xx().dwi;
  }

  public final void O(boolean paramBoolean)
  {
    if (xx().dwj == null)
      xx().dwj = new c();
    at.a(xx().dwj);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    if (xx().dwj != null)
    {
      c localc = xx().dwj;
      bg.qX().b(182, localc);
    }
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
 * Qualified Name:     com.tencent.mm.v.m
 * JD-Core Version:    0.6.2
 */