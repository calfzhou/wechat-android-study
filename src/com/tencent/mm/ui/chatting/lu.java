package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.lm;
import com.tencent.mm.pluginsdk.al;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.fx;
import java.util.LinkedList;
import java.util.List;

final class lu
  implements fx
{
  lu(hd paramhd)
  {
  }

  public final void aTu()
  {
    LinkedList localLinkedList = g.aya().nP(this.jtA.jnf.getUsername());
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localLinkedList.size());
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "Click banner : %d", arrayOfObject);
    if (g.aya().nR(this.jtA.jnf.getUsername()))
    {
      hd.af(this.jtA);
      return;
    }
    this.jtA.ft(true);
  }

  public final void aTv()
  {
    lm locallm = new lm();
    locallm.cOG.cOJ = true;
    a.aGB().g(locallm);
    hd.b(this.jtA, this.jtA.jnf.getUsername());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.lu
 * JD-Core Version:    0.6.2
 */