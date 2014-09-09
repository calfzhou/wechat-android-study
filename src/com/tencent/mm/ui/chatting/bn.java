package com.tencent.mm.ui.chatting;

import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.m;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;
import java.util.Iterator;
import java.util.List;

final class bn
  implements cl
{
  public final void a(cg paramcg)
  {
    paramcg.n(1193046, n.bSx, h.Tl);
    List localList = aa.uY().dk(25);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localList.size());
    z.d("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "get selected accept list, size %d", arrayOfObject);
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
      paramcg.add((String)localIterator.next());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bn
 * JD-Core Version:    0.6.2
 */