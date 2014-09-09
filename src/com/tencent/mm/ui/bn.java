package com.tencent.mm.ui;

import android.view.View;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;

final class bn extends g
{
  bn(LauncherUI paramLauncherUI)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (LauncherUI.j(this.iKj) != null)
      LauncherUI.j(this.iKj).post(new bo(this));
    this.iKj.aPe();
    LauncherUI.l(this.iKj);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bn
 * JD-Core Version:    0.6.2
 */