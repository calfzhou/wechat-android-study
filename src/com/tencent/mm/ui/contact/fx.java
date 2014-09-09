package com.tencent.mm.ui.contact;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.en;

final class fx
  implements AbsListView.OnScrollListener
{
  fx(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 2);
    while (ch.b((Boolean)bg.qW().oQ().get(12296)))
      return;
    bg.qW().oQ().set(12296, Boolean.valueOf(true));
    if (SnsAddressUI.e(this.jCy) != null)
      SnsAddressUI.e(this.jCy).dismiss();
    SnsAddressUI.a(this.jCy, en.a(this.jCy, this.jCy.getString(n.bRg), 4000L));
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fx
 * JD-Core Version:    0.6.2
 */