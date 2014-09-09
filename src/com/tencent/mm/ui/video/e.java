package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class e
  implements MediaPlayer.OnCompletionListener
{
  e(ShortVideoPlayerUI paramShortVideoPlayerUI)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mCr1JvrFEaSDDrj8vIAwCCM=", "on completion");
    new cm().post(new f(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.e
 * JD-Core Version:    0.6.2
 */