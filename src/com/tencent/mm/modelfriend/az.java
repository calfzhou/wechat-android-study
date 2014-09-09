package com.tencent.mm.modelfriend;

import com.tencent.mm.model.b;
import com.tencent.mm.model.dv;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import java.util.HashMap;
import java.util.LinkedList;

public class az
  implements com.tencent.mm.model.bd
{
  private static HashMap cZG;
  private bj dSh;
  private j duI;
  private p duJ;
  private z duK;
  private aw duL;
  private ay duM;
  private ah duN;
  private ae duO;
  private l duP = new l();
  private LinkedList duQ = null;
  private k duR = new k();
  private m duS = new m();
  private n duT = new n();
  private g duU = new bl(this);

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("ADDR_UPLOAD_TABLE".hashCode()), new ba());
    cZG.put(Integer.valueOf("FACE_BOOK_FIREND_TABLE".hashCode()), new bb());
    cZG.put(Integer.valueOf("FRIEND_EXT_TABLE".hashCode()), new bc());
    cZG.put(Integer.valueOf("QQ_GROUP_TABLE".hashCode()), new bd());
    cZG.put(Integer.valueOf("QQ_LIST_TABLE".hashCode()), new be());
    cZG.put(Integer.valueOf("INVITEFRIENDOPEN_TABLE".hashCode()), new bf());
    cZG.put(Integer.valueOf("GOOGLE_FRIEND_TABLE".hashCode()), new bg());
    cZG.put(Integer.valueOf("LINKEDIN_FRIEND_TABLE".hashCode()), new bh());
  }

  public static bj CG()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (wY().dSh == null)
      wY().dSh = new bj(com.tencent.mm.model.bg.qW().oO());
    return wY().dSh;
  }

  public static void c(LinkedList paramLinkedList)
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    wY().duQ = paramLinkedList;
  }

  private static az wY()
  {
    az localaz = (az)com.tencent.mm.model.bg.qF().eA(az.class.getName());
    if (localaz == null)
    {
      localaz = new az();
      com.tencent.mm.model.bg.qF().a(az.class.getName(), localaz);
    }
    return localaz;
  }

  public static j wZ()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (wY().duI == null)
      wY().duI = new j(com.tencent.mm.model.bg.qW().oO());
    return wY().duI;
  }

  public static p xa()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (wY().duJ == null)
      wY().duJ = new p(com.tencent.mm.model.bg.qW().oO());
    return wY().duJ;
  }

  public static z xb()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (wY().duK == null)
      wY().duK = new z(com.tencent.mm.model.bg.qW().oO());
    return wY().duK;
  }

  public static aw xc()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (wY().duL == null)
      wY().duL = new aw(com.tencent.mm.model.bg.qW().oO());
    return wY().duL;
  }

  public static ah xd()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (wY().duN == null)
      wY().duN = new ah(com.tencent.mm.model.bg.qW().oO());
    return wY().duN;
  }

  public static ay xe()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (wY().duM == null)
      wY().duM = new ay(com.tencent.mm.model.bg.qW().oO());
    return wY().duM;
  }

  public static LinkedList xf()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    return wY().duQ;
  }

  public static void xg()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    wY().duQ = null;
  }

  public static ae xh()
  {
    if (com.tencent.mm.model.bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (wY().duO == null)
      wY().duO = new ae(com.tencent.mm.model.bg.qW().oO());
    return wY().duO;
  }

  public final void O(boolean paramBoolean)
  {
    com.tencent.mm.o.l.a(Integer.valueOf(42), this.duP);
    com.tencent.mm.sdk.c.a.aGB().a("SetLocalQQMobile", this.duU);
    com.tencent.mm.sdk.c.a.aGB().a("AddFMessageCardClick", this.duU);
    com.tencent.mm.sdk.c.a.aGB().a("BindQQ", this.duR);
    com.tencent.mm.sdk.c.a.aGB().a("FMessageMobileFilter", this.duS);
    com.tencent.mm.sdk.c.a.aGB().a("FMsgGetName", this.duT);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    com.tencent.mm.sdk.c.a.aGB().b("SetLocalQQMobile", this.duU);
    com.tencent.mm.sdk.c.a.aGB().b("AddFMessageCardClick", this.duU);
    com.tencent.mm.sdk.c.a.aGB().b("BindQQ", this.duR);
    com.tencent.mm.sdk.c.a.aGB().b("FMessageMobileFilter", this.duS);
    com.tencent.mm.sdk.c.a.aGB().b("FMsgGetName", this.duT);
    Integer localInteger = Integer.valueOf(42);
    com.tencent.mm.o.l.O(localInteger);
    this.duQ = null;
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
 * Qualified Name:     com.tencent.mm.modelfriend.az
 * JD-Core Version:    0.6.2
 */