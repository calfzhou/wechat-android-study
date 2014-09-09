package com.tencent.mm.ui.base;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import com.tencent.mm.sdk.platformtools.z;

final class fz
  implements MediaPlayer.OnVideoSizeChangedListener
{
  fz(VideoView paramVideoView)
  {
  }

  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    VideoView.a(this.jgc, paramMediaPlayer.getVideoWidth());
    VideoView.b(this.jgc, paramMediaPlayer.getVideoHeight());
    z.v("!32@/B4Tb64lLpI0gAQi2o+bKagiX16xHWF7", "on size change size:( " + VideoView.a(this.jgc) + " , " + VideoView.b(this.jgc) + " )");
    this.jgc.aTx();
    if (VideoView.a(this.jgc) != 0)
      VideoView.b(this.jgc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fz
 * JD-Core Version:    0.6.2
 */