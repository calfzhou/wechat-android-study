package com.tencent.mm.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class dr
  implements MediaPlayer.OnCompletionListener
{
  dr(dp paramdp)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    this.jTc.jRb.jQK.gf(true);
    this.jTc.jRb.qU(this.jTc.iy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dr
 * JD-Core Version:    0.6.2
 */