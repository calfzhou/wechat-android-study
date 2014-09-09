package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;

final class ds
  implements TextWatcher
{
  ds(MMTagPanel paramMMTagPanel)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str = paramEditable.toString();
    if (MMTagPanel.e(this.jcy) != null)
      MMTagPanel.e(this.jcy).mD(str);
    if (str.length() > 0)
      this.jcy.aSO();
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ds
 * JD-Core Version:    0.6.2
 */