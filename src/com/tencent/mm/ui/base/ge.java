package com.tencent.mm.ui.base;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

final class ge
  implements SurfaceHolder.Callback
{
  ge(VideoView paramVideoView)
  {
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    VideoView.d(this.jgc, paramInt2);
    VideoView.e(this.jgc, paramInt3);
    if ((VideoView.e(this.jgc) != null) && (VideoView.p(this.jgc)) && (VideoView.a(this.jgc) == paramInt2) && (VideoView.b(this.jgc) == paramInt3))
    {
      if (VideoView.j(this.jgc) != 0)
      {
        VideoView.e(this.jgc).seekTo(VideoView.j(this.jgc));
        VideoView.k(this.jgc);
      }
      VideoView.e(this.jgc).start();
    }
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    VideoView.a(this.jgc, paramSurfaceHolder);
    VideoView.q(this.jgc);
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    VideoView.a(this.jgc, null);
    if (VideoView.e(this.jgc) != null)
    {
      VideoView.e(this.jgc).reset();
      VideoView.e(this.jgc).release();
      VideoView.r(this.jgc);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ge
 * JD-Core Version:    0.6.2
 */