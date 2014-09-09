package com.tencent.mm.ui;

import android.view.View;
import com.tencent.mm.ui.base.preference.b;
import com.tencent.mm.ui.d.a;

final class en
  implements Runnable
{
  en(SingleChatInfoUI paramSingleChatInfoUI, int paramInt)
  {
  }

  public final void run()
  {
    View localView = ((b)SingleChatInfoUI.a(this.iNx)).a(this.eux, this.iNx.getListView());
    if (localView != null)
      a.c(this.iNx.aPI(), localView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.en
 * JD-Core Version:    0.6.2
 */