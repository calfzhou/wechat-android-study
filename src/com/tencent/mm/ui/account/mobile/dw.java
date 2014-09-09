package com.tencent.mm.ui.account.mobile;

import com.tencent.mm.n;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;
import com.tencent.mm.z.b;

final class dw
  implements cl
{
  dw(dv paramdv)
  {
  }

  public final void a(cg paramcg)
  {
    paramcg.a(0, this.iVx.iVq.getString(n.bST));
    boolean bool = b.gX(this.iVx.iVq.cTZ);
    if (bool)
      paramcg.a(1, this.iVx.iVq.getString(n.bwY));
    if (MobileVerifyUI.f(this.iVx.iVq) == 2)
    {
      if (this.iVx.iVq.iVm)
        paramcg.a(2, this.iVx.iVq.getString(n.bYG));
      if (bool)
      {
        if (this.iVx.iVq.iVl)
          paramcg.a(3, this.iVx.iVq.getString(n.bSE));
        paramcg.a(4, this.iVx.iVq.getString(n.bYk));
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.dw
 * JD-Core Version:    0.6.2
 */