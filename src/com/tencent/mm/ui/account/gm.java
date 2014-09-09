package com.tencent.mm.ui.account;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.EditText;

final class gm
  implements View.OnKeyListener
{
  gm(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((66 != paramInt) || (paramKeyEvent.getAction() != 0) || (!RegByMobileRegUI.e(this.iQU).isChecked()))
      return false;
    RegByMobileRegUI.b(this.iQU, RegByMobileRegUI.c(this.iQU).getText().toString().trim());
    RegByMobileRegUI.c(this.iQU, RegByMobileRegUI.a(this.iQU).getText().toString());
    String str = RegByMobileRegUI.f(this.iQU) + RegByMobileRegUI.g(this.iQU);
    this.iQU.XF();
    RegByMobileRegUI.d(this.iQU, str);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gm
 * JD-Core Version:    0.6.2
 */