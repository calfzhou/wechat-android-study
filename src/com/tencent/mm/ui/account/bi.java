package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Map;

final class bi
  implements TextWatcher
{
  bi(LoginByMobileUI paramLoginByMobileUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str1 = LoginByMobileUI.c(this.iPh).getText().toString();
    if (ch.jb(str1))
    {
      this.iPh.eB(false);
      LoginByMobileUI.c(this.iPh).setText("+");
      LoginByMobileUI.c(this.iPh).setSelection(LoginByMobileUI.c(this.iPh).getText().toString().length());
      LoginByMobileUI.e(this.iPh).setText(this.iPh.getString(n.bSF));
    }
    while (true)
    {
      if ((LoginByMobileUI.a(this.iPh).getText() == null) || (LoginByMobileUI.a(this.iPh).getText().toString().length() <= 0) || (!LoginByMobileUI.d(this.iPh)))
        break label384;
      this.iPh.eB(true);
      return;
      if (!str1.contains("+"))
      {
        String str4 = "+" + str1;
        LoginByMobileUI.c(this.iPh).setText(str4);
        LoginByMobileUI.c(this.iPh).setSelection(LoginByMobileUI.c(this.iPh).getText().toString().length());
      }
      else
      {
        if (str1.length() <= 1)
          break;
        String str2 = str1.substring(1);
        if (str2.length() > 4)
        {
          LoginByMobileUI.c(this.iPh).setText(str2.substring(0, 4));
          return;
        }
        String str3 = (String)LoginByMobileUI.f(this.iPh).get(str2);
        if (ch.jb(str3))
        {
          LoginByMobileUI.e(this.iPh).setText(this.iPh.getString(n.bSD));
          LoginByMobileUI.a(this.iPh, false);
        }
        else
        {
          if ((this.iPh.iPa.get(LoginByMobileUI.e(this.iPh).getText()) == null) || (!((String)this.iPh.iPa.get(LoginByMobileUI.e(this.iPh).getText())).equals(str2)))
            LoginByMobileUI.e(this.iPh).setText(str3);
          LoginByMobileUI.a(this.iPh, true);
        }
      }
    }
    label384: this.iPh.eB(false);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bi
 * JD-Core Version:    0.6.2
 */