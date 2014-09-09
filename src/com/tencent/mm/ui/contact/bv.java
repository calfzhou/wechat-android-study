package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.text.TextWatcher;

final class bv
  implements TextWatcher
{
  bv(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
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
 * Qualified Name:     com.tencent.mm.ui.contact.bv
 * JD-Core Version:    0.6.2
 */