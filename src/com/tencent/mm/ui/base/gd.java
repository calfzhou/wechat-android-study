package com.tencent.mm.ui.base;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;

final class gd
  implements MediaPlayer.OnBufferingUpdateListener
{
  gd(VideoView paramVideoView)
  {
  }

  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    VideoView.c(this.jgc, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.gd
 * JD-Core Version:    0.6.2
 */