package com.tencent.mm.booter;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.z;

public class MMReceivers$AlarmReceiver extends BroadcastReceiver
{
  public static void q(Context paramContext)
  {
    long l1 = af.aNs();
    z.d("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "bumper comes, next=" + l1);
    if (l1 > 1860000L)
      return;
    if (l1 < 30000L);
    for (long l2 = 30000L; ; l2 = l1)
    {
      z.w("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "reset bumper, interval=" + l2);
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
      if (localAlarmManager == null)
      {
        z.e("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "keep bumper failed, null am");
        return;
      }
      PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, 1, new Intent(paramContext, AlarmReceiver.class).putExtra("MMBoot_Bump", true), 268435456);
      localAlarmManager.set(0, l2 + System.currentTimeMillis(), localPendingIntent);
      return;
    }
  }

  public static void r(Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
      z.e("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "stop bumper failed, null am");
    PendingIntent localPendingIntent;
    do
    {
      return;
      localPendingIntent = PendingIntent.getBroadcast(paramContext, 1, new Intent(paramContext, AlarmReceiver.class).putExtra("MMBoot_Bump", true), 536870912);
    }
    while (localPendingIntent == null);
    localAlarmManager.cancel(localPendingIntent);
    localPendingIntent.cancel();
  }

  public static void s(Context paramContext)
  {
    z.w("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "keep awaker");
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
    {
      z.e("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "keep awaker failed, null am");
      return;
    }
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, new Intent(paramContext, AlarmReceiver.class), 268435456);
    localAlarmManager.setRepeating(0, 900000L + System.currentTimeMillis(), 900000L, localPendingIntent);
  }

  public static void t(Context paramContext)
  {
    z.w("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "stop awaker");
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
      z.e("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "keep awaker failed, null am");
    PendingIntent localPendingIntent;
    do
    {
      return;
      localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, new Intent(paramContext, AlarmReceiver.class), 536870912);
    }
    while (localPendingIntent == null);
    localAlarmManager.cancel(localPendingIntent);
    localPendingIntent.cancel();
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null));
    do
    {
      return;
      boolean bool = paramIntent.getBooleanExtra("MMBoot_Bump", false);
      z.i("!32@/B4Tb64lLpIvyjO6AwQ5uH77/zxuQ2vb", "[ALARM NOTIFICATION] bump:" + bool);
      if (bool)
      {
        q(paramContext);
        return;
      }
    }
    while (f.h(paramContext, "alarm"));
    t(paramContext);
    z.appenderFlush();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers.AlarmReceiver
 * JD-Core Version:    0.6.2
 */