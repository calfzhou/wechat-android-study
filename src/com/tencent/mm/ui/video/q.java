package com.tencent.mm.ui.video;

import android.widget.TextView;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.VideoView;

final class q
  implements az
{
  q(VideoPlayerUI paramVideoPlayerUI)
  {
  }

  public final boolean kJ()
  {
    z.v("!44@/B4Tb64lLpKQpS0z/gOJ2bfBnybsu7j7FckA+6xANiE=", "video time left:" + ap.eY(VideoPlayerUI.c(this.jZr).aTA() / 1000));
    int i = VideoPlayerUI.c(this.jZr).aTA() / 1000;
    if (i > VideoPlayerUI.e(this.jZr))
      i = VideoPlayerUI.e(this.jZr);
    VideoPlayerUI.n(this.jZr).setText(ap.eY(i));
    return VideoPlayerUI.c(this.jZr).aTA() >= 1000;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.q
 * JD-Core Version:    0.6.2
 */