package com.tencent.mm.sandbox.monitor;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import com.tencent.mm.sandbox.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class ExceptionMonitorService extends Service
{
  public static long dmn = 0L;
  public static int iBf = 0;
  private static ExceptionMonitorService iBj = null;
  private long iBg = 300000L;
  private cm iBh = new cm();
  private Runnable iBi = new f(this);

  private void a(Intent paramIntent)
  {
    if (paramIntent == null)
      return;
    this.iBh.removeCallbacks(this.iBi);
    this.iBh.postDelayed(this.iBi, this.iBg);
    String str1 = paramIntent.getAction();
    z.d("!44@/B4Tb64lLpIdghwcJC06L5mX8ZGnQwd6K21Nn76yszs=", "dkcrash handleCommand action:" + str1);
    String str2 = paramIntent.getStringExtra("tag");
    if (str2 == null)
      str2 = "exception";
    int i = paramIntent.getIntExtra("exceptionPid", 0);
    if (i == iBf)
      str2 = "axception";
    iBf = i;
    long l = paramIntent.getLongExtra("exceptionTime", SystemClock.elapsedRealtime());
    if (l - dmn < 3000L);
    for (String str3 = "axception"; ; str3 = str2)
    {
      dmn = l;
      String str4 = paramIntent.getStringExtra("exceptionMsg");
      String str5 = paramIntent.getStringExtra("userName");
      z.d("!44@/B4Tb64lLpIdghwcJC06L5mX8ZGnQwd6K21Nn76yszs=", "dkcrash handleCommand. action=" + str1 + " pid:" + i + " tag=" + str3 + ", userName=" + str5 + ", message" + str4);
      if ((ch.jb(str4)) || (a.a(str5, new e(str5, str3, ch.CL(), str4)) != 0))
        break;
      bq(this);
      return;
    }
  }

  public static void bq(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, CrashUploadAlarmReceiver.class);
    if (PendingIntent.getBroadcast(paramContext, 0, localIntent, 536870912) == null)
    {
      PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, localIntent, 0);
      AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
      long l = 1800000L + ch.CM();
      localAlarmManager.set(0, l, localPendingIntent);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localPendingIntent.hashCode());
      arrayOfObject[1] = Long.valueOf(l);
      z.d("!44@/B4Tb64lLpIdghwcJC06L5mX8ZGnQwd6K21Nn76yszs=", "dkcrash startAlarmMgr pendingIntent:%d %d", arrayOfObject);
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    iBj = this;
    d.f(hashCode(), this);
    this.iBh.postDelayed(this.iBi, this.iBg);
  }

  public void onDestroy()
  {
    super.onDestroy();
    iBj = null;
    d.g(hashCode(), this);
    this.iBh.removeCallbacks(this.iBi);
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    super.onStart(paramIntent, paramInt);
    a(paramIntent);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a(paramIntent);
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.ExceptionMonitorService
 * JD-Core Version:    0.6.2
 */