package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.be;

final class gk
  implements TextWatcher
{
  private be iPg = new be();

  gk(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str1 = RegByMobileRegUI.a(this.iQU).getText().toString();
    if ((str1 != null) && (!str1.equals(RegByMobileRegUI.b(this.iQU))))
    {
      String str2 = RegByMobileRegUI.c(this.iQU).getText().toString();
      RegByMobileRegUI localRegByMobileRegUI = this.iQU;
      RegByMobileRegUI.a(localRegByMobileRegUI, be.bC(str2.replace("+", ""), str1));
      RegByMobileRegUI.a(this.iQU).setText(RegByMobileRegUI.b(this.iQU));
      RegByMobileRegUI.a(this.iQU).setSelection(RegByMobileRegUI.a(this.iQU).getText().toString().length());
    }
    if ((str1 != null) && (str1.length() > 0) && (RegByMobileRegUI.d(this.iQU)) && (RegByMobileRegUI.e(this.iQU).isChecked()))
    {
      this.iQU.eB(true);
      return;
    }
    this.iQU.eB(false);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gk
 * JD-Core Version:    0.6.2
 */