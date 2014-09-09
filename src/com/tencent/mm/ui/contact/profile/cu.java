package com.tencent.mm.ui.contact.profile;

import com.tencent.mm.h;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;

final class cu
  implements cl
{
  cu(cr paramcr)
  {
  }

  public final void a(cg paramcg)
  {
    if (!this.jED.jEB)
      paramcg.n(1, n.bCf, h.Yg);
    if (!this.jED.jEC)
    {
      if (!NormalUserFooterPreference.a(this.jED.jEy.jEw).xI())
        break label65;
      paramcg.n(8, n.bCk, h.XD);
    }
    label65: 
    while (y.df(NormalUserFooterPreference.a(this.jED.jEy.jEw).getUsername()))
      return;
    paramcg.n(5, n.bCi, h.XD);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cu
 * JD-Core Version:    0.6.2
 */