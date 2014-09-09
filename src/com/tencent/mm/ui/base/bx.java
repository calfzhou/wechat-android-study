package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class bx
  implements AdapterView.OnItemSelectedListener
{
  bx(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      by localby = MMListPopupWindow.a(this.jay);
      if (localby != null)
        by.a(localby, false);
    }
  }

  public final void onNothingSelected(AdapterView paramAdapterView)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bx
 * JD-Core Version:    0.6.2
 */