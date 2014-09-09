package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.mm.ui.base.ct;

final class kc
  implements ct
{
  kc(hd paramhd)
  {
  }

  public final boolean NN()
  {
    View localView = hd.e(this.jtA).getChildAt(-1 + hd.e(this.jtA).getChildCount());
    if (localView == null);
    while ((localView.getBottom() <= hd.e(this.jtA).getHeight()) && (hd.e(this.jtA).getLastVisiblePosition() == -1 + hd.e(this.jtA).getAdapter().getCount()))
      return true;
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kc
 * JD-Core Version:    0.6.2
 */