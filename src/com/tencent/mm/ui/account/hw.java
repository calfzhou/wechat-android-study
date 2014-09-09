package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;

final class hw
  implements TextWatcher
{
  hw(RegByQQUI paramRegByQQUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    RegByQQUI.a(this.iRG);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hw
 * JD-Core Version:    0.6.2
 */