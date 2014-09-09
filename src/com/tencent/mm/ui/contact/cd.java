package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class cd
  implements TextWatcher
{
  private int jzp = 200;

  private cd(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    this.jzp = ContactRemarkInfoModUI.a(this.jzm, paramEditable);
    if (this.jzp < 0)
      this.jzp = 0;
    if (ContactRemarkInfoModUI.a(this.jzm) != null)
      ContactRemarkInfoModUI.a(this.jzm).setText(this.jzp);
    ContactRemarkInfoModUI.b(this.jzm);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cd
 * JD-Core Version:    0.6.2
 */