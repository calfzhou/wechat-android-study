package com.tencent.mm.ui.setting;

import android.text.Editable;
import android.text.TextWatcher;

final class ds
  implements TextWatcher
{
  ds(SettingsModifyNameUI paramSettingsModifyNameUI)
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
    this.jNA.eB(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ds
 * JD-Core Version:    0.6.2
 */