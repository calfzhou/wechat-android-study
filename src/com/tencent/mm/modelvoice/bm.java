package com.tencent.mm.modelvoice;

import com.tencent.mm.model.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.o.l;
import com.tencent.mm.storage.cu;
import java.util.HashMap;
import junit.framework.Assert;

public class bm
  implements bd
{
  private static HashMap cZG;
  private cb dII;
  private cu dIJ;
  private ap dIK;
  private bt dIL = new bt();

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("VOICE_TABLE".hashCode()), new bn());
    cZG.put(Integer.valueOf("VOICETRANSTEXT_TABLE".hashCode()), new bo());
  }

  private static bm BC()
  {
    bm localbm = (bm)bg.qF().eA(bm.class.getName());
    if (localbm == null)
    {
      localbm = new bm();
      bg.qF().a(bm.class.getName(), localbm);
    }
    return localbm;
  }

  public static cb BD()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (BC().dII == null)
      if (bg.qW().oO() == null)
        break label69;
    label69: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("dataDB is null ", bool);
      BC().dII = new cb(bg.qW().oO());
      return BC().dII;
    }
  }

  public static cu BE()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (BC().dIJ == null)
      if (bg.qW().oO() == null)
        break label69;
    label69: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("dataDB is null ", bool);
      BC().dIJ = new cu(bg.qW().oO());
      return BC().dIJ;
    }
  }

  public static ap BF()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (BC().dIK == null)
      BC().dIK = new ap();
    return BC().dIK;
  }

  public final void O(boolean paramBoolean)
  {
    l.a(Integer.valueOf(34), this.dIL);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    if (BC().dIK != null)
      BC().dIK.stop();
    Integer localInteger = Integer.valueOf(34);
    l.O(localInteger);
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
 * Qualified Name:     com.tencent.mm.modelvoice.bm
 * JD-Core Version:    0.6.2
 */