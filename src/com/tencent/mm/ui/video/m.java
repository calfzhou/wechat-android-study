package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.Window;
import android.widget.ImageButton;
import com.tencent.mm.sdk.platformtools.ay;

final class m
  implements MediaPlayer.OnCompletionListener
{
  m(VideoPlayerUI paramVideoPlayerUI)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    VideoPlayerUI.b(this.jZr).setVisibility(0);
    VideoPlayerUI.i(this.jZr).aNu();
    this.jZr.getWindow().clearFlags(1024);
    this.jZr.aPQ();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.m
 * JD-Core Version:    0.6.2
 */