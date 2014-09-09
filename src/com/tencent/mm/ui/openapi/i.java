package com.tencent.mm.ui.openapi;

import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.aq.a;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;

final class i
  implements f
{
  i(AppProfileUI paramAppProfileUI)
  {
  }

  public final String aXc()
  {
    return l.d(this.jKc.aPI(), AppProfileUI.a(this.jKc));
  }

  public final Bitmap aXd()
  {
    return l.b(AppProfileUI.a(this.jKc).field_appId, 1, a.getDensity(this.jKc));
  }

  public final String aXf()
  {
    return l.e(this.jKc.aPI(), AppProfileUI.a(this.jKc));
  }

  public final String fR(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = n.cgu; ; i = n.cgA)
      return this.jKc.aPI().getString(i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.i
 * JD-Core Version:    0.6.2
 */