package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;

final class jh
  implements TextWatcher
{
  jh(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str = RegSetInfoUI.b(this.iSh).getText().toString().trim();
    if ((str != null) && (str.length() > 16))
      RegSetInfoUI.b(this.iSh).setText(str.substring(0, 16));
    while (true)
    {
      return;
      if (!RegSetInfoUI.m(this.iSh).aNx())
        RegSetInfoUI.m(this.iSh).aNu();
      RegSetInfoUI.n(this.iSh);
      if (ch.jb(RegSetInfoUI.b(this.iSh).getText().toString().trim()))
        RegSetInfoUI.o(this.iSh).setVisibility(8);
      while (!RegSetInfoUI.p(this.iSh))
      {
        RegSetInfoUI.a(this.iSh).setText(str);
        return;
        RegSetInfoUI.o(this.iSh).setVisibility(0);
      }
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jh
 * JD-Core Version:    0.6.2
 */