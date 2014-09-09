package com.tencent.mm.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.pluginsdk.model.app.k;

final class c
  implements AdapterView.OnItemClickListener
{
  c(AddAppUI paramAddAppUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    k localk = AddAppUI.a(this.jJQ).mJ(paramInt);
    AddAppUI.p(localk);
    this.jJQ.DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.c
 * JD-Core Version:    0.6.2
 */