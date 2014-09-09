package com.tencent.mm.booter.notification;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.booter.notification.a.f;
import com.tencent.mm.sdk.platformtools.z;

public class NotificationDeleteReceive extends BroadcastReceiver
{
  public static PendingIntent a(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, NotificationDeleteReceive.class);
    localIntent.putExtra("com.tencent.notification.id.key", paramInt);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!56@/B4Tb64lLpKR3MWtFvfaIAekODdD9J/RcHA/L9jjKKKq6MqTNTuiGw==", "set broadcast: %d", arrayOfObject);
    return PendingIntent.getBroadcast(paramContext, paramInt, localIntent, 134217728);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = -1;
    try
    {
      int j = paramIntent.getIntExtra("com.tencent.notification.id.key", -1);
      i = j;
      label14: Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.d("!56@/B4Tb64lLpKR3MWtFvfaIAekODdD9J/RcHA/L9jjKKKq6MqTNTuiGw==", "receive: %d", arrayOfObject);
      if (i < 0)
        return;
      f.lL().bT(i);
      return;
    }
    catch (Exception localException)
    {
      break label14;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.NotificationDeleteReceive
 * JD-Core Version:    0.6.2
 */