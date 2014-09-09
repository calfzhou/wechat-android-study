package com.tencent.mm.ui.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.VideoView;

final class b
  implements View.OnClickListener
{
  b(ShortVideoPlayerUI paramShortVideoPlayerUI)
  {
  }

  public final void onClick(View paramView)
  {
    z.v("check", "onclick");
    if (ShortVideoPlayerUI.a(this.jZl).isPlaying())
      ShortVideoPlayerUI.b(this.jZl);
    new cm().post(new c(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.b
 * JD-Core Version:    0.6.2
 */