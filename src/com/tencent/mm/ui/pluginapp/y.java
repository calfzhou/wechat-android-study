package com.tencent.mm.ui.pluginapp;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.preference.o;

final class y
  implements Runnable
{
  y(x paramx)
  {
  }

  public final void run()
  {
    bg.qW().oQ().set(68377, "");
    if (t.a(this.jKX.jKV) != null)
      t.a(this.jKX.jKV).notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.y
 * JD-Core Version:    0.6.2
 */