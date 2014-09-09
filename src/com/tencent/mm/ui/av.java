package com.tencent.mm.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.mm.b;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.base.fn;
import com.tencent.mm.ui.chatting.hd;

final class av
  implements fn
{
  av(LauncherUI paramLauncherUI)
  {
  }

  public final void aPy()
  {
    if (LauncherUI.q(this.iKj) == null)
    {
      LauncherUI.a(this.iKj, AnimationUtils.loadAnimation(this.iKj, b.Mz));
      LauncherUI.q(this.iKj).setAnimationListener(new aw(this));
    }
    LauncherUI.e(this.iKj).getView().startAnimation(LauncherUI.q(this.iKj));
    LauncherUI.s(this.iKj).aTs();
    z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "klem CHATTING ONLAYOUT ");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.av
 * JD-Core Version:    0.6.2
 */