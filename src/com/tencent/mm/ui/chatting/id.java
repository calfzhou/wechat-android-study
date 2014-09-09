package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.lv;
import com.tencent.mm.c.a.lw;
import com.tencent.mm.n;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.storage.i;

final class id extends g
{
  id(hd paramhd)
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if (((parame instanceof lv)) && (!this.jtA.jnf.getUsername().equals(((lv)parame).cOS.cDi)));
    while (!this.jtA.jnf.getUsername().toLowerCase().endsWith("@chatroom"))
      return false;
    com.tencent.mm.ui.base.e.o(this.jtA.agh(), this.jtA.getString(n.cmv), null);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.id
 * JD-Core Version:    0.6.2
 */