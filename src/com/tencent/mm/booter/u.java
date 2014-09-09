package com.tencent.mm.booter;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.mm.ab.o;
import com.tencent.mm.booter.notification.a.d;
import com.tencent.mm.booter.notification.a.h;
import com.tencent.mm.booter.notification.c;
import com.tencent.mm.model.az;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.t;
import com.tencent.mm.n;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.account.mobile.MobileVerifyUI;
import com.tencent.mm.ui.chatting.ChattingUI;
import java.util.Iterator;
import java.util.List;

public final class u
  implements com.tencent.mm.model.ar, az
{
  private String cEh;
  private String cJr;
  private com.tencent.mm.storage.ar cMM;
  private int cNS;
  private Context context = null;

  @SuppressLint({"HandlerLeak"})
  private cm diA = new v(this, Looper.getMainLooper());
  private final com.tencent.mm.sdk.c.g diB = new w(this);
  private final com.tencent.mm.sdk.c.g diC = new x(this);
  private String diq;
  private String dir;
  private String dis;
  private Intent dit;
  private int diu;
  private int div;
  private boolean diw;
  private long dix;
  private c diy = c.lE();
  private h diz;

  public u(Context paramContext)
  {
    this.context = paramContext;
    this.cEh = "";
    this.cJr = "";
    this.dis = "";
    this.diq = "";
    this.dix = 0L;
    this.diw = false;
    this.dit = null;
    this.diz = new h();
    o.a(this);
    t.a(this);
    com.tencent.mm.pluginsdk.g.axR();
    com.tencent.mm.plugin.base.stub.b.a(this);
    com.tencent.mm.sdk.c.a.aGB().a("SendMsgFailNotification", this.diC);
    com.tencent.mm.sdk.c.a.aGB().a("RevokeMsg", this.diB);
  }

  private void cancel()
  {
    this.diw = false;
    this.diy.cancel();
  }

  public final void a(com.tencent.mm.storage.ar paramar)
  {
    if (paramar.jK() == 1)
      return;
    this.cMM = paramar;
    this.diu = com.tencent.mm.booter.notification.a.a.c(paramar);
    this.cEh = paramar.kt();
    this.cJr = paramar.getContent();
    this.cNS = paramar.getType();
    this.dis = "";
    this.dit = null;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(paramar.kl());
    arrayOfObject[1] = Long.valueOf(Thread.currentThread().getId());
    arrayOfObject[2] = ch.aHN();
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "dknotify notifyRevorkMessage: %d %d [%s]", arrayOfObject);
    this.diA.sendEmptyMessageDelayed(1, 200L);
  }

  public final void a(String paramString1, String paramString2, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Integer.valueOf(paramInt);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "showPushContentNotification, pushContent = %s, fromUserName = %s, msgType = %d", arrayOfObject);
    Intent localIntent = new Intent(this.context, LauncherUI.class);
    localIntent.putExtra("nofification_type", "pushcontent_notification");
    localIntent.putExtra("Intro_Is_Muti_Talker", true);
    localIntent.putExtra("Main_FromUserName", paramString2);
    localIntent.putExtra("MainUI_User_Last_Msg_Type", paramInt);
    localIntent.addFlags(536870912);
    localIntent.addFlags(67108864);
    PendingIntent localPendingIntent = PendingIntent.getActivity(this.context, 35, localIntent, 1073741824);
    Notification localNotification = new Notification(d.lK(), null, System.currentTimeMillis());
    localNotification.flags = (0x10 | localNotification.flags);
    localNotification.setLatestEventInfo(this.context, this.context.getString(n.btW), paramString1, localPendingIntent);
    ((NotificationManager)this.context.getSystemService("notification")).notify(35, localNotification);
  }

  public final void b(com.tencent.mm.storage.ar paramar)
  {
    if (paramar.jK() == 1)
      return;
    this.cMM = paramar;
    this.diu = com.tencent.mm.booter.notification.a.a.c(paramar);
    this.cEh = paramar.kt();
    this.cJr = paramar.getContent();
    this.cNS = paramar.getType();
    this.dis = "";
    this.dit = null;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(paramar.kl());
    arrayOfObject[1] = Long.valueOf(Thread.currentThread().getId());
    arrayOfObject[2] = ch.aHN();
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "dknotify notifyFirst: %d %d [%s]", arrayOfObject);
    this.diA.sendEmptyMessageDelayed(0, 200L);
  }

  public final void bQ(int paramInt)
  {
    Intent localIntent = new Intent(this.context, LauncherUI.class);
    localIntent.addFlags(536870912);
    localIntent.addFlags(67108864);
    localIntent.putExtra("nofification_type", "update_nofification");
    localIntent.putExtra("show_update_dialog", true);
    localIntent.putExtra("update_type", paramInt);
    PendingIntent localPendingIntent = PendingIntent.getActivity(this.context, 0, localIntent, 0);
    Notification localNotification = new Notification(d.lK(), null, System.currentTimeMillis());
    localNotification.flags = (0x10 | localNotification.flags);
    localNotification.setLatestEventInfo(this.context, this.context.getString(n.but), this.context.getString(n.btX), localPendingIntent);
    ((NotificationManager)this.context.getSystemService("notification")).notify(34, localNotification);
  }

  public final void bY(String paramString)
  {
    this.diq = paramString;
  }

  public final void c(List paramList)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Integer.valueOf(paramList.size());
    arrayOfObject1[1] = Long.valueOf(Thread.currentThread().getId());
    arrayOfObject1[2] = Integer.valueOf(this.diu);
    arrayOfObject1[3] = ch.aHN();
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "dknotify notifyOther msgsize:%d %d %d [%s]", arrayOfObject1);
    if ((paramList == null) || (paramList.size() <= 0));
    com.tencent.mm.storage.ar localar;
    do
    {
      return;
      Iterator localIterator = paramList.iterator();
      int i = 0;
      while (localIterator.hasNext())
        i |= com.tencent.mm.booter.notification.a.a.c((com.tencent.mm.storage.ar)localIterator.next());
      this.diu = i;
      localar = (com.tencent.mm.storage.ar)paramList.get(-1 + paramList.size());
    }
    while (localar == null);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(localar.kl());
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "dknotify notifyOther: %d", arrayOfObject2);
    this.dis = "";
    this.cEh = localar.kt();
    this.cJr = localar.getContent();
    this.cNS = localar.getType();
    this.diA.sendEmptyMessageDelayed(0, 200L);
  }

  public final void cb(String paramString)
  {
    int i = 1;
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "cancel notification talker:" + paramString + " last talker:" + this.dir + "  curChattingTalker:" + this.diq + " talker count:" + this.div);
    if (!this.diw);
    do
    {
      return;
      if ((this.dir != null) && (this.dir.equals(this.diq)) && (this.div == i));
      while (i != 0)
      {
        cancel();
        return;
        i = 0;
      }
      r localr = bg.qW().oW().yE(paramString);
      if ((localr != null) && (localr.jI() != 0))
      {
        cancel();
        return;
      }
    }
    while (com.tencent.mm.model.z.dY(y.dkj) != 0);
    cancel();
  }

  public final void cc(String paramString)
  {
    Notification localNotification = new Notification();
    localNotification.icon = d.lK();
    Intent localIntent = new Intent(this.context, LauncherUI.class);
    localIntent.putExtra("Intro_Notify", true);
    localIntent.putExtra("Intro_Notify_User", this.cEh);
    localIntent.addFlags(536870912);
    localIntent.addFlags(67108864);
    localNotification.setLatestEventInfo(this.context, paramString, null, PendingIntent.getActivity(this.context, 0, localIntent, 268435456));
    NotificationManager localNotificationManager = (NotificationManager)this.context.getSystemService("notification");
    localNotification.flags = 16;
    if (localNotificationManager != null)
    {
      localNotificationManager.notify(0, localNotification);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "get NotificationManager failed");
  }

  public final void e(String paramString, int paramInt)
  {
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      com.tencent.mm.sdk.platformtools.z.w("showSendMsgFailNotification fromUserName:%s msgType:%d", paramString, arrayOfObject);
      ComponentName localComponentName = ((ActivityManager.RunningTaskInfo)((ActivityManager)this.context.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
      if (!ChattingUI.class.getName().equals(localComponentName.getClassName()))
      {
        Intent localIntent = new Intent(this.context, ChattingUI.class);
        localIntent.putExtra("nofification_type", "pushcontent_notification");
        localIntent.putExtra("Intro_Is_Muti_Talker", true);
        localIntent.putExtra("Chat_User", paramString);
        localIntent.putExtra("MainUI_User_Last_Msg_Type", paramInt);
        localIntent.addFlags(536870912);
        localIntent.addFlags(67108864);
        PendingIntent localPendingIntent = PendingIntent.getActivity(this.context, 35, localIntent, 1073741824);
        Notification localNotification = new Notification(d.lK(), null, System.currentTimeMillis());
        localNotification.defaults = (0x1 | localNotification.defaults);
        localNotification.flags = (0x10 | localNotification.flags);
        localNotification.setLatestEventInfo(this.context, this.context.getString(n.btW), this.context.getString(n.bSC), localPendingIntent);
        ((NotificationManager)this.context.getSystemService("notification")).notify(35, localNotification);
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final Looper getLooper()
  {
    return Looper.getMainLooper();
  }

  public final void hY()
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "force cancelNotification");
    cancel();
    NotificationManager localNotificationManager = (NotificationManager)this.context.getSystemService("notification");
    if (localNotificationManager != null)
      localNotificationManager.cancel(35);
  }

  public final String lp()
  {
    return this.diq;
  }

  @TargetApi(16)
  public final boolean lq()
  {
    ComponentName localComponentName = ((ActivityManager.RunningTaskInfo)((ActivityManager)this.context.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localComponentName.getClassName();
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "[oneliang][showMobileRegNoVerifyCodeNotification]:%s", arrayOfObject);
    boolean bool1 = MobileVerifyUI.class.getName().equals(localComponentName.getClassName());
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    PendingIntent localPendingIntent;
    Notification localNotification1;
    if (bool2)
    {
      Intent localIntent = new Intent(this.context, MobileVerifyUI.class);
      localIntent.addFlags(2);
      localIntent.addFlags(536870912);
      localIntent.addFlags(67108864);
      localIntent.putExtra("nofification_type", "no_reg_notification");
      localPendingIntent = PendingIntent.getActivity(this.context, 36, localIntent, 1073741824);
      if (Build.VERSION.SDK_INT < 16)
        break label291;
      Notification.Builder localBuilder = new Notification.Builder(this.context);
      localBuilder.setContentTitle(this.context.getString(n.btW));
      localBuilder.setSmallIcon(d.lK());
      localBuilder.setWhen(System.currentTimeMillis());
      localBuilder.setContentIntent(localPendingIntent);
      localNotification1 = new Notification.BigTextStyle(localBuilder).bigText(this.context.getString(n.bSB)).build();
      localNotification1.defaults = (0x1 | localNotification1.defaults);
      localNotification1.flags = (0x10 | localNotification1.flags);
    }
    label291: Notification localNotification2;
    for (Object localObject = localNotification1; ; localObject = localNotification2)
    {
      ((NotificationManager)this.context.getSystemService("notification")).notify(36, (Notification)localObject);
      return bool2;
      localNotification2 = new Notification(d.lK(), null, System.currentTimeMillis());
      localNotification2.defaults = (0x1 | localNotification2.defaults);
      localNotification2.flags = (0x10 | localNotification2.flags);
      localNotification2.setLatestEventInfo(this.context, this.context.getString(n.btW), this.context.getString(n.bSB), localPendingIntent);
    }
  }

  public final void lr()
  {
    ((NotificationManager)this.context.getSystemService("notification")).cancel(36);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.u
 * JD-Core Version:    0.6.2
 */