package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.TimerTask;

final class bm extends TimerTask
{
  public final void run()
  {
    z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "in timer task run");
    Message localMessage = new Message();
    if (CropImageView.j(this.jQc))
      localMessage.what = 4659;
    while (true)
    {
      CropImageView.l(this.jQc).sendMessage(localMessage);
      return;
      if (CropImageView.k(this.jQc))
        localMessage.what = 4658;
      else
        localMessage.what = 4660;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bm
 * JD-Core Version:    0.6.2
 */