package com.tencent.mm.ui.base;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class gb
  implements MediaPlayer.OnCompletionListener
{
  gb(VideoView paramVideoView)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    if (VideoView.n(this.jgc) != null)
      VideoView.n(this.jgc).onCompletion(VideoView.e(this.jgc));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.gb
 * JD-Core Version:    0.6.2
 */