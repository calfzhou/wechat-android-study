package com.tencent.mm.ui.account;

import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class hx
  implements TextView.OnEditorActionListener
{
  hx(RegByQQUI paramRegByQQUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt != 6) && (paramInt != 5)) || (!RegByQQUI.c(this.iRG).isChecked()))
      return false;
    RegByQQUI.b(this.iRG);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hx
 * JD-Core Version:    0.6.2
 */