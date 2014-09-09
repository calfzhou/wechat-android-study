package com.tencent.mm.ui.account.mobile;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.mm.sdk.platformtools.ch;

final class ds
  implements InputFilter
{
  ds(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    return ch.p(paramCharSequence);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ds
 * JD-Core Version:    0.6.2
 */