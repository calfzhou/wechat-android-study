package com.tencent.mm.ad;

import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

public class s
  implements bd
{
  private static HashMap cZG;
  private m dAC;
  private b dAD;
  private n dAE = new n();
  private o dAF = new o();
  private p dAG = new p();
  private q dAH = new q();
  private ay dAI = new ay(bg.qQ().getLooper(), new v(this), false);

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("PACKAGE_INFO_TABLE".hashCode()), new t());
    cZG.put(Integer.valueOf("CHATTINGBGINFO_TABLE".hashCode()), new u());
  }

  private static s yN()
  {
    s locals = (s)bg.qF().eA(s.class.getName());
    if (locals == null)
    {
      locals = new s();
      bg.qF().a(s.class.getName(), locals);
    }
    return locals;
  }

  public static m yO()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (yN().dAC == null)
      yN().dAC = new m(bg.qW().oO(), bg.qW().pm());
    return yN().dAC;
  }

  public static b yP()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (yN().dAD == null)
      yN().dAD = new b(bg.qW().oO());
    return yN().dAD;
  }

  public final void O(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      z.d("!32@/B4Tb64lLpIAhUt0Bg2QTsgGpzjTsLe/", "dkregcode Update RegonCode here !");
      this.dAI.cP(10000L);
    }
    com.tencent.mm.sdk.c.a.aGB().a("PostSyncTask", this.dAE);
    com.tencent.mm.sdk.c.a.aGB().a("PostSyncTask", this.dAF);
    com.tencent.mm.sdk.c.a.aGB().a("PostSyncTask", this.dAG);
    com.tencent.mm.sdk.c.a.aGB().a("PostSyncTask", this.dAH);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    com.tencent.mm.sdk.c.a.aGB().b("PostSyncTask", this.dAE);
    com.tencent.mm.sdk.c.a.aGB().b("PostSyncTask", this.dAF);
    com.tencent.mm.sdk.c.a.aGB().b("PostSyncTask", this.dAG);
    com.tencent.mm.sdk.c.a.aGB().b("PostSyncTask", this.dAH);
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
 * Qualified Name:     com.tencent.mm.ad.s
 * JD-Core Version:    0.6.2
 */