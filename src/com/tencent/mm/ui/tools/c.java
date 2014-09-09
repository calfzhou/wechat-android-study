package com.tencent.mm.ui.tools;

import android.text.Editable;
import android.text.TextWatcher;

final class c
  implements TextWatcher
{
  c(ActionBarSearchView paramActionBarSearchView)
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
    ActionBarSearchView.a(this.jOM);
    i locali;
    if (ActionBarSearchView.b(this.jOM) != null)
    {
      locali = ActionBarSearchView.b(this.jOM);
      if (paramCharSequence != null)
        break label44;
    }
    label44: for (String str = ""; ; str = paramCharSequence.toString())
    {
      locali.vt(str);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.c
 * JD-Core Version:    0.6.2
 */