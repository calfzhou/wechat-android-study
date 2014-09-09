package com.tencent.mm.ui.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.VideoView;

final class k
  implements View.OnClickListener
{
  k(VideoPlayerUI paramVideoPlayerUI)
  {
  }

  public final void onClick(View paramView)
  {
    z.v("check", "onclick");
    if (VideoPlayerUI.c(this.jZr).isPlaying())
      VideoPlayerUI.d(this.jZr);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.k
 * JD-Core Version:    0.6.2
 */