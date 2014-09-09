package com.tencent.mm.pluginsdk.ui.applet;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class as
  implements TextWatcher
{
  as(ar paramar)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i = 50 - paramEditable.length();
    if (i < 0)
      i = 0;
    if (ar.a(this.hBY) != null)
      ar.a(this.hBY).setText(String.valueOf(i));
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.as
 * JD-Core Version:    0.6.2
 */