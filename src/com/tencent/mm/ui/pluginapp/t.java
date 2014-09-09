package com.tencent.mm.ui.pluginapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.mm.aj.l;
import com.tencent.mm.c.a.eo;
import com.tencent.mm.c.a.ep;
import com.tencent.mm.c.a.fd;
import com.tencent.mm.c.a.ff;
import com.tencent.mm.c.a.im;
import com.tencent.mm.c.a.mg;
import com.tencent.mm.f.c;
import com.tencent.mm.h;
import com.tencent.mm.model.bb;
import com.tencent.mm.model.bc;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cs;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.protocal.a.zf;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.FacebookFriendUI;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.base.preference.IconMsgPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.bindgooglecontact.BindGoogleContactIntroUI;
import com.tencent.mm.ui.bindgooglecontact.GoogleFriendUI;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.MobileFriendUI;
import com.tencent.mm.ui.bindqq.QQGroupUI;
import com.tencent.mm.ui.friend.FriendSnsPreference;
import com.tencent.mm.y.ar;
import com.tencent.mm.y.au;
import com.tencent.mm.y.d;

public class t extends com.tencent.mm.ui.b
  implements bb, bc, al, as
{
  private com.tencent.mm.ui.base.preference.o dXi;
  private CheckBox fra;
  private com.tencent.mm.ui.base.aa frc = null;
  private com.tencent.mm.pluginsdk.c.a hHa = new w(this);
  com.tencent.mm.sdk.c.g iJT = new x(this);
  private View jKL;
  private boolean jKM = false;
  private String jKN = "";
  private int jKO = 0;
  private String jKP = null;
  private boolean jKQ = false;
  com.tencent.mm.sdk.c.g jKR = new z(this);
  private com.tencent.mm.pluginsdk.c.a jKS = new aa(this);
  private com.tencent.mm.pluginsdk.c.a jKT = new ab(this);
  au jKU = new ac(this);
  private cm mHandler = new u(this, Looper.getMainLooper());

  private void aYN()
  {
    Object localObject1;
    String str1;
    boolean bool1;
    label32: com.tencent.mm.ui.base.preference.o localo2;
    String str2;
    boolean bool2;
    label87: label98: Object localObject2;
    String str3;
    boolean bool3;
    label119: int i2;
    label130: label150: label170: label190: label213: boolean bool6;
    label231: com.tencent.mm.ui.base.preference.o localo5;
    if (!com.tencent.mm.am.a.to("sns"))
    {
      localObject1 = this.dXi;
      str1 = "album_dyna_photo_ui_title";
      bool1 = true;
      ((com.tencent.mm.ui.base.preference.o)localObject1).R(str1, bool1);
      if ((IconPreference)this.dXi.BU("add_more_friends") != null)
        this.dXi.R("add_more_friends", com.tencent.mm.f.e.os().oe());
      if (com.tencent.mm.am.a.to("nearby"))
        break label653;
      localo2 = this.dXi;
      str2 = "find_friends_by_near";
      bool2 = true;
      localo2.R(str2, bool2);
      if (com.tencent.mm.am.a.to("shake"))
        break label852;
      localObject2 = this.dXi;
      str3 = "find_friends_by_shake";
      bool3 = true;
      ((com.tencent.mm.ui.base.preference.o)localObject2).R(str3, bool3);
      if (com.tencent.mm.am.a.to("bottle"))
        break label1014;
      this.dXi.R("voice_bottle", true);
      if (com.tencent.mm.am.a.to("game"))
        break label1188;
      this.dXi.R("more_tab_game_recommend", true);
      if (com.tencent.mm.am.a.to("scanner"))
        break label1246;
      this.dXi.R("find_friends_by_qrcode", true);
      if (ch.a((Integer)bg.qW().oQ().get(9)) == 0)
        break label1261;
      i2 = 1;
      if ((i2 != 0) && ((0x1000 & com.tencent.mm.model.x.pO()) == 0))
        break label1267;
      bool6 = true;
      this.dXi.R("find_friends_by_qq", bool6);
      this.dXi.R("find_friends_by_facebook", true);
      localo5 = this.dXi;
      if (ch.ys())
        break label1273;
    }
    label351: label624: label631: label1273: for (boolean bool7 = true; ; bool7 = false)
    {
      localo5.R("find_friends_by_google_account", bool7);
      fS(false);
      this.dXi.R("settings_emoji_store", true);
      this.dXi.notifyDataSetChanged();
      return;
      this.dXi.R("album_dyna_photo_ui_title", false);
      FriendSnsPreference localFriendSnsPreference = (FriendSnsPreference)this.dXi.BU("album_dyna_photo_ui_title");
      if (localFriendSnsPreference == null)
        break label32;
      int i;
      int i4;
      if ((0x8000 & com.tencent.mm.model.x.pO()) == 0)
      {
        i = 1;
        if (i != 0)
        {
          localFriendSnsPreference.setIconDrawable(com.tencent.mm.aq.a.n(agh(), h.Vi));
          boolean bool8 = ch.b((Boolean)bg.qW().oQ().get(48));
          localFriendSnsPreference.pT(8);
          localFriendSnsPreference.qF(8);
          if (bool8)
          {
            localFriendSnsPreference.pT(0);
            localFriendSnsPreference.aq(getString(com.tencent.mm.n.btN), h.Xq);
          }
          this.jKN = ((String)bg.qW().oQ().get(68377));
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = ch.Y(this.jKN, "");
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "newer snsobj %s", arrayOfObject);
          if (ch.jb(this.jKN))
            break label631;
          localFriendSnsPreference.pV(0);
          if (!ch.a((Boolean)bg.qW().oQ().get(68384), true))
            break label624;
          i4 = 0;
          localFriendSnsPreference.qF(i4);
          localFriendSnsPreference.Db(this.jKN);
        }
      }
      com.tencent.mm.ui.base.preference.o localo1;
      while (true)
      {
        if (am.ayi() != null)
          this.jKO = am.ayi().Ay();
        if (this.jKO != 0)
        {
          localFriendSnsPreference.pT(0);
          localFriendSnsPreference.aq(this.jKO, h.acu);
        }
        com.tencent.mm.sdk.c.a.aGB().g(new mg());
        localo1 = this.dXi;
        if (i != 0)
          break label640;
        localObject1 = localo1;
        str1 = "album_dyna_photo_ui_title";
        bool1 = true;
        break;
        i = 0;
        break label351;
        i4 = 8;
        break label513;
        localFriendSnsPreference.pV(8);
      }
      localObject1 = localo1;
      str1 = "album_dyna_photo_ui_title";
      bool1 = false;
      break;
      this.dXi.R("find_friends_by_near", false);
      IconPreference localIconPreference1 = (IconPreference)this.dXi.BU("find_friends_by_near");
      if (localIconPreference1 == null)
        break label98;
      fd localfd = new fd();
      localfd.cKu.cKw = 7;
      com.tencent.mm.sdk.c.a.aGB().g(localfd);
      if (localfd.cKv.cCM)
      {
        localIconPreference1.pV(8);
        int j = l.AG().Ay();
        if (j <= 0)
          break label822;
        localIconPreference1.pT(0);
        localIconPreference1.aq(String.valueOf(j), h.acu);
        label766: if ((0x200 & com.tencent.mm.model.x.pO()) != 0)
          break label840;
      }
      for (int k = 1; ; k = 0)
      {
        localo2 = this.dXi;
        str2 = "find_friends_by_near";
        if (k != 0)
          break label846;
        bool2 = true;
        break;
        localIconPreference1.pV(0);
        localIconPreference1.pU(h.WN);
        localIconPreference1.aTG();
        break label734;
        localIconPreference1.pT(8);
        localIconPreference1.aq("", -1);
        break label766;
      }
      bool2 = false;
      break label87;
      this.dXi.R("find_friends_by_shake", false);
      IconPreference localIconPreference2 = (IconPreference)this.dXi.BU("find_friends_by_shake");
      if (localIconPreference2 == null)
        break label130;
      int m;
      if ((0x100 & com.tencent.mm.model.x.pO()) == 0)
      {
        m = 1;
        if (m != 0)
        {
          int i3 = l.AH().Ay() + com.tencent.mm.pluginsdk.g.axQ().ajA();
          if (i3 <= 0)
            break label982;
          localIconPreference2.pT(0);
          localIconPreference2.aq(String.valueOf(i3), h.acu);
        }
      }
      com.tencent.mm.ui.base.preference.o localo3;
      while (true)
      {
        localIconPreference2.pV(8);
        localo3 = this.dXi;
        if (m != 0)
          break label1000;
        localObject2 = localo3;
        str3 = "find_friends_by_shake";
        bool3 = true;
        break;
        m = 0;
        break label898;
        localIconPreference2.pT(8);
        localIconPreference2.aq("", -1);
      }
      localObject2 = localo3;
      str3 = "find_friends_by_shake";
      bool3 = false;
      break label119;
      this.dXi.R("voice_bottle", false);
      if ((IconPreference)this.dXi.BU("voice_bottle") == null)
        break label150;
      boolean bool4;
      com.tencent.mm.ui.base.preference.o localo4;
      if ((0x40 & com.tencent.mm.model.x.pO()) == 0)
      {
        bool4 = true;
        this.jKM = bool4;
        localo4 = this.dXi;
        if (this.jKM)
          break label1172;
      }
      IconPreference localIconPreference3;
      for (boolean bool5 = true; ; bool5 = false)
      {
        localo4.R("voice_bottle", bool5);
        if (!this.jKM)
          break;
        localIconPreference3 = (IconPreference)this.dXi.BU("voice_bottle");
        if (localIconPreference3 == null)
          break;
        int n = com.tencent.mm.model.z.qs();
        if (n > 0)
          localIconPreference3.aq(String.valueOf(n), h.acu);
        int i1 = com.tencent.mm.model.x.pK();
        if ((n <= 0) || ((i1 & 0x8000) != 0))
          break label1178;
        localIconPreference3.pT(0);
        break;
        bool4 = false;
        break label1055;
      }
      localIconPreference3.pT(8);
      break label150;
      this.dXi.R("more_tab_game_recommend", false);
      com.tencent.mm.pluginsdk.ac localac = com.tencent.mm.pluginsdk.g.axX();
      if (localac == null)
        break label170;
      if (!localac.aI(agh()))
      {
        this.dXi.R("more_tab_game_recommend", true);
        break label170;
      }
      aYQ();
      break label170;
      this.dXi.R("find_friends_by_qrcode", false);
      break label190;
      i2 = 0;
      break label213;
      bool6 = false;
      break label231;
    }
  }

  private static int aYO()
  {
    com.tencent.mm.jdbiz.f localf = com.tencent.mm.jdbiz.g.Cp().Cu();
    int i = 1;
    com.tencent.mm.jdbiz.g.Cp();
    if (com.tencent.mm.jdbiz.g.Cq())
    {
      if ((localf.Cn()) || (!"3".equals(localf.dQw)) || (ch.jb(localf.daK)))
        break label54;
      i = 6;
    }
    label54: 
    do
    {
      return i;
      if (!ch.jb(localf.dQz))
        return 3;
    }
    while (!localf.dQB);
    return 2;
  }

  private static String aYP()
  {
    int i = 1;
    String str = com.tencent.mm.f.e.or().getValue("JDEntranceConfigJumpUrl");
    if (ch.jb(str))
      return null;
    com.tencent.mm.jdbiz.f localf = com.tencent.mm.jdbiz.g.Cp().Cu();
    com.tencent.mm.jdbiz.g.Cp();
    if (com.tencent.mm.jdbiz.g.Cq())
    {
      if ((localf.Cn()) || (!"3".equals(localf.dQw)) || (ch.jb(localf.daK)))
        break label107;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = localf.daK;
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "jumpUrl update %s", arrayOfObject);
      str = localf.daK;
      i = 6;
    }
    while (true)
    {
      return com.tencent.mm.jdbiz.g.t(str, i);
      label107: if (!ch.jb(localf.dQz))
        i = 3;
      else if (localf.dQB)
        i = 2;
    }
  }

  private void aYQ()
  {
    com.tencent.mm.pluginsdk.ac localac = com.tencent.mm.pluginsdk.g.axX();
    if (localac == null)
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "get subcoregamecenter is null ,return");
    int i;
    int j;
    IconPreference localIconPreference;
    do
    {
      return;
      i = localac.TW();
      j = localac.TT();
      localIconPreference = (IconPreference)this.dXi.BU("more_tab_game_recommend");
    }
    while (localIconPreference == null);
    if (j > 0)
    {
      localIconPreference.aq(getString(com.tencent.mm.n.btN), h.Xq);
      localIconPreference.pT(0);
      localIconPreference.pS(8);
      return;
    }
    if (i > 0)
    {
      localIconPreference.pS(0);
      localIconPreference.aq("", -1);
      localIconPreference.pT(8);
      return;
    }
    localIconPreference.pT(8);
    localIconPreference.pS(8);
    localIconPreference.aq("", -1);
  }

  private void fS(boolean paramBoolean)
  {
    String str1 = com.tencent.mm.f.e.or().getValue("JDEntranceConfigName");
    String str2 = com.tencent.mm.f.e.or().getValue("JDEntranceConfigIconUrl");
    String str3 = aYP();
    if ((!ch.jb(str1)) && (!ch.jb(str2)) && (!ch.jb(str3)))
    {
      IconMsgPreference localIconMsgPreference = (IconMsgPreference)this.dXi.BU("jd_market_entrance");
      com.tencent.mm.y.ap.yf();
      Bitmap localBitmap = d.gK(str2);
      com.tencent.mm.jdbiz.f localf;
      if (localBitmap != null)
      {
        localIconMsgPreference.setIconDrawable(new BitmapDrawable(agh().getResources(), localBitmap));
        this.jKP = null;
        localIconMsgPreference.setTitle(str1);
        localf = com.tencent.mm.jdbiz.g.Cp().Cu();
        localIconMsgPreference.BY("");
        localIconMsgPreference.aTF();
        localIconMsgPreference.pS(8);
        if (localf != null)
        {
          com.tencent.mm.jdbiz.g.Cp();
          if (com.tencent.mm.jdbiz.g.Cq())
          {
            if ((ch.jb(localf.dQz)) || (localf.Cn()))
              break label308;
            localIconMsgPreference.aTF();
            localIconMsgPreference.pS(8);
            localIconMsgPreference.BY(localf.dQz);
          }
        }
      }
      while (true)
      {
        this.dXi.R("jd_market_entrance", false);
        if (paramBoolean)
          this.dXi.notifyDataSetChanged();
        if (!this.jKQ)
        {
          com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = str3;
          arrayOfObject[1] = com.tencent.mm.jdbiz.g.Cp().Cu().dQx;
          arrayOfObject[2] = Integer.valueOf(aYO());
          localn.d(11178, arrayOfObject);
          this.jKQ = true;
        }
        return;
        localIconMsgPreference.setIconDrawable(null);
        com.tencent.mm.y.ap.yj().a(str2, this.jKU);
        this.jKP = str2;
        break;
        label308: if ((localf.dQB) && (!localf.Cn()))
        {
          localIconMsgPreference.pS(0);
          localIconMsgPreference.BX("");
          localIconMsgPreference.aTF();
        }
      }
    }
    this.dXi.R("jd_market_entrance", true);
  }

  public final int DZ()
  {
    com.tencent.mm.am.a.aCl();
    return com.tencent.mm.q.czC;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    aYN();
  }

  public final void a(zf paramzf)
  {
    if ((0x8000 & com.tencent.mm.model.x.pO()) != 0)
      return;
    this.jKO = (1 + this.jKO);
    aYN();
  }

  public final void a(String paramString, ao paramao)
  {
    aYN();
  }

  public final void aOY()
  {
  }

  protected final void aOc()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab create");
    this.dXi = aTL();
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab create end");
  }

  protected final void aOd()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab resume");
    com.tencent.mm.pluginsdk.c.a.a("LBSVerifyStorageNotify", this.hHa);
    com.tencent.mm.pluginsdk.c.a.a("GameMessageStorageNotify", this.jKS);
    com.tencent.mm.pluginsdk.c.a.a("ShakeMessageStorageNotify", this.jKT);
    com.tencent.mm.sdk.c.a.aGB().a("JDSysMsgNotify", this.iJT);
    com.tencent.mm.sdk.c.a.aGB().a("DynamicConfigUpdated", this.jKR);
    com.tencent.mm.sdk.c.a.aGB().a("StatusNotifyFunction", this.iJT);
    l.AH().g(this);
    bg.qW().oW().a(this);
    bg.qW().a(this);
    if (am.ayk() != null)
      am.ayk().a(this);
    aYN();
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab resume end");
    View localView = findViewById(com.tencent.mm.i.aAz);
    if ((localView != null) && (localView.getVisibility() != 8))
      new cm(Looper.getMainLooper()).post(new v(this, localView));
  }

  protected final void aOe()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab start");
  }

  protected final void aOf()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab pause");
    if (bg.oE())
    {
      com.tencent.mm.pluginsdk.c.a.b("LBSVerifyStorageNotify", this.hHa);
      com.tencent.mm.pluginsdk.c.a.b("GameMessageStorageNotify", this.jKS);
      com.tencent.mm.pluginsdk.c.a.b("ShakeMessageStorageNotify", this.jKT);
      com.tencent.mm.sdk.c.a.aGB().b("JDSysMsgNotify", this.iJT);
      com.tencent.mm.sdk.c.a.aGB().b("DynamicConfigUpdated", this.jKR);
      com.tencent.mm.sdk.c.a.aGB().b("StatusNotifyFunction", this.iJT);
      l.AH().h(this);
      bg.qW().oW().b(this);
      bg.qW().b(this);
      if (this.jKP != null)
        com.tencent.mm.y.ap.yf().gL(this.jKP);
    }
    if (am.ayk() != null)
      am.ayk().b(this);
  }

  protected final void aOg()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab stop");
  }

  protected final void aOh()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab destroy");
  }

  public final void aOj()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "turn to bg");
  }

  public final void aOk()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "turn to fg");
  }

  public final void aOm()
  {
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "on tab recreate ui");
  }

  public final void acW()
  {
    if ((0x8000 & com.tencent.mm.model.x.pO()) != 0)
      return;
    if (am.ayi() != null)
      this.jKO = am.ayi().Ay();
    aYN();
  }

  public final boolean e(Preference paramPreference)
  {
    Intent localIntent5;
    boolean bool2;
    label120: boolean bool1;
    if ("album_dyna_photo_ui_title".equals(paramPreference.getKey()))
    {
      if (!bg.qW().isSDCardAvailable())
      {
        en.cp(agh());
        return true;
      }
      com.tencent.mm.plugin.f.c.n.fTF.js(10);
      this.jKN = ((String)bg.qW().oQ().get(68377));
      localIntent5 = new Intent();
      localIntent5.putExtra("sns_timeline_NeedFirstLoadint", true);
      eo localeo = new eo();
      com.tencent.mm.sdk.c.a.aGB().g(localeo);
      if (localeo.cKb.cKc)
        break label1354;
      if (ch.jb(this.jKN))
        break label1348;
      bool2 = false;
      if (am.ayi() == null)
        break label1341;
      this.jKO = am.ayi().Ay();
      int j = this.jKO;
      bool1 = false;
      if (j > 0)
        label152: bg.qW().oQ().set(68377, "");
    }
    while (true)
    {
      localIntent5.putExtra("sns_resume_state", bool1);
      com.tencent.mm.am.a.b(agh(), "sns", ".ui.SnsTimeLineUI", localIntent5);
      com.tencent.mm.plugin.f.c.n.fTF.q(10958, "1");
      return true;
      bool1 = bool2;
      break label152;
      if ("add_more_friends".equals(paramPreference.getKey()))
      {
        startActivity(new Intent(agh(), AddMoreFriendsUI.class));
        com.tencent.mm.plugin.f.c.n.fTF.q(10240, "1");
        return true;
      }
      if ("find_friends_by_near".equals(paramPreference.getKey()))
      {
        com.tencent.mm.plugin.f.c.n.fTF.q(10958, "4");
        if (!ch.b((Boolean)bg.qW().oQ().get(4103)))
        {
          com.tencent.mm.am.a.l(agh(), "nearby", ".ui.NearbyFriendsIntroUI");
          return true;
        }
        cs localcs2 = cs.rR();
        if (localcs2 == null)
        {
          com.tencent.mm.am.a.l(agh(), "nearby", ".ui.NearbyPersonalInfoUI");
          return true;
        }
        String str2 = ch.ja(localcs2.jp());
        int i = ch.a(Integer.valueOf(localcs2.jj()), 0);
        if ((ch.jb(str2)) || (i == 0))
        {
          com.tencent.mm.am.a.l(agh(), "nearby", ".ui.NearbyPersonalInfoUI");
          return true;
        }
        Boolean localBoolean = (Boolean)bg.qW().oQ().get(4104);
        if ((localBoolean == null) || (!localBoolean.booleanValue()))
        {
          LauncherUI localLauncherUI = LauncherUI.aPm();
          if (localLauncherUI != null)
            localLauncherUI.Bs("tab_find_friend");
          if (l.AG().Ay() > 0)
          {
            com.tencent.mm.am.a.l(agh(), "nearby", ".ui.NearbyFriendShowSayHiUI");
            return true;
          }
          com.tencent.mm.am.a.l(agh(), "nearby", ".ui.NearbyFriendsUI");
          return true;
        }
        if (this.jKL == null)
        {
          this.jKL = View.inflate(agh(), com.tencent.mm.k.bgW, null);
          this.fra = ((CheckBox)this.jKL.findViewById(com.tencent.mm.i.azQ));
          this.fra.setChecked(false);
        }
        if (this.frc == null)
        {
          this.frc = com.tencent.mm.ui.base.e.a(agh(), getString(com.tencent.mm.n.buo), this.jKL, new ae(this), null);
          return true;
        }
        this.frc.show();
        return true;
      }
      if ("find_friends_by_shake".equals(paramPreference.getKey()))
      {
        com.tencent.mm.plugin.f.c.n.fTF.q(10958, "3");
        com.tencent.mm.sdk.c.a.aGB().g(new im());
        com.tencent.mm.am.a.l(agh(), "shake", ".ui.ShakeReportUI");
        return true;
      }
      if ("voice_bottle".equals(paramPreference.getKey()))
      {
        com.tencent.mm.plugin.f.c.n.fTF.q(10958, "5");
        cs localcs1 = cs.rQ();
        if ((ch.a(Integer.valueOf(localcs1.jj()), 0) <= 0) || (ch.jb(localcs1.jp())))
        {
          com.tencent.mm.am.a.l(agh(), "bottle", ".ui.BottleWizardStep1");
          return true;
        }
        com.tencent.mm.am.a.l(agh(), "bottle", ".ui.BottleBeachUI");
        return true;
      }
      if ("find_friends_by_qrcode".equals(paramPreference.getKey()))
      {
        com.tencent.mm.plugin.f.c.n.fTF.q(10958, "2");
        Intent localIntent4 = new Intent();
        localIntent4.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
        com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(2);
        localn2.d(11265, arrayOfObject2);
        com.tencent.mm.am.a.b(agh(), "scanner", ".ui.BaseScanUI", localIntent4);
        return true;
      }
      if (paramPreference.getKey().equals("more_tab_game_recommend"))
      {
        com.tencent.mm.plugin.f.c.n.fTF.q(10958, "6");
        if (!bg.qW().isSDCardAvailable())
        {
          en.cp(agh());
          return true;
        }
        com.tencent.mm.am.a.l(agh(), "game", ".ui.GameCenterUI");
        com.tencent.mm.pluginsdk.ac localac = com.tencent.mm.pluginsdk.g.axX();
        if (localac != null)
          localac.Ua();
        new cm().postDelayed(new ad(this), 100L);
        return true;
      }
      if ("find_friends_by_micromsg".equals(paramPreference.getKey()))
      {
        startActivity(new Intent(agh(), ContactSearchUI.class));
        return true;
      }
      if ("find_friends_by_qq".equals(paramPreference.getKey()))
      {
        startActivity(new Intent(agh(), QQGroupUI.class));
        return true;
      }
      if ("find_friends_by_mobile".equals(paramPreference.getKey()))
      {
        if (com.tencent.mm.modelfriend.aa.wb() != com.tencent.mm.modelfriend.ab.dtS)
        {
          MMWizardActivity.j(agh(), new Intent(agh(), BindMContactIntroUI.class));
          return true;
        }
        startActivity(new Intent(agh(), MobileFriendUI.class));
        return true;
      }
      if ("find_friends_by_facebook".equals(paramPreference.getKey()))
      {
        startActivity(new Intent(agh(), FacebookFriendUI.class));
        return true;
      }
      if ("find_friends_by_google_account".equals(paramPreference.getKey()))
      {
        agh();
        if (!com.tencent.mm.modelfriend.ac.wi())
        {
          Intent localIntent2 = new Intent(agh(), BindGoogleContactIntroUI.class);
          localIntent2.putExtra("enter_scene", 1);
          MMWizardActivity.j(agh(), localIntent2);
          return true;
        }
        Intent localIntent3 = new Intent(agh(), GoogleFriendUI.class);
        localIntent3.putExtra("enter_scene", 1);
        startActivity(localIntent3);
        return true;
      }
      if ("settings_mm_card_package".equals(paramPreference.getKey()))
      {
        com.tencent.mm.am.a.l(agh(), "card", ".ui.CardIndexUI");
        return true;
      }
      if (paramPreference.getKey().equals("jd_market_entrance"))
      {
        String str1 = aYP();
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "jump to url: " + str1);
        com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = str1;
        arrayOfObject1[1] = com.tencent.mm.jdbiz.g.Cp().Cu().dQx;
        arrayOfObject1[2] = Integer.valueOf(aYO());
        localn1.d(11179, arrayOfObject1);
        com.tencent.mm.jdbiz.g.Cp();
        com.tencent.mm.jdbiz.g.Ct();
        com.tencent.mm.jdbiz.g.Cp();
        com.tencent.mm.jdbiz.g.Cs();
        if (ch.jb(str1))
          break;
        Intent localIntent1 = new Intent();
        localIntent1.putExtra("rawUrl", str1);
        localIntent1.putExtra("useJs", true);
        localIntent1.putExtra("vertical_scroll", true);
        com.tencent.mm.am.a.b(agh(), "webview", ".ui.tools.WebViewUI", localIntent1);
        return true;
      }
      return false;
      label1341: bool1 = bool2;
      break label152;
      label1348: bool2 = true;
      break label120;
      label1354: bool1 = true;
    }
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "onActivityCreated");
    this.dXi = aTL();
  }

  public final void qC()
  {
    if ((0x8000 & com.tencent.mm.model.x.pO()) != 0)
      return;
    aYN();
  }

  public final void qD()
  {
    if (this.dXi == null)
      return;
    aYN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.t
 * JD-Core Version:    0.6.2
 */