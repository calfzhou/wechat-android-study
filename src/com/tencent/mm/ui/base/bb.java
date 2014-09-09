package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.be;

final class bb
  implements TextWatcher
{
  private be iPg = new be();

  bb(MMFormMobileInputView paramMMFormMobileInputView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str1 = MMFormMobileInputView.b(this.iZc).getText().toString();
    if ((str1 != null) && (!str1.equals(MMFormMobileInputView.c(this.iZc))))
    {
      String str2 = MMFormMobileInputView.a(this.iZc).getText().toString();
      MMFormMobileInputView localMMFormMobileInputView = this.iZc;
      MMFormMobileInputView.a(localMMFormMobileInputView, be.bC(str2.replace("+", ""), str1));
      MMFormMobileInputView.b(this.iZc).setText(MMFormMobileInputView.c(this.iZc));
      MMFormMobileInputView.b(this.iZc).setSelection(MMFormMobileInputView.b(this.iZc).getText().toString().length());
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
 * Qualified Name:     com.tencent.mm.ui.base.bb
 * JD-Core Version:    0.6.2
 */