package com.tencent.mm.y;

import android.os.Looper;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.o.l;
import java.util.HashMap;

public class ap
  implements bd
{
  private static HashMap cZG;
  private n dyD;
  private v dyE;
  private d dyF;
  private ab dyG = new ab();
  private h dyH = null;
  private t dyI = new t();
  private a dyJ = null;
  private ar dyK = null;

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("IMGINFO_TABLE".hashCode()), new aq());
  }

  public static void clearCache()
  {
    yk();
  }

  private static ap yd()
  {
    ap localap = (ap)bg.qF().eA(ap.class.getName());
    if (localap == null)
    {
      localap = new ap();
      bg.qF().a(ap.class.getName(), localap);
    }
    return localap;
  }

  public static v ye()
  {
    if (yd().dyE == null)
      yd().dyE = new v();
    return yd().dyE;
  }

  public static d yf()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (yd().dyF == null)
      yd().dyF = new d();
    return yd().dyF;
  }

  public static n yg()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (yd().dyD == null)
      yd().dyD = new n(bg.qW().oO());
    return yd().dyD;
  }

  public static h yh()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (yd().dyH == null)
      yd().dyH = new h();
    return yd().dyH;
  }

  public static a yi()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (yd().dyJ == null)
      yd().dyJ = new a(Looper.getMainLooper());
    return yd().dyJ;
  }

  public static ar yj()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (yd().dyK == null)
      yd().dyK = new ar();
    return yd().dyK;
  }

  private static void yk()
  {
    n localn = yd().dyD;
    if (localn != null)
      localn.xU();
  }

  public final void O(boolean paramBoolean)
  {
    l.a(Integer.valueOf(3), this.dyI);
    l.a(Integer.valueOf(23), this.dyI);
    com.tencent.mm.cache.b.a("local_cdn_img_cache", this.dyG);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    if (yd().dyE != null)
      yd().dyE.stop();
    if (yd().dyJ != null)
      yd().dyJ.detach();
    if (yd().dyH != null)
      yd().dyH.detach();
    if (yd().dyK != null)
      yd().dyK.detach();
    yk();
    Integer localInteger1 = Integer.valueOf(3);
    l.O(localInteger1);
    Integer localInteger2 = Integer.valueOf(23);
    l.O(localInteger2);
    com.tencent.mm.cache.b.a("local_cdn_img_cache", null);
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
 * Qualified Name:     com.tencent.mm.y.ap
 * JD-Core Version:    0.6.2
 */