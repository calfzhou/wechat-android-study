package com.tencent.mm.ui.chatting;

import com.tencent.mm.ai.b;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;

final class ku
  implements Runnable
{
  ku(hd paramhd, String paramString1, String paramString2, long paramLong)
  {
  }

  public final void run()
  {
    String str = this.juf;
    if ((y.dc(this.dSm)) && (!ch.Y(str, "").startsWith("<")))
    {
      int i = this.juf.indexOf(':');
      if (i != -1)
        str = this.juf.substring(i + 1);
    }
    b localb = b.iS(ch.xw(str));
    if (localb != null)
      switch (localb.type)
      {
      default:
      case 3:
      }
    while (true)
    {
      return;
      if ((bg.ii() != null) && (bg.ii().kQ() != null) && (bg.ii().kP() == 0))
        try
        {
          long l = Long.parseLong(bg.ii().kQ());
          if (this.jug == l)
          {
            am.h(new kv(this));
            return;
          }
        }
        catch (Exception localException)
        {
        }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ku
 * JD-Core Version:    0.6.2
 */