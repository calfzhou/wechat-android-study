package com.tencent.mm.ui.account;

import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class gl
  implements TextView.OnEditorActionListener
{
  gl(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt != 6) && (paramInt != 5)) || (!RegByMobileRegUI.e(this.iQU).isChecked()))
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
 * Qualified Name:     com.tencent.mm.ui.account.gl
 * JD-Core Version:    0.6.2
 */