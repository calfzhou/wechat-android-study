package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.mc;
import com.tencent.mm.c.a.md;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.cm;

final class km extends g
{
  km(hd paramhd)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    String str;
    int i;
    if ((parame instanceof mc))
    {
      mc localmc = (mc)parame;
      str = localmc.cOZ.id;
      i = localmc.cOZ.ret;
      if (i != 5)
        break label67;
    }
    label67: for (int j = 2000; ; j = 0)
    {
      hd.j(this.jtA).postDelayed(new kn(this, i, str), j);
      return false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.km
 * JD-Core Version:    0.6.2
 */