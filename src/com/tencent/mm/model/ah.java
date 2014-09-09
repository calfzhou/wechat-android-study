package com.tencent.mm.model;

import android.content.Context;
import com.tencent.mm.g.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;

public final class ah
{
  private b dkx;
  private ap dky;

  public ah(b paramb, ap paramap)
  {
    this.dkx = paramb;
    this.dky = paramap;
  }

  private int a(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    int i = 3;
    i locali = this.dkx.oT().ys(paramString);
    if (locali == null)
      locali = new i();
    if ((int)locali.dhv == 0)
    {
      locali.setUsername(paramString);
      locali.oz();
      localContext = ak.getContext();
      localaq = this.dky.a(paramString, localContext);
      locali.aU(localaq.dkB);
      locali.aV(localaq.dkA);
      locali.aW(localaq.dkC);
      if (paramBoolean2)
        i = 4;
      locali.bi(i);
      locali.tD();
      this.dkx.oT().F(locali);
      i = 1;
    }
    while (!paramBoolean1)
    {
      Context localContext;
      aq localaq;
      return i;
    }
    locali.tD();
    this.dkx.oT().a(paramString, locali);
    return 2;
  }

  public static void q(i parami)
  {
    if (parami == null)
      parami = new i();
    if ((int)parami.dhv == 0)
    {
      parami.setUsername("filehelper");
      if (bg.qW().oW().yE(parami.getUsername()) != null)
        break label63;
      parami.oA();
    }
    while (true)
    {
      parami.bi(3);
      bg.qW().oT().E(parami);
      return;
      label63: parami.oz();
    }
  }

  public final void Q(boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    q(this.dkx.oT().ys("filehelper"));
    String str = x.pG();
    i locali6;
    label76: i locali2;
    label452: i locali3;
    label606: i locali5;
    if (!ch.jb(str))
    {
      locali6 = this.dkx.oT().ys(str);
      if ((int)locali6.dhv == 0)
      {
        locali6.setUsername(str);
        locali6.oz();
        bg.qW().oT().F(locali6);
      }
    }
    else
    {
      a(paramBoolean, "qqmail", false);
      if (1 == a(paramBoolean, "qqsync", false))
      {
        this.dkx.oQ().set(65792, Boolean.valueOf(true));
        this.dkx.oQ().set(65794, Long.valueOf(ch.CL() - 1123200L));
      }
      a(paramBoolean, "floatbottle", false);
      a(paramBoolean, "shakeapp", false);
      a(paramBoolean, "lbsapp", false);
      a(paramBoolean, "medianote", false);
      a(paramBoolean, "newsapp", true);
      this.dkx.oW().yC("blogapp");
      this.dkx.oV().zw("blogapp");
      this.dkx.oT().yz("blogapp");
      a(paramBoolean, "facebookapp", true);
      a(paramBoolean, "qqfriend", false);
      a(paramBoolean, "masssendapp", true);
      a(paramBoolean, "feedsapp", true);
      this.dkx.oW().yC("tmessage");
      this.dkx.oT().yz("tmessage");
      a(paramBoolean, "qmessage", false);
      i locali1 = this.dkx.oT().ys("voip");
      locali2 = this.dkx.oT().ys("voipapp");
      if (locali2 == null)
        locali2 = new i();
      if ((locali1 != null) && ((int)locali1.dhv != 0))
        this.dkx.oT().yz("voip");
      if ((int)locali2.dhv != 0)
        break label857;
      locali2.setUsername("voipapp");
      locali2.oz();
      Context localContext3 = ak.getContext();
      aq localaq3 = this.dky.a("voipapp", localContext3);
      locali2.aU(localaq3.dkB);
      locali2.aV(localaq3.dkA);
      locali2.aW(localaq3.dkC);
      locali2.bi(4);
      locali2.tD();
      this.dkx.oT().G(locali2);
      locali3 = this.dkx.oT().ys("officialaccounts");
      if (locali3 == null)
        locali3 = new i();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(paramBoolean);
      arrayOfObject[1] = Integer.valueOf((int)locali3.dhv);
      z.i("!32@/B4Tb64lLpLN3e9EhE0UiK+iNlOVl2no", "hardcodeOfficialAccounts:update[%B], contactID[%d]", arrayOfObject);
      if ((int)locali3.dhv != 0)
        break label884;
      locali3.setUsername("officialaccounts");
      locali3.oA();
      Context localContext2 = ak.getContext();
      aq localaq2 = this.dky.a("officialaccounts", localContext2);
      locali3.aU(localaq2.dkB);
      locali3.aV(localaq2.dkA);
      locali3.aW(localaq2.dkC);
      locali3.bi(3);
      this.dkx.oT().G(locali3);
      i locali4 = this.dkx.oT().ys("voipaudio");
      locali5 = this.dkx.oT().ys("voicevoipapp");
      if (locali5 == null)
        locali5 = new i();
      if ((locali4 != null) && ((int)locali4.dhv != 0))
        this.dkx.oT().yz("voipaudio");
      if ((int)locali5.dhv != 0)
        break label919;
      locali5.setUsername("voicevoipapp");
      locali5.oz();
      Context localContext1 = ak.getContext();
      aq localaq1 = this.dky.a("voicevoipapp", localContext1);
      locali5.aU(localaq1.dkB);
      locali5.aV(localaq1.dkA);
      locali5.aW(localaq1.dkC);
      locali5.bi(4);
      locali5.tD();
      this.dkx.oT().G(locali5);
    }
    while (true)
    {
      a(paramBoolean, "voiceinputapp", false);
      a(paramBoolean, "googlecontact", false);
      a(paramBoolean, "linkedinplugin", false);
      if (!paramBoolean)
        break;
      bg.qW().oW().yC("Weixin");
      bg.qW().oT().yz("Weixin");
      return;
      if (a.cv(locali6.getType()))
        break label76;
      locali6.oz();
      bg.qW().oT().a(str, locali6);
      break label76;
      label857: if (!paramBoolean)
        break label452;
      locali2.tD();
      this.dkx.oT().a("voipapp", locali2);
      break label452;
      label884: if (!paramBoolean)
        break label606;
      z.i("!32@/B4Tb64lLpLN3e9EhE0UiK+iNlOVl2no", "do update hardcode official accounts");
      locali3.oA();
      this.dkx.oT().a("officialaccounts", locali3);
      break label606;
      label919: if (paramBoolean)
      {
        locali5.tD();
        this.dkx.oT().a("voicevoipapp", locali5);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ah
 * JD-Core Version:    0.6.2
 */