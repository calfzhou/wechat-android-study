package com.tencent.mm.plugin.voicereminder.a;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class g
  implements MediaPlayer.OnCompletionListener
{
  g(f paramf)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    try
    {
      paramMediaPlayer.release();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.g
 * JD-Core Version:    0.6.2
 */