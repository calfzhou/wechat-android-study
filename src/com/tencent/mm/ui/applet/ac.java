package com.tencent.mm.ui.applet;

import android.app.Activity;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.ui.base.e;

final class ac
  implements az
{
  ac(ab paramab)
  {
  }

  public final boolean kJ()
  {
    if (!ab.a(this.iWm).isFinishing())
    {
      ab localab = this.iWm;
      Activity localActivity = ab.a(this.iWm);
      ab.a(this.iWm).getString(n.buo);
      ab.a(localab, e.a(localActivity, ab.a(this.iWm).getString(n.buA), true, new ad(this)));
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.ac
 * JD-Core Version:    0.6.2
 */