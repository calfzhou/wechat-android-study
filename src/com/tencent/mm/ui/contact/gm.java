package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.en;

final class gm
  implements AbsListView.OnScrollListener
{
  gm(VoipAddressUI paramVoipAddressUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 2);
    while (ch.b((Boolean)bg.qW().oQ().get(12296)))
      return;
    bg.qW().oQ().set(12296, Boolean.valueOf(true));
    if (VoipAddressUI.f(this.jCH) != null)
      VoipAddressUI.f(this.jCH).dismiss();
    VoipAddressUI.a(this.jCH, en.a(this.jCH, this.jCH.getString(n.bRg), 4000L));
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 0)
    {
      View localView = VoipAddressUI.g(this.jCH).getChildAt(VoipAddressUI.g(this.jCH).getFirstVisiblePosition());
      if ((localView != null) && (localView.getTop() == 0))
      {
        VoipAddressUI.h(this.jCH).setVisibility(8);
        return;
      }
      VoipAddressUI.h(this.jCH).setVisibility(0);
      return;
    }
    VoipAddressUI.h(this.jCH).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gm
 * JD-Core Version:    0.6.2
 */