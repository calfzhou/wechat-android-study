package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

final class ga
  implements View.OnClickListener
{
  ga(SearchViewNotRealTimeHelper paramSearchViewNotRealTimeHelper)
  {
  }

  public final void onClick(View paramView)
  {
    SearchViewNotRealTimeHelper.d(this.jUI).setText("");
    if (SearchViewNotRealTimeHelper.c(this.jUI) != null)
      SearchViewNotRealTimeHelper.c(this.jUI).Jm();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ga
 * JD-Core Version:    0.6.2
 */