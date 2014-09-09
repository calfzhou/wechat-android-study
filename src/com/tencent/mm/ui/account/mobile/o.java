package com.tencent.mm.ui.account.mobile;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.account.az;
import com.tencent.mm.ui.base.MMFormMobileInputView;

final class o
  implements View.OnClickListener
{
  o(n paramn, MobileInputUI paramMobileInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    String str = this.iUh.iOU.getText().toString().trim();
    this.iUh.iPd = this.iUh.iQo.getCountryCode();
    this.iUh.iPe = this.iUh.iQo.aRK();
    this.iUh.XF();
    int i = 6;
    if (ch.aHL())
      i = 14;
    az.a(this.iUh, i, str, this.iUh.iPd, this.iUh.iPe);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.o
 * JD-Core Version:    0.6.2
 */