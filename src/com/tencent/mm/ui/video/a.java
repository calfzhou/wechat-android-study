package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.VideoView;
import com.tencent.mm.ui.base.e;

final class a
  implements MediaPlayer.OnErrorListener
{
  a(ShortVideoPlayerUI paramShortVideoPlayerUI)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    ShortVideoPlayerUI.a(this.jZl).stopPlayback();
    e.b(this.jZl, n.cnV, n.bzX);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.a
 * JD-Core Version:    0.6.2
 */