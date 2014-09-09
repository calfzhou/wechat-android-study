package com.tencent.mm.ui.chatting;

import com.tencent.mm.ab.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.o.ac;
import com.tencent.mm.storage.i;

final class lr
  implements Runnable
{
  lr(hd paramhd, long paramLong, int paramInt)
  {
  }

  public final void run()
  {
    if (hd.Y(this.jtA))
      return;
    if ((this.jtA.joh.getCount() == 0) && (i.ya(this.jtA.aUL())))
    {
      cx localcx = cx.rV();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1);
      localcx.a(10076, arrayOfObject);
    }
    long l = this.fFG;
    h localh = new h(l);
    bg.qX().d(localh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.lr
 * JD-Core Version:    0.6.2
 */