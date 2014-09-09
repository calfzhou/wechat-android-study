package com.tencent.mm.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class q
  implements AdapterView.OnItemClickListener
{
  q(ServicePreference paramServicePreference)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (ServicePreference.a(this.jKo).oL(paramInt))
      ServicePreference.a(this.jKo).fQ(false);
    do
    {
      do
      {
        return;
        if (!ServicePreference.a(this.jKo).aYJ())
          break;
      }
      while (ServicePreference.b(this.jKo) == null);
      ServicePreference.b(this.jKo).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
      return;
    }
    while (ServicePreference.c(this.jKo) == null);
    ServicePreference.c(this.jKo).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.q
 * JD-Core Version:    0.6.2
 */