package com.tencent.mm.modelstat;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;

final class h
  implements Runnable
{
  h(g paramg, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    if ((this.dEw > 0) && (!ch.jb(this.dEx)))
    {
      if (this.dEw != 1)
        break label61;
      am.c(bg.qW().pu() + this.dEx, x.pG(), false, true);
    }
    label61: 
    do
    {
      return;
      if (this.dEw == 2)
      {
        am.c(bg.qW().pt() + this.dEx, x.pG(), false, true);
        return;
      }
    }
    while (this.dEw != 3);
    am.c(this.dEx, x.pG(), false, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.h
 * JD-Core Version:    0.6.2
 */