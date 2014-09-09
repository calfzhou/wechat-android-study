package com.tencent.mm.ui.contact.profile;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import com.tencent.mm.a.k;
import com.tencent.mm.f;
import com.tencent.mm.f.c;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.pluginsdk.u;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.co;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.ContactRemarkAndLabelPreference;
import com.tencent.mm.ui.contact.ContactRemarkInfoModUI;
import com.tencent.mm.ui.contact.ContactSocialInfoPreference;
import com.tencent.mm.ui.contact.FriendPreference;
import com.tencent.mm.ui.contact.ModRemarkNameUI;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public final class bc
  implements m, com.tencent.mm.pluginsdk.b.a, v
{
  private int cIX = 0;
  private Activity cKR;
  private com.tencent.mm.ui.base.preference.o dXi;
  private com.tencent.mm.storage.i elz;
  private boolean fDb;
  private boolean hHJ;
  private boolean hHV = false;
  private String hfH;
  private boolean jCQ;
  private aan jDF = new aan();
  private String jDG = "";
  private int jDH = -1;
  private boolean jDI = false;
  private boolean jDJ = false;
  private String jDK;
  private String jDL;
  private boolean jDM = false;
  private int jDN = 0;
  private String jDO = null;
  private String jDP = null;
  private int jDy;
  private int jza;

  public bc(Activity paramActivity)
  {
    this.cKR = paramActivity;
  }

  private void CP(String paramString)
  {
    if (ap.jb(paramString))
    {
      z.w("!44@/B4Tb64lLpLSOpQlr7qYXZblCOtc97em22hOJFce/vo=", "view stranger remark, username is null");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(this.cKR, ModRemarkNameUI.class);
    localIntent.putExtra("Contact_Scene", this.jza);
    localIntent.putExtra("Contact_mode_name_type", 0);
    localIntent.putExtra("Contact_ModStrangerRemark", true);
    localIntent.putExtra("Contact_User", this.elz.getUsername());
    localIntent.putExtra("Contact_Nick", this.elz.iV());
    localIntent.putExtra("Contact_RemarkName", this.elz.ja());
    this.cKR.startActivity(localIntent);
  }

  private void aXM()
  {
    ID();
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(q.czm);
    if (com.tencent.mm.pluginsdk.am.ayl() != null)
      com.tencent.mm.pluginsdk.am.ayl().a(3, this.elz.getUsername(), this);
    bg.qX().a(30, this);
    NormalUserHeaderPreference localNormalUserHeaderPreference = (NormalUserHeaderPreference)this.dXi.BU("contact_info_header_normal");
    label196: String str7;
    label284: label305: ContactRemarkAndLabelPreference localContactRemarkAndLabelPreference2;
    if (localNormalUserHeaderPreference != null)
    {
      localNormalUserHeaderPreference.a(this.elz, this.jza, this.hfH);
      localNormalUserHeaderPreference.H(this.elz.getUsername(), this.jDI);
      if ((this.jCQ) && ((this.jza == 30) || (this.jza == 1) || (this.jza == 3) || (this.jza == 12) || (this.jza == 13)))
        this.jDJ = true;
      if (com.tencent.mm.g.a.cv(this.elz.getType()))
        this.jDJ = false;
      localNormalUserHeaderPreference.I(this.elz.getUsername(), this.jDJ);
      if (ap.jb(this.elz.jp()))
        break label1813;
      KeyValuePreference localKeyValuePreference6 = (KeyValuePreference)this.dXi.BU("contact_info_district");
      if (localKeyValuePreference6 != null)
      {
        localKeyValuePreference6.setTitle(this.cKR.getString(n.bBt));
        StringBuilder localStringBuilder = new StringBuilder().append(y.dX(this.elz.jp()));
        if (!ap.jb(this.elz.jq()))
          break label1785;
        str7 = "";
        localKeyValuePreference6.setSummary(str7);
        localKeyValuePreference6.fb(false);
      }
      if ((this.elz.jo() == null) || (this.elz.jo().trim().equals("")))
        break label1828;
      KeyValuePreference localKeyValuePreference5 = (KeyValuePreference)this.dXi.BU("contact_info_signature");
      if (localKeyValuePreference5 != null)
      {
        localKeyValuePreference5.fa(false);
        localKeyValuePreference5.setTitle(this.cKR.getString(n.bDc));
        localKeyValuePreference5.setSummary(com.tencent.mm.ar.b.e(this.cKR, this.elz.jo(), -2));
        localKeyValuePreference5.fb(false);
      }
      label403: if (!com.tencent.mm.g.a.cv(this.elz.getType()))
        break label1850;
      localContactRemarkAndLabelPreference2 = (ContactRemarkAndLabelPreference)this.dXi.BU("contact_info_remark_and_label_info");
      if (localContactRemarkAndLabelPreference2 != null)
      {
        localContactRemarkAndLabelPreference2.setTitle(this.cKR.getString(n.bCM));
        if (ap.jb(this.elz.jD()))
          break label3138;
        localContactRemarkAndLabelPreference2.aWS();
        if (ap.jb(this.elz.jC()))
          localContactRemarkAndLabelPreference2.Cv(this.cKR.getString(n.bCN));
      }
    }
    label906: label1047: label1078: label1850: label2113: label3138: for (int i1 = 1; ; i1 = 0)
    {
      if (!ap.jb(this.elz.jC()))
        localContactRemarkAndLabelPreference2.Cv(this.elz.jC());
      for (int i2 = 1; ; i2 = i1)
      {
        String str6 = this.elz.jn();
        ArrayList localArrayList2 = (ArrayList)g.ayc().nC(str6);
        if ((!ap.jb(str6)) && (localArrayList2 != null) && (localArrayList2.size() > 0))
        {
          localContactRemarkAndLabelPreference2.F(localArrayList2);
          if (i2 == 0)
            localContactRemarkAndLabelPreference2.setTitle(this.cKR.getString(n.bBJ));
          i2 = 1;
        }
        com.tencent.mm.ui.base.preference.o localo2 = this.dXi;
        boolean bool4;
        if (i2 == 0)
        {
          bool4 = true;
          label619: localo2.R("contact_info_remark_and_label_info", bool4);
        }
        label738: int j;
        label753: ContactSocialInfoPreference localContactSocialInfoPreference;
        label838: int n;
        label1111: label1140: KeyValuePreference localKeyValuePreference3;
        label1528: label1785: ContactRemarkAndLabelPreference localContactRemarkAndLabelPreference1;
        do
        {
          this.dXi.BU("contact_info_facebook");
          this.dXi.BV("contact_info_facebook");
          KeyValuePreference localKeyValuePreference1 = (KeyValuePreference)this.dXi.BU("contact_info_linkedin_add_friend");
          if (ap.jb(this.jDO))
            break label2075;
          localKeyValuePreference1.setSummary(this.jDO);
          localKeyValuePreference1.fb(false);
          this.dXi.R("contact_info_linkedin_add_friend", false);
          this.dXi.R("contact_info_linkedin", true);
          this.dXi.R("contact_info_social", true);
          if ((0x1 & this.jDF.dto) <= 0)
            break label2091;
          j = 1;
          if (((j & com.tencent.mm.am.a.to("sns")) == 0) || (com.tencent.mm.storage.i.xZ(this.elz.getUsername())) || (this.elz.xI()))
            break label2097;
          com.tencent.mm.ui.base.preference.p localp = (com.tencent.mm.ui.base.preference.p)this.dXi.BU("contact_info_sns");
          if ((localp != null) && (com.tencent.mm.pluginsdk.am.ayh() != null))
            localp.vO(com.tencent.mm.pluginsdk.am.ayh().se(this.elz.getUsername()));
          localContactSocialInfoPreference = (ContactSocialInfoPreference)this.dXi.BU("contact_info_social");
          if (localContactSocialInfoPreference != null)
          {
            String str2 = this.elz.getUsername();
            com.tencent.mm.modelfriend.i locali = az.wZ().gl(str2);
            if (locali != null)
            {
              if (ap.jb(locali.vu()))
                break label2113;
              localContactSocialInfoPreference.qr(0);
              this.jDN = 1;
            }
            int m = ap.a((Integer)bg.qW().oQ().get(9));
            long l2 = this.cKR.getIntent().getLongExtra("Contact_Uin", 0L);
            String str3 = this.cKR.getIntent().getStringExtra("Contact_QQNick");
            if ((l2 != 0L) && (m != 0))
            {
              if ((str3 == null) || (str3.length() == 0))
              {
                com.tencent.mm.modelfriend.ax localax = az.xe().K(l2);
                if (localax == null)
                  localax = null;
                if (localax != null)
                  localax.getDisplayName();
              }
              if ((l2 == -1L) || (new k(l2).longValue() <= 0L))
                break label2123;
              localContactSocialInfoPreference.qs(0);
              this.jDN = 1;
            }
            if ((ap.jb(this.jDK)) || (ap.jb(this.jDL)))
              break label2133;
            localContactSocialInfoPreference.qu(0);
            this.jDN = 1;
            String str4 = com.tencent.mm.f.e.or().getValue("LinkedinPluginClose");
            if ((!ap.jb(str4)) && (Integer.valueOf(str4).intValue() != 0))
              break label2143;
            n = 1;
            if ((n == 0) || (ap.jb(this.elz.jE())))
              break label2149;
            localContactSocialInfoPreference.qt(0);
            this.jDN = 1;
            if (this.jDN == 0)
              this.dXi.BV("contact_info_social");
          }
          if (ap.jb(this.elz.ju()))
            break label2159;
          KeyValuePreference localKeyValuePreference4 = (KeyValuePreference)this.dXi.BU("contact_info_verifyuser");
          if (localKeyValuePreference4 != null)
          {
            localKeyValuePreference4.fa(false);
            localKeyValuePreference4.pZ(com.tencent.mm.aq.a.l(this.cKR, f.NX));
            localKeyValuePreference4.BZ(this.cKR.getString(n.bDo));
            Bitmap localBitmap = com.tencent.mm.platformtools.b.c(at.qz().cI(this.elz.jd()), 2.0F);
            localKeyValuePreference4.g(new BitmapDrawable(this.cKR.getResources(), localBitmap));
            localKeyValuePreference4.setSummary(com.tencent.mm.ar.b.e(this.cKR, this.elz.ju(), -2));
            localKeyValuePreference4.fb(false);
          }
          int k = this.cKR.getIntent().getIntExtra("Contact_Source_FMessage", 0);
          z.d("!44@/B4Tb64lLpLSOpQlr7qYXZblCOtc97em22hOJFce/vo=", "initFriendSource, contact source = " + this.elz.getSource() + ", sourceFMessage = " + k);
          if (k == 0)
            break label2525;
          localKeyValuePreference3 = (KeyValuePreference)this.dXi.BU("contact_info_source");
          if (((k == 13) || (k == 10)) && (!this.jDM))
            k = 3;
          switch (k)
          {
          default:
            this.dXi.b(localKeyValuePreference3);
            NormalUserFooterPreference localNormalUserFooterPreference = (NormalUserFooterPreference)this.dXi.BU("contact_info_footer_normal");
            boolean bool2 = this.cKR.getIntent().getBooleanExtra("User_From_Fmessage", false);
            boolean bool3 = this.cKR.getIntent().getBooleanExtra("Contact_FMessageCard", false);
            this.cKR.getIntent().getBooleanExtra("Contact_KHideExpose", false);
            long l1 = this.cKR.getIntent().getLongExtra("Contact_Uin", -1L);
            if (this.jza == 30)
              this.hHJ = false;
            if ((localNormalUserFooterPreference == null) || (!localNormalUserFooterPreference.a(this.elz, this.hfH, this.fDb, this.jCQ, this.hHJ, this.jza, this.jDy, bool3, bool2, l1, this.jDG)))
              break label3103;
            localNormalUserFooterPreference.dnh.removeAll();
            localNormalUserFooterPreference.dnh.a(new bd(this, localNormalUserHeaderPreference), Looper.getMainLooper());
            this.elz.jy();
            this.dXi.BV("clear_lbs_info");
            if (this.hHV)
            {
              this.dXi.removeAll();
              if (localNormalUserHeaderPreference != null)
                this.dXi.a(localNormalUserHeaderPreference);
              if (localNormalUserFooterPreference != null)
                this.dXi.a(localNormalUserFooterPreference);
            }
            return;
            this.dXi.b(localNormalUserHeaderPreference);
            break label196;
            str7 = "  " + this.elz.jq();
            break label284;
            this.dXi.BV("contact_info_district");
            break label305;
            this.dXi.BV("contact_info_signature");
            break label403;
            bool4 = false;
            break label619;
            localContactRemarkAndLabelPreference1 = (ContactRemarkAndLabelPreference)this.dXi.BU("contact_info_remark_and_label_info");
          case 3:
          case 14:
          case 17:
          case 4:
          case 12:
          case 10:
          case 13:
          case 25:
          case 30:
          case 58:
          case 59:
          case 60:
          case 48:
          }
        }
        while (localContactRemarkAndLabelPreference1 == null);
        localContactRemarkAndLabelPreference1.setTitle(this.cKR.getString(n.bCM));
        String str1 = this.elz.jk();
        cn localcn;
        if (!ap.jb(str1))
        {
          localcn = bg.qW().oU().Ab(str1);
          label1917: if (localcn == null)
            break label3125;
          if (ap.jb(localcn.field_conDescription))
            break label3119;
          localContactRemarkAndLabelPreference1.Cv(localcn.field_conDescription);
          i = 1;
          String str5 = localcn.field_contactLabels;
          ArrayList localArrayList1 = (ArrayList)g.ayc().nB(str5);
          if ((!ap.jb(str5)) && (localArrayList1 != null) && (localArrayList1.size() > 0))
          {
            localContactRemarkAndLabelPreference1.F(localArrayList1);
            if (i == 0)
              localContactRemarkAndLabelPreference1.setTitle(this.cKR.getString(n.bBJ));
          }
        }
        for (int i = 1; ; i = 0)
        {
          com.tencent.mm.ui.base.preference.o localo1 = this.dXi;
          if (i == 0);
          for (boolean bool1 = true; ; bool1 = false)
          {
            localo1.R("contact_info_remark_and_label_info", bool1);
            break;
            localcn = bg.qW().oU().Ab(this.elz.getUsername());
            break label1917;
          }
          this.dXi.R("contact_info_linkedin_add_friend", true);
          break label738;
          j = 0;
          break label753;
          this.dXi.BV("contact_info_sns");
          break label838;
          localContactSocialInfoPreference.qr(8);
          break label906;
          label2123: localContactSocialInfoPreference.qs(8);
          break label1047;
          label2133: localContactSocialInfoPreference.qu(8);
          break label1078;
          label2143: n = 0;
          break label1111;
          label2149: localContactSocialInfoPreference.qt(8);
          break label1140;
          label2159: this.dXi.BV("contact_info_verifyuser");
          break label1300;
          if (localKeyValuePreference3 == null)
            break label1528;
          localKeyValuePreference3.fa(true);
          localKeyValuePreference3.setTitle(this.cKR.getString(n.bDj));
          localKeyValuePreference3.setSummary(this.cKR.getString(n.bJN));
          localKeyValuePreference3.fb(false);
          break label1528;
          if (localKeyValuePreference3 == null)
            break label1528;
          localKeyValuePreference3.fa(true);
          localKeyValuePreference3.setTitle(this.cKR.getString(n.bDj));
          localKeyValuePreference3.setSummary(this.cKR.getString(n.bJM));
          localKeyValuePreference3.fb(false);
          break label1528;
          if (localKeyValuePreference3 == null)
            break label1528;
          localKeyValuePreference3.fa(true);
          localKeyValuePreference3.setTitle(this.cKR.getString(n.bDj));
          localKeyValuePreference3.setSummary(this.cKR.getString(n.bJL));
          localKeyValuePreference3.fb(false);
          break label1528;
          if (localKeyValuePreference3 == null)
            break label1528;
          localKeyValuePreference3.fa(true);
          localKeyValuePreference3.setTitle(this.cKR.getString(n.bDj));
          localKeyValuePreference3.setSummary(this.cKR.getString(n.bxE));
          localKeyValuePreference3.fb(false);
          break label1528;
          if (localKeyValuePreference3 == null)
            break label1528;
          localKeyValuePreference3.fa(true);
          localKeyValuePreference3.setTitle(this.cKR.getString(n.bDj));
          localKeyValuePreference3.setSummary(this.cKR.getString(n.bWK));
          localKeyValuePreference3.fb(false);
          break label1528;
          if (localKeyValuePreference3 == null)
            break label1528;
          localKeyValuePreference3.fa(true);
          localKeyValuePreference3.setTitle(this.cKR.getString(n.bDj));
          localKeyValuePreference3.setSummary(this.cKR.getString(n.bMR));
          localKeyValuePreference3.fb(false);
          break label1528;
          if (localKeyValuePreference3 == null)
            break label1528;
          localKeyValuePreference3.fa(true);
          localKeyValuePreference3.setTitle(this.cKR.getString(n.bDj));
          localKeyValuePreference3.setSummary(this.cKR.getString(n.bDg));
          localKeyValuePreference3.fb(false);
          break label1528;
          label2525: KeyValuePreference localKeyValuePreference2 = (KeyValuePreference)this.dXi.BU("contact_info_source");
          switch (this.elz.getSource())
          {
          default:
            this.dXi.b(localKeyValuePreference2);
            break;
          case 18:
            if (localKeyValuePreference2 == null)
              break;
            localKeyValuePreference2.fa(true);
            localKeyValuePreference2.setTitle(this.cKR.getString(n.bDj));
            localKeyValuePreference2.setSummary(this.cKR.getString(n.bDf));
            localKeyValuePreference2.fb(false);
            break;
          case 30:
            if (localKeyValuePreference2 == null)
              break;
            localKeyValuePreference2.fa(true);
            localKeyValuePreference2.setTitle(this.cKR.getString(n.bDj));
            localKeyValuePreference2.setSummary(this.cKR.getString(n.bWK));
            localKeyValuePreference2.fb(false);
            break;
          case 48:
            if (localKeyValuePreference2 == null)
              break;
            localKeyValuePreference2.fa(true);
            localKeyValuePreference2.setTitle(this.cKR.getString(n.bDj));
            localKeyValuePreference2.setSummary(this.cKR.getString(n.bDg));
            localKeyValuePreference2.fb(false);
            break;
          case 14:
            if (localKeyValuePreference2 == null)
              break;
            localKeyValuePreference2.fa(true);
            localKeyValuePreference2.setTitle(this.cKR.getString(n.bDj));
            localKeyValuePreference2.setSummary(this.cKR.getString(n.bDh));
            localKeyValuePreference2.fb(false);
            break;
          case 22:
          case 23:
          case 24:
          case 26:
          case 27:
          case 28:
          case 29:
            if (localKeyValuePreference2 == null)
              break;
            localKeyValuePreference2.fa(true);
            localKeyValuePreference2.setTitle(this.cKR.getString(n.bDj));
            localKeyValuePreference2.setSummary(this.cKR.getString(n.bDi));
            localKeyValuePreference2.fb(false);
            break;
          case 34:
            if (localKeyValuePreference2 == null)
              break;
            localKeyValuePreference2.fa(true);
            localKeyValuePreference2.setTitle(this.cKR.getString(n.bDj));
            localKeyValuePreference2.setSummary(this.cKR.getString(n.bDe));
            localKeyValuePreference2.fb(false);
            break;
          case 58:
          case 59:
          case 60:
            if (localKeyValuePreference2 == null)
              break;
            localKeyValuePreference2.fa(true);
            localKeyValuePreference2.setTitle(this.cKR.getString(n.bDj));
            localKeyValuePreference2.setSummary(this.cKR.getString(n.bMR));
            localKeyValuePreference2.fb(false);
            break;
          case 76:
            if (localKeyValuePreference2 == null)
              break;
            localKeyValuePreference2.fa(true);
            localKeyValuePreference2.setTitle(this.cKR.getString(n.bDj));
            localKeyValuePreference2.setSummary(this.cKR.getString(n.cDc));
            localKeyValuePreference2.fb(false);
            break;
            this.dXi.BV("contact_info_footer_normal");
            break label1703;
            i = 0;
            break label1946;
          }
        }
      }
    }
  }

  public final boolean ID()
  {
    if (com.tencent.mm.pluginsdk.am.ayl() != null)
      com.tencent.mm.pluginsdk.am.ayl().a(this, 3);
    bg.qX().b(30, this);
    NormalUserHeaderPreference localNormalUserHeaderPreference = (NormalUserHeaderPreference)this.dXi.BU("contact_info_header_normal");
    if (localNormalUserHeaderPreference != null)
      localNormalUserHeaderPreference.onDetach();
    NormalUserFooterPreference localNormalUserFooterPreference = (NormalUserFooterPreference)this.dXi.BU("contact_info_footer_normal");
    if (localNormalUserFooterPreference != null)
      localNormalUserFooterPreference.ID();
    FriendPreference localFriendPreference1 = (FriendPreference)this.dXi.BU("contact_info_friend_qq");
    if (localFriendPreference1 != null)
      localFriendPreference1.ID();
    FriendPreference localFriendPreference2 = (FriendPreference)this.dXi.BU("contact_info_friend_mobile");
    if (localFriendPreference2 != null)
      localFriendPreference2.ID();
    FriendPreference localFriendPreference3 = (FriendPreference)this.dXi.BU("contact_info_facebook");
    if (localFriendPreference3 != null)
      localFriendPreference3.ID();
    this.dXi.BU("contact_info_sns");
    return true;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if ((paramx.getType() != 30) && (paramx.getType() != 458))
      z.w("!44@/B4Tb64lLpLSOpQlr7qYXZblCOtc97em22hOJFce/vo=", "not expected scene,  type = " + paramx.getType());
    NormalUserHeaderPreference localNormalUserHeaderPreference;
    NormalUserFooterPreference localNormalUserFooterPreference;
    do
    {
      com.tencent.mm.pluginsdk.model.p localp;
      do
      {
        do
          return;
        while ((paramInt1 != 0) || (paramInt2 != 0) || (paramx.getType() != 30));
        localp = (com.tencent.mm.pluginsdk.model.p)paramx;
      }
      while (((localp.ayw() != 1) && (localp.ayw() != 3)) || ((localp.ayv() != null) && (!localp.ayv().contains(this.elz.getUsername()))));
      localNormalUserHeaderPreference = (NormalUserHeaderPreference)this.dXi.BU("contact_info_header_normal");
      localNormalUserFooterPreference = (NormalUserFooterPreference)this.dXi.BU("contact_info_footer_normal");
    }
    while ((localNormalUserHeaderPreference == null) || (localNormalUserFooterPreference == null) || (!localNormalUserFooterPreference.jEv));
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXZblCOtc97em22hOJFce/vo=", "happy update remark change");
    this.jDI = true;
    this.jDJ = false;
    localNormalUserHeaderPreference.H(this.elz.getUsername(), true);
    localNormalUserHeaderPreference.I(this.elz.getUsername(), false);
    localNormalUserHeaderPreference.eX(this.elz.getUsername());
    this.cKR.getIntent().putExtra("Contact_NeedShowChangeRemarkButton", this.jDI);
    this.cKR.getIntent().putExtra("Contact_NeedShowChangeSnsPreButton", this.jDJ);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    com.tencent.mm.ui.base.preference.p localp = (com.tencent.mm.ui.base.preference.p)this.dXi.BU("contact_info_sns");
    if ((localp != null) && (com.tencent.mm.pluginsdk.am.ayh() != null))
      localp.vO(com.tencent.mm.pluginsdk.am.ayh().se(this.elz.getUsername()));
    this.jDF = com.tencent.mm.pluginsdk.am.ayh().b(this.elz.getUsername(), this.jDF);
    aXM();
    this.dXi.notifyDataSetChanged();
    if (paramBoolean3)
    {
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXZblCOtc97em22hOJFce/vo=", "bg Change!");
      if (com.tencent.mm.pluginsdk.am.ayl() != null)
        com.tencent.mm.pluginsdk.am.ayl().rK(this.elz.getUsername());
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, com.tencent.mm.storage.i parami, boolean paramBoolean, int paramInt)
  {
    boolean bool1;
    boolean bool2;
    label28: boolean bool3;
    if (parami != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (ap.ja(parami.getUsername()).length() <= 0)
        break label528;
      bool2 = true;
      Assert.assertTrue(bool2);
      if (paramo == null)
        break label534;
      bool3 = true;
      label40: Assert.assertTrue(bool3);
      this.dXi = paramo;
      this.elz = parami;
      this.fDb = paramBoolean;
      this.jza = paramInt;
      this.jCQ = this.cKR.getIntent().getBooleanExtra("User_Verify", false);
      this.hfH = ap.ja(this.cKR.getIntent().getStringExtra("Verify_ticket"));
      this.hHJ = this.cKR.getIntent().getBooleanExtra("Contact_IsLBSFriend", false);
      this.jDy = this.cKR.getIntent().getIntExtra("Kdel_from", -1);
      this.jDG = this.cKR.getIntent().getStringExtra("Contact_RemarkName");
      this.cIX = this.cKR.getIntent().getIntExtra("Sns_from_Scene", 0);
      this.jDI = this.cKR.getIntent().getBooleanExtra("Contact_NeedShowChangeRemarkButton", false);
      this.jDJ = this.cKR.getIntent().getBooleanExtra("Contact_NeedShowChangeSnsPreButton", false);
      this.jDH = this.cKR.getIntent().getIntExtra("Contact_KSnsIFlag", -1);
      long l = this.cKR.getIntent().getLongExtra("Contact_KSnsBgId", -1L);
      String str = ap.Y(this.cKR.getIntent().getStringExtra("Contact_KSnsBgUrl"), "");
      this.jDK = ap.Y(this.cKR.getIntent().getStringExtra("verify_gmail"), "");
      this.jDL = ap.Y(this.cKR.getIntent().getStringExtra("profileName"), ch.xE(this.jDK));
      this.jDF.dto = this.jDH;
      this.jDF.dtq = l;
      this.jDF.dtp = str;
      this.jDO = this.cKR.getIntent().getStringExtra("KLinkedInAddFriendNickName");
      this.jDP = this.cKR.getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
      if (com.tencent.mm.pluginsdk.am.ayh() != null)
        this.jDF = com.tencent.mm.pluginsdk.am.ayh().b(parami.getUsername(), this.jDF);
      if (parami.jm() != 1)
        break label540;
    }
    label528: label534: label540: for (boolean bool4 = true; ; bool4 = false)
    {
      this.hHV = bool4;
      aXM();
      bg.qW().oT().yo(parami.getUsername());
      boolean bool5 = com.tencent.mm.model.x.pG().equals(parami.getUsername());
      int i = 0x1 & this.jDF.dto;
      int j = 0;
      if (i > 0)
        j = 1;
      if ((!parami.xI()) && (!com.tencent.mm.storage.i.xZ(parami.getUsername())) && (j != 0) && (com.tencent.mm.pluginsdk.am.ayl() != null))
        com.tencent.mm.pluginsdk.am.ayl().b(2, parami.getUsername(), bool5, this.cIX);
      return true;
      bool1 = false;
      break;
      bool2 = false;
      break label28;
      bool3 = false;
      break label40;
    }
  }

  public final void b(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
  }

  public final boolean ky(String paramString)
  {
    if (paramString.equals("contact_info_remark_and_label_info"))
    {
      if (this.elz == null)
      {
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXZblCOtc97em22hOJFce/vo=", "contact is null");
        return true;
      }
      if ((this.elz != null) && (!com.tencent.mm.g.a.cv(this.elz.getType())))
      {
        if (!ap.jb(this.elz.jk()))
        {
          CP(this.elz.jk());
          return true;
        }
        CP(this.elz.getUsername());
        return true;
      }
      Intent localIntent4 = new Intent();
      localIntent4.setClass(this.cKR, ContactRemarkInfoModUI.class);
      localIntent4.putExtra("Contact_Scene", this.jza);
      localIntent4.putExtra("Contact_User", this.elz.getUsername());
      localIntent4.putExtra("Contact_RoomNickname", this.cKR.getIntent().getStringExtra("Contact_RoomNickname"));
      localIntent4.putExtra("view_mode", true);
      this.cKR.startActivity(localIntent4);
      return true;
    }
    Intent localIntent3;
    if (paramString.equals("contact_info_sns"))
    {
      if (!bg.qW().isSDCardAvailable())
      {
        en.cp(this.cKR);
        return true;
      }
      localIntent3 = this.cKR.getIntent();
      localIntent3.putExtra("sns_source", this.cIX);
      localIntent3.putExtra("sns_signature", this.elz.jo());
      localIntent3.putExtra("sns_nickName", this.elz.oc());
      localIntent3.putExtra("sns_title", this.elz.od());
      if (com.tencent.mm.pluginsdk.am.ayl() != null)
        localIntent3 = com.tencent.mm.pluginsdk.am.ayl().a(localIntent3, this.elz.getUsername());
      if (localIntent3 != null)
        break label564;
      ((MMActivity)this.cKR).finish();
    }
    while (true)
    {
      if (paramString.equals("contact_info_social"))
      {
        Intent localIntent1 = new Intent();
        localIntent1.setClass(this.cKR, ContactSocialInfoUI.class);
        localIntent1.putExtra("Contact_User", this.elz.getUsername());
        long l = this.cKR.getIntent().getLongExtra("Contact_Uin", 0L);
        String str1 = this.cKR.getIntent().getStringExtra("Contact_QQNick");
        localIntent1.putExtra("Contact_Uin", l);
        localIntent1.putExtra("Contact_QQNick", str1);
        localIntent1.putExtra("profileName", this.jDL);
        localIntent1.putExtra("verify_gmail", this.jDK);
        String str2 = this.cKR.getIntent().getStringExtra("Contact_Mobile_MD5");
        String str3 = this.cKR.getIntent().getStringExtra("Contact_full_Mobile_MD5");
        localIntent1.putExtra("Contact_Mobile_MD5", str2);
        localIntent1.putExtra("Contact_full_Mobile_MD5", str3);
        this.cKR.startActivity(localIntent1);
      }
      if ((!paramString.equals("contact_info_linkedin_add_friend")) || (ap.jb(this.jDP)))
        break;
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("rawUrl", this.jDP);
      localIntent2.putExtra("geta8key_username", com.tencent.mm.model.x.pG());
      com.tencent.mm.am.a.b(this.cKR, "webview", ".ui.tools.WebViewUI", localIntent2);
      return true;
      label564: com.tencent.mm.am.a.b(this.cKR, "sns", ".ui.SnsUserUI", localIntent3);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default:
    case 1:
    }
    do
      return;
    while ((paramInt2 != -1) || (paramIntent == null));
    String str1 = paramIntent.getStringExtra("be_send_card_name");
    String str2 = paramIntent.getStringExtra("received_card_name");
    boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
    Intent localIntent = new Intent(this.cKR, ChattingUI.class);
    localIntent.putExtra("Chat_User", str2);
    localIntent.putExtra("send_card_username", str1);
    localIntent.putExtra("Is_Chatroom", bool);
    this.cKR.startActivity(localIntent);
    this.cKR.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.bc
 * JD-Core Version:    0.6.2
 */