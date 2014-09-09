package com.tencent.mm.ui.bindqq;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;

final class q
  implements cc
{
  q(QQGroupUI paramQQGroupUI)
  {
  }

  public final void DT()
  {
    if (ch.a((Integer)bg.qW().oQ().get(9)) != 0);
    for (int i = 1; i == 0; i = 0)
    {
      QQGroupUI.a(this.jld).setVisibility(0);
      QQGroupUI.b(this.jld).setVisibility(8);
      QQGroupUI.c(this.jld).setVisibility(8);
      return;
    }
    if (QQGroupUI.d(this.jld).getCount() <= 0)
    {
      QQGroupUI.b(this.jld).setVisibility(8);
      QQGroupUI.c(this.jld).setVisibility(0);
      QQGroupUI.a(this.jld).setVisibility(8);
      return;
    }
    QQGroupUI.b(this.jld).setVisibility(0);
    QQGroupUI.c(this.jld).setVisibility(8);
    QQGroupUI.a(this.jld).setVisibility(8);
  }

  public final void DU()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.q
 * JD-Core Version:    0.6.2
 */