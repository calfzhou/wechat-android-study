package com.tencent.mm.ui.setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.c;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.ui.account.LanguagePreference;
import com.tencent.mm.ui.account.bf;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.cu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsLanguageUI extends MMPreference
{
  private static final String[] jLw = g.jLw;
  private o dXi;
  private String iRh;
  private List jNm;
  private boolean jNn = false;

  public static String h(Context paramContext)
  {
    int i = 0;
    String[] arrayOfString1 = paramContext.getResources().getStringArray(c.Nh);
    String str = y.e(paramContext.getSharedPreferences(ak.aHi(), 0));
    if (str == null)
      return paramContext.getString(g.jLx);
    String[] arrayOfString2 = jLw;
    int j = arrayOfString2.length;
    int k = 0;
    while (i < j)
    {
      if (arrayOfString2[i].equals(str))
        return arrayOfString1[k];
      k++;
      i++;
    }
    return paramContext.getString(g.jLx);
  }

  protected final void DP()
  {
    int i = 0;
    oP(n.cfK);
    a(new cp(this));
    a(0, getString(n.cfJ), new cq(this), cu.iMA);
    this.jNn = getIntent().getBooleanExtra("not_auth_setting", false);
    this.dXi.removeAll();
    String[] arrayOfString = getResources().getStringArray(c.Nh);
    this.iRh = y.e(getSharedPreferences(ak.aHi(), 0));
    this.jNm = new ArrayList();
    while (i < jLw.length)
    {
      String str = jLw[i];
      this.jNm.add(new bf(arrayOfString[i], "", str, this.iRh.equalsIgnoreCase(str)));
      i++;
    }
    Iterator localIterator = this.jNm.iterator();
    while (localIterator.hasNext())
    {
      bf localbf = (bf)localIterator.next();
      LanguagePreference localLanguagePreference = new LanguagePreference(this);
      localLanguagePreference.a(localbf);
      this.dXi.a(localLanguagePreference);
    }
    PreferenceCategory localPreferenceCategory = new PreferenceCategory(this);
    this.dXi.a(localPreferenceCategory);
    this.dXi.notifyDataSetChanged();
  }

  public final int DZ()
  {
    return -1;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    if ((paramPreference instanceof LanguagePreference))
    {
      bf localbf = ((LanguagePreference)paramPreference).aQz();
      if (localbf == null)
        return false;
      this.iRh = localbf.Yh();
      Iterator localIterator = this.jNm.iterator();
      while (localIterator.hasNext())
        ((bf)localIterator.next()).setSelected(false);
      localbf.setSelected(true);
      paramo.notifyDataSetChanged();
      return true;
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dXi = aTL();
    DP();
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsLanguageUI
 * JD-Core Version:    0.6.2
 */