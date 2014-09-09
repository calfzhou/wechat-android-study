package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.be;

final class bg
  implements TextWatcher
{
  private be iPg = new be();

  bg(LoginByMobileUI paramLoginByMobileUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str1 = LoginByMobileUI.a(this.iPh).getText().toString();
    if ((str1 != null) && (!str1.equals(LoginByMobileUI.b(this.iPh))))
    {
      String str2 = LoginByMobileUI.c(this.iPh).getText().toString();
      LoginByMobileUI localLoginByMobileUI = this.iPh;
      LoginByMobileUI.a(localLoginByMobileUI, be.bC(str2.replace("+", ""), str1));
      LoginByMobileUI.a(this.iPh).setText(LoginByMobileUI.b(this.iPh));
      LoginByMobileUI.a(this.iPh).setSelection(LoginByMobileUI.a(this.iPh).getText().toString().length());
    }
    if ((str1 != null) && (str1.length() > 0) && (LoginByMobileUI.d(this.iPh)))
    {
      this.iPh.eB(true);
      return;
    }
    this.iPh.eB(false);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bg
 * JD-Core Version:    0.6.2
 */