package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;

final class ah
  implements TextWatcher
{
  private String iYk;

  public ah(MMAutoCompleteTextView paramMMAutoCompleteTextView, String paramString)
  {
    this.iYk = paramString;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable.toString().endsWith(this.iYk))
      this.iYj.showDropDown();
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ah
 * JD-Core Version:    0.6.2
 */