package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.z.b;

public class RegByMobileVoiceVerifySelectUI extends MMPreference
  implements m
{
  private o dXi;
  private bf[] iRg;
  private String iRh;

  public static String BE(String paramString)
  {
    bf[] arrayOfbf = aQK();
    String str = b.gY(paramString);
    int i = arrayOfbf.length;
    for (int j = 0; j < i; j++)
    {
      bf localbf = arrayOfbf[j];
      if (localbf.Yh().equalsIgnoreCase(str))
        return localbf.aQA();
    }
    return "English";
  }

  private static bf[] aQK()
  {
    String[] arrayOfString1 = ak.getContext().getString(n.bwX).trim().split(",");
    bf[] arrayOfbf = new bf[arrayOfString1.length];
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String[] arrayOfString2 = arrayOfString1[i].trim().split(":");
      arrayOfbf[i] = new bf(arrayOfString2[1], arrayOfString2[2], arrayOfString2[0], false);
    }
    return arrayOfbf;
  }

  protected final void DP()
  {
    XF();
    this.iRh = getIntent().getExtras().getString("voice_verify_code");
    oP(n.bxa);
    a(new gt(this));
    this.iRg = aQK();
    if ((this.iRg == null) || (this.iRg.length <= 0));
    while (true)
    {
      return;
      this.dXi.removeAll();
      PreferenceCategory localPreferenceCategory = new PreferenceCategory(this);
      this.dXi.a(localPreferenceCategory);
      for (bf localbf : this.iRg)
      {
        if (localbf.Yh().equalsIgnoreCase(this.iRh))
          localbf.setSelected(true);
        LanguagePreference localLanguagePreference = new LanguagePreference(this);
        localLanguagePreference.a(localbf);
        localLanguagePreference.setKey(localbf.Yh());
        this.dXi.a(localLanguagePreference);
      }
    }
  }

  public final int DZ()
  {
    return k.bbK;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    bf localbf;
    if ((paramPreference instanceof LanguagePreference))
    {
      localbf = ((LanguagePreference)paramPreference).aQz();
      if (localbf != null);
    }
    else
    {
      return false;
    }
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("voice_verify_language", localbf.aQA());
    localBundle.putString("voice_verify_code", localbf.Yh());
    localIntent.putExtras(localBundle);
    setResult(0, localIntent);
    finish();
    return true;
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
 * Qualified Name:     com.tencent.mm.ui.account.RegByMobileVoiceVerifySelectUI
 * JD-Core Version:    0.6.2
 */