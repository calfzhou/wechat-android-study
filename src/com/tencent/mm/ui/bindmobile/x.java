package com.tencent.mm.ui.bindmobile;

import com.tencent.mm.n;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;

final class x
  implements cl
{
  x(w paramw)
  {
  }

  public final void a(cg paramcg)
  {
    paramcg.setHeaderTitle(n.bwx);
    if ((0x2 & this.jkf.jke) != 0)
      paramcg.bf(0, n.bwJ);
    if ((0x1 & this.jkf.jke) != 0)
      paramcg.bf(1, n.bwi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.x
 * JD-Core Version:    0.6.2
 */