package com.tencent.mm.ui.applet;

import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.ui.base.e;

final class z
  implements az
{
  z(y paramy)
  {
  }

  public final boolean kJ()
  {
    y localy = this.iWj;
    Context localContext = y.a(this.iWj);
    y.a(this.iWj).getString(n.buo);
    y.a(localy, e.a(localContext, y.a(this.iWj).getString(n.buA), true, new aa(this)));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.z
 * JD-Core Version:    0.6.2
 */