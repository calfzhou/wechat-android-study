package com.tencent.mm.ui.conversation;

import android.content.Context;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.cc;

final class q extends r
{
  private String grh;

  public q(Context paramContext, String paramString, cc paramcc)
  {
    super(paramContext, paramcc);
    this.grh = paramString;
  }

  public final void DW()
  {
    setCursor(bg.qW().oW().c(y.dkj, this.edM, this.grh));
    if (this.iLp != null)
      this.iLp.DT();
    super.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.q
 * JD-Core Version:    0.6.2
 */