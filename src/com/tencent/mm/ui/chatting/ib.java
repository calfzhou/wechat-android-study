package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.ch;

final class ib
  implements Runnable
{
  ib(ia paramia, String paramString)
  {
  }

  public final void run()
  {
    if ((!ch.jb(hd.p(this.jtK.jtA))) && (!ch.jb(this.dSm)) && (this.dSm.equals(hd.p(this.jtK.jtA))))
      hd.q(this.jtK.jtA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ib
 * JD-Core Version:    0.6.2
 */