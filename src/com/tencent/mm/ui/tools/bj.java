package com.tencent.mm.ui.tools;

import android.os.Message;
import android.view.MotionEvent;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.TimerTask;

final class bj extends TimerTask
{
  bj(bi parambi, MotionEvent paramMotionEvent)
  {
  }

  public final void run()
  {
    if (CropImageView.z(this.jQe.jQc))
    {
      Message localMessage = new Message();
      localMessage.what = 4661;
      localMessage.obj = this.jQd;
      CropImageView.l(this.jQe.jQc).sendMessage(localMessage);
      CropImageView.c(this.jQe.jQc, false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bj
 * JD-Core Version:    0.6.2
 */