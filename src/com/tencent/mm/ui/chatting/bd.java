package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.if;
import com.tencent.mm.model.bw;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.base.cr;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

final class bd
  implements br
{
  private Set jnN;
  private cr jnO;
  private gm jnP;

  public bd(Set paramSet, cr paramcr, gm paramgm)
  {
    this.jnN = paramSet;
    this.jnO = paramcr;
    this.jnP = paramgm;
  }

  public final boolean rD()
  {
    Set localSet = this.jnN;
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      Long localLong = (Long)localIterator.next();
      localLinkedList.add(localLong);
      if localif = new if();
      localif.cMG.type = 3;
      localif.cMG.cDM = localLong.longValue();
      a.aGB().g(localif);
    }
    bw.f(localLinkedList);
    return true;
  }

  public final boolean rE()
  {
    if (this.jnO != null)
    {
      this.jnO.dismiss();
      if (this.jnP != null)
        this.jnP.aVe();
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bd
 * JD-Core Version:    0.6.2
 */