package com.tencent.mm.ui.base;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.sdk.platformtools.z;

final class gc
  implements MediaPlayer.OnErrorListener
{
  gc(VideoView paramVideoView)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    z.d("!32@/B4Tb64lLpI0gAQi2o+bKagiX16xHWF7", "Error: " + paramInt1 + "," + paramInt2);
    if ((VideoView.o(this.jgc) != null) && (VideoView.o(this.jgc).onError(VideoView.e(this.jgc), paramInt1, paramInt2)))
      return true;
    this.jgc.getWindowToken();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.gc
 * JD-Core Version:    0.6.2
 */