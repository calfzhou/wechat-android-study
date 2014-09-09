package com.tencent.mm.ui.tools;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class fz
  implements TextView.OnEditorActionListener
{
  fz(SearchViewNotRealTimeHelper paramSearchViewNotRealTimeHelper)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((3 == paramInt) && (SearchViewNotRealTimeHelper.c(this.jUI) != null))
      return SearchViewNotRealTimeHelper.c(this.jUI).jG(this.jUI.aAn());
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fz
 * JD-Core Version:    0.6.2
 */