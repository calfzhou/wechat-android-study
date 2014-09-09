package com.tencent.mm.ui.base.preference;

import android.text.Editable;
import android.text.TextWatcher;

final class a
  implements TextWatcher
{
  a(AutoHintSizeEditText paramAutoHintSizeEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AutoHintSizeEditText.a(this.jgq, paramEditable, this.jgq.getHint(), this.jgq.getWidth() - this.jgq.getPaddingLeft() - this.jgq.getPaddingRight());
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.a
 * JD-Core Version:    0.6.2
 */