package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.sdk.platformtools.z;

final class d
  implements MediaPlayer.OnPreparedListener
{
  d(ShortVideoPlayerUI paramShortVideoPlayerUI)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mCr1JvrFEaSDDrj8vIAwCCM=", k.nK() + " onPrepared");
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mCr1JvrFEaSDDrj8vIAwCCM=", k.nK() + " onPrepared");
    ShortVideoPlayerUI.c(this.jZl);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.d
 * JD-Core Version:    0.6.2
 */