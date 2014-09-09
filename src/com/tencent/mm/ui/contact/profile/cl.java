package com.tencent.mm.ui.contact.profile;

import android.content.res.Resources;
import com.tencent.mm.am.a;
import com.tencent.mm.h;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.MMActivity;

final class cl
  implements com.tencent.mm.ui.base.cl
{
  cl(cg paramcg)
  {
  }

  public final void a(com.tencent.mm.ui.base.cg paramcg)
  {
    paramcg.n(1, n.bCf, h.Yg);
    String str1;
    if (NormalUserFooterPreference.a(this.jEz.jEy.jEw).zV())
    {
      str1 = NormalUserFooterPreference.b(this.jEz.jEy.jEw).getResources().getString(n.bDl);
      paramcg.a(2, str1, h.Yl);
      if ((a.to("sns")) && ((0x8000 & x.pO()) == 0))
        paramcg.n(3, n.bCn, h.XT);
      paramcg.n(4, n.bCV, h.Yi);
      if (!NormalUserFooterPreference.a(this.jEz.jEy.jEw).xI())
        break label206;
    }
    label206: for (String str2 = NormalUserFooterPreference.b(this.jEz.jEy.jEw).getString(n.bCk); ; str2 = NormalUserFooterPreference.b(this.jEz.jEy.jEw).getString(n.bCi))
    {
      paramcg.a(5, str2, h.XD);
      paramcg.n(6, n.bwj, h.XJ);
      paramcg.bf(7, n.bBa);
      return;
      str1 = NormalUserFooterPreference.b(this.jEz.jEy.jEw).getResources().getString(n.bBA);
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cl
 * JD-Core Version:    0.6.2
 */