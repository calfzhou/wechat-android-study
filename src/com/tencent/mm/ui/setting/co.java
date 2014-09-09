package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.widget.LinearLayout;
import com.tencent.mm.c.a.j;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.e;

final class co
  implements Runnable
{
  co(cn paramcn, int paramInt)
  {
  }

  public final void run()
  {
    ((Dialog)this.jNl.iXK.getTag()).dismiss();
    bg.qW().oQ().set(327681, Integer.valueOf(this.jMs));
    SettingsChattingUI.d(this.jNl.jNi);
    j localj = new j();
    localj.cHn.mode = this.jMs;
    a.aGB().g(localj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.co
 * JD-Core Version:    0.6.2
 */