package com.tencent.mm.ui.tools;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class fn
  implements TextView.OnEditorActionListener
{
  fn(fj paramfj)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((3 == paramInt) && (fj.d(this.jUD) != null))
      return fj.d(this.jUD).jG(this.jUD.aAn());
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fn
 * JD-Core Version:    0.6.2
 */