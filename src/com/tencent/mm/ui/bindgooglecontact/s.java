package com.tencent.mm.ui.bindgooglecontact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class s
  implements View.OnClickListener
{
  s(r paramr, p paramp)
  {
  }

  public final void onClick(View paramView)
  {
    z.d("!64@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92JmmhadCtsXjQrRrk90isnD", "onClick");
    if (p.a(this.jiF.jiD) != null)
    {
      q localq = p.a(this.jiF.jiD);
      int i = this.jiF.position;
      localq.qb(i);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.s
 * JD-Core Version:    0.6.2
 */