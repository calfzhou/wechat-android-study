package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.model.at;
import com.tencent.mm.model.av;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cs;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.ac;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.q;
import com.tencent.mm.q.m;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.co;
import com.tencent.mm.storage.cq;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.io.IOException;
import junit.framework.Assert;

public class ContactInfoUI extends MMPreference
  implements al, as, cq
{
  private com.tencent.mm.ui.base.preference.o dXi;
  private com.tencent.mm.storage.i elz;
  private boolean fDb;
  private String hfH;
  private String ijC = "";
  private com.tencent.mm.pluginsdk.b.a jCP;
  private boolean jCQ;
  private byte[] jCR;
  private boolean jCS = false;
  private int jza;

  protected final void DP()
  {
    this.dXi = aTL();
    this.dXi.removeAll();
    this.jza = getIntent().getIntExtra("Contact_Scene", 9);
    this.hfH = getIntent().getStringExtra("Verify_ticket");
    this.fDb = getIntent().getBooleanExtra("Chat_Readonly", false);
    this.jCQ = getIntent().getBooleanExtra("User_Verify", false);
    String str1 = com.tencent.mm.platformtools.ap.ja(getIntent().getStringExtra("Contact_User"));
    String str2 = com.tencent.mm.platformtools.ap.ja(getIntent().getStringExtra("Contact_Alias"));
    String str3 = com.tencent.mm.platformtools.ap.ja(getIntent().getStringExtra("Contact_Encryptusername"));
    if (str1.endsWith("@stranger"))
      str3 = str1;
    this.elz = bg.qW().oT().ys(str1);
    com.tencent.mm.ab.o.r(this.elz);
    String str4 = getIntent().getStringExtra("Contact_Nick");
    int i = getIntent().getIntExtra("Contact_Sex", 0);
    String str5 = getIntent().getStringExtra("Contact_Province");
    String str6 = getIntent().getStringExtra("Contact_City");
    String str7 = getIntent().getStringExtra("Contact_Signature");
    int j = getIntent().getIntExtra("Contact_VUser_Info_Flag", 0);
    String str8 = getIntent().getStringExtra("Contact_VUser_Info");
    String str9 = getIntent().getStringExtra("Contact_Distance");
    int k = getIntent().getIntExtra("Contact_KWeibo_flag", 0);
    String str10 = getIntent().getStringExtra("Contact_KWeibo");
    String str11 = getIntent().getStringExtra("Contact_KWeiboNick");
    String str12 = getIntent().getStringExtra("Contact_KFacebookName");
    long l1 = getIntent().getLongExtra("Contact_KFacebookId", 0L);
    this.ijC = getIntent().getStringExtra("Contact_BrandIconURL");
    String str13 = getIntent().getStringExtra("Contact_RegionCode");
    this.jCR = getIntent().getByteArrayExtra("Contact_customInfo");
    if (getIntent().getBooleanExtra("force_get_contact", false))
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLSOpQlr7qYXUQIXraHz9cn", "initView, forceAddContact, user = " + str1);
      at.qx().ec(str1);
    }
    int m;
    label748: boolean bool;
    label778: label1120: int n;
    label1146: String str14;
    if ((this.elz != null) && ((int)this.elz.dhv > 0) && ((!y.dQ(this.elz.getUsername())) || ((com.tencent.mm.storage.i.ya(this.elz.getUsername())) && (!y.df(this.elz.getUsername())))))
    {
      com.tencent.mm.q.a locala = r.fE(this.elz.getUsername());
      if ((locala == null) || (locala.ub()))
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(j);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLSOpQlr7qYXUQIXraHz9cn", "update contact, verifyFlag %d.", arrayOfObject1);
        at.qx().ec(this.elz.getUsername());
        com.tencent.mm.n.c.eM(this.elz.getUsername());
      }
    }
    else
    {
      m = getIntent().getIntExtra("Contact_verify_Scene", 9);
      if ((this.elz != null) && ((int)this.elz.dhv != 0) && (com.tencent.mm.platformtools.ap.ja(this.elz.getUsername()).length() > 0))
        break label1410;
      this.elz = new com.tencent.mm.storage.i();
      this.elz.setUsername(str1);
      this.elz.aR(str2);
      this.elz.aU(str4);
      this.elz.aV(getIntent().getStringExtra("Contact_PyInitial"));
      this.elz.aW(getIntent().getStringExtra("Contact_QuanPin"));
      this.elz.bj(i);
      this.elz.bi(str5);
      this.elz.bj(str6);
      this.elz.bh(str7);
      this.elz.bg(j);
      this.elz.bo(str8);
      this.elz.bm(str9);
      this.elz.bq(m);
      this.elz.bl(str10);
      this.elz.bf(k);
      this.elz.aY(str11);
      this.elz.j(l1);
      this.elz.be(str12);
      this.elz.bn(str13);
      if (!com.tencent.mm.platformtools.ap.jb(str3))
        this.elz.bb(str3);
      if (this.elz != null)
        break label1626;
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpLSOpQlr7qYXUQIXraHz9cn", "contact = null");
      getIntent().putExtra("Contact_User", this.elz.getUsername());
      if (this.elz.getUsername().equals(x.pG()))
      {
        long l2 = com.tencent.mm.platformtools.ap.jC((String)bg.qW().oQ().get(65825));
        if (l2 > 0L)
        {
          this.elz.j(l2);
          this.elz.be((String)bg.qW().oQ().get(65826));
        }
        this.elz.br((String)bg.qW().oQ().get(286721));
        this.elz.bs((String)bg.qW().oQ().get(286722));
        this.elz.bt((String)bg.qW().oQ().get(286723));
      }
      if ((this.elz.getUsername() != null) && (this.elz.getUsername().equals(com.tencent.mm.storage.i.ye(x.pG()))))
      {
        cs localcs = cs.rQ();
        String str15 = com.tencent.mm.platformtools.ap.ja(localcs.jp());
        String str16 = com.tencent.mm.platformtools.ap.ja(localcs.jq());
        if (!com.tencent.mm.platformtools.ap.jb(str15))
          this.elz.bi(str15);
        if (!com.tencent.mm.platformtools.ap.jb(str16))
          this.elz.bj(str16);
        if (!com.tencent.mm.platformtools.ap.jb(localcs.getCountryCode()))
          this.elz.bn(RegionCodeDecoder.v(localcs.getCountryCode(), localcs.rU(), localcs.rT()));
        int i1 = com.tencent.mm.platformtools.ap.a(Integer.valueOf(localcs.jj()), 0);
        String str17 = com.tencent.mm.platformtools.ap.ja(localcs.jo());
        this.elz.bj(i1);
        this.elz.bh(str17);
      }
      if (com.tencent.mm.platformtools.ap.ja(this.elz.getUsername()).length() <= 0)
        break label1726;
      bool = true;
      Assert.assertTrue("initView: contact username is null", bool);
      if (!y.dP(this.elz.getUsername()))
        break label1732;
      n = n.cgx;
      oP(n);
      if (y.dc(this.elz.getUsername()))
        oP(n.bCQ);
      str14 = this.ijC;
      if (!y.dl(this.elz.getUsername()))
        break label1740;
      this.jCP = com.tencent.mm.am.a.z(this, "qqmail");
    }
    while (true)
    {
      if (this.jCP != null)
        this.jCP.a(this.dXi, this.elz, this.fDb, this.jza);
      a(new b(this));
      af.sL().eO(this.elz.getUsername());
      if (((y.dx(this.elz.getUsername())) && (x.pV())) || ((y.dp(this.elz.getUsername())) && (x.pR())) || ((y.dr(this.elz.getUsername())) && (x.qb())) || ((y.dl(this.elz.getUsername())) && (x.qd())))
      {
        this.jCS = true;
        return;
        if (!this.elz.aIj())
          break;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(this.elz.jA());
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLSOpQlr7qYXUQIXraHz9cn", "update contact, last check time=%d", arrayOfObject2);
        at.qx().ec(this.elz.getUsername());
        com.tencent.mm.n.c.eM(this.elz.getUsername());
        break;
        label1410: if (this.elz.jj() == 0)
          this.elz.bj(i);
        if ((str5 != null) && (!str5.equals("")))
          this.elz.bi(str5);
        if ((str6 != null) && (!str6.equals("")))
          this.elz.bj(str6);
        if ((str13 != null) && (!str13.equals("")))
          this.elz.bn(str13);
        if ((str7 != null) && (!str7.equals("")))
          this.elz.bh(str7);
        if (j != 0)
          this.elz.bg(j);
        if ((str8 != null) && (!str8.equals("")))
          this.elz.bo(str8);
        if ((str4 != null) && (!str4.equals("")))
          this.elz.aU(str4);
        this.elz.bm(str9);
        this.elz.bq(m);
        this.elz.j(l1);
        this.elz.be(str12);
        break label748;
        label1626: if (!com.tencent.mm.platformtools.ap.jb(str3))
        {
          cn localcn2 = bg.qW().oU().Ab(str3);
          if ((localcn2 != null) && (!com.tencent.mm.platformtools.ap.jb(localcn2.field_encryptUsername)))
          {
            this.elz.aT(localcn2.field_conRemark);
            break label778;
          }
        }
        if (com.tencent.mm.platformtools.ap.jb(str1))
          break label778;
        cn localcn1 = bg.qW().oU().Ab(str1);
        if ((localcn1 == null) || (com.tencent.mm.platformtools.ap.jb(localcn1.field_encryptUsername)))
          break label778;
        this.elz.aT(localcn1.field_conRemark);
        break label778;
        label1726: bool = false;
        break label1120;
        label1732: n = n.bDk;
        break label1146;
        label1740: if (y.dm(this.elz.getUsername()))
        {
          this.jCP = new aa(this);
          oP(n.cgx);
          continue;
        }
        if (y.jdMethod_do(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.z(this, "bottle");
          oP(n.cgx);
          continue;
        }
        if (y.dn(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.z(this, "tmessage");
          oP(n.cgx);
          continue;
        }
        if (y.dp(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.m(this, "qmessage", "widget_type_plugin");
          oP(n.cgx);
          continue;
        }
        if (com.tencent.mm.storage.i.ya(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.m(this, "qmessage", "widget_type_contact");
          continue;
        }
        if (y.de(this.elz.getUsername()))
        {
          this.jCP = new ap(this);
          continue;
        }
        if (y.dt(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.z(this, "qqsync");
          continue;
        }
        if (com.tencent.mm.storage.i.yc(this.elz.getUsername()))
        {
          this.jCP = new z(this);
          continue;
        }
        if (y.dv(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.z(this, "nearby");
          continue;
        }
        if (y.dw(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.z(this, "shake");
          continue;
        }
        if (y.dx(this.elz.getUsername()))
        {
          this.jCP = new au(this);
          continue;
        }
        if (y.dy(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.m(this, "readerapp", "widget_type_news");
          continue;
        }
        if (y.dF(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.m(this, "readerapp", "widget_type_weibo");
          continue;
        }
        if (y.dz(this.elz.getUsername()))
        {
          this.jCP = new bq(this);
          continue;
        }
        if (y.dq(this.elz.getUsername()))
        {
          this.jCP = new ae(this);
          continue;
        }
        if (y.dI(this.elz.getUsername()))
        {
          this.jCP = new bh(this);
          continue;
        }
        if (y.dJ(this.elz.getUsername()))
        {
          this.jCP = new ak(this);
          if (!ac.A(this))
            continue;
          startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 1005);
          continue;
        }
        if (y.dr(this.elz.getUsername()))
        {
          this.jCP = com.tencent.mm.am.a.z(this, "masssend");
          continue;
        }
        if (y.ds(this.elz.getUsername()))
        {
          this.jCP = new ai(this);
          continue;
        }
        if (!this.elz.aIg());
      }
      try
      {
        byte[] arrayOfByte = this.jCR;
        if (arrayOfByte == null);
        ev localev;
        for (localObject = null; ; localObject = localev)
        {
          i locali = new i(this, str14, (ev)localObject);
          if (!com.tencent.mm.platformtools.ap.jb(this.hfH))
            locali.vv(this.hfH);
          this.jCP = locali;
          break;
          localev = new ev().bh(this.jCR);
        }
        if (y.dA(this.elz.getUsername()))
        {
          this.jCP = new bu(this);
          continue;
        }
        if (y.dB(this.elz.getUsername()))
        {
          this.jCP = new bm(this);
          continue;
        }
        if (y.dC(this.elz.getUsername()))
        {
          this.jCP = new ar(this);
          continue;
        }
        this.jCP = new bc(this);
        continue;
        this.jCS = false;
        return;
      }
      catch (IOException localIOException)
      {
        while (true)
          Object localObject = null;
      }
    }
  }

  public final int DZ()
  {
    return q.czz;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    a((String)paramObject, null);
  }

  public final void a(cn paramcn)
  {
    com.tencent.mm.sdk.platformtools.am.h(new d(this, paramcn));
  }

  public final void a(String paramString, ao paramao)
  {
    new cm().post(new c(this, paramString));
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpLSOpQlr7qYXUQIXraHz9cn", str + " item has been clicked!");
    if (this.jCP != null)
      this.jCP.ky(str);
    return false;
  }

  protected final String aPL()
  {
    if (this.elz.aIg())
      return "_bizContact";
    return "";
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.jCP != null)
      this.jCP.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qW().oT().a(this);
    bg.qW().oU().a(this);
    DP();
  }

  public void onDestroy()
  {
    bg.qW().oT().b(this);
    bg.qW().oU().b(this);
    if (this.jCP != null)
      this.jCP.ID();
    if (com.tencent.mm.pluginsdk.am.ayg() != null)
      com.tencent.mm.pluginsdk.am.ayg().l(this);
    super.onDestroy();
  }

  public void onPause()
  {
    com.tencent.mm.q.aa.uY().h(this);
    super.onPause();
  }

  public void onResume()
  {
    com.tencent.mm.q.aa.uY().g(this);
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ContactInfoUI
 * JD-Core Version:    0.6.2
 */