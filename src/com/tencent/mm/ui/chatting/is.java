package com.tencent.mm.ui.chatting;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;

final class is
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  is(hd paramhd)
  {
  }

  public final void onGlobalLayout()
  {
    hd.e(this.jtA).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    hd.w(this.jtA).run();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.is
 * JD-Core Version:    0.6.2
 */