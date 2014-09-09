package com.tencent.mm.ui.setting;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;

final class bx
  implements TextWatcher
{
  bx(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    SettingsAliasUI localSettingsAliasUI = this.jNd;
    b localb = new b();
    if ((paramCharSequence.length() < 6) || (paramCharSequence.length() > 20))
    {
      localb.cGy = localSettingsAliasUI.getString(n.cnF);
      localb.jLp = false;
      if (!localb.jLp)
        break label339;
      this.jNd.eB(true);
      SettingsAliasUI.a(this.jNd).setTextColor(this.jNd.getResources().getColorStateList(f.Oi));
    }
    while (true)
    {
      SettingsAliasUI.a(this.jNd).setText(localb.cGy);
      SettingsAliasUI.b(this.jNd).setText(this.jNd.getString(n.bsF, new Object[] { paramCharSequence }));
      return;
      if (!ap.m(paramCharSequence.charAt(0)))
      {
        localb.cGy = localSettingsAliasUI.getString(n.cnD);
        localb.jLp = false;
        break;
      }
      for (int i = -1 + paramCharSequence.length(); ; i--)
      {
        if (i <= 0)
          break label317;
        char c = paramCharSequence.charAt(i);
        if ((!ap.m(c)) && (c != '-') && (c != '_') && (!ap.n(c)))
        {
          if (Character.isSpace(c))
          {
            localb.cGy = localSettingsAliasUI.getString(n.cnC);
            localb.jLp = false;
            break;
          }
          if (ap.l(c))
          {
            localb.cGy = localSettingsAliasUI.getString(n.cnB);
            localb.jLp = false;
            break;
          }
          localb.cGy = localSettingsAliasUI.getString(n.cnF);
          localb.jLp = false;
          break;
        }
      }
      label317: localb.cGy = localSettingsAliasUI.getString(n.bTa);
      localb.jLp = true;
      break;
      label339: this.jNd.eB(false);
      SettingsAliasUI.a(this.jNd).setTextColor(this.jNd.getResources().getColorStateList(f.OK));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bx
 * JD-Core Version:    0.6.2
 */