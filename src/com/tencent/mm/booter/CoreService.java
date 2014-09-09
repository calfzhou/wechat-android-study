package com.tencent.mm.booter;

import android.app.Notification;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import com.jg.JgMethodChecked;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.jni.platformcomm.Alarm;
import com.tencent.mm.jni.platformcomm.PlatformComm;
import com.tencent.mm.jni.platformcomm.WakerLock;
import com.tencent.mm.jni.platformcomm.f;
import com.tencent.mm.modelfriend.AddrBookObserver;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.modelstat.l;
import com.tencent.mm.network.ao;
import com.tencent.mm.network.bg;
import com.tencent.mm.network.bh;
import com.tencent.mm.network.bi;
import com.tencent.mm.network.bk;
import com.tencent.mm.network.bl;
import com.tencent.mm.network.bm;
import com.tencent.mm.network.bn;
import com.tencent.mm.platformtools.k;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class CoreService extends Service
  implements f, com.tencent.mm.network.af, bl
{
  private l dhA = null;
  private AddrBookObserver dhB;
  private WatchDogPushReceiver dhC;
  private WakerLock dhD = null;
  private k dhE = new k();
  private ay dhF = new ay(new e(this), false);
  private ao dht;
  private ab dhw = new ab();
  private boolean dhx = true;
  public final int dhy = -1213;
  private final ah dhz = new d(this);

  private void kM()
  {
    z.w("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "[COMPLETE EXIT]");
    bk.Dp().d(3, 10000, "");
    bg.onDestroy();
    try
    {
      MMReceivers.AlarmReceiver.t(getApplicationContext());
      MMReceivers.AlarmReceiver.r(getApplicationContext());
      Alarm.Z(getApplicationContext());
      label43: z.appenderClose();
      Process.killProcess(Process.myPid());
      return;
    }
    catch (Exception localException)
    {
      break label43;
    }
  }

  public final void I(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      z.w("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "[NETWORK LOST]");
      bk.Dk().dUk = false;
      bk.Dl().et(0);
      bk.Dj().a(10502, "", null);
      this.dhx = false;
      return;
    }
    z.w("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "[NETWORK CONNECTED]");
    bk.Dk().dUk = true;
    boolean bool = this.dhw.lv();
    if ((this.dhx) && (!bool))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(this.dhx);
      z.i("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "network not change or can't get network info, lastStatus connect:%b", arrayOfObject);
      return;
    }
    if (bool)
      bk.Do().CV();
    this.dhx = true;
    bk.Dl().et(1);
    bk.Dj().a(10501, "", null);
    if (this.dhD == null)
      this.dhD = new WakerLock(getApplicationContext());
    if (!this.dhD.isLocking())
      this.dhD.lock(14000L);
    z.i("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "checking ready, start in 7000ms");
    this.dhF.cP(7000L);
  }

  public final boolean a(int paramInt, byte[] paramArrayOfByte)
  {
    if (getSharedPreferences("system_config_prefs", m.nN()).getBoolean("settings_fully_exit", true))
    {
      z.i("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "fully exited, no need to notify worker");
      return false;
    }
    Intent localIntent = new Intent(this, NotifyReceiver.class);
    localIntent.putExtra("notify_option_type", 2);
    localIntent.putExtra("notify_uin", this.dht.Da().oD());
    localIntent.putExtra("notify_respType", paramInt);
    localIntent.putExtra("notify_respBuf", paramArrayOfByte);
    localIntent.putExtra("notfiy_recv_time", ch.CM());
    localIntent.putExtra("notify_skey", this.dht.Da().qL());
    z.i("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "notify broadcast:" + localIntent.getAction() + ", type=" + paramInt);
    try
    {
      sendBroadcast(localIntent);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.toString();
        z.f("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "onNotify hasDestroyed %s", arrayOfObject);
      }
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "onBind~~~ threadID:" + Thread.currentThread());
    return this.dht;
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public void onCreate()
  {
    z.d("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "onCreate~~~threadID:" + Thread.currentThread());
    super.onCreate();
    if (Build.VERSION.SDK_INT < 18)
      startForeground(-1213, new Notification());
    cm localcm = new cm(Looper.getMainLooper());
    PlatformComm.a(ak.getContext(), localcm);
    g localg = new g(this);
    localg.kO();
    com.tencent.mm.sdk.platformtools.af.a(this.dhz);
    if (PlatformComm.dQS == null)
      PlatformComm.dQS = this;
    bk.a(localcm);
    bk.setContext(getApplicationContext());
    bk.a(new bm());
    bk.a(new bn());
    bk.a(this);
    if (this.dhA == null)
      this.dhA = new l();
    bk.a(this.dhA);
    this.dht = bk.Do();
    if (this.dht == null)
    {
      z.i("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "autoAuth is null and new one");
      this.dht = new ao(bk.Dm());
      bk.e(this.dht);
    }
    while (true)
    {
      bg.onCreate();
      label228: String str5;
      String str6;
      String str7;
      ConnectivityManager localConnectivityManager;
      if (bk.Dp() == null)
      {
        z.i("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "NetTaskAdapter is null and new one");
        bk.a(new bi());
        if (bk.Dq() == null)
        {
          z.i("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "NetTaskAdapter is null and new one");
          bk.a(new bh());
          bk.Dq().dTW = this;
        }
        String str1 = localg.getString(".com.tencent.mm.debug.server.host.http");
        String str2 = localg.getString(".com.tencent.mm.debug.server.ports.http");
        String str3 = localg.getString(".com.tencent.mm.debug.server.host.socket");
        String str4 = localg.getString(".com.tencent.mm.debug.server.ports.socket");
        this.dht.c(str1, str2, str3, str4);
        str5 = localg.getString(".com.tencent.mm.debug.server.host.newdns");
        if ((str5 == null) || (!str5.contains(":")))
          break label526;
        String[] arrayOfString = str5.split(":");
        str6 = arrayOfString[0];
        str7 = arrayOfString[1];
        this.dht.setNewDnsDebugHost(str6, str7);
        MMReceivers.AlarmReceiver.t(getApplicationContext());
        MMReceivers.AlarmReceiver.s(getApplicationContext());
        localConnectivityManager = (ConnectivityManager)getSystemService("connectivity");
      }
      try
      {
        NetworkInfo localNetworkInfo2 = localConnectivityManager.getActiveNetworkInfo();
        localNetworkInfo1 = localNetworkInfo2;
        if ((localNetworkInfo1 == null) || (localNetworkInfo1.getState() != NetworkInfo.State.CONNECTED))
        {
          bk.Dk().dUk = false;
          bk.Dl().et(0);
          this.dhB = new AddrBookObserver(this);
          getContentResolver().registerContentObserver(com.tencent.mm.pluginsdk.a.axP(), true, this.dhB);
          this.dhC = new WatchDogPushReceiver();
          registerReceiver(this.dhC, new IntentFilter("com.tencent.mm.WatchDogPushReceiver"));
          return;
          z.w("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "autoAuth is not null and reset");
          this.dht.reset();
          continue;
          z.w("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "NetTaskAdapter is not null and reset");
          bk.Dp().reset();
          break label228;
          label526: str6 = str5;
          str7 = null;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          z.e("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "getActiveNetworkInfo failed.");
          NetworkInfo localNetworkInfo1 = null;
          continue;
          bk.Dk().dUk = true;
          bk.Dl().et(1);
        }
      }
    }
  }

  public void onDestroy()
  {
    z.d("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "onDestroy~~~ threadID:" + Thread.currentThread());
    this.dhA.a(10002, null, null);
    getContentResolver().unregisterContentObserver(this.dhB);
    unregisterReceiver(this.dhC);
    super.onDestroy();
    kM();
  }

  public void onRebind(Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "onRebind~~~ threadID:" + Thread.currentThread());
    super.onRebind(paramIntent);
  }

  public boolean onUnbind(Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "onUnbind~~~ threadID:" + Thread.currentThread());
    bk.Dk().a(null);
    return super.onUnbind(paramIntent);
  }

  public final void restartProcess()
  {
    z.w("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "restartProcess");
    kM();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.CoreService
 * JD-Core Version:    0.6.2
 */