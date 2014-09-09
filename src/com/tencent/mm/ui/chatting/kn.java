package com.tencent.mm.ui.chatting;

import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.e;

final class kn
  implements Runnable
{
  kn(km paramkm, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    if (this.jub == 0)
    {
      this.juc.jtA.a(ch.xz(this.egt), hb.jrB);
      hd.a(this.juc.jtA, ch.xz(this.egt));
      return;
    }
    if (this.jub == 3)
      e.aw(this.juc.jtA.agh(), this.juc.jtA.getString(n.bAt));
    while (true)
    {
      this.juc.jtA.a(ch.xz(this.egt), hb.jrz);
      this.juc.jtA.joh.notifyDataSetChanged();
      return;
      if (this.jub != 5)
        e.aw(this.juc.jtA.agh(), this.juc.jtA.getString(n.bAo));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kn
 * JD-Core Version:    0.6.2
 */