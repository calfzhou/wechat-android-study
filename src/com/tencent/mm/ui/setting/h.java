package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.tencent.mm.ad.k;
import com.tencent.mm.aj.l;
import com.tencent.mm.k.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.o.ac;
import com.tencent.mm.q;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.contact.AddressUI;
import com.tencent.mm.ui.pluginapp.AddMoreFriendsUI;

public class h extends com.tencent.mm.ui.b
  implements as
{
  private o dXi;
  private gc jLy;
  private c jLz = new i(this);

  private void aYU()
  {
    if (!com.tencent.mm.am.a.to("sns"))
    {
      this.dXi.R("settings_my_album", true);
      return;
    }
    this.dXi.R("settings_my_album", false);
  }

  private void aYV()
  {
    this.dXi.R("more_setting", false);
    IconPreference localIconPreference = (IconPreference)this.dXi.BU("more_setting");
    if (localIconPreference != null)
    {
      if (!com.tencent.mm.k.i.Ck().t(262145, 266242))
        break label97;
      localIconPreference.pT(0);
      localIconPreference.aq(getString(com.tencent.mm.n.btN), com.tencent.mm.h.Xq);
    }
    while (true)
    {
      if (((Integer)bg.qW().oQ().get(9)).intValue() != 0)
      {
        if (x.pM())
          break;
        localIconPreference.setSummary(com.tencent.mm.n.cbA);
      }
      return;
      label97: localIconPreference.pT(8);
      localIconPreference.aq("", -1);
    }
    localIconPreference.setSummary("");
  }

  private void aYW()
  {
    boolean bool1;
    boolean bool2;
    IconPreference localIconPreference;
    if (com.tencent.mm.am.a.to("emoji"))
    {
      com.tencent.mm.am.a.aCl();
      this.dXi.R("settings_emoji_store", false);
      bool1 = com.tencent.mm.k.i.Ck().t(262147, 266244);
      bool2 = com.tencent.mm.k.i.Ck().t(262149, 266244);
      localIconPreference = (IconPreference)this.dXi.BU("settings_emoji_store");
      if (localIconPreference != null);
    }
    else
    {
      this.dXi.R("settings_emoji_store", false);
      return;
    }
    if (bool1)
    {
      localIconPreference.pT(0);
      localIconPreference.aq(getString(com.tencent.mm.n.btN), com.tencent.mm.h.Xq);
      return;
    }
    if (bool2)
    {
      localIconPreference.pT(0);
      localIconPreference.aq(getString(com.tencent.mm.n.btC), com.tencent.mm.h.Xq);
      return;
    }
    localIconPreference.pT(8);
    localIconPreference.aq("", -1);
  }

  private void aYX()
  {
    boolean bool1 = x.pN();
    z.d("!32@/B4Tb64lLpIoKnD99TFNknXr6PHCQS26", "wallet status: is open" + bool1);
    o localo = this.dXi;
    if (!bool1);
    for (boolean bool2 = true; ; bool2 = false)
    {
      localo.R("settings_mm_wallet", bool2);
      aTL().notifyDataSetChanged();
      return;
    }
  }

  private void aYY()
  {
    int i = com.tencent.mm.platformtools.ap.a((Integer)bg.qW().oQ().get(204820), 0) + com.tencent.mm.platformtools.ap.a((Integer)bg.qW().oQ().get(204817), 0);
    boolean bool1 = com.tencent.mm.k.i.Ck().t(262148, 266248);
    boolean bool2 = com.tencent.mm.k.i.Ck().u(262148, 266248);
    IconPreference localIconPreference = (IconPreference)this.dXi.BU("settings_mm_wallet");
    if (localIconPreference == null)
      return;
    z.d("!32@/B4Tb64lLpIoKnD99TFNknXr6PHCQS26", "isShowNew : " + bool1);
    z.d("!32@/B4Tb64lLpIoKnD99TFNknXr6PHCQS26", "isShowDot : " + bool2);
    if (bool1)
    {
      localIconPreference.pT(0);
      localIconPreference.aq(getString(com.tencent.mm.n.btN), com.tencent.mm.h.Xq);
      localIconPreference.pS(8);
      return;
    }
    if (i > 99)
    {
      localIconPreference.pT(0);
      localIconPreference.aq(getString(com.tencent.mm.n.csx), com.tencent.mm.h.acu);
      localIconPreference.pS(8);
      return;
    }
    if (i > 0)
    {
      localIconPreference.pT(0);
      localIconPreference.aq(String.valueOf(i), com.tencent.mm.h.acu);
      localIconPreference.pS(8);
      return;
    }
    if (bool2)
    {
      localIconPreference.aq("", -1);
      localIconPreference.pT(8);
      localIconPreference.pS(0);
      return;
    }
    localIconPreference.aq("", -1);
    localIconPreference.pT(8);
    localIconPreference.pS(8);
  }

  public final int DZ()
  {
    return q.czG;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    int i = com.tencent.mm.platformtools.ap.R(paramObject);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Integer.valueOf(i);
    arrayOfObject1[2] = paramap;
    z.d("!32@/B4Tb64lLpIoKnD99TFNknXr6PHCQS26", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!32@/B4Tb64lLpIoKnD99TFNknXr6PHCQS26", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
    }
    do
    {
      return;
      if ((204817 == i) || (204820 == i))
      {
        aYY();
        return;
      }
    }
    while (40 != i);
    aYX();
  }

  public final void aOY()
  {
  }

  protected final void aOc()
  {
    this.dXi = aTL();
  }

  protected final void aOd()
  {
    this.dXi = aTL();
    bg.qW().oQ().a(this);
    com.tencent.mm.k.i.Ck().a(this.jLz);
    this.dXi.R("more_tab_setting_personal_info", false);
    AccountInfoPreference localAccountInfoPreference = (AccountInfoPreference)aTL().BU("more_tab_setting_personal_info");
    String str1 = x.pH();
    String str3;
    IconPreference localIconPreference1;
    label197: label231: int i;
    if (com.tencent.mm.platformtools.ap.jb(str1))
    {
      str3 = x.pG();
      if (com.tencent.mm.storage.i.yd(str3))
      {
        localAccountInfoPreference.setAccountName(null);
        localAccountInfoPreference.le(x.pG());
        String str2 = x.pI();
        if (com.tencent.mm.platformtools.ap.jb(str2))
          str2 = x.pG();
        localAccountInfoPreference.a(com.tencent.mm.ar.b.e(agh(), str2, -1));
        ((AccountInfoPreference)this.dXi.BU("more_tab_setting_personal_info")).a(this.jLy);
        localIconPreference1 = (IconPreference)this.dXi.BU("settings_my_address");
        if (localIconPreference1 != null)
        {
          int j = l.AF().Aw();
          if (j <= 0)
            break label375;
          localIconPreference1.pT(0);
          localIconPreference1.aq(String.valueOf(j), com.tencent.mm.h.Xq);
        }
        aYU();
        aYW();
        aYV();
        if (com.tencent.mm.am.a.to("favorite"))
          break label393;
        this.dXi.R("settings_mm_favorite", true);
        aYY();
        aYX();
        Integer localInteger = (Integer)bg.qW().oQ().get(282883);
        if ((localInteger == null) || (localInteger.intValue() != 1))
          break label409;
        i = 1;
        label273: if ((i != 0) && (com.tencent.mm.am.a.to("card")))
          break label415;
        this.dXi.R("settings_mm_cardpackage", true);
      }
    }
    while (true)
    {
      this.dXi.notifyDataSetChanged();
      View localView = findViewById(com.tencent.mm.i.aAz);
      if ((localView != null) && (localView.getVisibility() != 8))
        new cm(Looper.getMainLooper()).post(new j(this, localView));
      return;
      localAccountInfoPreference.setAccountName(str3);
      break;
      localAccountInfoPreference.setAccountName(str1);
      break;
      label375: localIconPreference1.pT(8);
      localIconPreference1.aq("", -1);
      break label197;
      label393: this.dXi.R("settings_mm_favorite", false);
      break label231;
      label409: i = 0;
      break label273;
      label415: boolean bool1 = com.tencent.mm.k.i.Ck().u(262152, 266256);
      boolean bool2 = com.tencent.mm.k.i.Ck().t(262152, 266256);
      this.dXi.R("settings_mm_cardpackage", false);
      IconPreference localIconPreference2 = (IconPreference)this.dXi.BU("settings_mm_cardpackage");
      if (bool1)
      {
        localIconPreference2.pS(0);
        localIconPreference2.aq("", -1);
        localIconPreference2.pT(8);
      }
      else if (bool2)
      {
        localIconPreference2.pT(0);
        localIconPreference2.aq(getString(com.tencent.mm.n.btN), com.tencent.mm.h.Xq);
        localIconPreference2.pS(8);
      }
      else
      {
        localIconPreference2.pS(8);
        localIconPreference2.pT(8);
      }
    }
  }

  protected final void aOe()
  {
  }

  protected final void aOf()
  {
    com.tencent.mm.k.i.Ck().b(this.jLz);
    bg.qW().oQ().b(this);
  }

  protected final void aOg()
  {
  }

  protected final void aOh()
  {
  }

  public final void aOj()
  {
    if (this.dXi != null)
      this.dXi.removeAll();
    aAB();
  }

  public final void aOk()
  {
    if (this.dXi != null)
    {
      this.dXi.removeAll();
      this.dXi.addPreferencesFromResource(q.czG);
    }
    aTQ();
  }

  public final void aOm()
  {
  }

  public final boolean e(Preference paramPreference)
  {
    if (paramPreference.getKey().equals("more_tab_setting_personal_info"))
    {
      startActivity(new Intent(agh(), SettingsPersonalInfoUI.class));
      return true;
    }
    if (paramPreference.getKey().equals("settings_my_address"))
    {
      Intent localIntent1 = new Intent(agh(), AddressUI.class);
      localIntent1.putExtra("Contact_GroupFilter_Type", "@biz.contact");
      startActivity(localIntent1);
      return true;
    }
    if (paramPreference.getKey().equals("settings_my_add_contact"))
    {
      startActivity(new Intent(agh(), AddMoreFriendsUI.class));
      return true;
    }
    if (paramPreference.getKey().equals("settings_mm_wallet"))
    {
      com.tencent.mm.plugin.f.c.n.fTF.q(10958, "9");
      com.tencent.mm.am.a.b(agh(), "mall", ".ui.MallIndexUI", new Intent());
      com.tencent.mm.k.i.Ck().K(262148, 266248);
      if (bg.qW().isSDCardAvailable())
      {
        k localk = new k(11);
        bg.qX().d(localk);
      }
      return true;
    }
    if (paramPreference.getKey().equals("settings_mm_cardpackage"))
    {
      com.tencent.mm.am.a.b(agh(), "card", ".ui.CardIndexUI", new Intent());
      return true;
    }
    if (paramPreference.getKey().equals("settings_my_album"))
    {
      if (!bg.qW().isSDCardAvailable())
      {
        en.cp(agh());
        return true;
      }
      String str = (String)bg.qW().oQ().get(2);
      Intent localIntent3 = new Intent();
      localIntent3.putExtra("sns_userName", str);
      localIntent3.setFlags(536870912);
      localIntent3.addFlags(67108864);
      int i = com.tencent.mm.platformtools.ap.a((Integer)bg.qW().oQ().get(68389), 0);
      bg.qW().oQ().set(68389, Integer.valueOf(i + 1));
      com.tencent.mm.am.a.b(agh(), "sns", ".ui.SnsUserUI", localIntent3);
      return true;
    }
    if (paramPreference.getKey().equals("settings_mm_favorite"))
    {
      com.tencent.mm.plugin.f.c.n.fTF.q(10958, "8");
      com.tencent.mm.am.a.l(agh(), "favorite", ".ui.FavoriteIndexUI");
      return true;
    }
    if (paramPreference.getKey().equals("settings_emoji_store"))
    {
      com.tencent.mm.plugin.f.c.n.fTF.q(10958, "7");
      com.tencent.mm.k.i.Ck().K(262147, 266244);
      com.tencent.mm.k.i.Ck().K(262149, 266244);
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("preceding_scence", 2);
      com.tencent.mm.am.a.b(agh(), "emoji", ".ui.EmojiStoreUI", localIntent2);
      return true;
    }
    if (paramPreference.getKey().equals("more_setting"))
    {
      com.tencent.mm.k.i.Ck().K(262145, 266242);
      startActivity(new Intent(agh(), SettingsUI.class));
      return true;
    }
    return false;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    z.i("!32@/B4Tb64lLpIoKnD99TFNknXr6PHCQS26", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    this.dXi = aTL();
    this.dXi.R("more_setting", true);
    this.dXi.R("settings_emoji_store", true);
    this.dXi.R("settings_mm_wallet", true);
    this.dXi.R("settings_mm_cardpackage", true);
    this.dXi.R("settings_mm_favorite", true);
    this.dXi.R("settings_my_album", true);
    this.dXi.R("settings_my_address", true);
    this.dXi.R("more_tab_setting_personal_info", true);
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jLy = new gc(agh(), x.pG());
    this.jLy.onCreate();
  }

  public final void onDestroy()
  {
    this.jLy.onDestroy();
    this.jLy = null;
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.h
 * JD-Core Version:    0.6.2
 */