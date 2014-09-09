package com.tencent.mm.ui;

import com.tencent.mm.ak.m;
import com.tencent.mm.ak.z;
import com.tencent.mm.c.a.kq;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.pluginsdk.model.app.bb;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.sdk.c.a;

final class dd
  implements Runnable
{
  dd(dc paramdc)
  {
  }

  public final void run()
  {
    bm.BF().run();
    m.AM().run();
    com.tencent.mm.y.ap.ye().run();
    bf.azb().run();
    com.tencent.mm.plugin.voicereminder.a.f.arH().run();
    a.aGB().g(new kq());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dd
 * JD-Core Version:    0.6.2
 */