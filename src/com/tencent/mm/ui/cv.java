package com.tencent.mm.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class cv
  implements az
{
  cv(MMAppMgr paramMMAppMgr)
  {
  }

  public final boolean kJ()
  {
    String str = ap.T(ak.getContext());
    if ((str != null) && (str.toLowerCase().startsWith(ak.getPackageName())))
    {
      z.d("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "onTimerExpired, top activity belongs to mm, skip kill tools");
      return false;
    }
    z.d("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "onTimerExpired, kill tools process");
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(j.ims, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
    ak.getContext().sendBroadcast(localIntent);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.cv
 * JD-Core Version:    0.6.2
 */