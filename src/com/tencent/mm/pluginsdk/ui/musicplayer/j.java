package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.cm;

final class j
  implements View.OnClickListener
{
  j(MusicPlayerUI paramMusicPlayerUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (p.hGO == this.hGL.hGA)
    {
      this.hGL.hGA = p.hGM;
      MusicPlayerUI localMusicPlayerUI = this.hGL;
      new cm(localMusicPlayerUI.getMainLooper()).post(new m(localMusicPlayerUI));
      return;
    }
    this.hGL.hGA = p.hGO;
    this.hGL.aCY();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.j
 * JD-Core Version:    0.6.2
 */