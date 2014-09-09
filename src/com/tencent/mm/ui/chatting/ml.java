package com.tencent.mm.ui.chatting;

import com.tencent.mm.ad.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.e;

final class ml
  implements Runnable
{
  ml(mj parammj)
  {
  }

  public final void run()
  {
    if (!bg.oE())
      return;
    k localk = new k(6);
    bg.qX().d(localk);
    bg.qW().oQ().set(68108, Long.valueOf(ap.CL()));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ml
 * JD-Core Version:    0.6.2
 */