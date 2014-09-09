package com.tencent.mm.plugin.safedevice.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.mm.sdk.platformtools.ch;

final class ac
  implements TextWatcher
{
  ac(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if ((paramEditable != null) && (!ch.jb(paramEditable.toString())));
    for (boolean bool = true; ; bool = false)
    {
      this.fUC.eB(bool);
      return;
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
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.ac
 * JD-Core Version:    0.6.2
 */