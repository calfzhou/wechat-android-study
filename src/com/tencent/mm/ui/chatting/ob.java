package com.tencent.mm.ui.chatting;

import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.tencent.mm.b;

final class ob
  implements Runnable
{
  ob(oa paramoa)
  {
  }

  public final void run()
  {
    ShortVideoRecorderView.n(this.jvT.jvS).setVisibility(8);
    ShortVideoRecorderView.n(this.jvT.jvS).startAnimation(AnimationUtils.loadAnimation(this.jvT.jvS.getContext(), b.Mw));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ob
 * JD-Core Version:    0.6.2
 */