package com.tencent.mm.ui.account;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;

final class hy
  implements View.OnKeyListener
{
  hy(RegByQQUI paramRegByQQUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((66 != paramInt) || (paramKeyEvent.getAction() != 0) || (!RegByQQUI.c(this.iRG).isChecked()))
      return false;
    RegByQQUI.b(this.iRG);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hy
 * JD-Core Version:    0.6.2
 */