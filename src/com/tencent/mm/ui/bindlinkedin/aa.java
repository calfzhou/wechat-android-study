package com.tencent.mm.ui.bindlinkedin;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class aa
  implements TextWatcher
{
  private aa(InviteLinkedInFriendUI paramInviteLinkedInFriendUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i = InviteLinkedInFriendUI.a(this.jjy).getText().length();
    int j = InviteLinkedInFriendUI.b(this.jjy).getText().length();
    if (i == 0)
      InviteLinkedInFriendUI.a(this.jjy).setHint("");
    if (j == 0)
      InviteLinkedInFriendUI.b(this.jjy).setHint("");
    if ((i == 0) || (j == 0))
    {
      this.jjy.eB(false);
      return;
    }
    this.jjy.eB(true);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.aa
 * JD-Core Version:    0.6.2
 */