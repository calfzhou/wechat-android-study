package com.tencent.mm.ui.tools;

import android.widget.EditText;

final class gd
  implements Runnable
{
  gd(SearchViewNotRealTimeHelper paramSearchViewNotRealTimeHelper)
  {
  }

  public final void run()
  {
    SearchViewNotRealTimeHelper.d(this.jUI).requestFocus();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gd
 * JD-Core Version:    0.6.2
 */