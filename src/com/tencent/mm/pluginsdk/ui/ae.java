package com.tencent.mm.pluginsdk.ui;

import android.text.Editable;
import android.text.TextWatcher;

final class ae
  implements TextWatcher
{
  ae(MultiSelectContactView paramMultiSelectContactView)
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
    MultiSelectContactView.a(this.hzg);
    if (MultiSelectContactView.b(this.hzg) != null)
      MultiSelectContactView.b(this.hzg).vt(paramCharSequence.toString());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ae
 * JD-Core Version:    0.6.2
 */