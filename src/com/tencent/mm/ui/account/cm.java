package com.tencent.mm.ui.account;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

final class cm
  implements TextWatcher
{
  cm(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (LoginHistoryUI.d(this.iPx).getText().toString().length() > 0)
    {
      LoginHistoryUI.e(this.iPx).setEnabled(true);
      return;
    }
    LoginHistoryUI.e(this.iPx).setEnabled(false);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cm
 * JD-Core Version:    0.6.2
 */