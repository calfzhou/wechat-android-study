package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ar;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class bl
  implements aq
{
  bl(FindMContactLearmMoreUI paramFindMContactLearmMoreUI)
  {
  }

  public final boolean rD()
  {
    FindMContactLearmMoreUI.a(this.jkM, a.aY(this.jkM));
    StringBuilder localStringBuilder = new StringBuilder("tigerreg mobileList size ");
    if (FindMContactLearmMoreUI.j(this.jkM) == null);
    for (int i = 0; ; i = FindMContactLearmMoreUI.j(this.jkM).size())
    {
      z.d("!56@/B4Tb64lLpIaEkywMHoqAF50wwoU6aq9UNpxJDP2H8v06EipWcMmmw==", i);
      return true;
    }
  }

  public final boolean rE()
  {
    if ((FindMContactLearmMoreUI.j(this.jkM) != null) && (FindMContactLearmMoreUI.j(this.jkM).size() != 0))
    {
      FindMContactLearmMoreUI.a(this.jkM, new ar(FindMContactLearmMoreUI.h(this.jkM), FindMContactLearmMoreUI.j(this.jkM)));
      bg.qX().d(FindMContactLearmMoreUI.k(this.jkM));
    }
    while (true)
    {
      return false;
      if (FindMContactLearmMoreUI.c(this.jkM) != null)
      {
        FindMContactLearmMoreUI.c(this.jkM).dismiss();
        FindMContactLearmMoreUI.d(this.jkM);
      }
      FindMContactLearmMoreUI.b(this.jkM);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bl
 * JD-Core Version:    0.6.2
 */