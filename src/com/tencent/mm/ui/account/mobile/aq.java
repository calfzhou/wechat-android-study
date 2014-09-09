package com.tencent.mm.ui.account.mobile;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.ui.base.MMFormMobileInputView;

final class aq
  implements TextWatcher
{
  private be iPg = new be();

  aq(MobileInputUI paramMobileInputUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str = this.iUs.iQo.aRK();
    if ((str != null) && (str.length() > 0) && (this.iUs.iPb) && ((!MobileInputUI.b(this.iUs)) || (this.iUs.hHm.isChecked())))
    {
      this.iUs.eB(true);
      this.iUs.iQu.setEnabled(true);
      return;
    }
    this.iUs.eB(false);
    this.iUs.iQu.setEnabled(false);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.aq
 * JD-Core Version:    0.6.2
 */