package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.TextView;

final class ac
  implements View.OnClickListener
{
  ac(SettingDeleteAccountAgreementUI paramSettingDeleteAccountAgreementUI, TextView paramTextView, CheckedTextView paramCheckedTextView)
  {
  }

  public final void onClick(View paramView)
  {
    this.jLU.setEnabled(this.jLV.isChecked());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ac
 * JD-Core Version:    0.6.2
 */