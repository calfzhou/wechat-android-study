package com.tencent.mm.ui.contact.profile;

import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.q.a;
import com.tencent.mm.q.e;
import com.tencent.mm.q.f;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;

final class s
  implements cl
{
  s(i parami)
  {
  }

  public final void a(cg paramcg)
  {
    if ((i.e(this.jDl) == null) || (i.e(this.jDl).uw() == null) || (!i.e(this.jDl).uw().uE()))
      paramcg.n(1, n.bCU, h.Yi);
    if ((i.f(this.jDl) != null) && (i.f(this.jDl).uh()))
    {
      paramcg.n(3, n.bxB, h.Yh);
      return;
    }
    paramcg.n(2, n.bBe, h.XJ);
    paramcg.n(3, n.bxB, h.Yh);
    paramcg.bf(4, n.bBa);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.s
 * JD-Core Version:    0.6.2
 */