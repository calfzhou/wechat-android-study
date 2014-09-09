package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.cn;

final class jk
  implements TextWatcher
{
  jk(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (!RegSetInfoUI.m(this.iSh).aNx())
      RegSetInfoUI.m(this.iSh).aNu();
    String str = RegSetInfoUI.a(this.iSh).getText().toString().trim();
    if (ch.jb(str))
    {
      RegSetInfoUI.s(this.iSh).setText(this.iSh.getString(n.bZl));
      RegSetInfoUI.t(this.iSh);
      if (RegSetInfoUI.u(this.iSh) != null)
      {
        RegSetInfoUI.u(this.iSh).dismiss();
        RegSetInfoUI.v(this.iSh);
      }
      RegSetInfoUI.a(this.iSh).postDelayed(new jl(this), 50L);
    }
    if ((!ch.jb(str)) && ((RegSetInfoUI.c(this.iSh)) || (!str.equals(RegSetInfoUI.w(this.iSh)))))
    {
      RegSetInfoUI.t(this.iSh);
      RegSetInfoUI.m(this.iSh).cP(500L);
    }
    RegSetInfoUI.a(this.iSh, str);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jk
 * JD-Core Version:    0.6.2
 */