package com.tencent.mm.ui;

import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.chatting.hd;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class ax
  implements Runnable
{
  ax(aw paramaw)
  {
  }

  public final void run()
  {
    z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "klem animationEnd");
    bg.qQ().aHq();
    LauncherUI.r(this.iKm.iKl.iKj).bbb();
    LauncherUI.e(this.iKm.iKl.iKj).fo(true);
    LauncherUI.e(this.iKm.iKl.iKj).fp(false);
  }

  public final String toString()
  {
    return super.toString() + "|chattingView|onAnimationEnd";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ax
 * JD-Core Version:    0.6.2
 */