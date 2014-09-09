package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;

final class gc
  implements View.OnClickListener
{
  gc(SearchViewNotRealTimeHelper paramSearchViewNotRealTimeHelper)
  {
  }

  public final void onClick(View paramView)
  {
    if (SearchViewNotRealTimeHelper.c(this.jUI) != null)
      SearchViewNotRealTimeHelper.c(this.jUI).kD(this.jUI.aAn());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gc
 * JD-Core Version:    0.6.2
 */