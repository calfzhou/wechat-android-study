package com.tencent.mm.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

final class ee
  implements Runnable
{
  ee(ed paramed)
  {
  }

  public final void run()
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(j.ims, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    ed.c(this.iNn).sendBroadcast(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ee
 * JD-Core Version:    0.6.2
 */