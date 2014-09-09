package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;

final class l
  implements MediaPlayer.OnPreparedListener
{
  l(VideoPlayerUI paramVideoPlayerUI)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    z.d("!44@/B4Tb64lLpKQpS0z/gOJ2bfBnybsu7j7FckA+6xANiE=", k.nK() + " onPrepared");
    z.d("!44@/B4Tb64lLpKQpS0z/gOJ2bfBnybsu7j7FckA+6xANiE=", k.nK() + " onPrepared");
    VideoPlayerUI.a(this.jZr);
    VideoPlayerUI.b(this.jZr).setVisibility(8);
    VideoPlayerUI.f(this.jZr).setText(ap.eY(VideoPlayerUI.e(this.jZr)));
    VideoPlayerUI.h(this.jZr).setText(ap.Z(VideoPlayerUI.g(this.jZr)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.l
 * JD-Core Version:    0.6.2
 */