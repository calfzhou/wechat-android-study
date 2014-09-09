package com.tencent.mm.ui.pluginapp;

import android.text.Editable;
import android.text.TextWatcher;

final class o
  implements TextWatcher
{
  o(ContactSearchUI paramContactSearchUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    ContactSearchUI localContactSearchUI = this.jKK;
    if (paramEditable.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localContactSearchUI.eB(bool);
      return;
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
 * Qualified Name:     com.tencent.mm.ui.pluginapp.o
 * JD-Core Version:    0.6.2
 */