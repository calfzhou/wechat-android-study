package com.tencent.mm.sandbox.updater;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.tencent.mm.sandbox.d;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

public class UpdaterService extends Service
{
  private static UpdaterService iCL = null;
  private static final long iCN = 3600000L;
  private ar iCM;
  private boolean iCO = false;
  private ay iCP = new ay(new av(this), true);
  private aw iCQ = null;

  private void a(Intent paramIntent)
  {
    if (this.iCM.r(paramIntent))
      this.iCM.Oj();
  }

  public static void aMV()
  {
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC91DVMPhfLHr7", "UpdaterService stopInstance()");
    if (iCL != null)
      iCL.stopSelf();
  }

  public static UpdaterService aMW()
  {
    return iCL;
  }

  final void el(boolean paramBoolean)
  {
    if (this.iCM != null)
      this.iCM.ee(paramBoolean);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC91DVMPhfLHr7", "onCreate");
    d.f(hashCode(), this);
    iCL = this;
    this.iCM = au.iCK;
    MMActivity.cg(this);
    this.iCP.cP(iCN);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    this.iCQ = new aw();
    registerReceiver(this.iCQ, localIntentFilter);
  }

  public void onDestroy()
  {
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC91DVMPhfLHr7", "onDestroy");
    if (this.iCQ != null)
      unregisterReceiver(this.iCQ);
    if (this.iCO)
      stopForeground(true);
    if (!this.iCM.QQ())
    {
      this.iCM.reset();
      this.iCM.s(1, true);
    }
    iCL = null;
    d.g(hashCode(), this);
    super.onDestroy();
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC91DVMPhfLHr7", "onStart intent = %s", new Object[] { paramIntent });
    a(paramIntent);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC91DVMPhfLHr7", "onStartCommand intent = %s", new Object[] { paramIntent });
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("intent_extra_run_in_foreground", false)))
    {
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC91DVMPhfLHr7", "runServiceInForground");
      Notification localNotification = new Notification(0, "updater service running forground", System.currentTimeMillis());
      localNotification.setLatestEventInfo(this, "Updater Service", "updater service running forground", PendingIntent.getService(this, 0, new Intent(), 0));
      startForeground(0, localNotification);
      this.iCO = true;
    }
    a(paramIntent);
    return 2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.UpdaterService
 * JD-Core Version:    0.6.2
 */