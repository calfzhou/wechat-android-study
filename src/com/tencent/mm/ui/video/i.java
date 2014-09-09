package com.tencent.mm.ui.video;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

final class i
  implements View.OnClickListener
{
  i(VideoPlayerUI paramVideoPlayerUI)
  {
  }

  public final void onClick(View paramView)
  {
    VideoPlayerUI.a(this.jZr);
    VideoPlayerUI.b(this.jZr).setVisibility(8);
    this.jZr.getWindow().setFlags(1024, 1024);
    this.jZr.aPP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.i
 * JD-Core Version:    0.6.2
 */