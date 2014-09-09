package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class ab
  implements View.OnClickListener
{
  ab(SettingDeleteAccountAgreementUI paramSettingDeleteAccountAgreementUI)
  {
  }

  public final void onClick(View paramView)
  {
    this.jLT.startActivity(new Intent(this.jLT, SettingDeleteAccountInputPassUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ab
 * JD-Core Version:    0.6.2
 */