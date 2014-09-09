package com.tencent.mm.ui.chatting;

import android.view.View;
import java.util.List;

final class ba
  implements Runnable
{
  ba(az paramaz)
  {
  }

  public final void run()
  {
    if (this.jnC.targetView != null)
    {
      this.jnC.targetView.clearAnimation();
      ChattingAnimFrame localChattingAnimFrame = this.jnC.jnB;
      View localView = this.jnC.targetView;
      localChattingAnimFrame.jnA.remove(localView);
      localChattingAnimFrame.removeView(localView);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ba
 * JD-Core Version:    0.6.2
 */