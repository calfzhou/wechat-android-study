package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.h;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.o;

public class MultiStageCitySelectUI extends MMPreference
  implements m
{
  private static String dyU = null;
  private static String jUe = null;
  private static String jUf = null;
  private o dXi;
  private int dYw = 0;
  private String dmj = null;
  private String dmk = null;
  private String dml = null;
  private h dqP;
  private c dqT = new ez(this);
  private RegionCodeDecoder.Region[] jUg;
  private boolean jUh = false;
  private ZoneRecommandPreference jUi;

  private void baI()
  {
    RegionCodeDecoder.Region[] arrayOfRegion;
    if (ap.jb(this.dmj))
    {
      arrayOfRegion = RegionCodeDecoder.aKA().aKD();
      this.jUg = arrayOfRegion;
      if ((this.jUg != null) && (this.jUg.length > 0))
        break label87;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpIde65kiMeUpqlCN7YBh+S07SSwJ3cICKI=", "initZoneItems error ,check zone lists!");
    }
    label87: 
    do
    {
      return;
      if (ap.jb(this.dml))
      {
        arrayOfRegion = RegionCodeDecoder.aKA().zV(this.dmj);
        break;
      }
      arrayOfRegion = RegionCodeDecoder.aKA().bw(this.dmj, this.dml);
      break;
      this.dXi.removeAll();
      String str1 = (String)bg.qW().oQ().get(12324);
      String str2 = (String)bg.qW().oQ().get(12325);
      String str3 = (String)bg.qW().oQ().get(12326);
      int i = 0;
      if (i < this.jUg.length)
      {
        ZonePreference localZonePreference;
        if ((this.jUg[i] != null) && (!ap.jb(this.jUg[i].getCode())) && (!ap.jb(this.jUg[i].getName())))
        {
          localZonePreference = new ZonePreference(this);
          localZonePreference.a(this.jUg[i]);
          if ((this.dYw != 0) || (!this.jUg[i].getCode().equalsIgnoreCase(str1)))
            break label272;
          this.dXi.a(localZonePreference, 0);
          localZonePreference.setSummary(n.cfa);
        }
        while (true)
        {
          i++;
          break;
          if ((this.dYw == 1) && (this.jUg[i].getCode().equalsIgnoreCase(str2)))
          {
            this.dXi.a(localZonePreference, 0);
            localZonePreference.setSummary(n.cfa);
          }
          else if ((this.dYw == 2) && (this.jUg[i].getCode().equalsIgnoreCase(str3)))
          {
            this.dXi.a(localZonePreference, 0);
            localZonePreference.setSummary(n.cfa);
          }
          else
          {
            this.dXi.a(localZonePreference);
          }
        }
      }
      PreferenceCategory localPreferenceCategory = new PreferenceCategory(aPI());
      this.dXi.a(localPreferenceCategory);
    }
    while (this.dYw != 0);
    label272: PreferenceTitleCategory localPreferenceTitleCategory1 = new PreferenceTitleCategory(this);
    localPreferenceTitleCategory1.setTitle(n.ceY);
    this.dXi.a(localPreferenceTitleCategory1, 0);
    this.jUi = new ZoneRecommandPreference(this);
    this.jUi.setKey("current_location");
    this.dXi.a(this.jUi, 1);
    PreferenceTitleCategory localPreferenceTitleCategory2 = new PreferenceTitleCategory(this);
    localPreferenceTitleCategory2.setTitle(n.ceX);
    this.dXi.a(localPreferenceTitleCategory2, 2);
    if (this.dqP == null)
      this.dqP = h.xl();
    this.dqP.b(this.dqT);
  }

  private void baJ()
  {
    switch (this.dYw)
    {
    default:
      return;
    case 2:
      this.dmk = null;
      return;
    case 1:
      this.dml = null;
      return;
    case 0:
    }
    this.dmj = null;
  }

  private void baK()
  {
    if (this.jUi != null)
      this.jUi.bbh();
  }

  protected final void DP()
  {
    oP(n.bTz);
    a(new fa(this));
    this.jUh = getIntent().getBooleanExtra("GetAddress", false);
    this.dmj = getIntent().getStringExtra("Country");
    this.dml = getIntent().getStringExtra("Provice");
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpIde65kiMeUpqlCN7YBh+S07SSwJ3cICKI=", " country = " + this.dmj + " province =" + this.dml + " city = " + this.dmk);
    if (this.dmj == null)
    {
      this.dYw = 0;
      this.dml = null;
      this.dmk = null;
    }
    while (true)
    {
      baI();
      return;
      if (this.dml == null)
      {
        this.dYw = 1;
        this.dmk = null;
      }
      else
      {
        this.dYw = 2;
      }
    }
  }

  public final int DZ()
  {
    return k.bqw;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    int j;
    RegionCodeDecoder.Region localRegion4;
    int m;
    label138: RegionCodeDecoder.Region localRegion5;
    int i1;
    label191: RegionCodeDecoder.Region localRegion1;
    RegionCodeDecoder.Region localRegion2;
    RegionCodeDecoder.Region localRegion3;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramx.getType() == 665)
      {
        com.tencent.mm.modelsimple.z localz = (com.tencent.mm.modelsimple.z)paramx;
        String str1 = localz.dCE;
        String str2 = localz.cOz;
        String str3 = localz.cOA;
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpIde65kiMeUpqlCN7YBh+S07SSwJ3cICKI=", "current location country %s, province %s, city %s", new Object[] { str1, str2, str3 });
        RegionCodeDecoder.Region[] arrayOfRegion1 = RegionCodeDecoder.aKA().aKD();
        int i = arrayOfRegion1.length;
        j = 0;
        if (j >= i)
          break label327;
        localRegion4 = arrayOfRegion1[j];
        if (!localRegion4.getCode().equalsIgnoreCase(str1))
          break label295;
        RegionCodeDecoder.Region[] arrayOfRegion2 = RegionCodeDecoder.aKA().zV(localRegion4.getCode());
        int k = arrayOfRegion2.length;
        m = 0;
        if (m >= k)
          break label282;
        localRegion5 = arrayOfRegion2[m];
        if (!localRegion5.getCode().equalsIgnoreCase(str2))
          break label276;
        RegionCodeDecoder.Region[] arrayOfRegion3 = RegionCodeDecoder.aKA().bw(localRegion4.getCode(), localRegion5.getCode());
        int n = arrayOfRegion3.length;
        i1 = 0;
        if (i1 >= n)
          break label262;
        localRegion1 = arrayOfRegion3[i1];
        if (!localRegion1.getCode().equalsIgnoreCase(str3))
          break label256;
        localRegion2 = localRegion5;
        localRegion3 = localRegion4;
      }
    while (true)
    {
      label226: if ((localRegion3 == null) && (localRegion2 == null) && (localRegion1 == null))
        if (this.jUi != null)
          this.jUi.bbh();
      label256: label262: label276: label282: label295: 
      while (this.jUi == null)
      {
        return;
        i1++;
        break label191;
        localRegion2 = localRegion5;
        localRegion3 = localRegion4;
        localRegion1 = null;
        break label226;
        m++;
        break label138;
        localRegion3 = localRegion4;
        localRegion1 = null;
        localRegion2 = null;
        break label226;
        j++;
        break;
      }
      this.jUi.a(localRegion3, localRegion2, localRegion1);
      return;
      baK();
      return;
      label327: localRegion1 = null;
      localRegion2 = null;
      localRegion3 = null;
    }
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    if ((paramPreference instanceof ZonePreference))
    {
      RegionCodeDecoder.Region localRegion2 = ((ZonePreference)paramPreference).bbc();
      if ((localRegion2 == null) || (ap.jb(localRegion2.getCode())))
      {
        StringBuilder localStringBuilder1 = new StringBuilder("onPreferenceTreeClick error item, code:");
        Object localObject4;
        StringBuilder localStringBuilder2;
        if (localRegion2 == null)
        {
          localObject4 = Integer.valueOf(-1);
          localStringBuilder2 = localStringBuilder1.append(localObject4).append(" ,name:");
          if (localRegion2 != null)
            break label107;
        }
        label107: for (String str7 = "null"; ; str7 = localRegion2.getName())
        {
          com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpIde65kiMeUpqlCN7YBh+S07SSwJ3cICKI=", str7);
          return false;
          localObject4 = localRegion2.getCode();
          break;
        }
      }
      if (this.dYw == 0)
      {
        this.dmj = localRegion2.getCode();
        dyU = localRegion2.getName();
        if (localRegion2.hasChildren())
          break label356;
        if (!this.jUh)
        {
          bg.qW().oQ().set(12324, this.dmj);
          bg.qW().oQ().set(12325, this.dml);
          bg.qW().oQ().set(12326, this.dmk);
        }
        Intent localIntent3 = new Intent();
        localIntent3.putExtra("CountryName", dyU);
        localIntent3.putExtra("ProviceName", jUe);
        localIntent3.putExtra("CityName", jUf);
        localIntent3.putExtra("Country", this.dmj);
        localIntent3.putExtra("Contact_Province", this.dml);
        localIntent3.putExtra("Contact_City", this.dmk);
        setResult(-1, localIntent3);
        finish();
      }
      while (true)
      {
        return true;
        if (this.dYw == 1)
        {
          this.dml = localRegion2.getCode();
          jUe = localRegion2.getName();
          break;
        }
        if (this.dYw != 2)
          break;
        this.dmk = localRegion2.getCode();
        jUf = localRegion2.getName();
        break;
        label356: Intent localIntent2 = new Intent(this, MultiStageCitySelectUI.class);
        Bundle localBundle = new Bundle();
        localBundle.putString("Country", this.dmj);
        localBundle.putString("Provice", this.dml);
        localBundle.putBoolean("GetAddress", this.jUh);
        localIntent2.putExtras(localBundle);
        startActivityForResult(localIntent2, 1);
      }
    }
    RegionCodeDecoder.Region[] arrayOfRegion;
    Object localObject1;
    Object localObject2;
    label502: Object localObject3;
    label529: Intent localIntent1;
    String str1;
    label557: String str2;
    label577: String str3;
    label597: String str4;
    label617: String str5;
    label636: String str6;
    if ((paramPreference.getKey().equals("current_location")) && (this.jUi.bbg()))
    {
      arrayOfRegion = this.jUi.bbe();
      e locale1 = bg.qW().oQ();
      if (arrayOfRegion[0] != null)
        break label684;
      localObject1 = null;
      locale1.set(12324, localObject1);
      e locale2 = bg.qW().oQ();
      if (arrayOfRegion[1] != null)
        break label695;
      localObject2 = null;
      locale2.set(12325, localObject2);
      e locale3 = bg.qW().oQ();
      if (arrayOfRegion[2] != null)
        break label706;
      localObject3 = null;
      locale3.set(12326, localObject3);
      localIntent1 = new Intent();
      if (arrayOfRegion[0] != null)
        break label717;
      str1 = null;
      localIntent1.putExtra("CountryName", str1);
      if (arrayOfRegion[1] != null)
        break label728;
      str2 = null;
      localIntent1.putExtra("ProviceName", str2);
      if (arrayOfRegion[2] != null)
        break label739;
      str3 = null;
      localIntent1.putExtra("CityName", str3);
      if (arrayOfRegion[0] != null)
        break label750;
      str4 = null;
      localIntent1.putExtra("Country", str4);
      if (arrayOfRegion[1] != null)
        break label761;
      str5 = null;
      localIntent1.putExtra("Contact_Province", str5);
      RegionCodeDecoder.Region localRegion1 = arrayOfRegion[2];
      str6 = null;
      if (localRegion1 != null)
        break label772;
    }
    while (true)
    {
      localIntent1.putExtra("Contact_City", str6);
      setResult(-1, localIntent1);
      finish();
      return false;
      label684: localObject1 = arrayOfRegion[0].getCode();
      break;
      label695: localObject2 = arrayOfRegion[1].getCode();
      break label502;
      label706: localObject3 = arrayOfRegion[2].getCode();
      break label529;
      label717: str1 = arrayOfRegion[0].getName();
      break label557;
      label728: str2 = arrayOfRegion[1].getName();
      break label577;
      label739: str3 = arrayOfRegion[2].getName();
      break label597;
      label750: str4 = arrayOfRegion[0].getCode();
      break label617;
      label761: str5 = arrayOfRegion[1].getCode();
      break label636;
      label772: str6 = arrayOfRegion[2].getCode();
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default:
    case 1:
    }
    do
      return;
    while (paramInt2 != -1);
    setResult(-1, paramIntent);
    finish();
  }

  public void onBackPressed()
  {
    baJ();
    super.onBackPressed();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(665, this);
    this.dXi = aTL();
    DP();
  }

  protected void onDestroy()
  {
    bg.qX().b(665, this);
    if (this.dqP != null)
      this.dqP.c(this.dqT);
    super.onDestroy();
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MultiStageCitySelectUI
 * JD-Core Version:    0.6.2
 */