package com.tencent.mm.ui.base;

import android.view.View;

final class bw
  implements Runnable
{
  bw(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void run()
  {
    View localView = this.jay.getAnchorView();
    if ((localView != null) && (localView.getWindowToken() != null))
      this.jay.show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bw
 * JD-Core Version:    0.6.2
 */