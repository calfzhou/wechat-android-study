package com.tencent.mm.ui.setting;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class f
  implements TextWatcher
{
  private int jzp = 30;

  private f(EditSignatureUI paramEditSignatureUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    this.jzp = EditSignatureUI.a(this.jLr, paramEditable);
    if (this.jzp < 0)
      this.jzp = 0;
    if (EditSignatureUI.a(this.jLr) != null)
      EditSignatureUI.a(this.jLr).setText(this.jzp);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.jLr.eB(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.f
 * JD-Core Version:    0.6.2
 */