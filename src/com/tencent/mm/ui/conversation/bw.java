package com.tencent.mm.ui.conversation;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class bw extends cm
{
  bw(aj paramaj)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if (aj.e(this.jGZ) != null)
    {
      aj.e(this.jGZ).clearCache();
      aj.e(this.jGZ).notifyDataSetChanged();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.bw
 * JD-Core Version:    0.6.2
 */