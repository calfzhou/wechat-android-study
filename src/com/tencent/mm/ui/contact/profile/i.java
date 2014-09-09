package com.tencent.mm.ui.contact.profile;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.c.a.ba;
import com.tencent.mm.c.a.bc;
import com.tencent.mm.h;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.protocal.a.se;
import com.tencent.mm.q.l;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.ui.ExposeWithProofUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.ab;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.tools.t;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class i
  implements com.tencent.mm.o.m, com.tencent.mm.pluginsdk.b.a
{
  private MMActivity cHh;
  private cr dWq = null;
  private com.tencent.mm.ui.base.preference.o dXi;
  private List dpG;
  private com.tencent.mm.q.e dpH;
  private boolean dpP = false;
  private String dpR;
  private boolean ekQ = false;
  private com.tencent.mm.storage.i elz;
  private com.tencent.mm.q.a enO;
  private boolean eua;
  private boolean fDb;
  private String hfH;
  private String ijC;
  private ev jDf = null;
  private boolean jDg = false;
  private boolean jDh = false;
  private boolean jDi = false;
  private int jDj = 0;
  com.tencent.mm.ui.base.aa jrT = null;
  private int jza;

  private i(MMActivity paramMMActivity)
  {
    this.cHh = paramMMActivity;
  }

  public i(MMActivity paramMMActivity, String paramString, ev paramev)
  {
    this(paramMMActivity);
    this.ijC = paramString;
    this.jDf = paramev;
  }

  private static boolean CM(String paramString)
  {
    try
    {
      long l1 = Long.parseLong(paramString);
      long l2 = System.currentTimeMillis() / 1000L;
      boolean bool1 = l1 - l2 < 0L;
      boolean bool2 = false;
      if (bool1)
        bool2 = true;
      return bool2;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private void a(com.tencent.mm.q.a parama, boolean paramBoolean)
  {
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.dXi.BU("contact_info_subscribe_bizinfo");
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.dXi.BU("contact_info_locate");
    se localse = new se();
    localse.dtr = parama.field_brandFlag;
    localse.gnq = this.elz.getUsername();
    com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(47, localse));
    com.tencent.mm.model.bg.qX().d(new com.tencent.mm.ab.k(5));
    com.tencent.mm.q.aa.uY().a(parama, new String[0]);
    localCheckBoxPreference1.setChecked(parama.tZ());
    if (localCheckBoxPreference2 != null)
      localCheckBoxPreference2.setChecked(parama.ua());
    if (paramBoolean)
      aXM();
  }

  private void aXM()
  {
    ID();
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(com.tencent.mm.q.czb);
    if (this.jDi)
      this.dXi.R("contact_info_time_expired", true);
    this.dXi.R("contact_info_enter_enterprise", true);
    BizInfoHeaderPreference localBizInfoHeaderPreference = (BizInfoHeaderPreference)this.dXi.BU("contact_info_header_bizinfo");
    com.tencent.mm.q.a locala1;
    com.tencent.mm.q.a locala2;
    if (localBizInfoHeaderPreference != null)
    {
      localBizInfoHeaderPreference.d(this.elz, this.ijC);
      locala1 = r.fE(this.elz.getUsername());
      this.dpG = null;
      this.dpH = null;
      if (((locala1 != null) && (locala1.tY() != null)) || (this.jDf == null))
        break label2818;
      locala2 = new com.tencent.mm.q.a();
      locala2.field_username = this.elz.getUsername();
      locala2.field_brandFlag = this.jDf.dtr;
      locala2.field_brandIconURL = this.jDf.dtu;
      locala2.field_brandInfo = this.jDf.dtt;
      locala2.field_extInfo = this.jDf.dts;
    }
    label2305: label2818: for (com.tencent.mm.q.a locala3 = locala2; ; locala3 = locala1)
    {
      label271: label373: label510: boolean bool3;
      label390: label648: label694: KeyValuePreference localKeyValuePreference4;
      String str2;
      label857: label864: boolean bool1;
      label899: label980: boolean bool2;
      if (locala3 != null)
        if (locala3.ui())
        {
          this.dXi.R("contact_info_biz_add", true);
          this.dXi.R("contact_info_biz_remove", true);
          this.dXi.R("contact_is_mute", false);
          this.eua = this.elz.zW();
          fG(this.eua);
          this.enO = locala3;
          this.dpG = locala3.uj();
          this.dpH = locala3.tY();
          if (this.dpH.up() == null)
            break label1332;
          this.jDh = true;
          if (!CM(this.dpH.up()))
            break label1317;
          this.jDg = true;
          if (com.tencent.mm.g.a.cv(this.elz.getType()))
            break label1317;
          Object[] arrayOfObject6 = new Object[1];
          arrayOfObject6[0] = this.elz.getUsername();
          z.w("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "expireTime not null, and %s is not my contact", arrayOfObject6);
          aXN();
          if (y.dO(this.elz.getUsername()))
            aXN();
          if ((this.dpH.uo() != null) && (this.dpH.uo().length() > 0))
            this.dpR = this.dpH.uo();
          this.dpP = this.dpH.ul();
          if (ch.jb(this.dpH.uC()))
            break label1347;
          this.dXi.R("contact_info_service_phone", false);
          Preference localPreference3 = this.dXi.BU("contact_info_service_phone");
          if (localPreference3 != null)
          {
            localPreference3.setSummary(this.dpH.uC());
            localPreference3.pZ(this.cHh.getResources().getColor(com.tencent.mm.f.Oo));
          }
          if (ch.jb(this.elz.jo()))
            break label1393;
          KeyValuePreference localKeyValuePreference5 = (KeyValuePreference)this.dXi.BU("contact_info_user_desc");
          if (localKeyValuePreference5 != null)
          {
            localKeyValuePreference5.aTK();
            localKeyValuePreference5.fa(false);
            localKeyValuePreference5.pZ(com.tencent.mm.aq.a.l(this.cHh, com.tencent.mm.f.NX));
            localKeyValuePreference5.BZ(this.cHh.getString(com.tencent.mm.n.bBI));
            localKeyValuePreference5.setSummary(com.tencent.mm.ar.b.e(this.cHh, this.elz.jo(), -2));
            localKeyValuePreference5.fb(false);
            Bitmap localBitmap2 = com.tencent.mm.platformtools.b.c(at.qz().cI(this.elz.jd()), 2.0F);
            Object[] arrayOfObject5 = new Object[1];
            if (localBitmap2 != null)
              break label1387;
            bool3 = true;
            arrayOfObject5[0] = Boolean.valueOf(bool3);
            z.i("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "verify bmp is null ? %B", arrayOfObject5);
            localKeyValuePreference5.f(new BitmapDrawable(this.cHh.getResources(), localBitmap2));
            localKeyValuePreference5.aTI();
          }
          if ((this.dpH == null) || (this.dpH.ux() == null))
            break label1533;
          localKeyValuePreference4 = (KeyValuePreference)this.dXi.BU("contact_info_verifyuser");
          if (localKeyValuePreference4 != null)
          {
            localKeyValuePreference4.aTK();
            localKeyValuePreference4.fa(false);
            localKeyValuePreference4.pZ(com.tencent.mm.aq.a.l(this.cHh, com.tencent.mm.f.NX));
            if (!ch.jb(this.dpH.ux().dqy))
              break label1491;
            int m = this.dpH.ux().dqw;
            switch (m)
            {
            default:
              Object[] arrayOfObject4 = new Object[1];
              arrayOfObject4[0] = Integer.valueOf(m);
              z.w("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "getVerifyStr, error type %d", arrayOfObject4);
              str2 = this.cHh.getResources().getString(com.tencent.mm.n.bBI);
              localKeyValuePreference4.BZ(str2);
              Bitmap localBitmap1 = com.tencent.mm.platformtools.b.c(at.qz().cI(this.elz.jd()), 2.0F);
              Object[] arrayOfObject3 = new Object[1];
              if (localBitmap1 == null)
              {
                bool1 = true;
                arrayOfObject3[0] = Boolean.valueOf(bool1);
                z.i("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "verify bmp is null ? %B", arrayOfObject3);
                localKeyValuePreference4.f(new BitmapDrawable(this.cHh.getResources(), localBitmap1));
                if (this.dpH.ux().dqx == null)
                  break label1515;
                localKeyValuePreference4.setSummary(com.tencent.mm.ar.b.e(this.cHh, this.dpH.ux().dqx.trim(), -2));
                if (ch.jb(this.dpH.ux().dqz))
                  break label1527;
                bool2 = true;
                label999: localKeyValuePreference4.fb(bool2);
              }
              break;
            case 0:
            case 1:
            case 2:
            }
          }
        }
      while (true)
      {
        if ((this.dpH == null) || (this.dpH.uq() == null) || (this.dpH.uq().size() <= 0))
          break label1558;
        KeyValuePreference localKeyValuePreference3 = (KeyValuePreference)this.dXi.BU("contact_info_privilege");
        localKeyValuePreference3.aTK();
        localKeyValuePreference3.fb(false);
        localKeyValuePreference3.aTJ();
        Iterator localIterator = this.dpH.uq().iterator();
        while (localIterator.hasNext())
        {
          l locall = (l)localIterator.next();
          LinearLayout localLinearLayout = (LinearLayout)View.inflate(this.cHh, com.tencent.mm.k.bgV, null);
          ((ImageView)localLinearLayout.findViewById(com.tencent.mm.i.ayb)).setImageDrawable(new x(this.cHh.getResources(), locall.dpL));
          ((TextView)localLinearLayout.findViewById(com.tencent.mm.i.summary)).setText(com.tencent.mm.q.aa.vb().getString(locall.dqE, locall.description).trim());
          localKeyValuePreference3.as(localLinearLayout);
        }
        z.w("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "head pref is null");
        this.dXi.R("contact_info_header_bizinfo", true);
        break;
        if (locala3.uh())
        {
          this.dXi.R("contact_info_biz_view", true);
          this.dXi.R("contact_info_locate", true);
          this.dXi.R("contact_info_subscribe_bizinfo", true);
          this.dXi.R("contact_is_mute", true);
          this.dXi.R("contact_info_enter_enterprise", false);
          break label271;
        }
        this.dXi.R("contact_is_mute", true);
        this.eua = false;
        break label271;
        label1317: this.dXi.R("contact_info_time_expired", true);
        break label373;
        label1332: this.dXi.R("contact_info_time_expired", true);
        break label390;
        label1347: this.dXi.R("contact_info_service_phone", true);
        break label510;
        this.dXi.R("contact_info_time_expired", true);
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "get biz info from storage, but return null");
        break label510;
        label1387: bool3 = false;
        break label648;
        label1393: z.w("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "has not desc info");
        this.dXi.R("contact_info_user_desc", true);
        if (this.jDg)
          break label694;
        this.dXi.R("contact_info_time_expired", true);
        break label694;
        str2 = this.cHh.getResources().getString(com.tencent.mm.n.byf);
        break label857;
        str2 = this.cHh.getResources().getString(com.tencent.mm.n.byd);
        break label857;
        str2 = this.cHh.getResources().getString(com.tencent.mm.n.bye);
        break label857;
        label1491: localKeyValuePreference4.BZ(this.dpH.ux().dqy);
        break label864;
        bool1 = false;
        break label899;
        label1515: z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "[arthurdan.emojiSpan] Notice!!!! extInfo.verifyInfo.verifySourceDescription is null");
        break label980;
        label1527: bool2 = false;
        break label999;
        label1533: z.w("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "has not verify info");
        this.dXi.R("contact_info_verifyuser", true);
      }
      label1558: this.dXi.R("contact_info_privilege", true);
      int i = this.dXi.indexOf("contact_info_subscribe_bizinfo");
      int k;
      if ((i >= 0) && (this.dpG != null))
        k = -1 + this.dpG.size();
      while (k >= 0)
      {
        if ((!this.cHh.getString(com.tencent.mm.n.bBi).equals(((com.tencent.mm.q.b)this.dpG.get(k)).title)) || (this.dpP))
        {
          Preference localPreference2 = new Preference(this.cHh);
          localPreference2.setKey("contact_info_bizinfo_external#" + k);
          localPreference2.setTitle(com.tencent.mm.q.aa.vb().getString(((com.tencent.mm.q.b)this.dpG.get(k)).dpK, ((com.tencent.mm.q.b)this.dpG.get(k)).title));
          if (!ch.jb(((com.tencent.mm.q.b)this.dpG.get(k)).description))
            localPreference2.setSummary(((com.tencent.mm.q.b)this.dpG.get(k)).description);
          this.dXi.a(localPreference2, i);
        }
        k--;
        continue;
        z.d("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "pos no more");
      }
      label2034: CheckBoxPreference localCheckBoxPreference2;
      if ((!this.jDg) && (y.p(this.elz)) && (this.elz.jt() != null) && (!this.elz.jt().equals("")))
      {
        KeyValuePreference localKeyValuePreference2 = (KeyValuePreference)this.dXi.BU("contact_info_verifyuser_weibo");
        if (localKeyValuePreference2 != null)
        {
          StringBuilder localStringBuilder = new StringBuilder().append(ch.Y(this.elz.jf(), ""));
          MMActivity localMMActivity = this.cHh;
          int j = com.tencent.mm.n.cgT;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = y.dW(this.elz.jt());
          localKeyValuePreference2.setSummary(localMMActivity.getString(j, arrayOfObject2));
          localKeyValuePreference2.pZ(com.tencent.mm.aq.a.l(this.cHh, com.tencent.mm.f.Oo));
          localKeyValuePreference2.fb(false);
        }
        if ((this.dpH == null) || (this.dpH.uv() == null))
          break label2544;
        BizInfoPayInfoIconPreference localBizInfoPayInfoIconPreference1 = (BizInfoPayInfoIconPreference)this.dXi.BU("contact_info_reputation");
        if (this.dpH.uv().dqA <= 0)
          break label2496;
        localBizInfoPayInfoIconPreference1.qB(this.dpH.uv().dqA);
        BizInfoPayInfoIconPreference localBizInfoPayInfoIconPreference2 = (BizInfoPayInfoIconPreference)this.dXi.BU("contact_info_guarantee_info");
        if ((this.dpH.uv().dqC == null) || (this.dpH.uv().dqC.size() <= 0))
          break label2512;
        localBizInfoPayInfoIconPreference2.bj(this.dpH.uv().dqC);
        label2097: KeyValuePreference localKeyValuePreference1 = (KeyValuePreference)this.dXi.BU("contact_info_scope_of_business");
        if (ch.jb(this.dpH.uv().dqB))
          break label2528;
        localKeyValuePreference1.setSummary(this.dpH.uv().dqB);
        localKeyValuePreference1.aTI();
        localKeyValuePreference1.fb(false);
        label2156: if (!com.tencent.mm.g.a.cv(this.elz.getType()))
          break label2683;
        if (locala3 == null)
          break label2643;
        CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.dXi.BU("contact_info_subscribe_bizinfo");
        localCheckBoxPreference2 = (CheckBoxPreference)this.dXi.BU("contact_info_locate");
        localCheckBoxPreference1.setChecked(locala3.tZ());
        if (!locala3.tZ())
          break label2602;
        if ((this.dpH == null) && (locala3 != null))
          this.dpH = locala3.tY();
        if ((this.dpH == null) || (!this.dpH.um()) || (!com.tencent.mm.am.a.to("brandservice")))
          break label2586;
        this.dXi.R("contact_info_template_recv", false);
        label2284: if (!locala3.tY().ud())
          break label2618;
        localCheckBoxPreference2.setChecked(locala3.ua());
        this.dXi.R("contact_info_biz_read_msg_online", true);
        this.dXi.R("contact_info_biz_add", true);
        String str1 = this.elz.od();
        if (str1 != null)
          this.cHh.Bt(str1);
        if ((!y.dO(this.elz.getUsername())) && (this.enO != null) && (!this.enO.ui()))
          this.cHh.a(0, h.WS, new p(this));
        if ((this.cHh.getIntent().getBooleanExtra("KIsHardDevice", false)) && (this.dpH != null) && (this.dpH.uw() != null) && (this.dpH.uw().uE()))
          com.tencent.mm.ui.base.e.a(this.cHh, com.tencent.mm.n.bGf, com.tencent.mm.n.bGh, com.tencent.mm.n.bGg, com.tencent.mm.n.bGe, new q(this), null);
      }
      label2496: label2512: label2528: label2544: label2683: 
      do
      {
        return;
        this.dXi.R("contact_info_verifyuser_weibo", true);
        break;
        this.dXi.R("contact_info_reputation", true);
        break label2034;
        this.dXi.R("contact_info_guarantee_info", true);
        break label2097;
        this.dXi.R("contact_info_scope_of_business", true);
        break label2156;
        this.dXi.R("contact_info_reputation", true);
        this.dXi.R("contact_info_guarantee_info", true);
        this.dXi.R("contact_info_scope_of_business", true);
        break label2156;
        this.dXi.R("contact_info_template_recv", true);
        break label2284;
        this.dXi.R("contact_info_template_recv", true);
        break label2284;
        this.dXi.R("contact_info_locate", true);
        localCheckBoxPreference2.setChecked(locala3.ua());
        break label2305;
        this.dXi.R("contact_info_subscribe_bizinfo", true);
        this.dXi.R("contact_info_locate", true);
        this.dXi.R("contact_info_template_recv", true);
        break label2305;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = this.elz.getUsername();
        z.w("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "%s is not my contact", arrayOfObject1);
        aXN();
        Preference localPreference1 = this.dXi.BU("contact_info_biz_add");
        if ((localPreference1 != null) && (this.jDh))
          localPreference1.setTitle(com.tencent.mm.n.bBg);
        this.cHh.eC(false);
      }
      while ((this.dpH == null) || (this.dpH.uw() == null) || (!this.dpH.uw().uE()) || (this.cHh.getIntent().getBooleanExtra("KIsHardDevice", false)));
      label2586: label2602: label2618: label2643: this.dXi.R("contact_info_biz_add", true);
      return;
    }
  }

  private void aXN()
  {
    if ((this.elz != null) && (com.tencent.mm.g.a.cv(this.elz.getType())) && (!y.du(this.elz.getUsername())))
    {
      this.dXi.R("contact_is_mute", false);
      this.dXi.R("contact_info_verifyuser_weibo", true);
      this.dXi.R("contact_info_subscribe_bizinfo", true);
      this.dXi.R("contact_info_template_recv", true);
      this.dXi.R("contact_info_locate", true);
      if ((this.elz != null) && (!com.tencent.mm.g.a.cv(this.elz.getType())))
        this.dXi.R("contact_info_biz_view", true);
      if (this.jDg)
        break label203;
      this.dXi.R("contact_info_time_expired", true);
    }
    while (true)
    {
      this.dXi.R("contact_info_biz_remove", true);
      this.dXi.R("contact_info_enter_enterprise", true);
      this.dXi.R("contact_info_service_phone", true);
      return;
      this.dXi.R("contact_is_mute", true);
      break;
      label203: this.dXi.R("contact_info_biz_add", true);
    }
  }

  private void aXO()
  {
    if ((this.cHh.getIntent() != null) && (this.cHh.getIntent().getBooleanExtra("KIsHardDevice", false)))
    {
      String str = this.cHh.getIntent().getStringExtra("KHardDeviceBindTicket");
      if (ch.jb(str))
      {
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "bindTicket is null");
        return;
      }
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "IsHardDevice, bindTicket = %s", new Object[] { str });
      com.tencent.mm.model.bg.qX().a(536, this);
      ba localba = new ba();
      localba.cIe.cIg = str;
      localba.cIe.cDf = 1;
      com.tencent.mm.sdk.c.a.aGB().g(localba);
      com.tencent.mm.o.x localx = localba.cIf.cDg;
      MMActivity localMMActivity = this.cHh;
      this.cHh.getString(com.tencent.mm.n.buo);
      this.dWq = com.tencent.mm.ui.base.e.a(localMMActivity, this.cHh.getString(com.tencent.mm.n.buA), true, new v(this, localx));
      return;
    }
    com.tencent.mm.pluginsdk.ui.applet.a locala = new com.tencent.mm.pluginsdk.ui.applet.a(this.cHh, new w(this));
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(this.jza));
    if (this.dpR != null)
      locala.vu(this.dpR);
    if (!ch.jb(this.hfH))
      locala.vv(this.hfH);
    locala.f(this.elz.getUsername(), localLinkedList);
  }

  private void aXP()
  {
    Intent localIntent = new Intent(this.cHh, ExposeWithProofUI.class);
    localIntent.putExtra("k_expose_scene", 43);
    localIntent.putExtra("k_username", this.elz.getUsername());
    this.cHh.startActivity(localIntent);
  }

  private void fG(boolean paramBoolean)
  {
    if (this.elz != null)
      if (this.cHh != null)
      {
        if (!paramBoolean)
          break label60;
        this.cHh.oT(0);
      }
    while (true)
    {
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.dXi.BU("contact_is_mute");
      if (localCheckBoxPreference != null)
      {
        boolean bool = false;
        if (!paramBoolean)
          bool = true;
        localCheckBoxPreference.setChecked(bool);
      }
      return;
      label60: this.cHh.oT(8);
    }
  }

  public final boolean ID()
  {
    BizInfoHeaderPreference localBizInfoHeaderPreference = (BizInfoHeaderPreference)this.dXi.BU("contact_info_header_bizinfo");
    if (localBizInfoHeaderPreference != null)
      localBizInfoHeaderPreference.onDetach();
    return true;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    if (paramx == null)
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "scene == null");
    do
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        com.tencent.mm.model.bg.qX().b(536, this);
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(paramx.getType());
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "scene.getType() = %s", arrayOfObject1);
        return;
      }
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramx.getType());
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "scene.getType() = %s", arrayOfObject2);
    }
    while (paramx.getType() != 536);
    if ((this.dWq != null) && (this.dWq.isShowing()))
      this.dWq.dismiss();
    com.tencent.mm.model.bg.qX().b(536, this);
    Intent localIntent = new Intent(this.cHh, ChattingUI.class);
    localIntent.putExtra("Chat_User", this.elz.getUsername());
    this.cHh.startActivity(localIntent);
    this.cHh.finish();
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, com.tencent.mm.storage.i parami, boolean paramBoolean, int paramInt)
  {
    boolean bool1;
    boolean bool2;
    if (parami != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (ch.ja(parami.getUsername()).length() <= 0)
        break label96;
      bool2 = true;
      label28: Assert.assertTrue(bool2);
      if (paramo == null)
        break label102;
    }
    label96: label102: for (boolean bool3 = true; ; bool3 = false)
    {
      Assert.assertTrue(bool3);
      this.dXi = paramo;
      this.elz = parami;
      this.fDb = paramBoolean;
      this.jza = paramInt;
      this.jDj = this.cHh.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      aXM();
      return true;
      bool1 = false;
      break;
      bool2 = false;
      break label28;
    }
  }

  public final boolean ky(String paramString)
  {
    int i = 1;
    if (paramString == null)
      i = 0;
    label748: com.tencent.mm.q.a locala2;
    do
    {
      com.tencent.mm.q.a locala1;
      do
      {
        do
        {
          do
          {
            return i;
            if (paramString.equals("contact_info_verifyuser_weibo"))
            {
              new ab(this.cHh).bG(this.elz.jt(), this.elz.getUsername());
              return i;
            }
            if ("contact_info_biz_remove".endsWith(paramString))
            {
              t.a(this.enO, this.cHh, this.elz, i);
              return i;
            }
            if (!"contact_info_biz_add".endsWith(paramString))
              break;
            aXO();
          }
          while (this.jDj == 0);
          com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(this.jDj);
          arrayOfObject2[i] = this.elz.getUsername();
          localn.d(11263, arrayOfObject2);
          return i;
          if ("contact_info_biz_view".endsWith(paramString))
          {
            Intent localIntent1 = new Intent(this.cHh, ChattingUI.class);
            localIntent1.addFlags(67108864);
            if (this.fDb)
            {
              localIntent1.putExtra("Chat_User", this.elz.getUsername());
              localIntent1.putExtra("Chat_Mode", i);
              this.cHh.setResult(-1, localIntent1);
            }
            while (true)
            {
              this.cHh.finish();
              return i;
              localIntent1.putExtra("Chat_User", this.elz.getUsername());
              localIntent1.putExtra("Chat_Mode", i);
              this.cHh.startActivity(localIntent1);
            }
          }
        }
        while ("contact_info_biz_read_msg_online".endsWith(paramString));
        if (("contact_info_guarantee_info".equals(paramString)) && (this.dpH.uv() != null) && (!ch.jb(this.dpH.uv().dqD)))
        {
          Intent localIntent6 = new Intent();
          localIntent6.putExtra("rawUrl", this.dpH.uv().dqD);
          localIntent6.putExtra("useJs", i);
          localIntent6.putExtra("vertical_scroll", i);
          localIntent6.putExtra("geta8key_scene", 3);
          com.tencent.mm.am.a.b(this.cHh, "webview", ".ui.tools.WebViewUI", localIntent6);
        }
        if (paramString.startsWith("contact_info_bizinfo_external#"))
        {
          int n = ch.getInt(paramString.replace("contact_info_bizinfo_external#", ""), -1);
          if ((n >= 0) && (n < this.dpG.size()))
          {
            String str2 = ((com.tencent.mm.q.b)this.dpG.get(n)).url;
            Intent localIntent5 = new Intent();
            localIntent5.putExtra("rawUrl", str2);
            localIntent5.putExtra("useJs", i);
            localIntent5.putExtra("vertical_scroll", i);
            localIntent5.putExtra("geta8key_scene", 3);
            com.tencent.mm.am.a.b(this.cHh, "webview", ".ui.tools.WebViewUI", localIntent5);
            return i;
          }
        }
        if ((!"contact_info_subscribe_bizinfo".endsWith(paramString)) && (!"contact_info_show_brand".endsWith(paramString)) && (!"contact_info_locate".endsWith(paramString)))
          break;
        locala1 = r.fE(this.elz.getUsername());
      }
      while (locala1 == null);
      if ("contact_info_subscribe_bizinfo".endsWith(paramString))
        if (locala1.tZ())
        {
          locala1.field_brandFlag = (0x1 | locala1.field_brandFlag);
          if ((this.dpH == null) && (locala1 != null))
            this.dpH = locala1.tY();
          if ((this.dpH != null) && (this.dpH.um()) && (com.tencent.mm.am.a.to("brandservice")))
            this.dXi.R("contact_info_template_recv", false);
        }
      while (true)
      {
        a(locala1, false);
        return i;
        this.dXi.R("contact_info_template_recv", i);
        continue;
        locala1.field_brandFlag = (0xFFFFFFFE & locala1.field_brandFlag);
        this.dXi.R("contact_info_template_recv", i);
        continue;
        if ("contact_info_show_brand".endsWith(paramString))
        {
          if ((0x2 & locala1.field_brandFlag) == 0);
          int m;
          for (int k = i; ; m = 0)
          {
            if (k == 0)
              break label748;
            locala1.field_brandFlag = (0x2 | locala1.field_brandFlag);
            break;
          }
          locala1.field_brandFlag = (0xFFFFFFFD & locala1.field_brandFlag);
        }
        else if ("contact_info_locate".endsWith(paramString))
        {
          if (locala1.ua())
          {
            locala1.field_brandFlag = (0xFFFFFFFB & locala1.field_brandFlag);
          }
          else
          {
            MMActivity localMMActivity1 = this.cHh;
            MMActivity localMMActivity2 = this.cHh;
            int j = com.tencent.mm.n.byA;
            Object[] arrayOfObject1 = new Object[i];
            arrayOfObject1[0] = this.elz.od();
            this.jrT = com.tencent.mm.ui.base.e.a(localMMActivity1, localMMActivity2.getString(j, arrayOfObject1), this.cHh.getString(com.tencent.mm.n.buo), new j(this, locala1), new o(this, locala1));
          }
        }
      }
      if (!"contact_info_verifyuser".endsWith(paramString))
        break;
      locala2 = r.fE(this.elz.getUsername());
    }
    while ((locala2 == null) || (locala2.tY().ux() == null) || (ch.jb(locala2.tY().ux().dqz)));
    Intent localIntent4 = new Intent();
    localIntent4.putExtra("rawUrl", locala2.tY().ux().dqz);
    localIntent4.putExtra("useJs", i);
    localIntent4.putExtra("vertical_scroll", i);
    localIntent4.putExtra("geta8key_scene", 3);
    com.tencent.mm.am.a.b(this.cHh, "webview", ".ui.tools.WebViewUI", localIntent4);
    return i;
    if ("contact_is_mute".endsWith(paramString))
    {
      boolean bool1 = this.eua;
      boolean bool2 = false;
      if (!bool1)
        bool2 = i;
      this.eua = bool2;
      if (this.eua)
      {
        y.i(this.elz);
        label1060: com.tencent.mm.model.bg.qX().d(new com.tencent.mm.ab.k(5));
        fG(this.eua);
      }
    }
    else if ("contact_info_enter_enterprise".equals(paramString))
    {
      if (this.cHh != null)
        break label1286;
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "EnterEnterprise context is null");
    }
    while (true)
    {
      if ("contact_info_template_recv".equals(paramString))
      {
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("enterprise_biz_name", this.enO.field_username);
        com.tencent.mm.am.a.b(this.cHh, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", localIntent2);
      }
      if ("contact_info_service_phone".equals(paramString))
      {
        Preference localPreference = this.dXi.BU("contact_info_service_phone");
        if ((localPreference != null) && (!ch.jb(localPreference.getSummary().toString())))
        {
          String str1 = localPreference.getSummary().toString();
          com.tencent.mm.ui.base.e.a(this.cHh, i, str1, "", this.cHh.getString(com.tencent.mm.n.bBs), this.cHh.getString(com.tencent.mm.n.bsK), new k(this, str1), null);
        }
      }
      if (!"contact_info_expose_btn".equals(paramString))
        break;
      aXP();
      return i;
      y.j(this.elz);
      break label1060;
      label1286: if (this.enO == null)
      {
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "EnterEnterprise bizInfo is null");
      }
      else
      {
        Intent localIntent3 = new Intent();
        localIntent3.putExtra("enterprise_biz_name", this.enO.field_username);
        localIntent3.addFlags(67108864);
        com.tencent.mm.am.a.b(this.cHh, "brandservice", ".ui.EnterpriseBizListUI", localIntent3);
      }
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
    Intent localIntent = new Intent(this.cHh, ChattingUI.class);
    localIntent.putExtra("Chat_User", str2);
    localIntent.putExtra("send_card_username", str1);
    localIntent.putExtra("Is_Chatroom", bool);
    this.cHh.startActivity(localIntent);
    this.cHh.finish();
  }

  public final void vv(String paramString)
  {
    this.hfH = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.i
 * JD-Core Version:    0.6.2
 */