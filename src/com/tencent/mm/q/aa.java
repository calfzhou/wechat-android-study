package com.tencent.mm.q;

import android.content.Context;
import com.tencent.mm.model.a;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.model.u;
import com.tencent.mm.o.l;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.v;
import java.util.HashMap;
import java.util.Locale;

public class aa
  implements bd
{
  private static HashMap cZG;
  private u dlg = new u();
  private m drb;
  private w drc = null;
  private s drd = null;
  private com.tencent.mm.compatible.loader.b dre = null;
  private v drf = new ac(this);
  private o drg = new ad(this);

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("BIZINFO_TABLE".hashCode()), new ab());
  }

  private static aa uX()
  {
    aa localaa = (aa)bg.qF().eA(aa.class.getName());
    if (localaa == null)
    {
      localaa = new aa();
      bg.qF().a(aa.class.getName(), localaa);
    }
    return localaa;
  }

  public static m uY()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (uX().drb == null)
      uX().drb = new m(bg.qW().oO());
    return uX().drb;
  }

  public static w uZ()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (uX().drc == null)
      uX().drc = new w();
    return uX().drc;
  }

  public static s va()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (uX().drd == null)
      uX().drd = new s();
    return uX().drd;
  }

  public static com.tencent.mm.compatible.loader.b vb()
  {
    String str = y.d(ak.getContext().getSharedPreferences(ak.aHi(), 0));
    if (str.equals("language_default"))
      y.a(uX().dre, Locale.ENGLISH);
    while (true)
    {
      return uX().dre;
      Locale localLocale = y.xa(str);
      y.a(uX().dre, localLocale);
    }
  }

  public static void vc()
  {
    aa localaa = uX();
    z.d("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "resetResContextImp");
    localaa.dre = com.tencent.mm.compatible.loader.b.a(ak.getContext(), bg.qW().pt() + "brand_i18n.apk", "com.tencent.mm.bizi18nres", true);
  }

  public final void O(boolean paramBoolean)
  {
    l.a(Integer.valueOf(55), this.dlg);
    l.a(Integer.valueOf(57), this.dlg);
    this.dre = com.tencent.mm.compatible.loader.b.a(ak.getContext(), bg.qW().pt() + "brand_i18n.apk", "com.tencent.mm.bizi18nres", false);
    bg.qW().oW().b(this.drf);
    uY().a(this.drg);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    Integer localInteger1 = Integer.valueOf(55);
    l.O(localInteger1);
    Integer localInteger2 = Integer.valueOf(57);
    l.O(localInteger2);
    if ((this.drd == null) || (bg.oE()))
    {
      bg.qW().oW().c(this.drf);
      uY().b(this.drg);
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
 * Qualified Name:     com.tencent.mm.q.aa
 * JD-Core Version:    0.6.2
 */