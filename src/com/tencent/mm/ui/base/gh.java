package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;

final class gh
  implements TextWatcher
{
  gh(VoiceSearchEditText paramVoiceSearchEditText)
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
    VoiceSearchEditText.a(this.jgk, true);
    VoiceSearchEditText.f(this.jgk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.gh
 * JD-Core Version:    0.6.2
 */