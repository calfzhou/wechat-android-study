package com.tencent.mm.platformtools;

import android.os.Build.VERSION;
import android.widget.ListView;

public final class d
{
  public static void a(ListView paramListView)
  {
    if (Build.VERSION.SDK_INT >= 8)
    {
      new al();
      if (paramListView.getFirstVisiblePosition() > 10)
        paramListView.setSelection(10);
      if (Build.VERSION.SDK_INT >= 8)
        paramListView.smoothScrollToPosition(0);
      return;
    }
    new ak();
    paramListView.setSelection(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.d
 * JD-Core Version:    0.6.2
 */