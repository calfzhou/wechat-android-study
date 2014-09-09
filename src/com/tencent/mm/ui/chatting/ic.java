package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.ht;
import com.tencent.mm.c.a.hu;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.c.e;

final class ic extends com.tencent.mm.sdk.c.g
{
  ic(hd paramhd)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if ((parame != null) && ((parame instanceof ht)))
    {
      ht localht = (ht)parame;
      if (localht.cMr != null)
      {
        String str = localht.cMr.cDa;
        com.tencent.mm.pluginsdk.g.axR().lC(str);
      }
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ic
 * JD-Core Version:    0.6.2
 */