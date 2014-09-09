package com.tencent.mm.ui.base;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class ga
  implements MediaPlayer.OnPreparedListener
{
  ga(VideoView paramVideoView)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    VideoView.c(this.jgc);
    if (VideoView.d(this.jgc) != null)
      VideoView.d(this.jgc).onPrepared(VideoView.e(this.jgc));
    VideoView.a(this.jgc, paramMediaPlayer.getVideoWidth());
    VideoView.b(this.jgc, paramMediaPlayer.getVideoHeight());
    this.jgc.aTx();
    if ((VideoView.a(this.jgc) != 0) && (VideoView.b(this.jgc) != 0))
    {
      if (VideoView.f(this.jgc))
      {
        VideoView.e(this.jgc).start();
        VideoView.g(this.jgc);
      }
      if ((VideoView.h(this.jgc) == VideoView.a(this.jgc)) && (VideoView.i(this.jgc) == VideoView.b(this.jgc)))
      {
        if (VideoView.j(this.jgc) != 0)
        {
          VideoView.e(this.jgc).seekTo(VideoView.j(this.jgc));
          VideoView.k(this.jgc);
        }
        if ((VideoView.f(this.jgc)) || (this.jgc.isPlaying()) || (VideoView.j(this.jgc) != 0) || (this.jgc.getCurrentPosition() <= 0));
      }
    }
    while (true)
    {
      if ((VideoView.e(this.jgc).isPlaying()) && (VideoView.l(this.jgc) != null))
      {
        VideoView.l(this.jgc);
        VideoView.m(this.jgc);
      }
      return;
      if (VideoView.j(this.jgc) != 0)
      {
        VideoView.e(this.jgc).seekTo(VideoView.j(this.jgc));
        VideoView.k(this.jgc);
      }
      if (VideoView.f(this.jgc))
      {
        VideoView.e(this.jgc).start();
        VideoView.g(this.jgc);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ga
 * JD-Core Version:    0.6.2
 */