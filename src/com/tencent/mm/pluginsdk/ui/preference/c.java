package com.tencent.mm.pluginsdk.ui.preference;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class c
  implements TextWatcher
{
  c(b paramb, TextView paramTextView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i = 50 - paramEditable.length();
    if (i < 0)
      i = 0;
    if (this.hGW != null)
      this.hGW.setText(String.valueOf(i));
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.c
 * JD-Core Version:    0.6.2
 */