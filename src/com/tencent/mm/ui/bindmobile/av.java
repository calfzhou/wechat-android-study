package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ar;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class av
  implements aq
{
  av(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final boolean rD()
  {
    FindMContactAlertUI.a(this.jkD, a.aY(this.jkD));
    StringBuilder localStringBuilder = new StringBuilder("tigerreg mobileList size ");
    if (FindMContactAlertUI.k(this.jkD) == null);
    for (int i = 0; ; i = FindMContactAlertUI.k(this.jkD).size())
    {
      z.d("!44@/B4Tb64lLpIaEkywMHoqABQUhRrFI+cbSM7Lgi4eEq8=", i);
      return true;
    }
  }

  public final boolean rE()
  {
    if ((FindMContactAlertUI.k(this.jkD) != null) && (FindMContactAlertUI.k(this.jkD).size() != 0))
    {
      FindMContactAlertUI.a(this.jkD, new ar(FindMContactAlertUI.a(this.jkD), FindMContactAlertUI.k(this.jkD)));
      bg.qX().d(FindMContactAlertUI.l(this.jkD));
    }
    while (true)
    {
      return false;
      if (FindMContactAlertUI.f(this.jkD) != null)
      {
        FindMContactAlertUI.f(this.jkD).dismiss();
        FindMContactAlertUI.g(this.jkD);
      }
      FindMContactAlertUI.d(this.jkD);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.av
 * JD-Core Version:    0.6.2
 */