package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;

final class aq
  implements TextWatcher
{
  aq(MMClearEditText paramMMClearEditText)
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
    MMClearEditText.b(this.iYE);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.aq
 * JD-Core Version:    0.6.2
 */