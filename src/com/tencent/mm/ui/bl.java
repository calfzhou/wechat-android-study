package com.tencent.mm.ui;

import com.tencent.mm.model.cg;
import com.tencent.mm.network.n;
import com.tencent.mm.network.r;

final class bl
  implements cg
{
  bl(LauncherUI paramLauncherUI)
  {
  }

  public final void a(r paramr)
  {
    if ((paramr == null) || (paramr.tE() == null))
      return;
    paramr.tE().reset();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bl
 * JD-Core Version:    0.6.2
 */