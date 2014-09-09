package com.tencent.mm.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import com.tencent.mm.aj.l;
import com.tencent.mm.c.a.im;
import com.tencent.mm.f.c;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cs;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.VoipAddressUI;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.pluginapp.AddMoreFriendsUI;
import com.tencent.mm.ui.setting.SelfQRCodeUI;
import com.tencent.mm.ui.setting.SendFeedBackUI;
import com.tencent.mm.ui.tools.ShareImageRedirectUI;
import com.tencent.mm.ui.tools.gw;

public final class ed extends gw
{
  private static final int[] iNm = { 2, 1, 4, 10, 3, 2147483647 };
  private LayoutInflater gJ;
  private SparseArray iNi;
  private eg iNk;
  private ec iNl = null;
  private Context mContext;

  public ed(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
    this.mContext = paramActionBarActivity;
    this.gJ = LayoutInflater.from(paramActionBarActivity);
    baW();
    this.iNl = ec.aQm();
  }

  public static ej pa(int paramInt)
  {
    Context localContext = ak.getContext();
    switch (paramInt)
    {
    default:
      return null;
    case 1:
      return new ej(1, localContext.getString(com.tencent.mm.n.bSv), "", h.Xz);
    case 2:
      return new ej(2, localContext.getString(com.tencent.mm.n.bSy), "", h.XR);
    case 3:
      return new ej(3, localContext.getString(com.tencent.mm.n.bSz), "", h.QC);
    case 4:
      if (1 == ch.getInt(com.tencent.mm.f.e.or().getValue("VOIPCallType"), 0))
        return new ej(4, localContext.getString(com.tencent.mm.n.bSA), "", h.Yo);
      return new ej(4, localContext.getString(com.tencent.mm.n.bSw), "", h.XC);
    case 5:
      return new ej(5, localContext.getString(com.tencent.mm.n.cga), "", h.Yc);
    case 6:
      return new ej(6, localContext.getString(com.tencent.mm.n.cfS), "", h.XI);
    case 7:
      return new ej(7, localContext.getString(com.tencent.mm.n.cfT), "", h.XH);
    case 8:
      return new ej(8, localContext.getString(com.tencent.mm.n.bEZ), "", h.XL);
    case 9:
      return new ej(9, localContext.getString(com.tencent.mm.n.cgb), "", h.XZ);
    case 10:
      return new ej(10, localContext.getString(com.tencent.mm.n.bJe), "", h.Ye);
    case 11:
      return new ej(11, localContext.getString(com.tencent.mm.n.cjX), "", h.XY);
    case 12:
      return new ej(12, localContext.getString(com.tencent.mm.n.bME), "", h.XP);
    case 13:
      return new ej(13, localContext.getString(com.tencent.mm.n.cia), "", h.Yk);
    case 14:
      return new ej(14, localContext.getString(com.tencent.mm.n.bTU), "", h.Ya);
    case 15:
      return new ej(15, localContext.getString(com.tencent.mm.n.bxE), "", h.XE);
    case 16:
      return new ej(16, localContext.getString(com.tencent.mm.n.cfb), "", h.Yq);
    case 17:
      return new ej(17, localContext.getString(com.tencent.mm.n.bSj), "", h.XS);
    case 18:
      return new ej(18, localContext.getString(com.tencent.mm.n.bJf), "", h.Yf);
    case 19:
      return new ej(19, localContext.getString(com.tencent.mm.n.bJg), "", h.QF);
    case 2147483647:
    }
    return new ej(2147483647, localContext.getString(com.tencent.mm.n.cfA), "", h.XM);
  }

  public final boolean aQn()
  {
    return this.iNl.aQn();
  }

  protected final BaseAdapter aQp()
  {
    if (this.iNk == null)
      this.iNk = new eg(this, (byte)0);
    return this.iNk;
  }

  public final boolean ck()
  {
    int i = 0;
    this.iNl.eH(false);
    if (this.iNl.iNi.size() != 0)
      this.iNi = this.iNl.iNi;
    while (true)
    {
      return super.ck();
      z.d("!44@/B4Tb64lLpLc8OeKfE5/C2SWmOQZlG2rej9zXeTaz5M=", "dyna plus config is null, we use default one");
      if (this.iNi != null)
        this.iNi.clear();
      while (i < iNm.length)
      {
        ei localei = new ei(pa(iNm[i]));
        this.iNi.put(i, localei);
        i++;
        continue;
        this.iNi = new SparseArray();
        i = 0;
      }
    }
  }

  public final void eH(boolean paramBoolean)
  {
    this.iNl.eH(paramBoolean);
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool1 = true;
    if ((this.mContext instanceof ActionBarActivity))
      ((ActionBarActivity)this.mContext).n();
    int i = ((ei)this.iNi.get(paramInt)).iNs.iNv;
    com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject1 = new Object[bool1];
    arrayOfObject1[0] = Integer.valueOf(i);
    localn1.d(11104, arrayOfObject1);
    Intent localIntent1;
    switch (i)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
      while (true)
      {
        this.iNl.oZ(i);
        dismiss();
        return;
        Intent localIntent6 = new Intent(this.mContext, AddMoreFriendsUI.class);
        this.mContext.startActivity(localIntent6);
        continue;
        Intent localIntent5 = new Intent(this.mContext, SelectContactUI.class);
        localIntent5.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
        localIntent5.putExtra("List_Type", 0);
        localIntent5.putExtra("show_facing_chat", bool1);
        this.mContext.startActivity(localIntent5);
        continue;
        Intent localIntent4 = new Intent(this.mContext, ShareImageRedirectUI.class);
        this.mContext.startActivity(localIntent4);
        continue;
        VoipAddressUI.ct(this.mContext);
        continue;
        if (!bg.qW().isSDCardAvailable())
        {
          en.cp(this.mContext);
        }
        else
        {
          String str3 = (String)bg.qW().oQ().get(2);
          Intent localIntent3 = new Intent();
          localIntent3.putExtra("sns_userName", str3);
          localIntent3.setFlags(536870912);
          localIntent3.addFlags(67108864);
          int m = ch.a((Integer)bg.qW().oQ().get(68389), 0);
          bg.qW().oQ().set(68389, Integer.valueOf(m + 1));
          com.tencent.mm.am.a.b(this.mContext, "sns", ".ui.SnsUserUI", localIntent3);
          continue;
          com.tencent.mm.am.a.l(this.mContext, "favorite", ".ui.FavoriteIndexUI");
          continue;
          com.tencent.mm.am.a.b(this.mContext, "mall", ".ui.MallIndexUI", new Intent());
          if (bg.qW().isSDCardAvailable())
          {
            com.tencent.mm.ad.k localk = new com.tencent.mm.ad.k(11);
            bg.qX().d(localk);
            continue;
            Intent localIntent2 = new Intent();
            localIntent2.putExtra("preceding_scence", 2);
            com.tencent.mm.am.a.b(this.mContext, "emoji", ".ui.EmojiStoreUI", localIntent2);
            continue;
            this.mContext.startActivity(new Intent(this.mContext, SelfQRCodeUI.class));
            continue;
            com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
            Object[] arrayOfObject2 = new Object[bool1];
            arrayOfObject2[0] = Integer.valueOf(3);
            localn2.d(11265, arrayOfObject2);
            com.tencent.mm.am.a.l(this.mContext, "scanner", ".ui.BaseScanUI");
            continue;
            if (bg.qW().isSDCardAvailable())
              break;
            en.cp(this.mContext);
          }
        }
      }
      com.tencent.mm.plugin.f.c.n.fTF.js(10);
      String str2 = (String)bg.qW().oQ().get(68377);
      bg.qW().oQ().set(68377, "");
      localIntent1 = new Intent();
      localIntent1.putExtra("sns_timeline_NeedFirstLoadint", bool1);
      if (ch.jb(str2))
        break;
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 2147483647:
    }
    for (boolean bool2 = false; ; bool2 = bool1)
    {
      boolean bool3;
      if (am.ayi() != null)
      {
        int k = am.ayi().Ay();
        bool3 = false;
        if (k <= 0);
      }
      while (true)
      {
        localIntent1.putExtra("sns_resume_state", bool3);
        com.tencent.mm.am.a.b(this.mContext, "sns", ".ui.SnsTimeLineUI", localIntent1);
        break;
        bool3 = bool2;
        continue;
        if (!bg.qW().isSDCardAvailable())
        {
          en.cp(this.mContext);
          break;
        }
        com.tencent.mm.am.a.l(this.mContext, "game", ".ui.GameCenterUI");
        com.tencent.mm.pluginsdk.ac localac = g.axX();
        if (localac != null)
          localac.Ua();
        new cm().postDelayed(new ee(this), 100L);
        break;
        com.tencent.mm.sdk.c.a.aGB().g(new im());
        com.tencent.mm.am.a.l(this.mContext, "shake", ".ui.ShakeReportUI");
        break;
        if (!ch.b((Boolean)bg.qW().oQ().get(4103)))
        {
          com.tencent.mm.am.a.l(this.mContext, "nearby", ".ui.NearbyFriendsIntroUI");
          break;
        }
        cs localcs2 = cs.rR();
        if (localcs2 == null)
        {
          com.tencent.mm.am.a.l(this.mContext, "nearby", ".ui.NearbyPersonalInfoUI");
          break;
        }
        String str1 = ch.ja(localcs2.jp());
        int j = ch.a(Integer.valueOf(localcs2.jj()), 0);
        if ((ch.jb(str1)) || (j == 0))
        {
          com.tencent.mm.am.a.l(this.mContext, "nearby", ".ui.NearbyPersonalInfoUI");
          break;
        }
        Boolean localBoolean = (Boolean)bg.qW().oQ().get(4104);
        if ((localBoolean == null) || (!localBoolean.booleanValue()))
        {
          LauncherUI localLauncherUI = LauncherUI.aPm();
          if (localLauncherUI != null)
            localLauncherUI.Bs("tab_find_friend");
          if (l.AG().Ay() > 0)
          {
            com.tencent.mm.am.a.l(this.mContext, "nearby", ".ui.NearbyFriendShowSayHiUI");
            break;
          }
          com.tencent.mm.am.a.l(this.mContext, "nearby", ".ui.NearbyFriendsUI");
          break;
        }
        View localView = View.inflate(this.mContext, com.tencent.mm.k.bgW, null);
        CheckBox localCheckBox = (CheckBox)localView.findViewById(com.tencent.mm.i.azQ);
        localCheckBox.setChecked(false);
        com.tencent.mm.ui.base.e.a(this.mContext, this.mContext.getString(com.tencent.mm.n.buo), localView, new ef(this, localCheckBox), null);
        break;
        cs localcs1 = cs.rQ();
        if ((ch.a(Integer.valueOf(localcs1.jj()), 0) <= 0) || (ch.jb(localcs1.jp())))
        {
          com.tencent.mm.am.a.l(this.mContext, "bottle", ".ui.BottleWizardStep1");
          break;
        }
        com.tencent.mm.am.a.l(this.mContext, "bottle", ".ui.BottleBeachUI");
        break;
        if (bg.qW().oJ())
        {
          com.tencent.mm.am.a.l(this.mContext, "webwx", ".ui.WebWXLogoutUI");
          break;
        }
        com.tencent.mm.am.a.l(this.mContext, "webwx", ".ui.WebWeiXinIntroductionUI");
        break;
        if ((0x10000 & x.pO()) == 0);
        while (true)
        {
          if (!bool1)
            break label1357;
          com.tencent.mm.am.a.l(this.mContext, "masssend", ".ui.MassSendHistoryUI");
          break;
          bool1 = false;
        }
        label1357: this.mContext.startActivity(new Intent(this.mContext, ContactInfoUI.class).putExtra("Contact_User", "masssendapp"));
        break;
        com.tencent.mm.am.a.l(this.mContext, "radar", ".ui.RadarSearchUI");
        break;
        com.tencent.mm.am.a.l(this.mContext, "pwdgroup", ".ui.FacingCreateChatRoomAllInONeUI");
        break;
        com.tencent.mm.plugin.f.c.n.fTF.q(10919, "1-6");
        this.mContext.startActivity(new Intent(this.mContext, SendFeedBackUI.class));
        break;
        bool3 = bool2;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ed
 * JD-Core Version:    0.6.2
 */