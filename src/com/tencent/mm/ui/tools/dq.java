package com.tencent.mm.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.VideoView;
import com.tencent.mm.ui.base.e;

final class dq
  implements MediaPlayer.OnErrorListener
{
  dq(dp paramdp)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    this.jTc.jSP.stopPlayback();
    this.jTc.gg(false);
    e.b(this.jTc.jRb.jQK, n.cnV, n.bzX);
    this.jTc.jRb.qU(this.jTc.iy);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dq
 * JD-Core Version:    0.6.2
 */