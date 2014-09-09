package com.tencent.mm.ui.account;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;

final class eu
  implements View.OnKeyListener
{
  eu(RegByEmailUI paramRegByEmailUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((66 != paramInt) || (paramKeyEvent.getAction() != 0) || (!RegByEmailUI.d(this.iQk).isChecked()))
      return false;
    RegByEmailUI.c(this.iQk);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.eu
 * JD-Core Version:    0.6.2
 */