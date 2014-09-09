package com.tencent.mm.ui.account;

import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class et
  implements TextView.OnEditorActionListener
{
  et(RegByEmailUI paramRegByEmailUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt != 6) && (paramInt != 5)) || (!RegByEmailUI.d(this.iQk).isChecked()))
      return false;
    RegByEmailUI.c(this.iQk);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.et
 * JD-Core Version:    0.6.2
 */