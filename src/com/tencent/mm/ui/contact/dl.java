package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class dl
  implements TextWatcher
{
  private int jzp = 200;

  private dl(ModRemarkNameUI paramModRemarkNameUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    this.jzp = ModRemarkNameUI.a(this.jAS, paramEditable);
    if (this.jzp < 0)
      this.jzp = 0;
    if (ModRemarkNameUI.j(this.jAS) != null)
      ModRemarkNameUI.j(this.jAS).setText(this.jzp);
    ModRemarkNameUI.k(this.jAS);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dl
 * JD-Core Version:    0.6.2
 */