package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class a
  implements AdapterView.OnItemClickListener
{
  a(AppGrid paramAppGrid)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppGrid.c(this.hCm).a(AppGrid.c(this.hCm).mK(paramInt + AppGrid.a(this.hCm) * AppGrid.b(this.hCm)), AppGrid.d(this.hCm).mJ(paramInt));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.a
 * JD-Core Version:    0.6.2
 */