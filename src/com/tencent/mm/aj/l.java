package com.tencent.mm.aj;

import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.am;
import java.util.HashMap;

public class l
  implements bd
{
  private static HashMap cZG;
  private u dFr = new u();
  private g dFs;
  private b dFt;
  private d dFu = new d();
  private i dFv;
  private k dFw;
  private com.tencent.mm.sdk.c.g dFx = new r(this);
  private com.tencent.mm.sdk.c.g dFy = new s(this);

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("LBSVERIFYMESSAGE_TABLE".hashCode()), new m());
    cZG.put(Integer.valueOf("SHAKEVERIFYMESSAGE_TABLE".hashCode()), new n());
    cZG.put(Integer.valueOf("VERIFY_CONTACT_TABLE".hashCode()), new o());
    cZG.put(Integer.valueOf("FMESSAGE_MSGINFO_TABLE".hashCode()), new p());
    cZG.put(Integer.valueOf("FMESSAGE_CONVERSATION_TABLE".hashCode()), new q());
  }

  private static l AD()
  {
    l locall = (l)bg.qF().eA(l.class.getName());
    if (locall == null)
    {
      locall = new l();
      bg.qF().a(l.class.getName(), locall);
    }
    return locall;
  }

  public static g AE()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (AD().dFs == null)
    {
      AD().dFs = new g(bg.qW().oO());
      b localb = AF();
      AD().dFs.a(localb, bg.qQ().getLooper());
    }
    return AD().dFs;
  }

  public static b AF()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (AD().dFt == null)
      AD().dFt = new b(bg.qW().oO());
    return AD().dFt;
  }

  public static i AG()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (AD().dFv == null)
      AD().dFv = new i(bg.qW().oO());
    return AD().dFv;
  }

  public static k AH()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (AD().dFw == null)
      AD().dFw = new k(bg.qW().oO());
    return AD().dFw;
  }

  public final void O(boolean paramBoolean)
  {
    com.tencent.mm.o.l.a(Integer.valueOf(37), this.dFr);
    com.tencent.mm.o.l.a(Integer.valueOf(40), this.dFu);
    com.tencent.mm.sdk.c.a.aGB().a("FMessageConversationStateOp", this.dFx);
    com.tencent.mm.sdk.c.a.aGB().a("FMsgInfoQuery", this.dFy);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    Integer localInteger1 = Integer.valueOf(37);
    com.tencent.mm.o.l.O(localInteger1);
    Integer localInteger2 = Integer.valueOf(40);
    com.tencent.mm.o.l.O(localInteger2);
    com.tencent.mm.sdk.c.a.aGB().b("FMessageConversationStateOp", this.dFx);
    com.tencent.mm.sdk.c.a.aGB().b("FMsgInfoQuery", this.dFy);
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
 * Qualified Name:     com.tencent.mm.aj.l
 * JD-Core Version:    0.6.2
 */