package com.tencent.mm.ui.voicesearch;

import com.tencent.mm.g.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.o.ac;
import com.tencent.mm.storage.i;

final class q
  implements Runnable
{
  q(j paramj, String paramString)
  {
  }

  public final void run()
  {
    if (j.b(this.jZD).isHidden())
    {
      i locali = j.b(this.jZD);
      locali.setType(0xFFFFFFDF & locali.getType());
      if (j.c(this.jZD))
      {
        al localal = new al(this.jZF);
        bg.qX().d(localal);
        j.d(this.jZD);
      }
      return;
    }
    j.b(this.jZD).tD();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.q
 * JD-Core Version:    0.6.2
 */