package com.tencent.mm.ui;

import com.tencent.mm.c.a.ew;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.am;

final class au extends g
{
  au(LauncherUI paramLauncherUI)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if ((parame instanceof ew))
    {
      LauncherUI.a(this.iKj, true);
      am.o(LauncherUI.p(this.iKj));
      am.h(LauncherUI.p(this.iKj));
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.au
 * JD-Core Version:    0.6.2
 */