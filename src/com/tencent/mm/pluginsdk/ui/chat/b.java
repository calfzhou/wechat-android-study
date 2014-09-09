package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

final class b
  implements AdapterView.OnItemLongClickListener
{
  b(AppGrid paramAppGrid)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    e locale = AppGrid.c(this.hCm);
    int i = AppGrid.c(this.hCm).mK(paramInt + AppGrid.a(this.hCm) * AppGrid.b(this.hCm));
    AppGrid.d(this.hCm).mJ(paramInt);
    locale.mL(i);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.b
 * JD-Core Version:    0.6.2
 */