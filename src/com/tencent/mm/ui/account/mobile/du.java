package com.tencent.mm.ui.account.mobile;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.ch;

final class du
  implements TextWatcher
{
  du(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (ch.jb(this.iVq.iTQ.getText().toString()))
    {
      this.iVq.iTQ.setTextSize(15.0F);
      this.iVq.iTQ.setGravity(16);
    }
    while ((this.iVq.iTQ.getText() != null) && (this.iVq.iTQ.getText().toString().length() > 0))
    {
      this.iVq.fqA.setEnabled(true);
      return;
      this.iVq.iTQ.setTextSize(24.0F);
      this.iVq.iTQ.setGravity(16);
    }
    this.iVq.fqA.setEnabled(false);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.du
 * JD-Core Version:    0.6.2
 */