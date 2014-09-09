package com.tencent.mm.n;

import com.tencent.mm.as.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class ae
  implements az
{
  private Runnable dnY;

  protected final void c(Runnable paramRunnable)
  {
    this.dnY = paramRunnable;
  }

  public final boolean kJ()
  {
    int i = ac.sE().size();
    z.e("!44@/B4Tb64lLpL9JUbX1ob74qAfZL+ykyejL1dU3VOu4gg=", "RemoveOldAvatar left count:" + i);
    if ((i <= 2000) || (ac.sF() >= 300))
    {
      if (this.dnY != null)
        this.dnY.run();
      ac.sG();
      return false;
    }
    long l = bg.qW().oO().dc(Thread.currentThread().getId());
    for (int j = i - 1; j >= i - 30; j--)
    {
      ac.sH();
      String str = (String)ac.sE().get(j);
      ac.sE().remove(j);
      af.sh().h(str, false);
      af.sh().h(str, true);
      af.sJ().fh(str);
    }
    bg.qW().oO().dd(l);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.ae
 * JD-Core Version:    0.6.2
 */