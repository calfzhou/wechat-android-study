package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.ListView;
import com.tencent.mm.ui.base.cu;

final class kd
  implements cu
{
  kd(hd paramhd)
  {
  }

  public final boolean NM()
  {
    View localView = hd.e(this.jtA).getChildAt(hd.e(this.jtA).getFirstVisiblePosition());
    return (localView != null) && (localView.getTop() == 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kd
 * JD-Core Version:    0.6.2
 */