package com.tencent.mm.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class g
  implements AdapterView.OnItemClickListener
{
  g(AppPreference paramAppPreference)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (AppPreference.a(this.jKa).oL(paramInt))
      AppPreference.a(this.jKa).fQ(false);
    do
    {
      do
      {
        return;
        if (!AppPreference.a(this.jKa).aYJ())
          break;
      }
      while (AppPreference.b(this.jKa) == null);
      AppPreference.b(this.jKa).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
      return;
    }
    while (AppPreference.c(this.jKa) == null);
    AppPreference.c(this.jKa).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.g
 * JD-Core Version:    0.6.2
 */