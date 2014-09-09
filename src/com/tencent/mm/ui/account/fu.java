package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.mm.sdk.platformtools.be;

final class fu
  implements TextWatcher
{
  private be iPg = new be();

  fu(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    RegByMobileRegAIOUI.b(this.iQP);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fu
 * JD-Core Version:    0.6.2
 */