package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.model.at;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.dv;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.l;
import com.tencent.mm.pluginsdk.ui.chat.as;
import com.tencent.mm.sdk.c.f;
import java.util.HashMap;

public class bf
  implements bd
{
  private static HashMap cZG;
  private o eeD;
  private b eeE;
  private r hvA;
  private bb hvB = null;
  private p hvC = new p();
  private com.tencent.mm.pluginsdk.model.a hvD = new com.tencent.mm.pluginsdk.model.a();
  private t hvE;
  private c hvF;
  private com.tencent.mm.sdk.c.g hvG = new bl(this);
  private com.tencent.mm.sdk.c.g hvH = new bm(this);
  private com.tencent.mm.sdk.c.g hvI = new bn(this);
  private h hvy;
  private m hvz;

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("APPATTACHINFO_TABLE".hashCode()), new bi());
    cZG.put(Integer.valueOf("APPINFO_TABLE".hashCode()), new bj());
    cZG.put(Integer.valueOf("APPMESSAGE_TABLE".hashCode()), new bk());
  }

  public bf()
  {
    com.tencent.mm.pluginsdk.g.a(new bg(this));
    as.a(new bh(this));
  }

  public static r GN()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (ayY().hvA == null)
      ayY().hvA = new r(com.tencent.mm.model.bg.qW().oO());
    return ayY().hvA;
  }

  public static o GO()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (ayY().eeD == null)
      ayY().eeD = new o(com.tencent.mm.model.bg.qW().oO(), com.tencent.mm.model.bg.qW().pn());
    return ayY().eeD;
  }

  public static b GP()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (ayY().eeE == null)
      ayY().eeE = new b(com.tencent.mm.model.bg.qW().oO());
    return ayY().eeE;
  }

  public static c Uq()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (ayY().hvF == null)
      ayY().hvF = new c();
    return ayY().hvF;
  }

  private static bf ayY()
  {
    bf localbf = (bf)com.tencent.mm.model.bg.qF().eA(bf.class.getName());
    if (localbf == null)
      localbf = new bf();
    return localbf;
  }

  public static h ayZ()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (ayY().hvy == null)
      ayY().hvy = new h();
    return ayY().hvy;
  }

  public static m aza()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (ayY().hvz == null)
      ayY().hvz = new m();
    return ayY().hvz;
  }

  public static bb azb()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (ayY().hvB == null)
      ayY().hvB = new bb();
    return ayY().hvB;
  }

  public static t azc()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (ayY().hvE == null)
      ayY().hvE = new t();
    return ayY().hvE;
  }

  public final void O(boolean paramBoolean)
  {
    at.a(aza());
    l.a(Integer.valueOf(47), this.hvD);
    l.a(Integer.valueOf(49), this.hvC);
    com.tencent.mm.sdk.c.a.aGB().a("GetAppSetting", this.hvG);
    com.tencent.mm.sdk.c.a.aGB().a("GetEmojiIsUseUnicode", this.hvH);
    com.tencent.mm.sdk.c.a.aGB().a("DynamicConfigUpdated", this.hvI);
    com.tencent.mm.ar.a.aNU();
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    bb localbb = ayY().hvB;
    if (localbb != null)
      localbb.stop();
    m localm = ayY().hvz;
    if (localm != null)
    {
      com.tencent.mm.model.bg.qX().b(231, localm);
      Uq().b(7, localm);
    }
    h localh = ayY().hvy;
    if (localh != null)
      localh.clear();
    t localt = ayY().hvE;
    if (localt != null)
      localt.stop();
    if (this.hvF != null)
      this.hvF.SU();
    Integer localInteger1 = Integer.valueOf(47);
    l.O(localInteger1);
    Integer localInteger2 = Integer.valueOf(49);
    l.O(localInteger2);
    com.tencent.mm.sdk.c.a.aGB().b("GetAppSetting", this.hvG);
    com.tencent.mm.sdk.c.a.aGB().b("GetEmojiIsUseUnicode", this.hvH);
    com.tencent.mm.sdk.c.a.aGB().b("DynamicConfigUpdated", this.hvI);
    com.tencent.mm.ar.a.aNV();
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
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.bf
 * JD-Core Version:    0.6.2
 */