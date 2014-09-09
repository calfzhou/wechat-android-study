package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.widget.LinearLayout;
import com.tencent.mm.c.a.j;
import com.tencent.mm.model.b;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.e;

final class bh
  implements Runnable
{
  bh(bg parambg, int paramInt)
  {
  }

  public final void run()
  {
    ((Dialog)this.jMt.iXK.getTag()).dismiss();
    com.tencent.mm.model.bg.qW().oQ().set(327681, Integer.valueOf(this.jMs));
    SettingsAboutSystemUI.f(this.jMt.jMk);
    j localj = new j();
    localj.cHn.mode = this.jMs;
    a.aGB().g(localj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bh
 * JD-Core Version:    0.6.2
 */