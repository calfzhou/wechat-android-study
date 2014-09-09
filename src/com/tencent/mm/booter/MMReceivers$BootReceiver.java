package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class MMReceivers$BootReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null);
    do
    {
      return;
      new StringBuilder("system booted, pid=").append(Process.myPid());
    }
    while (f.h(paramContext, "auto"));
    MMReceivers.AlarmReceiver.t(paramContext);
    z.appenderFlush();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers.BootReceiver
 * JD-Core Version:    0.6.2
 */