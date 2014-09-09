package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.y;
import com.tencent.mm.c.a.z;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.i;

final class jo extends g
{
  jo(hd paramhd)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if ((parame instanceof y))
    {
      y localy = (y)parame;
      if ((this.jtA.jnf != null) && (!ch.jb(localy.cHC.username)) && (localy.cHC.username.equals(this.jtA.jnf.getUsername())))
        hd.i(this.jtA);
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jo
 * JD-Core Version:    0.6.2
 */