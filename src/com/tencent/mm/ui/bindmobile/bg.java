package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import com.tencent.mm.modelfriend.ar;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class bg
  implements aq
{
  bg(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final boolean rD()
  {
    FindMContactIntroUI.a(this.jkI, a.aY(this.jkI));
    StringBuilder localStringBuilder = new StringBuilder("tigerreg mobileList size ");
    if (FindMContactIntroUI.k(this.jkI) == null);
    for (int i = 0; ; i = FindMContactIntroUI.k(this.jkI).size())
    {
      z.d("!44@/B4Tb64lLpIaEkywMHoqAGJMqdmq/35TqHlpNl+apC8=", i);
      return true;
    }
  }

  public final boolean rE()
  {
    if ((FindMContactIntroUI.k(this.jkI) != null) && (FindMContactIntroUI.k(this.jkI).size() != 0))
    {
      FindMContactIntroUI.a(this.jkI, new ar(FindMContactIntroUI.c(this.jkI), FindMContactIntroUI.k(this.jkI)));
      com.tencent.mm.model.bg.qX().d(FindMContactIntroUI.l(this.jkI));
    }
    while (true)
    {
      return false;
      if (FindMContactIntroUI.g(this.jkI) != null)
      {
        FindMContactIntroUI.g(this.jkI).dismiss();
        FindMContactIntroUI.h(this.jkI);
      }
      FindMContactIntroUI.b(this.jkI);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bg
 * JD-Core Version:    0.6.2
 */