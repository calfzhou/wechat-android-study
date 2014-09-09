package com.tencent.mm.pluginsdk.ui.musicplayer;

import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;

final class l
  implements Runnable
{
  l(MusicPlayerUI paramMusicPlayerUI)
  {
  }

  public final void run()
  {
    this.hGL.aCZ();
    bg.ii().a(MusicPlayerUI.b(this.hGL));
    if (this.hGL.ajV())
    {
      bg.ii().a(this.hGL.ajO(), this.hGL.getAppId(), this.hGL.aDd());
      return;
    }
    bg.ii().lf();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.l
 * JD-Core Version:    0.6.2
 */