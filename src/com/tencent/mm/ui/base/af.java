package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;

final class af
  implements TextWatcher
{
  af(MMAutoCompleteTextView paramMMAutoCompleteTextView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    MMAutoCompleteTextView.b(this.iYj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.af
 * JD-Core Version:    0.6.2
 */