package com.tencent.mm.ui.account;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.be;

final class fa
  implements View.OnClickListener
{
  fa(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(View paramView)
  {
    RegByMobileRegAIOUI.a(this.iQP, RegByMobileRegAIOUI.e(this.iQP).getText().toString().trim());
    RegByMobileRegAIOUI.b(this.iQP, be.AV(RegByMobileRegAIOUI.f(this.iQP).getText().toString()));
    String str = RegByMobileRegAIOUI.g(this.iQP) + RegByMobileRegAIOUI.h(this.iQP);
    this.iQP.XF();
    RegByMobileRegAIOUI.c(this.iQP, str);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fa
 * JD-Core Version:    0.6.2
 */