package com.tencent.mm.ui.chatting;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.mm.ui.j;

final class iq
  implements Runnable
{
  iq(hd paramhd)
  {
  }

  public final void run()
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(j.ims, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    this.jtA.sendBroadcast(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.iq
 * JD-Core Version:    0.6.2
 */