package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.ch;

final class bc
  implements TextWatcher
{
  bc(MMFormMobileInputView paramMMFormMobileInputView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str1 = MMFormMobileInputView.a(this.iZc).getText().toString();
    if (ch.jb(str1))
    {
      MMFormMobileInputView.a(this.iZc).setText("+");
      MMFormMobileInputView.a(this.iZc).setSelection(MMFormMobileInputView.a(this.iZc).getText().toString().length());
    }
    String str2;
    do
    {
      do
        while (true)
        {
          if (MMFormMobileInputView.d(this.iZc) != null)
            MMFormMobileInputView.d(this.iZc).BD(str1);
          return;
          if (str1.contains("+"))
            break;
          str1 = "+" + str1;
          MMFormMobileInputView.a(this.iZc).setText(str1);
          MMFormMobileInputView.a(this.iZc).setSelection(MMFormMobileInputView.a(this.iZc).getText().toString().length());
        }
      while (str1.length() <= 1);
      str2 = str1.substring(1);
    }
    while (str2.length() <= 4);
    MMFormMobileInputView.a(this.iZc).setText(str2.substring(0, 4));
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bc
 * JD-Core Version:    0.6.2
 */