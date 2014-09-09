package com.tencent.mm.ui.setting;

import android.text.InputFilter;
import android.text.Spanned;

final class dk
  implements InputFilter
{
  dk(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    if (paramCharSequence.length() <= 0)
      return paramSpanned.subSequence(paramInt3, paramInt4);
    return "";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.dk
 * JD-Core Version:    0.6.2
 */