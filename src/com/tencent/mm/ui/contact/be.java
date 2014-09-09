package com.tencent.mm.ui.contact;

import com.tencent.mm.am.a;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;

final class be
  implements cl
{
  be(bd parambd)
  {
  }

  public final void a(cg paramcg)
  {
    if (!ContactRemarkImagePreviewUI.a(this.jyL.jyK))
      paramcg.a(0, this.jyL.jyK.getString(n.bsS));
    paramcg.a(1, this.jyL.jyK.getString(n.cca));
    if (a.to("favorite"))
      paramcg.a(2, this.jyL.jyK.getString(n.bUO));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.be
 * JD-Core Version:    0.6.2
 */