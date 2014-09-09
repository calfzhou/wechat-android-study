package com.tencent.mm.sandbox.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;

public class CrashUploadAlarmReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    z.d("!56@/B4Tb64lLpJJjWiGupgZbTgJOrFYUi92xOSpOsVaRSFANpqJ8HM/ww==", "dkcrash AlarmReceiver.onReceive");
    if (a.aMs() == 0)
      ExceptionMonitorService.bq(paramContext);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.CrashUploadAlarmReceiver
 * JD-Core Version:    0.6.2
 */