package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.f.c;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.PluginTextPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsPluginsUI extends MMPreference
{
  private o dXi;
  private boolean jNO;
  private boolean jNP;
  private boolean jNQ;

  protected final void DP()
  {
    oP(n.cgp);
    a(new em(this));
  }

  public final int DZ()
  {
    return q.czZ;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str1 = paramPreference.getKey();
    boolean bool2;
    if ((str1 != null) && (str1.equals("display_in_addr_book")))
    {
      boolean bool3 = ((CheckBoxPreference)paramo.BU(str1)).isChecked();
      bg.qW().oQ().set(35, Boolean.valueOf(bool3));
      bool2 = true;
    }
    boolean bool1;
    do
    {
      return bool2;
      bool1 = paramPreference instanceof PluginPreference;
      bool2 = false;
    }
    while (!bool1);
    String str2 = ((PluginPreference)paramPreference).aZa();
    if (("meishiapp".equals(str2)) && (this.jNO))
      bg.qW().oQ().set(-2046825370, Boolean.valueOf(false));
    if (("feedsapp".equals(str2)) && (this.jNP))
      bg.qW().oQ().set(-2046825369, Boolean.valueOf(false));
    if (("voipapp".equals(str2)) && (this.jNQ))
      bg.qW().oQ().set(-2046825368, Boolean.valueOf(false));
    aPI().startActivity(new Intent(this, ContactInfoUI.class).putExtra("Contact_User", str2));
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dXi = aTL();
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.dXi.removeAll();
    PreferenceSmallCategory localPreferenceSmallCategory1 = new PreferenceSmallCategory(this);
    this.dXi.a(localPreferenceSmallCategory1);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    PluginPreference localPluginPreference1;
    int i12;
    if (com.tencent.mm.am.a.to("qqmail"))
    {
      localPluginPreference1 = new PluginPreference(this);
      if (localPluginPreference1.Dh("qqmail"))
      {
        localPluginPreference1.setTitle(localPluginPreference1.aYZ());
        if ((0x1 & x.pO()) != 0)
          break label1379;
        i12 = 1;
        if (i12 == 0)
          break label1385;
        localArrayList1.add(localPluginPreference1);
      }
    }
    label111: PluginPreference localPluginPreference2;
    int i11;
    if (com.tencent.mm.am.a.to("qmessage"))
    {
      localPluginPreference2 = new PluginPreference(this);
      if (localPluginPreference2.Dh("qmessage"))
      {
        localPluginPreference2.setTitle(localPluginPreference2.aYZ());
        if ((0x20 & x.pO()) != 0)
          break label1403;
        i11 = 1;
        label161: if (i11 == 0)
          break label1409;
        localArrayList1.add(localPluginPreference2);
      }
    }
    label175: PluginPreference localPluginPreference3;
    if (com.tencent.mm.am.a.to("qqsync"))
    {
      localPluginPreference3 = new PluginPreference(this);
      if (localPluginPreference3.Dh("qqsync"))
      {
        localPluginPreference3.setTitle(localPluginPreference3.aYZ());
        if (!x.pW())
          break label1427;
        localArrayList1.add(localPluginPreference3);
      }
    }
    label228: PluginPreference localPluginPreference4;
    int i10;
    if (com.tencent.mm.am.a.to("bottle"))
    {
      localPluginPreference4 = new PluginPreference(this);
      if (localPluginPreference4.Dh("floatbottle"))
      {
        localPluginPreference4.setTitle(localPluginPreference4.aYZ());
        if ((0x40 & x.pO()) != 0)
          break label1445;
        i10 = 1;
        label278: if (i10 == 0)
          break label1451;
        localArrayList1.add(localPluginPreference4);
      }
    }
    label292: PluginPreference localPluginPreference5;
    int i9;
    if (com.tencent.mm.am.a.to("nearby"))
    {
      localPluginPreference5 = new PluginPreference(this);
      if (localPluginPreference5.Dh("lbsapp"))
      {
        localPluginPreference5.setTitle(localPluginPreference5.aYZ());
        if ((0x200 & x.pO()) != 0)
          break label1463;
        i9 = 1;
        label343: if (i9 == 0)
          break label1469;
        localArrayList1.add(localPluginPreference5);
      }
    }
    label357: PluginPreference localPluginPreference6;
    int i8;
    if (com.tencent.mm.am.a.to("shake"))
    {
      localPluginPreference6 = new PluginPreference(this);
      if (localPluginPreference6.Dh("shakeapp"))
      {
        localPluginPreference6.setTitle(localPluginPreference6.aYZ());
        if ((0x100 & x.pO()) != 0)
          break label1481;
        i8 = 1;
        label408: if (i8 == 0)
          break label1487;
        localArrayList1.add(localPluginPreference6);
      }
    }
    label422: PluginPreference localPluginPreference7 = new PluginPreference(this);
    int i7;
    label464: label478: PluginPreference localPluginPreference8;
    int i6;
    label528: label542: PluginPreference localPluginPreference9;
    int i5;
    label585: label599: PluginPreference localPluginPreference10;
    int i4;
    label646: label660: PluginPreference localPluginPreference11;
    int i3;
    label708: label722: PluginPreference localPluginPreference12;
    int i2;
    label772: label786: PluginPreference localPluginPreference13;
    int i1;
    label836: label850: PluginPreference localPluginPreference19;
    label900: int n;
    label956: label970: label1020: PluginPreference localPluginPreference14;
    int m;
    label1074: label1088: int j;
    label1114: PluginPreference localPluginPreference18;
    int k;
    label1163: label1177: PluginPreference localPluginPreference15;
    int i;
    if (localPluginPreference7.Dh("medianote"))
    {
      localPluginPreference7.setTitle(localPluginPreference7.aYZ());
      if ((0x10 & x.pO()) == 0)
      {
        i7 = 1;
        if (i7 == 0)
          break label1505;
        localArrayList1.add(localPluginPreference7);
      }
    }
    else
    {
      if (com.tencent.mm.am.a.to("readerapp"))
      {
        localPluginPreference8 = new PluginPreference(this);
        if (localPluginPreference8.Dh("newsapp"))
        {
          localPluginPreference8.setTitle(localPluginPreference8.aYZ());
          if ((0x80000 & x.pO()) != 0)
            break label1523;
          i6 = 1;
          if (i6 == 0)
            break label1529;
          localArrayList1.add(localPluginPreference8);
        }
      }
      localPluginPreference9 = new PluginPreference(this);
      if (localPluginPreference9.Dh("facebookapp"))
      {
        localPluginPreference9.setTitle(localPluginPreference9.aYZ());
        if ((0x2000 & x.pO()) != 0)
          break label1547;
        i5 = 1;
        if (i5 == 0)
          break label1553;
        localArrayList1.add(localPluginPreference9);
      }
      com.tencent.mm.am.a.aCl();
      localPluginPreference10 = new PluginPreference(this);
      if (localPluginPreference10.Dh("qqfriend"))
      {
        localPluginPreference10.setTitle(localPluginPreference10.aYZ());
        if ((0x1000 & x.pO()) != 0)
          break label1571;
        i4 = 1;
        if (i4 == 0)
          break label1577;
        localArrayList1.add(localPluginPreference10);
      }
      if (ch.ys())
      {
        localPluginPreference11 = new PluginPreference(this);
        if (localPluginPreference11.Dh("googlecontact"))
        {
          localPluginPreference11.setTitle(localPluginPreference11.aYZ());
          if ((0x800000 & x.pO()) != 0)
            break label1589;
          i3 = 1;
          if (i3 == 0)
            break label1595;
          localArrayList1.add(localPluginPreference11);
        }
      }
      if (com.tencent.mm.am.a.to("masssend"))
      {
        localPluginPreference12 = new PluginPreference(this);
        if (localPluginPreference12.Dh("masssendapp"))
        {
          localPluginPreference12.setTitle(localPluginPreference12.aYZ());
          if ((0x10000 & x.pO()) != 0)
            break label1613;
          i2 = 1;
          if (i2 == 0)
            break label1619;
          localArrayList1.add(localPluginPreference12);
        }
      }
      if (com.tencent.mm.am.a.to("sns"))
      {
        localPluginPreference13 = new PluginPreference(this);
        if (localPluginPreference13.Dh("feedsapp"))
        {
          localPluginPreference13.setTitle(localPluginPreference13.aYZ());
          if ((0x8000 & x.pO()) != 0)
            break label1631;
          i1 = 1;
          if (i1 == 0)
            break label1637;
          localArrayList1.add(localPluginPreference13);
          this.jNP = ap.a((Boolean)bg.qW().oQ().get(-2046825369), false);
          if (!this.jNP)
            break label1649;
          localPluginPreference13.pT(0);
          localPluginPreference13.aq(getString(n.btN), h.Xq);
        }
      }
      if (com.tencent.mm.am.a.to("voip"))
      {
        com.tencent.mm.am.a.aCl();
        localPluginPreference19 = new PluginPreference(this);
        if (localPluginPreference19.Dh("voipapp"))
        {
          localPluginPreference19.setTitle(localPluginPreference19.aYZ());
          if ((0x100000 & x.pO()) != 0)
            break label1668;
          n = 1;
          if (n == 0)
            break label1674;
          localArrayList1.add(localPluginPreference19);
          this.jNQ = ap.a((Boolean)bg.qW().oQ().get(-2046825368), false);
          if (!this.jNQ)
            break label1686;
          localPluginPreference19.pT(0);
          localPluginPreference19.aq(getString(n.btN), h.Xq);
        }
      }
      com.tencent.mm.am.a.aCl();
      if (!com.tencent.mm.z.b.ym())
      {
        localPluginPreference14 = new PluginPreference(this);
        if (localPluginPreference14.Dh("voiceinputapp"))
        {
          localPluginPreference14.setTitle(localPluginPreference14.aYZ());
          if ((0x2000000 & x.pO()) != 0)
            break label1705;
          m = 1;
          if (m == 0)
            break label1711;
          localArrayList1.add(localPluginPreference14);
        }
      }
      if (com.tencent.mm.am.a.to("voip"))
      {
        com.tencent.mm.am.a.aCl();
        com.tencent.mm.f.e.os();
        if (com.tencent.mm.f.a.oa() != 0)
          break label1723;
        j = 1;
        if (j == 0)
        {
          localPluginPreference18 = new PluginPreference(this);
          if (localPluginPreference18.Dh("voicevoipapp"))
          {
            localPluginPreference18.setTitle(localPluginPreference18.aYZ());
            if ((0x400000 & x.pO()) != 0)
              break label1729;
            k = 1;
            if (k == 0)
              break label1735;
            localArrayList1.add(localPluginPreference18);
            localPluginPreference18.pT(8);
            localPluginPreference18.aq("", -1);
          }
        }
      }
      String str = com.tencent.mm.f.e.or().getValue("LinkedinPluginClose");
      if ((ap.jb(str)) || (Integer.valueOf(str).intValue() == 0))
      {
        localPluginPreference15 = new PluginPreference(this);
        if (localPluginPreference15.Dh("linkedinplugin"))
        {
          localPluginPreference15.setTitle(localPluginPreference15.aYZ());
          if ((0x1000000 & x.pO()) != 0)
            break label1747;
          i = 1;
          label1267: if (i == 0)
            break label1753;
          localArrayList1.add(localPluginPreference15);
        }
      }
    }
    while (true)
    {
      if (!localArrayList1.isEmpty())
      {
        PluginTextPreference localPluginTextPreference1 = new PluginTextPreference(this);
        localPluginTextPreference1.setImageResource(h.aao);
        localPluginTextPreference1.pY(n.cgv);
        this.dXi.a(localPluginTextPreference1);
      }
      Iterator localIterator1 = localArrayList1.iterator();
      while (localIterator1.hasNext())
      {
        PluginPreference localPluginPreference17 = (PluginPreference)localIterator1.next();
        localPluginPreference17.qJ(255);
        this.dXi.a(localPluginPreference17);
      }
      label1379: i12 = 0;
      break;
      label1385: if (!com.tencent.mm.z.b.yo())
        break label111;
      localArrayList2.add(localPluginPreference1);
      break label111;
      label1403: i11 = 0;
      break label161;
      label1409: if (!com.tencent.mm.z.b.yo())
        break label175;
      localArrayList2.add(localPluginPreference2);
      break label175;
      label1427: if (!com.tencent.mm.z.b.yo())
        break label228;
      localArrayList2.add(localPluginPreference3);
      break label228;
      label1445: i10 = 0;
      break label278;
      label1451: localArrayList2.add(localPluginPreference4);
      break label292;
      label1463: i9 = 0;
      break label343;
      label1469: localArrayList2.add(localPluginPreference5);
      break label357;
      label1481: i8 = 0;
      break label408;
      label1487: localArrayList2.add(localPluginPreference6);
      break label422;
      i7 = 0;
      break label464;
      label1505: if (!com.tencent.mm.z.b.yo())
        break label478;
      localArrayList2.add(localPluginPreference7);
      break label478;
      label1523: i6 = 0;
      break label528;
      label1529: if (!com.tencent.mm.z.b.yo())
        break label542;
      localArrayList2.add(localPluginPreference8);
      break label542;
      label1547: i5 = 0;
      break label585;
      label1553: if (!com.tencent.mm.z.b.yn())
        break label599;
      localArrayList2.add(localPluginPreference9);
      break label599;
      label1571: i4 = 0;
      break label646;
      label1577: localArrayList2.add(localPluginPreference10);
      break label660;
      label1589: i3 = 0;
      break label708;
      label1595: if (!com.tencent.mm.z.b.yp())
        break label722;
      localArrayList2.add(localPluginPreference11);
      break label722;
      label1613: i2 = 0;
      break label772;
      label1619: localArrayList2.add(localPluginPreference12);
      break label786;
      label1631: i1 = 0;
      break label836;
      label1637: localArrayList2.add(localPluginPreference13);
      break label850;
      label1649: localPluginPreference13.pT(8);
      localPluginPreference13.aq("", -1);
      break label900;
      label1668: n = 0;
      break label956;
      label1674: localArrayList2.add(localPluginPreference19);
      break label970;
      label1686: localPluginPreference19.pT(8);
      localPluginPreference19.aq("", -1);
      break label1020;
      label1705: m = 0;
      break label1074;
      label1711: localArrayList2.add(localPluginPreference14);
      break label1088;
      label1723: j = 0;
      break label1114;
      label1729: k = 0;
      break label1163;
      label1735: localArrayList2.add(localPluginPreference18);
      break label1177;
      label1747: i = 0;
      break label1267;
      label1753: localArrayList2.add(localPluginPreference15);
    }
    PreferenceSmallCategory localPreferenceSmallCategory2 = new PreferenceSmallCategory(this);
    this.dXi.a(localPreferenceSmallCategory2);
    PluginTextPreference localPluginTextPreference2 = new PluginTextPreference(this);
    localPluginTextPreference2.setImageResource(h.aap);
    localPluginTextPreference2.pY(n.cgB);
    this.dXi.a(localPluginTextPreference2);
    if (localArrayList2.isEmpty())
    {
      PluginEmptyTextPreference localPluginEmptyTextPreference = new PluginEmptyTextPreference(this, n.cgq);
      this.dXi.a(localPluginEmptyTextPreference);
    }
    Iterator localIterator2 = localArrayList2.iterator();
    while (localIterator2.hasNext())
    {
      PluginPreference localPluginPreference16 = (PluginPreference)localIterator2.next();
      localPluginPreference16.qJ(136);
      this.dXi.a(localPluginPreference16);
    }
    PreferenceSmallCategory localPreferenceSmallCategory3 = new PreferenceSmallCategory(this);
    this.dXi.a(localPreferenceSmallCategory3);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsPluginsUI
 * JD-Core Version:    0.6.2
 */