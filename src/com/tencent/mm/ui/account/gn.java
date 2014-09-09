package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Map;

final class gn
  implements TextWatcher
{
  gn(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str1 = RegByMobileRegUI.c(this.iQU).getText().toString();
    if (ch.jb(str1))
    {
      this.iQU.eB(false);
      RegByMobileRegUI.c(this.iQU).setText("+");
      RegByMobileRegUI.c(this.iQU).setSelection(RegByMobileRegUI.c(this.iQU).getText().toString().length());
      RegByMobileRegUI.h(this.iQU).setText(this.iQU.getString(n.bSF));
    }
    while (true)
    {
      if ((RegByMobileRegUI.a(this.iQU).getText() == null) || (RegByMobileRegUI.a(this.iQU).getText().toString().length() <= 0) || (!RegByMobileRegUI.d(this.iQU)) || (!RegByMobileRegUI.e(this.iQU).isChecked()))
        break label397;
      this.iQU.eB(true);
      return;
      if (!str1.contains("+"))
      {
        String str4 = "+" + str1;
        RegByMobileRegUI.c(this.iQU).setText(str4);
        RegByMobileRegUI.c(this.iQU).setSelection(RegByMobileRegUI.c(this.iQU).getText().toString().length());
      }
      else
      {
        if (str1.length() <= 1)
          break;
        String str2 = str1.substring(1);
        if (str2.length() > 4)
        {
          RegByMobileRegUI.c(this.iQU).setText(str2.substring(0, 4));
          return;
        }
        String str3 = (String)RegByMobileRegUI.i(this.iQU).get(str2);
        if (ch.jb(str3))
        {
          RegByMobileRegUI.h(this.iQU).setText(this.iQU.getString(n.bSD));
          RegByMobileRegUI.a(this.iQU, false);
        }
        else
        {
          if ((this.iQU.iPa.get(RegByMobileRegUI.h(this.iQU).getText()) == null) || (!((String)this.iQU.iPa.get(RegByMobileRegUI.h(this.iQU).getText())).equals(str2)))
            RegByMobileRegUI.h(this.iQU).setText(str3);
          RegByMobileRegUI.a(this.iQU, true);
        }
      }
    }
    label397: this.iQU.eB(false);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gn
 * JD-Core Version:    0.6.2
 */