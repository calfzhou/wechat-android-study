package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;

final class dk
  implements TextWatcher
{
  dk(LoginUI paramLoginUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    LoginUI.a(this.iPW);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.dk
 * JD-Core Version:    0.6.2
 */